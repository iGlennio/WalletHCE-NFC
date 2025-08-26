package p086i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p005C.AbstractC0044g;

/* renamed from: i.E */
/* loaded from: classes.dex */
public class SubMenuC0895E extends MenuC0907l implements SubMenu {

    /* renamed from: A */
    public final C0909n f3596A;

    /* renamed from: z */
    public final MenuC0907l f3597z;

    public SubMenuC0895E(Context context, MenuC0907l menuC0907l, C0909n c0909n) {
        super(context);
        this.f3597z = menuC0907l;
        this.f3596A = c0909n;
    }

    @Override // p086i.MenuC0907l
    /* renamed from: d */
    public final boolean mo2320d(C0909n c0909n) {
        return this.f3597z.mo2320d(c0909n);
    }

    @Override // p086i.MenuC0907l
    /* renamed from: e */
    public final boolean mo2321e(MenuC0907l menuC0907l, MenuItem menuItem) {
        return super.mo2321e(menuC0907l, menuItem) || this.f3597z.mo2321e(menuC0907l, menuItem);
    }

    @Override // p086i.MenuC0907l
    /* renamed from: f */
    public final boolean mo2322f(C0909n c0909n) {
        return this.f3597z.mo2322f(c0909n);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3596A;
    }

    @Override // p086i.MenuC0907l
    /* renamed from: j */
    public final String mo2323j() {
        C0909n c0909n = this.f3596A;
        int i2 = c0909n != null ? c0909n.f3693a : 0;
        if (i2 == 0) {
            return null;
        }
        return AbstractC0044g.m153e("android:menu:actionviewstates:", i2);
    }

    @Override // p086i.MenuC0907l
    /* renamed from: k */
    public final MenuC0907l mo2324k() {
        return this.f3597z.mo2324k();
    }

    @Override // p086i.MenuC0907l
    /* renamed from: m */
    public final boolean mo2325m() {
        return this.f3597z.mo2325m();
    }

    @Override // p086i.MenuC0907l
    /* renamed from: n */
    public final boolean mo2326n() {
        return this.f3597z.mo2326n();
    }

    @Override // p086i.MenuC0907l
    /* renamed from: o */
    public final boolean mo2327o() {
        return this.f3597z.mo2327o();
    }

    @Override // p086i.MenuC0907l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3597z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m2348u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m2348u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m2348u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3596A.setIcon(drawable);
        return this;
    }

    @Override // p086i.MenuC0907l, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3597z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        m2348u(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        m2348u(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f3596A.setIcon(i2);
        return this;
    }
}
