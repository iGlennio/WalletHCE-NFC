package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C0666a {

    /* renamed from: a */
    public final HashMap f2305a = new HashMap();

    /* renamed from: b */
    public final HashMap f2306b;

    public C0666a(HashMap hashMap) {
        this.f2306b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0677l enumC0677l = (EnumC0677l) entry.getValue();
            List list = (List) this.f2305a.get(enumC0677l);
            if (list == null) {
                list = new ArrayList();
                this.f2305a.put(enumC0677l, list);
            }
            list.add((C0667b) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m1694a(List list, InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l, InterfaceC0682q interfaceC0682q) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0667b c0667b = (C0667b) list.get(size);
                c0667b.getClass();
                try {
                    int i2 = c0667b.f2307a;
                    Method method = c0667b.f2308b;
                    if (i2 == 0) {
                        method.invoke(interfaceC0682q, new Object[0]);
                    } else if (i2 == 1) {
                        method.invoke(interfaceC0682q, interfaceC0683r);
                    } else if (i2 == 2) {
                        method.invoke(interfaceC0682q, interfaceC0683r, enumC0677l);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
