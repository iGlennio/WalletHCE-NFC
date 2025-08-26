package p057V0;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import p051S0.C0472g;
import p055U0.InterfaceC0501o;
import p061X0.AbstractC0545c;
import p068a1.C0558a;

/* renamed from: V0.k */
/* loaded from: classes.dex */
public final class C0523k extends AbstractC0522j {

    /* renamed from: b */
    public final InterfaceC0501o f1433b;

    public C0523k(InterfaceC0501o interfaceC0501o, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f1433b = interfaceC0501o;
    }

    @Override // p057V0.AbstractC0522j
    /* renamed from: c */
    public final Object mo1285c() {
        return this.f1433b.mo178n();
    }

    @Override // p057V0.AbstractC0522j
    /* renamed from: e */
    public final void mo1287e(Object obj, C0558a c0558a, C0521i c0521i) {
        Object mo1221a = c0521i.f1427h.mo1221a(c0558a);
        if (mo1221a == null && c0521i.f1430k) {
            return;
        }
        Field field = c0521i.f1421b;
        if (!c0521i.f1431l) {
            field.set(obj, mo1221a);
            return;
        }
        throw new C0472g("Cannot set value of 'static final' " + AbstractC0545c.m1299d(field, false));
    }

    @Override // p057V0.AbstractC0522j
    /* renamed from: d */
    public final Object mo1286d(Object obj) {
        return obj;
    }
}
