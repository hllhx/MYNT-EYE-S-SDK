// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from mynteye_types.djinni

package com.slightech.mynteye;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/** Option info */
public final class OptionInfo {


    /*package*/ final int mMin;

    /*package*/ final int mMax;

    /*package*/ final int mDef;

    public OptionInfo(
            int min,
            int max,
            int def) {
        this.mMin = min;
        this.mMax = max;
        this.mDef = def;
    }

    /** Minimum value */
    public int getMin() {
        return mMin;
    }

    /** Maximum value */
    public int getMax() {
        return mMax;
    }

    /** Default value */
    public int getDef() {
        return mDef;
    }

    @Override
    public String toString() {
        return "OptionInfo{" +
                "mMin=" + mMin +
                "," + "mMax=" + mMax +
                "," + "mDef=" + mDef +
        "}";
    }

}
