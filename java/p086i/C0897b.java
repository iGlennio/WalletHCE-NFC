package p086i;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p088j.AbstractViewOnTouchListenerC0924A0;
import p088j.C0990f;
import p088j.C0993g;
import p088j.C0999i;
import p088j.C1005k;

/* renamed from: i.b */
/* loaded from: classes.dex */
public final class C0897b extends AbstractViewOnTouchListenerC0924A0 {

    /* renamed from: j */
    public final /* synthetic */ int f3614j = 0;

    /* renamed from: k */
    public final /* synthetic */ View f3615k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0897b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3615k = actionMenuItemView;
    }

    @Override // p088j.AbstractViewOnTouchListenerC0924A0
    /* renamed from: b */
    public final InterfaceC0893C mo2329b() {
        C0990f c0990f;
        switch (this.f3614j) {
            case 0:
                AbstractC0898c abstractC0898c = ((ActionMenuItemView) this.f3615k).f1630m;
                if (abstractC0898c == null || (c0990f = ((C0993g) abstractC0898c).f3927a.f3981u) == null) {
                    return null;
                }
                return c0990f.m2360a();
            default:
                C0990f c0990f2 = ((C0999i) this.f3615k).f3954d.f3980t;
                if (c0990f2 == null) {
                    return null;
                }
                return c0990f2.m2360a();
        }
    }

    @Override // p088j.AbstractViewOnTouchListenerC0924A0
    /* renamed from: c */
    public final boolean mo2330c() {
        InterfaceC0893C mo2329b;
        switch (this.f3614j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3615k;
                InterfaceC0906k interfaceC0906k = actionMenuItemView.f1628k;
                return interfaceC0906k != null && interfaceC0906k.mo1381c(actionMenuItemView.f1625h) && (mo2329b = mo2329b()) != null && mo2329b.mo2308b();
            default:
                ((C0999i) this.f3615k).f3954d.m2489o();
                return true;
        }
    }

    @Override // p088j.AbstractViewOnTouchListenerC0924A0
    /* renamed from: d */
    public boolean mo2331d() {
        switch (this.f3614j) {
            case 1:
                C1005k c1005k = ((C0999i) this.f3615k).f3954d;
                if (c1005k.f3982v != null) {
                    return false;
                }
                c1005k.m2487f();
                return true;
            default:
                return super.mo2331d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0897b(C0999i c0999i, C0999i c0999i2) {
        super(c0999i2);
        this.f3615k = c0999i;
    }
}
