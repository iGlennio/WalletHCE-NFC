package p017G0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.RunnableC0597k;
import androidx.fragment.app.AbstractComponentCallbacksC0641o;
import androidx.fragment.app.C0615E;
import androidx.fragment.app.C0617G;
import androidx.fragment.app.C0620J;
import androidx.fragment.app.C0631e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import nfc.share.nfcshare.model.MqttChannel;
import p002B.AbstractC0027q;
import p004B1.C0030a;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p016G.InterfaceC0162c;
import p023I1.C0222f;
import p027K.AbstractC0272P;
import p041O1.InterfaceC0397a;
import p044P1.C0433a;
import p047Q1.C0455b;
import p076e.C0773E;
import p079f0.AbstractC0827X;
import p079f0.C0861y;
import p088j.C0965V;
import p088j.C0985d0;
import p088j.C1035u;
import p113s.C1203d;
import p113s.C1204e;
import p116t.C1216b;
import p118t1.AbstractC1244n;
import p120u1.C1250e;
import p121v.C1256f;

/* renamed from: G0.h */
/* loaded from: classes.dex */
public final class C0176h implements InterfaceC0397a, InterfaceC0162c {

    /* renamed from: e */
    public static C0176h f512e = null;

    /* renamed from: f */
    public static boolean f513f = false;

    /* renamed from: a */
    public final /* synthetic */ int f514a;

    /* renamed from: b */
    public Object f515b;

    /* renamed from: c */
    public Object f516c;

    /* renamed from: d */
    public Object f517d;

    public /* synthetic */ C0176h(int i2) {
        this.f514a = i2;
    }

    /* renamed from: B */
    public static C0176h m519B(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0176h(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    /* renamed from: A */
    public boolean m520A(int i2, C1203d c1203d, C1256f c1256f) {
        int[] iArr = c1203d.f4658p0;
        int i3 = iArr[0];
        C1216b c1216b = (C1216b) this.f516c;
        c1216b.f4767a = i3;
        c1216b.f4768b = iArr[1];
        c1216b.f4769c = c1203d.m2822q();
        c1216b.f4770d = c1203d.m2818k();
        c1216b.f4775i = false;
        c1216b.f4776j = i2;
        boolean z2 = c1216b.f4767a == 3;
        boolean z3 = c1216b.f4768b == 3;
        boolean z4 = z2 && c1203d.f4623W > 0.0f;
        boolean z5 = z3 && c1203d.f4623W > 0.0f;
        int[] iArr2 = c1203d.f4662t;
        if (z4 && iArr2[0] == 4) {
            c1216b.f4767a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c1216b.f4768b = 1;
        }
        c1256f.m2934b(c1203d, c1216b);
        c1203d.m2807O(c1216b.f4771e);
        c1203d.m2804L(c1216b.f4772f);
        c1203d.f4605E = c1216b.f4774h;
        c1203d.m2801I(c1216b.f4773g);
        c1216b.f4776j = 0;
        return c1216b.f4775i;
    }

    /* renamed from: C */
    public void m521C(MqttChannel mqttChannel, String str) {
        new Thread(new RunnableC0597k(this, str, mqttChannel, 1)).start();
    }

    /* renamed from: D */
    public void m522D(Object[] objArr) {
        C0433a c0433a = new C0433a();
        System.currentTimeMillis();
        c0433a.f1203a = (C0455b) this.f516c;
        Thread.currentThread().getName();
        c0433a.f1204b = objArr;
        ((LinkedBlockingQueue) this.f517d).add(c0433a);
    }

    /* renamed from: E */
    public void m523E() {
        ((TypedArray) this.f516c).recycle();
    }

    /* renamed from: F */
    public void m524F(C1204e c1204e, int i2, int i3, int i4) {
        int i5 = c1204e.f4630b0;
        int i6 = c1204e.f4632c0;
        c1204e.f4630b0 = 0;
        c1204e.f4632c0 = 0;
        c1204e.m2807O(i3);
        c1204e.m2804L(i4);
        if (i5 < 0) {
            c1204e.f4630b0 = 0;
        } else {
            c1204e.f4630b0 = i5;
        }
        if (i6 < 0) {
            c1204e.f4632c0 = 0;
        } else {
            c1204e.f4632c0 = i6;
        }
        C1204e c1204e2 = (C1204e) this.f517d;
        c1204e2.f4684t0 = i2;
        c1204e2.m2836U();
    }

    /* renamed from: G */
    public void m525G(View view) {
        if (((ArrayList) this.f517d).remove(view)) {
            C0861y c0861y = (C0861y) this.f515b;
            AbstractC0827X m1796I = RecyclerView.m1796I(view);
            if (m1796I != null) {
                int i2 = m1796I.f3295p;
                RecyclerView recyclerView = c0861y.f3491a;
                if (recyclerView.m1811L()) {
                    m1796I.f3296q = i2;
                    recyclerView.f2427p0.add(m1796I);
                } else {
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    m1796I.f3280a.setImportantForAccessibility(i2);
                }
                m1796I.f3295p = 0;
            }
        }
    }

    /* renamed from: H */
    public void m526H(C1204e c1204e) {
        ArrayList arrayList = (ArrayList) this.f515b;
        arrayList.clear();
        int size = c1204e.f4681q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1203d c1203d = (C1203d) c1204e.f4681q0.get(i2);
            int[] iArr = c1203d.f4658p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c1203d);
            }
        }
        c1204e.f4683s0.f4780b = true;
    }

    @Override // p041O1.InterfaceC0397a
    /* renamed from: a */
    public void mo527a(String str, EOFException eOFException) {
        m522D(null);
    }

    @Override // p041O1.InterfaceC0397a
    /* renamed from: b */
    public void mo528b(String str, Exception exc) {
        m522D(null);
    }

    @Override // p041O1.InterfaceC0397a
    /* renamed from: c */
    public String mo529c() {
        return (String) this.f515b;
    }

    /* renamed from: d */
    public void m530d(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (((ArrayList) this.f515b).contains(abstractComponentCallbacksC0641o)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0641o);
        }
        synchronized (((ArrayList) this.f515b)) {
            ((ArrayList) this.f515b).add(abstractComponentCallbacksC0641o);
        }
        abstractComponentCallbacksC0641o.f2229k = true;
    }

    /* renamed from: e */
    public void m531e(View view, int i2, boolean z2) {
        RecyclerView recyclerView = ((C0861y) this.f515b).f3491a;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : m546u(i2);
        ((C0030a) this.f516c).m95e(childCount, z2);
        if (z2) {
            m549x(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m1796I(view);
    }

    /* renamed from: f */
    public void m532f(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0861y) this.f515b).f3491a;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : m546u(i2);
        ((C0030a) this.f516c).m95e(childCount, z2);
        if (z2) {
            m549x(view);
        }
        AbstractC0827X m1796I = RecyclerView.m1796I(view);
        if (m1796I != null) {
            if (!m1796I.m2223j() && !m1796I.m2228o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + m1796I + recyclerView.m1848y());
            }
            m1796I.f3289j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* renamed from: g */
    public void m533g(String str) {
        Log.i("MqttService", "serverUrl: " + str);
        if (!f513f) {
            AbstractC1244n.m2911a("正在连接服务器...");
            Log.d("test", "ws connecting...");
        }
        if (((C1250e) this.f517d) == null) {
            this.f517d = new C1250e(str);
        }
        C1250e c1250e = (C1250e) this.f517d;
        c1250e.f4871g = new C0985d0(5, this);
        if (c1250e.f4869e) {
            return;
        }
        try {
            c1250e.f4866b = c1250e.f4865a.m2979a(c1250e.f4867c, c1250e.f4868d);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m534h(int i2) {
        AbstractC0827X m1796I;
        int m546u = m546u(i2);
        ((C0030a) this.f516c).m97g(m546u);
        RecyclerView recyclerView = ((C0861y) this.f515b).f3491a;
        View childAt = recyclerView.getChildAt(m546u);
        if (childAt != null && (m1796I = RecyclerView.m1796I(childAt)) != null) {
            if (m1796I.m2223j() && !m1796I.m2228o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + m1796I + recyclerView.m1848y());
            }
            m1796I.m2214a(256);
        }
        recyclerView.detachViewFromParent(m546u);
    }

    /* renamed from: i */
    public void m535i() {
        C1250e c1250e = (C1250e) this.f517d;
        if (c1250e != null) {
            C0222f c0222f = c1250e.f4866b;
            if (c0222f != null) {
                if (c0222f.m620b("close", 1000)) {
                    c1250e.f4869e = false;
                } else {
                    Log.e("test", "ws断开失败");
                }
            }
            AbstractC1244n.f4854h = null;
            AbstractC1244n.m2911a("已断开");
            this.f517d = null;
        }
    }

    /* renamed from: j */
    public AbstractComponentCallbacksC0641o m536j(String str) {
        C0620J c0620j = (C0620J) ((HashMap) this.f516c).get(str);
        if (c0620j != null) {
            return c0620j.f2096c;
        }
        return null;
    }

    /* renamed from: k */
    public AbstractComponentCallbacksC0641o m537k(String str) {
        for (C0620J c0620j : ((HashMap) this.f516c).values()) {
            if (c0620j != null) {
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0620j.f2096c;
                if (!str.equals(abstractComponentCallbacksC0641o.f2223e)) {
                    abstractComponentCallbacksC0641o = abstractComponentCallbacksC0641o.f2238t.f2038c.m537k(str);
                }
                if (abstractComponentCallbacksC0641o != null) {
                    return abstractComponentCallbacksC0641o;
                }
            }
        }
        return null;
    }

    /* renamed from: l */
    public ArrayList m538l() {
        ArrayList arrayList = new ArrayList();
        for (C0620J c0620j : ((HashMap) this.f516c).values()) {
            if (c0620j != null) {
                arrayList.add(c0620j);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public View m539m(int i2) {
        return ((C0861y) this.f515b).f3491a.getChildAt(m546u(i2));
    }

    /* renamed from: n */
    public int m540n() {
        return ((C0861y) this.f515b).f3491a.getChildCount() - ((ArrayList) this.f517d).size();
    }

    @Override // p016G.InterfaceC0162c
    /* renamed from: o */
    public void mo179o() {
        View view = (View) this.f515b;
        view.clearAnimation();
        ((ViewGroup) this.f516c).endViewTransition(view);
        ((C0631e) this.f517d).m1639d();
    }

    /* renamed from: p */
    public ColorStateList m541p(int i2) {
        int resourceId;
        ColorStateList m355v;
        TypedArray typedArray = (TypedArray) this.f516c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (m355v = AbstractC0096d.m355v((Context) this.f515b, resourceId)) == null) ? typedArray.getColorStateList(i2) : m355v;
    }

    /* renamed from: q */
    public Drawable m542q(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f516c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0104l.m415w((Context) this.f515b, resourceId);
    }

    /* renamed from: r */
    public Drawable m543r(int i2) {
        int resourceId;
        Drawable m2429d;
        if (!((TypedArray) this.f516c).hasValue(i2) || (resourceId = ((TypedArray) this.f516c).getResourceId(i2, 0)) == 0) {
            return null;
        }
        C1035u m2527a = C1035u.m2527a();
        Context context = (Context) this.f515b;
        synchronized (m2527a) {
            m2429d = m2527a.f4071a.m2429d(context, resourceId, true);
        }
        return m2429d;
    }

    /* renamed from: s */
    public Typeface m544s(int i2, int i3, C0965V c0965v) {
        int resourceId = ((TypedArray) this.f516c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f517d) == null) {
            this.f517d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f517d;
        ThreadLocal threadLocal = AbstractC0027q.f60a;
        Context context = (Context) this.f515b;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0027q.m90b(context, resourceId, typedValue, i3, c0965v, true, false);
    }

    /* renamed from: t */
    public List m545t() {
        ArrayList arrayList;
        if (((ArrayList) this.f515b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f515b)) {
            arrayList = new ArrayList((ArrayList) this.f515b);
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f514a) {
            case 5:
                return ((C0030a) this.f516c).toString() + ", hidden list:" + ((ArrayList) this.f517d).size();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public int m546u(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = ((C0861y) this.f515b).f3491a.getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            C0030a c0030a = (C0030a) this.f516c;
            int m92b = i2 - (i3 - c0030a.m92b(i3));
            if (m92b == 0) {
                while (c0030a.m94d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += m92b;
        }
        return -1;
    }

    /* renamed from: v */
    public View m547v(int i2) {
        return ((C0861y) this.f515b).f3491a.getChildAt(i2);
    }

    /* renamed from: w */
    public int m548w() {
        return ((C0861y) this.f515b).f3491a.getChildCount();
    }

    /* renamed from: x */
    public void m549x(View view) {
        ((ArrayList) this.f517d).add(view);
        C0861y c0861y = (C0861y) this.f515b;
        AbstractC0827X m1796I = RecyclerView.m1796I(view);
        if (m1796I != null) {
            int i2 = m1796I.f3296q;
            View view2 = m1796I.f3280a;
            if (i2 != -1) {
                m1796I.f3295p = i2;
            } else {
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                m1796I.f3295p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0861y.f3491a;
            if (recyclerView.m1811L()) {
                m1796I.f3296q = 4;
                recyclerView.f2427p0.add(m1796I);
            } else {
                WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* renamed from: y */
    public void m550y(C0620J c0620j) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0620j.f2096c;
        String str = abstractComponentCallbacksC0641o.f2223e;
        HashMap hashMap = (HashMap) this.f516c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0641o.f2223e, c0620j);
        if (C0615E.m1556E(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0641o);
        }
    }

    /* renamed from: z */
    public void m551z(C0620J c0620j) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0620j.f2096c;
        if (abstractComponentCallbacksC0641o.f2203A) {
            ((C0617G) this.f517d).m1608b(abstractComponentCallbacksC0641o);
        }
        if (((C0620J) ((HashMap) this.f516c).put(abstractComponentCallbacksC0641o.f2223e, null)) != null && C0615E.m1556E(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0641o);
        }
    }

    public C0176h() {
        this.f514a = 3;
        this.f515b = new ArrayList();
        this.f516c = new HashMap();
    }

    public C0176h(Context context) {
        this.f514a = 9;
        this.f515b = context;
    }

    public C0176h(C0861y c0861y) {
        this.f514a = 5;
        this.f515b = c0861y;
        this.f516c = new C0030a();
        this.f517d = new ArrayList();
    }

    public C0176h(NavigationView navigationView) {
        Object c0173e;
        this.f514a = 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            c0173e = new C0175g();
        } else {
            c0173e = i2 >= 33 ? new C0173e() : null;
        }
        this.f515b = c0173e;
        this.f516c = navigationView;
        this.f517d = navigationView;
    }

    public C0176h(Context context, TypedArray typedArray) {
        this.f514a = 6;
        this.f515b = context;
        this.f516c = typedArray;
    }

    public C0176h(Context context, LocationManager locationManager) {
        this.f514a = 4;
        this.f517d = new C0773E();
        this.f515b = context;
        this.f516c = locationManager;
    }

    public C0176h(C1204e c1204e) {
        this.f514a = 8;
        this.f515b = new ArrayList();
        this.f516c = new C1216b();
        this.f517d = c1204e;
    }

    public C0176h(View view, ViewGroup viewGroup, C0631e c0631e) {
        this.f514a = 2;
        this.f515b = view;
        this.f516c = viewGroup;
        this.f517d = c0631e;
    }
}
