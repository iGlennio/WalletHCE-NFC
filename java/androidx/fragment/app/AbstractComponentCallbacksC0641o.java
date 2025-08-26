package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0664L;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.C0689x;
import androidx.lifecycle.EnumC0678m;
import androidx.lifecycle.InterfaceC0665M;
import androidx.lifecycle.InterfaceC0673h;
import androidx.lifecycle.InterfaceC0683r;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import nfc.share.nfcshare.MainActivity;
import p047Q1.AbstractC0458e;
import p047Q1.C0456c;
import p076e.AbstractActivityC0782f;
import p081g0.C0869d;
import p081g0.InterfaceC0870e;
import p095l1.AbstractC1136c;

/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0641o implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0683r, InterfaceC0665M, InterfaceC0673h, InterfaceC0870e {

    /* renamed from: Q */
    public static final Object f2202Q = new Object();

    /* renamed from: A */
    public boolean f2203A;

    /* renamed from: C */
    public boolean f2205C;

    /* renamed from: D */
    public ViewGroup f2206D;

    /* renamed from: E */
    public View f2207E;

    /* renamed from: F */
    public boolean f2208F;

    /* renamed from: H */
    public C0640n f2210H;

    /* renamed from: I */
    public boolean f2211I;

    /* renamed from: J */
    public boolean f2212J;

    /* renamed from: L */
    public C0685t f2214L;

    /* renamed from: M */
    public C0622L f2215M;

    /* renamed from: O */
    public C0456c f2217O;

    /* renamed from: P */
    public final ArrayList f2218P;

    /* renamed from: b */
    public Bundle f2220b;

    /* renamed from: c */
    public SparseArray f2221c;

    /* renamed from: d */
    public Bundle f2222d;

    /* renamed from: f */
    public Bundle f2224f;

    /* renamed from: g */
    public AbstractComponentCallbacksC0641o f2225g;

    /* renamed from: i */
    public int f2227i;

    /* renamed from: k */
    public boolean f2229k;

    /* renamed from: l */
    public boolean f2230l;

    /* renamed from: m */
    public boolean f2231m;

    /* renamed from: n */
    public boolean f2232n;

    /* renamed from: o */
    public boolean f2233o;

    /* renamed from: p */
    public boolean f2234p;

    /* renamed from: q */
    public int f2235q;

    /* renamed from: r */
    public C0615E f2236r;

    /* renamed from: s */
    public C0644r f2237s;

    /* renamed from: u */
    public AbstractComponentCallbacksC0641o f2239u;

    /* renamed from: v */
    public int f2240v;

    /* renamed from: w */
    public int f2241w;

    /* renamed from: x */
    public String f2242x;

    /* renamed from: y */
    public boolean f2243y;

    /* renamed from: z */
    public boolean f2244z;

    /* renamed from: a */
    public int f2219a = -1;

    /* renamed from: e */
    public String f2223e = UUID.randomUUID().toString();

    /* renamed from: h */
    public String f2226h = null;

    /* renamed from: j */
    public Boolean f2228j = null;

    /* renamed from: t */
    public C0615E f2238t = new C0615E();

    /* renamed from: B */
    public final boolean f2204B = true;

    /* renamed from: G */
    public boolean f2209G = true;

    /* renamed from: K */
    public EnumC0678m f2213K = EnumC0678m.f2318e;

    /* renamed from: N */
    public final C0689x f2216N = new C0689x();

    public AbstractComponentCallbacksC0641o() {
        new AtomicInteger();
        this.f2218P = new ArrayList();
        this.f2214L = new C0685t(this);
        this.f2217O = new C0456c(this);
    }

    @Override // p081g0.InterfaceC0870e
    /* renamed from: b */
    public final C0869d mo1360b() {
        return (C0869d) this.f2217O.f1251c;
    }

    @Override // androidx.lifecycle.InterfaceC0665M
    /* renamed from: c */
    public final C0664L mo1361c() {
        if (this.f2236r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1667i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f2236r.f2034F.f2077e;
        C0664L c0664l = (C0664L) hashMap.get(this.f2223e);
        if (c0664l != null) {
            return c0664l;
        }
        C0664L c0664l2 = new C0664L();
        hashMap.put(this.f2223e, c0664l2);
        return c0664l2;
    }

    @Override // androidx.lifecycle.InterfaceC0683r
    /* renamed from: d */
    public final C0685t mo1362d() {
        return this.f2214L;
    }

    /* renamed from: e */
    public AbstractC0458e mo1653e() {
        return new C0639m(this);
    }

    /* renamed from: f */
    public final C0640n m1664f() {
        if (this.f2210H == null) {
            C0640n c0640n = new C0640n();
            Object obj = f2202Q;
            c0640n.f2197g = obj;
            c0640n.f2198h = obj;
            c0640n.f2199i = obj;
            c0640n.f2200j = 1.0f;
            c0640n.f2201k = null;
            this.f2210H = c0640n;
        }
        return this.f2210H;
    }

    /* renamed from: g */
    public final C0615E m1665g() {
        if (this.f2237s != null) {
            return this.f2238t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: h */
    public final Context m1666h() {
        C0644r c0644r = this.f2237s;
        if (c0644r == null) {
            return null;
        }
        return c0644r.f2250i;
    }

    /* renamed from: i */
    public final int m1667i() {
        EnumC0678m enumC0678m = this.f2213K;
        return (enumC0678m == EnumC0678m.f2315b || this.f2239u == null) ? enumC0678m.ordinal() : Math.min(enumC0678m.ordinal(), this.f2239u.m1667i());
    }

    /* renamed from: j */
    public final C0615E m1668j() {
        C0615E c0615e = this.f2236r;
        if (c0615e != null) {
            return c0615e;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: k */
    public final void m1669k(int i2, int i3, Intent intent) {
        if (C0615E.m1556E(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    /* renamed from: l */
    public void mo1654l(AbstractActivityC0782f abstractActivityC0782f) {
        this.f2205C = true;
        C0644r c0644r = this.f2237s;
        if ((c0644r == null ? null : c0644r.f2249h) != null) {
            this.f2205C = true;
        }
    }

    /* renamed from: m */
    public void mo1655m(Bundle bundle) {
        Parcelable parcelable;
        this.f2205C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2238t.m1571O(parcelable);
            C0615E c0615e = this.f2238t;
            c0615e.f2060y = false;
            c0615e.f2061z = false;
            c0615e.f2034F.f2080h = false;
            c0615e.m1598s(1);
        }
        C0615E c0615e2 = this.f2238t;
        if (c0615e2.f2048m >= 1) {
            return;
        }
        c0615e2.f2060y = false;
        c0615e2.f2061z = false;
        c0615e2.f2034F.f2080h = false;
        c0615e2.m1598s(1);
    }

    /* renamed from: n */
    public View mo1670n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: o */
    public void mo1656o() {
        this.f2205C = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f2205C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0644r c0644r = this.f2237s;
        AbstractActivityC0782f abstractActivityC0782f = c0644r == null ? null : c0644r.f2249h;
        if (abstractActivityC0782f != null) {
            abstractActivityC0782f.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f2205C = true;
    }

    /* renamed from: p */
    public void mo1657p() {
        this.f2205C = true;
    }

    /* renamed from: q */
    public LayoutInflater mo1658q(Bundle bundle) {
        C0644r c0644r = this.f2237s;
        if (c0644r == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        MainActivity mainActivity = c0644r.f2253l;
        LayoutInflater cloneInContext = mainActivity.getLayoutInflater().cloneInContext(mainActivity);
        cloneInContext.setFactory2(this.f2238t.f2041f);
        return cloneInContext;
    }

    /* renamed from: r */
    public abstract void mo1659r(Bundle bundle);

    /* renamed from: s */
    public void mo1660s() {
        this.f2205C = true;
    }

    /* renamed from: t */
    public void mo1661t() {
        this.f2205C = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f2223e);
        if (this.f2240v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2240v));
        }
        if (this.f2242x != null) {
            sb.append(" tag=");
            sb.append(this.f2242x);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo1662u(Bundle bundle) {
        this.f2205C = true;
    }

    /* renamed from: v */
    public void mo1663v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2238t.m1566J();
        this.f2234p = true;
        this.f2215M = new C0622L(mo1361c());
        View mo1670n = mo1670n(layoutInflater, viewGroup);
        this.f2207E = mo1670n;
        if (mo1670n == null) {
            if (this.f2215M.f2108b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2215M = null;
            return;
        }
        this.f2215M.m1628f();
        View view = this.f2207E;
        C0622L c0622l = this.f2215M;
        AbstractC1136c.m2637e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, c0622l);
        View view2 = this.f2207E;
        C0622L c0622l2 = this.f2215M;
        AbstractC1136c.m2637e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, c0622l2);
        View view3 = this.f2207E;
        C0622L c0622l3 = this.f2215M;
        AbstractC1136c.m2637e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c0622l3);
        this.f2216N.m1714e(this.f2215M);
    }

    /* renamed from: w */
    public final Context m1671w() {
        Context m1666h = m1666h();
        if (m1666h != null) {
            return m1666h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: x */
    public final View m1672x() {
        View view = this.f2207E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: y */
    public final void m1673y(int i2, int i3, int i4, int i5) {
        if (this.f2210H == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        m1664f().f2192b = i2;
        m1664f().f2193c = i3;
        m1664f().f2194d = i4;
        m1664f().f2195e = i5;
    }

    /* renamed from: z */
    public final void m1674z(Bundle bundle) {
        C0615E c0615e = this.f2236r;
        if (c0615e != null && (c0615e.f2060y || c0615e.f2061z)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2224f = bundle;
    }
}
