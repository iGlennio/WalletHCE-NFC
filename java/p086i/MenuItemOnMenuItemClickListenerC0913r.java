package p086i;

import android.view.MenuItem;

/* renamed from: i.r */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0913r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final MenuItem.OnMenuItemClickListener f3725a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC0914s f3726b;

    public MenuItemOnMenuItemClickListenerC0913r(MenuItemC0914s menuItemC0914s, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3726b = menuItemC0914s;
        this.f3725a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3725a.onMenuItemClick(this.f3726b.m1642g(menuItem));
    }
}
