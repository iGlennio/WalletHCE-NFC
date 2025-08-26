package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0593g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p002B.C0019i;
import p027K.AbstractC0272P;
import p030L.C0341h;
import p030L.C0342i;
import p043P0.RunnableC0402A;
import p047Q1.AbstractC0458e;
import p079f0.AbstractC0812H;
import p079f0.C0811G;
import p079f0.C0813I;
import p079f0.C0818N;
import p079f0.C0824U;
import p079f0.C0831a0;
import p079f0.C0833b0;
import p079f0.C0837d0;
import p079f0.C0839e0;
import p079f0.C0848l;
import p079f0.C0852p;
import p079f0.C0857u;
import p079f0.InterfaceC0823T;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0812H implements InterfaceC0823T {

    /* renamed from: B */
    public final C0019i f2441B;

    /* renamed from: C */
    public final int f2442C;

    /* renamed from: D */
    public boolean f2443D;

    /* renamed from: E */
    public boolean f2444E;

    /* renamed from: F */
    public C0837d0 f2445F;

    /* renamed from: G */
    public final Rect f2446G;

    /* renamed from: H */
    public final C0831a0 f2447H;

    /* renamed from: I */
    public final boolean f2448I;

    /* renamed from: J */
    public int[] f2449J;

    /* renamed from: K */
    public final RunnableC0402A f2450K;

    /* renamed from: p */
    public final int f2451p;

    /* renamed from: q */
    public final C0839e0[] f2452q;

    /* renamed from: r */
    public final AbstractC0593g f2453r;

    /* renamed from: s */
    public final AbstractC0593g f2454s;

    /* renamed from: t */
    public final int f2455t;

    /* renamed from: u */
    public int f2456u;

    /* renamed from: v */
    public final C0852p f2457v;

    /* renamed from: w */
    public boolean f2458w;

    /* renamed from: y */
    public final BitSet f2460y;

    /* renamed from: x */
    public boolean f2459x = false;

    /* renamed from: z */
    public int f2461z = -1;

    /* renamed from: A */
    public int f2440A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f2451p = -1;
        this.f2458w = false;
        C0019i c0019i = new C0019i(15, false);
        this.f2441B = c0019i;
        this.f2442C = 2;
        this.f2446G = new Rect();
        this.f2447H = new C0831a0(this);
        this.f2448I = true;
        this.f2450K = new RunnableC0402A(10, this);
        C0811G m2167I = AbstractC0812H.m2167I(context, attributeSet, i2, i3);
        int i4 = m2167I.f3212a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1780c(null);
        if (i4 != this.f2455t) {
            this.f2455t = i4;
            AbstractC0593g abstractC0593g = this.f2453r;
            this.f2453r = this.f2454s;
            this.f2454s = abstractC0593g;
            m2186l0();
        }
        int i5 = m2167I.f3213b;
        mo1780c(null);
        if (i5 != this.f2451p) {
            int[] iArr = (int[]) c0019i.f47b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0019i.f48c = null;
            m2186l0();
            this.f2451p = i5;
            this.f2460y = new BitSet(this.f2451p);
            this.f2452q = new C0839e0[this.f2451p];
            for (int i6 = 0; i6 < this.f2451p; i6++) {
                this.f2452q[i6] = new C0839e0(this, i6);
            }
            m2186l0();
        }
        boolean z2 = m2167I.f3214c;
        mo1780c(null);
        C0837d0 c0837d0 = this.f2445F;
        if (c0837d0 != null && c0837d0.f3338h != z2) {
            c0837d0.f3338h = z2;
        }
        this.f2458w = z2;
        m2186l0();
        C0852p c0852p = new C0852p();
        c0852p.f3435a = true;
        c0852p.f3440f = 0;
        c0852p.f3441g = 0;
        this.f2457v = c0852p;
        this.f2453r = AbstractC0593g.m1510a(this, this.f2455t);
        this.f2454s = AbstractC0593g.m1510a(this, 1 - this.f2455t);
    }

    /* renamed from: c1 */
    public static int m1850c1(int i2, int i3, int i4) {
        int mode;
        return (!(i3 == 0 && i4 == 0) && ((mode = View.MeasureSpec.getMode(i2)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    /* renamed from: A0 */
    public final boolean m1851A0() {
        int m1860J0;
        if (m2194v() != 0 && this.f2442C != 0 && this.f3222g) {
            if (this.f2459x) {
                m1860J0 = m1861K0();
                m1860J0();
            } else {
                m1860J0 = m1860J0();
                m1861K0();
            }
            C0019i c0019i = this.f2441B;
            if (m1860J0 == 0 && m1866O0() != null) {
                int[] iArr = (int[]) c0019i.f47b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0019i.f48c = null;
                this.f3221f = true;
                m2186l0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: B0 */
    public final int m1852B0(C0824U c0824u) {
        if (m2194v() == 0) {
            return 0;
        }
        AbstractC0593g abstractC0593g = this.f2453r;
        boolean z2 = !this.f2448I;
        return AbstractC0458e.m1194l(c0824u, abstractC0593g, m1857G0(z2), m1856F0(z2), this, this.f2448I);
    }

    /* renamed from: C0 */
    public final int m1853C0(C0824U c0824u) {
        if (m2194v() == 0) {
            return 0;
        }
        AbstractC0593g abstractC0593g = this.f2453r;
        boolean z2 = !this.f2448I;
        return AbstractC0458e.m1195m(c0824u, abstractC0593g, m1857G0(z2), m1856F0(z2), this, this.f2448I, this.f2459x);
    }

    /* renamed from: D0 */
    public final int m1854D0(C0824U c0824u) {
        if (m2194v() == 0) {
            return 0;
        }
        AbstractC0593g abstractC0593g = this.f2453r;
        boolean z2 = !this.f2448I;
        return AbstractC0458e.m1196n(c0824u, abstractC0593g, m1857G0(z2), m1856F0(z2), this, this.f2448I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* renamed from: E0 */
    public final int m1855E0(C0818N c0818n, C0852p c0852p, C0824U c0824u) {
        C0839e0 c0839e0;
        ?? r6;
        int i2;
        int m2238h;
        int mo1512c;
        int mo1520k;
        int mo1512c2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.f2460y.set(0, this.f2451p, true);
        C0852p c0852p2 = this.f2457v;
        int i8 = c0852p2.f3443i ? c0852p.f3439e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0852p.f3439e == 1 ? c0852p.f3441g + c0852p.f3436b : c0852p.f3440f - c0852p.f3436b;
        int i9 = c0852p.f3439e;
        for (int i10 = 0; i10 < this.f2451p; i10++) {
            if (!this.f2452q[i10].f3346a.isEmpty()) {
                m1880b1(this.f2452q[i10], i9, i8);
            }
        }
        int mo1516g = this.f2459x ? this.f2453r.mo1516g() : this.f2453r.mo1520k();
        boolean z2 = false;
        while (true) {
            int i11 = c0852p.f3437c;
            if (((i11 < 0 || i11 >= c0824u.m2211b()) ? i6 : i7) == 0 || (!c0852p2.f3443i && this.f2460y.isEmpty())) {
                break;
            }
            View view = c0818n.m2206i(c0852p.f3437c, Long.MAX_VALUE).f3280a;
            c0852p.f3437c += c0852p.f3438d;
            C0833b0 c0833b0 = (C0833b0) view.getLayoutParams();
            int m2215b = c0833b0.f3231a.m2215b();
            C0019i c0019i = this.f2441B;
            int[] iArr = (int[]) c0019i.f47b;
            int i12 = (iArr == null || m2215b >= iArr.length) ? -1 : iArr[m2215b];
            if (i12 == -1) {
                if (m1871S0(c0852p.f3439e)) {
                    i5 = this.f2451p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f2451p;
                    i5 = i6;
                }
                C0839e0 c0839e02 = null;
                if (c0852p.f3439e == i7) {
                    int mo1520k2 = this.f2453r.mo1520k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        C0839e0 c0839e03 = this.f2452q[i5];
                        int m2236f = c0839e03.m2236f(mo1520k2);
                        if (m2236f < i13) {
                            i13 = m2236f;
                            c0839e02 = c0839e03;
                        }
                        i5 += i3;
                    }
                } else {
                    int mo1516g2 = this.f2453r.mo1516g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        C0839e0 c0839e04 = this.f2452q[i5];
                        int m2238h2 = c0839e04.m2238h(mo1516g2);
                        if (m2238h2 > i14) {
                            c0839e02 = c0839e04;
                            i14 = m2238h2;
                        }
                        i5 += i3;
                    }
                }
                c0839e0 = c0839e02;
                c0019i.m79u(m2215b);
                ((int[]) c0019i.f47b)[m2215b] = c0839e0.f3350e;
            } else {
                c0839e0 = this.f2452q[i12];
            }
            c0833b0.f3315e = c0839e0;
            if (c0852p.f3439e == 1) {
                r6 = 0;
                m2181b(view, -1, false);
            } else {
                r6 = 0;
                m2181b(view, 0, false);
            }
            if (this.f2455t == 1) {
                i2 = 1;
                m1869Q0(view, AbstractC0812H.m2171w(r6, this.f2456u, this.f3227l, r6, ((ViewGroup.MarginLayoutParams) c0833b0).width), AbstractC0812H.m2171w(true, this.f3230o, this.f3228m, m2175D() + m2178G(), ((ViewGroup.MarginLayoutParams) c0833b0).height));
            } else {
                i2 = 1;
                m1869Q0(view, AbstractC0812H.m2171w(true, this.f3229n, this.f3227l, m2177F() + m2176E(), ((ViewGroup.MarginLayoutParams) c0833b0).width), AbstractC0812H.m2171w(false, this.f2456u, this.f3228m, 0, ((ViewGroup.MarginLayoutParams) c0833b0).height));
            }
            if (c0852p.f3439e == i2) {
                mo1512c = c0839e0.m2236f(mo1516g);
                m2238h = this.f2453r.mo1512c(view) + mo1512c;
            } else {
                m2238h = c0839e0.m2238h(mo1516g);
                mo1512c = m2238h - this.f2453r.mo1512c(view);
            }
            if (c0852p.f3439e == 1) {
                C0839e0 c0839e05 = c0833b0.f3315e;
                c0839e05.getClass();
                C0833b0 c0833b02 = (C0833b0) view.getLayoutParams();
                c0833b02.f3315e = c0839e05;
                ArrayList arrayList = c0839e05.f3346a;
                arrayList.add(view);
                c0839e05.f3348c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c0839e05.f3347b = Integer.MIN_VALUE;
                }
                if (c0833b02.f3231a.m2221h() || c0833b02.f3231a.m2224k()) {
                    c0839e05.f3349d = c0839e05.f3351f.f2453r.mo1512c(view) + c0839e05.f3349d;
                }
            } else {
                C0839e0 c0839e06 = c0833b0.f3315e;
                c0839e06.getClass();
                C0833b0 c0833b03 = (C0833b0) view.getLayoutParams();
                c0833b03.f3315e = c0839e06;
                ArrayList arrayList2 = c0839e06.f3346a;
                arrayList2.add(0, view);
                c0839e06.f3347b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c0839e06.f3348c = Integer.MIN_VALUE;
                }
                if (c0833b03.f3231a.m2221h() || c0833b03.f3231a.m2224k()) {
                    c0839e06.f3349d = c0839e06.f3351f.f2453r.mo1512c(view) + c0839e06.f3349d;
                }
            }
            if (m1868P0() && this.f2455t == 1) {
                mo1512c2 = this.f2454s.mo1516g() - (((this.f2451p - 1) - c0839e0.f3350e) * this.f2456u);
                mo1520k = mo1512c2 - this.f2454s.mo1512c(view);
            } else {
                mo1520k = this.f2454s.mo1520k() + (c0839e0.f3350e * this.f2456u);
                mo1512c2 = this.f2454s.mo1512c(view) + mo1520k;
            }
            if (this.f2455t == 1) {
                AbstractC0812H.m2169N(view, mo1520k, mo1512c, mo1512c2, m2238h);
            } else {
                AbstractC0812H.m2169N(view, mo1512c, mo1520k, m2238h, mo1512c2);
            }
            m1880b1(c0839e0, c0852p2.f3439e, i8);
            m1873U0(c0818n, c0852p2);
            if (c0852p2.f3442h && view.hasFocusable()) {
                this.f2460y.set(c0839e0.f3350e, false);
            }
            i7 = 1;
            z2 = true;
            i6 = 0;
        }
        if (!z2) {
            m1873U0(c0818n, c0852p2);
        }
        int mo1520k3 = c0852p2.f3439e == -1 ? this.f2453r.mo1520k() - m1863M0(this.f2453r.mo1520k()) : m1862L0(this.f2453r.mo1516g()) - this.f2453r.mo1516g();
        if (mo1520k3 > 0) {
            return Math.min(c0852p.f3436b, mo1520k3);
        }
        return 0;
    }

    /* renamed from: F0 */
    public final View m1856F0(boolean z2) {
        int mo1520k = this.f2453r.mo1520k();
        int mo1516g = this.f2453r.mo1516g();
        View view = null;
        for (int m2194v = m2194v() - 1; m2194v >= 0; m2194v--) {
            View m2192u = m2192u(m2194v);
            int mo1514e = this.f2453r.mo1514e(m2192u);
            int mo1511b = this.f2453r.mo1511b(m2192u);
            if (mo1511b > mo1520k && mo1514e < mo1516g) {
                if (mo1511b <= mo1516g || !z2) {
                    return m2192u;
                }
                if (view == null) {
                    view = m2192u;
                }
            }
        }
        return view;
    }

    /* renamed from: G0 */
    public final View m1857G0(boolean z2) {
        int mo1520k = this.f2453r.mo1520k();
        int mo1516g = this.f2453r.mo1516g();
        int m2194v = m2194v();
        View view = null;
        for (int i2 = 0; i2 < m2194v; i2++) {
            View m2192u = m2192u(i2);
            int mo1514e = this.f2453r.mo1514e(m2192u);
            if (this.f2453r.mo1511b(m2192u) > mo1520k && mo1514e < mo1516g) {
                if (mo1514e >= mo1520k || !z2) {
                    return m2192u;
                }
                if (view == null) {
                    view = m2192u;
                }
            }
        }
        return view;
    }

    /* renamed from: H0 */
    public final void m1858H0(C0818N c0818n, C0824U c0824u, boolean z2) {
        int mo1516g;
        int m1862L0 = m1862L0(Integer.MIN_VALUE);
        if (m1862L0 != Integer.MIN_VALUE && (mo1516g = this.f2453r.mo1516g() - m1862L0) > 0) {
            int i2 = mo1516g - (-m1877Y0(-mo1516g, c0818n, c0824u));
            if (!z2 || i2 <= 0) {
                return;
            }
            this.f2453r.mo1524o(i2);
        }
    }

    /* renamed from: I0 */
    public final void m1859I0(C0818N c0818n, C0824U c0824u, boolean z2) {
        int mo1520k;
        int m1863M0 = m1863M0(Integer.MAX_VALUE);
        if (m1863M0 != Integer.MAX_VALUE && (mo1520k = m1863M0 - this.f2453r.mo1520k()) > 0) {
            int m1877Y0 = mo1520k - m1877Y0(mo1520k, c0818n, c0824u);
            if (!z2 || m1877Y0 <= 0) {
                return;
            }
            this.f2453r.mo1524o(-m1877Y0);
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: J */
    public final int mo1717J(C0818N c0818n, C0824U c0824u) {
        return this.f2455t == 0 ? this.f2451p : super.mo1717J(c0818n, c0824u);
    }

    /* renamed from: J0 */
    public final int m1860J0() {
        if (m2194v() == 0) {
            return 0;
        }
        return AbstractC0812H.m2166H(m2192u(0));
    }

    /* renamed from: K0 */
    public final int m1861K0() {
        int m2194v = m2194v();
        if (m2194v == 0) {
            return 0;
        }
        return AbstractC0812H.m2166H(m2192u(m2194v - 1));
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: L */
    public final boolean mo1763L() {
        return this.f2442C != 0;
    }

    /* renamed from: L0 */
    public final int m1862L0(int i2) {
        int m2236f = this.f2452q[0].m2236f(i2);
        for (int i3 = 1; i3 < this.f2451p; i3++) {
            int m2236f2 = this.f2452q[i3].m2236f(i2);
            if (m2236f2 > m2236f) {
                m2236f = m2236f2;
            }
        }
        return m2236f;
    }

    /* renamed from: M0 */
    public final int m1863M0(int i2) {
        int m2238h = this.f2452q[0].m2238h(i2);
        for (int i3 = 1; i3 < this.f2451p; i3++) {
            int m2238h2 = this.f2452q[i3].m2238h(i2);
            if (m2238h2 < m2238h) {
                m2238h = m2238h2;
            }
        }
        return m2238h;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1864N0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1864N0(int, int, int):void");
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: O */
    public final void mo1865O(int i2) {
        super.mo1865O(i2);
        for (int i3 = 0; i3 < this.f2451p; i3++) {
            C0839e0 c0839e0 = this.f2452q[i3];
            int i4 = c0839e0.f3347b;
            if (i4 != Integer.MIN_VALUE) {
                c0839e0.f3347b = i4 + i2;
            }
            int i5 = c0839e0.f3348c;
            if (i5 != Integer.MIN_VALUE) {
                c0839e0.f3348c = i5 + i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m1866O0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1866O0():android.view.View");
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: P */
    public final void mo1867P(int i2) {
        super.mo1867P(i2);
        for (int i3 = 0; i3 < this.f2451p; i3++) {
            C0839e0 c0839e0 = this.f2452q[i3];
            int i4 = c0839e0.f3347b;
            if (i4 != Integer.MIN_VALUE) {
                c0839e0.f3347b = i4 + i2;
            }
            int i5 = c0839e0.f3348c;
            if (i5 != Integer.MIN_VALUE) {
                c0839e0.f3348c = i5 + i2;
            }
        }
    }

    /* renamed from: P0 */
    public final boolean m1868P0() {
        return m2174C() == 1;
    }

    /* renamed from: Q0 */
    public final void m1869Q0(View view, int i2, int i3) {
        RecyclerView recyclerView = this.f3217b;
        Rect rect = this.f2446G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1809J(view));
        }
        C0833b0 c0833b0 = (C0833b0) view.getLayoutParams();
        int m1850c1 = m1850c1(i2, ((ViewGroup.MarginLayoutParams) c0833b0).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0833b0).rightMargin + rect.right);
        int m1850c12 = m1850c1(i3, ((ViewGroup.MarginLayoutParams) c0833b0).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0833b0).bottomMargin + rect.bottom);
        if (m2193u0(view, m1850c1, m1850c12, c0833b0)) {
            view.measure(m1850c1, m1850c12);
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: R */
    public final void mo1769R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3217b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2450K);
        }
        for (int i2 = 0; i2 < this.f2451p; i2++) {
            this.f2452q[i2].m2232b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r12 < m1860J0()) != r16.f2459x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x041c, code lost:
    
        if (m1851A0() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f2459x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r12 = false;
     */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1870R0(p079f0.C0818N r17, p079f0.C0824U r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1870R0(f0.N, f0.U, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f2455t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f2455t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (m1868P0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (m1868P0() == false) goto L37;
     */
    @Override // p079f0.AbstractC0812H
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1719S(android.view.View r9, int r10, p079f0.C0818N r11, p079f0.C0824U r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1719S(android.view.View, int, f0.N, f0.U):android.view.View");
    }

    /* renamed from: S0 */
    public final boolean m1871S0(int i2) {
        if (this.f2455t == 0) {
            return (i2 == -1) != this.f2459x;
        }
        return ((i2 == -1) == this.f2459x) == m1868P0();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: T */
    public final void mo1772T(AccessibilityEvent accessibilityEvent) {
        super.mo1772T(accessibilityEvent);
        if (m2194v() > 0) {
            View m1857G0 = m1857G0(false);
            View m1856F0 = m1856F0(false);
            if (m1857G0 == null || m1856F0 == null) {
                return;
            }
            int m2166H = AbstractC0812H.m2166H(m1857G0);
            int m2166H2 = AbstractC0812H.m2166H(m1856F0);
            if (m2166H < m2166H2) {
                accessibilityEvent.setFromIndex(m2166H);
                accessibilityEvent.setToIndex(m2166H2);
            } else {
                accessibilityEvent.setFromIndex(m2166H2);
                accessibilityEvent.setToIndex(m2166H);
            }
        }
    }

    /* renamed from: T0 */
    public final void m1872T0(int i2, C0824U c0824u) {
        int m1860J0;
        int i3;
        if (i2 > 0) {
            m1860J0 = m1861K0();
            i3 = 1;
        } else {
            m1860J0 = m1860J0();
            i3 = -1;
        }
        C0852p c0852p = this.f2457v;
        c0852p.f3435a = true;
        m1879a1(m1860J0, c0824u);
        m1878Z0(i3);
        c0852p.f3437c = m1860J0 + c0852p.f3438d;
        c0852p.f3436b = Math.abs(i2);
    }

    /* renamed from: U0 */
    public final void m1873U0(C0818N c0818n, C0852p c0852p) {
        if (!c0852p.f3435a || c0852p.f3443i) {
            return;
        }
        if (c0852p.f3436b == 0) {
            if (c0852p.f3439e == -1) {
                m1874V0(c0818n, c0852p.f3441g);
                return;
            } else {
                m1875W0(c0818n, c0852p.f3440f);
                return;
            }
        }
        int i2 = 1;
        if (c0852p.f3439e == -1) {
            int i3 = c0852p.f3440f;
            int m2238h = this.f2452q[0].m2238h(i3);
            while (i2 < this.f2451p) {
                int m2238h2 = this.f2452q[i2].m2238h(i3);
                if (m2238h2 > m2238h) {
                    m2238h = m2238h2;
                }
                i2++;
            }
            int i4 = i3 - m2238h;
            m1874V0(c0818n, i4 < 0 ? c0852p.f3441g : c0852p.f3441g - Math.min(i4, c0852p.f3436b));
            return;
        }
        int i5 = c0852p.f3441g;
        int m2236f = this.f2452q[0].m2236f(i5);
        while (i2 < this.f2451p) {
            int m2236f2 = this.f2452q[i2].m2236f(i5);
            if (m2236f2 < m2236f) {
                m2236f = m2236f2;
            }
            i2++;
        }
        int i6 = m2236f - c0852p.f3441g;
        m1875W0(c0818n, i6 < 0 ? c0852p.f3440f : Math.min(i6, c0852p.f3436b) + c0852p.f3440f);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: V */
    public final void mo1722V(C0818N c0818n, C0824U c0824u, View view, C0342i c0342i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0833b0)) {
            m2180U(view, c0342i);
            return;
        }
        C0833b0 c0833b0 = (C0833b0) layoutParams;
        if (this.f2455t == 0) {
            C0839e0 c0839e0 = c0833b0.f3315e;
            c0342i.m997j(C0341h.m987a(c0839e0 != null ? c0839e0.f3350e : -1, 1, -1, -1, false, false));
        } else {
            C0839e0 c0839e02 = c0833b0.f3315e;
            c0342i.m997j(C0341h.m987a(-1, -1, c0839e02 != null ? c0839e02.f3350e : -1, 1, false, false));
        }
    }

    /* renamed from: V0 */
    public final void m1874V0(C0818N c0818n, int i2) {
        for (int m2194v = m2194v() - 1; m2194v >= 0; m2194v--) {
            View m2192u = m2192u(m2194v);
            if (this.f2453r.mo1514e(m2192u) < i2 || this.f2453r.mo1523n(m2192u) < i2) {
                return;
            }
            C0833b0 c0833b0 = (C0833b0) m2192u.getLayoutParams();
            c0833b0.getClass();
            if (c0833b0.f3315e.f3346a.size() == 1) {
                return;
            }
            C0839e0 c0839e0 = c0833b0.f3315e;
            ArrayList arrayList = c0839e0.f3346a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C0833b0 c0833b02 = (C0833b0) view.getLayoutParams();
            c0833b02.f3315e = null;
            if (c0833b02.f3231a.m2221h() || c0833b02.f3231a.m2224k()) {
                c0839e0.f3349d -= c0839e0.f3351f.f2453r.mo1512c(view);
            }
            if (size == 1) {
                c0839e0.f3347b = Integer.MIN_VALUE;
            }
            c0839e0.f3348c = Integer.MIN_VALUE;
            m2184i0(m2192u, c0818n);
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: W */
    public final void mo1723W(int i2, int i3) {
        m1864N0(i2, i3, 1);
    }

    /* renamed from: W0 */
    public final void m1875W0(C0818N c0818n, int i2) {
        while (m2194v() > 0) {
            View m2192u = m2192u(0);
            if (this.f2453r.mo1511b(m2192u) > i2 || this.f2453r.mo1522m(m2192u) > i2) {
                return;
            }
            C0833b0 c0833b0 = (C0833b0) m2192u.getLayoutParams();
            c0833b0.getClass();
            if (c0833b0.f3315e.f3346a.size() == 1) {
                return;
            }
            C0839e0 c0839e0 = c0833b0.f3315e;
            ArrayList arrayList = c0839e0.f3346a;
            View view = (View) arrayList.remove(0);
            C0833b0 c0833b02 = (C0833b0) view.getLayoutParams();
            c0833b02.f3315e = null;
            if (arrayList.size() == 0) {
                c0839e0.f3348c = Integer.MIN_VALUE;
            }
            if (c0833b02.f3231a.m2221h() || c0833b02.f3231a.m2224k()) {
                c0839e0.f3349d -= c0839e0.f3351f.f2453r.mo1512c(view);
            }
            c0839e0.f3347b = Integer.MIN_VALUE;
            m2184i0(m2192u, c0818n);
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: X */
    public final void mo1724X() {
        C0019i c0019i = this.f2441B;
        int[] iArr = (int[]) c0019i.f47b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0019i.f48c = null;
        m2186l0();
    }

    /* renamed from: X0 */
    public final void m1876X0() {
        if (this.f2455t == 1 || !m1868P0()) {
            this.f2459x = this.f2458w;
        } else {
            this.f2459x = !this.f2458w;
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: Y */
    public final void mo1725Y(int i2, int i3) {
        m1864N0(i2, i3, 8);
    }

    /* renamed from: Y0 */
    public final int m1877Y0(int i2, C0818N c0818n, C0824U c0824u) {
        if (m2194v() == 0 || i2 == 0) {
            return 0;
        }
        m1872T0(i2, c0824u);
        C0852p c0852p = this.f2457v;
        int m1855E0 = m1855E0(c0818n, c0852p, c0824u);
        if (c0852p.f3436b >= m1855E0) {
            i2 = i2 < 0 ? -m1855E0 : m1855E0;
        }
        this.f2453r.mo1524o(-i2);
        this.f2443D = this.f2459x;
        c0852p.f3436b = 0;
        m1873U0(c0818n, c0852p);
        return i2;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: Z */
    public final void mo1726Z(int i2, int i3) {
        m1864N0(i2, i3, 2);
    }

    /* renamed from: Z0 */
    public final void m1878Z0(int i2) {
        C0852p c0852p = this.f2457v;
        c0852p.f3439e = i2;
        c0852p.f3438d = this.f2459x != (i2 == -1) ? -1 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < m1860J0()) != r3.f2459x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f2459x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // p079f0.InterfaceC0823T
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF mo1778a(int r4) {
        /*
            r3 = this;
            int r0 = r3.m2194v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f2459x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.m1860J0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f2459x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f2455t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1778a(int):android.graphics.PointF");
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: a0 */
    public final void mo1727a0(int i2, int i3) {
        m1864N0(i2, i3, 4);
    }

    /* renamed from: a1 */
    public final void m1879a1(int i2, C0824U c0824u) {
        int i3;
        int i4;
        int i5;
        C0852p c0852p = this.f2457v;
        boolean z2 = false;
        c0852p.f3436b = 0;
        c0852p.f3437c = i2;
        C0857u c0857u = this.f3220e;
        if (!(c0857u != null && c0857u.f3472e) || (i5 = c0824u.f3258a) == -1) {
            i3 = 0;
            i4 = 0;
        } else {
            if (this.f2459x == (i5 < i2)) {
                i3 = this.f2453r.mo1521l();
                i4 = 0;
            } else {
                i4 = this.f2453r.mo1521l();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView == null || !recyclerView.f2408g) {
            c0852p.f3441g = this.f2453r.mo1515f() + i3;
            c0852p.f3440f = -i4;
        } else {
            c0852p.f3440f = this.f2453r.mo1520k() - i4;
            c0852p.f3441g = this.f2453r.mo1516g() + i3;
        }
        c0852p.f3442h = false;
        c0852p.f3435a = true;
        if (this.f2453r.mo1518i() == 0 && this.f2453r.mo1515f() == 0) {
            z2 = true;
        }
        c0852p.f3443i = z2;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: b0 */
    public final void mo1729b0(C0818N c0818n, C0824U c0824u) {
        m1870R0(c0818n, c0824u, true);
    }

    /* renamed from: b1 */
    public final void m1880b1(C0839e0 c0839e0, int i2, int i3) {
        int i4 = c0839e0.f3349d;
        int i5 = c0839e0.f3350e;
        if (i2 != -1) {
            int i6 = c0839e0.f3348c;
            if (i6 == Integer.MIN_VALUE) {
                c0839e0.m2231a();
                i6 = c0839e0.f3348c;
            }
            if (i6 - i4 >= i3) {
                this.f2460y.set(i5, false);
                return;
            }
            return;
        }
        int i7 = c0839e0.f3347b;
        if (i7 == Integer.MIN_VALUE) {
            View view = (View) c0839e0.f3346a.get(0);
            C0833b0 c0833b0 = (C0833b0) view.getLayoutParams();
            c0839e0.f3347b = c0839e0.f3351f.f2453r.mo1514e(view);
            c0833b0.getClass();
            i7 = c0839e0.f3347b;
        }
        if (i7 + i4 <= i3) {
            this.f2460y.set(i5, false);
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: c */
    public final void mo1780c(String str) {
        if (this.f2445F == null) {
            super.mo1780c(str);
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: c0 */
    public final void mo1730c0(C0824U c0824u) {
        this.f2461z = -1;
        this.f2440A = Integer.MIN_VALUE;
        this.f2445F = null;
        this.f2447H.m2230a();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: d */
    public final boolean mo1782d() {
        return this.f2455t == 0;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: d0 */
    public final void mo1783d0(Parcelable parcelable) {
        if (parcelable instanceof C0837d0) {
            this.f2445F = (C0837d0) parcelable;
            m2186l0();
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: e */
    public final boolean mo1785e() {
        return this.f2455t == 1;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: e0 */
    public final Parcelable mo1786e0() {
        int m2238h;
        int mo1520k;
        int[] iArr;
        C0837d0 c0837d0 = this.f2445F;
        if (c0837d0 != null) {
            C0837d0 c0837d02 = new C0837d0();
            c0837d02.f3333c = c0837d0.f3333c;
            c0837d02.f3331a = c0837d0.f3331a;
            c0837d02.f3332b = c0837d0.f3332b;
            c0837d02.f3334d = c0837d0.f3334d;
            c0837d02.f3335e = c0837d0.f3335e;
            c0837d02.f3336f = c0837d0.f3336f;
            c0837d02.f3338h = c0837d0.f3338h;
            c0837d02.f3339i = c0837d0.f3339i;
            c0837d02.f3340j = c0837d0.f3340j;
            c0837d02.f3337g = c0837d0.f3337g;
            return c0837d02;
        }
        C0837d0 c0837d03 = new C0837d0();
        c0837d03.f3338h = this.f2458w;
        c0837d03.f3339i = this.f2443D;
        c0837d03.f3340j = this.f2444E;
        C0019i c0019i = this.f2441B;
        if (c0019i == null || (iArr = (int[]) c0019i.f47b) == null) {
            c0837d03.f3335e = 0;
        } else {
            c0837d03.f3336f = iArr;
            c0837d03.f3335e = iArr.length;
            c0837d03.f3337g = (ArrayList) c0019i.f48c;
        }
        if (m2194v() <= 0) {
            c0837d03.f3331a = -1;
            c0837d03.f3332b = -1;
            c0837d03.f3333c = 0;
            return c0837d03;
        }
        c0837d03.f3331a = this.f2443D ? m1861K0() : m1860J0();
        View m1856F0 = this.f2459x ? m1856F0(true) : m1857G0(true);
        c0837d03.f3332b = m1856F0 != null ? AbstractC0812H.m2166H(m1856F0) : -1;
        int i2 = this.f2451p;
        c0837d03.f3333c = i2;
        c0837d03.f3334d = new int[i2];
        for (int i3 = 0; i3 < this.f2451p; i3++) {
            if (this.f2443D) {
                m2238h = this.f2452q[i3].m2236f(Integer.MIN_VALUE);
                if (m2238h != Integer.MIN_VALUE) {
                    mo1520k = this.f2453r.mo1516g();
                    m2238h -= mo1520k;
                    c0837d03.f3334d[i3] = m2238h;
                } else {
                    c0837d03.f3334d[i3] = m2238h;
                }
            } else {
                m2238h = this.f2452q[i3].m2238h(Integer.MIN_VALUE);
                if (m2238h != Integer.MIN_VALUE) {
                    mo1520k = this.f2453r.mo1520k();
                    m2238h -= mo1520k;
                    c0837d03.f3334d[i3] = m2238h;
                } else {
                    c0837d03.f3334d[i3] = m2238h;
                }
            }
        }
        return c0837d03;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: f */
    public final boolean mo1732f(C0813I c0813i) {
        return c0813i instanceof C0833b0;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: f0 */
    public final void mo1881f0(int i2) {
        if (i2 == 0) {
            m1851A0();
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: h */
    public final void mo1787h(int i2, int i3, C0824U c0824u, C0848l c0848l) {
        C0852p c0852p;
        int m2236f;
        int i4;
        if (this.f2455t != 0) {
            i2 = i3;
        }
        if (m2194v() == 0 || i2 == 0) {
            return;
        }
        m1872T0(i2, c0824u);
        int[] iArr = this.f2449J;
        if (iArr == null || iArr.length < this.f2451p) {
            this.f2449J = new int[this.f2451p];
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = this.f2451p;
            c0852p = this.f2457v;
            if (i5 >= i7) {
                break;
            }
            if (c0852p.f3438d == -1) {
                m2236f = c0852p.f3440f;
                i4 = this.f2452q[i5].m2238h(m2236f);
            } else {
                m2236f = this.f2452q[i5].m2236f(c0852p.f3441g);
                i4 = c0852p.f3441g;
            }
            int i8 = m2236f - i4;
            if (i8 >= 0) {
                this.f2449J[i6] = i8;
                i6++;
            }
            i5++;
        }
        Arrays.sort(this.f2449J, 0, i6);
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = c0852p.f3437c;
            if (i10 < 0 || i10 >= c0824u.m2211b()) {
                return;
            }
            c0848l.m2252a(c0852p.f3437c, this.f2449J[i9]);
            c0852p.f3437c += c0852p.f3438d;
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: j */
    public final int mo1789j(C0824U c0824u) {
        return m1852B0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: k */
    public final int mo1738k(C0824U c0824u) {
        return m1853C0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: l */
    public final int mo1740l(C0824U c0824u) {
        return m1854D0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: m */
    public final int mo1790m(C0824U c0824u) {
        return m1852B0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: m0 */
    public final int mo1742m0(int i2, C0818N c0818n, C0824U c0824u) {
        return m1877Y0(i2, c0818n, c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: n */
    public final int mo1744n(C0824U c0824u) {
        return m1853C0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: n0 */
    public final void mo1791n0(int i2) {
        C0837d0 c0837d0 = this.f2445F;
        if (c0837d0 != null && c0837d0.f3331a != i2) {
            c0837d0.f3334d = null;
            c0837d0.f3333c = 0;
            c0837d0.f3331a = -1;
            c0837d0.f3332b = -1;
        }
        this.f2461z = i2;
        this.f2440A = Integer.MIN_VALUE;
        m2186l0();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: o */
    public final int mo1745o(C0824U c0824u) {
        return m1854D0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: o0 */
    public final int mo1746o0(int i2, C0818N c0818n, C0824U c0824u) {
        return m1877Y0(i2, c0818n, c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: r */
    public final C0813I mo1747r() {
        return this.f2455t == 0 ? new C0833b0(-2, -1) : new C0833b0(-1, -2);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: r0 */
    public final void mo1748r0(Rect rect, int i2, int i3) {
        int m2170g;
        int m2170g2;
        int i4 = this.f2451p;
        int m2177F = m2177F() + m2176E();
        int m2175D = m2175D() + m2178G();
        if (this.f2455t == 1) {
            int height = rect.height() + m2175D;
            RecyclerView recyclerView = this.f3217b;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            m2170g2 = AbstractC0812H.m2170g(i3, height, recyclerView.getMinimumHeight());
            m2170g = AbstractC0812H.m2170g(i2, (this.f2456u * i4) + m2177F, this.f3217b.getMinimumWidth());
        } else {
            int width = rect.width() + m2177F;
            RecyclerView recyclerView2 = this.f3217b;
            WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
            m2170g = AbstractC0812H.m2170g(i2, width, recyclerView2.getMinimumWidth());
            m2170g2 = AbstractC0812H.m2170g(i3, (this.f2456u * i4) + m2175D, this.f3217b.getMinimumHeight());
        }
        this.f3217b.setMeasuredDimension(m2170g, m2170g2);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: s */
    public final C0813I mo1749s(Context context, AttributeSet attributeSet) {
        return new C0833b0(context, attributeSet);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: t */
    public final C0813I mo1750t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0833b0((ViewGroup.MarginLayoutParams) layoutParams) : new C0833b0(layoutParams);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: x */
    public final int mo1751x(C0818N c0818n, C0824U c0824u) {
        return this.f2455t == 1 ? this.f2451p : super.mo1751x(c0818n, c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: x0 */
    public final void mo1794x0(RecyclerView recyclerView, int i2) {
        C0857u c0857u = new C0857u(recyclerView.getContext());
        c0857u.f3468a = i2;
        m2196y0(c0857u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: z0 */
    public final boolean mo1752z0() {
        return this.f2445F == null;
    }
}
