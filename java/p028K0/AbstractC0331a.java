package p028K0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: K0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0331a {

    /* renamed from: a */
    public static final int[] f869a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b */
    public static final String f870b = AbstractC0331a.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m952a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f869a, 0)) != 0) {
            Log.w(f870b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m953b(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z2 = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }
}
