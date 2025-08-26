package p088j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p005C.AbstractC0038a;
import p010D1.AbstractC0096d;
import p073d.AbstractC0734a;

/* renamed from: j.h1 */
/* loaded from: classes.dex */
public abstract class AbstractC0998h1 {

    /* renamed from: a */
    public static final ThreadLocal f3947a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f3948b = {-16842910};

    /* renamed from: c */
    public static final int[] f3949c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f3950d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f3951e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f3952f = new int[0];

    /* renamed from: g */
    public static final int[] f3953g = new int[1];

    /* renamed from: a */
    public static void m2474a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0734a.f2920j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m2475b(Context context, int i2) {
        ColorStateList m2477d = m2477d(context, i2);
        if (m2477d != null && m2477d.isStateful()) {
            return m2477d.getColorForState(f3948b, m2477d.getDefaultColor());
        }
        ThreadLocal threadLocal = f3947a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC0038a.m112d(m2476c(context, i2), Math.round(Color.alpha(r4) * f));
    }

    /* renamed from: c */
    public static int m2476c(Context context, int i2) {
        int[] iArr = f3953g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m2477d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f3953g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0096d.m355v(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
