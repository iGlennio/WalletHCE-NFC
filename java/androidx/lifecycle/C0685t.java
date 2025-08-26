package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p005C.AbstractC0044g;
import p090k.C1085a;
import p093l.C1125a;
import p093l.C1127c;
import p095l1.AbstractC1136c;

/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public final class C0685t {

    /* renamed from: a */
    public final boolean f2323a;

    /* renamed from: b */
    public C1125a f2324b;

    /* renamed from: c */
    public EnumC0678m f2325c;

    /* renamed from: d */
    public final WeakReference f2326d;

    /* renamed from: e */
    public int f2327e;

    /* renamed from: f */
    public boolean f2328f;

    /* renamed from: g */
    public boolean f2329g;

    /* renamed from: h */
    public final ArrayList f2330h;

    public C0685t(InterfaceC0683r interfaceC0683r) {
        new AtomicReference();
        this.f2323a = true;
        this.f2324b = new C1125a();
        this.f2325c = EnumC0678m.f2315b;
        this.f2330h = new ArrayList();
        this.f2326d = new WeakReference(interfaceC0683r);
    }

    /* renamed from: a */
    public final void m1699a(InterfaceC0682q interfaceC0682q) {
        InterfaceC0681p reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0683r interfaceC0683r;
        ArrayList arrayList = this.f2330h;
        m1701c("addObserver");
        EnumC0678m enumC0678m = this.f2325c;
        EnumC0678m enumC0678m2 = EnumC0678m.f2314a;
        if (enumC0678m != enumC0678m2) {
            enumC0678m2 = EnumC0678m.f2315b;
        }
        C0684s c0684s = new C0684s();
        HashMap hashMap = AbstractC0686u.f2331a;
        boolean z2 = interfaceC0682q instanceof InterfaceC0681p;
        boolean z3 = interfaceC0682q instanceof InterfaceC0669d;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0669d) interfaceC0682q, (InterfaceC0681p) interfaceC0682q);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0669d) interfaceC0682q, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (InterfaceC0681p) interfaceC0682q;
        } else {
            Class<?> cls = interfaceC0682q.getClass();
            if (AbstractC0686u.m1708b(cls) == 2) {
                Object obj2 = AbstractC0686u.f2332b.get(cls);
                AbstractC1136c.m2634b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0686u.m1707a((Constructor) list.get(0), interfaceC0682q);
                    throw null;
                }
                int size = list.size();
                InterfaceC0672g[] interfaceC0672gArr = new InterfaceC0672g[size];
                if (size > 0) {
                    AbstractC0686u.m1707a((Constructor) list.get(0), interfaceC0682q);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0672gArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0682q);
            }
        }
        c0684s.f2322b = reflectiveGenericLifecycleObserver;
        c0684s.f2321a = enumC0678m2;
        C1125a c1125a = this.f2324b;
        C1127c mo2619a = c1125a.mo2619a(interfaceC0682q);
        if (mo2619a != null) {
            obj = mo2619a.f4314b;
        } else {
            HashMap hashMap2 = c1125a.f4309e;
            C1127c c1127c = new C1127c(interfaceC0682q, c0684s);
            c1125a.f4323d++;
            C1127c c1127c2 = c1125a.f4321b;
            if (c1127c2 == null) {
                c1125a.f4320a = c1127c;
                c1125a.f4321b = c1127c;
            } else {
                c1127c2.f4315c = c1127c;
                c1127c.f4316d = c1127c2;
                c1125a.f4321b = c1127c;
            }
            hashMap2.put(interfaceC0682q, c1127c);
            obj = null;
        }
        if (((C0684s) obj) == null && (interfaceC0683r = (InterfaceC0683r) this.f2326d.get()) != null) {
            boolean z4 = this.f2327e != 0 || this.f2328f;
            EnumC0678m m1700b = m1700b(interfaceC0682q);
            this.f2327e++;
            while (c0684s.f2321a.compareTo(m1700b) < 0 && this.f2324b.f4309e.containsKey(interfaceC0682q)) {
                arrayList.add(c0684s.f2321a);
                C0675j c0675j = EnumC0677l.Companion;
                EnumC0678m enumC0678m3 = c0684s.f2321a;
                c0675j.getClass();
                AbstractC1136c.m2637e(enumC0678m3, "state");
                int ordinal = enumC0678m3.ordinal();
                EnumC0677l enumC0677l = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0677l.ON_RESUME : EnumC0677l.ON_START : EnumC0677l.ON_CREATE;
                if (enumC0677l == null) {
                    throw new IllegalStateException("no event up from " + c0684s.f2321a);
                }
                c0684s.m1698a(interfaceC0683r, enumC0677l);
                arrayList.remove(arrayList.size() - 1);
                m1700b = m1700b(interfaceC0682q);
            }
            if (!z4) {
                m1706h();
            }
            this.f2327e--;
        }
    }

    /* renamed from: b */
    public final EnumC0678m m1700b(InterfaceC0682q interfaceC0682q) {
        HashMap hashMap = this.f2324b.f4309e;
        C1127c c1127c = hashMap.containsKey(interfaceC0682q) ? ((C1127c) hashMap.get(interfaceC0682q)).f4316d : null;
        EnumC0678m enumC0678m = c1127c != null ? ((C0684s) c1127c.f4314b).f2321a : null;
        ArrayList arrayList = this.f2330h;
        EnumC0678m enumC0678m2 = arrayList.isEmpty() ? null : (EnumC0678m) arrayList.get(arrayList.size() - 1);
        EnumC0678m enumC0678m3 = this.f2325c;
        AbstractC1136c.m2637e(enumC0678m3, "state1");
        if (enumC0678m == null || enumC0678m.compareTo(enumC0678m3) >= 0) {
            enumC0678m = enumC0678m3;
        }
        return (enumC0678m2 == null || enumC0678m2.compareTo(enumC0678m) >= 0) ? enumC0678m : enumC0678m2;
    }

    /* renamed from: c */
    public final void m1701c(String str) {
        if (this.f2323a) {
            ((C1085a) C1085a.m2613e0().f4225h).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0044g.m155g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: d */
    public final void m1702d(EnumC0677l enumC0677l) {
        AbstractC1136c.m2637e(enumC0677l, "event");
        m1701c("handleLifecycleEvent");
        m1703e(enumC0677l.m1697a());
    }

    /* renamed from: e */
    public final void m1703e(EnumC0678m enumC0678m) {
        EnumC0678m enumC0678m2 = this.f2325c;
        if (enumC0678m2 == enumC0678m) {
            return;
        }
        EnumC0678m enumC0678m3 = EnumC0678m.f2315b;
        EnumC0678m enumC0678m4 = EnumC0678m.f2314a;
        if (enumC0678m2 == enumC0678m3 && enumC0678m == enumC0678m4) {
            throw new IllegalStateException(("no event down from " + this.f2325c + " in component " + this.f2326d.get()).toString());
        }
        this.f2325c = enumC0678m;
        if (this.f2328f || this.f2327e != 0) {
            this.f2329g = true;
            return;
        }
        this.f2328f = true;
        m1706h();
        this.f2328f = false;
        if (this.f2325c == enumC0678m4) {
            this.f2324b = new C1125a();
        }
    }

    /* renamed from: f */
    public final void m1704f(InterfaceC0682q interfaceC0682q) {
        m1701c("removeObserver");
        this.f2324b.mo2620b(interfaceC0682q);
    }

    /* renamed from: g */
    public final void m1705g() {
        EnumC0678m enumC0678m = EnumC0678m.f2316c;
        m1701c("setCurrentState");
        m1703e(enumC0678m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f2329g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1706h() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0685t.m1706h():void");
    }
}
