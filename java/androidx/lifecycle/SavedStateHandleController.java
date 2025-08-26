package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0681p {

    /* renamed from: a */
    public boolean f2304a;

    @Override // androidx.lifecycle.InterfaceC0681p
    /* renamed from: b */
    public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
        if (enumC0677l == EnumC0677l.ON_DESTROY) {
            this.f2304a = false;
            interfaceC0683r.mo1362d().m1704f(this);
        }
    }
}
