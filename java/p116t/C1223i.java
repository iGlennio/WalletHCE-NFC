package p116t;

import p113s.C1203d;
import p113s.C1207h;

/* renamed from: t.i */
/* loaded from: classes.dex */
public final class C1223i extends AbstractC1229o {
    @Override // p116t.InterfaceC1218d
    /* renamed from: a */
    public final void mo2859a(InterfaceC1218d interfaceC1218d) {
        C1220f c1220f = this.f4819h;
        if (c1220f.f4789c && !c1220f.f4796j) {
            c1220f.mo2876d((int) ((((C1220f) c1220f.f4798l.get(0)).f4793g * ((C1207h) this.f4813b).f4745q0) + 0.5f));
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: d */
    public final void mo2860d() {
        C1203d c1203d = this.f4813b;
        C1207h c1207h = (C1207h) c1203d;
        int i2 = c1207h.f4746r0;
        int i3 = c1207h.f4747s0;
        int i4 = c1207h.f4749u0;
        C1220f c1220f = this.f4819h;
        if (i4 == 1) {
            if (i2 != -1) {
                c1220f.f4798l.add(c1203d.f4620T.f4633d.f4819h);
                this.f4813b.f4620T.f4633d.f4819h.f4797k.add(c1220f);
                c1220f.f4792f = i2;
            } else if (i3 != -1) {
                c1220f.f4798l.add(c1203d.f4620T.f4633d.f4820i);
                this.f4813b.f4620T.f4633d.f4820i.f4797k.add(c1220f);
                c1220f.f4792f = -i3;
            } else {
                c1220f.f4788b = true;
                c1220f.f4798l.add(c1203d.f4620T.f4633d.f4820i);
                this.f4813b.f4620T.f4633d.f4820i.f4797k.add(c1220f);
            }
            m2886m(this.f4813b.f4633d.f4819h);
            m2886m(this.f4813b.f4633d.f4820i);
            return;
        }
        if (i2 != -1) {
            c1220f.f4798l.add(c1203d.f4620T.f4635e.f4819h);
            this.f4813b.f4620T.f4635e.f4819h.f4797k.add(c1220f);
            c1220f.f4792f = i2;
        } else if (i3 != -1) {
            c1220f.f4798l.add(c1203d.f4620T.f4635e.f4820i);
            this.f4813b.f4620T.f4635e.f4820i.f4797k.add(c1220f);
            c1220f.f4792f = -i3;
        } else {
            c1220f.f4788b = true;
            c1220f.f4798l.add(c1203d.f4620T.f4635e.f4820i);
            this.f4813b.f4620T.f4635e.f4820i.f4797k.add(c1220f);
        }
        m2886m(this.f4813b.f4635e.f4819h);
        m2886m(this.f4813b.f4635e.f4820i);
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: e */
    public final void mo2861e() {
        C1203d c1203d = this.f4813b;
        int i2 = ((C1207h) c1203d).f4749u0;
        C1220f c1220f = this.f4819h;
        if (i2 == 1) {
            c1203d.f4625Y = c1220f.f4793g;
        } else {
            c1203d.f4626Z = c1220f.f4793g;
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: f */
    public final void mo2862f() {
        this.f4819h.m2875c();
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: k */
    public final boolean mo2864k() {
        return false;
    }

    /* renamed from: m */
    public final void m2886m(C1220f c1220f) {
        C1220f c1220f2 = this.f4819h;
        c1220f2.f4797k.add(c1220f);
        c1220f.f4798l.add(c1220f2);
    }
}
