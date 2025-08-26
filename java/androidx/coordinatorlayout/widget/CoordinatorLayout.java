package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.C0605s;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p008D.AbstractC0088b;
import p014F0.C0129F;
import p024J.C0227b;
import p027K.AbstractC0259C;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p027K.C0312p;
import p027K.C0319s0;
import p027K.InterfaceC0308n;
import p027K.InterfaceC0310o;
import p088j.C0985d0;
import p101o.C1161k;
import p124w.AbstractC1295a;
import p127x.AbstractC1303a;
import p127x.AbstractC1309g;
import p127x.C1306d;
import p127x.C1308f;
import p127x.InterfaceC1304b;
import p127x.ViewGroupOnHierarchyChangeListenerC1305c;
import p127x.ViewTreeObserverOnPreDrawListenerC1307e;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0308n, InterfaceC0310o {

    /* renamed from: t */
    public static final String f1857t;

    /* renamed from: u */
    public static final Class[] f1858u;

    /* renamed from: v */
    public static final ThreadLocal f1859v;

    /* renamed from: w */
    public static final C0129F f1860w;

    /* renamed from: x */
    public static final C0227b f1861x;

    /* renamed from: a */
    public final ArrayList f1862a;

    /* renamed from: b */
    public final C0605s f1863b;

    /* renamed from: c */
    public final ArrayList f1864c;

    /* renamed from: d */
    public final ArrayList f1865d;

    /* renamed from: e */
    public final int[] f1866e;

    /* renamed from: f */
    public final int[] f1867f;

    /* renamed from: g */
    public boolean f1868g;

    /* renamed from: h */
    public boolean f1869h;

    /* renamed from: i */
    public final int[] f1870i;

    /* renamed from: j */
    public View f1871j;

    /* renamed from: k */
    public View f1872k;

    /* renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC1307e f1873l;

    /* renamed from: m */
    public boolean f1874m;

    /* renamed from: n */
    public C0319s0 f1875n;

    /* renamed from: o */
    public boolean f1876o;

    /* renamed from: p */
    public Drawable f1877p;

    /* renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f1878q;

    /* renamed from: r */
    public C0985d0 f1879r;

    /* renamed from: s */
    public final C0312p f1880s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1857t = r02 != null ? r02.getName() : null;
        f1860w = new C0129F(4);
        f1858u = new Class[]{Context.class, AttributeSet.class};
        f1859v = new ThreadLocal();
        f1861x = new C0227b();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1862a = new ArrayList();
        this.f1863b = new C0605s(4);
        this.f1864c = new ArrayList();
        this.f1865d = new ArrayList();
        this.f1866e = new int[2];
        this.f1867f = new int[2];
        this.f1880s = new C0312p();
        int[] iArr = AbstractC1295a.f5306a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1870i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1870i[i2] = (int) (r2[i2] * f);
            }
        }
        this.f1877p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        m1470w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1305c(this));
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: g */
    public static Rect m1454g() {
        Rect rect = (Rect) f1861x.mo630a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: l */
    public static void m1455l(int i2, Rect rect, Rect rect2, C1306d c1306d, int i3, int i4) {
        int i5 = c1306d.f5347c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = c1306d.f5348d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i3 / 2;
        } else if (i7 != 5) {
            width -= i3;
        }
        if (i8 == 16) {
            height -= i4 / 2;
        } else if (i8 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    /* renamed from: n */
    public static C1306d m1456n(View view) {
        C1306d c1306d = (C1306d) view.getLayoutParams();
        if (!c1306d.f5346b) {
            InterfaceC1304b interfaceC1304b = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC1304b = (InterfaceC1304b) cls.getAnnotation(InterfaceC1304b.class);
                if (interfaceC1304b != null) {
                    break;
                }
            }
            if (interfaceC1304b != null) {
                try {
                    AbstractC1303a abstractC1303a = (AbstractC1303a) interfaceC1304b.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC1303a abstractC1303a2 = c1306d.f5345a;
                    if (abstractC1303a2 != abstractC1303a) {
                        if (abstractC1303a2 != null) {
                            abstractC1303a2.mo1917i();
                        }
                        c1306d.f5345a = abstractC1303a;
                        c1306d.f5346b = true;
                        if (abstractC1303a != null) {
                            abstractC1303a.mo1916g(c1306d);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC1304b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            c1306d.f5346b = true;
        }
        return c1306d;
    }

    /* renamed from: u */
    public static void m1457u(View view, int i2) {
        C1306d c1306d = (C1306d) view.getLayoutParams();
        int i3 = c1306d.f5353i;
        if (i3 != i2) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            view.offsetLeftAndRight(i2 - i3);
            c1306d.f5353i = i2;
        }
    }

    /* renamed from: v */
    public static void m1458v(View view, int i2) {
        C1306d c1306d = (C1306d) view.getLayoutParams();
        int i3 = c1306d.f5354j;
        if (i3 != i2) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            view.offsetTopAndBottom(i2 - i3);
            c1306d.f5354j = i2;
        }
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: a */
    public final void mo921a(View view, View view2, int i2, int i3) {
        C0312p c0312p = this.f1880s;
        if (i3 == 1) {
            c0312p.f850b = i2;
        } else {
            c0312p.f849a = i2;
        }
        this.f1872k = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((C1306d) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // p027K.InterfaceC0310o
    /* renamed from: b */
    public final void mo928b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        AbstractC1303a abstractC1303a;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C1306d c1306d = (C1306d) childAt.getLayoutParams();
                if (c1306d.m3018a(i6) && (abstractC1303a = c1306d.f5345a) != null) {
                    int[] iArr2 = this.f1866e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1303a.mo1889o(this, childAt, i3, i4, i5, iArr2);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[0]) : Math.min(i7, iArr2[0]);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[1]) : Math.min(i8, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            m1465p(1);
        }
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: c */
    public final void mo922c(View view, int i2, int i3, int i4, int i5, int i6) {
        mo928b(view, i2, i3, i4, i5, 0, this.f1867f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1306d) && super.checkLayoutParams(layoutParams);
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: d */
    public final void mo923d(View view, int i2) {
        C0312p c0312p = this.f1880s;
        if (i2 == 1) {
            c0312p.f850b = 0;
        } else {
            c0312p.f849a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C1306d c1306d = (C1306d) childAt.getLayoutParams();
            if (c1306d.m3018a(i2)) {
                AbstractC1303a abstractC1303a = c1306d.f5345a;
                if (abstractC1303a != null) {
                    abstractC1303a.mo1893t(childAt, view, i2);
                }
                if (i2 == 0) {
                    c1306d.f5357m = false;
                } else if (i2 == 1) {
                    c1306d.f5358n = false;
                }
            }
        }
        this.f1872k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC1303a abstractC1303a = ((C1306d) view.getLayoutParams()).f5345a;
        if (abstractC1303a != null) {
            abstractC1303a.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1877p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: e */
    public final void mo924e(View view, int i2, int i3, int[] iArr, int i4) {
        AbstractC1303a abstractC1303a;
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1306d c1306d = (C1306d) childAt.getLayoutParams();
                if (c1306d.m3018a(i4) && (abstractC1303a = c1306d.f5345a) != null) {
                    int[] iArr2 = this.f1866e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1303a.mo1888n(this, childAt, view, i2, i3, iArr2, i4);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[0]) : Math.min(i5, iArr2[0]);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[1]) : Math.min(i6, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            m1465p(1);
        }
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: f */
    public final boolean mo925f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1306d c1306d = (C1306d) childAt.getLayoutParams();
                AbstractC1303a abstractC1303a = c1306d.f5345a;
                if (abstractC1303a != null) {
                    boolean mo1892s = abstractC1303a.mo1892s(childAt, i2, i3);
                    z2 |= mo1892s;
                    if (i3 == 0) {
                        c1306d.f5357m = mo1892s;
                    } else if (i3 == 1) {
                        c1306d.f5358n = mo1892s;
                    }
                } else if (i3 == 0) {
                    c1306d.f5357m = false;
                } else if (i3 == 1) {
                    c1306d.f5358n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1306d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1306d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m1468s();
        return Collections.unmodifiableList(this.f1862a);
    }

    public final C0319s0 getLastWindowInsets() {
        return this.f1875n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0312p c0312p = this.f1880s;
        return c0312p.f850b | c0312p.f849a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1877p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final void m1459h(C1306d c1306d, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1306d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) c1306d).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1306d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) c1306d).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    /* renamed from: i */
    public final void m1460i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            m1462k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: j */
    public final ArrayList m1461j(View view) {
        C1161k c1161k = (C1161k) this.f1863b.f2012b;
        int i2 = c1161k.f4422c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) c1161k.m2685j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1161k.m2683h(i3));
            }
        }
        ArrayList arrayList3 = this.f1865d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* renamed from: k */
    public final void m1462k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC1309g.f5362a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC1309g.f5362a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC1309g.m3019a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC1309g.f5363b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: m */
    public final int m1463m(int i2) {
        int[] iArr = this.f1870i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    /* renamed from: o */
    public final boolean m1464o(View view, int i2, int i3) {
        C0227b c0227b = f1861x;
        Rect m1454g = m1454g();
        m1462k(view, m1454g);
        try {
            return m1454g.contains(i2, i3);
        } finally {
            m1454g.setEmpty();
            c0227b.mo632c(m1454g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1469t(false);
        if (this.f1874m) {
            if (this.f1873l == null) {
                this.f1873l = new ViewTreeObserverOnPreDrawListenerC1307e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1873l);
        }
        if (this.f1875n == null) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            if (getFitsSystemWindows()) {
                AbstractC0259C.m739c(this);
            }
        }
        this.f1869h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1469t(false);
        if (this.f1874m && this.f1873l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1873l);
        }
        View view = this.f1872k;
        if (view != null) {
            mo923d(view, 0);
        }
        this.f1869h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1876o || this.f1877p == null) {
            return;
        }
        C0319s0 c0319s0 = this.f1875n;
        int m940d = c0319s0 != null ? c0319s0.m940d() : 0;
        if (m940d > 0) {
            this.f1877p.setBounds(0, 0, getWidth(), m940d);
            this.f1877p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1469t(true);
        }
        boolean m1467r = m1467r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return m1467r;
        }
        m1469t(true);
        return m1467r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        AbstractC1303a abstractC1303a;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1862a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((abstractC1303a = ((C1306d) view.getLayoutParams()).f5345a) == null || !abstractC1303a.mo1886k(this, view, layoutDirection))) {
                m1466q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1306d c1306d = (C1306d) childAt.getLayoutParams();
                if (c1306d.m3018a(0)) {
                    AbstractC1303a abstractC1303a = c1306d.f5345a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC1303a abstractC1303a;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1306d c1306d = (C1306d) childAt.getLayoutParams();
                if (c1306d.m3018a(0) && (abstractC1303a = c1306d.f5345a) != null) {
                    z2 |= abstractC1303a.mo1918m(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        mo924e(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        mo922c(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        mo921a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1308f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1308f c1308f = (C1308f) parcelable;
        super.onRestoreInstanceState(c1308f.f1273a);
        SparseArray sparseArray = c1308f.f5361c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC1303a abstractC1303a = m1456n(childAt).f5345a;
            if (id != -1 && abstractC1303a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC1303a.mo1890q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable mo1891r;
        C1308f c1308f = new C1308f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC1303a abstractC1303a = ((C1306d) childAt.getLayoutParams()).f5345a;
            if (id != -1 && abstractC1303a != null && (mo1891r = abstractC1303a.mo1891r(childAt)) != null) {
                sparseArray.append(id, mo1891r);
            }
        }
        c1308f.f5361c = sparseArray;
        return c1308f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo925f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo923d(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f1871j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m1467r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f1871j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            x.d r6 = (p127x.C1306d) r6
            x.a r6 = r6.f5345a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f1871j
            boolean r6 = r6.mo1894u(r7, r1)
        L2a:
            android.view.View r7 = r0.f1871j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.m1469t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0047 A[EDGE_INSN: B:117:0x0047->B:9:0x0047 BREAK  A[LOOP:2: B:109:0x02ad->B:115:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1465p(int r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1465p(int):void");
    }

    /* renamed from: q */
    public final void m1466q(View view, int i2) {
        Rect m1454g;
        Rect m1454g2;
        C1306d c1306d = (C1306d) view.getLayoutParams();
        View view2 = c1306d.f5355k;
        if (view2 == null && c1306d.f5350f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0227b c0227b = f1861x;
        if (view2 != null) {
            m1454g = m1454g();
            m1454g2 = m1454g();
            try {
                m1462k(view2, m1454g);
                C1306d c1306d2 = (C1306d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1455l(i2, m1454g, m1454g2, c1306d2, measuredWidth, measuredHeight);
                m1459h(c1306d2, m1454g2, measuredWidth, measuredHeight);
                view.layout(m1454g2.left, m1454g2.top, m1454g2.right, m1454g2.bottom);
                return;
            } finally {
                m1454g.setEmpty();
                c0227b.mo632c(m1454g);
                m1454g2.setEmpty();
                c0227b.mo632c(m1454g2);
            }
        }
        int i3 = c1306d.f5349e;
        if (i3 < 0) {
            C1306d c1306d3 = (C1306d) view.getLayoutParams();
            m1454g = m1454g();
            m1454g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1306d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1306d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1306d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1306d3).bottomMargin);
            if (this.f1875n != null) {
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    m1454g.left = this.f1875n.m938b() + m1454g.left;
                    m1454g.top = this.f1875n.m940d() + m1454g.top;
                    m1454g.right -= this.f1875n.m939c();
                    m1454g.bottom -= this.f1875n.m937a();
                }
            }
            m1454g2 = m1454g();
            int i4 = c1306d3.f5347c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), m1454g, m1454g2, i2);
            view.layout(m1454g2.left, m1454g2.top, m1454g2.right, m1454g2.bottom);
            return;
        }
        C1306d c1306d4 = (C1306d) view.getLayoutParams();
        int i5 = c1306d4.f5347c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int m1463m = m1463m(i3) - measuredWidth2;
        if (i6 == 1) {
            m1463m += measuredWidth2 / 2;
        } else if (i6 == 5) {
            m1463m += measuredWidth2;
        }
        int i8 = i7 != 16 ? i7 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1306d4).leftMargin, Math.min(m1463m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c1306d4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1306d4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1306d4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    /* renamed from: r */
    public final boolean m1467r(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1864c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        C0129F c0129f = f1860w;
        if (c0129f != null) {
            Collections.sort(arrayList, c0129f);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            AbstractC1303a abstractC1303a = ((C1306d) view.getLayoutParams()).f5345a;
            if (z2 && actionMasked != 0) {
                if (abstractC1303a != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 == 0) {
                        abstractC1303a.mo1885j(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        abstractC1303a.mo1894u(view, motionEvent2);
                    }
                }
            } else if (!z2 && abstractC1303a != null) {
                if (i2 == 0) {
                    z2 = abstractC1303a.mo1885j(this, view, motionEvent);
                } else if (i2 == 1) {
                    z2 = abstractC1303a.mo1894u(view, motionEvent);
                }
                if (z2) {
                    this.f1871j = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC1303a abstractC1303a = ((C1306d) view.getLayoutParams()).f5345a;
        if (abstractC1303a != null) {
            abstractC1303a.mo1898p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1868g) {
            return;
        }
        m1469t(false);
        this.f1868g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1468s() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1468s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m1470w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1878q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1877p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1877p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1877p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1877p;
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                AbstractC0088b.m308b(drawable3, getLayoutDirection());
                this.f1877p.setVisible(getVisibility() == 0, false);
                this.f1877p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? AbstractC0000a.m1b(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1877p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1877p.setVisible(z2, false);
    }

    /* renamed from: t */
    public final void m1469t(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC1303a abstractC1303a = ((C1306d) childAt.getLayoutParams()).f5345a;
            if (abstractC1303a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC1303a.mo1885j(this, childAt, obtain);
                } else {
                    abstractC1303a.mo1894u(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C1306d) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.f1871j = null;
        this.f1868g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1877p;
    }

    /* renamed from: w */
    public final void m1470w() {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (!getFitsSystemWindows()) {
            AbstractC0261E.m760u(this, null);
            return;
        }
        if (this.f1879r == null) {
            this.f1879r = new C0985d0(10, this);
        }
        AbstractC0261E.m760u(this, this.f1879r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1306d ? new C1306d((C1306d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1306d((ViewGroup.MarginLayoutParams) layoutParams) : new C1306d(layoutParams);
    }
}
