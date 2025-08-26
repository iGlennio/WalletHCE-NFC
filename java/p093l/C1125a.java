package p093l;

import java.util.HashMap;

/* renamed from: l.a */
/* loaded from: classes.dex */
public final class C1125a extends C1130f {

    /* renamed from: e */
    public final HashMap f4309e = new HashMap();

    @Override // p093l.C1130f
    /* renamed from: a */
    public final C1127c mo2619a(Object obj) {
        return (C1127c) this.f4309e.get(obj);
    }

    @Override // p093l.C1130f
    /* renamed from: b */
    public final Object mo2620b(Object obj) {
        Object mo2620b = super.mo2620b(obj);
        this.f4309e.remove(obj);
        return mo2620b;
    }
}
