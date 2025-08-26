package p111r0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p064Z.C0549a;

/* renamed from: r0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1188a {

    /* renamed from: a */
    public static final LinearInterpolator f4552a = new LinearInterpolator();

    /* renamed from: b */
    public static final C0549a f4553b = new C0549a(1);

    /* renamed from: c */
    public static final C0549a f4554c = new C0549a(0);

    /* renamed from: d */
    public static final C0549a f4555d = new C0549a(C0549a.f1515e);

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    public static float m2747a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* renamed from: b */
    public static float m2748b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m2747a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m2749c(int i2, int i3, float f) {
        return Math.round(f * (i3 - i2)) + i2;
    }
}
