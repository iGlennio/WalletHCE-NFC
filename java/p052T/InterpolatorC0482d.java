package p052T;

import android.view.animation.Interpolator;

/* renamed from: T.d */
/* loaded from: classes.dex */
public final class InterpolatorC0482d implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ int f1306a;

    public /* synthetic */ InterpolatorC0482d(int i2) {
        this.f1306a = i2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f1306a) {
            case 0:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            default:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }
}
