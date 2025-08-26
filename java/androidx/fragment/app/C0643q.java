package androidx.fragment.app;

import android.os.Bundle;
import nfc.share.nfcshare.MainActivity;
import p005C.C0046i;
import p066a.InterfaceC0553b;
import p076e.AbstractC0786j;
import p081g0.C0869d;

/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public final class C0643q implements InterfaceC0553b {

    /* renamed from: a */
    public final /* synthetic */ int f2247a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f2248b;

    public /* synthetic */ C0643q(MainActivity mainActivity, int i2) {
        this.f2247a = i2;
        this.f2248b = mainActivity;
    }

    @Override // p066a.InterfaceC0553b
    /* renamed from: a */
    public final void mo1301a() {
        switch (this.f2247a) {
            case 0:
                MainActivity mainActivity = this.f2248b;
                C0046i c0046i = mainActivity.f3083p;
                C0644r c0644r = (C0644r) c0046i.f116b;
                c0644r.f2252k.m1581b(c0644r, c0644r, null);
                Bundle m2289c = ((C0869d) mainActivity.f1584e.f1251c).m2289c("android:support:fragments");
                if (m2289c != null) {
                    ((C0644r) c0046i.f116b).f2252k.m1571O(m2289c.getParcelable("android:support:fragments"));
                    break;
                }
                break;
            default:
                MainActivity mainActivity2 = this.f2248b;
                AbstractC0786j m2094i = mainActivity2.m2094i();
                m2094i.mo2108a();
                ((C0869d) mainActivity2.f1584e.f1251c).m2289c("androidx:appcompat");
                m2094i.mo2110d();
                break;
        }
    }
}
