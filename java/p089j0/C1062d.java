package p089j0;

import android.view.ViewGroup;
import p047Q1.AbstractC0458e;

/* renamed from: j0.d */
/* loaded from: classes.dex */
public final class C1062d extends AbstractC1072n {

    /* renamed from: a */
    public boolean f4153a = false;

    /* renamed from: b */
    public final ViewGroup f4154b;

    public C1062d(ViewGroup viewGroup) {
        this.f4154b = viewGroup;
    }

    @Override // p089j0.AbstractC1072n, p089j0.InterfaceC1069k
    /* renamed from: a */
    public final void mo2551a(AbstractC1071m abstractC1071m) {
        AbstractC0458e.m1184b0(this.f4154b, false);
        this.f4153a = true;
    }

    @Override // p089j0.AbstractC1072n, p089j0.InterfaceC1069k
    /* renamed from: b */
    public final void mo2552b() {
        AbstractC0458e.m1184b0(this.f4154b, false);
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: d */
    public final void mo2554d(AbstractC1071m abstractC1071m) {
        if (!this.f4153a) {
            AbstractC0458e.m1184b0(this.f4154b, false);
        }
        abstractC1071m.mo2573x(this);
    }

    @Override // p089j0.AbstractC1072n, p089j0.InterfaceC1069k
    /* renamed from: e */
    public final void mo2555e() {
        AbstractC0458e.m1184b0(this.f4154b, true);
    }
}
