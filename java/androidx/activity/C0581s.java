package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0615E;
import androidx.fragment.app.C0649w;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0678m;
import androidx.lifecycle.InterfaceC0683r;
import java.util.Iterator;
import java.util.ListIterator;
import p075d1.C0755g;
import p095l1.AbstractC1136c;

/* renamed from: androidx.activity.s */
/* loaded from: classes.dex */
public final class C0581s {

    /* renamed from: a */
    public final Runnable f1616a;

    /* renamed from: b */
    public final C0755g f1617b = new C0755g();

    /* renamed from: c */
    public C0649w f1618c;

    /* renamed from: d */
    public final OnBackInvokedCallback f1619d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f1620e;

    /* renamed from: f */
    public boolean f1621f;

    /* renamed from: g */
    public boolean f1622g;

    public C0581s(Runnable runnable) {
        this.f1616a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f1619d = i2 >= 34 ? C0576p.f1604a.m1369a(new C0572l(this, 0), new C0572l(this, 1), new C0573m(this, 0), new C0573m(this, 1)) : C0574n.f1599a.m1366a(new C0573m(this, 2));
        }
    }

    /* renamed from: a */
    public final void m1371a(InterfaceC0683r interfaceC0683r, C0649w c0649w) {
        AbstractC1136c.m2637e(c0649w, "onBackPressedCallback");
        C0685t mo1362d = interfaceC0683r.mo1362d();
        if (mo1362d.f2325c == EnumC0678m.f2314a) {
            return;
        }
        c0649w.f2265b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, mo1362d, c0649w));
        m1374d();
        c0649w.f2266c = new C0578r(0, this);
    }

    /* renamed from: b */
    public final void m1372b() {
        Object obj;
        C0755g c0755g = this.f1617b;
        c0755g.getClass();
        ListIterator listIterator = c0755g.listIterator(c0755g.f2994c);
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((C0649w) obj).f2264a) {
                    break;
                }
            }
        }
        C0649w c0649w = (C0649w) obj;
        this.f1618c = null;
        if (c0649w == null) {
            this.f1616a.run();
            return;
        }
        C0615E c0615e = c0649w.f2267d;
        c0615e.m1603x(true);
        if (c0615e.f2043h.f2264a) {
            c0615e.m1567K();
        } else {
            c0615e.f2042g.m1372b();
        }
    }

    /* renamed from: c */
    public final void m1373c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1620e;
        OnBackInvokedCallback onBackInvokedCallback = this.f1619d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0574n c0574n = C0574n.f1599a;
        if (z2 && !this.f1621f) {
            c0574n.m1367b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1621f = true;
        } else {
            if (z2 || !this.f1621f) {
                return;
            }
            c0574n.m1368c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1621f = false;
        }
    }

    /* renamed from: d */
    public final void m1374d() {
        boolean z2 = this.f1622g;
        boolean z3 = false;
        C0755g c0755g = this.f1617b;
        if (c0755g == null || !c0755g.isEmpty()) {
            Iterator it = c0755g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0649w) it.next()).f2264a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1622g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m1373c(z3);
    }
}
