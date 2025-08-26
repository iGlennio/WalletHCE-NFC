package p033M;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: M.a */
/* loaded from: classes.dex */
public abstract class AbstractC0355a {
    /* renamed from: a */
    public static Interpolator m1001a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    /* renamed from: b */
    public static Interpolator m1002b(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    /* renamed from: c */
    public static Interpolator m1003c(Path path) {
        return new PathInterpolator(path);
    }
}
