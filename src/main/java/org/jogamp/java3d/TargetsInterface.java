/*
 * Copyright 2001-2008 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 *
 */

package org.jogamp.java3d;
import java.util.ArrayList;


interface TargetsInterface {

    static final int TRANSFORM_TARGETS =	0;
    static final int SWITCH_TARGETS =		1;

    // used by Switch, TransformGroup and SharedGroup
    abstract CachedTargets getCachedTargets(int type, int index, int child);
    abstract void resetCachedTargets(int type, CachedTargets[] newCt, int child);
    // used by TransformGroup and SharedGroup
    abstract int getTargetThreads(int type);
    abstract void updateCachedTargets(int type, CachedTargets[] newCt);
    abstract void computeTargetThreads(int type, CachedTargets[] newCt);
    abstract void updateTargetThreads(int type, CachedTargets[] newCt);
    abstract void propagateTargetThreads(int type, int childTargetThreads);
    abstract void copyCachedTargets(int type, CachedTargets[] newCt);

// used by Switch and SharedGroup
abstract ArrayList<SwitchState> getTargetsData(int type, int index);
}
