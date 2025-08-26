package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C0668c {

    /* renamed from: c */
    public static final C0668c f2309c = new C0668c();

    /* renamed from: a */
    public final HashMap f2310a = new HashMap();

    /* renamed from: b */
    public final HashMap f2311b = new HashMap();

    /* renamed from: b */
    public static void m1695b(HashMap hashMap, C0667b c0667b, EnumC0677l enumC0677l, Class cls) {
        EnumC0677l enumC0677l2 = (EnumC0677l) hashMap.get(c0667b);
        if (enumC0677l2 == null || enumC0677l == enumC0677l2) {
            if (enumC0677l2 == null) {
                hashMap.put(c0667b, enumC0677l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0667b.f2308b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0677l2 + ", new value " + enumC0677l);
    }

    /* renamed from: a */
    public final C0666a m1696a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f2310a;
        if (superclass != null) {
            C0666a c0666a = (C0666a) hashMap2.get(superclass);
            if (c0666a == null) {
                c0666a = m1696a(superclass, null);
            }
            hashMap.putAll(c0666a.f2306b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0666a c0666a2 = (C0666a) hashMap2.get(cls2);
            if (c0666a2 == null) {
                c0666a2 = m1696a(cls2, null);
            }
            for (Map.Entry entry : c0666a2.f2306b.entrySet()) {
                m1695b(hashMap, (C0667b) entry.getKey(), (EnumC0677l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            InterfaceC0690y interfaceC0690y = (InterfaceC0690y) method.getAnnotation(InterfaceC0690y.class);
            if (interfaceC0690y != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0683r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0677l value = interfaceC0690y.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0677l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0677l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1695b(hashMap, new C0667b(i2, method), value, cls);
                z2 = true;
            }
        }
        C0666a c0666a3 = new C0666a(hashMap);
        hashMap2.put(cls, c0666a3);
        this.f2311b.put(cls, Boolean.valueOf(z2));
        return c0666a3;
    }
}
