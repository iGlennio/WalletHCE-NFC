package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0681p {

    /* renamed from: a */
    public final InterfaceC0669d f2282a;

    /* renamed from: b */
    public final InterfaceC0681p f2283b;

    public DefaultLifecycleObserverAdapter(InterfaceC0669d interfaceC0669d, InterfaceC0681p interfaceC0681p) {
        this.f2282a = interfaceC0669d;
        this.f2283b = interfaceC0681p;
    }

    @Override // androidx.lifecycle.InterfaceC0681p
    /* renamed from: b */
    public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
        int i2 = AbstractC0670e.f2312a[enumC0677l.ordinal()];
        InterfaceC0669d interfaceC0669d = this.f2282a;
        if (i2 == 3) {
            interfaceC0669d.mo1508a();
        } else if (i2 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0681p interfaceC0681p = this.f2283b;
        if (interfaceC0681p != null) {
            interfaceC0681p.mo1348b(interfaceC0683r, enumC0677l);
        }
    }
}
