package p116t;

import java.util.Iterator;
import p113s.C1200a;
import p113s.C1203d;

/* renamed from: t.j */
/* loaded from: classes.dex */
public final class C1224j extends AbstractC1229o {
    @Override // p116t.InterfaceC1218d
    /* renamed from: a */
    public final void mo2859a(InterfaceC1218d interfaceC1218d) {
        C1200a c1200a = (C1200a) this.f4813b;
        int i2 = c1200a.f4571s0;
        C1220f c1220f = this.f4819h;
        Iterator it = c1220f.f4798l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((C1220f) it.next()).f4793g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            c1220f.mo2876d(i4 + c1200a.f4573u0);
        } else {
            c1220f.mo2876d(i3 + c1200a.f4573u0);
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: d */
    public final void mo2860d() {
        C1203d c1203d = this.f4813b;
        if (c1203d instanceof C1200a) {
            C1220f c1220f = this.f4819h;
            c1220f.f4788b = true;
            C1200a c1200a = (C1200a) c1203d;
            int i2 = c1200a.f4571s0;
            boolean z2 = c1200a.f4572t0;
            int i3 = 0;
            if (i2 == 0) {
                c1220f.f4791e = 4;
                while (i3 < c1200a.f4752r0) {
                    C1203d c1203d2 = c1200a.f4751q0[i3];
                    if (z2 || c1203d2.f4640g0 != 8) {
                        C1220f c1220f2 = c1203d2.f4633d.f4819h;
                        c1220f2.f4797k.add(c1220f);
                        c1220f.f4798l.add(c1220f2);
                    }
                    i3++;
                }
                m2887m(this.f4813b.f4633d.f4819h);
                m2887m(this.f4813b.f4633d.f4820i);
                return;
            }
            if (i2 == 1) {
                c1220f.f4791e = 5;
                while (i3 < c1200a.f4752r0) {
                    C1203d c1203d3 = c1200a.f4751q0[i3];
                    if (z2 || c1203d3.f4640g0 != 8) {
                        C1220f c1220f3 = c1203d3.f4633d.f4820i;
                        c1220f3.f4797k.add(c1220f);
                        c1220f.f4798l.add(c1220f3);
                    }
                    i3++;
                }
                m2887m(this.f4813b.f4633d.f4819h);
                m2887m(this.f4813b.f4633d.f4820i);
                return;
            }
            if (i2 == 2) {
                c1220f.f4791e = 6;
                while (i3 < c1200a.f4752r0) {
                    C1203d c1203d4 = c1200a.f4751q0[i3];
                    if (z2 || c1203d4.f4640g0 != 8) {
                        C1220f c1220f4 = c1203d4.f4635e.f4819h;
                        c1220f4.f4797k.add(c1220f);
                        c1220f.f4798l.add(c1220f4);
                    }
                    i3++;
                }
                m2887m(this.f4813b.f4635e.f4819h);
                m2887m(this.f4813b.f4635e.f4820i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            c1220f.f4791e = 7;
            while (i3 < c1200a.f4752r0) {
                C1203d c1203d5 = c1200a.f4751q0[i3];
                if (z2 || c1203d5.f4640g0 != 8) {
                    C1220f c1220f5 = c1203d5.f4635e.f4820i;
                    c1220f5.f4797k.add(c1220f);
                    c1220f.f4798l.add(c1220f5);
                }
                i3++;
            }
            m2887m(this.f4813b.f4635e.f4819h);
            m2887m(this.f4813b.f4635e.f4820i);
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: e */
    public final void mo2861e() {
        C1203d c1203d = this.f4813b;
        if (c1203d instanceof C1200a) {
            int i2 = ((C1200a) c1203d).f4571s0;
            C1220f c1220f = this.f4819h;
            if (i2 == 0 || i2 == 1) {
                c1203d.f4625Y = c1220f.f4793g;
            } else {
                c1203d.f4626Z = c1220f.f4793g;
            }
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: f */
    public final void mo2862f() {
        this.f4814c = null;
        this.f4819h.m2875c();
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: k */
    public final boolean mo2864k() {
        return false;
    }

    /* renamed from: m */
    public final void m2887m(C1220f c1220f) {
        C1220f c1220f2 = this.f4819h;
        c1220f2.f4797k.add(c1220f);
        c1220f.f4798l.add(c1220f2);
    }
}
