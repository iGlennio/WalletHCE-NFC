package p116t;

import java.util.ArrayList;

/* renamed from: t.l */
/* loaded from: classes.dex */
public final class C1226l {

    /* renamed from: a */
    public AbstractC1229o f4802a;

    /* renamed from: b */
    public ArrayList f4803b;

    /* renamed from: a */
    public static long m2890a(C1220f c1220f, long j2) {
        AbstractC1229o abstractC1229o = c1220f.f4790d;
        if (abstractC1229o instanceof C1224j) {
            return j2;
        }
        ArrayList arrayList = c1220f.f4797k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1218d interfaceC1218d = (InterfaceC1218d) arrayList.get(i2);
            if (interfaceC1218d instanceof C1220f) {
                C1220f c1220f2 = (C1220f) interfaceC1218d;
                if (c1220f2.f4790d != abstractC1229o) {
                    j3 = Math.min(j3, m2890a(c1220f2, c1220f2.f4792f + j2));
                }
            }
        }
        if (c1220f != abstractC1229o.f4820i) {
            return j3;
        }
        long mo2863j = abstractC1229o.mo2863j();
        long j4 = j2 - mo2863j;
        return Math.min(Math.min(j3, m2890a(abstractC1229o.f4819h, j4)), j4 - r9.f4792f);
    }

    /* renamed from: b */
    public static long m2891b(C1220f c1220f, long j2) {
        AbstractC1229o abstractC1229o = c1220f.f4790d;
        if (abstractC1229o instanceof C1224j) {
            return j2;
        }
        ArrayList arrayList = c1220f.f4797k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1218d interfaceC1218d = (InterfaceC1218d) arrayList.get(i2);
            if (interfaceC1218d instanceof C1220f) {
                C1220f c1220f2 = (C1220f) interfaceC1218d;
                if (c1220f2.f4790d != abstractC1229o) {
                    j3 = Math.max(j3, m2891b(c1220f2, c1220f2.f4792f + j2));
                }
            }
        }
        if (c1220f != abstractC1229o.f4819h) {
            return j3;
        }
        long mo2863j = abstractC1229o.mo2863j();
        long j4 = j2 + mo2863j;
        return Math.max(Math.max(j3, m2891b(abstractC1229o.f4820i, j4)), j4 - r9.f4792f);
    }
}
