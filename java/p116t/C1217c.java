package p116t;

import java.util.ArrayList;
import java.util.Iterator;
import p113s.C1202c;
import p113s.C1203d;
import p113s.C1204e;

/* renamed from: t.c */
/* loaded from: classes.dex */
public final class C1217c extends AbstractC1229o {

    /* renamed from: k */
    public final ArrayList f4777k;

    /* renamed from: l */
    public int f4778l;

    public C1217c(C1203d c1203d, int i2) {
        super(c1203d);
        C1203d c1203d2;
        this.f4777k = new ArrayList();
        this.f4817f = i2;
        C1203d c1203d3 = this.f4813b;
        C1203d m2820m = c1203d3.m2820m(i2);
        while (true) {
            C1203d c1203d4 = m2820m;
            c1203d2 = c1203d3;
            c1203d3 = c1203d4;
            if (c1203d3 == null) {
                break;
            } else {
                m2820m = c1203d3.m2820m(this.f4817f);
            }
        }
        this.f4813b = c1203d2;
        int i3 = this.f4817f;
        AbstractC1229o abstractC1229o = i3 == 0 ? c1203d2.f4633d : i3 == 1 ? c1203d2.f4635e : null;
        ArrayList arrayList = this.f4777k;
        arrayList.add(abstractC1229o);
        C1203d m2819l = c1203d2.m2819l(this.f4817f);
        while (m2819l != null) {
            int i4 = this.f4817f;
            arrayList.add(i4 == 0 ? m2819l.f4633d : i4 == 1 ? m2819l.f4635e : null);
            m2819l = m2819l.m2819l(this.f4817f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1229o abstractC1229o2 = (AbstractC1229o) it.next();
            int i5 = this.f4817f;
            if (i5 == 0) {
                abstractC1229o2.f4813b.f4629b = this;
            } else if (i5 == 1) {
                abstractC1229o2.f4813b.f4631c = this;
            }
        }
        if (this.f4817f == 0 && ((C1204e) this.f4813b.f4620T).f4686v0 && arrayList.size() > 1) {
            this.f4813b = ((AbstractC1229o) arrayList.get(arrayList.size() - 1)).f4813b;
        }
        this.f4778l = this.f4817f == 0 ? this.f4813b.f4644i0 : this.f4813b.f4646j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0397, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // p116t.InterfaceC1218d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2859a(p116t.InterfaceC1218d r28) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p116t.C1217c.mo2859a(t.d):void");
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: d */
    public final void mo2860d() {
        ArrayList arrayList = this.f4777k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1229o) it.next()).mo2860d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C1203d c1203d = ((AbstractC1229o) arrayList.get(0)).f4813b;
        C1203d c1203d2 = ((AbstractC1229o) arrayList.get(size - 1)).f4813b;
        int i2 = this.f4817f;
        C1220f c1220f = this.f4820i;
        C1220f c1220f2 = this.f4819h;
        if (i2 == 0) {
            C1202c c1202c = c1203d.f4609I;
            C1202c c1202c2 = c1203d2.f4611K;
            C1220f m2898i = AbstractC1229o.m2898i(c1202c, 0);
            int m2785e = c1202c.m2785e();
            C1203d m2865m = m2865m();
            if (m2865m != null) {
                m2785e = m2865m.f4609I.m2785e();
            }
            if (m2898i != null) {
                AbstractC1229o.m2896b(c1220f2, m2898i, m2785e);
            }
            C1220f m2898i2 = AbstractC1229o.m2898i(c1202c2, 0);
            int m2785e2 = c1202c2.m2785e();
            C1203d m2866n = m2866n();
            if (m2866n != null) {
                m2785e2 = m2866n.f4611K.m2785e();
            }
            if (m2898i2 != null) {
                AbstractC1229o.m2896b(c1220f, m2898i2, -m2785e2);
            }
        } else {
            C1202c c1202c3 = c1203d.f4610J;
            C1202c c1202c4 = c1203d2.f4612L;
            C1220f m2898i3 = AbstractC1229o.m2898i(c1202c3, 1);
            int m2785e3 = c1202c3.m2785e();
            C1203d m2865m2 = m2865m();
            if (m2865m2 != null) {
                m2785e3 = m2865m2.f4610J.m2785e();
            }
            if (m2898i3 != null) {
                AbstractC1229o.m2896b(c1220f2, m2898i3, m2785e3);
            }
            C1220f m2898i4 = AbstractC1229o.m2898i(c1202c4, 1);
            int m2785e4 = c1202c4.m2785e();
            C1203d m2866n2 = m2866n();
            if (m2866n2 != null) {
                m2785e4 = m2866n2.f4612L.m2785e();
            }
            if (m2898i4 != null) {
                AbstractC1229o.m2896b(c1220f, m2898i4, -m2785e4);
            }
        }
        c1220f2.f4787a = this;
        c1220f.f4787a = this;
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: e */
    public final void mo2861e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4777k;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((AbstractC1229o) arrayList.get(i2)).mo2861e();
            i2++;
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: f */
    public final void mo2862f() {
        this.f4814c = null;
        Iterator it = this.f4777k.iterator();
        while (it.hasNext()) {
            ((AbstractC1229o) it.next()).mo2862f();
        }
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: j */
    public final long mo2863j() {
        ArrayList arrayList = this.f4777k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = r5.f4820i.f4792f + ((AbstractC1229o) arrayList.get(i2)).mo2863j() + j2 + r5.f4819h.f4792f;
        }
        return j2;
    }

    @Override // p116t.AbstractC1229o
    /* renamed from: k */
    public final boolean mo2864k() {
        ArrayList arrayList = this.f4777k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((AbstractC1229o) arrayList.get(i2)).mo2864k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C1203d m2865m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4777k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C1203d c1203d = ((AbstractC1229o) arrayList.get(i2)).f4813b;
            if (c1203d.f4640g0 != 8) {
                return c1203d;
            }
            i2++;
        }
    }

    /* renamed from: n */
    public final C1203d m2866n() {
        ArrayList arrayList = this.f4777k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1203d c1203d = ((AbstractC1229o) arrayList.get(size)).f4813b;
            if (c1203d.f4640g0 != 8) {
                return c1203d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f4817f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f4777k.iterator();
        while (it.hasNext()) {
            AbstractC1229o abstractC1229o = (AbstractC1229o) it.next();
            sb.append("<");
            sb.append(abstractC1229o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
