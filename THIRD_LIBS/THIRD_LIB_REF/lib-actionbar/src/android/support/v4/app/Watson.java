package android.support.v4.app;

import java.util.ArrayList;

import android.util.Log;
import android.view.View;
import android.view.Window;

import com.actionbarsherlock.ActionBarSherlock.OnCreatePanelMenuListener;
import com.actionbarsherlock.ActionBarSherlock.OnMenuItemSelectedListener;
import com.actionbarsherlock.ActionBarSherlock.OnPreparePanelListener;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

/** I'm in ur package. Stealing ur variables. */
public abstract class Watson extends FragmentActivity implements OnCreatePanelMenuListener, OnPreparePanelListener, OnMenuItemSelectedListener {
    private static final boolean DEBUG = false;
    private static final String TAG = "Watson";

    /** Fragment interface for menu creation callback. */
    public interface OnCreateOptionsMenuListener {
        public void onCreateOptionsMenu(Menu menu, MenuInflater inflater);
    }
    /** Fragment interface for menu preparation callback. */
    public interface OnPrepareOptionsMenuListener {
        public void onPrepareOptionsMenu(Menu menu);
    }
    /** Fragment interface for menu item selection callback. */
    public interface OnOptionsItemSelectedListener {
        public boolean onOptionsItemSelected(MenuItem item);
    }

    private ArrayList<Fragment> mCreatedMenus;


    ///////////////////////////////////////////////////////////////////////////
    // Sherlock menu handling
    ///////////////////////////////////////////////////////////////////////////

    private boolean recurseOnCreatePanelMenu(ArrayList<Fragment> newMenus, Fragment f, Menu menu, MenuInflater inflater)
    {
        boolean show = false;
        if (f != null && !f.mHidden && f.mHasMenu && f.mMenuVisible && f instanceof OnCreateOptionsMenuListener) {
            show = true;
            ((OnCreateOptionsMenuListener)f).onCreateOptionsMenu(menu, inflater);
            if (newMenus == null) {
                newMenus = new ArrayList<Fragment>();
            }
            newMenus.add(f);
        }
        // Dispatch calls to any child fragments
        if (f != null && f.mChildFragmentManager != null && f.mChildFragmentManager.mAdded != null)
        {
            for (int j = 0; j < f.mChildFragmentManager.mAdded.size(); j++) {
                Fragment f2 = f.mChildFragmentManager.mAdded.get(j);
                show |= recurseOnCreatePanelMenu(newMenus, f2, menu, inflater);
            }
        }

    return show;
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (DEBUG) Log.d(TAG, "[onCreatePanelMenu] featureId: " + featureId + ", menu: " + menu);

        if (featureId == Window.FEATURE_OPTIONS_PANEL) {
            boolean result = onCreateOptionsMenu(menu);
            if (DEBUG) Log.d(TAG, "[onCreatePanelMenu] activity create result: " + result);

            MenuInflater inflater = getSupportMenuInflater();
            boolean show = false;
            ArrayList<Fragment> newMenus = null;
            if (mFragments.mAdded != null) {
                for (int i = 0; i < mFragments.mAdded.size(); i++) {
                    Fragment f = mFragments.mAdded.get(i);
                    show |= recurseOnCreatePanelMenu(newMenus, f, menu, inflater);
                }
            }

            if (mCreatedMenus != null) {
                for (int i = 0; i < mCreatedMenus.size(); i++) {
                    Fragment f = mCreatedMenus.get(i);
                    if (newMenus == null || !newMenus.contains(f)) {
                        f.onDestroyOptionsMenu();
                    }
                }
            }

            mCreatedMenus = newMenus;

            if (DEBUG) Log.d(TAG, "[onCreatePanelMenu] fragments create result: " + show);
            result |= show;

            if (DEBUG) Log.d(TAG, "[onCreatePanelMenu] returning " + result);
            return result;
        }
        return false;
    }

    private boolean recurseOnPreparePanel(Fragment f, Menu menu)
    {
        boolean show = false;
        if (f != null && !f.mHidden && f.mHasMenu && f.mMenuVisible && f instanceof OnPrepareOptionsMenuListener) {
            show = true;
            ((OnPrepareOptionsMenuListener)f).onPrepareOptionsMenu(menu);
        }

        // Dispatch calls to any child fragments
        if (f != null && f.mChildFragmentManager != null && f.mChildFragmentManager.mAdded != null) {
            for (int j = 0; j < f.mChildFragmentManager.mAdded.size(); j++) {
                Fragment f2 = f.mChildFragmentManager.mAdded.get(j);
                show = recurseOnPreparePanel(f2, menu);
            }
        }
        return show;
    }

    @Override
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (DEBUG) Log.d(TAG, "[onPreparePanel] featureId: " + featureId + ", view: " + view + " menu: " + menu);

        if (featureId == Window.FEATURE_OPTIONS_PANEL) {
            boolean result = onPrepareOptionsMenu(menu);
            if (DEBUG) Log.d(TAG, "[onPreparePanel] activity prepare result: " + result);

            boolean show = false;
            if (mFragments.mAdded != null) {
                for (int i = 0; i < mFragments.mAdded.size(); i++) {
                    Fragment f = mFragments.mAdded.get(i);
                    show |= recurseOnPreparePanel(f, menu);
                }
            }

            if (DEBUG) Log.d(TAG, "[onPreparePanel] fragments prepare result: " + show);
            result |= show;

            result &= menu.hasVisibleItems();
            if (DEBUG) Log.d(TAG, "[onPreparePanel] returning " + result);
            return result;
        }
        return false;
    }

    private boolean recurseOnMenuItemSelected(Fragment f, MenuItem item)
    {
        if (f != null && !f.mHidden && f.mHasMenu && f.mMenuVisible && f instanceof OnOptionsItemSelectedListener) {
            if (((OnOptionsItemSelectedListener)f).onOptionsItemSelected(item)) {
                return true;
            }
        }
        // Dispatch calls to any child fragments
        if (f != null && f.mChildFragmentManager != null && f.mChildFragmentManager.mAdded != null) {
            for (int j = 0; j < f.mChildFragmentManager.mAdded.size(); j++) {
                Fragment f2 = f.mChildFragmentManager.mAdded.get(j);
                if (recurseOnMenuItemSelected(f2, item)) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (DEBUG) Log.d(TAG, "[onMenuItemSelected] featureId: " + featureId + ", item: " + item);

        if (featureId == Window.FEATURE_OPTIONS_PANEL) {
            if (onOptionsItemSelected(item)) {
                return true;
            }

            if (mFragments.mAdded != null) {
                for (int i = 0; i < mFragments.mAdded.size(); i++) {
                    Fragment f = mFragments.mAdded.get(i);
                    if (recurseOnMenuItemSelected(f, item)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public abstract boolean onCreateOptionsMenu(Menu menu);

    public abstract boolean onPrepareOptionsMenu(Menu menu);

    public abstract boolean onOptionsItemSelected(MenuItem item);

    public abstract MenuInflater getSupportMenuInflater();
}