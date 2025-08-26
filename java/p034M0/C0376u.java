package p034M0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: M0.u */
/* loaded from: classes.dex */
public final class C0376u {

    /* renamed from: a */
    public float f1009a;

    /* renamed from: b */
    public float f1010b;

    /* renamed from: c */
    public float f1011c;

    /* renamed from: d */
    public float f1012d;

    /* renamed from: e */
    public float f1013e;

    /* renamed from: f */
    public final ArrayList f1014f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f1015g = new ArrayList();

    public C0376u() {
        m1046d(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m1043a(float f) {
        float f2 = this.f1012d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f1010b;
        float f5 = this.f1011c;
        C0372q c0372q = new C0372q(f4, f5, f4, f5);
        c0372q.f1002f = this.f1012d;
        c0372q.f1003g = f3;
        this.f1015g.add(new C0370o(c0372q));
        this.f1012d = f;
    }

    /* renamed from: b */
    public final void m1044b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1014f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0374s) arrayList.get(i2)).mo1042a(matrix, path);
        }
    }

    /* renamed from: c */
    public final void m1045c(float f, float f2) {
        C0373r c0373r = new C0373r();
        c0373r.f1004b = f;
        c0373r.f1005c = f2;
        this.f1014f.add(c0373r);
        C0371p c0371p = new C0371p(c0373r, this.f1010b, this.f1011c);
        float m1041b = c0371p.m1041b() + 270.0f;
        float m1041b2 = c0371p.m1041b() + 270.0f;
        m1043a(m1041b);
        this.f1015g.add(c0371p);
        this.f1012d = m1041b2;
        this.f1010b = f;
        this.f1011c = f2;
    }

    /* renamed from: d */
    public final void m1046d(float f, float f2, float f3) {
        this.f1009a = f;
        this.f1010b = 0.0f;
        this.f1011c = f;
        this.f1012d = f2;
        this.f1013e = (f2 + f3) % 360.0f;
        this.f1014f.clear();
        this.f1015g.clear();
    }
}
