package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.nfupay.s145.R;
import p005C.AbstractC0044g;
import p014F0.RunnableC0130G;
import p079f0.AbstractC0812H;
import p079f0.C0813I;
import p079f0.C0818N;
import p079f0.C0824U;
import p079f0.C0859w;
import p079f0.InterfaceC0823T;
import p108q0.AbstractC1183a;
import p128x0.C1311b;
import p128x0.C1312c;
import p128x0.C1314e;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0812H implements InterfaceC0823T {

    /* renamed from: p */
    public final C1314e f2596p;

    /* renamed from: q */
    public C1312c f2597q;

    /* renamed from: r */
    public final View.OnLayoutChangeListener f2598r;

    public CarouselLayoutManager() {
        C1314e c1314e = new C1314e();
        new C1311b();
        this.f2598r = new View.OnLayoutChangeListener() { // from class: x0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i2 == i6 && i3 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                view.post(new RunnableC0130G(13, carouselLayoutManager));
            }
        };
        this.f2596p = c1314e;
        m2186l0();
        m1934C0(0);
    }

    /* renamed from: A0 */
    public final boolean m1932A0() {
        return this.f2597q.f5367a == 0;
    }

    /* renamed from: B0 */
    public final boolean m1933B0() {
        return m1932A0() && m2174C() == 1;
    }

    /* renamed from: C0 */
    public final void m1934C0(int i2) {
        C1312c c1312c;
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(AbstractC0044g.m153e("invalid orientation:", i2));
        }
        mo1780c(null);
        C1312c c1312c2 = this.f2597q;
        if (c1312c2 == null || i2 != c1312c2.f5367a) {
            if (i2 == 0) {
                c1312c = new C1312c(this, 1);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c1312c = new C1312c(this, 0);
            }
            this.f2597q = c1312c;
            m2186l0();
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: L */
    public final boolean mo1763L() {
        return true;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: Q */
    public final void mo1935Q(RecyclerView recyclerView) {
        C1314e c1314e = this.f2596p;
        Context context = recyclerView.getContext();
        float f = c1314e.f5370a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c1314e.f5370a = f;
        float f2 = c1314e.f5371b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c1314e.f5371b = f2;
        m2186l0();
        recyclerView.addOnLayoutChangeListener(this.f2598r);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: R */
    public final void mo1769R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2598r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (m1933B0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (m1933B0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // p079f0.AbstractC0812H
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1719S(android.view.View r4, int r5, p079f0.C0818N r6, p079f0.C0824U r7) {
        /*
            r3 = this;
            int r6 = r3.m2194v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            x0.c r6 = r3.f2597q
            int r6 = r6.f5367a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.m1933B0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.m1933B0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = p079f0.AbstractC0812H.m2166H(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.m2192u(r6)
            int r4 = p079f0.AbstractC0812H.m2166H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.m2173B()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            x0.c r4 = r3.f2597q
            r4.m3020a()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.m1933B0()
            if (r4 == 0) goto L86
            int r4 = r3.m2194v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.m2192u(r6)
            return r4
        L8b:
            int r4 = p079f0.AbstractC0812H.m2166H(r4)
            int r5 = r3.m2173B()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.m2194v()
            int r4 = r4 - r1
            android.view.View r4 = r3.m2192u(r4)
            int r4 = p079f0.AbstractC0812H.m2166H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.m2173B()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            x0.c r4 = r3.f2597q
            r4.m3020a()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.m1933B0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.m2194v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.m2192u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.mo1719S(android.view.View, int, f0.N, f0.U):android.view.View");
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: T */
    public final void mo1772T(AccessibilityEvent accessibilityEvent) {
        super.mo1772T(accessibilityEvent);
        if (m2194v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0812H.m2166H(m2192u(0)));
            accessibilityEvent.setToIndex(AbstractC0812H.m2166H(m2192u(m2194v() - 1)));
        }
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: W */
    public final void mo1723W(int i2, int i3) {
        m2173B();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: Z */
    public final void mo1726Z(int i2, int i3) {
        m2173B();
    }

    @Override // p079f0.InterfaceC0823T
    /* renamed from: a */
    public final PointF mo1778a(int i2) {
        return null;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: b0 */
    public final void mo1729b0(C0818N c0818n, C0824U c0824u) {
        if (c0824u.m2211b() > 0) {
            if ((m1932A0() ? this.f3229n : this.f3230o) > 0.0f) {
                m1933B0();
                View view = c0818n.m2206i(0, Long.MAX_VALUE).f3280a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m2182g0(c0818n);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: c0 */
    public final void mo1730c0(C0824U c0824u) {
        if (m2194v() == 0) {
            return;
        }
        AbstractC0812H.m2166H(m2192u(0));
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: d */
    public final boolean mo1782d() {
        return m1932A0();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: e */
    public final boolean mo1785e() {
        return !m1932A0();
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: j */
    public final int mo1789j(C0824U c0824u) {
        m2194v();
        return 0;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: k */
    public final int mo1738k(C0824U c0824u) {
        return 0;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: k0 */
    public final boolean mo1936k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: l */
    public final int mo1740l(C0824U c0824u) {
        return 0;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: m */
    public final int mo1790m(C0824U c0824u) {
        m2194v();
        return 0;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: m0 */
    public final int mo1742m0(int i2, C0818N c0818n, C0824U c0824u) {
        if (!m1932A0() || m2194v() == 0 || i2 == 0) {
            return 0;
        }
        View view = c0818n.m2206i(0, Long.MAX_VALUE).f3280a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: n */
    public final int mo1744n(C0824U c0824u) {
        return 0;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: n0 */
    public final void mo1791n0(int i2) {
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: o */
    public final int mo1745o(C0824U c0824u) {
        return 0;
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: o0 */
    public final int mo1746o0(int i2, C0818N c0818n, C0824U c0824u) {
        if (!mo1785e() || m2194v() == 0 || i2 == 0) {
            return 0;
        }
        View view = c0818n.m2206i(0, Long.MAX_VALUE).f3280a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: r */
    public final C0813I mo1747r() {
        return new C0813I(-2, -2);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: x0 */
    public final void mo1794x0(RecyclerView recyclerView, int i2) {
        C0859w c0859w = new C0859w(this, recyclerView.getContext(), 1);
        c0859w.f3468a = i2;
        m2196y0(c0859w);
    }

    @Override // p079f0.AbstractC0812H
    /* renamed from: y */
    public final void mo1937y(View view, Rect rect) {
        super.mo1937y(view, rect);
        rect.centerY();
        if (m1932A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        new C1311b();
        this.f2598r = new View.OnLayoutChangeListener() { // from class: x0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i32, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i22 == i6 && i32 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                view.post(new RunnableC0130G(13, carouselLayoutManager));
            }
        };
        this.f2596p = new C1314e();
        m2186l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1183a.f4523b);
            obtainStyledAttributes.getInt(0, 0);
            m2186l0();
            m1934C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
