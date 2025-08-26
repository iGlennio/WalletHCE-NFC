package p080f1;

import p082g1.C0872b;
import p085h1.C0890b;
import p095l1.AbstractC1136c;

/* renamed from: f1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0865c {

    /* renamed from: a */
    public static final C0864b f3495a;

    static {
        C0864b c0864b;
        Object newInstance;
        try {
            newInstance = C0890b.class.newInstance();
            AbstractC1136c.m2636d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
        } catch (ClassNotFoundException unused) {
            Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            AbstractC1136c.m2636d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c0864b = (C0864b) newInstance2;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader2 = C0864b.class.getClassLoader();
                    if (AbstractC1136c.m2633a(classLoader, classLoader2)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e2);
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                AbstractC1136c.m2636d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    c0864b = (C0864b) newInstance3;
                } catch (ClassCastException e3) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = C0864b.class.getClassLoader();
                    if (AbstractC1136c.m2633a(classLoader3, classLoader4)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e3);
                }
            }
        }
        try {
            try {
                c0864b = (C0864b) newInstance;
            } catch (ClassNotFoundException unused3) {
                Object newInstance4 = C0872b.class.newInstance();
                AbstractC1136c.m2636d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        c0864b = (C0864b) newInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C0864b.class.getClassLoader();
                        if (AbstractC1136c.m2633a(classLoader5, classLoader6)) {
                            throw e4;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e4);
                    }
                } catch (ClassNotFoundException unused4) {
                    c0864b = new C0864b();
                }
            }
            f3495a = c0864b;
        } catch (ClassCastException e5) {
            ClassLoader classLoader7 = newInstance.getClass().getClassLoader();
            ClassLoader classLoader8 = C0864b.class.getClassLoader();
            if (AbstractC1136c.m2633a(classLoader7, classLoader8)) {
                throw e5;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e5);
        }
    }
}
