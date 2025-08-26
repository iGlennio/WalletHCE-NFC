package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p005C.AbstractC0044g;
import p005C.C0046i;
import p016G.C0163d;
import p016G.InterfaceC0162c;
import p107q.AbstractC1181e;

/* renamed from: androidx.fragment.app.O */
/* loaded from: classes.dex */
public final class C0625O {

    /* renamed from: a */
    public int f2115a;

    /* renamed from: b */
    public int f2116b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0641o f2117c;

    /* renamed from: d */
    public final ArrayList f2118d = new ArrayList();

    /* renamed from: e */
    public final HashSet f2119e = new HashSet();

    /* renamed from: f */
    public boolean f2120f = false;

    /* renamed from: g */
    public boolean f2121g = false;

    /* renamed from: h */
    public final C0620J f2122h;

    public C0625O(int i2, int i3, C0620J c0620j, C0163d c0163d) {
        this.f2115a = i2;
        this.f2116b = i3;
        this.f2117c = c0620j.f2096c;
        c0163d.m496a(new C0046i(19, this));
        this.f2122h = c0620j;
    }

    /* renamed from: a */
    public final void m1630a() {
        if (this.f2120f) {
            return;
        }
        this.f2120f = true;
        HashSet hashSet = this.f2119e;
        if (hashSet.isEmpty()) {
            m1631b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            C0163d c0163d = (C0163d) it.next();
            synchronized (c0163d) {
                try {
                    if (!c0163d.f493a) {
                        c0163d.f493a = true;
                        c0163d.f495c = true;
                        InterfaceC0162c interfaceC0162c = c0163d.f494b;
                        if (interfaceC0162c != null) {
                            try {
                                interfaceC0162c.mo179o();
                            } catch (Throwable th) {
                                synchronized (c0163d) {
                                    c0163d.f495c = false;
                                    c0163d.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0163d) {
                            c0163d.f495c = false;
                            c0163d.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1631b() {
        if (!this.f2121g) {
            if (C0615E.m1556E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2121g = true;
            Iterator it = this.f2118d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f2122h.m1620k();
    }

    /* renamed from: c */
    public final void m1632c(int i2, int i3) {
        int m2740a = AbstractC1181e.m2740a(i3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2117c;
        if (m2740a == 0) {
            if (this.f2115a != 1) {
                if (C0615E.m1556E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0641o + " mFinalState = " + AbstractC0044g.m162n(this.f2115a) + " -> " + AbstractC0044g.m162n(i2) + ". ");
                }
                this.f2115a = i2;
                return;
            }
            return;
        }
        if (m2740a == 1) {
            if (this.f2115a == 1) {
                if (C0615E.m1556E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0641o + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0044g.m161m(this.f2116b) + " to ADDING.");
                }
                this.f2115a = 2;
                this.f2116b = 2;
                return;
            }
            return;
        }
        if (m2740a != 2) {
            return;
        }
        if (C0615E.m1556E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0641o + " mFinalState = " + AbstractC0044g.m162n(this.f2115a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0044g.m161m(this.f2116b) + " to REMOVING.");
        }
        this.f2115a = 1;
        this.f2116b = 3;
    }

    /* renamed from: d */
    public final void m1633d() {
        if (this.f2116b == 2) {
            C0620J c0620j = this.f2122h;
            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0620j.f2096c;
            View findFocus = abstractComponentCallbacksC0641o.f2207E.findFocus();
            if (findFocus != null) {
                abstractComponentCallbacksC0641o.m1664f().f2201k = findFocus;
                if (C0615E.m1556E(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0641o);
                }
            }
            View m1672x = this.f2117c.m1672x();
            if (m1672x.getParent() == null) {
                c0620j.m1611b();
                m1672x.setAlpha(0.0f);
            }
            if (m1672x.getAlpha() == 0.0f && m1672x.getVisibility() == 0) {
                m1672x.setVisibility(4);
            }
            C0640n c0640n = abstractComponentCallbacksC0641o.f2210H;
            m1672x.setAlpha(c0640n == null ? 1.0f : c0640n.f2200j);
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC0044g.m162n(this.f2115a) + "} {mLifecycleImpact = " + AbstractC0044g.m161m(this.f2116b) + "} {mFragment = " + this.f2117c + "}";
    }
}
