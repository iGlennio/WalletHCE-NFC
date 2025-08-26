package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p002B.C0019i;
import p005C.AbstractC0044g;
import p027K.AbstractC0272P;
import p030L.C0341h;
import p030L.C0342i;
import p079f0.AbstractC0812H;
import p079f0.C0813I;
import p079f0.C0818N;
import p079f0.C0824U;
import p079f0.C0848l;
import p079f0.C0851o;
import p079f0.C0853q;
import p079f0.C0855s;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f2347E;

    /* renamed from: F */
    public int f2348F;

    /* renamed from: G */
    public int[] f2349G;

    /* renamed from: H */
    public View[] f2350H;

    /* renamed from: I */
    public final SparseIntArray f2351I;

    /* renamed from: J */
    public final SparseIntArray f2352J;

    /* renamed from: K */
    public final C0019i f2353K;

    /* renamed from: L */
    public final Rect f2354L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f2347E = false;
        this.f2348F = -1;
        this.f2351I = new SparseIntArray();
        this.f2352J = new SparseIntArray();
        this.f2353K = new C0019i(14);
        this.f2354L = new Rect();
        m1741l1(AbstractC0812H.m2167I(context, attributeSet, i2, i3).f3213b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: B0 */
    public final void mo1716B0(C0824U c0824u, C0855s c0855s, C0848l c0848l) {
        int i2;
        int i3 = this.f2348F;
        for (int i4 = 0; i4 < this.f2348F && (i2 = c0855s.f3456d) >= 0 && i2 < c0824u.m2211b() && i3 > 0; i4++) {
            c0848l.m2252a(c0855s.f3456d, Math.max(0, c0855s.f3459g));
            this.f2353K.getClass();
            i3--;
            c0855s.f3456d += c0855s.f3457e;
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: J */
    public final int mo1717J(C0818N c0818n, C0824U c0824u) {
        if (this.f2359p == 0) {
            return this.f2348F;
        }
        if (c0824u.m2211b() < 1) {
            return 0;
        }
        return m1735h1(c0824u.m2211b() - 1, c0818n, c0824u) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N0 */
    public final View mo1718N0(C0818N c0818n, C0824U c0824u, int i2, int i3, int i4) {
        m1758G0();
        int mo1520k = this.f2361r.mo1520k();
        int mo1516g = this.f2361r.mo1516g();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View m2192u = m2192u(i2);
            int m2166H = AbstractC0812H.m2166H(m2192u);
            if (m2166H >= 0 && m2166H < i4 && m1736i1(m2166H, c0818n, c0824u) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.f3216a.f517d).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1719S(android.view.View r23, int r24, p079f0.C0818N r25, p079f0.C0824U r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1719S(android.view.View, int, f0.N, f0.U):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f3450b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v39 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1720T0(p079f0.C0818N r19, p079f0.C0824U r20, p079f0.C0855s r21, p079f0.C0854r r22) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1720T0(f0.N, f0.U, f0.s, f0.r):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: U0 */
    public final void mo1721U0(C0818N c0818n, C0824U c0824u, C0853q c0853q, int i2) {
        m1743m1();
        if (c0824u.m2211b() > 0 && !c0824u.f3264g) {
            boolean z2 = i2 == 1;
            int m1736i1 = m1736i1(c0853q.f3445b, c0818n, c0824u);
            if (z2) {
                while (m1736i1 > 0) {
                    int i3 = c0853q.f3445b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    c0853q.f3445b = i4;
                    m1736i1 = m1736i1(i4, c0818n, c0824u);
                }
            } else {
                int m2211b = c0824u.m2211b() - 1;
                int i5 = c0853q.f3445b;
                while (i5 < m2211b) {
                    int i6 = i5 + 1;
                    int m1736i12 = m1736i1(i6, c0818n, c0824u);
                    if (m1736i12 <= m1736i1) {
                        break;
                    }
                    i5 = i6;
                    m1736i1 = m1736i12;
                }
                c0853q.f3445b = i5;
            }
        }
        m1733f1();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: V */
    public final void mo1722V(C0818N c0818n, C0824U c0824u, View view, C0342i c0342i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0851o)) {
            m2180U(view, c0342i);
            return;
        }
        C0851o c0851o = (C0851o) layoutParams;
        int m1735h1 = m1735h1(c0851o.f3231a.m2215b(), c0818n, c0824u);
        if (this.f2359p == 0) {
            c0342i.m997j(C0341h.m987a(c0851o.f3433e, c0851o.f3434f, m1735h1, 1, false, false));
        } else {
            c0342i.m997j(C0341h.m987a(m1735h1, 1, c0851o.f3433e, c0851o.f3434f, false, false));
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: W */
    public final void mo1723W(int i2, int i3) {
        C0019i c0019i = this.f2353K;
        c0019i.m82y();
        ((SparseIntArray) c0019i.f48c).clear();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: X */
    public final void mo1724X() {
        C0019i c0019i = this.f2353K;
        c0019i.m82y();
        ((SparseIntArray) c0019i.f48c).clear();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: Y */
    public final void mo1725Y(int i2, int i3) {
        C0019i c0019i = this.f2353K;
        c0019i.m82y();
        ((SparseIntArray) c0019i.f48c).clear();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: Z */
    public final void mo1726Z(int i2, int i3) {
        C0019i c0019i = this.f2353K;
        c0019i.m82y();
        ((SparseIntArray) c0019i.f48c).clear();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: a0 */
    public final void mo1727a0(int i2, int i3) {
        C0019i c0019i = this.f2353K;
        c0019i.m82y();
        ((SparseIntArray) c0019i.f48c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a1 */
    public final void mo1728a1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1728a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: b0 */
    public final void mo1729b0(C0818N c0818n, C0824U c0824u) {
        boolean z2 = c0824u.f3264g;
        SparseIntArray sparseIntArray = this.f2352J;
        SparseIntArray sparseIntArray2 = this.f2351I;
        if (z2) {
            int m2194v = m2194v();
            for (int i2 = 0; i2 < m2194v; i2++) {
                C0851o c0851o = (C0851o) m2192u(i2).getLayoutParams();
                int m2215b = c0851o.f3231a.m2215b();
                sparseIntArray2.put(m2215b, c0851o.f3434f);
                sparseIntArray.put(m2215b, c0851o.f3433e);
            }
        }
        super.mo1729b0(c0818n, c0824u);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: c0 */
    public final void mo1730c0(C0824U c0824u) {
        super.mo1730c0(c0824u);
        this.f2347E = false;
    }

    /* renamed from: e1 */
    public final void m1731e1(int i2) {
        int i3;
        int[] iArr = this.f2349G;
        int i4 = this.f2348F;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f2349G = iArr;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: f */
    public final boolean mo1732f(C0813I c0813i) {
        return c0813i instanceof C0851o;
    }

    /* renamed from: f1 */
    public final void m1733f1() {
        View[] viewArr = this.f2350H;
        if (viewArr == null || viewArr.length != this.f2348F) {
            this.f2350H = new View[this.f2348F];
        }
    }

    /* renamed from: g1 */
    public final int m1734g1(int i2, int i3) {
        if (this.f2359p != 1 || !m1771S0()) {
            int[] iArr = this.f2349G;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f2349G;
        int i4 = this.f2348F;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    /* renamed from: h1 */
    public final int m1735h1(int i2, C0818N c0818n, C0824U c0824u) {
        boolean z2 = c0824u.f3264g;
        C0019i c0019i = this.f2353K;
        if (!z2) {
            int i3 = this.f2348F;
            c0019i.getClass();
            return C0019i.m49w(i2, i3);
        }
        int m2199b = c0818n.m2199b(i2);
        if (m2199b != -1) {
            int i4 = this.f2348F;
            c0019i.getClass();
            return C0019i.m49w(m2199b, i4);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    /* renamed from: i1 */
    public final int m1736i1(int i2, C0818N c0818n, C0824U c0824u) {
        boolean z2 = c0824u.f3264g;
        C0019i c0019i = this.f2353K;
        if (!z2) {
            int i3 = this.f2348F;
            c0019i.getClass();
            return i2 % i3;
        }
        int i4 = this.f2352J.get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int m2199b = c0818n.m2199b(i2);
        if (m2199b != -1) {
            int i5 = this.f2348F;
            c0019i.getClass();
            return m2199b % i5;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    /* renamed from: j1 */
    public final int m1737j1(int i2, C0818N c0818n, C0824U c0824u) {
        boolean z2 = c0824u.f3264g;
        C0019i c0019i = this.f2353K;
        if (!z2) {
            c0019i.getClass();
            return 1;
        }
        int i3 = this.f2351I.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (c0818n.m2199b(i2) != -1) {
            c0019i.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: k */
    public final int mo1738k(C0824U c0824u) {
        return m1755D0(c0824u);
    }

    /* renamed from: k1 */
    public final void m1739k1(View view, int i2, boolean z2) {
        int i3;
        int i4;
        C0851o c0851o = (C0851o) view.getLayoutParams();
        Rect rect = c0851o.f3232b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0851o).topMargin + ((ViewGroup.MarginLayoutParams) c0851o).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0851o).leftMargin + ((ViewGroup.MarginLayoutParams) c0851o).rightMargin;
        int m1734g1 = m1734g1(c0851o.f3433e, c0851o.f3434f);
        if (this.f2359p == 1) {
            i4 = AbstractC0812H.m2171w(false, m1734g1, i2, i6, ((ViewGroup.MarginLayoutParams) c0851o).width);
            i3 = AbstractC0812H.m2171w(true, this.f2361r.mo1521l(), this.f3228m, i5, ((ViewGroup.MarginLayoutParams) c0851o).height);
        } else {
            int m2171w = AbstractC0812H.m2171w(false, m1734g1, i2, i5, ((ViewGroup.MarginLayoutParams) c0851o).height);
            int m2171w2 = AbstractC0812H.m2171w(true, this.f2361r.mo1521l(), this.f3227l, i6, ((ViewGroup.MarginLayoutParams) c0851o).width);
            i3 = m2171w;
            i4 = m2171w2;
        }
        C0813I c0813i = (C0813I) view.getLayoutParams();
        if (z2 ? m2195w0(view, i4, i3, c0813i) : m2193u0(view, i4, i3, c0813i)) {
            view.measure(i4, i3);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: l */
    public final int mo1740l(C0824U c0824u) {
        return m1756E0(c0824u);
    }

    /* renamed from: l1 */
    public final void m1741l1(int i2) {
        if (i2 == this.f2348F) {
            return;
        }
        this.f2347E = true;
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0044g.m153e("Span count should be at least 1. Provided ", i2));
        }
        this.f2348F = i2;
        this.f2353K.m82y();
        m2186l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: m0 */
    public final int mo1742m0(int i2, C0818N c0818n, C0824U c0824u) {
        m1743m1();
        m1733f1();
        return super.mo1742m0(i2, c0818n, c0824u);
    }

    /* renamed from: m1 */
    public final void m1743m1() {
        int m2175D;
        int m2178G;
        if (this.f2359p == 1) {
            m2175D = this.f3229n - m2177F();
            m2178G = m2176E();
        } else {
            m2175D = this.f3230o - m2175D();
            m2178G = m2178G();
        }
        m1731e1(m2175D - m2178G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: n */
    public final int mo1744n(C0824U c0824u) {
        return m1755D0(c0824u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: o */
    public final int mo1745o(C0824U c0824u) {
        return m1756E0(c0824u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: o0 */
    public final int mo1746o0(int i2, C0818N c0818n, C0824U c0824u) {
        m1743m1();
        m1733f1();
        return super.mo1746o0(i2, c0818n, c0824u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: r */
    public final C0813I mo1747r() {
        return this.f2359p == 0 ? new C0851o(-2, -1) : new C0851o(-1, -2);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: r0 */
    public final void mo1748r0(Rect rect, int i2, int i3) {
        int m2170g;
        int m2170g2;
        if (this.f2349G == null) {
            super.mo1748r0(rect, i2, i3);
        }
        int m2177F = m2177F() + m2176E();
        int m2175D = m2175D() + m2178G();
        if (this.f2359p == 1) {
            int height = rect.height() + m2175D;
            RecyclerView recyclerView = this.f3217b;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            m2170g2 = AbstractC0812H.m2170g(i3, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f2349G;
            m2170g = AbstractC0812H.m2170g(i2, iArr[iArr.length - 1] + m2177F, this.f3217b.getMinimumWidth());
        } else {
            int width = rect.width() + m2177F;
            RecyclerView recyclerView2 = this.f3217b;
            WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
            m2170g = AbstractC0812H.m2170g(i2, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f2349G;
            m2170g2 = AbstractC0812H.m2170g(i3, iArr2[iArr2.length - 1] + m2175D, this.f3217b.getMinimumHeight());
        }
        this.f3217b.setMeasuredDimension(m2170g, m2170g2);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: s */
    public final C0813I mo1749s(Context context, AttributeSet attributeSet) {
        C0851o c0851o = new C0851o(context, attributeSet);
        c0851o.f3433e = -1;
        c0851o.f3434f = 0;
        return c0851o;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: t */
    public final C0813I mo1750t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0851o c0851o = new C0851o((ViewGroup.MarginLayoutParams) layoutParams);
            c0851o.f3433e = -1;
            c0851o.f3434f = 0;
            return c0851o;
        }
        C0851o c0851o2 = new C0851o(layoutParams);
        c0851o2.f3433e = -1;
        c0851o2.f3434f = 0;
        return c0851o2;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: x */
    public final int mo1751x(C0818N c0818n, C0824U c0824u) {
        if (this.f2359p == 1) {
            return this.f2348F;
        }
        if (c0824u.m2211b() < 1) {
            return 0;
        }
        return m1735h1(c0824u.m2211b() - 1, c0818n, c0824u) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: z0 */
    public final boolean mo1752z0() {
        return this.f2369z == null && !this.f2347E;
    }

    public GridLayoutManager(int i2) {
        super(1);
        this.f2347E = false;
        this.f2348F = -1;
        this.f2351I = new SparseIntArray();
        this.f2352J = new SparseIntArray();
        this.f2353K = new C0019i(14);
        this.f2354L = new Rect();
        m1741l1(i2);
    }
}
