package p034M0;

import p010D1.AbstractC0104l;

/* renamed from: M0.i */
/* loaded from: classes.dex */
public final class C0364i extends AbstractC0104l {
    @Override // p010D1.AbstractC0104l
    /* renamed from: u */
    public final void mo435u(C0376u c0376u, float f, float f2) {
        c0376u.m1046d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C0372q c0372q = new C0372q(0.0f, 0.0f, f3, f3);
        c0372q.f1002f = 180.0f;
        c0372q.f1003g = 90.0f;
        c0376u.f1014f.add(c0372q);
        C0370o c0370o = new C0370o(c0372q);
        c0376u.m1043a(180.0f);
        c0376u.f1015g.add(c0370o);
        c0376u.f1012d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        c0376u.f1010b = (((float) Math.cos(Math.toRadians(d2))) * f5) + f4;
        c0376u.f1011c = (f5 * ((float) Math.sin(Math.toRadians(d2)))) + f4;
    }
}
