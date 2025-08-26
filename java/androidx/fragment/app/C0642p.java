package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0677l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import nfc.share.nfcshare.MainActivity;
import p005C.C0046i;
import p076e.AbstractActivityC0782f;
import p081g0.C0869d;
import p081g0.InterfaceC0868c;
import p095l1.AbstractC1136c;

/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public final class C0642p implements InterfaceC0868c {

    /* renamed from: a */
    public final /* synthetic */ int f2245a;

    /* renamed from: b */
    public final Object f2246b;

    public /* synthetic */ C0642p(MainActivity mainActivity, int i2) {
        this.f2245a = i2;
        this.f2246b = mainActivity;
    }

    @Override // p081g0.InterfaceC0868c
    /* renamed from: a */
    public final Bundle mo1354a() {
        C0046i c0046i;
        switch (this.f2245a) {
            case 0:
                Bundle bundle = new Bundle();
                MainActivity mainActivity = (MainActivity) this.f2246b;
                do {
                    c0046i = mainActivity.f3083p;
                } while (AbstractActivityC0782f.m2093k(((C0644r) c0046i.f116b).f2252k));
                mainActivity.f3084q.m1702d(EnumC0677l.ON_STOP);
                C0616F m1572P = ((C0644r) c0046i.f116b).f2252k.m1572P();
                if (m1572P != null) {
                    bundle.putParcelable("android:support:fragments", m1572P);
                }
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                ((MainActivity) this.f2246b).m2094i().getClass();
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2246b));
                return bundle3;
        }
    }

    public C0642p(C0869d c0869d) {
        this.f2245a = 2;
        AbstractC1136c.m2637e(c0869d, "registry");
        this.f2246b = new LinkedHashSet();
        c0869d.m2291e("androidx.savedstate.Restarter", this);
    }
}
