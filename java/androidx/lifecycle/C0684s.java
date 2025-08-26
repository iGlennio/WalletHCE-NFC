package androidx.lifecycle;

import p095l1.AbstractC1136c;

/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public final class C0684s {

    /* renamed from: a */
    public EnumC0678m f2321a;

    /* renamed from: b */
    public InterfaceC0681p f2322b;

    /* renamed from: a */
    public final void m1698a(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
        EnumC0678m m1697a = enumC0677l.m1697a();
        EnumC0678m enumC0678m = this.f2321a;
        AbstractC1136c.m2637e(enumC0678m, "state1");
        if (m1697a.compareTo(enumC0678m) < 0) {
            enumC0678m = m1697a;
        }
        this.f2321a = enumC0678m;
        this.f2322b.mo1348b(interfaceC0683r, enumC0677l);
        this.f2321a = m1697a;
    }
}
