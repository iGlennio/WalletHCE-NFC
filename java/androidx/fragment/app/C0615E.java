package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0567g;
import androidx.activity.C0578r;
import androidx.activity.C0581s;
import androidx.activity.InterfaceC0563c;
import androidx.lifecycle.AbstractC0662J;
import androidx.lifecycle.C0663K;
import androidx.lifecycle.C0664L;
import androidx.lifecycle.EnumC0678m;
import com.nfupay.s145.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import nfc.share.nfcshare.MainActivity;
import p002B.C0019i;
import p005C.AbstractC0044g;
import p017G0.C0176h;
import p034M0.C0360e;
import p043P0.RunnableC0402A;
import p047Q1.AbstractC0458e;
import p067a0.C0554a;
import p095l1.AbstractC1136c;

/* renamed from: androidx.fragment.app.E */
/* loaded from: classes.dex */
public final class C0615E {

    /* renamed from: A */
    public boolean f2029A;

    /* renamed from: B */
    public boolean f2030B;

    /* renamed from: C */
    public ArrayList f2031C;

    /* renamed from: D */
    public ArrayList f2032D;

    /* renamed from: E */
    public ArrayList f2033E;

    /* renamed from: F */
    public C0617G f2034F;

    /* renamed from: G */
    public final RunnableC0402A f2035G;

    /* renamed from: b */
    public boolean f2037b;

    /* renamed from: d */
    public ArrayList f2039d;

    /* renamed from: e */
    public ArrayList f2040e;

    /* renamed from: g */
    public C0581s f2042g;

    /* renamed from: k */
    public final C0019i f2046k;

    /* renamed from: l */
    public final CopyOnWriteArrayList f2047l;

    /* renamed from: m */
    public int f2048m;

    /* renamed from: n */
    public C0644r f2049n;

    /* renamed from: o */
    public AbstractC0458e f2050o;

    /* renamed from: p */
    public AbstractComponentCallbacksC0641o f2051p;

    /* renamed from: q */
    public AbstractComponentCallbacksC0641o f2052q;

    /* renamed from: r */
    public final C0650x f2053r;

    /* renamed from: s */
    public final C0651y f2054s;

    /* renamed from: t */
    public C0019i f2055t;

    /* renamed from: u */
    public C0019i f2056u;

    /* renamed from: v */
    public C0019i f2057v;

    /* renamed from: w */
    public ArrayDeque f2058w;

    /* renamed from: x */
    public boolean f2059x;

    /* renamed from: y */
    public boolean f2060y;

    /* renamed from: z */
    public boolean f2061z;

    /* renamed from: a */
    public final ArrayList f2036a = new ArrayList();

    /* renamed from: c */
    public final C0176h f2038c = new C0176h();

    /* renamed from: f */
    public final LayoutInflaterFactory2C0647u f2041f = new LayoutInflaterFactory2C0647u(this);

    /* renamed from: h */
    public final C0649w f2043h = new C0649w(this);

    /* renamed from: i */
    public final AtomicInteger f2044i = new AtomicInteger();

    /* renamed from: j */
    public final Map f2045j = Collections.synchronizedMap(new HashMap());

    public C0615E() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new C0360e(29, this);
        this.f2046k = new C0019i(this);
        this.f2047l = new CopyOnWriteArrayList();
        this.f2048m = -1;
        this.f2053r = new C0650x(this);
        this.f2054s = new C0651y(0);
        this.f2058w = new ArrayDeque();
        this.f2035G = new RunnableC0402A(7, this);
    }

    /* renamed from: E */
    public static boolean m1556E(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    /* renamed from: F */
    public static boolean m1557F(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        abstractComponentCallbacksC0641o.getClass();
        C0176h c0176h = abstractComponentCallbacksC0641o.f2238t.f2038c;
        c0176h.getClass();
        ArrayList arrayList = new ArrayList();
        for (C0620J c0620j : ((HashMap) c0176h.f516c).values()) {
            if (c0620j != null) {
                arrayList.add(c0620j.f2096c);
            } else {
                arrayList.add(null);
            }
        }
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = (AbstractComponentCallbacksC0641o) it.next();
            if (abstractComponentCallbacksC0641o2 != null) {
                z2 = m1557F(abstractComponentCallbacksC0641o2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m1558G(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (abstractComponentCallbacksC0641o == null) {
            return true;
        }
        if (abstractComponentCallbacksC0641o.f2204B) {
            return abstractComponentCallbacksC0641o.f2236r == null || m1558G(abstractComponentCallbacksC0641o.f2239u);
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m1559H(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (abstractComponentCallbacksC0641o == null) {
            return true;
        }
        C0615E c0615e = abstractComponentCallbacksC0641o.f2236r;
        return abstractComponentCallbacksC0641o.equals(c0615e.f2052q) && m1559H(c0615e.f2051p);
    }

    /* renamed from: V */
    public static void m1560V(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (m1556E(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0641o);
        }
        if (abstractComponentCallbacksC0641o.f2243y) {
            abstractComponentCallbacksC0641o.f2243y = false;
            abstractComponentCallbacksC0641o.f2211I = !abstractComponentCallbacksC0641o.f2211I;
        }
    }

    /* renamed from: A */
    public final ViewGroup m1561A(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        ViewGroup viewGroup = abstractComponentCallbacksC0641o.f2206D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0641o.f2241w <= 0 || !this.f2050o.mo1212N()) {
            return null;
        }
        View mo1211K = this.f2050o.mo1211K(abstractComponentCallbacksC0641o.f2241w);
        if (mo1211K instanceof ViewGroup) {
            return (ViewGroup) mo1211K;
        }
        return null;
    }

    /* renamed from: B */
    public final C0650x m1562B() {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2051p;
        return abstractComponentCallbacksC0641o != null ? abstractComponentCallbacksC0641o.f2236r.m1562B() : this.f2053r;
    }

    /* renamed from: C */
    public final C0651y m1563C() {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2051p;
        return abstractComponentCallbacksC0641o != null ? abstractComponentCallbacksC0641o.f2236r.m1563C() : this.f2054s;
    }

    /* renamed from: D */
    public final void m1564D(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (m1556E(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0641o);
        }
        if (abstractComponentCallbacksC0641o.f2243y) {
            return;
        }
        abstractComponentCallbacksC0641o.f2243y = true;
        abstractComponentCallbacksC0641o.f2211I = true ^ abstractComponentCallbacksC0641o.f2211I;
        m1577U(abstractComponentCallbacksC0641o);
    }

    /* renamed from: I */
    public final void m1565I(int i2, boolean z2) {
        HashMap hashMap;
        C0644r c0644r;
        if (this.f2049n == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f2048m) {
            this.f2048m = i2;
            C0176h c0176h = this.f2038c;
            Iterator it = ((ArrayList) c0176h.f515b).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) c0176h.f516c;
                if (!hasNext) {
                    break;
                }
                C0620J c0620j = (C0620J) hashMap.get(((AbstractComponentCallbacksC0641o) it.next()).f2223e);
                if (c0620j != null) {
                    c0620j.m1620k();
                }
            }
            for (C0620J c0620j2 : hashMap.values()) {
                if (c0620j2 != null) {
                    c0620j2.m1620k();
                    AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0620j2.f2096c;
                    if (abstractComponentCallbacksC0641o.f2230l && abstractComponentCallbacksC0641o.f2235q <= 0) {
                        c0176h.m551z(c0620j2);
                    }
                }
            }
            m1578W();
            if (this.f2059x && (c0644r = this.f2049n) != null && this.f2048m == 7) {
                c0644r.f2253l.m2094i().mo2109b();
                this.f2059x = false;
            }
        }
    }

    /* renamed from: J */
    public final void m1566J() {
        if (this.f2049n == null) {
            return;
        }
        this.f2060y = false;
        this.f2061z = false;
        this.f2034F.f2080h = false;
        for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
            if (abstractComponentCallbacksC0641o != null) {
                abstractComponentCallbacksC0641o.f2238t.m1566J();
            }
        }
    }

    /* renamed from: K */
    public final boolean m1567K() {
        m1603x(false);
        m1602w(true);
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2052q;
        if (abstractComponentCallbacksC0641o != null && abstractComponentCallbacksC0641o.m1665g().m1567K()) {
            return true;
        }
        boolean m1568L = m1568L(this.f2031C, this.f2032D, -1, 0);
        if (m1568L) {
            this.f2037b = true;
            try {
                m1570N(this.f2031C, this.f2032D);
            } finally {
                m1583d();
            }
        }
        m1579X();
        m1599t();
        ((HashMap) this.f2038c.f516c).values().removeAll(Collections.singleton(null));
        return m1568L;
    }

    /* renamed from: L */
    public final boolean m1568L(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        int i4;
        C0627a c0627a;
        ArrayList arrayList3 = this.f2039d;
        if (arrayList3 == null) {
            return false;
        }
        if (i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2039d.remove(size));
            arrayList2.add(Boolean.TRUE);
            return true;
        }
        if (i2 >= 0) {
            i4 = arrayList3.size() - 1;
            while (i4 >= 0) {
                C0627a c0627a2 = (C0627a) this.f2039d.get(i4);
                if (i2 >= 0 && i2 == c0627a2.f2140r) {
                    break;
                }
                i4--;
            }
            if (i4 < 0) {
                return false;
            }
            if ((i3 & 1) != 0) {
                do {
                    i4--;
                    if (i4 < 0) {
                        break;
                    }
                    c0627a = (C0627a) this.f2039d.get(i4);
                    if (i2 < 0) {
                        break;
                    }
                } while (i2 == c0627a.f2140r);
            }
        } else {
            i4 = -1;
        }
        if (i4 == this.f2039d.size() - 1) {
            return false;
        }
        for (int size2 = this.f2039d.size() - 1; size2 > i4; size2--) {
            arrayList.add(this.f2039d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: M */
    public final void m1569M(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (m1556E(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0641o + " nesting=" + abstractComponentCallbacksC0641o.f2235q);
        }
        boolean z2 = abstractComponentCallbacksC0641o.f2235q > 0;
        if (abstractComponentCallbacksC0641o.f2244z && z2) {
            return;
        }
        C0176h c0176h = this.f2038c;
        synchronized (((ArrayList) c0176h.f515b)) {
            ((ArrayList) c0176h.f515b).remove(abstractComponentCallbacksC0641o);
        }
        abstractComponentCallbacksC0641o.f2229k = false;
        if (m1557F(abstractComponentCallbacksC0641o)) {
            this.f2059x = true;
        }
        abstractComponentCallbacksC0641o.f2230l = true;
        m1577U(abstractComponentCallbacksC0641o);
    }

    /* renamed from: N */
    public final void m1570N(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((C0627a) arrayList.get(i2)).f2137o) {
                if (i3 != i2) {
                    m1604y(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((C0627a) arrayList.get(i3)).f2137o) {
                        i3++;
                    }
                }
                m1604y(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m1604y(arrayList, arrayList2, i3, size);
        }
    }

    /* renamed from: O */
    public final void m1571O(Parcelable parcelable) {
        int i2;
        C0019i c0019i;
        int i3;
        C0620J c0620j;
        if (parcelable == null) {
            return;
        }
        C0616F c0616f = (C0616F) parcelable;
        if (c0616f.f2062a == null) {
            return;
        }
        C0176h c0176h = this.f2038c;
        ((HashMap) c0176h.f516c).clear();
        Iterator it = c0616f.f2062a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i2 = 2;
            c0019i = this.f2046k;
            if (!hasNext) {
                break;
            }
            C0619I c0619i = (C0619I) it.next();
            if (c0619i != null) {
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = (AbstractComponentCallbacksC0641o) this.f2034F.f2075c.get(c0619i.f2082b);
                if (abstractComponentCallbacksC0641o != null) {
                    if (m1556E(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0641o);
                    }
                    c0620j = new C0620J(c0019i, c0176h, abstractComponentCallbacksC0641o, c0619i);
                } else {
                    c0620j = new C0620J(this.f2046k, this.f2038c, this.f2049n.f2250i.getClassLoader(), m1562B(), c0619i);
                }
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = c0620j.f2096c;
                abstractComponentCallbacksC0641o2.f2236r = this;
                if (m1556E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0641o2.f2223e + "): " + abstractComponentCallbacksC0641o2);
                }
                c0620j.m1622m(this.f2049n.f2250i.getClassLoader());
                c0176h.m550y(c0620j);
                c0620j.f2098e = this.f2048m;
            }
        }
        C0617G c0617g = this.f2034F;
        c0617g.getClass();
        Iterator it2 = new ArrayList(c0617g.f2075c.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o3 = (AbstractComponentCallbacksC0641o) it2.next();
            if (!(((HashMap) c0176h.f516c).get(abstractComponentCallbacksC0641o3.f2223e) != null)) {
                if (m1556E(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0641o3 + " that was not found in the set of active Fragments " + c0616f.f2062a);
                }
                this.f2034F.m1608b(abstractComponentCallbacksC0641o3);
                abstractComponentCallbacksC0641o3.f2236r = this;
                C0620J c0620j2 = new C0620J(c0019i, c0176h, abstractComponentCallbacksC0641o3);
                c0620j2.f2098e = 1;
                c0620j2.m1620k();
                abstractComponentCallbacksC0641o3.f2230l = true;
                c0620j2.m1620k();
            }
        }
        ArrayList<String> arrayList = c0616f.f2063b;
        ((ArrayList) c0176h.f515b).clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                AbstractComponentCallbacksC0641o m536j = c0176h.m536j(str);
                if (m536j == null) {
                    throw new IllegalStateException(AbstractC0044g.m155g("No instantiated fragment for (", str, ")"));
                }
                if (m1556E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m536j);
                }
                c0176h.m530d(m536j);
            }
        }
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o4 = null;
        if (c0616f.f2064c != null) {
            this.f2039d = new ArrayList(c0616f.f2064c.length);
            int i4 = 0;
            while (true) {
                C0628b[] c0628bArr = c0616f.f2064c;
                if (i4 >= c0628bArr.length) {
                    break;
                }
                C0628b c0628b = c0628bArr[i4];
                c0628b.getClass();
                C0627a c0627a = new C0627a(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int[] iArr = c0628b.f2141a;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    C0621K c0621k = new C0621K();
                    int i7 = i5 + 1;
                    int i8 = i2;
                    c0621k.f2099a = iArr[i5];
                    if (m1556E(i8)) {
                        Log.v("FragmentManager", "Instantiate " + c0627a + " op #" + i6 + " base fragment #" + iArr[i7]);
                    }
                    String str2 = (String) c0628b.f2142b.get(i6);
                    if (str2 != null) {
                        c0621k.f2100b = c0176h.m536j(str2);
                    } else {
                        c0621k.f2100b = abstractComponentCallbacksC0641o4;
                    }
                    c0621k.f2105g = EnumC0678m.values()[c0628b.f2143c[i6]];
                    c0621k.f2106h = EnumC0678m.values()[c0628b.f2144d[i6]];
                    int i9 = iArr[i7];
                    c0621k.f2101c = i9;
                    int i10 = iArr[i5 + 2];
                    c0621k.f2102d = i10;
                    int i11 = i5 + 4;
                    int i12 = iArr[i5 + 3];
                    c0621k.f2103e = i12;
                    i5 += 5;
                    int i13 = iArr[i11];
                    c0621k.f2104f = i13;
                    c0627a.f2124b = i9;
                    c0627a.f2125c = i10;
                    c0627a.f2126d = i12;
                    c0627a.f2127e = i13;
                    c0627a.m1634b(c0621k);
                    i6++;
                    i2 = i8;
                    abstractComponentCallbacksC0641o4 = null;
                }
                int i14 = i2;
                c0627a.f2128f = c0628b.f2145e;
                c0627a.f2130h = c0628b.f2146f;
                c0627a.f2140r = c0628b.f2147g;
                c0627a.f2129g = true;
                c0627a.f2131i = c0628b.f2148h;
                c0627a.f2132j = c0628b.f2149i;
                c0627a.f2133k = c0628b.f2150j;
                c0627a.f2134l = c0628b.f2151k;
                c0627a.f2135m = c0628b.f2152l;
                c0627a.f2136n = c0628b.f2153m;
                c0627a.f2137o = c0628b.f2154n;
                c0627a.m1635c(1);
                if (m1556E(i14)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + c0627a.f2140r + "): " + c0627a);
                    PrintWriter printWriter = new PrintWriter(new C0623M());
                    c0627a.m1636d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2039d.add(c0627a);
                i4++;
                i2 = i14;
                abstractComponentCallbacksC0641o4 = null;
            }
            i3 = 0;
        } else {
            i3 = 0;
            this.f2039d = null;
        }
        this.f2044i.set(c0616f.f2065d);
        String str3 = c0616f.f2066e;
        if (str3 != null) {
            AbstractComponentCallbacksC0641o m536j2 = c0176h.m536j(str3);
            this.f2052q = m536j2;
            m1595p(m536j2);
        }
        ArrayList arrayList2 = c0616f.f2067f;
        if (arrayList2 != null) {
            for (int i15 = i3; i15 < arrayList2.size(); i15++) {
                Bundle bundle = (Bundle) c0616f.f2068g.get(i15);
                bundle.setClassLoader(this.f2049n.f2250i.getClassLoader());
                this.f2045j.put(arrayList2.get(i15), bundle);
            }
        }
        this.f2058w = new ArrayDeque(c0616f.f2069h);
    }

    /* renamed from: P */
    public final C0616F m1572P() {
        int i2;
        ArrayList arrayList;
        C0628b[] c0628bArr;
        int size;
        Iterator it = m1584e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0634h c0634h = (C0634h) it.next();
            if (c0634h.f2172e) {
                c0634h.f2172e = false;
                c0634h.m1648c();
            }
        }
        Iterator it2 = m1584e().iterator();
        while (it2.hasNext()) {
            ((C0634h) it2.next()).m1650e();
        }
        m1603x(true);
        this.f2060y = true;
        this.f2034F.f2080h = true;
        C0176h c0176h = this.f2038c;
        c0176h.getClass();
        HashMap hashMap = (HashMap) c0176h.f516c;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0620J c0620j = (C0620J) it3.next();
            if (c0620j != null) {
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0620j.f2096c;
                C0619I c0619i = new C0619I(abstractComponentCallbacksC0641o);
                if (abstractComponentCallbacksC0641o.f2219a <= -1 || c0619i.f2093m != null) {
                    c0619i.f2093m = abstractComponentCallbacksC0641o.f2220b;
                } else {
                    Bundle bundle = new Bundle();
                    abstractComponentCallbacksC0641o.mo1659r(bundle);
                    abstractComponentCallbacksC0641o.f2217O.m1167d(bundle);
                    C0616F m1572P = abstractComponentCallbacksC0641o.f2238t.m1572P();
                    if (m1572P != null) {
                        bundle.putParcelable("android:support:fragments", m1572P);
                    }
                    c0620j.f2094a.m73o(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (abstractComponentCallbacksC0641o.f2207E != null) {
                        c0620j.m1624o();
                    }
                    if (abstractComponentCallbacksC0641o.f2221c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0641o.f2221c);
                    }
                    if (abstractComponentCallbacksC0641o.f2222d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0641o.f2222d);
                    }
                    if (!abstractComponentCallbacksC0641o.f2209G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0641o.f2209G);
                    }
                    c0619i.f2093m = bundle2;
                    if (abstractComponentCallbacksC0641o.f2226h != null) {
                        if (bundle2 == null) {
                            c0619i.f2093m = new Bundle();
                        }
                        c0619i.f2093m.putString("android:target_state", abstractComponentCallbacksC0641o.f2226h);
                        int i3 = abstractComponentCallbacksC0641o.f2227i;
                        if (i3 != 0) {
                            c0619i.f2093m.putInt("android:target_req_state", i3);
                        }
                    }
                }
                arrayList2.add(c0619i);
                if (m1556E(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0641o + ": " + c0619i.f2093m);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (m1556E(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        C0176h c0176h2 = this.f2038c;
        synchronized (((ArrayList) c0176h2.f515b)) {
            try {
                if (((ArrayList) c0176h2.f515b).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) c0176h2.f515b).size());
                    Iterator it4 = ((ArrayList) c0176h2.f515b).iterator();
                    while (it4.hasNext()) {
                        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = (AbstractComponentCallbacksC0641o) it4.next();
                        arrayList.add(abstractComponentCallbacksC0641o2.f2223e);
                        if (m1556E(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0641o2.f2223e + "): " + abstractComponentCallbacksC0641o2);
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList3 = this.f2039d;
        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
            c0628bArr = null;
        } else {
            c0628bArr = new C0628b[size];
            for (i2 = 0; i2 < size; i2++) {
                c0628bArr[i2] = new C0628b((C0627a) this.f2039d.get(i2));
                if (m1556E(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f2039d.get(i2));
                }
            }
        }
        C0616F c0616f = new C0616F();
        c0616f.f2066e = null;
        ArrayList arrayList4 = new ArrayList();
        c0616f.f2067f = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        c0616f.f2068g = arrayList5;
        c0616f.f2062a = arrayList2;
        c0616f.f2063b = arrayList;
        c0616f.f2064c = c0628bArr;
        c0616f.f2065d = this.f2044i.get();
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o3 = this.f2052q;
        if (abstractComponentCallbacksC0641o3 != null) {
            c0616f.f2066e = abstractComponentCallbacksC0641o3.f2223e;
        }
        arrayList4.addAll(this.f2045j.keySet());
        arrayList5.addAll(this.f2045j.values());
        c0616f.f2069h = new ArrayList(this.f2058w);
        return c0616f;
    }

    /* renamed from: Q */
    public final void m1573Q() {
        synchronized (this.f2036a) {
            try {
                if (this.f2036a.size() == 1) {
                    this.f2049n.f2251j.removeCallbacks(this.f2035G);
                    this.f2049n.f2251j.post(this.f2035G);
                    m1579X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: R */
    public final void m1574R(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o, boolean z2) {
        ViewGroup m1561A = m1561A(abstractComponentCallbacksC0641o);
        if (m1561A == null || !(m1561A instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) m1561A).setDrawDisappearingViewsLast(!z2);
    }

    /* renamed from: S */
    public final void m1575S(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o, EnumC0678m enumC0678m) {
        if (abstractComponentCallbacksC0641o.equals(this.f2038c.m536j(abstractComponentCallbacksC0641o.f2223e)) && (abstractComponentCallbacksC0641o.f2237s == null || abstractComponentCallbacksC0641o.f2236r == this)) {
            abstractComponentCallbacksC0641o.f2213K = enumC0678m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0641o + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: T */
    public final void m1576T(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (abstractComponentCallbacksC0641o != null) {
            if (!abstractComponentCallbacksC0641o.equals(this.f2038c.m536j(abstractComponentCallbacksC0641o.f2223e)) || (abstractComponentCallbacksC0641o.f2237s != null && abstractComponentCallbacksC0641o.f2236r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0641o + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = this.f2052q;
        this.f2052q = abstractComponentCallbacksC0641o;
        m1595p(abstractComponentCallbacksC0641o2);
        m1595p(this.f2052q);
    }

    /* renamed from: U */
    public final void m1577U(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        ViewGroup m1561A = m1561A(abstractComponentCallbacksC0641o);
        if (m1561A != null) {
            C0640n c0640n = abstractComponentCallbacksC0641o.f2210H;
            if ((c0640n == null ? 0 : c0640n.f2195e) + (c0640n == null ? 0 : c0640n.f2194d) + (c0640n == null ? 0 : c0640n.f2193c) + (c0640n == null ? 0 : c0640n.f2192b) > 0) {
                if (m1561A.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    m1561A.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0641o);
                }
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = (AbstractComponentCallbacksC0641o) m1561A.getTag(R.id.visible_removing_fragment_view_tag);
                C0640n c0640n2 = abstractComponentCallbacksC0641o.f2210H;
                boolean z2 = c0640n2 != null ? c0640n2.f2191a : false;
                if (abstractComponentCallbacksC0641o2.f2210H == null) {
                    return;
                }
                abstractComponentCallbacksC0641o2.m1664f().f2191a = z2;
            }
        }
    }

    /* renamed from: W */
    public final void m1578W() {
        Iterator it = this.f2038c.m538l().iterator();
        while (it.hasNext()) {
            C0620J c0620j = (C0620J) it.next();
            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0620j.f2096c;
            if (abstractComponentCallbacksC0641o.f2208F) {
                if (this.f2037b) {
                    this.f2030B = true;
                } else {
                    abstractComponentCallbacksC0641o.f2208F = false;
                    c0620j.m1620k();
                }
            }
        }
    }

    /* renamed from: X */
    public final void m1579X() {
        synchronized (this.f2036a) {
            try {
                if (!this.f2036a.isEmpty()) {
                    C0649w c0649w = this.f2043h;
                    c0649w.f2264a = true;
                    C0578r c0578r = c0649w.f2266c;
                    if (c0578r != null) {
                        c0578r.mo259a();
                    }
                    return;
                }
                C0649w c0649w2 = this.f2043h;
                ArrayList arrayList = this.f2039d;
                c0649w2.f2264a = (arrayList != null ? arrayList.size() : 0) > 0 && m1559H(this.f2051p);
                C0578r c0578r2 = c0649w2.f2266c;
                if (c0578r2 != null) {
                    c0578r2.mo259a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final C0620J m1580a(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (m1556E(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0641o);
        }
        C0620J m1585f = m1585f(abstractComponentCallbacksC0641o);
        abstractComponentCallbacksC0641o.f2236r = this;
        C0176h c0176h = this.f2038c;
        c0176h.m550y(m1585f);
        if (!abstractComponentCallbacksC0641o.f2244z) {
            c0176h.m530d(abstractComponentCallbacksC0641o);
            abstractComponentCallbacksC0641o.f2230l = false;
            if (abstractComponentCallbacksC0641o.f2207E == null) {
                abstractComponentCallbacksC0641o.f2211I = false;
            }
            if (m1557F(abstractComponentCallbacksC0641o)) {
                this.f2059x = true;
            }
        }
        return m1585f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m1581b(C0644r c0644r, AbstractC0458e abstractC0458e, AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        C0617G c0617g;
        String str;
        if (this.f2049n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2049n = c0644r;
        this.f2050o = abstractC0458e;
        this.f2051p = abstractComponentCallbacksC0641o;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2047l;
        if (abstractComponentCallbacksC0641o != 0) {
            copyOnWriteArrayList.add(new C0652z(abstractComponentCallbacksC0641o));
        } else if (c0644r != null) {
            copyOnWriteArrayList.add(c0644r);
        }
        if (this.f2051p != null) {
            m1579X();
        }
        if (c0644r != null) {
            C0581s m1364h = c0644r.f2253l.m1364h();
            this.f2042g = m1364h;
            m1364h.m1371a(abstractComponentCallbacksC0641o != 0 ? abstractComponentCallbacksC0641o : c0644r, this.f2043h);
        }
        if (abstractComponentCallbacksC0641o != 0) {
            C0617G c0617g2 = abstractComponentCallbacksC0641o.f2236r.f2034F;
            HashMap hashMap = c0617g2.f2076d;
            C0617G c0617g3 = (C0617G) hashMap.get(abstractComponentCallbacksC0641o.f2223e);
            if (c0617g3 == null) {
                c0617g3 = new C0617G(c0617g2.f2078f);
                hashMap.put(abstractComponentCallbacksC0641o.f2223e, c0617g3);
            }
            this.f2034F = c0617g3;
        } else if (c0644r != null) {
            C0664L mo1361c = c0644r.f2253l.mo1361c();
            AbstractC1136c.m2637e(mo1361c, "store");
            C0554a c0554a = C0554a.f1523b;
            AbstractC1136c.m2637e(c0554a, "defaultCreationExtras");
            String canonicalName = C0617G.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC1136c.m2637e(concat, "key");
            LinkedHashMap linkedHashMap = mo1361c.f2300a;
            AbstractC0662J abstractC0662J = (AbstractC0662J) linkedHashMap.get(concat);
            if (C0617G.class.isInstance(abstractC0662J)) {
                AbstractC1136c.m2635c(abstractC0662J, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0554a.f1524a);
                linkedHashMap2.put(C0663K.f2299b, concat);
                try {
                    c0617g = new C0617G(true);
                } catch (AbstractMethodError unused) {
                    c0617g = new C0617G(true);
                }
                abstractC0662J = c0617g;
                AbstractC0662J abstractC0662J2 = (AbstractC0662J) linkedHashMap.put(concat, abstractC0662J);
                if (abstractC0662J2 != null) {
                    abstractC0662J2.mo1607a();
                }
            }
            this.f2034F = (C0617G) abstractC0662J;
        } else {
            this.f2034F = new C0617G(false);
        }
        C0617G c0617g4 = this.f2034F;
        c0617g4.f2080h = this.f2060y || this.f2061z;
        this.f2038c.f517d = c0617g4;
        C0644r c0644r2 = this.f2049n;
        if (c0644r2 != null) {
            MainActivity mainActivity = c0644r2.f2253l;
            if (abstractComponentCallbacksC0641o != 0) {
                str = abstractComponentCallbacksC0641o.f2223e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String m154f = AbstractC0044g.m154f(str2, "StartActivityForResult");
            C0611A c0611a = new C0611A(2);
            C0648v c0648v = new C0648v(this, 2);
            C0567g c0567g = mainActivity.f1589j;
            this.f2055t = c0567g.m1356b(m154f, c0611a, c0648v);
            this.f2056u = c0567g.m1356b(AbstractC0044g.m154f(str2, "StartIntentSenderForResult"), new C0611A(0), new C0648v(this, 0));
            this.f2057v = c0567g.m1356b(AbstractC0044g.m154f(str2, "RequestPermissions"), new C0611A(1), new C0648v(this, 1));
        }
    }

    /* renamed from: c */
    public final void m1582c(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (m1556E(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0641o);
        }
        if (abstractComponentCallbacksC0641o.f2244z) {
            abstractComponentCallbacksC0641o.f2244z = false;
            if (abstractComponentCallbacksC0641o.f2229k) {
                return;
            }
            this.f2038c.m530d(abstractComponentCallbacksC0641o);
            if (m1556E(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0641o);
            }
            if (m1557F(abstractComponentCallbacksC0641o)) {
                this.f2059x = true;
            }
        }
    }

    /* renamed from: d */
    public final void m1583d() {
        this.f2037b = false;
        this.f2032D.clear();
        this.f2031C.clear();
    }

    /* renamed from: e */
    public final HashSet m1584e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2038c.m538l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0620J) it.next()).f2096c.f2206D;
            if (viewGroup != null) {
                hashSet.add(C0634h.m1645f(viewGroup, m1563C()));
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    public final C0620J m1585f(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        String str = abstractComponentCallbacksC0641o.f2223e;
        C0176h c0176h = this.f2038c;
        C0620J c0620j = (C0620J) ((HashMap) c0176h.f516c).get(str);
        if (c0620j != null) {
            return c0620j;
        }
        C0620J c0620j2 = new C0620J(this.f2046k, c0176h, abstractComponentCallbacksC0641o);
        c0620j2.m1622m(this.f2049n.f2250i.getClassLoader());
        c0620j2.f2098e = this.f2048m;
        return c0620j2;
    }

    /* renamed from: g */
    public final void m1586g(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (m1556E(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0641o);
        }
        if (abstractComponentCallbacksC0641o.f2244z) {
            return;
        }
        abstractComponentCallbacksC0641o.f2244z = true;
        if (abstractComponentCallbacksC0641o.f2229k) {
            if (m1556E(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0641o);
            }
            C0176h c0176h = this.f2038c;
            synchronized (((ArrayList) c0176h.f515b)) {
                ((ArrayList) c0176h.f515b).remove(abstractComponentCallbacksC0641o);
            }
            abstractComponentCallbacksC0641o.f2229k = false;
            if (m1557F(abstractComponentCallbacksC0641o)) {
                this.f2059x = true;
            }
            m1577U(abstractComponentCallbacksC0641o);
        }
    }

    /* renamed from: h */
    public final void m1587h() {
        for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
            if (abstractComponentCallbacksC0641o != null) {
                abstractComponentCallbacksC0641o.f2205C = true;
                abstractComponentCallbacksC0641o.f2238t.m1587h();
            }
        }
    }

    /* renamed from: i */
    public final boolean m1588i() {
        if (this.f2048m >= 1) {
            for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
                if (abstractComponentCallbacksC0641o != null) {
                    if (!abstractComponentCallbacksC0641o.f2243y ? abstractComponentCallbacksC0641o.f2238t.m1588i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m1589j() {
        if (this.f2048m < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
            if (abstractComponentCallbacksC0641o != null && m1558G(abstractComponentCallbacksC0641o)) {
                if (!abstractComponentCallbacksC0641o.f2243y ? abstractComponentCallbacksC0641o.f2238t.m1589j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0641o);
                    z2 = true;
                }
            }
        }
        if (this.f2040e != null) {
            for (int i2 = 0; i2 < this.f2040e.size(); i2++) {
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = (AbstractComponentCallbacksC0641o) this.f2040e.get(i2);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0641o2)) {
                    abstractComponentCallbacksC0641o2.getClass();
                }
            }
        }
        this.f2040e = arrayList;
        return z2;
    }

    /* renamed from: k */
    public final void m1590k() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f2029A = true;
        m1603x(true);
        Iterator it = m1584e().iterator();
        while (it.hasNext()) {
            ((C0634h) it.next()).m1650e();
        }
        m1598s(-1);
        this.f2049n = null;
        this.f2050o = null;
        this.f2051p = null;
        if (this.f2042g != null) {
            Iterator it2 = this.f2043h.f2265b.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0563c) it2.next()).cancel();
            }
            this.f2042g = null;
        }
        C0019i c0019i = this.f2055t;
        if (c0019i != null) {
            C0567g c0567g = (C0567g) c0019i.f48c;
            ArrayList arrayList = c0567g.f1572d;
            String str = (String) c0019i.f47b;
            if (!arrayList.contains(str) && (num3 = (Integer) c0567g.f1570b.remove(str)) != null) {
                c0567g.f1569a.remove(num3);
            }
            c0567g.f1573e.remove(str);
            HashMap hashMap = c0567g.f1574f;
            if (hashMap.containsKey(str)) {
                StringBuilder m156h = AbstractC0044g.m156h("Dropping pending result for request ", str, ": ");
                m156h.append(hashMap.get(str));
                Log.w("ActivityResultRegistry", m156h.toString());
                hashMap.remove(str);
            }
            Bundle bundle = c0567g.f1575g;
            if (bundle.containsKey(str)) {
                StringBuilder m156h2 = AbstractC0044g.m156h("Dropping pending result for request ", str, ": ");
                m156h2.append(bundle.getParcelable(str));
                Log.w("ActivityResultRegistry", m156h2.toString());
                bundle.remove(str);
            }
            if (c0567g.f1571c.get(str) != null) {
                throw new ClassCastException();
            }
            C0019i c0019i2 = this.f2056u;
            C0567g c0567g2 = (C0567g) c0019i2.f48c;
            ArrayList arrayList2 = c0567g2.f1572d;
            String str2 = (String) c0019i2.f47b;
            if (!arrayList2.contains(str2) && (num2 = (Integer) c0567g2.f1570b.remove(str2)) != null) {
                c0567g2.f1569a.remove(num2);
            }
            c0567g2.f1573e.remove(str2);
            HashMap hashMap2 = c0567g2.f1574f;
            if (hashMap2.containsKey(str2)) {
                StringBuilder m156h3 = AbstractC0044g.m156h("Dropping pending result for request ", str2, ": ");
                m156h3.append(hashMap2.get(str2));
                Log.w("ActivityResultRegistry", m156h3.toString());
                hashMap2.remove(str2);
            }
            Bundle bundle2 = c0567g2.f1575g;
            if (bundle2.containsKey(str2)) {
                StringBuilder m156h4 = AbstractC0044g.m156h("Dropping pending result for request ", str2, ": ");
                m156h4.append(bundle2.getParcelable(str2));
                Log.w("ActivityResultRegistry", m156h4.toString());
                bundle2.remove(str2);
            }
            if (c0567g2.f1571c.get(str2) != null) {
                throw new ClassCastException();
            }
            C0019i c0019i3 = this.f2057v;
            C0567g c0567g3 = (C0567g) c0019i3.f48c;
            ArrayList arrayList3 = c0567g3.f1572d;
            String str3 = (String) c0019i3.f47b;
            if (!arrayList3.contains(str3) && (num = (Integer) c0567g3.f1570b.remove(str3)) != null) {
                c0567g3.f1569a.remove(num);
            }
            c0567g3.f1573e.remove(str3);
            HashMap hashMap3 = c0567g3.f1574f;
            if (hashMap3.containsKey(str3)) {
                StringBuilder m156h5 = AbstractC0044g.m156h("Dropping pending result for request ", str3, ": ");
                m156h5.append(hashMap3.get(str3));
                Log.w("ActivityResultRegistry", m156h5.toString());
                hashMap3.remove(str3);
            }
            Bundle bundle3 = c0567g3.f1575g;
            if (bundle3.containsKey(str3)) {
                StringBuilder m156h6 = AbstractC0044g.m156h("Dropping pending result for request ", str3, ": ");
                m156h6.append(bundle3.getParcelable(str3));
                Log.w("ActivityResultRegistry", m156h6.toString());
                bundle3.remove(str3);
            }
            if (c0567g3.f1571c.get(str3) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* renamed from: l */
    public final void m1591l() {
        for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
            if (abstractComponentCallbacksC0641o != null) {
                abstractComponentCallbacksC0641o.f2205C = true;
                abstractComponentCallbacksC0641o.f2238t.m1591l();
            }
        }
    }

    /* renamed from: m */
    public final void m1592m() {
        for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
            if (abstractComponentCallbacksC0641o != null) {
                abstractComponentCallbacksC0641o.f2238t.m1592m();
            }
        }
    }

    /* renamed from: n */
    public final boolean m1593n() {
        if (this.f2048m >= 1) {
            for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
                if (abstractComponentCallbacksC0641o != null) {
                    if (!abstractComponentCallbacksC0641o.f2243y ? abstractComponentCallbacksC0641o.f2238t.m1593n() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public final void m1594o() {
        if (this.f2048m < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
            if (abstractComponentCallbacksC0641o != null && !abstractComponentCallbacksC0641o.f2243y) {
                abstractComponentCallbacksC0641o.f2238t.m1594o();
            }
        }
    }

    /* renamed from: p */
    public final void m1595p(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (abstractComponentCallbacksC0641o != null) {
            if (abstractComponentCallbacksC0641o.equals(this.f2038c.m536j(abstractComponentCallbacksC0641o.f2223e))) {
                abstractComponentCallbacksC0641o.f2236r.getClass();
                boolean m1559H = m1559H(abstractComponentCallbacksC0641o);
                Boolean bool = abstractComponentCallbacksC0641o.f2228j;
                if (bool == null || bool.booleanValue() != m1559H) {
                    abstractComponentCallbacksC0641o.f2228j = Boolean.valueOf(m1559H);
                    C0615E c0615e = abstractComponentCallbacksC0641o.f2238t;
                    c0615e.m1579X();
                    c0615e.m1595p(c0615e.f2052q);
                }
            }
        }
    }

    /* renamed from: q */
    public final void m1596q() {
        for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
            if (abstractComponentCallbacksC0641o != null) {
                abstractComponentCallbacksC0641o.f2238t.m1596q();
            }
        }
    }

    /* renamed from: r */
    public final boolean m1597r() {
        if (this.f2048m < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : this.f2038c.m545t()) {
            if (abstractComponentCallbacksC0641o != null && m1558G(abstractComponentCallbacksC0641o)) {
                if (!abstractComponentCallbacksC0641o.f2243y ? abstractComponentCallbacksC0641o.f2238t.m1597r() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: s */
    public final void m1598s(int i2) {
        try {
            this.f2037b = true;
            for (C0620J c0620j : ((HashMap) this.f2038c.f516c).values()) {
                if (c0620j != null) {
                    c0620j.f2098e = i2;
                }
            }
            m1565I(i2, false);
            Iterator it = m1584e().iterator();
            while (it.hasNext()) {
                ((C0634h) it.next()).m1650e();
            }
            this.f2037b = false;
            m1603x(true);
        } catch (Throwable th) {
            this.f2037b = false;
            throw th;
        }
    }

    /* renamed from: t */
    public final void m1599t() {
        if (this.f2030B) {
            this.f2030B = false;
            m1578W();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            sb.append(abstractComponentCallbacksC0641o.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2051p)));
            sb.append("}");
        } else {
            C0644r c0644r = this.f2049n;
            if (c0644r != null) {
                sb.append(c0644r.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f2049n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1600u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String m154f = AbstractC0044g.m154f(str, "    ");
        C0176h c0176h = this.f2038c;
        c0176h.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) c0176h.f516c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0620J c0620j : hashMap.values()) {
                printWriter.print(str);
                if (c0620j != null) {
                    AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0620j.f2096c;
                    printWriter.println(abstractComponentCallbacksC0641o);
                    abstractComponentCallbacksC0641o.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0641o.f2240v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0641o.f2241w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0641o.f2242x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0641o.f2219a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0641o.f2223e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0641o.f2235q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0641o.f2229k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0641o.f2230l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0641o.f2231m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0641o.f2232n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0641o.f2243y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0641o.f2244z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0641o.f2204B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0641o.f2203A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0641o.f2209G);
                    if (abstractComponentCallbacksC0641o.f2236r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2236r);
                    }
                    if (abstractComponentCallbacksC0641o.f2237s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2237s);
                    }
                    if (abstractComponentCallbacksC0641o.f2239u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2239u);
                    }
                    if (abstractComponentCallbacksC0641o.f2224f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2224f);
                    }
                    if (abstractComponentCallbacksC0641o.f2220b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2220b);
                    }
                    if (abstractComponentCallbacksC0641o.f2221c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2221c);
                    }
                    if (abstractComponentCallbacksC0641o.f2222d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2222d);
                    }
                    Object obj = abstractComponentCallbacksC0641o.f2225g;
                    if (obj == null) {
                        C0615E c0615e = abstractComponentCallbacksC0641o.f2236r;
                        obj = (c0615e == null || (str2 = abstractComponentCallbacksC0641o.f2226h) == null) ? null : c0615e.f2038c.m536j(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2227i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0640n c0640n = abstractComponentCallbacksC0641o.f2210H;
                    printWriter.println(c0640n == null ? false : c0640n.f2191a);
                    C0640n c0640n2 = abstractComponentCallbacksC0641o.f2210H;
                    if ((c0640n2 == null ? 0 : c0640n2.f2192b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0640n c0640n3 = abstractComponentCallbacksC0641o.f2210H;
                        printWriter.println(c0640n3 == null ? 0 : c0640n3.f2192b);
                    }
                    C0640n c0640n4 = abstractComponentCallbacksC0641o.f2210H;
                    if ((c0640n4 == null ? 0 : c0640n4.f2193c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0640n c0640n5 = abstractComponentCallbacksC0641o.f2210H;
                        printWriter.println(c0640n5 == null ? 0 : c0640n5.f2193c);
                    }
                    C0640n c0640n6 = abstractComponentCallbacksC0641o.f2210H;
                    if ((c0640n6 == null ? 0 : c0640n6.f2194d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0640n c0640n7 = abstractComponentCallbacksC0641o.f2210H;
                        printWriter.println(c0640n7 == null ? 0 : c0640n7.f2194d);
                    }
                    C0640n c0640n8 = abstractComponentCallbacksC0641o.f2210H;
                    if ((c0640n8 == null ? 0 : c0640n8.f2195e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0640n c0640n9 = abstractComponentCallbacksC0641o.f2210H;
                        printWriter.println(c0640n9 == null ? 0 : c0640n9.f2195e);
                    }
                    if (abstractComponentCallbacksC0641o.f2206D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2206D);
                    }
                    if (abstractComponentCallbacksC0641o.f2207E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0641o.f2207E);
                    }
                    if (abstractComponentCallbacksC0641o.m1666h() != null) {
                        new C0019i(abstractComponentCallbacksC0641o, abstractComponentCallbacksC0641o.mo1361c()).m78t(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0641o.f2238t + ":");
                    abstractComponentCallbacksC0641o.f2238t.m1600u(AbstractC0044g.m154f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0176h.f515b;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = (AbstractComponentCallbacksC0641o) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0641o2.toString());
            }
        }
        ArrayList arrayList2 = this.f2040e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o3 = (AbstractComponentCallbacksC0641o) this.f2040e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0641o3.toString());
            }
        }
        ArrayList arrayList3 = this.f2039d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0627a c0627a = (C0627a) this.f2039d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0627a.toString());
                c0627a.m1636d(m154f, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2044i.get());
        synchronized (this.f2036a) {
            try {
                int size4 = this.f2036a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (InterfaceC0613C) this.f2036a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2049n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2050o);
        if (this.f2051p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2051p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2048m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2060y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2061z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2029A);
        if (this.f2059x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2059x);
        }
    }

    /* renamed from: v */
    public final void m1601v(InterfaceC0613C interfaceC0613C, boolean z2) {
        if (!z2) {
            if (this.f2049n == null) {
                if (!this.f2029A) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f2060y || this.f2061z) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2036a) {
            try {
                if (this.f2049n == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2036a.add(interfaceC0613C);
                    m1573Q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: w */
    public final void m1602w(boolean z2) {
        if (this.f2037b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2049n == null) {
            if (!this.f2029A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2049n.f2251j.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f2060y || this.f2061z)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2031C == null) {
            this.f2031C = new ArrayList();
            this.f2032D = new ArrayList();
        }
        this.f2037b = false;
    }

    /* renamed from: x */
    public final boolean m1603x(boolean z2) {
        boolean z3;
        m1602w(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f2031C;
            ArrayList arrayList2 = this.f2032D;
            synchronized (this.f2036a) {
                try {
                    if (this.f2036a.isEmpty()) {
                        z3 = false;
                    } else {
                        int size = this.f2036a.size();
                        z3 = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            z3 |= ((InterfaceC0613C) this.f2036a.get(i2)).mo1555a(arrayList, arrayList2);
                        }
                        this.f2036a.clear();
                        this.f2049n.f2251j.removeCallbacks(this.f2035G);
                    }
                } finally {
                }
            }
            if (!z3) {
                m1579X();
                m1599t();
                ((HashMap) this.f2038c.f516c).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f2037b = true;
            try {
                m1570N(this.f2031C, this.f2032D);
            } finally {
                m1583d();
            }
        }
    }

    /* renamed from: y */
    public final void m1604y(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4 = ((C0627a) arrayList.get(i2)).f2137o;
        ArrayList arrayList3 = this.f2033E;
        if (arrayList3 == null) {
            this.f2033E = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f2033E;
        C0176h c0176h = this.f2038c;
        arrayList4.addAll(c0176h.m545t());
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2052q;
        int i7 = i2;
        boolean z5 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i3) {
                boolean z6 = z4;
                this.f2033E.clear();
                if (!z6 && this.f2048m >= 1) {
                    for (int i9 = i2; i9 < i3; i9++) {
                        Iterator it = ((C0627a) arrayList.get(i9)).f2123a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = ((C0621K) it.next()).f2100b;
                            if (abstractComponentCallbacksC0641o2 != null && abstractComponentCallbacksC0641o2.f2236r != null) {
                                c0176h.m550y(m1585f(abstractComponentCallbacksC0641o2));
                            }
                        }
                    }
                }
                for (int i10 = i2; i10 < i3; i10++) {
                    C0627a c0627a = (C0627a) arrayList.get(i10);
                    if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                        c0627a.m1635c(-1);
                        ArrayList arrayList5 = c0627a.f2123a;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            C0621K c0621k = (C0621K) arrayList5.get(size);
                            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o3 = c0621k.f2100b;
                            if (abstractComponentCallbacksC0641o3 != null) {
                                if (abstractComponentCallbacksC0641o3.f2210H != null) {
                                    abstractComponentCallbacksC0641o3.m1664f().f2191a = true;
                                }
                                int i11 = c0627a.f2128f;
                                int i12 = i11 != 4097 ? i11 != 4099 ? i11 != 8194 ? 0 : 4097 : 4099 : 8194;
                                if (abstractComponentCallbacksC0641o3.f2210H != null || i12 != 0) {
                                    abstractComponentCallbacksC0641o3.m1664f();
                                    abstractComponentCallbacksC0641o3.f2210H.f2196f = i12;
                                }
                                abstractComponentCallbacksC0641o3.m1664f();
                                abstractComponentCallbacksC0641o3.f2210H.getClass();
                            }
                            int i13 = c0621k.f2099a;
                            C0615E c0615e = c0627a.f2138p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0641o3.m1673y(c0621k.f2101c, c0621k.f2102d, c0621k.f2103e, c0621k.f2104f);
                                    c0615e.m1574R(abstractComponentCallbacksC0641o3, true);
                                    c0615e.m1569M(abstractComponentCallbacksC0641o3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0621k.f2099a);
                                case 3:
                                    abstractComponentCallbacksC0641o3.m1673y(c0621k.f2101c, c0621k.f2102d, c0621k.f2103e, c0621k.f2104f);
                                    c0615e.m1580a(abstractComponentCallbacksC0641o3);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0641o3.m1673y(c0621k.f2101c, c0621k.f2102d, c0621k.f2103e, c0621k.f2104f);
                                    c0615e.getClass();
                                    m1560V(abstractComponentCallbacksC0641o3);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0641o3.m1673y(c0621k.f2101c, c0621k.f2102d, c0621k.f2103e, c0621k.f2104f);
                                    c0615e.m1574R(abstractComponentCallbacksC0641o3, true);
                                    c0615e.m1564D(abstractComponentCallbacksC0641o3);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0641o3.m1673y(c0621k.f2101c, c0621k.f2102d, c0621k.f2103e, c0621k.f2104f);
                                    c0615e.m1582c(abstractComponentCallbacksC0641o3);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0641o3.m1673y(c0621k.f2101c, c0621k.f2102d, c0621k.f2103e, c0621k.f2104f);
                                    c0615e.m1574R(abstractComponentCallbacksC0641o3, true);
                                    c0615e.m1586g(abstractComponentCallbacksC0641o3);
                                    break;
                                case 8:
                                    c0615e.m1576T(null);
                                    break;
                                case 9:
                                    c0615e.m1576T(abstractComponentCallbacksC0641o3);
                                    break;
                                case 10:
                                    c0615e.m1575S(abstractComponentCallbacksC0641o3, c0621k.f2105g);
                                    break;
                            }
                        }
                    } else {
                        c0627a.m1635c(1);
                        ArrayList arrayList6 = c0627a.f2123a;
                        int size2 = arrayList6.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            C0621K c0621k2 = (C0621K) arrayList6.get(i14);
                            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o4 = c0621k2.f2100b;
                            if (abstractComponentCallbacksC0641o4 != null) {
                                if (abstractComponentCallbacksC0641o4.f2210H != null) {
                                    abstractComponentCallbacksC0641o4.m1664f().f2191a = false;
                                }
                                int i15 = c0627a.f2128f;
                                if (abstractComponentCallbacksC0641o4.f2210H != null || i15 != 0) {
                                    abstractComponentCallbacksC0641o4.m1664f();
                                    abstractComponentCallbacksC0641o4.f2210H.f2196f = i15;
                                }
                                abstractComponentCallbacksC0641o4.m1664f();
                                abstractComponentCallbacksC0641o4.f2210H.getClass();
                            }
                            int i16 = c0621k2.f2099a;
                            C0615E c0615e2 = c0627a.f2138p;
                            switch (i16) {
                                case 1:
                                    abstractComponentCallbacksC0641o4.m1673y(c0621k2.f2101c, c0621k2.f2102d, c0621k2.f2103e, c0621k2.f2104f);
                                    c0615e2.m1574R(abstractComponentCallbacksC0641o4, false);
                                    c0615e2.m1580a(abstractComponentCallbacksC0641o4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0621k2.f2099a);
                                case 3:
                                    abstractComponentCallbacksC0641o4.m1673y(c0621k2.f2101c, c0621k2.f2102d, c0621k2.f2103e, c0621k2.f2104f);
                                    c0615e2.m1569M(abstractComponentCallbacksC0641o4);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0641o4.m1673y(c0621k2.f2101c, c0621k2.f2102d, c0621k2.f2103e, c0621k2.f2104f);
                                    c0615e2.m1564D(abstractComponentCallbacksC0641o4);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0641o4.m1673y(c0621k2.f2101c, c0621k2.f2102d, c0621k2.f2103e, c0621k2.f2104f);
                                    c0615e2.m1574R(abstractComponentCallbacksC0641o4, false);
                                    m1560V(abstractComponentCallbacksC0641o4);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0641o4.m1673y(c0621k2.f2101c, c0621k2.f2102d, c0621k2.f2103e, c0621k2.f2104f);
                                    c0615e2.m1586g(abstractComponentCallbacksC0641o4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0641o4.m1673y(c0621k2.f2101c, c0621k2.f2102d, c0621k2.f2103e, c0621k2.f2104f);
                                    c0615e2.m1574R(abstractComponentCallbacksC0641o4, false);
                                    c0615e2.m1582c(abstractComponentCallbacksC0641o4);
                                    break;
                                case 8:
                                    c0615e2.m1576T(abstractComponentCallbacksC0641o4);
                                    break;
                                case 9:
                                    c0615e2.m1576T(null);
                                    break;
                                case 10:
                                    c0615e2.m1575S(abstractComponentCallbacksC0641o4, c0621k2.f2106h);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
                for (int i17 = i2; i17 < i3; i17++) {
                    C0627a c0627a2 = (C0627a) arrayList.get(i17);
                    if (booleanValue) {
                        for (int size3 = c0627a2.f2123a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o5 = ((C0621K) c0627a2.f2123a.get(size3)).f2100b;
                            if (abstractComponentCallbacksC0641o5 != null) {
                                m1585f(abstractComponentCallbacksC0641o5).m1620k();
                            }
                        }
                    } else {
                        Iterator it2 = c0627a2.f2123a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o6 = ((C0621K) it2.next()).f2100b;
                            if (abstractComponentCallbacksC0641o6 != null) {
                                m1585f(abstractComponentCallbacksC0641o6).m1620k();
                            }
                        }
                    }
                }
                m1565I(this.f2048m, true);
                HashSet hashSet = new HashSet();
                for (int i18 = i2; i18 < i3; i18++) {
                    Iterator it3 = ((C0627a) arrayList.get(i18)).f2123a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o7 = ((C0621K) it3.next()).f2100b;
                        if (abstractComponentCallbacksC0641o7 != null && (viewGroup = abstractComponentCallbacksC0641o7.f2206D) != null) {
                            hashSet.add(C0634h.m1645f(viewGroup, m1563C()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0634h c0634h = (C0634h) it4.next();
                    c0634h.f2171d = booleanValue;
                    synchronized (c0634h.f2169b) {
                        try {
                            c0634h.m1651g();
                            c0634h.f2172e = false;
                            int size4 = c0634h.f2169b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    C0625O c0625o = (C0625O) c0634h.f2169b.get(size4);
                                    int m151c = AbstractC0044g.m151c(c0625o.f2117c.f2207E);
                                    if (c0625o.f2115a != 2 || m151c == 2) {
                                        size4--;
                                    } else {
                                        c0625o.f2117c.getClass();
                                        c0634h.f2172e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0634h.m1648c();
                }
                for (int i19 = i2; i19 < i3; i19++) {
                    C0627a c0627a3 = (C0627a) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c0627a3.f2140r >= 0) {
                        c0627a3.f2140r = -1;
                    }
                    c0627a3.getClass();
                }
                return;
            }
            C0627a c0627a4 = (C0627a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                z2 = z4;
                i4 = i7;
                int i20 = 1;
                ArrayList arrayList7 = this.f2033E;
                ArrayList arrayList8 = c0627a4.f2123a;
                int size5 = arrayList8.size() - 1;
                while (size5 >= 0) {
                    C0621K c0621k3 = (C0621K) arrayList8.get(size5);
                    int i21 = c0621k3.f2099a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 8:
                                    abstractComponentCallbacksC0641o = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0641o = c0621k3.f2100b;
                                    break;
                                case 10:
                                    c0621k3.f2106h = c0621k3.f2105g;
                                    break;
                            }
                            size5--;
                            i20 = 1;
                        }
                        arrayList7.add(c0621k3.f2100b);
                        size5--;
                        i20 = 1;
                    }
                    arrayList7.remove(c0621k3.f2100b);
                    size5--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList9 = this.f2033E;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList10 = c0627a4.f2123a;
                    if (i22 < arrayList10.size()) {
                        C0621K c0621k4 = (C0621K) arrayList10.get(i22);
                        int i23 = c0621k4.f2099a;
                        if (i23 != i8) {
                            int i24 = i8;
                            z3 = z4;
                            if (i23 != 2) {
                                if (i23 == 3 || i23 == 6) {
                                    arrayList9.remove(c0621k4.f2100b);
                                    AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o8 = c0621k4.f2100b;
                                    if (abstractComponentCallbacksC0641o8 == abstractComponentCallbacksC0641o) {
                                        arrayList10.add(i22, new C0621K(9, abstractComponentCallbacksC0641o8));
                                        i22++;
                                        i6 = i7;
                                        i5 = i24;
                                        abstractComponentCallbacksC0641o = null;
                                        i22 += i5;
                                        i8 = i5;
                                        z4 = z3;
                                        i7 = i6;
                                    }
                                } else if (i23 == 7) {
                                    i5 = i24;
                                } else if (i23 == 8) {
                                    arrayList10.add(i22, new C0621K(9, abstractComponentCallbacksC0641o));
                                    i22++;
                                    abstractComponentCallbacksC0641o = c0621k4.f2100b;
                                }
                                i6 = i7;
                                i5 = i24;
                                i22 += i5;
                                i8 = i5;
                                z4 = z3;
                                i7 = i6;
                            } else {
                                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o9 = c0621k4.f2100b;
                                int i25 = abstractComponentCallbacksC0641o9.f2241w;
                                int size6 = arrayList9.size() - 1;
                                int i26 = 0;
                                while (size6 >= 0) {
                                    int i27 = size6;
                                    AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o10 = (AbstractComponentCallbacksC0641o) arrayList9.get(size6);
                                    int i28 = i7;
                                    if (abstractComponentCallbacksC0641o10.f2241w == i25) {
                                        if (abstractComponentCallbacksC0641o10 == abstractComponentCallbacksC0641o9) {
                                            i26 = i24;
                                        } else {
                                            if (abstractComponentCallbacksC0641o10 == abstractComponentCallbacksC0641o) {
                                                arrayList10.add(i22, new C0621K(9, abstractComponentCallbacksC0641o10));
                                                i22++;
                                                abstractComponentCallbacksC0641o = null;
                                            }
                                            C0621K c0621k5 = new C0621K(3, abstractComponentCallbacksC0641o10);
                                            c0621k5.f2101c = c0621k4.f2101c;
                                            c0621k5.f2103e = c0621k4.f2103e;
                                            c0621k5.f2102d = c0621k4.f2102d;
                                            c0621k5.f2104f = c0621k4.f2104f;
                                            arrayList10.add(i22, c0621k5);
                                            arrayList9.remove(abstractComponentCallbacksC0641o10);
                                            i22++;
                                            abstractComponentCallbacksC0641o = abstractComponentCallbacksC0641o;
                                        }
                                    }
                                    size6 = i27 - 1;
                                    i7 = i28;
                                }
                                i6 = i7;
                                if (i26 != 0) {
                                    arrayList10.remove(i22);
                                    i22--;
                                    i5 = i24;
                                    i22 += i5;
                                    i8 = i5;
                                    z4 = z3;
                                    i7 = i6;
                                } else {
                                    i5 = i24;
                                    c0621k4.f2099a = i5;
                                    arrayList9.add(abstractComponentCallbacksC0641o9);
                                    i22 += i5;
                                    i8 = i5;
                                    z4 = z3;
                                    i7 = i6;
                                }
                            }
                        } else {
                            z3 = z4;
                            i5 = i8;
                        }
                        i6 = i7;
                        arrayList9.add(c0621k4.f2100b);
                        i22 += i5;
                        i8 = i5;
                        z4 = z3;
                        i7 = i6;
                    } else {
                        z2 = z4;
                        i4 = i7;
                    }
                }
            }
            z5 = z5 || c0627a4.f2129g;
            i7 = i4 + 1;
            z4 = z2;
        }
    }

    /* renamed from: z */
    public final AbstractComponentCallbacksC0641o m1605z(int i2) {
        C0176h c0176h = this.f2038c;
        ArrayList arrayList = (ArrayList) c0176h.f515b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = (AbstractComponentCallbacksC0641o) arrayList.get(size);
            if (abstractComponentCallbacksC0641o != null && abstractComponentCallbacksC0641o.f2240v == i2) {
                return abstractComponentCallbacksC0641o;
            }
        }
        for (C0620J c0620j : ((HashMap) c0176h.f516c).values()) {
            if (c0620j != null) {
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = c0620j.f2096c;
                if (abstractComponentCallbacksC0641o2.f2240v == i2) {
                    return abstractComponentCallbacksC0641o2;
                }
            }
        }
        return null;
    }
}
