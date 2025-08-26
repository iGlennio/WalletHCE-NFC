package p088j;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p005C.AbstractC0044g;
import p086i.InterfaceC0905j;
import p086i.MenuC0907l;

/* renamed from: j.m1 */
/* loaded from: classes.dex */
public final class C1013m1 implements InterfaceC1014n, InterfaceC0905j {

    /* renamed from: a */
    public final /* synthetic */ Toolbar f4007a;

    public /* synthetic */ C1013m1(Toolbar toolbar) {
        this.f4007a = toolbar;
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: e */
    public void mo169e(MenuC0907l menuC0907l) {
        Toolbar toolbar = this.f4007a;
        C1005k c1005k = toolbar.f1797a.f1716t;
        if (c1005k == null || !c1005k.m2488i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1786G.f48c).iterator();
            if (it.hasNext()) {
                throw AbstractC0044g.m152d(it);
            }
        }
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: l */
    public boolean mo176l(MenuC0907l menuC0907l, MenuItem menuItem) {
        this.f4007a.getClass();
        return false;
    }
}
