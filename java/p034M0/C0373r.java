package p034M0;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: M0.r */
/* loaded from: classes.dex */
public final class C0373r extends AbstractC0374s {

    /* renamed from: b */
    public float f1004b;

    /* renamed from: c */
    public float f1005c;

    @Override // p034M0.AbstractC0374s
    /* renamed from: a */
    public final void mo1042a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1006a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1004b, this.f1005c);
        path.transform(matrix);
    }
}
