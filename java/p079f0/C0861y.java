package p079f0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p027K.C0312p;

/* renamed from: f0.y */
/* loaded from: classes.dex */
public final class C0861y {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3491a;

    public /* synthetic */ C0861y(RecyclerView recyclerView) {
        this.f3491a = recyclerView;
    }

    /* renamed from: a */
    public void m2277a(C0830a c0830a) {
        int i2 = c0830a.f3302a;
        RecyclerView recyclerView = this.f3491a;
        if (i2 == 1) {
            recyclerView.f2418l.mo1723W(c0830a.f3303b, c0830a.f3304c);
            return;
        }
        if (i2 == 2) {
            recyclerView.f2418l.mo1726Z(c0830a.f3303b, c0830a.f3304c);
        } else if (i2 == 4) {
            recyclerView.f2418l.mo1727a0(c0830a.f3303b, c0830a.f3304c);
        } else {
            if (i2 != 8) {
                return;
            }
            recyclerView.f2418l.mo1725Y(c0830a.f3303b, c0830a.f3304c);
        }
    }

    /* renamed from: b */
    public AbstractC0827X m2278b(int i2) {
        RecyclerView recyclerView = this.f3491a;
        int m548w = recyclerView.f2404e.m548w();
        int i3 = 0;
        AbstractC0827X abstractC0827X = null;
        while (true) {
            if (i3 >= m548w) {
                break;
            }
            AbstractC0827X m1796I = RecyclerView.m1796I(recyclerView.f2404e.m547v(i3));
            if (m1796I != null && !m1796I.m2221h() && m1796I.f3282c == i2) {
                if (!((ArrayList) recyclerView.f2404e.f517d).contains(m1796I.f3280a)) {
                    abstractC0827X = m1796I;
                    break;
                }
                abstractC0827X = m1796I;
            }
            i3++;
        }
        if (abstractC0827X == null || ((ArrayList) recyclerView.f2404e.f517d).contains(abstractC0827X.f3280a)) {
            return null;
        }
        return abstractC0827X;
    }

    /* renamed from: c */
    public void m2279c(int i2, int i3) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.f3491a;
        int m548w = recyclerView.f2404e.m548w();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < m548w; i7++) {
            View m547v = recyclerView.f2404e.m547v(i7);
            AbstractC0827X m1796I = RecyclerView.m1796I(m547v);
            if (m1796I != null && !m1796I.m2228o() && (i5 = m1796I.f3282c) >= i2 && i5 < i6) {
                m1796I.m2214a(2);
                m1796I.m2214a(1024);
                ((C0813I) m547v.getLayoutParams()).f3233c = true;
            }
        }
        C0818N c0818n = recyclerView.f2398b;
        ArrayList arrayList = c0818n.f3243c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0827X abstractC0827X = (AbstractC0827X) arrayList.get(size);
            if (abstractC0827X != null && (i4 = abstractC0827X.f3282c) >= i2 && i4 < i6) {
                abstractC0827X.m2214a(2);
                c0818n.m2202e(size);
            }
        }
        recyclerView.f2409g0 = true;
    }

    /* renamed from: d */
    public void m2280d(int i2, int i3) {
        RecyclerView recyclerView = this.f3491a;
        int m548w = recyclerView.f2404e.m548w();
        for (int i4 = 0; i4 < m548w; i4++) {
            AbstractC0827X m1796I = RecyclerView.m1796I(recyclerView.f2404e.m547v(i4));
            if (m1796I != null && !m1796I.m2228o() && m1796I.f3282c >= i2) {
                m1796I.m2225l(i3, false);
                recyclerView.f2401c0.f3263f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2398b.f3243c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0827X abstractC0827X = (AbstractC0827X) arrayList.get(i5);
            if (abstractC0827X != null && abstractC0827X.f3282c >= i2) {
                abstractC0827X.m2225l(i3, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2407f0 = true;
    }

    /* renamed from: e */
    public void m2281e(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f3491a;
        int m548w = recyclerView.f2404e.m548w();
        int i11 = -1;
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i12 = 0; i12 < m548w; i12++) {
            AbstractC0827X m1796I = RecyclerView.m1796I(recyclerView.f2404e.m547v(i12));
            if (m1796I != null && (i10 = m1796I.f3282c) >= i5 && i10 <= i4) {
                if (i10 == i2) {
                    m1796I.m2225l(i3 - i2, false);
                } else {
                    m1796I.m2225l(i6, false);
                }
                recyclerView.f2401c0.f3263f = true;
            }
        }
        C0818N c0818n = recyclerView.f2398b;
        c0818n.getClass();
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        ArrayList arrayList = c0818n.f3243c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC0827X abstractC0827X = (AbstractC0827X) arrayList.get(i13);
            if (abstractC0827X != null && (i9 = abstractC0827X.f3282c) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    abstractC0827X.m2225l(i3 - i2, false);
                } else {
                    abstractC0827X.m2225l(i11, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2407f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2282f(p079f0.AbstractC0827X r9, p027K.C0312p r10, p027K.C0312p r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3491a
            r0.getClass()
            r1 = 0
            r9.m2227n(r1)
            f0.D r1 = r0.f2380H
            r2 = r1
            f0.h r2 = (p079f0.C0844h) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f849a
            int r6 = r11.f849a
            if (r4 != r6) goto L22
            int r1 = r10.f850b
            int r3 = r11.f850b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f850b
            int r7 = r11.f850b
            r3 = r9
            boolean r9 = r2.m2242g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.m2246l(r3)
            android.view.View r9 = r3.f3280a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f3375i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.m1818S()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f0.C0861y.m2282f(f0.X, K.p, K.p):void");
    }

    /* renamed from: g */
    public void m2283g(AbstractC0827X abstractC0827X, C0312p c0312p, C0312p c0312p2) {
        boolean z2;
        RecyclerView recyclerView = this.f3491a;
        recyclerView.f2398b.m2207j(abstractC0827X);
        recyclerView.m1830f(abstractC0827X);
        abstractC0827X.m2227n(false);
        C0844h c0844h = (C0844h) recyclerView.f2380H;
        c0844h.getClass();
        int i2 = c0312p.f849a;
        int i3 = c0312p.f850b;
        View view = abstractC0827X.f3280a;
        int left = c0312p2 == null ? view.getLeft() : c0312p2.f849a;
        int top = c0312p2 == null ? view.getTop() : c0312p2.f850b;
        if (abstractC0827X.m2221h() || (i2 == left && i3 == top)) {
            c0844h.m2246l(abstractC0827X);
            c0844h.f3374h.add(abstractC0827X);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0844h.m2242g(abstractC0827X, i2, i3, left, top);
        }
        if (z2) {
            recyclerView.m1818S();
        }
    }

    /* renamed from: h */
    public void m2284h(int i2) {
        RecyclerView recyclerView = this.f3491a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.m1796I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }
}
