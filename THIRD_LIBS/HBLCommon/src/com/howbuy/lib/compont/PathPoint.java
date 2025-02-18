/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.howbuy.lib.compont;

/**
 * A class that holds information about a location and how the path should get to that
 * location from the previous path location (if any). Any PathPoint holds the information for
 * its location as well as the instructions on how to traverse the preceding interval from the
 * previous location.
 */
public class PathPoint {

    /**
     * The possible path operations that describe how to move from a preceding PathPoint to the
     * location described by this PathPoint.
     */
    public static final int MOVE = 0;
    public static final int LINE = 1;
    public static final int CURVE2= 2;
    public static final int CURVE3 = 3;
    
    /**
     * The location of this PathPoint
     */
   public float mX, mY;
    
    /**
     * The first control point, if any, for a PathPoint of type CURVE
     */
   public float mControl0X, mControl0Y;

    /**
     * The second control point, if any, for a PathPoint of type CURVE
     */
   public float mControl1X, mControl1Y;

    /**
     * The motion described by the path to get from the previous PathPoint in an AnimatorPath
     * to the location of this PathPoint. This can be one of MOVE, LINE, or CURVE.
     */
    int mOperation;

    int mTimeFrame=-1;

    /**
     * Line/Move constructor
     */
    private PathPoint(int operation, float x, float y) {
        mOperation = operation;
        mX = x;
        mY = y;
    }
    /**
     * Curve constructor
     */
    private PathPoint(float cX, float cY,float x, float y) {
        mControl0X = cX;
        mControl0Y = cY;
        mControl1X = cX;
        mControl1Y = cY;
        mX = x;
        mY = y;
        mOperation = CURVE2;
    }
    /**
     * Curve constructor
     */
    private PathPoint(float c0X, float c0Y, float c1X, float c1Y, float x, float y) {
        mControl0X = c0X;
        mControl0Y = c0Y;
        mControl1X = c1X;
        mControl1Y = c1Y;
        mX = x;
        mY = y;
        mOperation = CURVE3;
    }

    /**
     * Constructs and returns a PathPoint object that describes a line to the given xy location.
     */
    public static PathPoint lineTo(float x, float y) {
        return new PathPoint(LINE, x, y);
    }

    /**
     * Constructs and returns a PathPoint object that describes a cubic B�zier curve to the
     * given xy location with the control points at c0 and c1.
     */
    public static PathPoint cubicTo(float c0X, float c0Y, float c1X, float c1Y, float x, float y) {
        return new PathPoint(c0X,  c0Y, c1X, c1Y, x, y);
    }
    public static PathPoint quadTo(float cX, float cY,float x, float y) {
        return new PathPoint(cX,  cY, x, y);
    }
    /**
     * Constructs and returns a PathPoint object that describes a discontinuous move to the given
     * xy location.
     */
    public static PathPoint moveTo(float x, float y) {
        return new PathPoint(MOVE, x, y);
    }
	@Override
	public String toString() {
		return "PathPoint [mX=" + mX + ", mY=" + mY + ", mControl0X="
				+ mControl0X + ", mControl0Y=" + mControl0Y + ", mControl1X="
				+ mControl1X + ", mControl1Y=" + mControl1Y + ", mOperation="
				+ mOperation + ", mTimeFrame=" + mTimeFrame + "]";
	}
    
}
