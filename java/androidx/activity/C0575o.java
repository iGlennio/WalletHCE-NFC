package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p092k1.InterfaceC1103a;
import p092k1.InterfaceC1114l;
import p095l1.AbstractC1136c;

/* renamed from: androidx.activity.o */
/* loaded from: classes.dex */
public final class C0575o implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1114l f1600a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1114l f1601b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC1103a f1602c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC1103a f1603d;

    public C0575o(InterfaceC1114l interfaceC1114l, InterfaceC1114l interfaceC1114l2, InterfaceC1103a interfaceC1103a, InterfaceC1103a interfaceC1103a2) {
        this.f1600a = interfaceC1114l;
        this.f1601b = interfaceC1114l2;
        this.f1602c = interfaceC1103a;
        this.f1603d = interfaceC1103a2;
    }

    public final void onBackCancelled() {
        this.f1603d.mo259a();
    }

    public final void onBackInvoked() {
        this.f1602c.mo259a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC1136c.m2637e(backEvent, "backEvent");
        this.f1601b.mo1365b(new C0562b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC1136c.m2637e(backEvent, "backEvent");
        this.f1600a.mo1365b(new C0562b(backEvent));
    }
}
