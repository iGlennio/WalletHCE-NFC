package p034M0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: M0.q */
/* loaded from: classes.dex */
public final class C0372q extends AbstractC0374s {

    /* renamed from: h */
    public static final RectF f997h = new RectF();

    /* renamed from: b */
    public final float f998b;

    /* renamed from: c */
    public final float f999c;

    /* renamed from: d */
    public final float f1000d;

    /* renamed from: e */
    public final float f1001e;

    /* renamed from: f */
    public float f1002f;

    /* renamed from: g */
    public float f1003g;

    public C0372q(float f, float f2, float f3, float f4) {
        this.f998b = f;
        this.f999c = f2;
        this.f1000d = f3;
        this.f1001e = f4;
    }

    @Override // p034M0.AbstractC0374s
    /* renamed from: a */
    public final void mo1042a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1006a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f997h;
        rectF.set(this.f998b, this.f999c, this.f1000d, this.f1001e);
        path.arcTo(rectF, this.f1002f, this.f1003g, false);
        path.transform(matrix);
    }
}
