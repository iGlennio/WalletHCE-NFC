package p079f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002B.C0019i;
import p004B1.C0030a;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p030L.C0341h;
import p030L.C0342i;
import p077e0.AbstractC0803a;

/* renamed from: f0.H */
/* loaded from: classes.dex */
public abstract class AbstractC0812H {

    /* renamed from: a */
    public C0176h f3216a;

    /* renamed from: b */
    public RecyclerView f3217b;

    /* renamed from: c */
    public final C0019i f3218c;

    /* renamed from: d */
    public final C0019i f3219d;

    /* renamed from: e */
    public C0857u f3220e;

    /* renamed from: f */
    public boolean f3221f;

    /* renamed from: g */
    public boolean f3222g;

    /* renamed from: h */
    public final boolean f3223h;

    /* renamed from: i */
    public final boolean f3224i;

    /* renamed from: j */
    public int f3225j;

    /* renamed from: k */
    public boolean f3226k;

    /* renamed from: l */
    public int f3227l;

    /* renamed from: m */
    public int f3228m;

    /* renamed from: n */
    public int f3229n;

    /* renamed from: o */
    public int f3230o;

    public AbstractC0812H() {
        C0810F c0810f = new C0810F(this, 0);
        C0810F c0810f2 = new C0810F(this, 1);
        this.f3218c = new C0019i(c0810f);
        this.f3219d = new C0019i(c0810f2);
        this.f3221f = false;
        this.f3222g = false;
        this.f3223h = true;
        this.f3224i = true;
    }

    /* renamed from: A */
    public static int m2165A(View view) {
        Rect rect = ((C0813I) view.getLayoutParams()).f3232b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: H */
    public static int m2166H(View view) {
        return ((C0813I) view.getLayoutParams()).f3231a.m2215b();
    }

    /* renamed from: I */
    public static C0811G m2167I(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0811G c0811g = new C0811G();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0803a.f3200a, i2, i3);
        c0811g.f3212a = obtainStyledAttributes.getInt(0, 1);
        c0811g.f3213b = obtainStyledAttributes.getInt(10, 1);
        c0811g.f3214c = obtainStyledAttributes.getBoolean(9, false);
        c0811g.f3215d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c0811g;
    }

    /* renamed from: M */
    public static boolean m2168M(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    /* renamed from: N */
    public static void m2169N(View view, int i2, int i3, int i4, int i5) {
        C0813I c0813i = (C0813I) view.getLayoutParams();
        Rect rect = c0813i.f3232b;
        view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) c0813i).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) c0813i).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) c0813i).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0813i).bottomMargin);
    }

    /* renamed from: g */
    public static int m2170g(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m2171w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f0.AbstractC0812H.m2171w(boolean, int, int, int, int):int");
    }

    /* renamed from: z */
    public static int m2172z(View view) {
        Rect rect = ((C0813I) view.getLayoutParams()).f3232b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: B */
    public final int m2173B() {
        RecyclerView recyclerView = this.f3217b;
        AbstractC0862z adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo474a();
        }
        return 0;
    }

    /* renamed from: C */
    public final int m2174C() {
        RecyclerView recyclerView = this.f3217b;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        return recyclerView.getLayoutDirection();
    }

    /* renamed from: D */
    public final int m2175D() {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: E */
    public final int m2176E() {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: F */
    public final int m2177F() {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: G */
    public final int m2178G() {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: J */
    public int mo1717J(C0818N c0818n, C0824U c0824u) {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView == null || recyclerView.f2416k == null || !mo1785e()) {
            return 1;
        }
        return this.f3217b.f2416k.mo474a();
    }

    /* renamed from: K */
    public final void m2179K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0813I) view.getLayoutParams()).f3232b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3217b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3217b.f2414j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: L */
    public abstract boolean mo1763L();

    /* renamed from: O */
    public void mo1865O(int i2) {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView != null) {
            int m540n = recyclerView.f2404e.m540n();
            for (int i3 = 0; i3 < m540n; i3++) {
                recyclerView.f2404e.m539m(i3).offsetLeftAndRight(i2);
            }
        }
    }

    /* renamed from: P */
    public void mo1867P(int i2) {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView != null) {
            int m540n = recyclerView.f2404e.m540n();
            for (int i3 = 0; i3 < m540n; i3++) {
                recyclerView.f2404e.m539m(i3).offsetTopAndBottom(i2);
            }
        }
    }

    /* renamed from: R */
    public abstract void mo1769R(RecyclerView recyclerView);

    /* renamed from: S */
    public abstract View mo1719S(View view, int i2, C0818N c0818n, C0824U c0824u);

    /* renamed from: T */
    public void mo1772T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3217b;
        C0818N c0818n = recyclerView.f2398b;
        C0824U c0824u = recyclerView.f2401c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3217b.canScrollVertically(-1) && !this.f3217b.canScrollHorizontally(-1) && !this.f3217b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0862z abstractC0862z = this.f3217b.f2416k;
        if (abstractC0862z != null) {
            accessibilityEvent.setItemCount(abstractC0862z.mo474a());
        }
    }

    /* renamed from: U */
    public final void m2180U(View view, C0342i c0342i) {
        AbstractC0827X m1796I = RecyclerView.m1796I(view);
        if (m1796I == null || m1796I.m2221h() || ((ArrayList) this.f3216a.f517d).contains(m1796I.f3280a)) {
            return;
        }
        RecyclerView recyclerView = this.f3217b;
        mo1722V(recyclerView.f2398b, recyclerView.f2401c0, view, c0342i);
    }

    /* renamed from: V */
    public void mo1722V(C0818N c0818n, C0824U c0824u, View view, C0342i c0342i) {
        c0342i.m997j(C0341h.m987a(mo1785e() ? m2166H(view) : 0, 1, mo1782d() ? m2166H(view) : 0, 1, false, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2181b(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f0.AbstractC0812H.m2181b(android.view.View, int, boolean):void");
    }

    /* renamed from: b0 */
    public abstract void mo1729b0(C0818N c0818n, C0824U c0824u);

    /* renamed from: c */
    public void mo1780c(String str) {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView != null) {
            recyclerView.m1833i(str);
        }
    }

    /* renamed from: c0 */
    public abstract void mo1730c0(C0824U c0824u);

    /* renamed from: d */
    public abstract boolean mo1782d();

    /* renamed from: e */
    public abstract boolean mo1785e();

    /* renamed from: e0 */
    public Parcelable mo1786e0() {
        return null;
    }

    /* renamed from: f */
    public boolean mo1732f(C0813I c0813i) {
        return c0813i != null;
    }

    /* renamed from: g0 */
    public final void m2182g0(C0818N c0818n) {
        for (int m2194v = m2194v() - 1; m2194v >= 0; m2194v--) {
            if (!RecyclerView.m1796I(m2192u(m2194v)).m2228o()) {
                View m2192u = m2192u(m2194v);
                m2185j0(m2194v);
                c0818n.m2203f(m2192u);
            }
        }
    }

    /* renamed from: h0 */
    public final void m2183h0(C0818N c0818n) {
        ArrayList arrayList;
        int size = c0818n.f3241a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = c0818n.f3241a;
            if (i2 < 0) {
                break;
            }
            View view = ((AbstractC0827X) arrayList.get(i2)).f3280a;
            AbstractC0827X m1796I = RecyclerView.m1796I(view);
            if (!m1796I.m2228o()) {
                m1796I.m2227n(false);
                if (m1796I.m2223j()) {
                    this.f3217b.removeDetachedView(view, false);
                }
                AbstractC0808D abstractC0808D = this.f3217b.f2380H;
                if (abstractC0808D != null) {
                    abstractC0808D.mo2157d(m1796I);
                }
                m1796I.m2227n(true);
                AbstractC0827X m1796I2 = RecyclerView.m1796I(view);
                m1796I2.f3293n = null;
                m1796I2.f3294o = false;
                m1796I2.f3289j &= -33;
                c0818n.m2204g(m1796I2);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0818n.f3242b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3217b.invalidate();
        }
    }

    /* renamed from: i0 */
    public final void m2184i0(View view, C0818N c0818n) {
        C0176h c0176h = this.f3216a;
        C0861y c0861y = (C0861y) c0176h.f515b;
        int indexOfChild = c0861y.f3491a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0030a) c0176h.f516c).m97g(indexOfChild)) {
                c0176h.m525G(view);
            }
            c0861y.m2284h(indexOfChild);
        }
        c0818n.m2203f(view);
    }

    /* renamed from: j */
    public abstract int mo1789j(C0824U c0824u);

    /* renamed from: j0 */
    public final void m2185j0(int i2) {
        if (m2192u(i2) != null) {
            C0176h c0176h = this.f3216a;
            int m546u = c0176h.m546u(i2);
            C0861y c0861y = (C0861y) c0176h.f515b;
            View childAt = c0861y.f3491a.getChildAt(m546u);
            if (childAt == null) {
                return;
            }
            if (((C0030a) c0176h.f516c).m97g(m546u)) {
                c0176h.m525G(childAt);
            }
            c0861y.m2284h(m546u);
        }
    }

    /* renamed from: k */
    public abstract int mo1738k(C0824U c0824u);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1936k0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.m2176E()
            int r1 = r8.m2178G()
            int r2 = r8.f3229n
            int r3 = r8.m2177F()
            int r2 = r2 - r3
            int r3 = r8.f3230o
            int r4 = r8.m2175D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.m2174C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.m2176E()
            int r2 = r8.m2178G()
            int r3 = r8.f3229n
            int r4 = r8.m2177F()
            int r3 = r3 - r4
            int r4 = r8.f3230o
            int r5 = r8.m2175D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3217b
            android.graphics.Rect r5 = r5.f2410h
            r8.mo1937y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.m1826a0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f0.AbstractC0812H.mo1936k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* renamed from: l */
    public abstract int mo1740l(C0824U c0824u);

    /* renamed from: l0 */
    public final void m2186l0() {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: m */
    public abstract int mo1790m(C0824U c0824u);

    /* renamed from: m0 */
    public abstract int mo1742m0(int i2, C0818N c0818n, C0824U c0824u);

    /* renamed from: n */
    public abstract int mo1744n(C0824U c0824u);

    /* renamed from: n0 */
    public abstract void mo1791n0(int i2);

    /* renamed from: o */
    public abstract int mo1745o(C0824U c0824u);

    /* renamed from: o0 */
    public abstract int mo1746o0(int i2, C0818N c0818n, C0824U c0824u);

    /* renamed from: p */
    public final void m2187p(C0818N c0818n) {
        for (int m2194v = m2194v() - 1; m2194v >= 0; m2194v--) {
            View m2192u = m2192u(m2194v);
            AbstractC0827X m1796I = RecyclerView.m1796I(m2192u);
            if (!m1796I.m2228o()) {
                if (!m1796I.m2219f() || m1796I.m2221h() || this.f3217b.f2416k.f3493b) {
                    m2192u(m2194v);
                    this.f3216a.m534h(m2194v);
                    c0818n.m2205h(m2192u);
                    this.f3217b.f2406f.m57H(m1796I);
                } else {
                    m2185j0(m2194v);
                    c0818n.m2204g(m1796I);
                }
            }
        }
    }

    /* renamed from: p0 */
    public final void m2188p0(RecyclerView recyclerView) {
        m2189q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: q */
    public View mo1792q(int i2) {
        int m2194v = m2194v();
        for (int i3 = 0; i3 < m2194v; i3++) {
            View m2192u = m2192u(i3);
            AbstractC0827X m1796I = RecyclerView.m1796I(m2192u);
            if (m1796I != null && m1796I.m2215b() == i2 && !m1796I.m2228o() && (this.f3217b.f2401c0.f3264g || !m1796I.m2221h())) {
                return m2192u;
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public final void m2189q0(int i2, int i3) {
        this.f3229n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f3227l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f2370s0;
        }
        this.f3230o = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f3228m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f2370s0;
        }
    }

    /* renamed from: r */
    public abstract C0813I mo1747r();

    /* renamed from: r0 */
    public void mo1748r0(Rect rect, int i2, int i3) {
        int m2177F = m2177F() + m2176E() + rect.width();
        int m2175D = m2175D() + m2178G() + rect.height();
        RecyclerView recyclerView = this.f3217b;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        this.f3217b.setMeasuredDimension(m2170g(i2, m2177F, recyclerView.getMinimumWidth()), m2170g(i3, m2175D, this.f3217b.getMinimumHeight()));
    }

    /* renamed from: s */
    public C0813I mo1749s(Context context, AttributeSet attributeSet) {
        return new C0813I(context, attributeSet);
    }

    /* renamed from: s0 */
    public final void m2190s0(int i2, int i3) {
        int m2194v = m2194v();
        if (m2194v == 0) {
            this.f3217b.m1837n(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < m2194v; i8++) {
            View m2192u = m2192u(i8);
            Rect rect = this.f3217b.f2410h;
            mo1937y(m2192u, rect);
            int i9 = rect.left;
            if (i9 < i7) {
                i7 = i9;
            }
            int i10 = rect.right;
            if (i10 > i4) {
                i4 = i10;
            }
            int i11 = rect.top;
            if (i11 < i5) {
                i5 = i11;
            }
            int i12 = rect.bottom;
            if (i12 > i6) {
                i6 = i12;
            }
        }
        this.f3217b.f2410h.set(i7, i5, i4, i6);
        mo1748r0(this.f3217b.f2410h, i2, i3);
    }

    /* renamed from: t */
    public C0813I mo1750t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0813I ? new C0813I((C0813I) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0813I((ViewGroup.MarginLayoutParams) layoutParams) : new C0813I(layoutParams);
    }

    /* renamed from: t0 */
    public final void m2191t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3217b = null;
            this.f3216a = null;
            this.f3229n = 0;
            this.f3230o = 0;
        } else {
            this.f3217b = recyclerView;
            this.f3216a = recyclerView.f2404e;
            this.f3229n = recyclerView.getWidth();
            this.f3230o = recyclerView.getHeight();
        }
        this.f3227l = 1073741824;
        this.f3228m = 1073741824;
    }

    /* renamed from: u */
    public final View m2192u(int i2) {
        C0176h c0176h = this.f3216a;
        if (c0176h != null) {
            return c0176h.m539m(i2);
        }
        return null;
    }

    /* renamed from: u0 */
    public final boolean m2193u0(View view, int i2, int i3, C0813I c0813i) {
        return (!view.isLayoutRequested() && this.f3223h && m2168M(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) c0813i).width) && m2168M(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) c0813i).height)) ? false : true;
    }

    /* renamed from: v */
    public final int m2194v() {
        C0176h c0176h = this.f3216a;
        if (c0176h != null) {
            return c0176h.m540n();
        }
        return 0;
    }

    /* renamed from: v0 */
    public boolean mo1793v0() {
        return false;
    }

    /* renamed from: w0 */
    public final boolean m2195w0(View view, int i2, int i3, C0813I c0813i) {
        return (this.f3223h && m2168M(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) c0813i).width) && m2168M(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) c0813i).height)) ? false : true;
    }

    /* renamed from: x */
    public int mo1751x(C0818N c0818n, C0824U c0824u) {
        RecyclerView recyclerView = this.f3217b;
        if (recyclerView == null || recyclerView.f2416k == null || !mo1782d()) {
            return 1;
        }
        return this.f3217b.f2416k.mo474a();
    }

    /* renamed from: x0 */
    public abstract void mo1794x0(RecyclerView recyclerView, int i2);

    /* renamed from: y */
    public void mo1937y(View view, Rect rect) {
        int[] iArr = RecyclerView.f2370s0;
        C0813I c0813i = (C0813I) view.getLayoutParams();
        Rect rect2 = c0813i.f3232b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0813i).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0813i).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0813i).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0813i).bottomMargin);
    }

    /* renamed from: y0 */
    public final void m2196y0(C0857u c0857u) {
        C0857u c0857u2 = this.f3220e;
        if (c0857u2 != null && c0857u != c0857u2 && c0857u2.f3472e) {
            c0857u2.m2270i();
        }
        this.f3220e = c0857u;
        RecyclerView recyclerView = this.f3217b;
        RunnableC0826W runnableC0826W = recyclerView.f2395W;
        runnableC0826W.f3278g.removeCallbacks(runnableC0826W);
        runnableC0826W.f3274c.abortAnimation();
        if (c0857u.f3475h) {
            Log.w("RecyclerView", "An instance of " + c0857u.getClass().getSimpleName() + " was started more than once. Each instance of" + c0857u.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0857u.f3469b = recyclerView;
        c0857u.f3470c = this;
        int i2 = c0857u.f3468a;
        if (i2 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f2401c0.f3258a = i2;
        c0857u.f3472e = true;
        c0857u.f3471d = true;
        c0857u.f3473f = recyclerView.f2418l.mo1792q(i2);
        c0857u.f3469b.f2395W.m2212a();
        c0857u.f3475h = true;
    }

    /* renamed from: z0 */
    public boolean mo1752z0() {
        return false;
    }

    /* renamed from: Q */
    public void mo1935Q(RecyclerView recyclerView) {
    }

    /* renamed from: d0 */
    public void mo1783d0(Parcelable parcelable) {
    }

    /* renamed from: f0 */
    public void mo1881f0(int i2) {
    }

    /* renamed from: X */
    public void mo1724X() {
    }

    /* renamed from: W */
    public void mo1723W(int i2, int i3) {
    }

    /* renamed from: Y */
    public void mo1725Y(int i2, int i3) {
    }

    /* renamed from: Z */
    public void mo1726Z(int i2, int i3) {
    }

    /* renamed from: a0 */
    public void mo1727a0(int i2, int i3) {
    }

    /* renamed from: i */
    public void mo1788i(int i2, C0848l c0848l) {
    }

    /* renamed from: h */
    public void mo1787h(int i2, int i3, C0824U c0824u, C0848l c0848l) {
    }
}
