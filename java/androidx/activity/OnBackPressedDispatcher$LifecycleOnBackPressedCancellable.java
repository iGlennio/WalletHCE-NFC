package androidx.activity;

import androidx.fragment.app.C0649w;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0677l;
import androidx.lifecycle.InterfaceC0681p;
import androidx.lifecycle.InterfaceC0683r;
import p095l1.AbstractC1136c;

/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0681p, InterfaceC0563c {

    /* renamed from: a */
    public final C0685t f1557a;

    /* renamed from: b */
    public final C0649w f1558b;

    /* renamed from: c */
    public C0577q f1559c;

    /* renamed from: d */
    public final /* synthetic */ C0581s f1560d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0581s c0581s, C0685t c0685t, C0649w c0649w) {
        AbstractC1136c.m2637e(c0649w, "onBackPressedCallback");
        this.f1560d = c0581s;
        this.f1557a = c0685t;
        this.f1558b = c0649w;
        c0685t.m1699a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0681p
    /* renamed from: b */
    public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
        if (enumC0677l != EnumC0677l.ON_START) {
            if (enumC0677l != EnumC0677l.ON_STOP) {
                if (enumC0677l == EnumC0677l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0577q c0577q = this.f1559c;
                if (c0577q != null) {
                    c0577q.cancel();
                    return;
                }
                return;
            }
        }
        C0581s c0581s = this.f1560d;
        c0581s.getClass();
        C0649w c0649w = this.f1558b;
        AbstractC1136c.m2637e(c0649w, "onBackPressedCallback");
        c0581s.f1617b.m2044a(c0649w);
        C0577q c0577q2 = new C0577q(c0581s, c0649w);
        c0649w.f2265b.add(c0577q2);
        c0581s.m1374d();
        c0649w.f2266c = new C0578r(1, c0581s);
        this.f1559c = c0577q2;
    }

    @Override // androidx.activity.InterfaceC0563c
    public final void cancel() {
        this.f1557a.m1704f(this);
        this.f1558b.f2265b.remove(this);
        C0577q c0577q = this.f1559c;
        if (c0577q != null) {
            c0577q.cancel();
        }
        this.f1559c = null;
    }
}
