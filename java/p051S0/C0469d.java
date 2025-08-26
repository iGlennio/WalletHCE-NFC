package p051S0;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p034M0.C0360e;
import p055U0.C0494h;
import p055U0.C0496j;
import p057V0.AbstractC0529q;
import p057V0.C0514b;
import p057V0.C0515c;
import p057V0.C0516d;
import p057V0.C0519g;
import p057V0.C0520h;
import p057V0.C0526n;
import p057V0.C0527o;
import p063Y0.AbstractC0548b;
import p065Z0.C0551a;
import p068a1.C0559b;

/* renamed from: S0.d */
/* loaded from: classes.dex */
public final class C0469d {

    /* renamed from: a */
    public final ThreadLocal f1278a;

    /* renamed from: b */
    public final ConcurrentHashMap f1279b;

    /* renamed from: c */
    public final C0360e f1280c;

    /* renamed from: d */
    public final C0515c f1281d;

    /* renamed from: e */
    public final List f1282e;

    /* renamed from: f */
    public final boolean f1283f;

    public C0469d() {
        C0494h c0494h = C0494h.f1349c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f1278a = new ThreadLocal();
        this.f1279b = new ConcurrentHashMap();
        C0360e c0360e = new C0360e(20);
        this.f1280c = c0360e;
        this.f1283f = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC0529q.f1475z);
        arrayList.add(C0520h.f1418b);
        arrayList.add(c0494h);
        arrayList.addAll(list);
        arrayList.add(AbstractC0529q.f1465p);
        arrayList.add(AbstractC0529q.f1456g);
        arrayList.add(AbstractC0529q.f1453d);
        arrayList.add(AbstractC0529q.f1454e);
        arrayList.add(AbstractC0529q.f1455f);
        C0519g c0519g = AbstractC0529q.f1460k;
        arrayList.add(new C0527o(Long.TYPE, Long.class, c0519g));
        arrayList.add(new C0527o(Double.TYPE, Double.class, new C0466a(0)));
        arrayList.add(new C0527o(Float.TYPE, Float.class, new C0466a(1)));
        arrayList.add(C0519g.f1416b);
        arrayList.add(AbstractC0529q.f1457h);
        arrayList.add(AbstractC0529q.f1458i);
        arrayList.add(new C0526n(AtomicLong.class, new C0467b(new C0467b(c0519g, 0), 2), 0));
        arrayList.add(new C0526n(AtomicLongArray.class, new C0467b(new C0467b(c0519g, 1), 2), 0));
        arrayList.add(AbstractC0529q.f1459j);
        arrayList.add(AbstractC0529q.f1461l);
        arrayList.add(AbstractC0529q.f1466q);
        arrayList.add(AbstractC0529q.f1467r);
        arrayList.add(new C0526n(BigDecimal.class, AbstractC0529q.f1462m, 0));
        arrayList.add(new C0526n(BigInteger.class, AbstractC0529q.f1463n, 0));
        arrayList.add(new C0526n(C0496j.class, AbstractC0529q.f1464o, 0));
        arrayList.add(AbstractC0529q.f1468s);
        arrayList.add(AbstractC0529q.f1469t);
        arrayList.add(AbstractC0529q.f1471v);
        arrayList.add(AbstractC0529q.f1472w);
        arrayList.add(AbstractC0529q.f1474y);
        arrayList.add(AbstractC0529q.f1470u);
        arrayList.add(AbstractC0529q.f1451b);
        arrayList.add(C0516d.f1408b);
        arrayList.add(AbstractC0529q.f1473x);
        if (AbstractC0548b.f1509a) {
            arrayList.add(AbstractC0548b.f1511c);
            arrayList.add(AbstractC0548b.f1510b);
            arrayList.add(AbstractC0548b.f1512d);
        }
        arrayList.add(C0514b.f1402d);
        arrayList.add(AbstractC0529q.f1450a);
        arrayList.add(new C0515c(c0360e, 0));
        arrayList.add(new C0515c(c0360e, 2));
        C0515c c0515c = new C0515c(c0360e, 1);
        this.f1281d = c0515c;
        arrayList.add(c0515c);
        arrayList.add(AbstractC0529q.f1449A);
        arrayList.add(new C0526n(c0360e, c0494h, c0515c));
        this.f1282e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m1223a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1224b(java.lang.String r5, java.lang.Class r6) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051S0.C0469d.m1224b(java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* renamed from: c */
    public final AbstractC0477l m1225c(C0551a c0551a) {
        boolean z2;
        ConcurrentHashMap concurrentHashMap = this.f1279b;
        AbstractC0477l abstractC0477l = (AbstractC0477l) concurrentHashMap.get(c0551a);
        if (abstractC0477l != null) {
            return abstractC0477l;
        }
        ThreadLocal threadLocal = this.f1278a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z2 = true;
        } else {
            AbstractC0477l abstractC0477l2 = (AbstractC0477l) map.get(c0551a);
            if (abstractC0477l2 != null) {
                return abstractC0477l2;
            }
            z2 = false;
        }
        try {
            C0468c c0468c = new C0468c();
            AbstractC0477l abstractC0477l3 = null;
            c0468c.f1277a = null;
            map.put(c0551a, c0468c);
            Iterator it = this.f1282e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC0477l3 = ((InterfaceC0478m) it.next()).mo1231a(this, c0551a);
                if (abstractC0477l3 != null) {
                    if (c0468c.f1277a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c0468c.f1277a = abstractC0477l3;
                    map.put(c0551a, abstractC0477l3);
                }
            }
            if (z2) {
                threadLocal.remove();
            }
            if (abstractC0477l3 != null) {
                if (z2) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC0477l3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + c0551a);
        } catch (Throwable th) {
            if (z2) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final String m1226d(Object obj) {
        Class<?> cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            C0559b c0559b = new C0559b(stringWriter);
            c0559b.f1549f = this.f1283f;
            c0559b.f1548e = false;
            c0559b.f1551h = false;
            m1227e(obj, cls, c0559b);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new C0472g(e2);
        }
    }

    /* renamed from: e */
    public final void m1227e(Object obj, Class cls, C0559b c0559b) {
        AbstractC0477l m1225c = m1225c(new C0551a(cls));
        boolean z2 = c0559b.f1548e;
        c0559b.f1548e = true;
        boolean z3 = c0559b.f1549f;
        c0559b.f1549f = this.f1283f;
        boolean z4 = c0559b.f1551h;
        c0559b.f1551h = false;
        try {
            try {
                try {
                    m1225c.mo1222b(c0559b, obj);
                } catch (AssertionError e2) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
                }
            } catch (IOException e3) {
                throw new C0472g(e3);
            }
        } finally {
            c0559b.f1548e = z2;
            c0559b.f1549f = z3;
            c0559b.f1551h = z4;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f1282e + ",instanceCreators:" + this.f1280c + "}";
    }
}
