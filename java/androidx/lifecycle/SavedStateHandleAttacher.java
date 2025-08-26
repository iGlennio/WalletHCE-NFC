package androidx.lifecycle;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0681p {

    /* renamed from: a */
    public final C0660H f2303a;

    public SavedStateHandleAttacher(C0660H c0660h) {
        this.f2303a = c0660h;
    }

    @Override // androidx.lifecycle.InterfaceC0681p
    /* renamed from: b */
    public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
        if (enumC0677l != EnumC0677l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0677l).toString());
        }
        interfaceC0683r.mo1362d().m1704f(this);
        C0660H c0660h = this.f2303a;
        if (c0660h.f2292b) {
            return;
        }
        Bundle m2289c = c0660h.f2291a.m2289c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0660h.f2293c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (m2289c != null) {
            bundle.putAll(m2289c);
        }
        c0660h.f2293c = bundle;
        c0660h.f2292b = true;
    }
}
