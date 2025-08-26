package p089j0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: j0.w */
/* loaded from: classes.dex */
public abstract class AbstractC1081w {

    /* renamed from: a */
    public static final C1054B f4222a;

    /* renamed from: b */
    public static final C1060b f4223b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4222a = new C1055C();
        } else {
            f4222a = new C1054B();
        }
        f4223b = new C1060b(Float.class, "translationAlpha", 5);
        new C1060b(Rect.class, "clipBounds", 6);
    }

    /* renamed from: a */
    public static void m2605a(View view, int i2, int i3, int i4, int i5) {
        f4222a.mo2548o0(view, i2, i3, i4, i5);
    }

    /* renamed from: b */
    public static void m2606b(View view, int i2) {
        f4222a.mo370g0(view, i2);
    }
}
