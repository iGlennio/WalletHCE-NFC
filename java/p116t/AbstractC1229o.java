package p116t;

import p107q.AbstractC1181e;
import p113s.C1202c;
import p113s.C1203d;

/* renamed from: t.o */
/* loaded from: classes.dex */
public abstract class AbstractC1229o implements InterfaceC1218d {

    /* renamed from: a */
    public int f4812a;

    /* renamed from: b */
    public C1203d f4813b;

    /* renamed from: c */
    public C1226l f4814c;

    /* renamed from: d */
    public int f4815d;

    /* renamed from: e */
    public final C1221g f4816e = new C1221g(this);

    /* renamed from: f */
    public int f4817f = 0;

    /* renamed from: g */
    public boolean f4818g = false;

    /* renamed from: h */
    public final C1220f f4819h = new C1220f(this);

    /* renamed from: i */
    public final C1220f f4820i = new C1220f(this);

    /* renamed from: j */
    public int f4821j = 1;

    public AbstractC1229o(C1203d c1203d) {
        this.f4813b = c1203d;
    }

    /* renamed from: b */
    public static void m2896b(C1220f c1220f, C1220f c1220f2, int i2) {
        c1220f.f4798l.add(c1220f2);
        c1220f.f4792f = i2;
        c1220f2.f4797k.add(c1220f);
    }

    /* renamed from: h */
    public static C1220f m2897h(C1202c c1202c) {
        C1202c c1202c2 = c1202c.f4597f;
        if (c1202c2 == null) {
            return null;
        }
        int m2740a = AbstractC1181e.m2740a(c1202c2.f4596e);
        C1203d c1203d = c1202c2.f4595d;
        if (m2740a == 1) {
            return c1203d.f4633d.f4819h;
        }
        if (m2740a == 2) {
            return c1203d.f4635e.f4819h;
        }
        if (m2740a == 3) {
            return c1203d.f4633d.f4820i;
        }
        if (m2740a == 4) {
            return c1203d.f4635e.f4820i;
        }
        if (m2740a != 5) {
            return null;
        }
        return c1203d.f4635e.f4804k;
    }

    /* renamed from: i */
    public static C1220f m2898i(C1202c c1202c, int i2) {
        C1202c c1202c2 = c1202c.f4597f;
        if (c1202c2 == null) {
            return null;
        }
        C1203d c1203d = c1202c2.f4595d;
        AbstractC1229o abstractC1229o = i2 == 0 ? c1203d.f4633d : c1203d.f4635e;
        int m2740a = AbstractC1181e.m2740a(c1202c2.f4596e);
        if (m2740a == 1 || m2740a == 2) {
            return abstractC1229o.f4819h;
        }
        if (m2740a == 3 || m2740a == 4) {
            return abstractC1229o.f4820i;
        }
        return null;
    }

    /* renamed from: c */
    public final void m2899c(C1220f c1220f, C1220f c1220f2, int i2, C1221g c1221g) {
        c1220f.f4798l.add(c1220f2);
        c1220f.f4798l.add(this.f4816e);
        c1220f.f4794h = i2;
        c1220f.f4795i = c1221g;
        c1220f2.f4797k.add(c1220f);
        c1221g.f4797k.add(c1220f);
    }

    /* renamed from: d */
    public abstract void mo2860d();

    /* renamed from: e */
    public abstract void mo2861e();

    /* renamed from: f */
    public abstract void mo2862f();

    /* renamed from: g */
    public final int m2900g(int i2, int i3) {
        if (i3 == 0) {
            C1203d c1203d = this.f4813b;
            int i4 = c1203d.f4664v;
            int max = Math.max(c1203d.f4663u, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max != i2) {
                return max;
            }
        } else {
            C1203d c1203d2 = this.f4813b;
            int i5 = c1203d2.f4667y;
            int max2 = Math.max(c1203d2.f4666x, i2);
            if (i5 > 0) {
                max2 = Math.min(i5, i2);
            }
            if (max2 != i2) {
                return max2;
            }
        }
        return i2;
    }

    /* renamed from: j */
    public long mo2863j() {
        if (this.f4816e.f4796j) {
            return r0.f4793g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo2864k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f4812a == 3) goto L50;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2901l(p113s.C1202c r12, p113s.C1202c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p116t.AbstractC1229o.m2901l(s.c, s.c, int):void");
    }
}
