package p034M0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p031L0.C0353a;

/* renamed from: M0.p */
/* loaded from: classes.dex */
public final class C0371p extends AbstractC0375t {

    /* renamed from: c */
    public final C0373r f994c;

    /* renamed from: d */
    public final float f995d;

    /* renamed from: e */
    public final float f996e;

    public C0371p(C0373r c0373r, float f, float f2) {
        this.f994c = c0373r;
        this.f995d = f;
        this.f996e = f2;
    }

    @Override // p034M0.AbstractC0375t
    /* renamed from: a */
    public final void mo1040a(Matrix matrix, C0353a c0353a, int i2, Canvas canvas) {
        C0373r c0373r = this.f994c;
        float f = c0373r.f1005c;
        float f2 = this.f996e;
        float f3 = c0373r.f1004b;
        float f4 = this.f995d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f1008a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m1041b());
        c0353a.getClass();
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = C0353a.f896i;
        iArr[0] = c0353a.f905f;
        iArr[1] = c0353a.f904e;
        iArr[2] = c0353a.f903d;
        Paint paint = c0353a.f902c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C0353a.f897j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* renamed from: b */
    public final float m1041b() {
        C0373r c0373r = this.f994c;
        return (float) Math.toDegrees(Math.atan((c0373r.f1005c - this.f996e) / (c0373r.f1004b - this.f995d)));
    }
}
