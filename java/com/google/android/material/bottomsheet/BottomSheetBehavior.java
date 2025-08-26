package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.activity.C0562b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nfupay.s145.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p002B.C0019i;
import p005C.AbstractC0044g;
import p010D1.AbstractC0104l;
import p014F0.C0132I;
import p014F0.ViewOnAttachStateChangeListenerC0131H;
import p017G0.C0177i;
import p017G0.C0178j;
import p017G0.InterfaceC0170b;
import p018H.C0190j;
import p021I.C0214i;
import p027K.AbstractC0259C;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p027K.C0282a;
import p027K.C0284b;
import p027K.C0285b0;
import p027K.C0287c0;
import p027K.C0288d;
import p027K.ViewOnApplyWindowInsetsListenerC0283a0;
import p030L.C0337d;
import p034M0.C0361f;
import p034M0.C0362g;
import p034M0.C0366k;
import p037N0.C0387d;
import p037N0.C0389f;
import p043P0.C0403B;
import p052T.C0483e;
import p064Z.C0549a;
import p088j.RunnableC0967W;
import p108q0.AbstractC1183a;
import p111r0.AbstractC1188a;
import p122v0.C1270a;
import p127x.AbstractC1303a;
import p127x.C1306d;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC1303a implements InterfaceC0170b {

    /* renamed from: A */
    public final C0389f f2512A;

    /* renamed from: B */
    public final ValueAnimator f2513B;

    /* renamed from: C */
    public final int f2514C;

    /* renamed from: D */
    public int f2515D;

    /* renamed from: E */
    public int f2516E;

    /* renamed from: F */
    public final float f2517F;

    /* renamed from: G */
    public int f2518G;

    /* renamed from: H */
    public final float f2519H;

    /* renamed from: I */
    public boolean f2520I;

    /* renamed from: J */
    public boolean f2521J;

    /* renamed from: K */
    public final boolean f2522K;

    /* renamed from: L */
    public int f2523L;

    /* renamed from: M */
    public C0483e f2524M;

    /* renamed from: N */
    public boolean f2525N;

    /* renamed from: O */
    public int f2526O;

    /* renamed from: P */
    public boolean f2527P;

    /* renamed from: Q */
    public final float f2528Q;

    /* renamed from: R */
    public int f2529R;

    /* renamed from: S */
    public int f2530S;

    /* renamed from: T */
    public int f2531T;

    /* renamed from: U */
    public WeakReference f2532U;

    /* renamed from: V */
    public WeakReference f2533V;

    /* renamed from: W */
    public final ArrayList f2534W;

    /* renamed from: X */
    public VelocityTracker f2535X;

    /* renamed from: Y */
    public C0178j f2536Y;

    /* renamed from: Z */
    public int f2537Z;

    /* renamed from: a */
    public final int f2538a;

    /* renamed from: a0 */
    public int f2539a0;

    /* renamed from: b */
    public boolean f2540b;

    /* renamed from: b0 */
    public boolean f2541b0;

    /* renamed from: c */
    public final float f2542c;

    /* renamed from: c0 */
    public HashMap f2543c0;

    /* renamed from: d */
    public final int f2544d;

    /* renamed from: d0 */
    public final SparseIntArray f2545d0;

    /* renamed from: e */
    public int f2546e;

    /* renamed from: e0 */
    public final C0387d f2547e0;

    /* renamed from: f */
    public boolean f2548f;

    /* renamed from: g */
    public int f2549g;

    /* renamed from: h */
    public final int f2550h;

    /* renamed from: i */
    public final C0362g f2551i;

    /* renamed from: j */
    public final ColorStateList f2552j;

    /* renamed from: k */
    public final int f2553k;

    /* renamed from: l */
    public final int f2554l;

    /* renamed from: m */
    public int f2555m;

    /* renamed from: n */
    public final boolean f2556n;

    /* renamed from: o */
    public final boolean f2557o;

    /* renamed from: p */
    public final boolean f2558p;

    /* renamed from: q */
    public final boolean f2559q;

    /* renamed from: r */
    public final boolean f2560r;

    /* renamed from: s */
    public final boolean f2561s;

    /* renamed from: t */
    public final boolean f2562t;

    /* renamed from: u */
    public final boolean f2563u;

    /* renamed from: v */
    public int f2564v;

    /* renamed from: w */
    public int f2565w;

    /* renamed from: x */
    public final boolean f2566x;

    /* renamed from: y */
    public final C0366k f2567y;

    /* renamed from: z */
    public boolean f2568z;

    public BottomSheetBehavior() {
        this.f2538a = 0;
        this.f2540b = true;
        this.f2553k = -1;
        this.f2554l = -1;
        this.f2512A = new C0389f(this);
        this.f2517F = 0.5f;
        this.f2519H = -1.0f;
        this.f2522K = true;
        this.f2523L = 4;
        this.f2528Q = 0.1f;
        this.f2534W = new ArrayList();
        this.f2539a0 = -1;
        this.f2545d0 = new SparseIntArray();
        this.f2547e0 = new C0387d(this, 1);
    }

    /* renamed from: A */
    public static int m1902A(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    /* renamed from: z */
    public static View m1903z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (AbstractC0261E.m755p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View m1903z = m1903z(viewGroup.getChildAt(i2));
            if (m1903z != null) {
                return m1903z;
            }
        }
        return null;
    }

    /* renamed from: B */
    public final int m1904B() {
        if (this.f2540b) {
            return this.f2515D;
        }
        return Math.max(this.f2514C, this.f2560r ? 0 : this.f2565w);
    }

    /* renamed from: C */
    public final int m1905C(int i2) {
        if (i2 == 3) {
            return m1904B();
        }
        if (i2 == 4) {
            return this.f2518G;
        }
        if (i2 == 5) {
            return this.f2531T;
        }
        if (i2 == 6) {
            return this.f2516E;
        }
        throw new IllegalArgumentException(AbstractC0044g.m153e("Invalid state to get top offset: ", i2));
    }

    /* renamed from: D */
    public final boolean m1906D() {
        WeakReference weakReference = this.f2532U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f2532U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void m1907E(int i2) {
        if (i2 == -1) {
            if (this.f2548f) {
                return;
            } else {
                this.f2548f = true;
            }
        } else {
            if (!this.f2548f && this.f2546e == i2) {
                return;
            }
            this.f2548f = false;
            this.f2546e = Math.max(0, i2);
        }
        m1915M();
    }

    /* renamed from: F */
    public final void m1908F(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f2520I && i2 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
            return;
        }
        int i3 = (i2 == 6 && this.f2540b && m1905C(i2) <= this.f2515D) ? 3 : i2;
        WeakReference weakReference = this.f2532U;
        if (weakReference == null || weakReference.get() == null) {
            m1909G(i2);
            return;
        }
        View view = (View) this.f2532U.get();
        RunnableC0967W runnableC0967W = new RunnableC0967W(this, view, i3);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0967W);
                return;
            }
        }
        runnableC0967W.run();
    }

    /* renamed from: G */
    public final void m1909G(int i2) {
        if (this.f2523L == i2) {
            return;
        }
        this.f2523L = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z2 = this.f2520I;
        }
        WeakReference weakReference = this.f2532U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            m1914L(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            m1914L(false);
        }
        m1913K(i2, true);
        ArrayList arrayList = this.f2534W;
        if (arrayList.size() <= 0) {
            m1912J();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: H */
    public final boolean m1910H(View view, float f) {
        if (this.f2521J) {
            return true;
        }
        if (view.getTop() < this.f2518G) {
            return false;
        }
        return Math.abs(((f * this.f2528Q) + ((float) view.getTop())) - ((float) this.f2518G)) / ((float) m1921x()) > 0.5f;
    }

    /* renamed from: I */
    public final void m1911I(View view, int i2, boolean z2) {
        int m1905C = m1905C(i2);
        C0483e c0483e = this.f2524M;
        if (c0483e == null || (!z2 ? c0483e.m1258s(view, view.getLeft(), m1905C) : c0483e.m1256q(view.getLeft(), m1905C))) {
            m1909G(i2);
            return;
        }
        m1909G(2);
        m1913K(i2, true);
        this.f2512A.m1052a(i2);
    }

    /* renamed from: J */
    public final void m1912J() {
        View view;
        int i2;
        WeakReference weakReference = this.f2532U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0272P.m820j(view, 524288);
        AbstractC0272P.m818h(view, 0);
        AbstractC0272P.m820j(view, 262144);
        AbstractC0272P.m818h(view, 0);
        AbstractC0272P.m820j(view, 1048576);
        AbstractC0272P.m818h(view, 0);
        SparseIntArray sparseIntArray = this.f2545d0;
        int i3 = sparseIntArray.get(0, -1);
        if (i3 != -1) {
            AbstractC0272P.m820j(view, i3);
            AbstractC0272P.m818h(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2540b && this.f2523L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0190j c0190j = new C0190j(this, 6);
            ArrayList m816f = AbstractC0272P.m816f(view);
            int i4 = 0;
            while (true) {
                if (i4 >= m816f.size()) {
                    int i5 = -1;
                    for (int i6 = 0; i6 < 32 && i5 == -1; i6++) {
                        int i7 = AbstractC0272P.f771d[i6];
                        boolean z2 = true;
                        for (int i8 = 0; i8 < m816f.size(); i8++) {
                            z2 &= ((C0337d) m816f.get(i8)).m961a() != i7;
                        }
                        if (z2) {
                            i5 = i7;
                        }
                    }
                    i2 = i5;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0337d) m816f.get(i4)).f887a).getLabel())) {
                        i2 = ((C0337d) m816f.get(i4)).m961a();
                        break;
                    }
                    i4++;
                }
            }
            if (i2 != -1) {
                C0337d c0337d = new C0337d(null, i2, string, c0190j, null);
                View.AccessibilityDelegate m814d = AbstractC0272P.m814d(view);
                C0284b c0284b = m814d == null ? null : m814d instanceof C0282a ? ((C0282a) m814d).f781a : new C0284b(m814d);
                if (c0284b == null) {
                    c0284b = new C0284b();
                }
                AbstractC0272P.m823m(view, c0284b);
                AbstractC0272P.m820j(view, c0337d.m961a());
                AbstractC0272P.m816f(view).add(c0337d);
                AbstractC0272P.m818h(view, 0);
            }
            sparseIntArray.put(0, i2);
        }
        if (this.f2520I && this.f2523L != 5) {
            AbstractC0272P.m821k(view, C0337d.f884l, new C0190j(this, 5));
        }
        int i9 = this.f2523L;
        if (i9 == 3) {
            AbstractC0272P.m821k(view, C0337d.f883k, new C0190j(this, this.f2540b ? 4 : 6));
            return;
        }
        if (i9 == 4) {
            AbstractC0272P.m821k(view, C0337d.f882j, new C0190j(this, this.f2540b ? 3 : 6));
        } else {
            if (i9 != 6) {
                return;
            }
            AbstractC0272P.m821k(view, C0337d.f883k, new C0190j(this, 4));
            AbstractC0272P.m821k(view, C0337d.f882j, new C0190j(this, 3));
        }
    }

    /* renamed from: K */
    public final void m1913K(int i2, boolean z2) {
        C0362g c0362g = this.f2551i;
        ValueAnimator valueAnimator = this.f2513B;
        if (i2 == 2) {
            return;
        }
        boolean z3 = this.f2523L == 3 && (this.f2566x || m1906D());
        if (this.f2568z == z3 || c0362g == null) {
            return;
        }
        this.f2568z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c0362g.f931a.f922i, z3 ? m1920w() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float m1920w = this.f2568z ? m1920w() : 1.0f;
        C0361f c0361f = c0362g.f931a;
        if (c0361f.f922i != m1920w) {
            c0361f.f922i = m1920w;
            c0362g.f935e = true;
            c0362g.invalidateSelf();
        }
    }

    /* renamed from: L */
    public final void m1914L(boolean z2) {
        WeakReference weakReference = this.f2532U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f2543c0 != null) {
                    return;
                } else {
                    this.f2543c0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f2532U.get() && z2) {
                    this.f2543c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f2543c0 = null;
        }
    }

    /* renamed from: M */
    public final void m1915M() {
        View view;
        if (this.f2532U != null) {
            m1919v();
            if (this.f2523L != 4 || (view = (View) this.f2532U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: a */
    public final void mo503a() {
        int i2 = 0;
        C0178j c0178j = this.f2536Y;
        if (c0178j == null) {
            return;
        }
        C0562b c0562b = c0178j.f506f;
        c0178j.f506f = null;
        if (c0562b == null || Build.VERSION.SDK_INT < 34) {
            m1908F(this.f2520I ? 5 : 4);
            return;
        }
        boolean z2 = this.f2520I;
        int i3 = c0178j.f504d;
        int i4 = c0178j.f503c;
        float f = c0562b.f1564c;
        if (!z2) {
            AnimatorSet m552a = c0178j.m552a();
            m552a.setDuration(AbstractC1188a.m2749c(i4, i3, f));
            m552a.start();
            m1908F(4);
            return;
        }
        C0177i c0177i = new C0177i(8, this);
        View view = c0178j.f502b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        ofFloat.setInterpolator(new C0549a(1));
        ofFloat.setDuration(AbstractC1188a.m2749c(i4, i3, f));
        ofFloat.addListener(new C0177i(i2, c0178j));
        ofFloat.addListener(c0177i);
        ofFloat.start();
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: b */
    public final void mo504b(C0562b c0562b) {
        C0178j c0178j = this.f2536Y;
        if (c0178j == null) {
            return;
        }
        c0178j.f506f = c0562b;
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: c */
    public final void mo505c(C0562b c0562b) {
        C0178j c0178j = this.f2536Y;
        if (c0178j == null) {
            return;
        }
        if (c0178j.f506f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0562b c0562b2 = c0178j.f506f;
        c0178j.f506f = c0562b;
        if (c0562b2 == null) {
            return;
        }
        c0178j.m553b(c0562b.f1564c);
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: d */
    public final void mo506d() {
        C0178j c0178j = this.f2536Y;
        if (c0178j == null) {
            return;
        }
        if (c0178j.f506f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0562b c0562b = c0178j.f506f;
        c0178j.f506f = null;
        if (c0562b == null) {
            return;
        }
        AnimatorSet m552a = c0178j.m552a();
        m552a.setDuration(c0178j.f505e);
        m552a.start();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: g */
    public final void mo1916g(C1306d c1306d) {
        this.f2532U = null;
        this.f2524M = null;
        this.f2536Y = null;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: i */
    public final void mo1917i() {
        this.f2532U = null;
        this.f2524M = null;
        this.f2536Y = null;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: j */
    public final boolean mo1885j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i2;
        C0483e c0483e;
        if (!view.isShown() || !this.f2522K) {
            this.f2525N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2537Z = -1;
            this.f2539a0 = -1;
            VelocityTracker velocityTracker = this.f2535X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2535X = null;
            }
        }
        if (this.f2535X == null) {
            this.f2535X = VelocityTracker.obtain();
        }
        this.f2535X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f2539a0 = (int) motionEvent.getY();
            if (this.f2523L != 2) {
                WeakReference weakReference = this.f2533V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m1464o(view2, x2, this.f2539a0)) {
                    this.f2537Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2541b0 = true;
                }
            }
            this.f2525N = this.f2537Z == -1 && !coordinatorLayout.m1464o(view, x2, this.f2539a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2541b0 = false;
            this.f2537Z = -1;
            if (this.f2525N) {
                this.f2525N = false;
                return false;
            }
        }
        if (this.f2525N || (c0483e = this.f2524M) == null || !c0483e.m1257r(motionEvent)) {
            WeakReference weakReference2 = this.f2533V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f2525N || this.f2523L == 1 || coordinatorLayout.m1464o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2524M == null || (i2 = this.f2539a0) == -1 || Math.abs(i2 - motionEvent.getY()) <= this.f2524M.f1309b) {
                return false;
            }
        }
        return true;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: k */
    public final boolean mo1886k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3 = this.f2554l;
        C0362g c0362g = this.f2551i;
        int i4 = 1;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2532U == null) {
            this.f2549g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i5 = Build.VERSION.SDK_INT;
            boolean z2 = (i5 < 29 || this.f2556n || this.f2548f) ? false : true;
            if (this.f2557o || this.f2558p || this.f2559q || this.f2561s || this.f2562t || this.f2563u || z2) {
                C0214i c0214i = new C0214i(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0132I c0132i = new C0132I();
                c0132i.f356a = paddingStart;
                c0132i.f357b = paddingEnd;
                c0132i.f358c = paddingBottom;
                AbstractC0261E.m760u(view, new C0019i(c0214i, i4, c0132i));
                if (view.isAttachedToWindow()) {
                    AbstractC0259C.m739c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0131H());
                }
            }
            C0288d c0288d = new C0288d(view);
            if (i5 >= 30) {
                view.setWindowInsetsAnimationCallback(new C0287c0(c0288d));
            } else {
                PathInterpolator pathInterpolator = C0285b0.f787e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0283a0 = new ViewOnApplyWindowInsetsListenerC0283a0(view, c0288d);
                view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0283a0);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0283a0);
                }
            }
            this.f2532U = new WeakReference(view);
            this.f2536Y = new C0178j(view);
            if (c0362g != null) {
                view.setBackground(c0362g);
                float f = this.f2519H;
                if (f == -1.0f) {
                    f = AbstractC0261E.m748i(view);
                }
                c0362g.m1026i(f);
            } else {
                ColorStateList colorStateList = this.f2552j;
                if (colorStateList != null) {
                    AbstractC0261E.m756q(view, colorStateList);
                }
            }
            m1912J();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2524M == null) {
            this.f2524M = new C0483e(coordinatorLayout.getContext(), coordinatorLayout, this.f2547e0);
        }
        int top = view.getTop();
        coordinatorLayout.m1466q(view, i2);
        this.f2530S = coordinatorLayout.getWidth();
        this.f2531T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2529R = height;
        int i6 = this.f2531T;
        int i7 = i6 - height;
        int i8 = this.f2565w;
        if (i7 < i8) {
            if (this.f2560r) {
                if (i3 != -1) {
                    i6 = Math.min(i6, i3);
                }
                this.f2529R = i6;
            } else {
                int i9 = i6 - i8;
                if (i3 != -1) {
                    i9 = Math.min(i9, i3);
                }
                this.f2529R = i9;
            }
        }
        this.f2515D = Math.max(0, this.f2531T - this.f2529R);
        this.f2516E = (int) ((1.0f - this.f2517F) * this.f2531T);
        m1919v();
        int i10 = this.f2523L;
        if (i10 == 3) {
            view.offsetTopAndBottom(m1904B());
        } else if (i10 == 6) {
            view.offsetTopAndBottom(this.f2516E);
        } else if (this.f2520I && i10 == 5) {
            view.offsetTopAndBottom(this.f2531T);
        } else if (i10 == 4) {
            view.offsetTopAndBottom(this.f2518G);
        } else if (i10 == 1 || i10 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m1913K(this.f2523L, false);
        this.f2533V = new WeakReference(m1903z(view));
        ArrayList arrayList = this.f2534W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: l */
    public final boolean mo1887l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m1902A(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f2553k, marginLayoutParams.width), m1902A(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2554l, marginLayoutParams.height));
        return true;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: m */
    public final boolean mo1918m(View view) {
        WeakReference weakReference = this.f2533V;
        return (weakReference == null || view != weakReference.get() || this.f2523L == 3) ? false : true;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: n */
    public final void mo1888n(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        boolean z2 = this.f2522K;
        if (i4 == 1) {
            return;
        }
        WeakReference weakReference = this.f2533V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < m1904B()) {
                int m1904B = top - m1904B();
                iArr[1] = m1904B;
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                view.offsetTopAndBottom(-m1904B);
                m1909G(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i3;
                WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                view.offsetTopAndBottom(-i3);
                m1909G(1);
            }
        } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f2518G;
            if (i5 > i6 && !this.f2520I) {
                int i7 = top - i6;
                iArr[1] = i7;
                WeakHashMap weakHashMap3 = AbstractC0272P.f768a;
                view.offsetTopAndBottom(-i7);
                m1909G(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i3;
                WeakHashMap weakHashMap4 = AbstractC0272P.f768a;
                view.offsetTopAndBottom(-i3);
                m1909G(1);
            }
        }
        m1922y(view.getTop());
        this.f2526O = i3;
        this.f2527P = true;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: q */
    public final void mo1890q(View view, Parcelable parcelable) {
        C1270a c1270a = (C1270a) parcelable;
        int i2 = this.f2538a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f2546e = c1270a.f5104d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f2540b = c1270a.f5105e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.f2520I = c1270a.f5106f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.f2521J = c1270a.f5107g;
            }
        }
        int i3 = c1270a.f5103c;
        if (i3 == 1 || i3 == 2) {
            this.f2523L = 4;
        } else {
            this.f2523L = i3;
        }
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: r */
    public final Parcelable mo1891r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C1270a(this);
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: s */
    public final boolean mo1892s(View view, int i2, int i3) {
        this.f2526O = 0;
        this.f2527P = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f2516E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2515D) < java.lang.Math.abs(r5 - r3.f2518G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f2518G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f2518G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2516E) < java.lang.Math.abs(r5 - r3.f2518G)) goto L50;
     */
    @Override // p127x.AbstractC1303a
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1893t(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.m1904B()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.m1909G(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f2533V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f2527P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f2526O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f2540b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f2516E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f2520I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f2535X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f2542c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f2535X
            int r0 = r3.f2537Z
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.m1910H(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f2526O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f2540b
            if (r2 == 0) goto L74
            int r6 = r3.f2515D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f2518G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f2516E
            if (r5 >= r2) goto L83
            int r0 = r3.f2518G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f2518G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f2540b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f2516E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f2518G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.m1911I(r4, r1, r5)
            r3.f2527P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1893t(android.view.View, android.view.View, int):void");
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: u */
    public final boolean mo1894u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f2523L;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        C0483e c0483e = this.f2524M;
        if (c0483e != null && (this.f2522K || i2 == 1)) {
            c0483e.m1250k(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2537Z = -1;
            this.f2539a0 = -1;
            VelocityTracker velocityTracker = this.f2535X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2535X = null;
            }
        }
        if (this.f2535X == null) {
            this.f2535X = VelocityTracker.obtain();
        }
        this.f2535X.addMovement(motionEvent);
        if (this.f2524M != null && ((this.f2522K || this.f2523L == 1) && actionMasked == 2 && !this.f2525N)) {
            float abs = Math.abs(this.f2539a0 - motionEvent.getY());
            C0483e c0483e2 = this.f2524M;
            if (abs > c0483e2.f1309b) {
                c0483e2.m1241b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2525N;
    }

    /* renamed from: v */
    public final void m1919v() {
        int m1921x = m1921x();
        if (this.f2540b) {
            this.f2518G = Math.max(this.f2531T - m1921x, this.f2515D);
        } else {
            this.f2518G = this.f2531T - m1921x;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m1920w() {
        /*
            r5 = this;
            M0.g r0 = r5.f2551i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f2532U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f2532U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.m1906D()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            M0.g r2 = r5.f2551i
            M0.f r3 = r2.f931a
            M0.k r3 = r3.f914a
            M0.c r3 = r3.f970e
            android.graphics.RectF r2 = r2.m1023f()
            float r2 = r3.mo1004a(r2)
            android.view.RoundedCorner r3 = p025J0.AbstractC0232e.m647h(r0)
            if (r3 == 0) goto L4e
            int r3 = p025J0.AbstractC0232e.m642c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            M0.g r2 = r5.f2551i
            M0.f r4 = r2.f931a
            M0.k r4 = r4.f914a
            M0.c r4 = r4.f971f
            android.graphics.RectF r2 = r2.m1023f()
            float r2 = r4.mo1004a(r2)
            android.view.RoundedCorner r0 = p025J0.AbstractC0232e.m652m(r0)
            if (r0 == 0) goto L74
            int r0 = p025J0.AbstractC0232e.m642c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m1920w():float");
    }

    /* renamed from: x */
    public final int m1921x() {
        int i2;
        return this.f2548f ? Math.min(Math.max(this.f2549g, this.f2531T - ((this.f2530S * 9) / 16)), this.f2529R) + this.f2564v : (this.f2556n || this.f2557o || (i2 = this.f2555m) <= 0) ? this.f2546e + this.f2564v : Math.max(this.f2546e, i2 + this.f2550h);
    }

    /* renamed from: y */
    public final void m1922y(int i2) {
        if (((View) this.f2532U.get()) != null) {
            ArrayList arrayList = this.f2534W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.f2518G;
            if (i2 <= i3 && i3 != m1904B()) {
                m1904B();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        int i3 = 2;
        this.f2538a = 0;
        this.f2540b = true;
        this.f2553k = -1;
        this.f2554l = -1;
        this.f2512A = new C0389f(this);
        this.f2517F = 0.5f;
        this.f2519H = -1.0f;
        this.f2522K = true;
        this.f2523L = 4;
        this.f2528Q = 0.1f;
        this.f2534W = new ArrayList();
        this.f2539a0 = -1;
        this.f2545d0 = new SparseIntArray();
        this.f2547e0 = new C0387d(this, 1);
        this.f2550h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1183a.f4522a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2552j = AbstractC0104l.m413t(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2567y = C0366k.m1034b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m1032a();
        }
        C0366k c0366k = this.f2567y;
        if (c0366k != null) {
            C0362g c0362g = new C0362g(c0366k);
            this.f2551i = c0362g;
            c0362g.m1025h(context);
            ColorStateList colorStateList = this.f2552j;
            if (colorStateList != null) {
                this.f2551i.m1027j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2551i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m1920w(), 1.0f);
        this.f2513B = ofFloat;
        ofFloat.setDuration(500L);
        this.f2513B.addUpdateListener(new C0403B(i3, this));
        this.f2519H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2553k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2554l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            m1907E(i2);
        } else {
            m1907E(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f2520I != z2) {
            this.f2520I = z2;
            if (!z2 && this.f2523L == 5) {
                m1908F(4);
            }
            m1912J();
        }
        this.f2556n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2540b != z3) {
            this.f2540b = z3;
            if (this.f2532U != null) {
                m1919v();
            }
            m1909G((this.f2540b && this.f2523L == 6) ? 3 : this.f2523L);
            m1913K(this.f2523L, true);
            m1912J();
        }
        this.f2521J = obtainStyledAttributes.getBoolean(12, false);
        this.f2522K = obtainStyledAttributes.getBoolean(4, true);
        this.f2538a = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f2517F = f;
            if (this.f2532U != null) {
                this.f2516E = (int) ((1.0f - f) * this.f2531T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i4 = peekValue2.data;
                if (i4 >= 0) {
                    this.f2514C = i4;
                    m1913K(this.f2523L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2514C = dimensionPixelOffset;
                    m1913K(this.f2523L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2544d = obtainStyledAttributes.getInt(11, 500);
            this.f2557o = obtainStyledAttributes.getBoolean(17, false);
            this.f2558p = obtainStyledAttributes.getBoolean(18, false);
            this.f2559q = obtainStyledAttributes.getBoolean(19, false);
            this.f2560r = obtainStyledAttributes.getBoolean(20, true);
            this.f2561s = obtainStyledAttributes.getBoolean(14, false);
            this.f2562t = obtainStyledAttributes.getBoolean(15, false);
            this.f2563u = obtainStyledAttributes.getBoolean(16, false);
            this.f2566x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f2542c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: o */
    public final void mo1889o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }
}
