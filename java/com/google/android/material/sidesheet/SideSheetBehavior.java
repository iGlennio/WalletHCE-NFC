package com.google.android.material.sidesheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0562b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.nfupay.s145.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p002B.RunnableC0025o;
import p005C.AbstractC0044g;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p017G0.C0177i;
import p017G0.C0180l;
import p017G0.InterfaceC0170b;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p030L.C0337d;
import p030L.InterfaceC0352s;
import p034M0.C0356a;
import p034M0.C0362g;
import p034M0.C0365j;
import p034M0.C0366k;
import p037N0.C0384a;
import p037N0.C0387d;
import p037N0.C0388e;
import p037N0.C0389f;
import p052T.C0483e;
import p108q0.AbstractC1183a;
import p111r0.AbstractC1188a;
import p127x.AbstractC1303a;
import p127x.C1306d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC1303a implements InterfaceC0170b {

    /* renamed from: a */
    public AbstractC0096d f2762a;

    /* renamed from: b */
    public final C0362g f2763b;

    /* renamed from: c */
    public final ColorStateList f2764c;

    /* renamed from: d */
    public final C0366k f2765d;

    /* renamed from: e */
    public final C0389f f2766e;

    /* renamed from: f */
    public final float f2767f;

    /* renamed from: g */
    public final boolean f2768g;

    /* renamed from: h */
    public int f2769h;

    /* renamed from: i */
    public C0483e f2770i;

    /* renamed from: j */
    public boolean f2771j;

    /* renamed from: k */
    public final float f2772k;

    /* renamed from: l */
    public int f2773l;

    /* renamed from: m */
    public int f2774m;

    /* renamed from: n */
    public int f2775n;

    /* renamed from: o */
    public int f2776o;

    /* renamed from: p */
    public WeakReference f2777p;

    /* renamed from: q */
    public WeakReference f2778q;

    /* renamed from: r */
    public final int f2779r;

    /* renamed from: s */
    public VelocityTracker f2780s;

    /* renamed from: t */
    public C0180l f2781t;

    /* renamed from: u */
    public int f2782u;

    /* renamed from: v */
    public final LinkedHashSet f2783v;

    /* renamed from: w */
    public final C0387d f2784w;

    public SideSheetBehavior() {
        this.f2766e = new C0389f(this);
        this.f2768g = true;
        this.f2769h = 5;
        this.f2772k = 0.1f;
        this.f2779r = -1;
        this.f2783v = new LinkedHashSet();
        this.f2784w = new C0387d(this, 0);
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: a */
    public final void mo503a() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        C0180l c0180l = this.f2781t;
        if (c0180l == null) {
            return;
        }
        C0562b c0562b = c0180l.f506f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        c0180l.f506f = null;
        int i2 = 5;
        if (c0562b == null || Build.VERSION.SDK_INT < 34) {
            m1972v(5);
            return;
        }
        AbstractC0096d abstractC0096d = this.f2762a;
        if (abstractC0096d != null && abstractC0096d.mo360H() != 0) {
            i2 = 3;
        }
        C0177i c0177i = new C0177i(2, this);
        WeakReference weakReference = this.f2778q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int mo379w = this.f2762a.mo379w(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: N0.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.f2762a.mo375m0(marginLayoutParams, AbstractC1188a.m2749c(mo379w, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        c0180l.m555b(c0562b, i2, c0177i, animatorUpdateListener);
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: b */
    public final void mo504b(C0562b c0562b) {
        C0180l c0180l = this.f2781t;
        if (c0180l == null) {
            return;
        }
        c0180l.f506f = c0562b;
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: c */
    public final void mo505c(C0562b c0562b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C0180l c0180l = this.f2781t;
        if (c0180l == null) {
            return;
        }
        AbstractC0096d abstractC0096d = this.f2762a;
        int i2 = (abstractC0096d == null || abstractC0096d.mo360H() == 0) ? 5 : 3;
        if (c0180l.f506f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0562b c0562b2 = c0180l.f506f;
        c0180l.f506f = c0562b;
        if (c0562b2 != null) {
            c0180l.m556c(c0562b.f1564c, c0562b.f1565d == 0, i2);
        }
        WeakReference weakReference = this.f2777p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f2777p.get();
        WeakReference weakReference2 = this.f2778q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f2762a.mo375m0(marginLayoutParams, (int) ((view.getScaleX() * this.f2773l) + this.f2776o));
        view2.requestLayout();
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: d */
    public final void mo506d() {
        C0180l c0180l = this.f2781t;
        if (c0180l == null) {
            return;
        }
        c0180l.m554a();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: g */
    public final void mo1916g(C1306d c1306d) {
        this.f2777p = null;
        this.f2770i = null;
        this.f2781t = null;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: i */
    public final void mo1917i() {
        this.f2777p = null;
        this.f2770i = null;
        this.f2781t = null;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: j */
    public final boolean mo1885j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0483e c0483e;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC0272P.m815e(view) == null) || !this.f2768g) {
            this.f2771j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2780s) != null) {
            velocityTracker.recycle();
            this.f2780s = null;
        }
        if (this.f2780s == null) {
            this.f2780s = VelocityTracker.obtain();
        }
        this.f2780s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2782u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2771j) {
            this.f2771j = false;
            return false;
        }
        return (this.f2771j || (c0483e = this.f2770i) == null || !c0483e.m1257r(motionEvent)) ? false : true;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: k */
    public final boolean mo1886k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View view2;
        View view3;
        int i3;
        View findViewById;
        int i4 = 0;
        int i5 = 1;
        C0362g c0362g = this.f2763b;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2777p == null) {
            this.f2777p = new WeakReference(view);
            this.f2781t = new C0180l(view);
            if (c0362g != null) {
                view.setBackground(c0362g);
                float f = this.f2767f;
                if (f == -1.0f) {
                    f = AbstractC0261E.m748i(view);
                }
                c0362g.m1026i(f);
            } else {
                ColorStateList colorStateList = this.f2764c;
                if (colorStateList != null) {
                    AbstractC0261E.m756q(view, colorStateList);
                }
            }
            int i6 = this.f2769h == 5 ? 4 : 0;
            if (view.getVisibility() != i6) {
                view.setVisibility(i6);
            }
            m1976z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC0272P.m815e(view) == null) {
                AbstractC0272P.m824n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i7 = Gravity.getAbsoluteGravity(((C1306d) view.getLayoutParams()).f5347c, i2) == 3 ? 1 : 0;
        AbstractC0096d abstractC0096d = this.f2762a;
        if (abstractC0096d == null || abstractC0096d.mo360H() != i7) {
            C0366k c0366k = this.f2765d;
            C1306d c1306d = null;
            if (i7 == 0) {
                this.f2762a = new C0384a(this, i5);
                if (c0366k != null) {
                    WeakReference weakReference = this.f2777p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C1306d)) {
                        c1306d = (C1306d) view3.getLayoutParams();
                    }
                    if (c1306d == null || ((ViewGroup.MarginLayoutParams) c1306d).rightMargin <= 0) {
                        C0365j m1037e = c0366k.m1037e();
                        m1037e.f959f = new C0356a(0.0f);
                        m1037e.f960g = new C0356a(0.0f);
                        C0366k m1032a = m1037e.m1032a();
                        if (c0362g != null) {
                            c0362g.setShapeAppearanceModel(m1032a);
                        }
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i7 + ". Must be 0 or 1.");
                }
                this.f2762a = new C0384a(this, i4);
                if (c0366k != null) {
                    WeakReference weakReference2 = this.f2777p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C1306d)) {
                        c1306d = (C1306d) view2.getLayoutParams();
                    }
                    if (c1306d == null || ((ViewGroup.MarginLayoutParams) c1306d).leftMargin <= 0) {
                        C0365j m1037e2 = c0366k.m1037e();
                        m1037e2.f958e = new C0356a(0.0f);
                        m1037e2.f961h = new C0356a(0.0f);
                        C0366k m1032a2 = m1037e2.m1032a();
                        if (c0362g != null) {
                            c0362g.setShapeAppearanceModel(m1032a2);
                        }
                    }
                }
            }
        }
        if (this.f2770i == null) {
            this.f2770i = new C0483e(coordinatorLayout.getContext(), coordinatorLayout, this.f2784w);
        }
        int mo357B = this.f2762a.mo357B(view);
        coordinatorLayout.m1466q(view, i2);
        this.f2774m = coordinatorLayout.getWidth();
        this.f2775n = this.f2762a.mo358F(coordinatorLayout);
        this.f2773l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2776o = marginLayoutParams != null ? this.f2762a.mo371h(marginLayoutParams) : 0;
        int i8 = this.f2769h;
        if (i8 == 1 || i8 == 2) {
            i4 = mo357B - this.f2762a.mo357B(view);
        } else if (i8 != 3) {
            if (i8 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f2769h);
            }
            i4 = this.f2762a.mo381y();
        }
        view.offsetLeftAndRight(i4);
        if (this.f2778q == null && (i3 = this.f2779r) != -1 && (findViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f2778q = new WeakReference(findViewById);
        }
        Iterator it = this.f2783v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: l */
    public final boolean mo1887l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: q */
    public final void mo1890q(View view, Parcelable parcelable) {
        int i2 = ((C0388e) parcelable).f1036c;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.f2769h = i2;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: r */
    public final Parcelable mo1891r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C0388e(this);
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: u */
    public final boolean mo1894u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2769h == 1 && actionMasked == 0) {
            return true;
        }
        if (m1974x()) {
            this.f2770i.m1250k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2780s) != null) {
            velocityTracker.recycle();
            this.f2780s = null;
        }
        if (this.f2780s == null) {
            this.f2780s = VelocityTracker.obtain();
        }
        this.f2780s.addMovement(motionEvent);
        if (m1974x() && actionMasked == 2 && !this.f2771j && m1974x()) {
            float abs = Math.abs(this.f2782u - motionEvent.getX());
            C0483e c0483e = this.f2770i;
            if (abs > c0483e.f1309b) {
                c0483e.m1241b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2771j;
    }

    /* renamed from: v */
    public final void m1972v(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f2777p;
        if (weakReference == null || weakReference.get() == null) {
            m1973w(i2);
            return;
        }
        View view = (View) this.f2777p.get();
        RunnableC0025o runnableC0025o = new RunnableC0025o(this, i2, 1);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0025o);
                return;
            }
        }
        runnableC0025o.run();
    }

    /* renamed from: w */
    public final void m1973w(int i2) {
        View view;
        if (this.f2769h == i2) {
            return;
        }
        this.f2769h = i2;
        WeakReference weakReference = this.f2777p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = this.f2769h == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
        Iterator it = this.f2783v.iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        m1976z();
    }

    /* renamed from: x */
    public final boolean m1974x() {
        if (this.f2770i != null) {
            return this.f2768g || this.f2769h == 1;
        }
        return false;
    }

    /* renamed from: y */
    public final void m1975y(View view, int i2, boolean z2) {
        int mo380x;
        if (i2 == 3) {
            mo380x = this.f2762a.mo380x();
        } else {
            if (i2 != 5) {
                throw new IllegalArgumentException(AbstractC0044g.m153e("Invalid state to get outer edge offset: ", i2));
            }
            mo380x = this.f2762a.mo381y();
        }
        C0483e c0483e = this.f2770i;
        if (c0483e == null || (!z2 ? c0483e.m1258s(view, mo380x, view.getTop()) : c0483e.m1256q(mo380x, view.getTop()))) {
            m1973w(i2);
        } else {
            m1973w(2);
            this.f2766e.m1052a(i2);
        }
    }

    /* renamed from: z */
    public final void m1976z() {
        View view;
        WeakReference weakReference = this.f2777p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0272P.m820j(view, 262144);
        AbstractC0272P.m818h(view, 0);
        AbstractC0272P.m820j(view, 1048576);
        AbstractC0272P.m818h(view, 0);
        final int i2 = 5;
        if (this.f2769h != 5) {
            AbstractC0272P.m821k(view, C0337d.f884l, new InterfaceC0352s() { // from class: N0.b
                @Override // p030L.InterfaceC0352s
                /* renamed from: h */
                public final boolean mo172h(View view2) {
                    SideSheetBehavior.this.m1972v(i2);
                    return true;
                }
            });
        }
        final int i3 = 3;
        if (this.f2769h != 3) {
            AbstractC0272P.m821k(view, C0337d.f882j, new InterfaceC0352s() { // from class: N0.b
                @Override // p030L.InterfaceC0352s
                /* renamed from: h */
                public final boolean mo172h(View view2) {
                    SideSheetBehavior.this.m1972v(i3);
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f2766e = new C0389f(this);
        this.f2768g = true;
        this.f2769h = 5;
        this.f2772k = 0.1f;
        this.f2779r = -1;
        this.f2783v = new LinkedHashSet();
        this.f2784w = new C0387d(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1183a.f4547z);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2764c = AbstractC0104l.m413t(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f2765d = C0366k.m1034b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m1032a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2779r = resourceId;
            WeakReference weakReference = this.f2778q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2778q = null;
            WeakReference weakReference2 = this.f2777p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C0366k c0366k = this.f2765d;
        if (c0366k != null) {
            C0362g c0362g = new C0362g(c0366k);
            this.f2763b = c0362g;
            c0362g.m1025h(context);
            ColorStateList colorStateList = this.f2764c;
            if (colorStateList != null) {
                this.f2763b.m1027j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2763b.setTint(typedValue.data);
            }
        }
        this.f2767f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2768g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
