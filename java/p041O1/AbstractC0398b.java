package p041O1;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import p034M0.C0360e;
import p044P1.C0433a;
import p047Q1.AbstractC0458e;
import p047Q1.C0454a;
import p047Q1.C0455b;
import p047Q1.C0456c;
import p047Q1.C0457d;

/* renamed from: O1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0398b {

    /* renamed from: a */
    public static volatile int f1054a;

    /* renamed from: b */
    public static final C0456c f1055b = new C0456c();

    /* renamed from: c */
    public static final C0360e f1056c = new C0360e(8);

    /* renamed from: d */
    public static final boolean f1057d;

    /* renamed from: e */
    public static final String[] f1058e;

    /* renamed from: f */
    public static final String f1059f;

    static {
        String str;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        f1057d = str == null ? false : str.equalsIgnoreCase("true");
        f1058e = new String[]{"1.6", "1.7"};
        f1059f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    /* renamed from: a */
    public static final void m1053a() {
        LinkedHashSet linkedHashSet;
        try {
            try {
                try {
                    if (m1058f()) {
                        linkedHashSet = null;
                    } else {
                        linkedHashSet = m1054b();
                        m1061i(linkedHashSet);
                    }
                    StaticLoggerBinder.getSingleton();
                    f1054a = 3;
                    m1060h(linkedHashSet);
                    m1059g();
                } catch (Exception e2) {
                    f1054a = 2;
                    System.err.println("Failed to instantiate SLF4J LoggerFactory");
                    System.err.println("Reported exception:");
                    e2.printStackTrace();
                    throw new IllegalStateException("Unexpected initialization failure", e2);
                } catch (NoSuchMethodError e3) {
                    String message = e3.getMessage();
                    if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                        f1054a = 2;
                        AbstractC0458e.m1178R("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                        AbstractC0458e.m1178R("Your binding is version 1.5.5 or earlier.");
                        AbstractC0458e.m1178R("Upgrade your binding to version 1.6.x.");
                    }
                    throw e3;
                }
            } catch (NoClassDefFoundError e4) {
                String message2 = e4.getMessage();
                if (message2 == null || (!message2.contains("org/slf4j/impl/StaticLoggerBinder") && !message2.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    f1054a = 2;
                    System.err.println("Failed to instantiate SLF4J LoggerFactory");
                    System.err.println("Reported exception:");
                    e4.printStackTrace();
                    throw e4;
                }
                f1054a = 4;
                AbstractC0458e.m1178R("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                AbstractC0458e.m1178R("Defaulting to no-operation (NOP) logger implementation");
                AbstractC0458e.m1178R("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                m1059g();
            }
        } catch (Throwable th) {
            m1059g();
            throw th;
        }
    }

    /* renamed from: b */
    public static LinkedHashSet m1054b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = AbstractC0398b.class.getClassLoader();
            String str = f1059f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            e2.printStackTrace();
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public static ILoggerFactory m1055c() {
        if (f1054a == 0) {
            synchronized (AbstractC0398b.class) {
                try {
                    if (f1054a == 0) {
                        f1054a = 1;
                        m1053a();
                        if (f1054a == 3) {
                            m1062j();
                        }
                    }
                } finally {
                }
            }
        }
        int i2 = f1054a;
        if (i2 == 1) {
            return f1055b;
        }
        if (i2 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i2 == 4) {
            return f1056c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* renamed from: d */
    public static InterfaceC0397a m1056d(Class cls) {
        int i2;
        InterfaceC0397a m1057e = m1057e(cls.getName());
        if (f1057d) {
            C0457d c0457d = AbstractC0458e.f1252a;
            Class cls2 = null;
            if (c0457d == null) {
                if (AbstractC0458e.f1253b) {
                    c0457d = null;
                } else {
                    try {
                        c0457d = new C0457d();
                    } catch (SecurityException unused) {
                        c0457d = null;
                    }
                    AbstractC0458e.f1252a = c0457d;
                    AbstractC0458e.f1253b = true;
                }
            }
            if (c0457d != null) {
                Class[] classContext = c0457d.getClassContext();
                String name = AbstractC0458e.class.getName();
                int i3 = 0;
                while (i3 < classContext.length && !name.equals(classContext[i3].getName())) {
                    i3++;
                }
                if (i3 >= classContext.length || (i2 = i3 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i2];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                AbstractC0458e.m1178R("Detected logger name mismatch. Given name: \"" + m1057e.mo529c() + "\"; computed name: \"" + cls2.getName() + "\".");
                AbstractC0458e.m1178R("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return m1057e;
    }

    /* renamed from: e */
    public static InterfaceC0397a m1057e(String str) {
        return m1055c().mo1014a(str);
    }

    /* renamed from: f */
    public static boolean m1058f() {
        String str;
        try {
            str = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains("android");
    }

    /* renamed from: g */
    public static void m1059g() {
        C0456c c0456c = f1055b;
        synchronized (c0456c) {
            try {
                c0456c.f1249a = true;
                Iterator it = new ArrayList(((HashMap) c0456c.f1250b).values()).iterator();
                while (it.hasNext()) {
                    C0455b c0455b = (C0455b) it.next();
                    c0455b.f1243b = m1057e(c0455b.f1242a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) f1055b.f1251c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0433a c0433a = (C0433a) it2.next();
                if (c0433a != null) {
                    C0455b c0455b2 = c0433a.f1203a;
                    String str = c0455b2.f1242a;
                    if (c0455b2.f1243b == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c0455b2.f1243b instanceof C0454a)) {
                        if (!c0455b2.m1164e()) {
                            AbstractC0458e.m1178R(str);
                        } else if (c0455b2.m1164e()) {
                            try {
                                c0455b2.f1245d.invoke(c0455b2.f1243b, c0433a);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i3 = i2 + 1;
                if (i2 == 0) {
                    if (c0433a.f1203a.m1164e()) {
                        AbstractC0458e.m1178R("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC0458e.m1178R("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC0458e.m1178R("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(c0433a.f1203a.f1243b instanceof C0454a)) {
                        AbstractC0458e.m1178R("The following set of substitute loggers may have been accessed");
                        AbstractC0458e.m1178R("during the initialization phase. Logging calls during this");
                        AbstractC0458e.m1178R("phase were not honored. However, subsequent logging calls to these");
                        AbstractC0458e.m1178R("loggers will work as normally expected.");
                        AbstractC0458e.m1178R("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i3;
            }
            arrayList.clear();
        }
        C0456c c0456c2 = f1055b;
        ((HashMap) c0456c2.f1250b).clear();
        ((LinkedBlockingQueue) c0456c2.f1251c).clear();
    }

    /* renamed from: h */
    public static void m1060h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        AbstractC0458e.m1178R("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    /* renamed from: i */
    public static void m1061i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            AbstractC0458e.m1178R("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                AbstractC0458e.m1178R("Found binding in [" + ((URL) it.next()) + "]");
            }
            AbstractC0458e.m1178R("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: j */
    public static final void m1062j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z2 = false;
            for (String str2 : f1058e) {
                if (str.startsWith(str2)) {
                    z2 = true;
                }
            }
            if (z2) {
                return;
            }
            AbstractC0458e.m1178R("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f1058e).toString());
            AbstractC0458e.m1178R("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
            th.printStackTrace();
        }
    }
}
