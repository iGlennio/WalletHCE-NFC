package p086i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.fragment.app.AbstractC0632f;
import p011E.InterfaceMenuItemC0107a;
import p101o.C1161k;

/* renamed from: i.B */
/* loaded from: classes.dex */
public class MenuC0892B extends AbstractC0632f implements Menu {

    /* renamed from: c */
    public final MenuC0907l f3576c;

    public MenuC0892B(Context context, MenuC0907l menuC0907l) {
        super(context);
        if (menuC0907l == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f3576c = menuC0907l;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1642g(this.f3576c.m2337a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f3576c.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = m1642g(menuItemArr2[i6]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f3576c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C1161k c1161k = (C1161k) this.f2167b;
        if (c1161k != null) {
            c1161k.clear();
        }
        this.f3576c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f3576c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        return m1642g(this.f3576c.findItem(i2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return m1642g(this.f3576c.getItem(i2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f3576c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f3576c.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return this.f3576c.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f3576c.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        if (((C1161k) this.f2167b) != null) {
            int i3 = 0;
            while (true) {
                C1161k c1161k = (C1161k) this.f2167b;
                if (i3 >= c1161k.f4422c) {
                    break;
                }
                if (((InterfaceMenuItemC0107a) c1161k.m2683h(i3)).getGroupId() == i2) {
                    ((C1161k) this.f2167b).m2684i(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f3576c.removeGroup(i2);
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        if (((C1161k) this.f2167b) != null) {
            int i3 = 0;
            while (true) {
                C1161k c1161k = (C1161k) this.f2167b;
                if (i3 >= c1161k.f4422c) {
                    break;
                }
                if (((InterfaceMenuItemC0107a) c1161k.m2683h(i3)).getItemId() == i2) {
                    ((C1161k) this.f2167b).m2684i(i3);
                    break;
                }
                i3++;
            }
        }
        this.f3576c.removeItem(i2);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.f3576c.setGroupCheckable(i2, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        this.f3576c.setGroupEnabled(i2, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        this.f3576c.setGroupVisible(i2, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3576c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3576c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return this.f3576c.addSubMenu(i2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m1642g(this.f3576c.add(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return this.f3576c.addSubMenu(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m1642g(this.f3576c.m2337a(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return this.f3576c.addSubMenu(i2, i3, i4, i5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m1642g(this.f3576c.add(i2, i3, i4, i5));
    }
}
