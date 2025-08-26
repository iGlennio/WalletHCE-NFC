package androidx.activity;

import androidx.fragment.app.C0649w;
import p075d1.C0755g;
import p095l1.AbstractC1136c;

/* renamed from: androidx.activity.q */
/* loaded from: classes.dex */
public final class C0577q implements InterfaceC0563c {

    /* renamed from: a */
    public final C0649w f1605a;

    /* renamed from: b */
    public final /* synthetic */ C0581s f1606b;

    public C0577q(C0581s c0581s, C0649w c0649w) {
        AbstractC1136c.m2637e(c0649w, "onBackPressedCallback");
        this.f1606b = c0581s;
        this.f1605a = c0649w;
    }

    @Override // androidx.activity.InterfaceC0563c
    public final void cancel() {
        C0581s c0581s = this.f1606b;
        C0755g c0755g = c0581s.f1617b;
        C0649w c0649w = this.f1605a;
        c0755g.remove(c0649w);
        if (AbstractC1136c.m2633a(c0581s.f1618c, c0649w)) {
            c0649w.getClass();
            c0581s.f1618c = null;
        }
        c0649w.f2265b.remove(this);
        C0578r c0578r = c0649w.f2266c;
        if (c0578r != null) {
            c0578r.mo259a();
        }
        c0649w.f2266c = null;
    }
}
