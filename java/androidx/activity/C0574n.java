package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p017G0.C0172d;
import p092k1.InterfaceC1103a;
import p095l1.AbstractC1136c;

/* renamed from: androidx.activity.n */
/* loaded from: classes.dex */
public final class C0574n {

    /* renamed from: a */
    public static final C0574n f1599a = new C0574n();

    /* renamed from: a */
    public final OnBackInvokedCallback m1366a(InterfaceC1103a interfaceC1103a) {
        AbstractC1136c.m2637e(interfaceC1103a, "onBackInvoked");
        return new C0172d(1, interfaceC1103a);
    }

    /* renamed from: b */
    public final void m1367b(Object obj, int i2, Object obj2) {
        AbstractC1136c.m2637e(obj, "dispatcher");
        AbstractC1136c.m2637e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: c */
    public final void m1368c(Object obj, Object obj2) {
        AbstractC1136c.m2637e(obj, "dispatcher");
        AbstractC1136c.m2637e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
