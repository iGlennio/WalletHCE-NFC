package p088j;

import android.content.Context;
import android.view.View;
import com.nfupay.s145.R;
import p005C.C0046i;
import p086i.AbstractC0915t;
import p086i.C0918w;
import p086i.MenuC0907l;
import p086i.SubMenuC0895E;

/* renamed from: j.f */
/* loaded from: classes.dex */
public final class C0990f extends C0918w {

    /* renamed from: l */
    public final /* synthetic */ int f3913l = 0;

    /* renamed from: m */
    public final /* synthetic */ C1005k f3914m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0990f(C1005k c1005k, Context context, MenuC0907l menuC0907l, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0907l, true);
        this.f3914m = c1005k;
        this.f3736f = 8388613;
        C0046i c0046i = c1005k.f3984x;
        this.f3738h = c0046i;
        AbstractC0915t abstractC0915t = this.f3739i;
        if (abstractC0915t != null) {
            abstractC0915t.mo2311k(c0046i);
        }
    }

    @Override // p086i.C0918w
    /* renamed from: c */
    public final void mo2362c() {
        switch (this.f3913l) {
            case 0:
                C1005k c1005k = this.f3914m;
                c1005k.f3981u = null;
                c1005k.f3985y = 0;
                super.mo2362c();
                break;
            default:
                C1005k c1005k2 = this.f3914m;
                MenuC0907l menuC0907l = c1005k2.f3963c;
                if (menuC0907l != null) {
                    menuC0907l.m2339c(true);
                }
                c1005k2.f3980t = null;
                super.mo2362c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0990f(C1005k c1005k, Context context, SubMenuC0895E subMenuC0895E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0895E, false);
        this.f3914m = c1005k;
        if ((subMenuC0895E.f3596A.f3716x & 32) != 32) {
            View view2 = c1005k.f3970j;
            this.f3735e = view2 == null ? (View) c1005k.f3968h : view2;
        }
        C0046i c0046i = c1005k.f3984x;
        this.f3738h = c0046i;
        AbstractC0915t abstractC0915t = this.f3739i;
        if (abstractC0915t != null) {
            abstractC0915t.mo2311k(c0046i);
        }
    }
}
