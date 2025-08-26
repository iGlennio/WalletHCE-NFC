package p086i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p005C.C0046i;
import p008D.AbstractC0087a;
import p010D1.AbstractC0104l;
import p011E.InterfaceMenuItemC0107a;

/* renamed from: i.n */
/* loaded from: classes.dex */
public final class C0909n implements InterfaceMenuItemC0107a {

    /* renamed from: A */
    public ActionProviderVisibilityListenerC0910o f3690A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f3691B;

    /* renamed from: a */
    public final int f3693a;

    /* renamed from: b */
    public final int f3694b;

    /* renamed from: c */
    public final int f3695c;

    /* renamed from: d */
    public final int f3696d;

    /* renamed from: e */
    public CharSequence f3697e;

    /* renamed from: f */
    public CharSequence f3698f;

    /* renamed from: g */
    public Intent f3699g;

    /* renamed from: h */
    public char f3700h;

    /* renamed from: j */
    public char f3702j;

    /* renamed from: l */
    public Drawable f3704l;

    /* renamed from: n */
    public final MenuC0907l f3706n;

    /* renamed from: o */
    public SubMenuC0895E f3707o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f3708p;

    /* renamed from: q */
    public CharSequence f3709q;

    /* renamed from: r */
    public CharSequence f3710r;

    /* renamed from: y */
    public int f3717y;

    /* renamed from: z */
    public View f3718z;

    /* renamed from: i */
    public int f3701i = 4096;

    /* renamed from: k */
    public int f3703k = 4096;

    /* renamed from: m */
    public int f3705m = 0;

    /* renamed from: s */
    public ColorStateList f3711s = null;

    /* renamed from: t */
    public PorterDuff.Mode f3712t = null;

    /* renamed from: u */
    public boolean f3713u = false;

    /* renamed from: v */
    public boolean f3714v = false;

    /* renamed from: w */
    public boolean f3715w = false;

    /* renamed from: x */
    public int f3716x = 16;

    /* renamed from: C */
    public boolean f3692C = false;

    public C0909n(MenuC0907l menuC0907l, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f3706n = menuC0907l;
        this.f3693a = i3;
        this.f3694b = i2;
        this.f3695c = i4;
        this.f3696d = i5;
        this.f3697e = charSequence;
        this.f3717y = i6;
    }

    /* renamed from: c */
    public static void m2351c(int i2, int i3, String str, StringBuilder sb) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // p011E.InterfaceMenuItemC0107a
    /* renamed from: a */
    public final ActionProviderVisibilityListenerC0910o mo437a() {
        return this.f3690A;
    }

    @Override // p011E.InterfaceMenuItemC0107a
    /* renamed from: b */
    public final InterfaceMenuItemC0107a mo438b(ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o) {
        this.f3718z = null;
        this.f3690A = actionProviderVisibilityListenerC0910o;
        this.f3706n.mo492p(true);
        ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o2 = this.f3690A;
        if (actionProviderVisibilityListenerC0910o2 != null) {
            actionProviderVisibilityListenerC0910o2.f3721c = new C0046i(27, this);
            actionProviderVisibilityListenerC0910o2.f3719a.setVisibilityListener(actionProviderVisibilityListenerC0910o2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3717y & 8) == 0) {
            return false;
        }
        if (this.f3718z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3691B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3706n.mo2320d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m2352d(Drawable drawable) {
        if (drawable != null && this.f3715w && (this.f3713u || this.f3714v)) {
            drawable = drawable.mutate();
            if (this.f3713u) {
                AbstractC0087a.m305h(drawable, this.f3711s);
            }
            if (this.f3714v) {
                AbstractC0087a.m306i(drawable, this.f3712t);
            }
            this.f3715w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean m2353e() {
        ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o;
        if ((this.f3717y & 8) == 0) {
            return false;
        }
        if (this.f3718z == null && (actionProviderVisibilityListenerC0910o = this.f3690A) != null) {
            this.f3718z = actionProviderVisibilityListenerC0910o.m2356a(this);
        }
        return this.f3718z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2353e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3691B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3706n.mo2322f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final void m2354f(boolean z2) {
        this.f3716x = (z2 ? 4 : 0) | (this.f3716x & (-5));
    }

    /* renamed from: g */
    public final void m2355g(boolean z2) {
        if (z2) {
            this.f3716x |= 32;
        } else {
            this.f3716x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3718z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o = this.f3690A;
        if (actionProviderVisibilityListenerC0910o == null) {
            return null;
        }
        View m2356a = actionProviderVisibilityListenerC0910o.m2356a(this);
        this.f3718z = m2356a;
        return m2356a;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3703k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3702j;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3709q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3694b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3704l;
        if (drawable != null) {
            return m2352d(drawable);
        }
        int i2 = this.f3705m;
        if (i2 == 0) {
            return null;
        }
        Drawable m415w = AbstractC0104l.m415w(this.f3706n.f3663a, i2);
        this.f3705m = 0;
        this.f3704l = m415w;
        return m2352d(m415w);
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3711s;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3712t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3699g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3693a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3701i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3700h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3695c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3707o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3697e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3698f;
        return charSequence != null ? charSequence : this.f3697e;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3710r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3707o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3692C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3716x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3716x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3716x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o = this.f3690A;
        return (actionProviderVisibilityListenerC0910o == null || !actionProviderVisibilityListenerC0910o.f3719a.overridesItemVisibility()) ? (this.f3716x & 8) == 0 : (this.f3716x & 8) == 0 && this.f3690A.f3719a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f3718z = view;
        this.f3690A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f3693a) > 0) {
            view.setId(i2);
        }
        MenuC0907l menuC0907l = this.f3706n;
        menuC0907l.f3673k = true;
        menuC0907l.mo492p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f3702j == c2) {
            return this;
        }
        this.f3702j = Character.toLowerCase(c2);
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f3716x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f3716x = i3;
        if (i2 != i3) {
            this.f3706n.mo492p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f3716x;
        if ((i2 & 4) == 0) {
            int i3 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f3716x = i3;
            if (i2 != i3) {
                this.f3706n.mo492p(false);
            }
            return this;
        }
        MenuC0907l menuC0907l = this.f3706n;
        menuC0907l.getClass();
        ArrayList arrayList = menuC0907l.f3668f;
        int size = arrayList.size();
        menuC0907l.m2350w();
        for (int i4 = 0; i4 < size; i4++) {
            C0909n c0909n = (C0909n) arrayList.get(i4);
            if (c0909n.f3694b == this.f3694b && (c0909n.f3716x & 4) != 0 && c0909n.isCheckable()) {
                boolean z3 = c0909n == this;
                int i5 = c0909n.f3716x;
                int i6 = (z3 ? 2 : 0) | (i5 & (-3));
                c0909n.f3716x = i6;
                if (i5 != i6) {
                    c0909n.f3706n.mo492p(false);
                }
            }
        }
        menuC0907l.m2349v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f3716x |= 16;
        } else {
            this.f3716x &= -17;
        }
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3705m = 0;
        this.f3704l = drawable;
        this.f3715w = true;
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3711s = colorStateList;
        this.f3713u = true;
        this.f3715w = true;
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3712t = mode;
        this.f3714v = true;
        this.f3715w = true;
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3699g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f3700h == c2) {
            return this;
        }
        this.f3700h = c2;
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3691B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3708p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3700h = c2;
        this.f3702j = Character.toLowerCase(c3);
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3717y = i2;
        MenuC0907l menuC0907l = this.f3706n;
        menuC0907l.f3673k = true;
        menuC0907l.mo492p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3697e = charSequence;
        this.f3706n.mo492p(false);
        SubMenuC0895E subMenuC0895E = this.f3707o;
        if (subMenuC0895E != null) {
            subMenuC0895E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3698f = charSequence;
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f3716x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f3716x = i3;
        if (i2 != i3) {
            MenuC0907l menuC0907l = this.f3706n;
            menuC0907l.f3670h = true;
            menuC0907l.mo492p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3697e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final InterfaceMenuItemC0107a setContentDescription(CharSequence charSequence) {
        this.f3709q = charSequence;
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final InterfaceMenuItemC0107a setTooltipText(CharSequence charSequence) {
        this.f3710r = charSequence;
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f3702j == c2 && this.f3703k == i2) {
            return this;
        }
        this.f3702j = Character.toLowerCase(c2);
        this.f3703k = KeyEvent.normalizeMetaState(i2);
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f3700h == c2 && this.f3701i == i2) {
            return this;
        }
        this.f3700h = c2;
        this.f3701i = KeyEvent.normalizeMetaState(i2);
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3700h = c2;
        this.f3701i = KeyEvent.normalizeMetaState(i2);
        this.f3702j = Character.toLowerCase(c3);
        this.f3703k = KeyEvent.normalizeMetaState(i3);
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f3704l = null;
        this.f3705m = i2;
        this.f3715w = true;
        this.f3706n.mo492p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f3706n.f3663a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f3706n.f3663a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f3718z = inflate;
        this.f3690A = null;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f3693a) > 0) {
            inflate.setId(i3);
        }
        MenuC0907l menuC0907l = this.f3706n;
        menuC0907l.f3673k = true;
        menuC0907l.mo492p(true);
        return this;
    }
}
