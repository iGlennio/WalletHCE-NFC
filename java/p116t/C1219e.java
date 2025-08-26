package p116t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p113s.AbstractC1208i;
import p113s.C1203d;
import p113s.C1204e;
import p113s.C1207h;
import p121v.C1256f;

/* renamed from: t.e */
/* loaded from: classes.dex */
public final class C1219e {

    /* renamed from: a */
    public C1204e f4779a;

    /* renamed from: b */
    public boolean f4780b;

    /* renamed from: c */
    public boolean f4781c;

    /* renamed from: d */
    public C1204e f4782d;

    /* renamed from: e */
    public ArrayList f4783e;

    /* renamed from: f */
    public C1256f f4784f;

    /* renamed from: g */
    public C1216b f4785g;

    /* renamed from: h */
    public ArrayList f4786h;

    /* renamed from: a */
    public final void m2867a(C1220f c1220f, int i2, ArrayList arrayList, C1226l c1226l) {
        AbstractC1229o abstractC1229o = c1220f.f4790d;
        if (abstractC1229o.f4814c == null) {
            C1204e c1204e = this.f4779a;
            if (abstractC1229o == c1204e.f4633d || abstractC1229o == c1204e.f4635e) {
                return;
            }
            if (c1226l == null) {
                c1226l = new C1226l();
                c1226l.f4802a = null;
                c1226l.f4803b = new ArrayList();
                c1226l.f4802a = abstractC1229o;
                arrayList.add(c1226l);
            }
            abstractC1229o.f4814c = c1226l;
            c1226l.f4803b.add(abstractC1229o);
            C1220f c1220f2 = abstractC1229o.f4819h;
            Iterator it = c1220f2.f4797k.iterator();
            while (it.hasNext()) {
                InterfaceC1218d interfaceC1218d = (InterfaceC1218d) it.next();
                if (interfaceC1218d instanceof C1220f) {
                    m2867a((C1220f) interfaceC1218d, i2, arrayList, c1226l);
                }
            }
            C1220f c1220f3 = abstractC1229o.f4820i;
            Iterator it2 = c1220f3.f4797k.iterator();
            while (it2.hasNext()) {
                InterfaceC1218d interfaceC1218d2 = (InterfaceC1218d) it2.next();
                if (interfaceC1218d2 instanceof C1220f) {
                    m2867a((C1220f) interfaceC1218d2, i2, arrayList, c1226l);
                }
            }
            if (i2 == 1 && (abstractC1229o instanceof C1227m)) {
                Iterator it3 = ((C1227m) abstractC1229o).f4804k.f4797k.iterator();
                while (it3.hasNext()) {
                    InterfaceC1218d interfaceC1218d3 = (InterfaceC1218d) it3.next();
                    if (interfaceC1218d3 instanceof C1220f) {
                        m2867a((C1220f) interfaceC1218d3, i2, arrayList, c1226l);
                    }
                }
            }
            Iterator it4 = c1220f2.f4798l.iterator();
            while (it4.hasNext()) {
                m2867a((C1220f) it4.next(), i2, arrayList, c1226l);
            }
            Iterator it5 = c1220f3.f4798l.iterator();
            while (it5.hasNext()) {
                m2867a((C1220f) it5.next(), i2, arrayList, c1226l);
            }
            if (i2 == 1 && (abstractC1229o instanceof C1227m)) {
                Iterator it6 = ((C1227m) abstractC1229o).f4804k.f4798l.iterator();
                while (it6.hasNext()) {
                    m2867a((C1220f) it6.next(), i2, arrayList, c1226l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2868b(p113s.C1204e r23) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p116t.C1219e.m2868b(s.e):void");
    }

    /* renamed from: c */
    public final void m2869c() {
        ArrayList arrayList = this.f4783e;
        arrayList.clear();
        C1204e c1204e = this.f4782d;
        c1204e.f4633d.mo2862f();
        c1204e.f4635e.mo2862f();
        arrayList.add(c1204e.f4633d);
        arrayList.add(c1204e.f4635e);
        Iterator it = c1204e.f4681q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C1203d c1203d = (C1203d) it.next();
            if (c1203d instanceof C1207h) {
                C1223i c1223i = new C1223i(c1203d);
                c1203d.f4633d.mo2862f();
                c1203d.f4635e.mo2862f();
                c1223i.f4817f = ((C1207h) c1203d).f4749u0;
                arrayList.add(c1223i);
            } else {
                if (c1203d.m2829x()) {
                    if (c1203d.f4629b == null) {
                        c1203d.f4629b = new C1217c(c1203d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1203d.f4629b);
                } else {
                    arrayList.add(c1203d.f4633d);
                }
                if (c1203d.m2830y()) {
                    if (c1203d.f4631c == null) {
                        c1203d.f4631c = new C1217c(c1203d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1203d.f4631c);
                } else {
                    arrayList.add(c1203d.f4635e);
                }
                if (c1203d instanceof AbstractC1208i) {
                    arrayList.add(new C1224j(c1203d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC1229o) it2.next()).mo2862f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1229o abstractC1229o = (AbstractC1229o) it3.next();
            if (abstractC1229o.f4813b != c1204e) {
                abstractC1229o.mo2860d();
            }
        }
        ArrayList arrayList2 = this.f4786h;
        arrayList2.clear();
        C1204e c1204e2 = this.f4779a;
        m2871e(c1204e2.f4633d, 0, arrayList2);
        m2871e(c1204e2.f4635e, 1, arrayList2);
        this.f4780b = false;
    }

    /* renamed from: d */
    public final int m2870d(C1204e c1204e, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        long max;
        float f;
        C1204e c1204e2 = c1204e;
        ArrayList arrayList2 = this.f4786h;
        int size = arrayList2.size();
        int i5 = 0;
        long j2 = 0;
        while (i5 < size) {
            AbstractC1229o abstractC1229o = ((C1226l) arrayList2.get(i5)).f4802a;
            if (!(abstractC1229o instanceof C1217c) ? !(i2 != 0 ? (abstractC1229o instanceof C1227m) : (abstractC1229o instanceof C1225k)) : ((C1217c) abstractC1229o).f4817f != i2) {
                C1220f c1220f = (i2 == 0 ? c1204e2.f4633d : c1204e2.f4635e).f4819h;
                C1220f c1220f2 = (i2 == 0 ? c1204e2.f4633d : c1204e2.f4635e).f4820i;
                boolean contains = abstractC1229o.f4819h.f4798l.contains(c1220f);
                C1220f c1220f3 = abstractC1229o.f4820i;
                boolean contains2 = c1220f3.f4798l.contains(c1220f2);
                long mo2863j = abstractC1229o.mo2863j();
                C1220f c1220f4 = abstractC1229o.f4819h;
                if (contains && contains2) {
                    long m2891b = C1226l.m2891b(c1220f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i3 = size;
                    long m2890a = C1226l.m2890a(c1220f3, 0L);
                    long j3 = m2891b - mo2863j;
                    int i6 = c1220f3.f4792f;
                    arrayList = arrayList3;
                    i4 = i5;
                    if (j3 >= (-i6)) {
                        j3 += i6;
                    }
                    long j4 = (-m2890a) - mo2863j;
                    long j5 = c1220f4.f4792f;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    C1203d c1203d = abstractC1229o.f4813b;
                    if (i2 == 0) {
                        f = c1203d.f4634d0;
                    } else if (i2 == 1) {
                        f = c1203d.f4636e0;
                    } else {
                        c1203d.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (c1220f4.f4792f + ((((long) ((f2 * f) + 0.5f)) + mo2863j) + ((long) (((1.0f - f) * f2) + 0.5f)))) - c1220f3.f4792f;
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    i4 = i5;
                    max = contains ? Math.max(C1226l.m2891b(c1220f4, c1220f4.f4792f), c1220f4.f4792f + mo2863j) : contains2 ? Math.max(-C1226l.m2890a(c1220f3, c1220f3.f4792f), (-c1220f3.f4792f) + mo2863j) : (abstractC1229o.mo2863j() + c1220f4.f4792f) - c1220f3.f4792f;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                i4 = i5;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i5 = i4 + 1;
            c1204e2 = c1204e;
            size = i3;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    /* renamed from: e */
    public final void m2871e(AbstractC1229o abstractC1229o, int i2, ArrayList arrayList) {
        C1220f c1220f;
        Iterator it = abstractC1229o.f4819h.f4797k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c1220f = abstractC1229o.f4820i;
            if (!hasNext) {
                break;
            }
            InterfaceC1218d interfaceC1218d = (InterfaceC1218d) it.next();
            if (interfaceC1218d instanceof C1220f) {
                m2867a((C1220f) interfaceC1218d, i2, arrayList, null);
            } else if (interfaceC1218d instanceof AbstractC1229o) {
                m2867a(((AbstractC1229o) interfaceC1218d).f4819h, i2, arrayList, null);
            }
        }
        Iterator it2 = c1220f.f4797k.iterator();
        while (it2.hasNext()) {
            InterfaceC1218d interfaceC1218d2 = (InterfaceC1218d) it2.next();
            if (interfaceC1218d2 instanceof C1220f) {
                m2867a((C1220f) interfaceC1218d2, i2, arrayList, null);
            } else if (interfaceC1218d2 instanceof AbstractC1229o) {
                m2867a(((AbstractC1229o) interfaceC1218d2).f4820i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            Iterator it3 = ((C1227m) abstractC1229o).f4804k.f4797k.iterator();
            while (it3.hasNext()) {
                InterfaceC1218d interfaceC1218d3 = (InterfaceC1218d) it3.next();
                if (interfaceC1218d3 instanceof C1220f) {
                    m2867a((C1220f) interfaceC1218d3, i2, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m2872f(int i2, int i3, int i4, int i5, C1203d c1203d) {
        C1216b c1216b = this.f4785g;
        c1216b.f4767a = i2;
        c1216b.f4768b = i4;
        c1216b.f4769c = i3;
        c1216b.f4770d = i5;
        this.f4784f.m2934b(c1203d, c1216b);
        c1203d.m2807O(c1216b.f4771e);
        c1203d.m2804L(c1216b.f4772f);
        c1203d.f4605E = c1216b.f4774h;
        c1203d.m2801I(c1216b.f4773g);
    }

    /* renamed from: g */
    public final void m2873g() {
        C1215a c1215a;
        Iterator it = this.f4779a.f4681q0.iterator();
        while (it.hasNext()) {
            C1203d c1203d = (C1203d) it.next();
            if (!c1203d.f4627a) {
                int[] iArr = c1203d.f4658p0;
                boolean z2 = false;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = c1203d.f4660r;
                int i5 = c1203d.f4661s;
                boolean z3 = i2 == 2 || (i2 == 3 && i4 == 1);
                if (i3 == 2 || (i3 == 3 && i5 == 1)) {
                    z2 = true;
                }
                C1221g c1221g = c1203d.f4633d.f4816e;
                boolean z4 = c1221g.f4796j;
                C1221g c1221g2 = c1203d.f4635e.f4816e;
                boolean z5 = c1221g2.f4796j;
                boolean z6 = z3;
                if (z4 && z5) {
                    m2872f(1, c1221g.f4793g, 1, c1221g2.f4793g, c1203d);
                    c1203d.f4627a = true;
                } else if (z4 && z2) {
                    m2872f(1, c1221g.f4793g, 2, c1221g2.f4793g, c1203d);
                    if (i3 == 3) {
                        c1203d.f4635e.f4816e.f4799m = c1203d.m2818k();
                    } else {
                        c1203d.f4635e.f4816e.mo2876d(c1203d.m2818k());
                        c1203d.f4627a = true;
                    }
                } else if (z5 && z6) {
                    m2872f(2, c1221g.f4793g, 1, c1221g2.f4793g, c1203d);
                    if (i2 == 3) {
                        c1203d.f4633d.f4816e.f4799m = c1203d.m2822q();
                    } else {
                        c1203d.f4633d.f4816e.mo2876d(c1203d.m2822q());
                        c1203d.f4627a = true;
                    }
                }
                if (c1203d.f4627a && (c1215a = c1203d.f4635e.f4805l) != null) {
                    c1215a.mo2876d(c1203d.f4628a0);
                }
            }
        }
    }
}
