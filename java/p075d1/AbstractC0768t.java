package p075d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p047Q1.AbstractC0458e;
import p072c1.C0697a;
import p095l1.AbstractC1136c;

/* renamed from: d1.t */
/* loaded from: classes.dex */
public abstract class AbstractC0768t extends AbstractC0458e {
    /* renamed from: e0 */
    public static int m2059e0(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: f0 */
    public static Map m2060f0(ArrayList arrayList) {
        C0766r c0766r = C0766r.f2997a;
        int size = arrayList.size();
        if (size == 0) {
            return c0766r;
        }
        if (size == 1) {
            C0697a c0697a = (C0697a) arrayList.get(0);
            AbstractC1136c.m2637e(c0697a, "pair");
            Map singletonMap = Collections.singletonMap(c0697a.f2477a, c0697a.f2478b);
            AbstractC1136c.m2636d(singletonMap, "singletonMap(pair.first, pair.second)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m2059e0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0697a c0697a2 = (C0697a) it.next();
            linkedHashMap.put(c0697a2.f2477a, c0697a2.f2478b);
        }
        return linkedHashMap;
    }
}
