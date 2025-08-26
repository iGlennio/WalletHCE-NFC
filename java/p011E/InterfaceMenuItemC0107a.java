package p011E;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p086i.ActionProviderVisibilityListenerC0910o;

/* renamed from: E.a */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0107a extends MenuItem {
    /* renamed from: a */
    ActionProviderVisibilityListenerC0910o mo437a();

    /* renamed from: b */
    InterfaceMenuItemC0107a mo438b(ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0107a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c3, int i2, int i3);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0107a setTooltipText(CharSequence charSequence);
}
