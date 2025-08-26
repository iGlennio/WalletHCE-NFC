package p086i;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000A.AbstractC0000a;
import p008D.AbstractC0087a;
import p011E.InterfaceMenuItemC0107a;

/* renamed from: i.a */
/* loaded from: classes.dex */
public final class C0896a implements InterfaceMenuItemC0107a {

    /* renamed from: a */
    public CharSequence f3598a;

    /* renamed from: b */
    public CharSequence f3599b;

    /* renamed from: c */
    public Intent f3600c;

    /* renamed from: d */
    public char f3601d;

    /* renamed from: e */
    public int f3602e;

    /* renamed from: f */
    public char f3603f;

    /* renamed from: g */
    public int f3604g;

    /* renamed from: h */
    public Drawable f3605h;

    /* renamed from: i */
    public Context f3606i;

    /* renamed from: j */
    public CharSequence f3607j;

    /* renamed from: k */
    public CharSequence f3608k;

    /* renamed from: l */
    public ColorStateList f3609l;

    /* renamed from: m */
    public PorterDuff.Mode f3610m;

    /* renamed from: n */
    public boolean f3611n;

    /* renamed from: o */
    public boolean f3612o;

    /* renamed from: p */
    public int f3613p;

    @Override // p011E.InterfaceMenuItemC0107a
    /* renamed from: a */
    public final ActionProviderVisibilityListenerC0910o mo437a() {
        return null;
    }

    @Override // p011E.InterfaceMenuItemC0107a
    /* renamed from: b */
    public final InterfaceMenuItemC0107a mo438b(ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m2328c() {
        Drawable drawable = this.f3605h;
        if (drawable != null) {
            if (this.f3611n || this.f3612o) {
                this.f3605h = drawable;
                Drawable mutate = drawable.mutate();
                this.f3605h = mutate;
                if (this.f3611n) {
                    AbstractC0087a.m305h(mutate, this.f3609l);
                }
                if (this.f3612o) {
                    AbstractC0087a.m306i(this.f3605h, this.f3610m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3604g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3603f;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3607j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f3605h;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3609l;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3610m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3600c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3602e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3601d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3598a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3599b;
        return charSequence != null ? charSequence : this.f3598a;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3608k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3613p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3613p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3613p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3613p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f3603f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f3613p = (z2 ? 1 : 0) | (this.f3613p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f3613p = (z2 ? 2 : 0) | (this.f3613p & (-3));
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final InterfaceMenuItemC0107a setContentDescription(CharSequence charSequence) {
        this.f3607j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f3613p = (z2 ? 16 : 0) | (this.f3613p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3605h = drawable;
        m2328c();
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3609l = colorStateList;
        this.f3611n = true;
        m2328c();
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3610m = mode;
        this.f3612o = true;
        m2328c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3600c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f3601d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3601d = c2;
        this.f3603f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3598a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3599b = charSequence;
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final InterfaceMenuItemC0107a setTooltipText(CharSequence charSequence) {
        this.f3608k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f3613p = (this.f3613p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f3603f = Character.toLowerCase(c2);
        this.f3604g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3607j = charSequence;
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.f3601d = c2;
        this.f3602e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f3598a = this.f3606i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3608k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f3605h = AbstractC0000a.m1b(this.f3606i, i2);
        m2328c();
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0107a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3601d = c2;
        this.f3602e = KeyEvent.normalizeMetaState(i2);
        this.f3603f = Character.toLowerCase(c3);
        this.f3604g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }
}
