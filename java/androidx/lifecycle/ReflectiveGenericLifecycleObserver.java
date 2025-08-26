package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0681p {

    /* renamed from: a */
    public final InterfaceC0682q f2301a;

    /* renamed from: b */
    public final C0666a f2302b;

    public ReflectiveGenericLifecycleObserver(InterfaceC0682q interfaceC0682q) {
        this.f2301a = interfaceC0682q;
        C0668c c0668c = C0668c.f2309c;
        Class<?> cls = interfaceC0682q.getClass();
        C0666a c0666a = (C0666a) c0668c.f2310a.get(cls);
        this.f2302b = c0666a == null ? c0668c.m1696a(cls, null) : c0666a;
    }

    @Override // androidx.lifecycle.InterfaceC0681p
    /* renamed from: b */
    public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
        HashMap hashMap = this.f2302b.f2305a;
        List list = (List) hashMap.get(enumC0677l);
        InterfaceC0682q interfaceC0682q = this.f2301a;
        C0666a.m1694a(list, interfaceC0683r, enumC0677l, interfaceC0682q);
        C0666a.m1694a((List) hashMap.get(EnumC0677l.ON_ANY), interfaceC0683r, enumC0677l, interfaceC0682q);
    }
}
