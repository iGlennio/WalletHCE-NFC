package p027K;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: K.F */
/* loaded from: classes.dex */
public abstract class AbstractC0262F {
    /* renamed from: a */
    public static C0319s0 m766a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0319s0 m936g = C0319s0.m936g(null, rootWindowInsets);
        C0315q0 c0315q0 = m936g.f855a;
        c0315q0.mo905p(m936g);
        c0315q0.mo899d(view.getRootView());
        return m936g;
    }

    /* renamed from: b */
    public static int m767b(View view) {
        return view.getScrollIndicators();
    }

    /* renamed from: c */
    public static void m768c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    /* renamed from: d */
    public static void m769d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
