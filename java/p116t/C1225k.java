package p116t;

import p113s.AbstractC1208i;
import p113s.C1202c;
import p113s.C1203d;

/* renamed from: t.k */
/* loaded from: classes.dex */
public final class C1225k extends AbstractC1229o {

    /* renamed from: k */
    public static final int[] f4801k = new int[2];

    /* renamed from: m */
    public static void m2888m(int[] iArr, int i2, int i3, int i4, int i5, float f, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f) + 0.5f);
        int i10 = (int) ((i7 / f) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r7 != 1) goto L125;
     */
    @Override // p116t.InterfaceC1218d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2859a(p116t.InterfaceC1218d r24) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p116t.C1225k.mo2859a(t.d):void");
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: d */
    public final void mo2860d() {
        C1203d c1203d;
        C1203d c1203d2;
        int i2;
        C1203d c1203d3;
        C1203d c1203d4;
        int i3;
        C1203d c1203d5 = this.f4813b;
        boolean z2 = c1203d5.f4627a;
        C1221g c1221g = this.f4816e;
        if (z2) {
            c1221g.mo2876d(c1203d5.m2822q());
        }
        boolean z3 = c1221g.f4796j;
        C1220f c1220f = this.f4820i;
        C1220f c1220f2 = this.f4819h;
        if (!z3) {
            C1203d c1203d6 = this.f4813b;
            int i4 = c1203d6.f4658p0[0];
            this.f4815d = i4;
            if (i4 != 3) {
                if (i4 == 4 && (c1203d4 = c1203d6.f4620T) != null && ((i3 = c1203d4.f4658p0[0]) == 1 || i3 == 4)) {
                    int m2822q = (c1203d4.m2822q() - this.f4813b.f4609I.m2785e()) - this.f4813b.f4611K.m2785e();
                    AbstractC1229o.m2896b(c1220f2, c1203d4.f4633d.f4819h, this.f4813b.f4609I.m2785e());
                    AbstractC1229o.m2896b(c1220f, c1203d4.f4633d.f4820i, -this.f4813b.f4611K.m2785e());
                    c1221g.mo2876d(m2822q);
                    return;
                }
                if (i4 == 1) {
                    c1221g.mo2876d(c1203d6.m2822q());
                }
            }
        } else if (this.f4815d == 4 && (c1203d2 = (c1203d = this.f4813b).f4620T) != null && ((i2 = c1203d2.f4658p0[0]) == 1 || i2 == 4)) {
            AbstractC1229o.m2896b(c1220f2, c1203d2.f4633d.f4819h, c1203d.f4609I.m2785e());
            AbstractC1229o.m2896b(c1220f, c1203d2.f4633d.f4820i, -this.f4813b.f4611K.m2785e());
            return;
        }
        if (c1221g.f4796j) {
            C1203d c1203d7 = this.f4813b;
            if (c1203d7.f4627a) {
                C1202c[] c1202cArr = c1203d7.f4617Q;
                C1202c c1202c = c1202cArr[0];
                C1202c c1202c2 = c1202c.f4597f;
                if (c1202c2 != null && c1202cArr[1].f4597f != null) {
                    if (c1203d7.m2829x()) {
                        c1220f2.f4792f = this.f4813b.f4617Q[0].m2785e();
                        c1220f.f4792f = -this.f4813b.f4617Q[1].m2785e();
                        return;
                    }
                    C1220f m2897h = AbstractC1229o.m2897h(this.f4813b.f4617Q[0]);
                    if (m2897h != null) {
                        AbstractC1229o.m2896b(c1220f2, m2897h, this.f4813b.f4617Q[0].m2785e());
                    }
                    C1220f m2897h2 = AbstractC1229o.m2897h(this.f4813b.f4617Q[1]);
                    if (m2897h2 != null) {
                        AbstractC1229o.m2896b(c1220f, m2897h2, -this.f4813b.f4617Q[1].m2785e());
                    }
                    c1220f2.f4788b = true;
                    c1220f.f4788b = true;
                    return;
                }
                if (c1202c2 != null) {
                    C1220f m2897h3 = AbstractC1229o.m2897h(c1202c);
                    if (m2897h3 != null) {
                        AbstractC1229o.m2896b(c1220f2, m2897h3, this.f4813b.f4617Q[0].m2785e());
                        AbstractC1229o.m2896b(c1220f, c1220f2, c1221g.f4793g);
                        return;
                    }
                    return;
                }
                C1202c c1202c3 = c1202cArr[1];
                if (c1202c3.f4597f != null) {
                    C1220f m2897h4 = AbstractC1229o.m2897h(c1202c3);
                    if (m2897h4 != null) {
                        AbstractC1229o.m2896b(c1220f, m2897h4, -this.f4813b.f4617Q[1].m2785e());
                        AbstractC1229o.m2896b(c1220f2, c1220f, -c1221g.f4793g);
                        return;
                    }
                    return;
                }
                if ((c1203d7 instanceof AbstractC1208i) || c1203d7.f4620T == null || c1203d7.mo2816i(7).f4597f != null) {
                    return;
                }
                C1203d c1203d8 = this.f4813b;
                AbstractC1229o.m2896b(c1220f2, c1203d8.f4620T.f4633d.f4819h, c1203d8.m2823r());
                AbstractC1229o.m2896b(c1220f, c1220f2, c1221g.f4793g);
                return;
            }
        }
        if (this.f4815d == 3) {
            C1203d c1203d9 = this.f4813b;
            int i5 = c1203d9.f4660r;
            if (i5 == 2) {
                C1203d c1203d10 = c1203d9.f4620T;
                if (c1203d10 != null) {
                    C1221g c1221g2 = c1203d10.f4635e.f4816e;
                    c1221g.f4798l.add(c1221g2);
                    c1221g2.f4797k.add(c1221g);
                    c1221g.f4788b = true;
                    c1221g.f4797k.add(c1220f2);
                    c1221g.f4797k.add(c1220f);
                }
            } else if (i5 == 3) {
                if (c1203d9.f4661s == 3) {
                    c1220f2.f4787a = this;
                    c1220f.f4787a = this;
                    C1227m c1227m = c1203d9.f4635e;
                    c1227m.f4819h.f4787a = this;
                    c1227m.f4820i.f4787a = this;
                    c1221g.f4787a = this;
                    if (c1203d9.m2830y()) {
                        c1221g.f4798l.add(this.f4813b.f4635e.f4816e);
                        this.f4813b.f4635e.f4816e.f4797k.add(c1221g);
                        C1227m c1227m2 = this.f4813b.f4635e;
                        c1227m2.f4816e.f4787a = this;
                        c1221g.f4798l.add(c1227m2.f4819h);
                        c1221g.f4798l.add(this.f4813b.f4635e.f4820i);
                        this.f4813b.f4635e.f4819h.f4797k.add(c1221g);
                        this.f4813b.f4635e.f4820i.f4797k.add(c1221g);
                    } else if (this.f4813b.m2829x()) {
                        this.f4813b.f4635e.f4816e.f4798l.add(c1221g);
                        c1221g.f4797k.add(this.f4813b.f4635e.f4816e);
                    } else {
                        this.f4813b.f4635e.f4816e.f4798l.add(c1221g);
                    }
                } else {
                    C1221g c1221g3 = c1203d9.f4635e.f4816e;
                    c1221g.f4798l.add(c1221g3);
                    c1221g3.f4797k.add(c1221g);
                    this.f4813b.f4635e.f4819h.f4797k.add(c1221g);
                    this.f4813b.f4635e.f4820i.f4797k.add(c1221g);
                    c1221g.f4788b = true;
                    c1221g.f4797k.add(c1220f2);
                    c1221g.f4797k.add(c1220f);
                    c1220f2.f4798l.add(c1221g);
                    c1220f.f4798l.add(c1221g);
                }
            }
        }
        C1203d c1203d11 = this.f4813b;
        C1202c[] c1202cArr2 = c1203d11.f4617Q;
        C1202c c1202c4 = c1202cArr2[0];
        C1202c c1202c5 = c1202c4.f4597f;
        if (c1202c5 != null && c1202cArr2[1].f4597f != null) {
            if (c1203d11.m2829x()) {
                c1220f2.f4792f = this.f4813b.f4617Q[0].m2785e();
                c1220f.f4792f = -this.f4813b.f4617Q[1].m2785e();
                return;
            }
            C1220f m2897h5 = AbstractC1229o.m2897h(this.f4813b.f4617Q[0]);
            C1220f m2897h6 = AbstractC1229o.m2897h(this.f4813b.f4617Q[1]);
            if (m2897h5 != null) {
                m2897h5.m2874b(this);
            }
            if (m2897h6 != null) {
                m2897h6.m2874b(this);
            }
            this.f4821j = 4;
            return;
        }
        if (c1202c5 != null) {
            C1220f m2897h7 = AbstractC1229o.m2897h(c1202c4);
            if (m2897h7 != null) {
                AbstractC1229o.m2896b(c1220f2, m2897h7, this.f4813b.f4617Q[0].m2785e());
                m2899c(c1220f, c1220f2, 1, c1221g);
                return;
            }
            return;
        }
        C1202c c1202c6 = c1202cArr2[1];
        if (c1202c6.f4597f != null) {
            C1220f m2897h8 = AbstractC1229o.m2897h(c1202c6);
            if (m2897h8 != null) {
                AbstractC1229o.m2896b(c1220f, m2897h8, -this.f4813b.f4617Q[1].m2785e());
                m2899c(c1220f2, c1220f, -1, c1221g);
                return;
            }
            return;
        }
        if ((c1203d11 instanceof AbstractC1208i) || (c1203d3 = c1203d11.f4620T) == null) {
            return;
        }
        AbstractC1229o.m2896b(c1220f2, c1203d3.f4633d.f4819h, c1203d11.m2823r());
        m2899c(c1220f, c1220f2, 1, c1221g);
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: e */
    public final void mo2861e() {
        C1220f c1220f = this.f4819h;
        if (c1220f.f4796j) {
            this.f4813b.f4625Y = c1220f.f4793g;
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: f */
    public final void mo2862f() {
        this.f4814c = null;
        this.f4819h.m2875c();
        this.f4820i.m2875c();
        this.f4816e.m2875c();
        this.f4818g = false;
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: k */
    public final boolean mo2864k() {
        return this.f4815d != 3 || this.f4813b.f4660r == 0;
    }

    /* renamed from: n */
    public final void m2889n() {
        this.f4818g = false;
        C1220f c1220f = this.f4819h;
        c1220f.m2875c();
        c1220f.f4796j = false;
        C1220f c1220f2 = this.f4820i;
        c1220f2.m2875c();
        c1220f2.f4796j = false;
        this.f4816e.f4796j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4813b.f4642h0;
    }
}
