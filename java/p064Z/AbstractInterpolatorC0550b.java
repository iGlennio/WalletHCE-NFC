package p064Z;

import android.view.animation.Interpolator;

/* renamed from: Z.b */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0550b implements Interpolator {

    /* renamed from: a */
    public final float[] f1516a;

    /* renamed from: b */
    public final float f1517b;

    public AbstractInterpolatorC0550b(float[] fArr) {
        this.f1516a = fArr;
        this.f1517b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1516a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f1517b;
        float f3 = (f - (min * f2)) / f2;
        float f4 = fArr[min];
        return ((fArr[min + 1] - f4) * f3) + f4;
    }
}
