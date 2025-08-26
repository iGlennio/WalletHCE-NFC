package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import p005C.AbstractC0044g;
import p051S0.C0475j;
import p101o.C1161k;

/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public final class C0650x {

    /* renamed from: b */
    public static final C1161k f2268b = new C1161k();

    /* renamed from: a */
    public final /* synthetic */ C0615E f2269a;

    public C0650x(C0615E c0615e) {
        this.f2269a = c0615e;
    }

    /* renamed from: b */
    public static Class m1676b(ClassLoader classLoader, String str) {
        C1161k c1161k = f2268b;
        C1161k c1161k2 = (C1161k) c1161k.getOrDefault(classLoader, null);
        if (c1161k2 == null) {
            c1161k2 = new C1161k();
            c1161k.put(classLoader, c1161k2);
        }
        Class cls = (Class) c1161k2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1161k2.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class m1677c(ClassLoader classLoader, String str) {
        try {
            return m1676b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new C0475j(AbstractC0044g.m155g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new C0475j(AbstractC0044g.m155g("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    /* renamed from: a */
    public final AbstractComponentCallbacksC0641o m1678a(String str) {
        try {
            return (AbstractComponentCallbacksC0641o) m1677c(this.f2269a.f2049n.f2250i.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new C0475j(AbstractC0044g.m155g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new C0475j(AbstractC0044g.m155g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new C0475j(AbstractC0044g.m155g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new C0475j(AbstractC0044g.m155g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
