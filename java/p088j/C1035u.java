package p088j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: j.u */
/* loaded from: classes.dex */
public final class C1035u {

    /* renamed from: b */
    public static final PorterDuff.Mode f4069b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C1035u f4070c;

    /* renamed from: a */
    public C0958R0 f4071a;

    /* renamed from: a */
    public static synchronized C1035u m2527a() {
        C1035u c1035u;
        synchronized (C1035u.class) {
            try {
                if (f4070c == null) {
                    m2529d();
                }
                c1035u = f4070c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1035u;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m2528c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter m2426e;
        synchronized (C1035u.class) {
            m2426e = C0958R0.m2426e(i2, mode);
        }
        return m2426e;
    }

    /* renamed from: d */
    public static synchronized void m2529d() {
        synchronized (C1035u.class) {
            if (f4070c == null) {
                C1035u c1035u = new C1035u();
                f4070c = c1035u;
                c1035u.f4071a = C0958R0.m2425b();
                C0958R0 c0958r0 = f4070c.f4071a;
                C1032t c1032t = new C1032t();
                synchronized (c0958r0) {
                    c0958r0.f3851e = c1032t;
                }
            }
        }
    }

    /* renamed from: e */
    public static void m2530e(Drawable drawable, C1004j1 c1004j1, int[] iArr) {
        PorterDuff.Mode mode = C0958R0.f3844f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC1027r0.f4033a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c1004j1.f3958b;
        if (!z2 && !c1004j1.f3957a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) c1004j1.f3959c : null;
        PorterDuff.Mode mode2 = c1004j1.f3957a ? (PorterDuff.Mode) c1004j1.f3960d : C0958R0.f3844f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = C0958R0.m2426e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    /* renamed from: b */
    public final synchronized Drawable m2531b(Context context, int i2) {
        return this.f4071a.m2428c(context, i2);
    }
}
