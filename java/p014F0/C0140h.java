package p014F0;

import android.view.SubMenu;
import p086i.C0909n;
import p086i.MenuC0907l;

/* renamed from: F0.h */
/* loaded from: classes.dex */
public final class C0140h extends MenuC0907l {
    @Override // p086i.MenuC0907l, android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C0909n m2337a = m2337a(i2, i3, i4, charSequence);
        C0153u c0153u = new C0153u(this.f3663a, this, m2337a);
        m2337a.f3707o = c0153u;
        c0153u.setHeaderTitle(m2337a.f3697e);
        return c0153u;
    }
}
