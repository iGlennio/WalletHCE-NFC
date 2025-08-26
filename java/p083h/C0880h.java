package p083h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p005C.AbstractC0044g;
import p011E.InterfaceMenuItemC0107a;
import p027K.AbstractC0304l;
import p086i.ActionProviderVisibilityListenerC0910o;
import p086i.C0909n;
import p086i.MenuItemC0914s;

/* renamed from: h.h */
/* loaded from: classes.dex */
public final class C0880h {

    /* renamed from: A */
    public CharSequence f3523A;

    /* renamed from: B */
    public CharSequence f3524B;

    /* renamed from: E */
    public final /* synthetic */ C0881i f3527E;

    /* renamed from: a */
    public final Menu f3528a;

    /* renamed from: h */
    public boolean f3535h;

    /* renamed from: i */
    public int f3536i;

    /* renamed from: j */
    public int f3537j;

    /* renamed from: k */
    public CharSequence f3538k;

    /* renamed from: l */
    public CharSequence f3539l;

    /* renamed from: m */
    public int f3540m;

    /* renamed from: n */
    public char f3541n;

    /* renamed from: o */
    public int f3542o;

    /* renamed from: p */
    public char f3543p;

    /* renamed from: q */
    public int f3544q;

    /* renamed from: r */
    public int f3545r;

    /* renamed from: s */
    public boolean f3546s;

    /* renamed from: t */
    public boolean f3547t;

    /* renamed from: u */
    public boolean f3548u;

    /* renamed from: v */
    public int f3549v;

    /* renamed from: w */
    public int f3550w;

    /* renamed from: x */
    public String f3551x;

    /* renamed from: y */
    public String f3552y;

    /* renamed from: z */
    public ActionProviderVisibilityListenerC0910o f3553z;

    /* renamed from: C */
    public ColorStateList f3525C = null;

    /* renamed from: D */
    public PorterDuff.Mode f3526D = null;

    /* renamed from: b */
    public int f3529b = 0;

    /* renamed from: c */
    public int f3530c = 0;

    /* renamed from: d */
    public int f3531d = 0;

    /* renamed from: e */
    public int f3532e = 0;

    /* renamed from: f */
    public boolean f3533f = true;

    /* renamed from: g */
    public boolean f3534g = true;

    public C0880h(C0881i c0881i, Menu menu) {
        this.f3527E = c0881i;
        this.f3528a = menu;
    }

    /* renamed from: a */
    public final Object m2295a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3527E.f3558c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* renamed from: b */
    public final void m2296b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f3546s).setVisible(this.f3547t).setEnabled(this.f3548u).setCheckable(this.f3545r >= 1).setTitleCondensed(this.f3539l).setIcon(this.f3540m);
        int i2 = this.f3549v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f3552y;
        C0881i c0881i = this.f3527E;
        if (str != null) {
            if (c0881i.f3558c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0881i.f3559d == null) {
                c0881i.f3559d = C0881i.m2297a(c0881i.f3558c);
            }
            Object obj = c0881i.f3559d;
            String str2 = this.f3552y;
            MenuItemOnMenuItemClickListenerC0879g menuItemOnMenuItemClickListenerC0879g = new MenuItemOnMenuItemClickListenerC0879g();
            menuItemOnMenuItemClickListenerC0879g.f3521a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0879g.f3522b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0879g.f3520c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0879g);
            } catch (Exception e2) {
                StringBuilder m156h = AbstractC0044g.m156h("Couldn't resolve menu item onClick handler ", str2, " in class ");
                m156h.append(cls.getName());
                InflateException inflateException = new InflateException(m156h.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f3545r >= 2) {
            if (menuItem instanceof C0909n) {
                ((C0909n) menuItem).m2354f(true);
            } else if (menuItem instanceof MenuItemC0914s) {
                MenuItemC0914s menuItemC0914s = (MenuItemC0914s) menuItem;
                try {
                    Method method = menuItemC0914s.f3728d;
                    InterfaceMenuItemC0107a interfaceMenuItemC0107a = menuItemC0914s.f3727c;
                    if (method == null) {
                        menuItemC0914s.f3728d = interfaceMenuItemC0107a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0914s.f3728d.invoke(interfaceMenuItemC0107a, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f3551x;
        if (str3 != null) {
            menuItem.setActionView((View) m2295a(str3, C0881i.f3554e, c0881i.f3556a));
            z2 = true;
        }
        int i3 = this.f3550w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o = this.f3553z;
        if (actionProviderVisibilityListenerC0910o != null) {
            if (menuItem instanceof InterfaceMenuItemC0107a) {
                ((InterfaceMenuItemC0107a) menuItem).mo438b(actionProviderVisibilityListenerC0910o);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f3523A;
        boolean z3 = menuItem instanceof InterfaceMenuItemC0107a;
        if (z3) {
            ((InterfaceMenuItemC0107a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0304l.m889h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3524B;
        if (z3) {
            ((InterfaceMenuItemC0107a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0304l.m894m(menuItem, charSequence2);
        }
        char c2 = this.f3541n;
        int i4 = this.f3542o;
        if (z3) {
            ((InterfaceMenuItemC0107a) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0304l.m888g(menuItem, c2, i4);
        }
        char c3 = this.f3543p;
        int i5 = this.f3544q;
        if (z3) {
            ((InterfaceMenuItemC0107a) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0304l.m892k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f3526D;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC0107a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0304l.m891j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3525C;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC0107a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0304l.m890i(menuItem, colorStateList);
            }
        }
    }
}
