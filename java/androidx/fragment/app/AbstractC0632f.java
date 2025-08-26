package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import p011E.InterfaceMenuItemC0107a;
import p016G.C0163d;
import p076e.C0794r;
import p076e.LayoutInflaterFactory2C0797u;
import p086i.MenuItemC0914s;
import p101o.C1161k;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public abstract class AbstractC0632f {

    /* renamed from: a */
    public Object f2166a;

    /* renamed from: b */
    public Object f2167b;

    public AbstractC0632f(Context context) {
        this.f2166a = context;
    }

    /* renamed from: c */
    public void m1638c() {
        C0794r c0794r = (C0794r) this.f2166a;
        if (c0794r != null) {
            try {
                ((LayoutInflaterFactory2C0797u) this.f2167b).f3169k.unregisterReceiver(c0794r);
            } catch (IllegalArgumentException unused) {
            }
            this.f2166a = null;
        }
    }

    /* renamed from: d */
    public void m1639d() {
        C0625O c0625o = (C0625O) this.f2166a;
        HashSet hashSet = c0625o.f2119e;
        if (hashSet.remove((C0163d) this.f2167b) && hashSet.isEmpty()) {
            c0625o.m1631b();
        }
    }

    /* renamed from: e */
    public abstract IntentFilter mo1640e();

    /* renamed from: f */
    public abstract int mo1641f();

    /* renamed from: g */
    public MenuItem m1642g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0107a)) {
            return menuItem;
        }
        InterfaceMenuItemC0107a interfaceMenuItemC0107a = (InterfaceMenuItemC0107a) menuItem;
        if (((C1161k) this.f2167b) == null) {
            this.f2167b = new C1161k();
        }
        MenuItem menuItem2 = (MenuItem) ((C1161k) this.f2167b).getOrDefault(interfaceMenuItemC0107a, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0914s menuItemC0914s = new MenuItemC0914s((Context) this.f2166a, interfaceMenuItemC0107a);
        ((C1161k) this.f2167b).put(interfaceMenuItemC0107a, menuItemC0914s);
        return menuItemC0914s;
    }

    /* renamed from: h */
    public abstract void mo1643h();

    /* renamed from: i */
    public void m1644i() {
        m1638c();
        IntentFilter mo1640e = mo1640e();
        if (mo1640e.countActions() == 0) {
            return;
        }
        if (((C0794r) this.f2166a) == null) {
            this.f2166a = new C0794r(0, this);
        }
        ((LayoutInflaterFactory2C0797u) this.f2167b).f3169k.registerReceiver((C0794r) this.f2166a, mo1640e);
    }

    public AbstractC0632f(C0625O c0625o, C0163d c0163d) {
        this.f2166a = c0625o;
        this.f2167b = c0163d;
    }

    public AbstractC0632f(LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u) {
        this.f2167b = layoutInflaterFactory2C0797u;
    }
}
