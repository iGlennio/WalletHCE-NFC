package p088j;

import p086i.InterfaceC0893C;

/* renamed from: j.I */
/* loaded from: classes.dex */
public final class C0940I extends AbstractViewOnTouchListenerC0924A0 {

    /* renamed from: j */
    public final /* synthetic */ C0954P f3793j;

    /* renamed from: k */
    public final /* synthetic */ C0961T f3794k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0940I(C0961T c0961t, C0961T c0961t2, C0954P c0954p) {
        super(c0961t2);
        this.f3794k = c0961t;
        this.f3793j = c0954p;
    }

    @Override // p088j.AbstractViewOnTouchListenerC0924A0
    /* renamed from: b */
    public final InterfaceC0893C mo2329b() {
        return this.f3793j;
    }

    @Override // p088j.AbstractViewOnTouchListenerC0924A0
    /* renamed from: c */
    public final boolean mo2330c() {
        C0961T c0961t = this.f3794k;
        if (c0961t.getInternalPopup().mo2412b()) {
            return true;
        }
        c0961t.f3858f.mo2415e(AbstractC0944K.m2405b(c0961t), AbstractC0944K.m2404a(c0961t));
        return true;
    }
}
