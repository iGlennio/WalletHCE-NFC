package androidx.activity;

import android.window.OnBackInvokedCallback;
import p092k1.InterfaceC1103a;
import p092k1.InterfaceC1114l;
import p095l1.AbstractC1136c;

/* renamed from: androidx.activity.p */
/* loaded from: classes.dex */
public final class C0576p {

    /* renamed from: a */
    public static final C0576p f1604a = new C0576p();

    /* renamed from: a */
    public final OnBackInvokedCallback m1369a(InterfaceC1114l interfaceC1114l, InterfaceC1114l interfaceC1114l2, InterfaceC1103a interfaceC1103a, InterfaceC1103a interfaceC1103a2) {
        AbstractC1136c.m2637e(interfaceC1114l, "onBackStarted");
        AbstractC1136c.m2637e(interfaceC1114l2, "onBackProgressed");
        AbstractC1136c.m2637e(interfaceC1103a, "onBackInvoked");
        AbstractC1136c.m2637e(interfaceC1103a2, "onBackCancelled");
        return new C0575o(interfaceC1114l, interfaceC1114l2, interfaceC1103a, interfaceC1103a2);
    }
}
