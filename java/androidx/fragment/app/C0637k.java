package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import p047Q1.AbstractC0458e;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public final class C0637k extends AbstractC0458e {

    /* renamed from: h */
    public final /* synthetic */ C0639m f2175h;

    /* renamed from: i */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0638l f2176i;

    public C0637k(DialogInterfaceOnCancelListenerC0638l dialogInterfaceOnCancelListenerC0638l, C0639m c0639m) {
        this.f2176i = dialogInterfaceOnCancelListenerC0638l;
        this.f2175h = c0639m;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: K */
    public final View mo1211K(int i2) {
        C0639m c0639m = this.f2175h;
        if (c0639m.mo1212N()) {
            return c0639m.mo1211K(i2);
        }
        Dialog dialog = this.f2176i.f2186a0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: N */
    public final boolean mo1212N() {
        return this.f2175h.mo1212N() || this.f2176i.f2189d0;
    }
}
