package p057V0;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005C.AbstractC0044g;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p055U0.C0500n;
import p065Z0.C0551a;
import p068a1.C0558a;
import p068a1.C0559b;
import p107q.AbstractC1181e;

/* renamed from: V0.h */
/* loaded from: classes.dex */
public final class C0520h extends AbstractC0477l {

    /* renamed from: b */
    public static final C0513a f1418b = new C0513a(2);

    /* renamed from: a */
    public final C0469d f1419a;

    public C0520h(C0469d c0469d) {
        this.f1419a = c0469d;
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        Object arrayList;
        Serializable arrayList2;
        int m1303B = c0558a.m1303B();
        int m2740a = AbstractC1181e.m2740a(m1303B);
        if (m2740a == 0) {
            c0558a.m1311g();
            arrayList = new ArrayList();
        } else if (m2740a != 2) {
            arrayList = null;
        } else {
            c0558a.m1312h();
            arrayList = new C0500n(true);
        }
        if (arrayList == null) {
            return m1283c(c0558a, m1303B);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c0558a.m1319o()) {
                String m1326v = arrayList instanceof Map ? c0558a.m1326v() : null;
                int m1303B2 = c0558a.m1303B();
                int m2740a2 = AbstractC1181e.m2740a(m1303B2);
                if (m2740a2 == 0) {
                    c0558a.m1311g();
                    arrayList2 = new ArrayList();
                } else if (m2740a2 != 2) {
                    arrayList2 = null;
                } else {
                    c0558a.m1312h();
                    arrayList2 = new C0500n(true);
                }
                boolean z2 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m1283c(c0558a, m1303B2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(m1326v, arrayList2);
                }
                if (z2) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c0558a.m1315k();
                } else {
                    c0558a.m1316l();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        if (obj == null) {
            c0559b.m1339o();
            return;
        }
        Class<?> cls = obj.getClass();
        C0469d c0469d = this.f1419a;
        c0469d.getClass();
        AbstractC0477l m1225c = c0469d.m1225c(new C0551a(cls));
        if (!(m1225c instanceof C0520h)) {
            m1225c.mo1222b(c0559b, obj);
        } else {
            c0559b.m1333i();
            c0559b.m1336l();
        }
    }

    /* renamed from: c */
    public final Serializable m1283c(C0558a c0558a, int i2) {
        int m2740a = AbstractC1181e.m2740a(i2);
        if (m2740a == 5) {
            return c0558a.m1330z();
        }
        if (m2740a == 6) {
            return Double.valueOf(c0558a.m1323s());
        }
        if (m2740a == 7) {
            return Boolean.valueOf(c0558a.m1322r());
        }
        if (m2740a != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0044g.m160l(i2)));
        }
        c0558a.m1328x();
        return null;
    }
}
