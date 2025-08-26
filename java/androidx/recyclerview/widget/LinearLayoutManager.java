package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0593g;
import p005C.AbstractC0044g;
import p047Q1.AbstractC0458e;
import p079f0.AbstractC0812H;
import p079f0.C0811G;
import p079f0.C0813I;
import p079f0.C0818N;
import p079f0.C0824U;
import p079f0.C0848l;
import p079f0.C0853q;
import p079f0.C0854r;
import p079f0.C0855s;
import p079f0.C0856t;
import p079f0.C0857u;
import p079f0.InterfaceC0823T;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0812H implements InterfaceC0823T {

    /* renamed from: A */
    public final C0853q f2355A;

    /* renamed from: B */
    public final C0854r f2356B;

    /* renamed from: C */
    public final int f2357C;

    /* renamed from: D */
    public final int[] f2358D;

    /* renamed from: p */
    public int f2359p;

    /* renamed from: q */
    public C0855s f2360q;

    /* renamed from: r */
    public AbstractC0593g f2361r;

    /* renamed from: s */
    public boolean f2362s;

    /* renamed from: t */
    public final boolean f2363t;

    /* renamed from: u */
    public boolean f2364u;

    /* renamed from: v */
    public boolean f2365v;

    /* renamed from: w */
    public final boolean f2366w;

    /* renamed from: x */
    public int f2367x;

    /* renamed from: y */
    public int f2368y;

    /* renamed from: z */
    public C0856t f2369z;

    public LinearLayoutManager(int i2) {
        this.f2359p = 1;
        this.f2363t = false;
        this.f2364u = false;
        this.f2365v = false;
        this.f2366w = true;
        this.f2367x = -1;
        this.f2368y = Integer.MIN_VALUE;
        this.f2369z = null;
        this.f2355A = new C0853q();
        this.f2356B = new C0854r();
        this.f2357C = 2;
        this.f2358D = new int[2];
        m1777Z0(i2);
        mo1780c(null);
        if (this.f2363t) {
            this.f2363t = false;
            m2186l0();
        }
    }

    /* renamed from: A0 */
    public void mo1753A0(C0824U c0824u, int[] iArr) {
        int i2;
        int mo1521l = c0824u.f3258a != -1 ? this.f2361r.mo1521l() : 0;
        if (this.f2360q.f3458f == -1) {
            i2 = 0;
        } else {
            i2 = mo1521l;
            mo1521l = 0;
        }
        iArr[0] = mo1521l;
        iArr[1] = i2;
    }

    /* renamed from: B0 */
    public void mo1716B0(C0824U c0824u, C0855s c0855s, C0848l c0848l) {
        int i2 = c0855s.f3456d;
        if (i2 < 0 || i2 >= c0824u.m2211b()) {
            return;
        }
        c0848l.m2252a(i2, Math.max(0, c0855s.f3459g));
    }

    /* renamed from: C0 */
    public final int m1754C0(C0824U c0824u) {
        if (m2194v() == 0) {
            return 0;
        }
        m1758G0();
        AbstractC0593g abstractC0593g = this.f2361r;
        boolean z2 = !this.f2366w;
        return AbstractC0458e.m1194l(c0824u, abstractC0593g, m1761J0(z2), m1760I0(z2), this, this.f2366w);
    }

    /* renamed from: D0 */
    public final int m1755D0(C0824U c0824u) {
        if (m2194v() == 0) {
            return 0;
        }
        m1758G0();
        AbstractC0593g abstractC0593g = this.f2361r;
        boolean z2 = !this.f2366w;
        return AbstractC0458e.m1195m(c0824u, abstractC0593g, m1761J0(z2), m1760I0(z2), this, this.f2366w, this.f2364u);
    }

    /* renamed from: E0 */
    public final int m1756E0(C0824U c0824u) {
        if (m2194v() == 0) {
            return 0;
        }
        m1758G0();
        AbstractC0593g abstractC0593g = this.f2361r;
        boolean z2 = !this.f2366w;
        return AbstractC0458e.m1196n(c0824u, abstractC0593g, m1761J0(z2), m1760I0(z2), this, this.f2366w);
    }

    /* renamed from: F0 */
    public final int m1757F0(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f2359p == 1) ? 1 : Integer.MIN_VALUE : this.f2359p == 0 ? 1 : Integer.MIN_VALUE : this.f2359p == 1 ? -1 : Integer.MIN_VALUE : this.f2359p == 0 ? -1 : Integer.MIN_VALUE : (this.f2359p != 1 && m1771S0()) ? -1 : 1 : (this.f2359p != 1 && m1771S0()) ? 1 : -1;
    }

    /* renamed from: G0 */
    public final void m1758G0() {
        if (this.f2360q == null) {
            C0855s c0855s = new C0855s();
            c0855s.f3453a = true;
            c0855s.f3460h = 0;
            c0855s.f3461i = 0;
            c0855s.f3463k = null;
            this.f2360q = c0855s;
        }
    }

    /* renamed from: H0 */
    public final int m1759H0(C0818N c0818n, C0855s c0855s, C0824U c0824u, boolean z2) {
        int i2;
        int i3 = c0855s.f3455c;
        int i4 = c0855s.f3459g;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                c0855s.f3459g = i4 + i3;
            }
            m1773V0(c0818n, c0855s);
        }
        int i5 = c0855s.f3455c + c0855s.f3460h;
        while (true) {
            if ((!c0855s.f3464l && i5 <= 0) || (i2 = c0855s.f3456d) < 0 || i2 >= c0824u.m2211b()) {
                break;
            }
            C0854r c0854r = this.f2356B;
            c0854r.f3449a = 0;
            c0854r.f3450b = false;
            c0854r.f3451c = false;
            c0854r.f3452d = false;
            mo1720T0(c0818n, c0824u, c0855s, c0854r);
            if (!c0854r.f3450b) {
                int i6 = c0855s.f3454b;
                int i7 = c0854r.f3449a;
                c0855s.f3454b = (c0855s.f3458f * i7) + i6;
                if (!c0854r.f3451c || c0855s.f3463k != null || !c0824u.f3264g) {
                    c0855s.f3455c -= i7;
                    i5 -= i7;
                }
                int i8 = c0855s.f3459g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + i7;
                    c0855s.f3459g = i9;
                    int i10 = c0855s.f3455c;
                    if (i10 < 0) {
                        c0855s.f3459g = i9 + i10;
                    }
                    m1773V0(c0818n, c0855s);
                }
                if (z2 && c0854r.f3452d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - c0855s.f3455c;
    }

    /* renamed from: I0 */
    public final View m1760I0(boolean z2) {
        return this.f2364u ? m1765M0(0, m2194v(), z2) : m1765M0(m2194v() - 1, -1, z2);
    }

    /* renamed from: J0 */
    public final View m1761J0(boolean z2) {
        return this.f2364u ? m1765M0(m2194v() - 1, -1, z2) : m1765M0(0, m2194v(), z2);
    }

    /* renamed from: K0 */
    public final int m1762K0() {
        View m1765M0 = m1765M0(m2194v() - 1, -1, false);
        if (m1765M0 == null) {
            return -1;
        }
        return AbstractC0812H.m2166H(m1765M0);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: L */
    public final boolean mo1763L() {
        return true;
    }

    /* renamed from: L0 */
    public final View m1764L0(int i2, int i3) {
        int i4;
        int i5;
        m1758G0();
        if (i3 <= i2 && i3 >= i2) {
            return m2192u(i2);
        }
        if (this.f2361r.mo1514e(m2192u(i2)) < this.f2361r.mo1520k()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.f2359p == 0 ? this.f3218c.m80v(i2, i3, i4, i5) : this.f3219d.m80v(i2, i3, i4, i5);
    }

    /* renamed from: M0 */
    public final View m1765M0(int i2, int i3, boolean z2) {
        m1758G0();
        int i4 = z2 ? 24579 : 320;
        return this.f2359p == 0 ? this.f3218c.m80v(i2, i3, i4, 320) : this.f3219d.m80v(i2, i3, i4, 320);
    }

    /* renamed from: N0 */
    public View mo1718N0(C0818N c0818n, C0824U c0824u, int i2, int i3, int i4) {
        m1758G0();
        int mo1520k = this.f2361r.mo1520k();
        int mo1516g = this.f2361r.mo1516g();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View m2192u = m2192u(i2);
            int m2166H = AbstractC0812H.m2166H(m2192u);
            if (m2166H >= 0 && m2166H < i4) {
                if (((C0813I) m2192u.getLayoutParams()).f3231a.m2221h()) {
                    if (view2 == null) {
                        view2 = m2192u;
                    }
                } else {
                    if (this.f2361r.mo1514e(m2192u) < mo1516g && this.f2361r.mo1511b(m2192u) >= mo1520k) {
                        return m2192u;
                    }
                    if (view == null) {
                        view = m2192u;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    /* renamed from: O0 */
    public final int m1766O0(int i2, C0818N c0818n, C0824U c0824u, boolean z2) {
        int mo1516g;
        int mo1516g2 = this.f2361r.mo1516g() - i2;
        if (mo1516g2 <= 0) {
            return 0;
        }
        int i3 = -m1776Y0(-mo1516g2, c0818n, c0824u);
        int i4 = i2 + i3;
        if (!z2 || (mo1516g = this.f2361r.mo1516g() - i4) <= 0) {
            return i3;
        }
        this.f2361r.mo1524o(mo1516g);
        return mo1516g + i3;
    }

    /* renamed from: P0 */
    public final int m1767P0(int i2, C0818N c0818n, C0824U c0824u, boolean z2) {
        int mo1520k;
        int mo1520k2 = i2 - this.f2361r.mo1520k();
        if (mo1520k2 <= 0) {
            return 0;
        }
        int i3 = -m1776Y0(mo1520k2, c0818n, c0824u);
        int i4 = i2 + i3;
        if (!z2 || (mo1520k = i4 - this.f2361r.mo1520k()) <= 0) {
            return i3;
        }
        this.f2361r.mo1524o(-mo1520k);
        return i3 - mo1520k;
    }

    /* renamed from: Q0 */
    public final View m1768Q0() {
        return m2192u(this.f2364u ? 0 : m2194v() - 1);
    }

    /* renamed from: R0 */
    public final View m1770R0() {
        return m2192u(this.f2364u ? m2194v() - 1 : 0);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: S */
    public View mo1719S(View view, int i2, C0818N c0818n, C0824U c0824u) {
        int m1757F0;
        m1775X0();
        if (m2194v() != 0 && (m1757F0 = m1757F0(i2)) != Integer.MIN_VALUE) {
            m1758G0();
            m1779b1(m1757F0, (int) (this.f2361r.mo1521l() * 0.33333334f), false, c0824u);
            C0855s c0855s = this.f2360q;
            c0855s.f3459g = Integer.MIN_VALUE;
            c0855s.f3453a = false;
            m1759H0(c0818n, c0855s, c0824u, true);
            View m1764L0 = m1757F0 == -1 ? this.f2364u ? m1764L0(m2194v() - 1, -1) : m1764L0(0, m2194v()) : this.f2364u ? m1764L0(0, m2194v()) : m1764L0(m2194v() - 1, -1);
            View m1770R0 = m1757F0 == -1 ? m1770R0() : m1768Q0();
            if (!m1770R0.hasFocusable()) {
                return m1764L0;
            }
            if (m1764L0 != null) {
                return m1770R0;
            }
        }
        return null;
    }

    /* renamed from: S0 */
    public final boolean m1771S0() {
        return m2174C() == 1;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: T */
    public final void mo1772T(AccessibilityEvent accessibilityEvent) {
        super.mo1772T(accessibilityEvent);
        if (m2194v() > 0) {
            View m1765M0 = m1765M0(0, m2194v(), false);
            accessibilityEvent.setFromIndex(m1765M0 == null ? -1 : AbstractC0812H.m2166H(m1765M0));
            accessibilityEvent.setToIndex(m1762K0());
        }
    }

    /* renamed from: T0 */
    public void mo1720T0(C0818N c0818n, C0824U c0824u, C0855s c0855s, C0854r c0854r) {
        int i2;
        int i3;
        int i4;
        int i5;
        View m2262b = c0855s.m2262b(c0818n);
        if (m2262b == null) {
            c0854r.f3450b = true;
            return;
        }
        C0813I c0813i = (C0813I) m2262b.getLayoutParams();
        if (c0855s.f3463k == null) {
            if (this.f2364u == (c0855s.f3458f == -1)) {
                m2181b(m2262b, -1, false);
            } else {
                m2181b(m2262b, 0, false);
            }
        } else {
            if (this.f2364u == (c0855s.f3458f == -1)) {
                m2181b(m2262b, -1, true);
            } else {
                m2181b(m2262b, 0, true);
            }
        }
        C0813I c0813i2 = (C0813I) m2262b.getLayoutParams();
        Rect m1809J = this.f3217b.m1809J(m2262b);
        int i6 = m1809J.left + m1809J.right;
        int i7 = m1809J.top + m1809J.bottom;
        int m2171w = AbstractC0812H.m2171w(mo1782d(), this.f3229n, this.f3227l, m2177F() + m2176E() + ((ViewGroup.MarginLayoutParams) c0813i2).leftMargin + ((ViewGroup.MarginLayoutParams) c0813i2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) c0813i2).width);
        int m2171w2 = AbstractC0812H.m2171w(mo1785e(), this.f3230o, this.f3228m, m2175D() + m2178G() + ((ViewGroup.MarginLayoutParams) c0813i2).topMargin + ((ViewGroup.MarginLayoutParams) c0813i2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) c0813i2).height);
        if (m2193u0(m2262b, m2171w, m2171w2, c0813i2)) {
            m2262b.measure(m2171w, m2171w2);
        }
        c0854r.f3449a = this.f2361r.mo1512c(m2262b);
        if (this.f2359p == 1) {
            if (m1771S0()) {
                i5 = this.f3229n - m2177F();
                i2 = i5 - this.f2361r.mo1513d(m2262b);
            } else {
                i2 = m2176E();
                i5 = this.f2361r.mo1513d(m2262b) + i2;
            }
            if (c0855s.f3458f == -1) {
                i3 = c0855s.f3454b;
                i4 = i3 - c0854r.f3449a;
            } else {
                i4 = c0855s.f3454b;
                i3 = c0854r.f3449a + i4;
            }
        } else {
            int m2178G = m2178G();
            int mo1513d = this.f2361r.mo1513d(m2262b) + m2178G;
            if (c0855s.f3458f == -1) {
                int i8 = c0855s.f3454b;
                int i9 = i8 - c0854r.f3449a;
                i5 = i8;
                i3 = mo1513d;
                i2 = i9;
                i4 = m2178G;
            } else {
                int i10 = c0855s.f3454b;
                int i11 = c0854r.f3449a + i10;
                i2 = i10;
                i3 = mo1513d;
                i4 = m2178G;
                i5 = i11;
            }
        }
        AbstractC0812H.m2169N(m2262b, i2, i4, i5, i3);
        if (c0813i.f3231a.m2221h() || c0813i.f3231a.m2224k()) {
            c0854r.f3451c = true;
        }
        c0854r.f3452d = m2262b.hasFocusable();
    }

    /* renamed from: V0 */
    public final void m1773V0(C0818N c0818n, C0855s c0855s) {
        if (!c0855s.f3453a || c0855s.f3464l) {
            return;
        }
        int i2 = c0855s.f3459g;
        int i3 = c0855s.f3461i;
        if (c0855s.f3458f == -1) {
            int m2194v = m2194v();
            if (i2 < 0) {
                return;
            }
            int mo1515f = (this.f2361r.mo1515f() - i2) + i3;
            if (this.f2364u) {
                for (int i4 = 0; i4 < m2194v; i4++) {
                    View m2192u = m2192u(i4);
                    if (this.f2361r.mo1514e(m2192u) < mo1515f || this.f2361r.mo1523n(m2192u) < mo1515f) {
                        m1774W0(c0818n, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = m2194v - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View m2192u2 = m2192u(i6);
                if (this.f2361r.mo1514e(m2192u2) < mo1515f || this.f2361r.mo1523n(m2192u2) < mo1515f) {
                    m1774W0(c0818n, i5, i6);
                    return;
                }
            }
            return;
        }
        if (i2 < 0) {
            return;
        }
        int i7 = i2 - i3;
        int m2194v2 = m2194v();
        if (!this.f2364u) {
            for (int i8 = 0; i8 < m2194v2; i8++) {
                View m2192u3 = m2192u(i8);
                if (this.f2361r.mo1511b(m2192u3) > i7 || this.f2361r.mo1522m(m2192u3) > i7) {
                    m1774W0(c0818n, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = m2194v2 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View m2192u4 = m2192u(i10);
            if (this.f2361r.mo1511b(m2192u4) > i7 || this.f2361r.mo1522m(m2192u4) > i7) {
                m1774W0(c0818n, i9, i10);
                return;
            }
        }
    }

    /* renamed from: W0 */
    public final void m1774W0(C0818N c0818n, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                View m2192u = m2192u(i2);
                m2185j0(i2);
                c0818n.m2203f(m2192u);
                i2--;
            }
            return;
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            View m2192u2 = m2192u(i4);
            m2185j0(i4);
            c0818n.m2203f(m2192u2);
        }
    }

    /* renamed from: X0 */
    public final void m1775X0() {
        if (this.f2359p == 1 || !m1771S0()) {
            this.f2364u = this.f2363t;
        } else {
            this.f2364u = !this.f2363t;
        }
    }

    /* renamed from: Y0 */
    public final int m1776Y0(int i2, C0818N c0818n, C0824U c0824u) {
        if (m2194v() != 0 && i2 != 0) {
            m1758G0();
            this.f2360q.f3453a = true;
            int i3 = i2 > 0 ? 1 : -1;
            int abs = Math.abs(i2);
            m1779b1(i3, abs, true, c0824u);
            C0855s c0855s = this.f2360q;
            int m1759H0 = m1759H0(c0818n, c0855s, c0824u, false) + c0855s.f3459g;
            if (m1759H0 >= 0) {
                if (abs > m1759H0) {
                    i2 = i3 * m1759H0;
                }
                this.f2361r.mo1524o(-i2);
                this.f2360q.f3462j = i2;
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: Z0 */
    public final void m1777Z0(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(AbstractC0044g.m153e("invalid orientation:", i2));
        }
        mo1780c(null);
        if (i2 != this.f2359p || this.f2361r == null) {
            AbstractC0593g m1510a = AbstractC0593g.m1510a(this, i2);
            this.f2361r = m1510a;
            this.f2355A.f3444a = m1510a;
            this.f2359p = i2;
            m2186l0();
        }
    }

    @Override // p079f0.InterfaceC0823T
    /* renamed from: a */
    public final PointF mo1778a(int i2) {
        if (m2194v() == 0) {
            return null;
        }
        int i3 = (i2 < AbstractC0812H.m2166H(m2192u(0))) != this.f2364u ? -1 : 1;
        return this.f2359p == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    /* renamed from: a1 */
    public void mo1728a1(boolean z2) {
        mo1780c(null);
        if (this.f2365v == z2) {
            return;
        }
        this.f2365v = z2;
        m2186l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0243  */
    @Override // p079f0.AbstractC0812H
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1729b0(p079f0.C0818N r18, p079f0.C0824U r19) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1729b0(f0.N, f0.U):void");
    }

    /* renamed from: b1 */
    public final void m1779b1(int i2, int i3, boolean z2, C0824U c0824u) {
        int mo1520k;
        this.f2360q.f3464l = this.f2361r.mo1518i() == 0 && this.f2361r.mo1515f() == 0;
        this.f2360q.f3458f = i2;
        int[] iArr = this.f2358D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1753A0(c0824u, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i2 == 1;
        C0855s c0855s = this.f2360q;
        int i4 = z3 ? max2 : max;
        c0855s.f3460h = i4;
        if (!z3) {
            max = max2;
        }
        c0855s.f3461i = max;
        if (z3) {
            c0855s.f3460h = this.f2361r.mo1517h() + i4;
            View m1768Q0 = m1768Q0();
            C0855s c0855s2 = this.f2360q;
            c0855s2.f3457e = this.f2364u ? -1 : 1;
            int m2166H = AbstractC0812H.m2166H(m1768Q0);
            C0855s c0855s3 = this.f2360q;
            c0855s2.f3456d = m2166H + c0855s3.f3457e;
            c0855s3.f3454b = this.f2361r.mo1511b(m1768Q0);
            mo1520k = this.f2361r.mo1511b(m1768Q0) - this.f2361r.mo1516g();
        } else {
            View m1770R0 = m1770R0();
            C0855s c0855s4 = this.f2360q;
            c0855s4.f3460h = this.f2361r.mo1520k() + c0855s4.f3460h;
            C0855s c0855s5 = this.f2360q;
            c0855s5.f3457e = this.f2364u ? 1 : -1;
            int m2166H2 = AbstractC0812H.m2166H(m1770R0);
            C0855s c0855s6 = this.f2360q;
            c0855s5.f3456d = m2166H2 + c0855s6.f3457e;
            c0855s6.f3454b = this.f2361r.mo1514e(m1770R0);
            mo1520k = (-this.f2361r.mo1514e(m1770R0)) + this.f2361r.mo1520k();
        }
        C0855s c0855s7 = this.f2360q;
        c0855s7.f3455c = i3;
        if (z2) {
            c0855s7.f3455c = i3 - mo1520k;
        }
        c0855s7.f3459g = mo1520k;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: c */
    public final void mo1780c(String str) {
        if (this.f2369z == null) {
            super.mo1780c(str);
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: c0 */
    public void mo1730c0(C0824U c0824u) {
        this.f2369z = null;
        this.f2367x = -1;
        this.f2368y = Integer.MIN_VALUE;
        this.f2355A.m2260d();
    }

    /* renamed from: c1 */
    public final void m1781c1(int i2, int i3) {
        this.f2360q.f3455c = this.f2361r.mo1516g() - i3;
        C0855s c0855s = this.f2360q;
        c0855s.f3457e = this.f2364u ? -1 : 1;
        c0855s.f3456d = i2;
        c0855s.f3458f = 1;
        c0855s.f3454b = i3;
        c0855s.f3459g = Integer.MIN_VALUE;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: d */
    public final boolean mo1782d() {
        return this.f2359p == 0;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: d0 */
    public final void mo1783d0(Parcelable parcelable) {
        if (parcelable instanceof C0856t) {
            this.f2369z = (C0856t) parcelable;
            m2186l0();
        }
    }

    /* renamed from: d1 */
    public final void m1784d1(int i2, int i3) {
        this.f2360q.f3455c = i3 - this.f2361r.mo1520k();
        C0855s c0855s = this.f2360q;
        c0855s.f3456d = i2;
        c0855s.f3457e = this.f2364u ? 1 : -1;
        c0855s.f3458f = -1;
        c0855s.f3454b = i3;
        c0855s.f3459g = Integer.MIN_VALUE;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: e */
    public final boolean mo1785e() {
        return this.f2359p == 1;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: e0 */
    public final Parcelable mo1786e0() {
        C0856t c0856t = this.f2369z;
        if (c0856t != null) {
            C0856t c0856t2 = new C0856t();
            c0856t2.f3465a = c0856t.f3465a;
            c0856t2.f3466b = c0856t.f3466b;
            c0856t2.f3467c = c0856t.f3467c;
            return c0856t2;
        }
        C0856t c0856t3 = new C0856t();
        if (m2194v() <= 0) {
            c0856t3.f3465a = -1;
            return c0856t3;
        }
        m1758G0();
        boolean z2 = this.f2362s ^ this.f2364u;
        c0856t3.f3467c = z2;
        if (z2) {
            View m1768Q0 = m1768Q0();
            c0856t3.f3466b = this.f2361r.mo1516g() - this.f2361r.mo1511b(m1768Q0);
            c0856t3.f3465a = AbstractC0812H.m2166H(m1768Q0);
            return c0856t3;
        }
        View m1770R0 = m1770R0();
        c0856t3.f3465a = AbstractC0812H.m2166H(m1770R0);
        c0856t3.f3466b = this.f2361r.mo1514e(m1770R0) - this.f2361r.mo1520k();
        return c0856t3;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: h */
    public final void mo1787h(int i2, int i3, C0824U c0824u, C0848l c0848l) {
        if (this.f2359p != 0) {
            i2 = i3;
        }
        if (m2194v() == 0 || i2 == 0) {
            return;
        }
        m1758G0();
        m1779b1(i2 > 0 ? 1 : -1, Math.abs(i2), true, c0824u);
        mo1716B0(c0824u, this.f2360q, c0848l);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: i */
    public final void mo1788i(int i2, C0848l c0848l) {
        boolean z2;
        int i3;
        C0856t c0856t = this.f2369z;
        if (c0856t == null || (i3 = c0856t.f3465a) < 0) {
            m1775X0();
            z2 = this.f2364u;
            i3 = this.f2367x;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            z2 = c0856t.f3467c;
        }
        int i4 = z2 ? -1 : 1;
        for (int i5 = 0; i5 < this.f2357C && i3 >= 0 && i3 < i2; i5++) {
            c0848l.m2252a(i3, 0);
            i3 += i4;
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: j */
    public final int mo1789j(C0824U c0824u) {
        return m1754C0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: k */
    public int mo1738k(C0824U c0824u) {
        return m1755D0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: l */
    public int mo1740l(C0824U c0824u) {
        return m1756E0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: m */
    public final int mo1790m(C0824U c0824u) {
        return m1754C0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: m0 */
    public int mo1742m0(int i2, C0818N c0818n, C0824U c0824u) {
        if (this.f2359p == 1) {
            return 0;
        }
        return m1776Y0(i2, c0818n, c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: n */
    public int mo1744n(C0824U c0824u) {
        return m1755D0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: n0 */
    public final void mo1791n0(int i2) {
        this.f2367x = i2;
        this.f2368y = Integer.MIN_VALUE;
        C0856t c0856t = this.f2369z;
        if (c0856t != null) {
            c0856t.f3465a = -1;
        }
        m2186l0();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: o */
    public int mo1745o(C0824U c0824u) {
        return m1756E0(c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: o0 */
    public int mo1746o0(int i2, C0818N c0818n, C0824U c0824u) {
        if (this.f2359p == 0) {
            return 0;
        }
        return m1776Y0(i2, c0818n, c0824u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: q */
    public final View mo1792q(int i2) {
        int m2194v = m2194v();
        if (m2194v == 0) {
            return null;
        }
        int m2166H = i2 - AbstractC0812H.m2166H(m2192u(0));
        if (m2166H >= 0 && m2166H < m2194v) {
            View m2192u = m2192u(m2166H);
            if (AbstractC0812H.m2166H(m2192u) == i2) {
                return m2192u;
            }
        }
        return super.mo1792q(i2);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: r */
    public C0813I mo1747r() {
        return new C0813I(-2, -2);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: v0 */
    public final boolean mo1793v0() {
        if (this.f3228m != 1073741824 && this.f3227l != 1073741824) {
            int m2194v = m2194v();
            for (int i2 = 0; i2 < m2194v; i2++) {
                ViewGroup.LayoutParams layoutParams = m2192u(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: x0 */
    public void mo1794x0(RecyclerView recyclerView, int i2) {
        C0857u c0857u = new C0857u(recyclerView.getContext());
        c0857u.f3468a = i2;
        m2196y0(c0857u);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: z0 */
    public boolean mo1752z0() {
        return this.f2369z == null && this.f2362s == this.f2365v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f2359p = 1;
        this.f2363t = false;
        this.f2364u = false;
        this.f2365v = false;
        this.f2366w = true;
        this.f2367x = -1;
        this.f2368y = Integer.MIN_VALUE;
        this.f2369z = null;
        this.f2355A = new C0853q();
        this.f2356B = new C0854r();
        this.f2357C = 2;
        this.f2358D = new int[2];
        C0811G m2167I = AbstractC0812H.m2167I(context, attributeSet, i2, i3);
        m1777Z0(m2167I.f3212a);
        boolean z2 = m2167I.f3214c;
        mo1780c(null);
        if (z2 != this.f2363t) {
            this.f2363t = z2;
            m2186l0();
        }
        mo1728a1(m2167I.f3215d);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: R */
    public final void mo1769R(RecyclerView recyclerView) {
    }

    /* renamed from: U0 */
    public void mo1721U0(C0818N c0818n, C0824U c0824u, C0853q c0853q, int i2) {
    }
}
