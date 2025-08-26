package p084h0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.nfupay.s145.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p010D1.AbstractC0096d;
import p051S0.C0475j;

/* renamed from: h0.a */
/* loaded from: classes.dex */
public final class C0887a {

    /* renamed from: d */
    public static volatile C0887a f3570d;

    /* renamed from: e */
    public static final Object f3571e = new Object();

    /* renamed from: c */
    public final Context f3574c;

    /* renamed from: b */
    public final HashSet f3573b = new HashSet();

    /* renamed from: a */
    public final HashMap f3572a = new HashMap();

    public C0887a(Context context) {
        this.f3574c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C0887a m2305c(Context context) {
        if (f3570d == null) {
            synchronized (f3571e) {
                try {
                    if (f3570d == null) {
                        f3570d = new C0887a(context);
                    }
                } finally {
                }
            }
        }
        return f3570d;
    }

    /* renamed from: a */
    public final void m2306a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3574c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f3573b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0888b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m2307b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0475j(e2);
            }
        }
    }

    /* renamed from: b */
    public final Object m2307b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC0096d.m328L()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f3572a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0888b interfaceC0888b = (InterfaceC0888b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> mo1506a = interfaceC0888b.mo1506a();
                if (!mo1506a.isEmpty()) {
                    for (Class cls2 : mo1506a) {
                        if (!hashMap.containsKey(cls2)) {
                            m2307b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0888b.mo1507b(this.f3574c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new C0475j(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
