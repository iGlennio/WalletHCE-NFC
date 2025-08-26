package p086i;

import p005C.C0046i;

/* renamed from: i.d */
/* loaded from: classes.dex */
public final class RunnableC0899d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0900e f3616a;

    /* renamed from: b */
    public final /* synthetic */ C0909n f3617b;

    /* renamed from: c */
    public final /* synthetic */ MenuC0907l f3618c;

    /* renamed from: d */
    public final /* synthetic */ C0046i f3619d;

    public RunnableC0899d(C0046i c0046i, C0900e c0900e, C0909n c0909n, MenuC0907l menuC0907l) {
        this.f3619d = c0046i;
        this.f3616a = c0900e;
        this.f3617b = c0909n;
        this.f3618c = menuC0907l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0900e c0900e = this.f3616a;
        if (c0900e != null) {
            C0046i c0046i = this.f3619d;
            ((ViewOnKeyListenerC0901f) c0046i.f116b).f3647z = true;
            c0900e.f3621b.m2339c(false);
            ((ViewOnKeyListenerC0901f) c0046i.f116b).f3647z = false;
        }
        C0909n c0909n = this.f3617b;
        if (c0909n.isEnabled() && c0909n.hasSubMenu()) {
            this.f3618c.m2344q(c0909n, null, 4);
        }
    }
}
