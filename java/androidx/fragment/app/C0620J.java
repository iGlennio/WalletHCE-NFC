package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0664L;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0677l;
import androidx.lifecycle.EnumC0678m;
import androidx.lifecycle.InterfaceC0681p;
import androidx.lifecycle.InterfaceC0683r;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;
import p002B.C0019i;
import p005C.AbstractC0044g;
import p017G0.C0176h;
import p027K.AbstractC0259C;
import p027K.AbstractC0272P;
import p043P0.ViewOnAttachStateChangeListenerC0420n;
import p047Q1.C0456c;
import p069b0.C0692a;
import p101o.C1162l;

/* renamed from: androidx.fragment.app.J */
/* loaded from: classes.dex */
public final class C0620J {

    /* renamed from: a */
    public final C0019i f2094a;

    /* renamed from: b */
    public final C0176h f2095b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0641o f2096c;

    /* renamed from: d */
    public boolean f2097d = false;

    /* renamed from: e */
    public int f2098e = -1;

    public C0620J(C0019i c0019i, C0176h c0176h, AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        this.f2094a = c0019i;
        this.f2095b = c0176h;
        this.f2096c = abstractComponentCallbacksC0641o;
    }

    /* renamed from: a */
    public final void m1610a() {
        boolean m1556E = C0615E.m1556E(3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0641o);
        }
        Bundle bundle = abstractComponentCallbacksC0641o.f2220b;
        abstractComponentCallbacksC0641o.f2238t.m1566J();
        abstractComponentCallbacksC0641o.f2219a = 3;
        abstractComponentCallbacksC0641o.f2205C = true;
        if (C0615E.m1556E(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0641o);
        }
        View view = abstractComponentCallbacksC0641o.f2207E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0641o.f2220b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0641o.f2221c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0641o.f2221c = null;
            }
            if (abstractComponentCallbacksC0641o.f2207E != null) {
                abstractComponentCallbacksC0641o.f2215M.f2109c.m1166c(abstractComponentCallbacksC0641o.f2222d);
                abstractComponentCallbacksC0641o.f2222d = null;
            }
            abstractComponentCallbacksC0641o.f2205C = false;
            abstractComponentCallbacksC0641o.mo1662u(bundle2);
            if (!abstractComponentCallbacksC0641o.f2205C) {
                throw new C0626P("Fragment " + abstractComponentCallbacksC0641o + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0641o.f2207E != null) {
                abstractComponentCallbacksC0641o.f2215M.m1627e(EnumC0677l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0641o.f2220b = null;
        C0615E c0615e = abstractComponentCallbacksC0641o.f2238t;
        c0615e.f2060y = false;
        c0615e.f2061z = false;
        c0615e.f2034F.f2080h = false;
        c0615e.m1598s(4);
        this.f2094a.m64f(false);
    }

    /* renamed from: b */
    public final void m1611b() {
        View view;
        View view2;
        C0176h c0176h = this.f2095b;
        c0176h.getClass();
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        ViewGroup viewGroup = abstractComponentCallbacksC0641o.f2206D;
        int i2 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0176h.f515b;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0641o);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = (AbstractComponentCallbacksC0641o) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0641o2.f2206D == viewGroup && (view = abstractComponentCallbacksC0641o2.f2207E) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o3 = (AbstractComponentCallbacksC0641o) arrayList.get(i3);
                    if (abstractComponentCallbacksC0641o3.f2206D == viewGroup && (view2 = abstractComponentCallbacksC0641o3.f2207E) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        abstractComponentCallbacksC0641o.f2206D.addView(abstractComponentCallbacksC0641o.f2207E, i2);
    }

    /* renamed from: c */
    public final void m1612c() {
        boolean m1556E = C0615E.m1556E(3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0641o);
        }
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = abstractComponentCallbacksC0641o.f2225g;
        C0176h c0176h = this.f2095b;
        C0620J c0620j = null;
        if (abstractComponentCallbacksC0641o2 != null) {
            C0620J c0620j2 = (C0620J) ((HashMap) c0176h.f516c).get(abstractComponentCallbacksC0641o2.f2223e);
            if (c0620j2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0641o + " declared target fragment " + abstractComponentCallbacksC0641o.f2225g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0641o.f2226h = abstractComponentCallbacksC0641o.f2225g.f2223e;
            abstractComponentCallbacksC0641o.f2225g = null;
            c0620j = c0620j2;
        } else {
            String str = abstractComponentCallbacksC0641o.f2226h;
            if (str != null && (c0620j = (C0620J) ((HashMap) c0176h.f516c).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0641o + " declared target fragment " + abstractComponentCallbacksC0641o.f2226h + " that does not belong to this FragmentManager!");
            }
        }
        if (c0620j != null) {
            c0620j.m1620k();
        }
        C0615E c0615e = abstractComponentCallbacksC0641o.f2236r;
        abstractComponentCallbacksC0641o.f2237s = c0615e.f2049n;
        abstractComponentCallbacksC0641o.f2239u = c0615e.f2051p;
        C0019i c0019i = this.f2094a;
        c0019i.m70l(false);
        ArrayList arrayList = abstractComponentCallbacksC0641o.f2218P;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        arrayList.clear();
        abstractComponentCallbacksC0641o.f2238t.m1581b(abstractComponentCallbacksC0641o.f2237s, abstractComponentCallbacksC0641o.mo1653e(), abstractComponentCallbacksC0641o);
        abstractComponentCallbacksC0641o.f2219a = 0;
        abstractComponentCallbacksC0641o.f2205C = false;
        abstractComponentCallbacksC0641o.mo1654l(abstractComponentCallbacksC0641o.f2237s.f2250i);
        if (!abstractComponentCallbacksC0641o.f2205C) {
            throw new C0626P("Fragment " + abstractComponentCallbacksC0641o + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0641o.f2236r.f2047l.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0618H) it2.next()).mo1609a();
        }
        C0615E c0615e2 = abstractComponentCallbacksC0641o.f2238t;
        c0615e2.f2060y = false;
        c0615e2.f2061z = false;
        c0615e2.f2034F.f2080h = false;
        c0615e2.m1598s(0);
        c0019i.m65g(false);
    }

    /* renamed from: d */
    public final int m1613d() {
        C0625O c0625o;
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (abstractComponentCallbacksC0641o.f2236r == null) {
            return abstractComponentCallbacksC0641o.f2219a;
        }
        int i2 = this.f2098e;
        int ordinal = abstractComponentCallbacksC0641o.f2213K.ordinal();
        if (ordinal == 1) {
            i2 = Math.min(i2, 0);
        } else if (ordinal == 2) {
            i2 = Math.min(i2, 1);
        } else if (ordinal == 3) {
            i2 = Math.min(i2, 5);
        } else if (ordinal != 4) {
            i2 = Math.min(i2, -1);
        }
        if (abstractComponentCallbacksC0641o.f2231m) {
            if (abstractComponentCallbacksC0641o.f2232n) {
                i2 = Math.max(this.f2098e, 2);
                View view = abstractComponentCallbacksC0641o.f2207E;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f2098e < 4 ? Math.min(i2, abstractComponentCallbacksC0641o.f2219a) : Math.min(i2, 1);
            }
        }
        if (!abstractComponentCallbacksC0641o.f2229k) {
            i2 = Math.min(i2, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0641o.f2206D;
        if (viewGroup != null) {
            C0634h m1645f = C0634h.m1645f(viewGroup, abstractComponentCallbacksC0641o.m1668j().m1563C());
            m1645f.getClass();
            C0625O m1649d = m1645f.m1649d(abstractComponentCallbacksC0641o);
            r6 = m1649d != null ? m1649d.f2116b : 0;
            Iterator it = m1645f.f2170c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0625o = null;
                    break;
                }
                c0625o = (C0625O) it.next();
                if (c0625o.f2117c.equals(abstractComponentCallbacksC0641o) && !c0625o.f2120f) {
                    break;
                }
            }
            if (c0625o != null && (r6 == 0 || r6 == 1)) {
                r6 = c0625o.f2116b;
            }
        }
        if (r6 == 2) {
            i2 = Math.min(i2, 6);
        } else if (r6 == 3) {
            i2 = Math.max(i2, 3);
        } else if (abstractComponentCallbacksC0641o.f2230l) {
            i2 = abstractComponentCallbacksC0641o.f2235q > 0 ? Math.min(i2, 1) : Math.min(i2, -1);
        }
        if (abstractComponentCallbacksC0641o.f2208F && abstractComponentCallbacksC0641o.f2219a < 5) {
            i2 = Math.min(i2, 4);
        }
        if (C0615E.m1556E(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + abstractComponentCallbacksC0641o);
        }
        return i2;
    }

    /* renamed from: e */
    public final void m1614e() {
        Parcelable parcelable;
        boolean m1556E = C0615E.m1556E(3);
        final AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0641o);
        }
        if (abstractComponentCallbacksC0641o.f2212J) {
            Bundle bundle = abstractComponentCallbacksC0641o.f2220b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0641o.f2238t.m1571O(parcelable);
                C0615E c0615e = abstractComponentCallbacksC0641o.f2238t;
                c0615e.f2060y = false;
                c0615e.f2061z = false;
                c0615e.f2034F.f2080h = false;
                c0615e.m1598s(1);
            }
            abstractComponentCallbacksC0641o.f2219a = 1;
            return;
        }
        C0019i c0019i = this.f2094a;
        c0019i.m71m(false);
        Bundle bundle2 = abstractComponentCallbacksC0641o.f2220b;
        abstractComponentCallbacksC0641o.f2238t.m1566J();
        abstractComponentCallbacksC0641o.f2219a = 1;
        abstractComponentCallbacksC0641o.f2205C = false;
        abstractComponentCallbacksC0641o.f2214L.m1699a(new InterfaceC0681p() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.InterfaceC0681p
            /* renamed from: b */
            public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
                View view;
                if (enumC0677l != EnumC0677l.ON_STOP || (view = AbstractComponentCallbacksC0641o.this.f2207E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0641o.f2217O.m1166c(bundle2);
        abstractComponentCallbacksC0641o.mo1655m(bundle2);
        abstractComponentCallbacksC0641o.f2212J = true;
        if (abstractComponentCallbacksC0641o.f2205C) {
            abstractComponentCallbacksC0641o.f2214L.m1702d(EnumC0677l.ON_CREATE);
            c0019i.m66h(false);
        } else {
            throw new C0626P("Fragment " + abstractComponentCallbacksC0641o + " did not call through to super.onCreate()");
        }
    }

    /* renamed from: f */
    public final void m1615f() {
        String str;
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (abstractComponentCallbacksC0641o.f2231m) {
            return;
        }
        if (C0615E.m1556E(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0641o);
        }
        LayoutInflater mo1658q = abstractComponentCallbacksC0641o.mo1658q(abstractComponentCallbacksC0641o.f2220b);
        ViewGroup viewGroup = abstractComponentCallbacksC0641o.f2206D;
        if (viewGroup == null) {
            int i2 = abstractComponentCallbacksC0641o.f2241w;
            if (i2 == 0) {
                viewGroup = null;
            } else {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0641o + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0641o.f2236r.f2050o.mo1211K(i2);
                if (viewGroup == null && !abstractComponentCallbacksC0641o.f2233o) {
                    try {
                        str = abstractComponentCallbacksC0641o.m1671w().getResources().getResourceName(abstractComponentCallbacksC0641o.f2241w);
                    } catch (Resources.NotFoundException unused) {
                        str = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0641o.f2241w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0641o);
                }
            }
        }
        abstractComponentCallbacksC0641o.f2206D = viewGroup;
        abstractComponentCallbacksC0641o.mo1663v(mo1658q, viewGroup, abstractComponentCallbacksC0641o.f2220b);
        View view = abstractComponentCallbacksC0641o.f2207E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0641o.f2207E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0641o);
            if (viewGroup != null) {
                m1611b();
            }
            if (abstractComponentCallbacksC0641o.f2243y) {
                abstractComponentCallbacksC0641o.f2207E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0641o.f2207E;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            if (view2.isAttachedToWindow()) {
                AbstractC0259C.m739c(abstractComponentCallbacksC0641o.f2207E);
            } else {
                View view3 = abstractComponentCallbacksC0641o.f2207E;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0420n(1, view3));
            }
            abstractComponentCallbacksC0641o.f2238t.m1598s(2);
            this.f2094a.m76r(false);
            int visibility = abstractComponentCallbacksC0641o.f2207E.getVisibility();
            abstractComponentCallbacksC0641o.m1664f().f2200j = abstractComponentCallbacksC0641o.f2207E.getAlpha();
            if (abstractComponentCallbacksC0641o.f2206D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0641o.f2207E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0641o.m1664f().f2201k = findFocus;
                    if (C0615E.m1556E(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0641o);
                    }
                }
                abstractComponentCallbacksC0641o.f2207E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0641o.f2219a = 2;
    }

    /* renamed from: g */
    public final void m1616g() {
        boolean z2;
        AbstractComponentCallbacksC0641o m536j;
        boolean m1556E = C0615E.m1556E(3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0641o);
        }
        boolean z3 = abstractComponentCallbacksC0641o.f2230l && abstractComponentCallbacksC0641o.f2235q <= 0;
        C0176h c0176h = this.f2095b;
        if (!z3) {
            C0617G c0617g = (C0617G) c0176h.f517d;
            if (!((c0617g.f2075c.containsKey(abstractComponentCallbacksC0641o.f2223e) && c0617g.f2078f) ? c0617g.f2079g : true)) {
                String str = abstractComponentCallbacksC0641o.f2226h;
                if (str != null && (m536j = c0176h.m536j(str)) != null && m536j.f2203A) {
                    abstractComponentCallbacksC0641o.f2225g = m536j;
                }
                abstractComponentCallbacksC0641o.f2219a = 0;
                return;
            }
        }
        C0644r c0644r = abstractComponentCallbacksC0641o.f2237s;
        if (c0644r != null) {
            z2 = ((C0617G) c0176h.f517d).f2079g;
        } else {
            z2 = c0644r.f2250i != null ? !r7.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            C0617G c0617g2 = (C0617G) c0176h.f517d;
            c0617g2.getClass();
            if (C0615E.m1556E(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0641o);
            }
            HashMap hashMap = c0617g2.f2076d;
            C0617G c0617g3 = (C0617G) hashMap.get(abstractComponentCallbacksC0641o.f2223e);
            if (c0617g3 != null) {
                c0617g3.mo1607a();
                hashMap.remove(abstractComponentCallbacksC0641o.f2223e);
            }
            HashMap hashMap2 = c0617g2.f2077e;
            C0664L c0664l = (C0664L) hashMap2.get(abstractComponentCallbacksC0641o.f2223e);
            if (c0664l != null) {
                c0664l.m1691a();
                hashMap2.remove(abstractComponentCallbacksC0641o.f2223e);
            }
        }
        abstractComponentCallbacksC0641o.f2238t.m1590k();
        abstractComponentCallbacksC0641o.f2214L.m1702d(EnumC0677l.ON_DESTROY);
        abstractComponentCallbacksC0641o.f2219a = 0;
        abstractComponentCallbacksC0641o.f2212J = false;
        abstractComponentCallbacksC0641o.f2205C = true;
        this.f2094a.m67i(false);
        Iterator it = c0176h.m538l().iterator();
        while (it.hasNext()) {
            C0620J c0620j = (C0620J) it.next();
            if (c0620j != null) {
                String str2 = abstractComponentCallbacksC0641o.f2223e;
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = c0620j.f2096c;
                if (str2.equals(abstractComponentCallbacksC0641o2.f2226h)) {
                    abstractComponentCallbacksC0641o2.f2225g = abstractComponentCallbacksC0641o;
                    abstractComponentCallbacksC0641o2.f2226h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0641o.f2226h;
        if (str3 != null) {
            abstractComponentCallbacksC0641o.f2225g = c0176h.m536j(str3);
        }
        c0176h.m551z(this);
    }

    /* renamed from: h */
    public final void m1617h() {
        View view;
        boolean m1556E = C0615E.m1556E(3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0641o);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0641o.f2206D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0641o.f2207E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0641o.f2238t.m1598s(1);
        if (abstractComponentCallbacksC0641o.f2207E != null) {
            C0622L c0622l = abstractComponentCallbacksC0641o.f2215M;
            c0622l.m1628f();
            if (c0622l.f2108b.f2325c.compareTo(EnumC0678m.f2316c) >= 0) {
                abstractComponentCallbacksC0641o.f2215M.m1627e(EnumC0677l.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0641o.f2219a = 1;
        abstractComponentCallbacksC0641o.f2205C = false;
        abstractComponentCallbacksC0641o.mo1656o();
        if (!abstractComponentCallbacksC0641o.f2205C) {
            throw new C0626P("Fragment " + abstractComponentCallbacksC0641o + " did not call through to super.onDestroyView()");
        }
        C1162l c1162l = ((C0692a) new C0019i(abstractComponentCallbacksC0641o, abstractComponentCallbacksC0641o.mo1361c()).f48c).f2464c;
        if (c1162l.f4426c > 0) {
            c1162l.f4425b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0641o.f2234p = false;
        this.f2094a.m77s(false);
        abstractComponentCallbacksC0641o.f2206D = null;
        abstractComponentCallbacksC0641o.f2207E = null;
        abstractComponentCallbacksC0641o.f2215M = null;
        abstractComponentCallbacksC0641o.f2216N.m1714e(null);
        abstractComponentCallbacksC0641o.f2232n = false;
    }

    /* renamed from: i */
    public final void m1618i() {
        boolean m1556E = C0615E.m1556E(3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0641o);
        }
        abstractComponentCallbacksC0641o.f2219a = -1;
        abstractComponentCallbacksC0641o.f2205C = false;
        abstractComponentCallbacksC0641o.mo1657p();
        if (!abstractComponentCallbacksC0641o.f2205C) {
            throw new C0626P("Fragment " + abstractComponentCallbacksC0641o + " did not call through to super.onDetach()");
        }
        C0615E c0615e = abstractComponentCallbacksC0641o.f2238t;
        if (!c0615e.f2029A) {
            c0615e.m1590k();
            abstractComponentCallbacksC0641o.f2238t = new C0615E();
        }
        this.f2094a.m68j(false);
        abstractComponentCallbacksC0641o.f2219a = -1;
        abstractComponentCallbacksC0641o.f2237s = null;
        abstractComponentCallbacksC0641o.f2239u = null;
        abstractComponentCallbacksC0641o.f2236r = null;
        if (!abstractComponentCallbacksC0641o.f2230l || abstractComponentCallbacksC0641o.f2235q > 0) {
            C0617G c0617g = (C0617G) this.f2095b.f517d;
            if (!((c0617g.f2075c.containsKey(abstractComponentCallbacksC0641o.f2223e) && c0617g.f2078f) ? c0617g.f2079g : true)) {
                return;
            }
        }
        if (C0615E.m1556E(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0641o);
        }
        abstractComponentCallbacksC0641o.f2214L = new C0685t(abstractComponentCallbacksC0641o);
        abstractComponentCallbacksC0641o.f2217O = new C0456c(abstractComponentCallbacksC0641o);
        abstractComponentCallbacksC0641o.f2223e = UUID.randomUUID().toString();
        abstractComponentCallbacksC0641o.f2229k = false;
        abstractComponentCallbacksC0641o.f2230l = false;
        abstractComponentCallbacksC0641o.f2231m = false;
        abstractComponentCallbacksC0641o.f2232n = false;
        abstractComponentCallbacksC0641o.f2233o = false;
        abstractComponentCallbacksC0641o.f2235q = 0;
        abstractComponentCallbacksC0641o.f2236r = null;
        abstractComponentCallbacksC0641o.f2238t = new C0615E();
        abstractComponentCallbacksC0641o.f2237s = null;
        abstractComponentCallbacksC0641o.f2240v = 0;
        abstractComponentCallbacksC0641o.f2241w = 0;
        abstractComponentCallbacksC0641o.f2242x = null;
        abstractComponentCallbacksC0641o.f2243y = false;
        abstractComponentCallbacksC0641o.f2244z = false;
    }

    /* renamed from: j */
    public final void m1619j() {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (abstractComponentCallbacksC0641o.f2231m && abstractComponentCallbacksC0641o.f2232n && !abstractComponentCallbacksC0641o.f2234p) {
            if (C0615E.m1556E(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0641o);
            }
            abstractComponentCallbacksC0641o.mo1663v(abstractComponentCallbacksC0641o.mo1658q(abstractComponentCallbacksC0641o.f2220b), null, abstractComponentCallbacksC0641o.f2220b);
            View view = abstractComponentCallbacksC0641o.f2207E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0641o.f2207E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0641o);
                if (abstractComponentCallbacksC0641o.f2243y) {
                    abstractComponentCallbacksC0641o.f2207E.setVisibility(8);
                }
                abstractComponentCallbacksC0641o.f2238t.m1598s(2);
                this.f2094a.m76r(false);
                abstractComponentCallbacksC0641o.f2219a = 2;
            }
        }
    }

    /* renamed from: k */
    public final void m1620k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z2 = this.f2097d;
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (z2) {
            if (C0615E.m1556E(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0641o);
                return;
            }
            return;
        }
        try {
            this.f2097d = true;
            while (true) {
                int m1613d = m1613d();
                int i2 = abstractComponentCallbacksC0641o.f2219a;
                if (m1613d == i2) {
                    if (abstractComponentCallbacksC0641o.f2211I) {
                        if (abstractComponentCallbacksC0641o.f2207E != null && (viewGroup = abstractComponentCallbacksC0641o.f2206D) != null) {
                            C0634h m1645f = C0634h.m1645f(viewGroup, abstractComponentCallbacksC0641o.m1668j().m1563C());
                            if (abstractComponentCallbacksC0641o.f2243y) {
                                m1645f.getClass();
                                if (C0615E.m1556E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0641o);
                                }
                                m1645f.m1646a(3, 1, this);
                            } else {
                                m1645f.getClass();
                                if (C0615E.m1556E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0641o);
                                }
                                m1645f.m1646a(2, 1, this);
                            }
                        }
                        C0615E c0615e = abstractComponentCallbacksC0641o.f2236r;
                        if (c0615e != null && abstractComponentCallbacksC0641o.f2229k && C0615E.m1557F(abstractComponentCallbacksC0641o)) {
                            c0615e.f2059x = true;
                        }
                        abstractComponentCallbacksC0641o.f2211I = false;
                    }
                    this.f2097d = false;
                    return;
                }
                if (m1613d <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            m1618i();
                            break;
                        case 0:
                            m1616g();
                            break;
                        case 1:
                            m1617h();
                            abstractComponentCallbacksC0641o.f2219a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0641o.f2232n = false;
                            abstractComponentCallbacksC0641o.f2219a = 2;
                            break;
                        case 3:
                            if (C0615E.m1556E(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0641o);
                            }
                            if (abstractComponentCallbacksC0641o.f2207E != null && abstractComponentCallbacksC0641o.f2221c == null) {
                                m1624o();
                            }
                            if (abstractComponentCallbacksC0641o.f2207E != null && (viewGroup3 = abstractComponentCallbacksC0641o.f2206D) != null) {
                                C0634h m1645f2 = C0634h.m1645f(viewGroup3, abstractComponentCallbacksC0641o.m1668j().m1563C());
                                m1645f2.getClass();
                                if (C0615E.m1556E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0641o);
                                }
                                m1645f2.m1646a(1, 3, this);
                            }
                            abstractComponentCallbacksC0641o.f2219a = 3;
                            break;
                        case 4:
                            m1626q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0641o.f2219a = 5;
                            break;
                        case 6:
                            m1621l();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            m1612c();
                            break;
                        case 1:
                            m1614e();
                            break;
                        case 2:
                            m1619j();
                            m1615f();
                            break;
                        case 3:
                            m1610a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0641o.f2207E != null && (viewGroup2 = abstractComponentCallbacksC0641o.f2206D) != null) {
                                C0634h m1645f3 = C0634h.m1645f(viewGroup2, abstractComponentCallbacksC0641o.m1668j().m1563C());
                                int m150b = AbstractC0044g.m150b(abstractComponentCallbacksC0641o.f2207E.getVisibility());
                                m1645f3.getClass();
                                if (C0615E.m1556E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0641o);
                                }
                                m1645f3.m1646a(m150b, 2, this);
                            }
                            abstractComponentCallbacksC0641o.f2219a = 4;
                            break;
                        case 5:
                            m1625p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0641o.f2219a = 6;
                            break;
                        case 7:
                            m1623n();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f2097d = false;
            throw th;
        }
    }

    /* renamed from: l */
    public final void m1621l() {
        boolean m1556E = C0615E.m1556E(3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0641o);
        }
        abstractComponentCallbacksC0641o.f2238t.m1598s(5);
        if (abstractComponentCallbacksC0641o.f2207E != null) {
            abstractComponentCallbacksC0641o.f2215M.m1627e(EnumC0677l.ON_PAUSE);
        }
        abstractComponentCallbacksC0641o.f2214L.m1702d(EnumC0677l.ON_PAUSE);
        abstractComponentCallbacksC0641o.f2219a = 6;
        abstractComponentCallbacksC0641o.f2205C = true;
        this.f2094a.m69k(false);
    }

    /* renamed from: m */
    public final void m1622m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        Bundle bundle = abstractComponentCallbacksC0641o.f2220b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0641o.f2221c = abstractComponentCallbacksC0641o.f2220b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0641o.f2222d = abstractComponentCallbacksC0641o.f2220b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0641o.f2220b.getString("android:target_state");
        abstractComponentCallbacksC0641o.f2226h = string;
        if (string != null) {
            abstractComponentCallbacksC0641o.f2227i = abstractComponentCallbacksC0641o.f2220b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0641o.f2220b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0641o.f2209G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0641o.f2208F = true;
    }

    /* renamed from: n */
    public final void m1623n() {
        boolean m1556E = C0615E.m1556E(3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0641o);
        }
        C0640n c0640n = abstractComponentCallbacksC0641o.f2210H;
        View view = c0640n == null ? null : c0640n.f2201k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0641o.f2207E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0641o.f2207E) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (C0615E.m1556E(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0641o);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0641o.f2207E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0641o.m1664f().f2201k = null;
        abstractComponentCallbacksC0641o.f2238t.m1566J();
        abstractComponentCallbacksC0641o.f2238t.m1603x(true);
        abstractComponentCallbacksC0641o.f2219a = 7;
        abstractComponentCallbacksC0641o.f2205C = true;
        C0685t c0685t = abstractComponentCallbacksC0641o.f2214L;
        EnumC0677l enumC0677l = EnumC0677l.ON_RESUME;
        c0685t.m1702d(enumC0677l);
        if (abstractComponentCallbacksC0641o.f2207E != null) {
            abstractComponentCallbacksC0641o.f2215M.f2108b.m1702d(enumC0677l);
        }
        C0615E c0615e = abstractComponentCallbacksC0641o.f2238t;
        c0615e.f2060y = false;
        c0615e.f2061z = false;
        c0615e.f2034F.f2080h = false;
        c0615e.m1598s(7);
        this.f2094a.m72n(false);
        abstractComponentCallbacksC0641o.f2220b = null;
        abstractComponentCallbacksC0641o.f2221c = null;
        abstractComponentCallbacksC0641o.f2222d = null;
    }

    /* renamed from: o */
    public final void m1624o() {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (abstractComponentCallbacksC0641o.f2207E == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0641o.f2207E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0641o.f2221c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0641o.f2215M.f2109c.m1167d(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0641o.f2222d = bundle;
    }

    /* renamed from: p */
    public final void m1625p() {
        boolean m1556E = C0615E.m1556E(3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0641o);
        }
        abstractComponentCallbacksC0641o.f2238t.m1566J();
        abstractComponentCallbacksC0641o.f2238t.m1603x(true);
        abstractComponentCallbacksC0641o.f2219a = 5;
        abstractComponentCallbacksC0641o.f2205C = false;
        abstractComponentCallbacksC0641o.mo1660s();
        if (!abstractComponentCallbacksC0641o.f2205C) {
            throw new C0626P("Fragment " + abstractComponentCallbacksC0641o + " did not call through to super.onStart()");
        }
        C0685t c0685t = abstractComponentCallbacksC0641o.f2214L;
        EnumC0677l enumC0677l = EnumC0677l.ON_START;
        c0685t.m1702d(enumC0677l);
        if (abstractComponentCallbacksC0641o.f2207E != null) {
            abstractComponentCallbacksC0641o.f2215M.f2108b.m1702d(enumC0677l);
        }
        C0615E c0615e = abstractComponentCallbacksC0641o.f2238t;
        c0615e.f2060y = false;
        c0615e.f2061z = false;
        c0615e.f2034F.f2080h = false;
        c0615e.m1598s(5);
        this.f2094a.m74p(false);
    }

    /* renamed from: q */
    public final void m1626q() {
        boolean m1556E = C0615E.m1556E(3);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2096c;
        if (m1556E) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0641o);
        }
        C0615E c0615e = abstractComponentCallbacksC0641o.f2238t;
        c0615e.f2061z = true;
        c0615e.f2034F.f2080h = true;
        c0615e.m1598s(4);
        if (abstractComponentCallbacksC0641o.f2207E != null) {
            abstractComponentCallbacksC0641o.f2215M.m1627e(EnumC0677l.ON_STOP);
        }
        abstractComponentCallbacksC0641o.f2214L.m1702d(EnumC0677l.ON_STOP);
        abstractComponentCallbacksC0641o.f2219a = 4;
        abstractComponentCallbacksC0641o.f2205C = false;
        abstractComponentCallbacksC0641o.mo1661t();
        if (abstractComponentCallbacksC0641o.f2205C) {
            this.f2094a.m75q(false);
            return;
        }
        throw new C0626P("Fragment " + abstractComponentCallbacksC0641o + " did not call through to super.onStop()");
    }

    public C0620J(C0019i c0019i, C0176h c0176h, ClassLoader classLoader, C0650x c0650x, C0619I c0619i) {
        this.f2094a = c0019i;
        this.f2095b = c0176h;
        AbstractComponentCallbacksC0641o m1678a = c0650x.m1678a(c0619i.f2081a);
        this.f2096c = m1678a;
        Bundle bundle = c0619i.f2090j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        m1678a.m1674z(bundle);
        m1678a.f2223e = c0619i.f2082b;
        m1678a.f2231m = c0619i.f2083c;
        m1678a.f2233o = true;
        m1678a.f2240v = c0619i.f2084d;
        m1678a.f2241w = c0619i.f2085e;
        m1678a.f2242x = c0619i.f2086f;
        m1678a.f2203A = c0619i.f2087g;
        m1678a.f2230l = c0619i.f2088h;
        m1678a.f2244z = c0619i.f2089i;
        m1678a.f2243y = c0619i.f2091k;
        m1678a.f2213K = EnumC0678m.values()[c0619i.f2092l];
        Bundle bundle2 = c0619i.f2093m;
        if (bundle2 != null) {
            m1678a.f2220b = bundle2;
        } else {
            m1678a.f2220b = new Bundle();
        }
        if (C0615E.m1556E(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + m1678a);
        }
    }

    public C0620J(C0019i c0019i, C0176h c0176h, AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o, C0619I c0619i) {
        this.f2094a = c0019i;
        this.f2095b = c0176h;
        this.f2096c = abstractComponentCallbacksC0641o;
        abstractComponentCallbacksC0641o.f2221c = null;
        abstractComponentCallbacksC0641o.f2222d = null;
        abstractComponentCallbacksC0641o.f2235q = 0;
        abstractComponentCallbacksC0641o.f2232n = false;
        abstractComponentCallbacksC0641o.f2229k = false;
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = abstractComponentCallbacksC0641o.f2225g;
        abstractComponentCallbacksC0641o.f2226h = abstractComponentCallbacksC0641o2 != null ? abstractComponentCallbacksC0641o2.f2223e : null;
        abstractComponentCallbacksC0641o.f2225g = null;
        Bundle bundle = c0619i.f2093m;
        if (bundle != null) {
            abstractComponentCallbacksC0641o.f2220b = bundle;
        } else {
            abstractComponentCallbacksC0641o.f2220b = new Bundle();
        }
    }
}
