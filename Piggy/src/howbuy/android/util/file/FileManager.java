package howbuy.android.util.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import android.os.Environment;

/**
 * User: qii Date: 12-8-3
 */
public class FileManager {

	private static final String AVATAR_SMAll = "avatar_small";
	private static final String AVATAR_LARGE = "avatar_large";
	private static final String PICTURE_THUMBNAIL = "picture_thumbnail";
	private static final String PICTURE_BMIDDLE = "picture_bmiddle";
	private static final String PICTURE_LARGE = "picture_large";
	private static final String EMOTION = "emotion";
	private static final String TXT2PIC = "txt2pic";

	public static byte[] InputStreamToByte(InputStream is)  {
		ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
		int ch;
		try {
			while ((ch = is.read()) != -1) {
				bytestream.write(ch);
			}
			byte imgdata[] = bytestream.toByteArray();
			bytestream.close();
			return imgdata;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 保存一个字节数组为文件
	 * 
	 * @param filePath
	 * @param bytesx
	 * @return
	 */
	public static File saveFile(String filePath, byte[] bytesx) {
		File mFile = new File(filePath);
		try {
			FileOutputStream fStream = new FileOutputStream(mFile);
			fStream.write(bytesx);
			fStream.flush();
			fStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mFile;
	}

	/**
	 * 保存一个inputStream
	 * 
	 * @param filePath
	 * @param inputStream
	 * @return
	 */
	public static File saveFile(String filePath, InputStream inStream) {
		FileOutputStream fs;
		try {
			fs = new FileOutputStream(filePath);
			byte[] buffer = new byte[1024];
			int byteread = -1;
			while ((byteread = inStream.read(buffer)) != -1) {
				fs.write(buffer, 0, byteread);
			}
			fs.flush();
			fs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new File(filePath);
	}

	/**
	 * 读取一个文件
	 * 
	 * @param filePath
	 * @return
	 */
	public static InputStream readerFile(String filePath) {
		File mFile = new File(filePath);
		FileInputStream fInputStream = null;
		try {
			fInputStream = new FileInputStream(mFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fInputStream;
	}

	private static String getSdCardPath() {
		if (isExternalStorageMounted()) {
			return howbuy.android.piggy.application.ApplicationParams.getInstance().getExternalCacheDir().getAbsolutePath();
		} else {
			return "";
		}
	}

	public File getAlbumStorageDir(String albumName) {

		File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), albumName);
		if (!file.mkdirs()) {
		}
		return file;
	}

	public static boolean isExternalStorageMounted() {
		boolean canRead = Environment.getExternalStorageDirectory().canRead();
		boolean onlyRead = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED_READ_ONLY);
		boolean unMounted = Environment.getExternalStorageState().equals(Environment.MEDIA_UNMOUNTED);
		return !(!canRead || onlyRead || unMounted);
	}

	public static String getFilePathFromUrl(String url, FileLocationMethod method) {

		if (!isExternalStorageMounted())
			return "";

		int index = url.indexOf("//");

		String s = url.substring(index + 2);

		String oldRelativePath = s.substring(s.indexOf("/"));

		String newRelativePath = "";
		switch (method) {
		case avatar_small:
			newRelativePath = File.separator + AVATAR_SMAll + oldRelativePath;
			break;
		case avatar_large:
			newRelativePath = File.separator + AVATAR_LARGE + oldRelativePath;
			break;
		case picture_thumbnail:
			newRelativePath = File.separator + PICTURE_THUMBNAIL + oldRelativePath;
			break;
		case picture_bmiddle:
			newRelativePath = File.separator + PICTURE_BMIDDLE + oldRelativePath;
			break;
		case picture_large:
			newRelativePath = File.separator + PICTURE_LARGE + oldRelativePath;
			break;
		case emotion:
			String name = new File(oldRelativePath).getName();
			newRelativePath = File.separator + EMOTION + File.separator + name;
			break;
		}

		return getSdCardPath() + File.separator + newRelativePath;

	}

	public static String getTxt2picPath() {
		if (!isExternalStorageMounted())
			return "";

		String path = getSdCardPath() + File.separator + TXT2PIC;
		File file = new File(path);
		if (file.exists())
			file.mkdirs();
		return path;
	}

	public static File createNewFileInSDCard(String absolutePath) {
		if (!isExternalStorageMounted()) {
			return null;
		}

		File file = new File(absolutePath);
		if (file.exists()) {
			return file;
		} else {
			File dir = file.getParentFile();
			if (!dir.exists()) {
				dir.mkdirs();
			}

			try {
				if (file.createNewFile()) {
					return file;
				}
			} catch (IOException e) {
				return null;

			}

		}
		return null;

	}

	public static String getCacheSize() {
		if (isExternalStorageMounted()) {
			String path = getSdCardPath() + File.separator;
			FileSize size = new FileSize(new File(path));
			return size.toString();
		}
		return "0MB";
	}

	public static List<String> getCachePath() {
		List<String> path = new ArrayList<String>();
		if (isExternalStorageMounted()) {
			String thumbnailPath = getSdCardPath() + File.separator + PICTURE_THUMBNAIL;
			String middlePath = getSdCardPath() + File.separator + PICTURE_BMIDDLE;
			String oriPath = getSdCardPath() + File.separator + PICTURE_LARGE;

			path.add(thumbnailPath);
			path.add(middlePath);
			path.add(oriPath);
		}
		return path;
	}

	public static String getPictureCacheSize() {
		long size = 0L;
		if (isExternalStorageMounted()) {
			String thumbnailPath = getSdCardPath() + File.separator + PICTURE_THUMBNAIL;
			String middlePath = getSdCardPath() + File.separator + PICTURE_BMIDDLE;
			String oriPath = getSdCardPath() + File.separator + PICTURE_LARGE;
			size += new FileSize(new File(thumbnailPath)).getLongSize();
			size += new FileSize(new File(middlePath)).getLongSize();
			size += new FileSize(new File(oriPath)).getLongSize();

		}
		return FileSize.convertSizeToString(size);
	}

	public static boolean deleteCache() {
		String path = getSdCardPath() + File.separator;
		return deleteDirectory(new File(path));
	}

	public static boolean deletePictureCache() {
		String thumbnailPath = getSdCardPath() + File.separator + PICTURE_THUMBNAIL;
		String middlePath = getSdCardPath() + File.separator + PICTURE_BMIDDLE;
		String oriPath = getSdCardPath() + File.separator + PICTURE_LARGE;

		deleteDirectory(new File(thumbnailPath));
		deleteDirectory(new File(middlePath));
		deleteDirectory(new File(oriPath));

		return true;
	}

	private static boolean deleteDirectory(File path) {
		if (path.exists()) {
			File[] files = path.listFiles();
			if (files == null) {
				return true;
			}
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					deleteDirectory(files[i]);
				} else {
					files[i].delete();
				}
			}
		}
		return (path.delete());
	}

	public static boolean saveToPicDir(String path) {
		if (!isExternalStorageMounted())
			return false;

		File file = new File(path);
		String name = file.getName();
		String newPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + File.separator + name;
		try {
			FileManager.createNewFileInSDCard(newPath);
			copyFile(file, new File(newPath));
			return true;
		} catch (IOException e) {
			return false;
		}

	}

	private static void copyFile(File sourceFile, File targetFile) throws IOException {
		BufferedInputStream inBuff = null;
		BufferedOutputStream outBuff = null;
		try {
			inBuff = new BufferedInputStream(new FileInputStream(sourceFile));

			outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));

			byte[] b = new byte[1024 * 5];
			int len;
			while ((len = inBuff.read(b)) != -1) {
				outBuff.write(b, 0, len);
			}
			outBuff.flush();
		} finally {
			if (inBuff != null)
				inBuff.close();
			if (outBuff != null)
				outBuff.close();
		}
	}

	/**
	 * 清除数据缓存
	 */
	public static void clearInsCache() {
		File cacheFilePath = howbuy.android.piggy.application.ApplicationParams.getInstance().getCacheDir();
		File cacheFiles[] = cacheFilePath.listFiles();
		if (cacheFiles.length != 0) {
			for (int i = 0; i < cacheFiles.length; i++) {
				File file = cacheFiles[i];
				if (file.isFile()) {
					file.delete();
				}
			}
		}

	}

}
