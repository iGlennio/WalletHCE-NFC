package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002B.C0019i;
import p004B1.C0030a;
import p016G.AbstractC0168i;
import p017G0.C0176h;
import p018H.C0185e;
import p027K.AbstractC0261E;
import p027K.AbstractC0263G;
import p027K.AbstractC0272P;
import p027K.AbstractC0273Q;
import p027K.AbstractC0276U;
import p027K.C0306m;
import p027K.C0312p;
import p043P0.RunnableC0402A;
import p052T.InterpolatorC0482d;
import p077e0.AbstractC0803a;
import p079f0.AbstractC0808D;
import p079f0.AbstractC0809E;
import p079f0.AbstractC0812H;
import p079f0.AbstractC0814J;
import p079f0.AbstractC0815K;
import p079f0.AbstractC0825V;
import p079f0.AbstractC0827X;
import p079f0.AbstractC0862z;
import p079f0.C0807C;
import p079f0.C0813I;
import p079f0.C0816L;
import p079f0.C0817M;
import p079f0.C0818N;
import p079f0.C0820P;
import p079f0.C0821Q;
import p079f0.C0824U;
import p079f0.C0828Y;
import p079f0.C0830a;
import p079f0.C0843g0;
import p079f0.C0844h;
import p079f0.C0847k;
import p079f0.C0848l;
import p079f0.C0857u;
import p079f0.C0861y;
import p079f0.InterfaceC0806B;
import p079f0.InterfaceC0819O;
import p079f0.RunnableC0826W;
import p079f0.RunnableC0850n;
import p101o.C1155e;
import p101o.C1161k;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0 */
    public static final int[] f2370s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0 */
    public static final Class[] f2371t0;

    /* renamed from: u0 */
    public static final InterpolatorC0482d f2372u0;

    /* renamed from: A */
    public int f2373A;

    /* renamed from: B */
    public int f2374B;

    /* renamed from: C */
    public C0807C f2375C;

    /* renamed from: D */
    public EdgeEffect f2376D;

    /* renamed from: E */
    public EdgeEffect f2377E;

    /* renamed from: F */
    public EdgeEffect f2378F;

    /* renamed from: G */
    public EdgeEffect f2379G;

    /* renamed from: H */
    public AbstractC0808D f2380H;

    /* renamed from: I */
    public int f2381I;

    /* renamed from: J */
    public int f2382J;

    /* renamed from: K */
    public VelocityTracker f2383K;

    /* renamed from: L */
    public int f2384L;

    /* renamed from: M */
    public int f2385M;

    /* renamed from: N */
    public int f2386N;

    /* renamed from: O */
    public int f2387O;

    /* renamed from: P */
    public int f2388P;

    /* renamed from: Q */
    public AbstractC0814J f2389Q;

    /* renamed from: R */
    public final int f2390R;

    /* renamed from: S */
    public final int f2391S;

    /* renamed from: T */
    public final float f2392T;

    /* renamed from: U */
    public final float f2393U;

    /* renamed from: V */
    public boolean f2394V;

    /* renamed from: W */
    public final RunnableC0826W f2395W;

    /* renamed from: a */
    public final C0820P f2396a;

    /* renamed from: a0 */
    public RunnableC0850n f2397a0;

    /* renamed from: b */
    public final C0818N f2398b;

    /* renamed from: b0 */
    public final C0848l f2399b0;

    /* renamed from: c */
    public C0821Q f2400c;

    /* renamed from: c0 */
    public final C0824U f2401c0;

    /* renamed from: d */
    public final C0185e f2402d;

    /* renamed from: d0 */
    public AbstractC0815K f2403d0;

    /* renamed from: e */
    public final C0176h f2404e;

    /* renamed from: e0 */
    public ArrayList f2405e0;

    /* renamed from: f */
    public final C0019i f2406f;

    /* renamed from: f0 */
    public boolean f2407f0;

    /* renamed from: g */
    public boolean f2408g;

    /* renamed from: g0 */
    public boolean f2409g0;

    /* renamed from: h */
    public final Rect f2410h;

    /* renamed from: h0 */
    public final C0861y f2411h0;

    /* renamed from: i */
    public final Rect f2412i;

    /* renamed from: i0 */
    public boolean f2413i0;

    /* renamed from: j */
    public final RectF f2414j;

    /* renamed from: j0 */
    public C0828Y f2415j0;

    /* renamed from: k */
    public AbstractC0862z f2416k;

    /* renamed from: k0 */
    public final int[] f2417k0;

    /* renamed from: l */
    public AbstractC0812H f2418l;

    /* renamed from: l0 */
    public C0306m f2419l0;

    /* renamed from: m */
    public final ArrayList f2420m;

    /* renamed from: m0 */
    public final int[] f2421m0;

    /* renamed from: n */
    public final ArrayList f2422n;

    /* renamed from: n0 */
    public final int[] f2423n0;

    /* renamed from: o */
    public C0847k f2424o;

    /* renamed from: o0 */
    public final int[] f2425o0;

    /* renamed from: p */
    public boolean f2426p;

    /* renamed from: p0 */
    public final ArrayList f2427p0;

    /* renamed from: q */
    public boolean f2428q;

    /* renamed from: q0 */
    public final RunnableC0402A f2429q0;

    /* renamed from: r */
    public boolean f2430r;

    /* renamed from: r0 */
    public final C0861y f2431r0;

    /* renamed from: s */
    public int f2432s;

    /* renamed from: t */
    public boolean f2433t;

    /* renamed from: u */
    public boolean f2434u;

    /* renamed from: v */
    public boolean f2435v;

    /* renamed from: w */
    public int f2436w;

    /* renamed from: x */
    public final AccessibilityManager f2437x;

    /* renamed from: y */
    public boolean f2438y;

    /* renamed from: z */
    public boolean f2439z;

    static {
        Class cls = Integer.TYPE;
        f2371t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2372u0 = new InterpolatorC0482d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.nfupay.s145.R.attr.recyclerViewStyle);
    }

    /* renamed from: D */
    public static RecyclerView m1795D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView m1795D = m1795D(viewGroup.getChildAt(i2));
            if (m1795D != null) {
                return m1795D;
            }
        }
        return null;
    }

    /* renamed from: I */
    public static AbstractC0827X m1796I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0813I) view.getLayoutParams()).f3231a;
    }

    private C0306m getScrollingChildHelper() {
        if (this.f2419l0 == null) {
            this.f2419l0 = new C0306m(this);
        }
        return this.f2419l0;
    }

    /* renamed from: j */
    public static void m1801j(AbstractC0827X abstractC0827X) {
        WeakReference weakReference = abstractC0827X.f3281b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0827X.f3280a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0827X.f3281b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m1802A(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1802A(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1803B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f2422n
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            f0.k r5 = (p079f0.C0847k) r5
            int r6 = r5.f3413v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.m2249d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.m2248c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f3414w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3407p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f3414w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3404m = r6
        L55:
            r5.m2250f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f2424o = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1803B(android.view.MotionEvent):boolean");
    }

    /* renamed from: C */
    public final void m1804C(int[] iArr) {
        int m540n = this.f2404e.m540n();
        if (m540n == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < m540n; i4++) {
            AbstractC0827X m1796I = m1796I(this.f2404e.m539m(i4));
            if (!m1796I.m2228o()) {
                int m2215b = m1796I.m2215b();
                if (m2215b < i2) {
                    i2 = m2215b;
                }
                if (m2215b > i3) {
                    i3 = m2215b;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    /* renamed from: E */
    public final AbstractC0827X m1805E(int i2) {
        AbstractC0827X abstractC0827X = null;
        if (this.f2438y) {
            return null;
        }
        int m548w = this.f2404e.m548w();
        for (int i3 = 0; i3 < m548w; i3++) {
            AbstractC0827X m1796I = m1796I(this.f2404e.m547v(i3));
            if (m1796I != null && !m1796I.m2221h() && m1806F(m1796I) == i2) {
                if (!((ArrayList) this.f2404e.f517d).contains(m1796I.f3280a)) {
                    return m1796I;
                }
                abstractC0827X = m1796I;
            }
        }
        return abstractC0827X;
    }

    /* renamed from: F */
    public final int m1806F(AbstractC0827X abstractC0827X) {
        if (((abstractC0827X.f3289j & 524) != 0) || !abstractC0827X.m2218e()) {
            return -1;
        }
        C0185e c0185e = this.f2402d;
        int i2 = abstractC0827X.f3282c;
        ArrayList arrayList = (ArrayList) c0185e.f537c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0830a c0830a = (C0830a) arrayList.get(i3);
            int i4 = c0830a.f3302a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = c0830a.f3303b;
                    if (i5 <= i2) {
                        int i6 = c0830a.f3304c;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = c0830a.f3303b;
                    if (i7 == i2) {
                        i2 = c0830a.f3304c;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (c0830a.f3304c <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (c0830a.f3303b <= i2) {
                i2 += c0830a.f3304c;
            }
        }
        return i2;
    }

    /* renamed from: G */
    public final long m1807G(AbstractC0827X abstractC0827X) {
        return this.f2416k.f3493b ? abstractC0827X.f3284e : abstractC0827X.f3282c;
    }

    /* renamed from: H */
    public final AbstractC0827X m1808H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1796I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: J */
    public final Rect m1809J(View view) {
        C0813I c0813i = (C0813I) view.getLayoutParams();
        boolean z2 = c0813i.f3233c;
        Rect rect = c0813i.f3232b;
        if (!z2 || (this.f2401c0.f3264g && (c0813i.f3231a.m2224k() || c0813i.f3231a.m2219f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2420m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.f2410h;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0809E) arrayList.get(i2)).getClass();
            ((C0813I) view.getLayoutParams()).f3231a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0813i.f3233c = false;
        return rect;
    }

    /* renamed from: K */
    public final boolean m1810K() {
        return !this.f2430r || this.f2438y || this.f2402d.m565h();
    }

    /* renamed from: L */
    public final boolean m1811L() {
        return this.f2373A > 0;
    }

    /* renamed from: M */
    public final void m1812M(int i2) {
        if (this.f2418l == null) {
            return;
        }
        setScrollState(2);
        this.f2418l.mo1791n0(i2);
        awakenScrollBars();
    }

    /* renamed from: N */
    public final void m1813N() {
        int m548w = this.f2404e.m548w();
        for (int i2 = 0; i2 < m548w; i2++) {
            ((C0813I) this.f2404e.m547v(i2).getLayoutParams()).f3233c = true;
        }
        ArrayList arrayList = this.f2398b.f3243c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0813I c0813i = (C0813I) ((AbstractC0827X) arrayList.get(i3)).f3280a.getLayoutParams();
            if (c0813i != null) {
                c0813i.f3233c = true;
            }
        }
    }

    /* renamed from: O */
    public final void m1814O(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int m548w = this.f2404e.m548w();
        for (int i5 = 0; i5 < m548w; i5++) {
            AbstractC0827X m1796I = m1796I(this.f2404e.m547v(i5));
            if (m1796I != null && !m1796I.m2228o()) {
                int i6 = m1796I.f3282c;
                C0824U c0824u = this.f2401c0;
                if (i6 >= i4) {
                    m1796I.m2225l(-i3, z2);
                    c0824u.f3263f = true;
                } else if (i6 >= i2) {
                    m1796I.m2214a(8);
                    m1796I.m2225l(-i3, z2);
                    m1796I.f3282c = i2 - 1;
                    c0824u.f3263f = true;
                }
            }
        }
        C0818N c0818n = this.f2398b;
        ArrayList arrayList = c0818n.f3243c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0827X abstractC0827X = (AbstractC0827X) arrayList.get(size);
            if (abstractC0827X != null) {
                int i7 = abstractC0827X.f3282c;
                if (i7 >= i4) {
                    abstractC0827X.m2225l(-i3, z2);
                } else if (i7 >= i2) {
                    abstractC0827X.m2214a(8);
                    c0818n.m2202e(size);
                }
            }
        }
        requestLayout();
    }

    /* renamed from: P */
    public final void m1815P() {
        this.f2373A++;
    }

    /* renamed from: Q */
    public final void m1816Q(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.f2373A - 1;
        this.f2373A = i3;
        if (i3 < 1) {
            this.f2373A = 0;
            if (z2) {
                int i4 = this.f2436w;
                this.f2436w = 0;
                if (i4 != 0 && (accessibilityManager = this.f2437x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f2427p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0827X abstractC0827X = (AbstractC0827X) arrayList.get(size);
                    if (abstractC0827X.f3280a.getParent() == this && !abstractC0827X.m2228o() && (i2 = abstractC0827X.f3296q) != -1) {
                        WeakHashMap weakHashMap = AbstractC0272P.f768a;
                        abstractC0827X.f3280a.setImportantForAccessibility(i2);
                        abstractC0827X.f3296q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: R */
    public final void m1817R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2382J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f2382J = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f2386N = x2;
            this.f2384L = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f2387O = y2;
            this.f2385M = y2;
        }
    }

    /* renamed from: S */
    public final void m1818S() {
        if (this.f2413i0 || !this.f2426p) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        postOnAnimation(this.f2429q0);
        this.f2413i0 = true;
    }

    /* renamed from: T */
    public final void m1819T(boolean z2) {
        this.f2439z = z2 | this.f2439z;
        this.f2438y = true;
        int m548w = this.f2404e.m548w();
        for (int i2 = 0; i2 < m548w; i2++) {
            AbstractC0827X m1796I = m1796I(this.f2404e.m547v(i2));
            if (m1796I != null && !m1796I.m2228o()) {
                m1796I.m2214a(6);
            }
        }
        m1813N();
        C0818N c0818n = this.f2398b;
        ArrayList arrayList = c0818n.f3243c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0827X abstractC0827X = (AbstractC0827X) arrayList.get(i3);
            if (abstractC0827X != null) {
                abstractC0827X.m2214a(6);
                abstractC0827X.m2214a(1024);
            }
        }
        AbstractC0862z abstractC0862z = c0818n.f3248h.f2416k;
        if (abstractC0862z == null || !abstractC0862z.f3493b) {
            c0818n.m2201d();
        }
    }

    /* renamed from: U */
    public final void m1820U(AbstractC0827X abstractC0827X, C0312p c0312p) {
        abstractC0827X.f3289j &= -8193;
        boolean z2 = this.f2401c0.f3265h;
        C0019i c0019i = this.f2406f;
        if (z2 && abstractC0827X.m2224k() && !abstractC0827X.m2221h() && !abstractC0827X.m2228o()) {
            ((C1155e) c0019i.f48c).m2671d(m1807G(abstractC0827X), abstractC0827X);
        }
        C1161k c1161k = (C1161k) c0019i.f47b;
        C0843g0 c0843g0 = (C0843g0) c1161k.getOrDefault(abstractC0827X, null);
        if (c0843g0 == null) {
            c0843g0 = C0843g0.m2240a();
            c1161k.put(abstractC0827X, c0843g0);
        }
        c0843g0.f3370b = c0312p;
        c0843g0.f3369a |= 4;
    }

    /* renamed from: V */
    public final void m1821V(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2410h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0813I) {
            C0813I c0813i = (C0813I) layoutParams;
            if (!c0813i.f3233c) {
                int i2 = rect.left;
                Rect rect2 = c0813i.f3232b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2418l.mo1936k0(this, view, this.f2410h, !this.f2430r, view2 == null);
    }

    /* renamed from: W */
    public final void m1822W() {
        VelocityTracker velocityTracker = this.f2383K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        m1829d0(0);
        EdgeEffect edgeEffect = this.f2376D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f2376D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2377E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f2377E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2378F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f2378F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2379G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f2379G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1823X(int r18, int r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1823X(int, int, android.view.MotionEvent):boolean");
    }

    /* renamed from: Y */
    public final void m1824Y(int i2, int i3, int[] iArr) {
        AbstractC0827X abstractC0827X;
        C0176h c0176h = this.f2404e;
        m1827b0();
        m1815P();
        int i4 = AbstractC0168i.f500a;
        Trace.beginSection("RV Scroll");
        C0824U c0824u = this.f2401c0;
        m1849z(c0824u);
        C0818N c0818n = this.f2398b;
        int mo1742m0 = i2 != 0 ? this.f2418l.mo1742m0(i2, c0818n, c0824u) : 0;
        int mo1746o0 = i3 != 0 ? this.f2418l.mo1746o0(i3, c0818n, c0824u) : 0;
        Trace.endSection();
        int m540n = c0176h.m540n();
        for (int i5 = 0; i5 < m540n; i5++) {
            View m539m = c0176h.m539m(i5);
            AbstractC0827X m1808H = m1808H(m539m);
            if (m1808H != null && (abstractC0827X = m1808H.f3288i) != null) {
                int left = m539m.getLeft();
                int top = m539m.getTop();
                View view = abstractC0827X.f3280a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1816Q(true);
        m1828c0(false);
        if (iArr != null) {
            iArr[0] = mo1742m0;
            iArr[1] = mo1746o0;
        }
    }

    /* renamed from: Z */
    public final void m1825Z(int i2) {
        C0857u c0857u;
        if (this.f2434u) {
            return;
        }
        setScrollState(0);
        RunnableC0826W runnableC0826W = this.f2395W;
        runnableC0826W.f3278g.removeCallbacks(runnableC0826W);
        runnableC0826W.f3274c.abortAnimation();
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null && (c0857u = abstractC0812H.f3220e) != null) {
            c0857u.m2270i();
        }
        AbstractC0812H abstractC0812H2 = this.f2418l;
        if (abstractC0812H2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0812H2.mo1791n0(i2);
            awakenScrollBars();
        }
    }

    /* renamed from: a0 */
    public final void m1826a0(int i2, int i3, boolean z2) {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2434u) {
            return;
        }
        if (!abstractC0812H.mo1782d()) {
            i2 = 0;
        }
        if (!this.f2418l.mo1785e()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().m914g(i4, 1);
        }
        this.f2395W.m2213b(i2, i3, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null) {
            abstractC0812H.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    /* renamed from: b0 */
    public final void m1827b0() {
        int i2 = this.f2432s + 1;
        this.f2432s = i2;
        if (i2 != 1 || this.f2434u) {
            return;
        }
        this.f2433t = false;
    }

    /* renamed from: c0 */
    public final void m1828c0(boolean z2) {
        if (this.f2432s < 1) {
            this.f2432s = 1;
        }
        if (!z2 && !this.f2434u) {
            this.f2433t = false;
        }
        if (this.f2432s == 1) {
            if (z2 && this.f2433t && !this.f2434u && this.f2418l != null && this.f2416k != null) {
                m1838o();
            }
            if (!this.f2434u) {
                this.f2433t = false;
            }
        }
        this.f2432s--;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0813I) && this.f2418l.mo1732f((C0813I) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null && abstractC0812H.mo1782d()) {
            return this.f2418l.mo1789j(this.f2401c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null && abstractC0812H.mo1782d()) {
            return this.f2418l.mo1738k(this.f2401c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null && abstractC0812H.mo1782d()) {
            return this.f2418l.mo1740l(this.f2401c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null && abstractC0812H.mo1785e()) {
            return this.f2418l.mo1790m(this.f2401c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null && abstractC0812H.mo1785e()) {
            return this.f2418l.mo1744n(this.f2401c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null && abstractC0812H.mo1785e()) {
            return this.f2418l.mo1745o(this.f2401c0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public final void m1829d0(int i2) {
        getScrollingChildHelper().m915h(i2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return getScrollingChildHelper().m908a(f, f2, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m909b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m910c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().m911d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f2420m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0809E) arrayList.get(i2)).mo2160b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2376D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2408g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2376D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2377E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2408g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2377E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2378F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2408g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2378F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2379G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2408g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2379G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f2380H == null || arrayList.size() <= 0 || !this.f2380H.mo2159f()) ? z2 : true) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* renamed from: f */
    public final void m1830f(AbstractC0827X abstractC0827X) {
        View view = abstractC0827X.f3280a;
        boolean z2 = view.getParent() == this;
        this.f2398b.m2207j(m1808H(view));
        if (abstractC0827X.m2223j()) {
            this.f2404e.m532f(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f2404e.m531e(view, -1, true);
            return;
        }
        C0176h c0176h = this.f2404e;
        int indexOfChild = ((C0861y) c0176h.f515b).f3491a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0030a) c0176h.f516c).m99i(indexOfChild);
            c0176h.m549x(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018c, code lost:
    
        if ((r5 * r6) < 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0194, code lost:
    
        if ((r5 * r6) > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r7 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017e, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0181, code lost:
    
        if (r7 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0184, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public final void m1831g(AbstractC0809E abstractC0809E) {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null) {
            abstractC0812H.mo1780c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2420m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0809E);
        m1813N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null) {
            return abstractC0812H.mo1747r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1848y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null) {
            return abstractC0812H.mo1749s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1848y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0862z getAdapter() {
        return this.f2416k;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H == null) {
            return super.getBaseline();
        }
        abstractC0812H.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2408g;
    }

    public C0828Y getCompatAccessibilityDelegate() {
        return this.f2415j0;
    }

    public C0807C getEdgeEffectFactory() {
        return this.f2375C;
    }

    public AbstractC0808D getItemAnimator() {
        return this.f2380H;
    }

    public int getItemDecorationCount() {
        return this.f2420m.size();
    }

    public AbstractC0812H getLayoutManager() {
        return this.f2418l;
    }

    public int getMaxFlingVelocity() {
        return this.f2391S;
    }

    public int getMinFlingVelocity() {
        return this.f2390R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0814J getOnFlingListener() {
        return this.f2389Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2394V;
    }

    public C0817M getRecycledViewPool() {
        return this.f2398b.m2200c();
    }

    public int getScrollState() {
        return this.f2381I;
    }

    /* renamed from: h */
    public final void m1832h(AbstractC0815K abstractC0815K) {
        if (this.f2405e0 == null) {
            this.f2405e0 = new ArrayList();
        }
        this.f2405e0.add(abstractC0815K);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m913f(0);
    }

    /* renamed from: i */
    public final void m1833i(String str) {
        if (m1811L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m1848y());
        }
        if (this.f2374B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m1848y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2426p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2434u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f843d;
    }

    /* renamed from: k */
    public final void m1834k() {
        int m548w = this.f2404e.m548w();
        for (int i2 = 0; i2 < m548w; i2++) {
            AbstractC0827X m1796I = m1796I(this.f2404e.m547v(i2));
            if (!m1796I.m2228o()) {
                m1796I.f3283d = -1;
                m1796I.f3286g = -1;
            }
        }
        C0818N c0818n = this.f2398b;
        ArrayList arrayList = c0818n.f3243c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0827X abstractC0827X = (AbstractC0827X) arrayList.get(i3);
            abstractC0827X.f3283d = -1;
            abstractC0827X.f3286g = -1;
        }
        ArrayList arrayList2 = c0818n.f3241a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AbstractC0827X abstractC0827X2 = (AbstractC0827X) arrayList2.get(i4);
            abstractC0827X2.f3283d = -1;
            abstractC0827X2.f3286g = -1;
        }
        ArrayList arrayList3 = c0818n.f3242b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                AbstractC0827X abstractC0827X3 = (AbstractC0827X) c0818n.f3242b.get(i5);
                abstractC0827X3.f3283d = -1;
                abstractC0827X3.f3286g = -1;
            }
        }
    }

    /* renamed from: l */
    public final void m1835l(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.f2376D;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.f2376D.onRelease();
            z2 = this.f2376D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2378F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f2378F.onRelease();
            z2 |= this.f2378F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2377E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f2377E.onRelease();
            z2 |= this.f2377E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2379G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f2379G.onRelease();
            z2 |= this.f2379G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: m */
    public final void m1836m() {
        C0185e c0185e = this.f2402d;
        if (!this.f2430r || this.f2438y) {
            int i2 = AbstractC0168i.f500a;
            Trace.beginSection("RV FullInvalidate");
            m1838o();
            Trace.endSection();
            return;
        }
        if (c0185e.m565h()) {
            c0185e.getClass();
            if (c0185e.m565h()) {
                int i3 = AbstractC0168i.f500a;
                Trace.beginSection("RV FullInvalidate");
                m1838o();
                Trace.endSection();
            }
        }
    }

    /* renamed from: n */
    public final void m1837n(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setMeasuredDimension(AbstractC0812H.m2170g(i2, paddingRight, getMinimumWidth()), AbstractC0812H.m2170g(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0338, code lost:
    
        if (((java.util.ArrayList) r21.f2404e.f517d).contains(getFocusedChild()) == false) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e4  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [f0.X] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1838o() {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1838o():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2373A = r0
            r1 = 1
            r5.f2426p = r1
            boolean r2 = r5.f2430r
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f2430r = r2
            f0.H r2 = r5.f2418l
            if (r2 == 0) goto L21
            r2.f3222g = r1
            r2.mo1935Q(r5)
        L21:
            r5.f2413i0 = r0
            java.lang.ThreadLocal r0 = p079f0.RunnableC0850n.f3427e
            java.lang.Object r1 = r0.get()
            f0.n r1 = (p079f0.RunnableC0850n) r1
            r5.f2397a0 = r1
            if (r1 != 0) goto L6b
            f0.n r1 = new f0.n
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3429a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3432d = r2
            r5.f2397a0 = r1
            java.util.WeakHashMap r1 = p027K.AbstractC0272P.f768a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            f0.n r2 = r5.f2397a0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3431c = r3
            r0.set(r2)
        L6b:
            f0.n r0 = r5.f2397a0
            java.util.ArrayList r0 = r0.f3429a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0857u c0857u;
        super.onDetachedFromWindow();
        AbstractC0808D abstractC0808D = this.f2380H;
        if (abstractC0808D != null) {
            abstractC0808D.mo2158e();
        }
        setScrollState(0);
        RunnableC0826W runnableC0826W = this.f2395W;
        runnableC0826W.f3278g.removeCallbacks(runnableC0826W);
        runnableC0826W.f3274c.abortAnimation();
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null && (c0857u = abstractC0812H.f3220e) != null) {
            c0857u.m2270i();
        }
        this.f2426p = false;
        AbstractC0812H abstractC0812H2 = this.f2418l;
        if (abstractC0812H2 != null) {
            abstractC0812H2.f3222g = false;
            abstractC0812H2.mo1769R(this);
        }
        this.f2427p0.clear();
        removeCallbacks(this.f2429q0);
        this.f2406f.getClass();
        while (C0843g0.f3368d.mo630a() != null) {
        }
        RunnableC0850n runnableC0850n = this.f2397a0;
        if (runnableC0850n != null) {
            runnableC0850n.f3429a.remove(this);
            this.f2397a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2420m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0809E) arrayList.get(i2)).mo1946a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            f0.H r0 = r5.f2418l
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.f2434u
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            f0.H r0 = r5.f2418l
            boolean r0 = r0.mo1785e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            f0.H r3 = r5.f2418l
            boolean r3 = r3.mo1782d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            f0.H r3 = r5.f2418l
            boolean r3 = r3.mo1785e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            f0.H r3 = r5.f2418l
            boolean r3 = r3.mo1782d()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.f2392T
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f2393U
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m1823X(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.f2434u) {
            this.f2424o = null;
            if (m1803B(motionEvent)) {
                m1822W();
                setScrollState(0);
                return true;
            }
            AbstractC0812H abstractC0812H = this.f2418l;
            if (abstractC0812H != null) {
                boolean mo1782d = abstractC0812H.mo1782d();
                boolean mo1785e = this.f2418l.mo1785e();
                if (this.f2383K == null) {
                    this.f2383K = VelocityTracker.obtain();
                }
                this.f2383K.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f2435v) {
                        this.f2435v = false;
                    }
                    this.f2382J = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.f2386N = x2;
                    this.f2384L = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.f2387O = y2;
                    this.f2385M = y2;
                    if (this.f2381I == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m1829d0(1);
                    }
                    int[] iArr = this.f2423n0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i2 = mo1782d;
                    if (mo1785e) {
                        i2 = (mo1782d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m914g(i2, 0);
                } else if (actionMasked == 1) {
                    this.f2383K.clear();
                    m1829d0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2382J);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2382J + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f2381I != 1) {
                        int i3 = x3 - this.f2384L;
                        int i4 = y3 - this.f2385M;
                        if (mo1782d == 0 || Math.abs(i3) <= this.f2388P) {
                            z2 = false;
                        } else {
                            this.f2386N = x3;
                            z2 = true;
                        }
                        if (mo1785e && Math.abs(i4) > this.f2388P) {
                            this.f2387O = y3;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    m1822W();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f2382J = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f2386N = x4;
                    this.f2384L = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f2387O = y4;
                    this.f2385M = y4;
                } else if (actionMasked == 6) {
                    m1817R(motionEvent);
                }
                if (this.f2381I == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = AbstractC0168i.f500a;
        Trace.beginSection("RV OnLayout");
        m1838o();
        Trace.endSection();
        this.f2430r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H == null) {
            m1837n(i2, i3);
            return;
        }
        boolean mo1763L = abstractC0812H.mo1763L();
        C0824U c0824u = this.f2401c0;
        if (!mo1763L) {
            if (this.f2428q) {
                this.f2418l.f3217b.m1837n(i2, i3);
                return;
            }
            if (c0824u.f3268k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0862z abstractC0862z = this.f2416k;
            if (abstractC0862z != null) {
                c0824u.f3262e = abstractC0862z.mo474a();
            } else {
                c0824u.f3262e = 0;
            }
            m1827b0();
            this.f2418l.f3217b.m1837n(i2, i3);
            m1828c0(false);
            c0824u.f3264g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f2418l.f3217b.m1837n(i2, i3);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f2416k == null) {
            return;
        }
        if (c0824u.f3261d == 1) {
            m1839p();
        }
        this.f2418l.m2189q0(i2, i3);
        c0824u.f3266i = true;
        m1840q();
        this.f2418l.m2190s0(i2, i3);
        if (this.f2418l.mo1793v0()) {
            this.f2418l.m2189q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c0824u.f3266i = true;
            m1840q();
            this.f2418l.m2190s0(i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (m1811L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0821Q)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0821Q c0821q = (C0821Q) parcelable;
        this.f2400c = c0821q;
        super.onRestoreInstanceState(c0821q.f1273a);
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H == null || (parcelable2 = this.f2400c.f3250c) == null) {
            return;
        }
        abstractC0812H.mo1783d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0821Q c0821q = new C0821Q(super.onSaveInstanceState());
        C0821Q c0821q2 = this.f2400c;
        if (c0821q2 != null) {
            c0821q.f3250c = c0821q2.f3250c;
            return c0821q;
        }
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null) {
            c0821q.f3250c = abstractC0812H.mo1786e0();
            return c0821q;
        }
        c0821q.f3250c = null;
        return c0821q;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f2379G = null;
        this.f2377E = null;
        this.f2378F = null;
        this.f2376D = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0405, code lost:
    
        if (r2 < r5) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Type inference failed for: r9v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x03f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1839p() {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1839p():void");
    }

    /* renamed from: q */
    public final void m1840q() {
        m1827b0();
        m1815P();
        C0824U c0824u = this.f2401c0;
        c0824u.m2210a(6);
        this.f2402d.m561d();
        c0824u.f3262e = this.f2416k.mo474a();
        c0824u.f3260c = 0;
        c0824u.f3264g = false;
        this.f2418l.mo1729b0(this.f2398b, c0824u);
        c0824u.f3263f = false;
        this.f2400c = null;
        c0824u.f3267j = c0824u.f3267j && this.f2380H != null;
        c0824u.f3261d = 4;
        m1816Q(true);
        m1828c0(false);
    }

    /* renamed from: r */
    public final boolean m1841r(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().m910c(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        AbstractC0827X m1796I = m1796I(view);
        if (m1796I != null) {
            if (m1796I.m2223j()) {
                m1796I.f3289j &= -257;
            } else if (!m1796I.m2228o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m1796I + m1848y());
            }
        }
        view.clearAnimation();
        m1796I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0857u c0857u = this.f2418l.f3220e;
        if ((c0857u == null || !c0857u.f3472e) && !m1811L() && view2 != null) {
            m1821V(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2418l.mo1936k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2422n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0847k) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2432s != 0 || this.f2434u) {
            this.f2433t = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m1842s(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().m911d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2434u) {
            return;
        }
        boolean mo1782d = abstractC0812H.mo1782d();
        boolean mo1785e = this.f2418l.mo1785e();
        if (mo1782d || mo1785e) {
            if (!mo1782d) {
                i2 = 0;
            }
            if (!mo1785e) {
                i3 = 0;
            }
            m1823X(i2, i3, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1811L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2436w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0828Y c0828y) {
        this.f2415j0 = c0828y;
        AbstractC0272P.m823m(this, c0828y);
    }

    public void setAdapter(AbstractC0862z abstractC0862z) {
        setLayoutFrozen(false);
        AbstractC0862z abstractC0862z2 = this.f2416k;
        C0820P c0820p = this.f2396a;
        if (abstractC0862z2 != null) {
            abstractC0862z2.f3492a.unregisterObserver(c0820p);
            this.f2416k.getClass();
        }
        AbstractC0808D abstractC0808D = this.f2380H;
        if (abstractC0808D != null) {
            abstractC0808D.mo2158e();
        }
        AbstractC0812H abstractC0812H = this.f2418l;
        C0818N c0818n = this.f2398b;
        if (abstractC0812H != null) {
            abstractC0812H.m2182g0(c0818n);
            this.f2418l.m2183h0(c0818n);
        }
        c0818n.f3241a.clear();
        c0818n.m2201d();
        C0185e c0185e = this.f2402d;
        c0185e.m570m((ArrayList) c0185e.f537c);
        c0185e.m570m((ArrayList) c0185e.f538d);
        AbstractC0862z abstractC0862z3 = this.f2416k;
        this.f2416k = abstractC0862z;
        if (abstractC0862z != null) {
            abstractC0862z.f3492a.registerObserver(c0820p);
        }
        AbstractC0862z abstractC0862z4 = this.f2416k;
        c0818n.f3241a.clear();
        c0818n.m2201d();
        C0817M m2200c = c0818n.m2200c();
        if (abstractC0862z3 != null) {
            m2200c.f3240b--;
        }
        if (m2200c.f3240b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = m2200c.f3239a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((C0816L) sparseArray.valueAt(i2)).f3235a.clear();
                i2++;
            }
        }
        if (abstractC0862z4 != null) {
            m2200c.f3240b++;
        }
        this.f2401c0.f3263f = true;
        m1819T(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0806B interfaceC0806B) {
        if (interfaceC0806B == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2408g) {
            this.f2379G = null;
            this.f2377E = null;
            this.f2378F = null;
            this.f2376D = null;
        }
        this.f2408g = z2;
        super.setClipToPadding(z2);
        if (this.f2430r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0807C c0807c) {
        c0807c.getClass();
        this.f2375C = c0807c;
        this.f2379G = null;
        this.f2377E = null;
        this.f2378F = null;
        this.f2376D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2428q = z2;
    }

    public void setItemAnimator(AbstractC0808D abstractC0808D) {
        AbstractC0808D abstractC0808D2 = this.f2380H;
        if (abstractC0808D2 != null) {
            abstractC0808D2.mo2158e();
            this.f2380H.f3204a = null;
        }
        this.f2380H = abstractC0808D;
        if (abstractC0808D != null) {
            abstractC0808D.f3204a = this.f2411h0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        C0818N c0818n = this.f2398b;
        c0818n.f3245e = i2;
        c0818n.m2208k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC0812H abstractC0812H) {
        RecyclerView recyclerView;
        C0857u c0857u;
        if (abstractC0812H == this.f2418l) {
            return;
        }
        setScrollState(0);
        RunnableC0826W runnableC0826W = this.f2395W;
        runnableC0826W.f3278g.removeCallbacks(runnableC0826W);
        runnableC0826W.f3274c.abortAnimation();
        AbstractC0812H abstractC0812H2 = this.f2418l;
        if (abstractC0812H2 != null && (c0857u = abstractC0812H2.f3220e) != null) {
            c0857u.m2270i();
        }
        AbstractC0812H abstractC0812H3 = this.f2418l;
        C0818N c0818n = this.f2398b;
        if (abstractC0812H3 != null) {
            AbstractC0808D abstractC0808D = this.f2380H;
            if (abstractC0808D != null) {
                abstractC0808D.mo2158e();
            }
            this.f2418l.m2182g0(c0818n);
            this.f2418l.m2183h0(c0818n);
            c0818n.f3241a.clear();
            c0818n.m2201d();
            if (this.f2426p) {
                AbstractC0812H abstractC0812H4 = this.f2418l;
                abstractC0812H4.f3222g = false;
                abstractC0812H4.mo1769R(this);
            }
            this.f2418l.m2191t0(null);
            this.f2418l = null;
        } else {
            c0818n.f3241a.clear();
            c0818n.m2201d();
        }
        C0176h c0176h = this.f2404e;
        ((C0030a) c0176h.f516c).m98h();
        ArrayList arrayList = (ArrayList) c0176h.f517d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0861y) c0176h.f515b).f3491a;
            if (size < 0) {
                break;
            }
            AbstractC0827X m1796I = m1796I((View) arrayList.get(size));
            if (m1796I != null) {
                int i2 = m1796I.f3295p;
                if (recyclerView.m1811L()) {
                    m1796I.f3296q = i2;
                    recyclerView.f2427p0.add(m1796I);
                } else {
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    m1796I.f3280a.setImportantForAccessibility(i2);
                }
                m1796I.f3295p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            m1796I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2418l = abstractC0812H;
        if (abstractC0812H != null) {
            if (abstractC0812H.f3217b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0812H + " is already attached to a RecyclerView:" + abstractC0812H.f3217b.m1848y());
            }
            abstractC0812H.m2191t0(this);
            if (this.f2426p) {
                AbstractC0812H abstractC0812H5 = this.f2418l;
                abstractC0812H5.f3222g = true;
                abstractC0812H5.mo1935Q(this);
            }
        }
        c0818n.m2208k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0306m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f843d) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            AbstractC0261E.m765z(scrollingChildHelper.f842c);
        }
        scrollingChildHelper.f843d = z2;
    }

    public void setOnFlingListener(AbstractC0814J abstractC0814J) {
        this.f2389Q = abstractC0814J;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0815K abstractC0815K) {
        this.f2403d0 = abstractC0815K;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2394V = z2;
    }

    public void setRecycledViewPool(C0817M c0817m) {
        C0818N c0818n = this.f2398b;
        if (c0818n.f3247g != null) {
            r1.f3240b--;
        }
        c0818n.f3247g = c0817m;
        if (c0817m == null || c0818n.f3248h.getAdapter() == null) {
            return;
        }
        c0818n.f3247g.f3240b++;
    }

    public void setScrollState(int i2) {
        C0857u c0857u;
        if (i2 == this.f2381I) {
            return;
        }
        this.f2381I = i2;
        if (i2 != 2) {
            RunnableC0826W runnableC0826W = this.f2395W;
            runnableC0826W.f3278g.removeCallbacks(runnableC0826W);
            runnableC0826W.f3274c.abortAnimation();
            AbstractC0812H abstractC0812H = this.f2418l;
            if (abstractC0812H != null && (c0857u = abstractC0812H.f3220e) != null) {
                c0857u.m2270i();
            }
        }
        AbstractC0812H abstractC0812H2 = this.f2418l;
        if (abstractC0812H2 != null) {
            abstractC0812H2.mo1881f0(i2);
        }
        AbstractC0815K abstractC0815K = this.f2403d0;
        if (abstractC0815K != null) {
            abstractC0815K.mo1947a(this, i2);
        }
        ArrayList arrayList = this.f2405e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0815K) this.f2405e0.get(size)).mo1947a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f2388P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f2388P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0825V abstractC0825V) {
        this.f2398b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().m914g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m915h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0857u c0857u;
        if (z2 != this.f2434u) {
            m1833i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f2434u = false;
                if (this.f2433t && this.f2418l != null && this.f2416k != null) {
                    requestLayout();
                }
                this.f2433t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2434u = true;
            this.f2435v = true;
            setScrollState(0);
            RunnableC0826W runnableC0826W = this.f2395W;
            runnableC0826W.f3278g.removeCallbacks(runnableC0826W);
            runnableC0826W.f3274c.abortAnimation();
            AbstractC0812H abstractC0812H = this.f2418l;
            if (abstractC0812H == null || (c0857u = abstractC0812H.f3220e) == null) {
                return;
            }
            c0857u.m2270i();
        }
    }

    /* renamed from: t */
    public final void m1843t(int i2, int i3) {
        this.f2374B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        AbstractC0815K abstractC0815K = this.f2403d0;
        if (abstractC0815K != null) {
            abstractC0815K.mo1948b(this, i2, i3);
        }
        ArrayList arrayList = this.f2405e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0815K) this.f2405e0.get(size)).mo1948b(this, i2, i3);
            }
        }
        this.f2374B--;
    }

    /* renamed from: u */
    public final void m1844u() {
        if (this.f2379G != null) {
            return;
        }
        this.f2375C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2379G = edgeEffect;
        if (this.f2408g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: v */
    public final void m1845v() {
        if (this.f2376D != null) {
            return;
        }
        this.f2375C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2376D = edgeEffect;
        if (this.f2408g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: w */
    public final void m1846w() {
        if (this.f2378F != null) {
            return;
        }
        this.f2375C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2378F = edgeEffect;
        if (this.f2408g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: x */
    public final void m1847x() {
        if (this.f2377E != null) {
            return;
        }
        this.f2375C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2377E = edgeEffect;
        if (this.f2408g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: y */
    public final String m1848y() {
        return " " + super.toString() + ", adapter:" + this.f2416k + ", layout:" + this.f2418l + ", context:" + getContext();
    }

    /* renamed from: z */
    public final void m1849z(C0824U c0824u) {
        if (getScrollState() != 2) {
            c0824u.getClass();
            return;
        }
        OverScroller overScroller = this.f2395W.f3274c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0824u.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float m831a;
        AttributeSet attributeSet2;
        char c2;
        TypedArray typedArray;
        int i3;
        char c3;
        int i4;
        Constructor constructor;
        Object[] objArr;
        this.f2396a = new C0820P(this);
        this.f2398b = new C0818N(this);
        this.f2406f = new C0019i(17);
        this.f2410h = new Rect();
        this.f2412i = new Rect();
        this.f2414j = new RectF();
        this.f2420m = new ArrayList();
        this.f2422n = new ArrayList();
        this.f2432s = 0;
        this.f2438y = false;
        this.f2439z = false;
        this.f2373A = 0;
        this.f2374B = 0;
        this.f2375C = new C0807C();
        C0844h c0844h = new C0844h();
        c0844h.f3204a = null;
        c0844h.f3205b = new ArrayList();
        c0844h.f3206c = 120L;
        c0844h.f3207d = 120L;
        c0844h.f3208e = 250L;
        c0844h.f3209f = 250L;
        c0844h.f3373g = true;
        c0844h.f3374h = new ArrayList();
        c0844h.f3375i = new ArrayList();
        c0844h.f3376j = new ArrayList();
        c0844h.f3377k = new ArrayList();
        c0844h.f3378l = new ArrayList();
        c0844h.f3379m = new ArrayList();
        c0844h.f3380n = new ArrayList();
        c0844h.f3381o = new ArrayList();
        c0844h.f3382p = new ArrayList();
        c0844h.f3383q = new ArrayList();
        c0844h.f3384r = new ArrayList();
        this.f2380H = c0844h;
        this.f2381I = 0;
        this.f2382J = -1;
        this.f2392T = Float.MIN_VALUE;
        this.f2393U = Float.MIN_VALUE;
        this.f2394V = true;
        this.f2395W = new RunnableC0826W(this);
        this.f2399b0 = new C0848l();
        C0824U c0824u = new C0824U();
        c0824u.f3258a = -1;
        c0824u.f3259b = 0;
        c0824u.f3260c = 0;
        c0824u.f3261d = 1;
        c0824u.f3262e = 0;
        c0824u.f3263f = false;
        c0824u.f3264g = false;
        c0824u.f3265h = false;
        c0824u.f3266i = false;
        c0824u.f3267j = false;
        c0824u.f3268k = false;
        this.f2401c0 = c0824u;
        this.f2407f0 = false;
        this.f2409g0 = false;
        C0861y c0861y = new C0861y(this);
        this.f2411h0 = c0861y;
        this.f2413i0 = false;
        this.f2417k0 = new int[2];
        this.f2421m0 = new int[2];
        this.f2423n0 = new int[2];
        this.f2425o0 = new int[2];
        this.f2427p0 = new ArrayList();
        this.f2429q0 = new RunnableC0402A(9, this);
        this.f2431r0 = new C0861y(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2388P = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = AbstractC0276U.f774a;
            m831a = AbstractC0273Q.m825a(viewConfiguration);
        } else {
            m831a = AbstractC0276U.m831a(viewConfiguration, context);
        }
        this.f2392T = m831a;
        this.f2393U = i5 >= 26 ? AbstractC0273Q.m826b(viewConfiguration) : AbstractC0276U.m831a(viewConfiguration, context);
        this.f2390R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2391S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2380H.f3204a = c0861y;
        this.f2402d = new C0185e(new C0861y(this));
        this.f2404e = new C0176h(new C0861y(this));
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if ((i5 >= 26 ? AbstractC0263G.m772c(this) : 0) == 0 && i5 >= 26) {
            AbstractC0263G.m782m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2437x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0828Y(this));
        int[] iArr = AbstractC0803a.f3200a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (i5 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2408g = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m1848y());
            }
            Resources resources = getContext().getResources();
            c3 = 2;
            i4 = i2;
            c2 = 3;
            i3 = 4;
            typedArray = obtainStyledAttributes;
            attributeSet2 = attributeSet;
            new C0847k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.nfupay.s145.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.nfupay.s145.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.nfupay.s145.R.dimen.fastscroll_margin));
        } else {
            attributeSet2 = attributeSet;
            c2 = 3;
            typedArray = obtainStyledAttributes;
            i3 = 4;
            c3 = 2;
            i4 = i2;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0812H.class);
                    try {
                        constructor = asSubclass.getConstructor(f2371t0);
                        objArr = new Object[i3];
                        objArr[0] = context;
                        objArr[1] = attributeSet2;
                        objArr[c3] = Integer.valueOf(i4);
                        objArr[c2] = 0;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0812H) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                }
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        int[] iArr2 = f2370s0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i4, 0);
        if (i6 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet2, obtainStyledAttributes2, i4, 0);
        }
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0812H abstractC0812H = this.f2418l;
        if (abstractC0812H != null) {
            return abstractC0812H.mo1750t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1848y());
    }

    public void setRecyclerListener(InterfaceC0819O interfaceC0819O) {
    }
}
