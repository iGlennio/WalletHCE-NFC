package p116t;

import p107q.AbstractC1181e;
import p113s.AbstractC1208i;
import p113s.C1202c;
import p113s.C1203d;

/* renamed from: t.m */
/* loaded from: classes.dex */
public final class C1227m extends AbstractC1229o {

    /* renamed from: k */
    public C1220f f4804k;

    /* renamed from: l */
    public C1215a f4805l;

    @Override // p116t.InterfaceC1218d
    /* renamed from: a */
    public final void mo2859a(InterfaceC1218d interfaceC1218d) {
        float f;
        float f2;
        float f3;
        int i2;
        if (AbstractC1181e.m2740a(this.f4821j) == 3) {
            C1203d c1203d = this.f4813b;
            m2901l(c1203d.f4610J, c1203d.f4612L, 1);
            return;
        }
        C1221g c1221g = this.f4816e;
        if (c1221g.f4789c && !c1221g.f4796j && this.f4815d == 3) {
            C1203d c1203d2 = this.f4813b;
            int i3 = c1203d2.f4661s;
            if (i3 == 2) {
                C1203d c1203d3 = c1203d2.f4620T;
                if (c1203d3 != null) {
                    if (c1203d3.f4635e.f4816e.f4796j) {
                        c1221g.mo2876d((int) ((r5.f4793g * c1203d2.f4668z) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                C1221g c1221g2 = c1203d2.f4633d.f4816e;
                if (c1221g2.f4796j) {
                    int i4 = c1203d2.f4624X;
                    if (i4 == -1) {
                        f = c1221g2.f4793g;
                        f2 = c1203d2.f4623W;
                    } else if (i4 == 0) {
                        f3 = c1221g2.f4793g * c1203d2.f4623W;
                        i2 = (int) (f3 + 0.5f);
                        c1221g.mo2876d(i2);
                    } else if (i4 != 1) {
                        i2 = 0;
                        c1221g.mo2876d(i2);
                    } else {
                        f = c1221g2.f4793g;
                        f2 = c1203d2.f4623W;
                    }
                    f3 = f / f2;
                    i2 = (int) (f3 + 0.5f);
                    c1221g.mo2876d(i2);
                }
            }
        }
        C1220f c1220f = this.f4819h;
        if (c1220f.f4789c) {
            C1220f c1220f2 = this.f4820i;
            if (c1220f2.f4789c) {
                if (c1220f.f4796j && c1220f2.f4796j && c1221g.f4796j) {
                    return;
                }
                if (!c1221g.f4796j && this.f4815d == 3) {
                    C1203d c1203d4 = this.f4813b;
                    if (c1203d4.f4660r == 0 && !c1203d4.m2830y()) {
                        C1220f c1220f3 = (C1220f) c1220f.f4798l.get(0);
                        C1220f c1220f4 = (C1220f) c1220f2.f4798l.get(0);
                        int i5 = c1220f3.f4793g + c1220f.f4792f;
                        int i6 = c1220f4.f4793g + c1220f2.f4792f;
                        c1220f.mo2876d(i5);
                        c1220f2.mo2876d(i6);
                        c1221g.mo2876d(i6 - i5);
                        return;
                    }
                }
                if (!c1221g.f4796j && this.f4815d == 3 && this.f4812a == 1 && c1220f.f4798l.size() > 0 && c1220f2.f4798l.size() > 0) {
                    C1220f c1220f5 = (C1220f) c1220f.f4798l.get(0);
                    int i7 = (((C1220f) c1220f2.f4798l.get(0)).f4793g + c1220f2.f4792f) - (c1220f5.f4793g + c1220f.f4792f);
                    int i8 = c1221g.f4799m;
                    if (i7 < i8) {
                        c1221g.mo2876d(i7);
                    } else {
                        c1221g.mo2876d(i8);
                    }
                }
                if (c1221g.f4796j && c1220f.f4798l.size() > 0 && c1220f2.f4798l.size() > 0) {
                    C1220f c1220f6 = (C1220f) c1220f.f4798l.get(0);
                    C1220f c1220f7 = (C1220f) c1220f2.f4798l.get(0);
                    int i9 = c1220f6.f4793g;
                    int i10 = c1220f.f4792f + i9;
                    int i11 = c1220f7.f4793g;
                    int i12 = c1220f2.f4792f + i11;
                    float f4 = this.f4813b.f4636e0;
                    if (c1220f6 == c1220f7) {
                        f4 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    c1220f.mo2876d((int) ((((i11 - i9) - c1221g.f4793g) * f4) + i9 + 0.5f));
                    c1220f2.mo2876d(c1220f.f4793g + c1221g.f4793g);
                }
            }
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: d */
    public final void mo2860d() {
        C1203d c1203d;
        C1203d c1203d2;
        C1203d c1203d3;
        C1203d c1203d4;
        C1203d c1203d5 = this.f4813b;
        boolean z2 = c1203d5.f4627a;
        C1221g c1221g = this.f4816e;
        if (z2) {
            c1221g.mo2876d(c1203d5.m2818k());
        }
        boolean z3 = c1221g.f4796j;
        C1220f c1220f = this.f4820i;
        C1220f c1220f2 = this.f4819h;
        if (!z3) {
            C1203d c1203d6 = this.f4813b;
            this.f4815d = c1203d6.f4658p0[1];
            if (c1203d6.f4605E) {
                this.f4805l = new C1215a(this);
            }
            int i2 = this.f4815d;
            if (i2 != 3) {
                if (i2 == 4 && (c1203d4 = this.f4813b.f4620T) != null && c1203d4.f4658p0[1] == 1) {
                    int m2818k = (c1203d4.m2818k() - this.f4813b.f4610J.m2785e()) - this.f4813b.f4612L.m2785e();
                    AbstractC1229o.m2896b(c1220f2, c1203d4.f4635e.f4819h, this.f4813b.f4610J.m2785e());
                    AbstractC1229o.m2896b(c1220f, c1203d4.f4635e.f4820i, -this.f4813b.f4612L.m2785e());
                    c1221g.mo2876d(m2818k);
                    return;
                }
                if (i2 == 1) {
                    c1221g.mo2876d(this.f4813b.m2818k());
                }
            }
        } else if (this.f4815d == 4 && (c1203d2 = (c1203d = this.f4813b).f4620T) != null && c1203d2.f4658p0[1] == 1) {
            AbstractC1229o.m2896b(c1220f2, c1203d2.f4635e.f4819h, c1203d.f4610J.m2785e());
            AbstractC1229o.m2896b(c1220f, c1203d2.f4635e.f4820i, -this.f4813b.f4612L.m2785e());
            return;
        }
        boolean z4 = c1221g.f4796j;
        C1220f c1220f3 = this.f4804k;
        if (z4) {
            C1203d c1203d7 = this.f4813b;
            if (c1203d7.f4627a) {
                C1202c[] c1202cArr = c1203d7.f4617Q;
                C1202c c1202c = c1202cArr[2];
                C1202c c1202c2 = c1202c.f4597f;
                if (c1202c2 != null && c1202cArr[3].f4597f != null) {
                    if (c1203d7.m2830y()) {
                        c1220f2.f4792f = this.f4813b.f4617Q[2].m2785e();
                        c1220f.f4792f = -this.f4813b.f4617Q[3].m2785e();
                    } else {
                        C1220f m2897h = AbstractC1229o.m2897h(this.f4813b.f4617Q[2]);
                        if (m2897h != null) {
                            AbstractC1229o.m2896b(c1220f2, m2897h, this.f4813b.f4617Q[2].m2785e());
                        }
                        C1220f m2897h2 = AbstractC1229o.m2897h(this.f4813b.f4617Q[3]);
                        if (m2897h2 != null) {
                            AbstractC1229o.m2896b(c1220f, m2897h2, -this.f4813b.f4617Q[3].m2785e());
                        }
                        c1220f2.f4788b = true;
                        c1220f.f4788b = true;
                    }
                    C1203d c1203d8 = this.f4813b;
                    if (c1203d8.f4605E) {
                        AbstractC1229o.m2896b(c1220f3, c1220f2, c1203d8.f4628a0);
                        return;
                    }
                    return;
                }
                if (c1202c2 != null) {
                    C1220f m2897h3 = AbstractC1229o.m2897h(c1202c);
                    if (m2897h3 != null) {
                        AbstractC1229o.m2896b(c1220f2, m2897h3, this.f4813b.f4617Q[2].m2785e());
                        AbstractC1229o.m2896b(c1220f, c1220f2, c1221g.f4793g);
                        C1203d c1203d9 = this.f4813b;
                        if (c1203d9.f4605E) {
                            AbstractC1229o.m2896b(c1220f3, c1220f2, c1203d9.f4628a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1202c c1202c3 = c1202cArr[3];
                if (c1202c3.f4597f != null) {
                    C1220f m2897h4 = AbstractC1229o.m2897h(c1202c3);
                    if (m2897h4 != null) {
                        AbstractC1229o.m2896b(c1220f, m2897h4, -this.f4813b.f4617Q[3].m2785e());
                        AbstractC1229o.m2896b(c1220f2, c1220f, -c1221g.f4793g);
                    }
                    C1203d c1203d10 = this.f4813b;
                    if (c1203d10.f4605E) {
                        AbstractC1229o.m2896b(c1220f3, c1220f2, c1203d10.f4628a0);
                        return;
                    }
                    return;
                }
                C1202c c1202c4 = c1202cArr[4];
                if (c1202c4.f4597f != null) {
                    C1220f m2897h5 = AbstractC1229o.m2897h(c1202c4);
                    if (m2897h5 != null) {
                        AbstractC1229o.m2896b(c1220f3, m2897h5, 0);
                        AbstractC1229o.m2896b(c1220f2, c1220f3, -this.f4813b.f4628a0);
                        AbstractC1229o.m2896b(c1220f, c1220f2, c1221g.f4793g);
                        return;
                    }
                    return;
                }
                if ((c1203d7 instanceof AbstractC1208i) || c1203d7.f4620T == null || c1203d7.mo2816i(7).f4597f != null) {
                    return;
                }
                C1203d c1203d11 = this.f4813b;
                AbstractC1229o.m2896b(c1220f2, c1203d11.f4620T.f4635e.f4819h, c1203d11.m2824s());
                AbstractC1229o.m2896b(c1220f, c1220f2, c1221g.f4793g);
                C1203d c1203d12 = this.f4813b;
                if (c1203d12.f4605E) {
                    AbstractC1229o.m2896b(c1220f3, c1220f2, c1203d12.f4628a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f4815d != 3) {
            c1221g.m2874b(this);
        } else {
            C1203d c1203d13 = this.f4813b;
            int i3 = c1203d13.f4661s;
            if (i3 == 2) {
                C1203d c1203d14 = c1203d13.f4620T;
                if (c1203d14 != null) {
                    C1221g c1221g2 = c1203d14.f4635e.f4816e;
                    c1221g.f4798l.add(c1221g2);
                    c1221g2.f4797k.add(c1221g);
                    c1221g.f4788b = true;
                    c1221g.f4797k.add(c1220f2);
                    c1221g.f4797k.add(c1220f);
                }
            } else if (i3 == 3 && !c1203d13.m2830y()) {
                C1203d c1203d15 = this.f4813b;
                if (c1203d15.f4660r != 3) {
                    C1221g c1221g3 = c1203d15.f4633d.f4816e;
                    c1221g.f4798l.add(c1221g3);
                    c1221g3.f4797k.add(c1221g);
                    c1221g.f4788b = true;
                    c1221g.f4797k.add(c1220f2);
                    c1221g.f4797k.add(c1220f);
                }
            }
        }
        C1203d c1203d16 = this.f4813b;
        C1202c[] c1202cArr2 = c1203d16.f4617Q;
        C1202c c1202c5 = c1202cArr2[2];
        C1202c c1202c6 = c1202c5.f4597f;
        if (c1202c6 != null && c1202cArr2[3].f4597f != null) {
            if (c1203d16.m2830y()) {
                c1220f2.f4792f = this.f4813b.f4617Q[2].m2785e();
                c1220f.f4792f = -this.f4813b.f4617Q[3].m2785e();
            } else {
                C1220f m2897h6 = AbstractC1229o.m2897h(this.f4813b.f4617Q[2]);
                C1220f m2897h7 = AbstractC1229o.m2897h(this.f4813b.f4617Q[3]);
                if (m2897h6 != null) {
                    m2897h6.m2874b(this);
                }
                if (m2897h7 != null) {
                    m2897h7.m2874b(this);
                }
                this.f4821j = 4;
            }
            if (this.f4813b.f4605E) {
                m2899c(c1220f3, c1220f2, 1, this.f4805l);
            }
        } else if (c1202c6 != null) {
            C1220f m2897h8 = AbstractC1229o.m2897h(c1202c5);
            if (m2897h8 != null) {
                AbstractC1229o.m2896b(c1220f2, m2897h8, this.f4813b.f4617Q[2].m2785e());
                m2899c(c1220f, c1220f2, 1, c1221g);
                if (this.f4813b.f4605E) {
                    m2899c(c1220f3, c1220f2, 1, this.f4805l);
                }
                if (this.f4815d == 3) {
                    C1203d c1203d17 = this.f4813b;
                    if (c1203d17.f4623W > 0.0f) {
                        C1225k c1225k = c1203d17.f4633d;
                        if (c1225k.f4815d == 3) {
                            c1225k.f4816e.f4797k.add(c1221g);
                            c1221g.f4798l.add(this.f4813b.f4633d.f4816e);
                            c1221g.f4787a = this;
                        }
                    }
                }
            }
        } else {
            C1202c c1202c7 = c1202cArr2[3];
            if (c1202c7.f4597f != null) {
                C1220f m2897h9 = AbstractC1229o.m2897h(c1202c7);
                if (m2897h9 != null) {
                    AbstractC1229o.m2896b(c1220f, m2897h9, -this.f4813b.f4617Q[3].m2785e());
                    m2899c(c1220f2, c1220f, -1, c1221g);
                    if (this.f4813b.f4605E) {
                        m2899c(c1220f3, c1220f2, 1, this.f4805l);
                    }
                }
            } else {
                C1202c c1202c8 = c1202cArr2[4];
                if (c1202c8.f4597f != null) {
                    C1220f m2897h10 = AbstractC1229o.m2897h(c1202c8);
                    if (m2897h10 != null) {
                        AbstractC1229o.m2896b(c1220f3, m2897h10, 0);
                        m2899c(c1220f2, c1220f3, -1, this.f4805l);
                        m2899c(c1220f, c1220f2, 1, c1221g);
                    }
                } else if (!(c1203d16 instanceof AbstractC1208i) && (c1203d3 = c1203d16.f4620T) != null) {
                    AbstractC1229o.m2896b(c1220f2, c1203d3.f4635e.f4819h, c1203d16.m2824s());
                    m2899c(c1220f, c1220f2, 1, c1221g);
                    if (this.f4813b.f4605E) {
                        m2899c(c1220f3, c1220f2, 1, this.f4805l);
                    }
                    if (this.f4815d == 3) {
                        C1203d c1203d18 = this.f4813b;
                        if (c1203d18.f4623W > 0.0f) {
                            C1225k c1225k2 = c1203d18.f4633d;
                            if (c1225k2.f4815d == 3) {
                                c1225k2.f4816e.f4797k.add(c1221g);
                                c1221g.f4798l.add(this.f4813b.f4633d.f4816e);
                                c1221g.f4787a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c1221g.f4798l.size() == 0) {
            c1221g.f4789c = true;
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: e */
    public final void mo2861e() {
        C1220f c1220f = this.f4819h;
        if (c1220f.f4796j) {
            this.f4813b.f4626Z = c1220f.f4793g;
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: f */
    public final void mo2862f() {
        this.f4814c = null;
        this.f4819h.m2875c();
        this.f4820i.m2875c();
        this.f4804k.m2875c();
        this.f4816e.m2875c();
        this.f4818g = false;
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: k */
    public final boolean mo2864k() {
        return this.f4815d != 3 || this.f4813b.f4661s == 0;
    }

    /* renamed from: m */
    public final void m2892m() {
        this.f4818g = false;
        C1220f c1220f = this.f4819h;
        c1220f.m2875c();
        c1220f.f4796j = false;
        C1220f c1220f2 = this.f4820i;
        c1220f2.m2875c();
        c1220f2.f4796j = false;
        C1220f c1220f3 = this.f4804k;
        c1220f3.m2875c();
        c1220f3.f4796j = false;
        this.f4816e.f4796j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4813b.f4642h0;
    }
}
