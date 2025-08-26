package p034M0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p031L0.C0353a;

/* renamed from: M0.o */
/* loaded from: classes.dex */
public final class C0370o extends AbstractC0375t {

    /* renamed from: c */
    public final C0372q f993c;

    public C0370o(C0372q c0372q) {
        this.f993c = c0372q;
    }

    @Override // p034M0.AbstractC0375t
    /* renamed from: a */
    public final void mo1040a(Matrix matrix, C0353a c0353a, int i2, Canvas canvas) {
        C0372q c0372q = this.f993c;
        float f = c0372q.f1002f;
        float f2 = c0372q.f1003g;
        RectF rectF = new RectF(c0372q.f998b, c0372q.f999c, c0372q.f1000d, c0372q.f1001e);
        c0353a.getClass();
        boolean z2 = f2 < 0.0f;
        Path path = c0353a.f906g;
        int[] iArr = C0353a.f898k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = c0353a.f905f;
            iArr[2] = c0353a.f904e;
            iArr[3] = c0353a.f903d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i2;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c0353a.f903d;
            iArr[2] = c0353a.f904e;
            iArr[3] = c0353a.f905f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i2 / width);
        float[] fArr = C0353a.f899l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c0353a.f901b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c0353a.f907h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
