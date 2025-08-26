package p086i;

import android.view.MenuItem;

/* renamed from: i.q */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0912q implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    public final MenuItem.OnActionExpandListener f3723a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC0914s f3724b;

    public MenuItemOnActionExpandListenerC0912q(MenuItemC0914s menuItemC0914s, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3724b = menuItemC0914s;
        this.f3723a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3723a.onMenuItemActionCollapse(this.f3724b.m1642g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3723a.onMenuItemActionExpand(this.f3724b.m1642g(menuItem));
    }
}
