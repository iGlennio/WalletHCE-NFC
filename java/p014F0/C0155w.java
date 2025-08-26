package p014F0;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import p005C.C0041d;
import p027K.AbstractC0272P;
import p027K.C0315q0;
import p027K.C0319s0;
import p027K.InterfaceC0314q;
import p086i.InterfaceC0905j;
import p086i.MenuC0907l;

/* renamed from: F0.w */
/* loaded from: classes.dex */
public final class C0155w implements InterfaceC0314q, InterfaceC0905j {

    /* renamed from: a */
    public final /* synthetic */ NavigationView f472a;

    public /* synthetic */ C0155w(NavigationView navigationView) {
        this.f472a = navigationView;
    }

    @Override // p027K.InterfaceC0314q
    /* renamed from: d */
    public C0319s0 mo63d(View view, C0319s0 c0319s0) {
        NavigationView navigationView = this.f472a;
        if (navigationView.f474b == null) {
            navigationView.f474b = new Rect();
        }
        navigationView.f474b.set(c0319s0.m938b(), c0319s0.m940d(), c0319s0.m939c(), c0319s0.m937a());
        C0152t c0152t = navigationView.f2748i;
        c0152t.getClass();
        int m940d = c0319s0.m940d();
        if (c0152t.f471z != m940d) {
            c0152t.f471z = m940d;
            int i2 = (c0152t.f447b.getChildCount() <= 0 && c0152t.f469x) ? c0152t.f471z : 0;
            NavigationMenuView navigationMenuView = c0152t.f446a;
            navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = c0152t.f446a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, c0319s0.m937a());
        AbstractC0272P.m812b(c0152t.f447b, c0319s0);
        C0315q0 c0315q0 = c0319s0.f855a;
        navigationView.setWillNotDraw(c0315q0.mo901j().equals(C0041d.f106e) || navigationView.f473a == null);
        navigationView.postInvalidateOnAnimation();
        return c0315q0.mo917c();
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: l */
    public boolean mo176l(MenuC0907l menuC0907l, MenuItem menuItem) {
        this.f472a.getClass();
        return false;
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: e */
    public void mo169e(MenuC0907l menuC0907l) {
    }
}
