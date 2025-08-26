package p034M0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import p005C.C0046i;
import p010D1.AbstractC0104l;

/* renamed from: M0.m */
/* loaded from: classes.dex */
public final class C0368m {

    /* renamed from: a */
    public final C0376u[] f979a = new C0376u[4];

    /* renamed from: b */
    public final Matrix[] f980b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f981c = new Matrix[4];

    /* renamed from: d */
    public final PointF f982d = new PointF();

    /* renamed from: e */
    public final Path f983e = new Path();

    /* renamed from: f */
    public final Path f984f = new Path();

    /* renamed from: g */
    public final C0376u f985g = new C0376u();

    /* renamed from: h */
    public final float[] f986h = new float[2];

    /* renamed from: i */
    public final float[] f987i = new float[2];

    /* renamed from: j */
    public final Path f988j = new Path();

    /* renamed from: k */
    public final Path f989k = new Path();

    /* renamed from: l */
    public final boolean f990l = true;

    public C0368m() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f979a[i2] = new C0376u();
            this.f980b[i2] = new Matrix();
            this.f981c[i2] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* renamed from: a */
    public final void m1038a(C0366k c0366k, float f, RectF rectF, C0046i c0046i, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C0376u[] c0376uArr;
        int i2;
        boolean z2;
        float[] fArr;
        float f2;
        boolean z3;
        int i3;
        C0368m c0368m = this;
        path.rewind();
        Path path2 = c0368m.f983e;
        path2.rewind();
        Path path3 = c0368m.f984f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            matrixArr = c0368m.f981c;
            matrixArr2 = c0368m.f980b;
            c0376uArr = c0368m.f979a;
            i2 = 4;
            z2 = 0;
            fArr = c0368m.f986h;
            if (i4 >= 4) {
                break;
            }
            InterfaceC0358c interfaceC0358c = i4 != 1 ? i4 != 2 ? i4 != 3 ? c0366k.f971f : c0366k.f970e : c0366k.f973h : c0366k.f972g;
            AbstractC0104l abstractC0104l = i4 != 1 ? i4 != 2 ? i4 != 3 ? c0366k.f967b : c0366k.f966a : c0366k.f969d : c0366k.f968c;
            C0376u c0376u = c0376uArr[i4];
            abstractC0104l.getClass();
            abstractC0104l.mo435u(c0376u, f, interfaceC0358c.mo1004a(rectF));
            int i5 = i4 + 1;
            float f3 = (i5 % 4) * 90;
            matrixArr2[i4].reset();
            PointF pointF = c0368m.f982d;
            if (i4 == 1) {
                i3 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i4 == 2) {
                i3 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i4 != 3) {
                i3 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i3 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f3);
            C0376u c0376u2 = c0376uArr[i3];
            fArr[0] = c0376u2.f1010b;
            fArr[1] = c0376u2.f1011c;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f3);
            i4 = i5;
        }
        int i6 = 0;
        while (i6 < i2) {
            C0376u c0376u3 = c0376uArr[i6];
            c0376u3.getClass();
            fArr[z2] = 0.0f;
            fArr[1] = c0376u3.f1009a;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path.moveTo(fArr[z2], fArr[1]);
            } else {
                path.lineTo(fArr[z2], fArr[1]);
            }
            c0376uArr[i6].m1044b(matrixArr2[i6], path);
            if (c0046i != null) {
                C0376u c0376u4 = c0376uArr[i6];
                Matrix matrix = matrixArr2[i6];
                C0362g c0362g = (C0362g) c0046i.f116b;
                BitSet bitSet = c0362g.f934d;
                c0376u4.getClass();
                f2 = 0.0f;
                bitSet.set(i6, z2);
                c0376u4.m1043a(c0376u4.f1013e);
                c0362g.f932b[i6] = new C0369n(new ArrayList(c0376u4.f1015g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            C0376u c0376u5 = c0376uArr[i6];
            fArr[0] = c0376u5.f1010b;
            fArr[1] = c0376u5.f1011c;
            matrixArr2[i6].mapPoints(fArr);
            C0376u c0376u6 = c0376uArr[i8];
            c0376u6.getClass();
            float[] fArr2 = c0368m.f987i;
            fArr2[0] = f2;
            fArr2[1] = c0376u6.f1009a;
            matrixArr2[i8].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            C0376u[] c0376uArr2 = c0376uArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            C0376u c0376u7 = c0376uArr2[i6];
            fArr[0] = c0376u7.f1010b;
            fArr[1] = c0376u7.f1011c;
            matrixArr3[i6].mapPoints(fArr);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C0376u c0376u8 = c0368m.f985g;
            c0376u8.m1046d(0.0f, 270.0f, 0.0f);
            (i6 != 1 ? i6 != 2 ? i6 != 3 ? c0366k.f975j : c0366k.f974i : c0366k.f977l : c0366k.f976k).getClass();
            c0376u8.m1045c(max, 0.0f);
            Path path4 = c0368m.f988j;
            path4.reset();
            c0376u8.m1044b(matrixArr[i6], path4);
            if (c0368m.f990l && (c0368m.m1039b(path4, i6) || c0368m.m1039b(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c0376u8.f1009a;
                matrixArr[i6].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c0376u8.m1044b(matrixArr[i6], path2);
            } else {
                c0376u8.m1044b(matrixArr[i6], path);
            }
            if (c0046i != null) {
                Matrix matrix2 = matrixArr[i6];
                C0362g c0362g2 = (C0362g) c0046i.f116b;
                z3 = false;
                c0362g2.f934d.set(i6 + 4, false);
                c0376u8.m1043a(c0376u8.f1013e);
                c0362g2.f933c[i6] = new C0369n(new ArrayList(c0376u8.f1015g), new Matrix(matrix2));
            } else {
                z3 = false;
            }
            z2 = z3;
            i6 = i7;
            c0376uArr = c0376uArr2;
            matrixArr2 = matrixArr3;
            i2 = 4;
            c0368m = this;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* renamed from: b */
    public final boolean m1039b(Path path, int i2) {
        Path path2 = this.f989k;
        path2.reset();
        this.f979a[i2].m1044b(this.f980b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
