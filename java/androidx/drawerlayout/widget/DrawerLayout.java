package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p005C.C0041d;
import p005C.C0046i;
import p014F0.RunnableC0130G;
import p017G0.C0173e;
import p017G0.C0176h;
import p019H0.C0198d;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p027K.C0319s0;
import p030L.C0337d;
import p045Q.C0441h;
import p052T.C0483e;
import p054U.AbstractC0486a;
import p056V.C0508b;
import p056V.C0510d;
import p056V.C0511e;
import p056V.C0512f;
import p056V.InterfaceC0509c;
import p056V.ViewOnApplyWindowInsetsListenerC0507a;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: D */
    public static final int[] f1928D = {R.attr.colorPrimaryDark};

    /* renamed from: E */
    public static final int[] f1929E = {R.attr.layout_gravity};

    /* renamed from: F */
    public static final boolean f1930F;

    /* renamed from: G */
    public static final boolean f1931G;

    /* renamed from: H */
    public static final boolean f1932H;

    /* renamed from: A */
    public Rect f1933A;

    /* renamed from: B */
    public Matrix f1934B;

    /* renamed from: C */
    public final C0046i f1935C;

    /* renamed from: a */
    public final C0441h f1936a;

    /* renamed from: b */
    public float f1937b;

    /* renamed from: c */
    public final int f1938c;

    /* renamed from: d */
    public int f1939d;

    /* renamed from: e */
    public float f1940e;

    /* renamed from: f */
    public final Paint f1941f;

    /* renamed from: g */
    public final C0483e f1942g;

    /* renamed from: h */
    public final C0483e f1943h;

    /* renamed from: i */
    public final C0512f f1944i;

    /* renamed from: j */
    public final C0512f f1945j;

    /* renamed from: k */
    public int f1946k;

    /* renamed from: l */
    public boolean f1947l;

    /* renamed from: m */
    public boolean f1948m;

    /* renamed from: n */
    public int f1949n;

    /* renamed from: o */
    public int f1950o;

    /* renamed from: p */
    public int f1951p;

    /* renamed from: q */
    public int f1952q;

    /* renamed from: r */
    public boolean f1953r;

    /* renamed from: s */
    public InterfaceC0509c f1954s;

    /* renamed from: t */
    public ArrayList f1955t;

    /* renamed from: u */
    public float f1956u;

    /* renamed from: v */
    public float f1957v;

    /* renamed from: w */
    public Drawable f1958w;

    /* renamed from: x */
    public WindowInsets f1959x;

    /* renamed from: y */
    public boolean f1960y;

    /* renamed from: z */
    public final ArrayList f1961z;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1930F = true;
        f1931G = true;
        f1932H = i2 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.nfupay.s145.R.attr.drawerLayoutStyle);
        this.f1936a = new C0441h(1);
        this.f1939d = -1728053248;
        this.f1941f = new Paint();
        this.f1948m = true;
        this.f1949n = 3;
        this.f1950o = 3;
        this.f1951p = 3;
        this.f1952q = 3;
        this.f1935C = new C0046i(12, this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1938c = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C0512f c0512f = new C0512f(this, 3);
        this.f1944i = c0512f;
        C0512f c0512f2 = new C0512f(this, 5);
        this.f1945j = c0512f2;
        C0483e c0483e = new C0483e(getContext(), this, c0512f);
        c0483e.f1309b = (int) (c0483e.f1309b * 1.0f);
        this.f1942g = c0483e;
        c0483e.f1324q = 1;
        c0483e.f1321n = f2;
        c0512f.f1398b = c0483e;
        C0483e c0483e2 = new C0483e(getContext(), this, c0512f2);
        c0483e2.f1309b = (int) (1.0f * c0483e2.f1309b);
        this.f1943h = c0483e2;
        c0483e2.f1324q = 2;
        c0483e2.f1321n = f2;
        c0512f2.f1398b = c0483e2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setImportantForAccessibility(1);
        AbstractC0272P.m823m(this, new C0508b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0507a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1928D);
            try {
                this.f1958w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0486a.f1331a, com.nfupay.s145.R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f1937b = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f1937b = getResources().getDimension(com.nfupay.s145.R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f1961z = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: i */
    public static boolean m1488i(View view) {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    /* renamed from: j */
    public static boolean m1489j(View view) {
        return ((C0510d) view.getLayoutParams()).f1388a == 0;
    }

    /* renamed from: k */
    public static boolean m1490k(View view) {
        if (m1491l(view)) {
            return (((C0510d) view.getLayoutParams()).f1391d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: l */
    public static boolean m1491l(View view) {
        int i2 = ((C0510d) view.getLayoutParams()).f1388a;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* renamed from: a */
    public final boolean m1492a(View view, int i2) {
        return (m1499h(view) & i2) == i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            arrayList2 = this.f1961z;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!m1491l(childAt)) {
                arrayList2.add(childAt);
            } else if (m1490k(childAt)) {
                childAt.addFocusables(arrayList, i2, i3);
                z2 = true;
            }
            i4++;
        }
        if (!z2) {
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) arrayList2.get(i5);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i2, i3);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (m1496e() != null || m1491l(view)) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
            view.setImportantForAccessibility(1);
        }
        if (f1930F) {
            return;
        }
        AbstractC0272P.m823m(view, this.f1936a);
    }

    /* renamed from: b */
    public final void m1493b(View view, boolean z2) {
        if (!m1491l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0510d c0510d = (C0510d) view.getLayoutParams();
        if (this.f1948m) {
            c0510d.f1389b = 0.0f;
            c0510d.f1391d = 0;
        } else if (z2) {
            c0510d.f1391d |= 4;
            if (m1492a(view, 3)) {
                this.f1942g.m1258s(view, -view.getWidth(), view.getTop());
            } else {
                this.f1943h.m1258s(view, getWidth(), view.getTop());
            }
        } else {
            float f = ((C0510d) view.getLayoutParams()).f1389b;
            float width = view.getWidth();
            int i2 = ((int) (width * 0.0f)) - ((int) (f * width));
            if (!m1492a(view, 3)) {
                i2 = -i2;
            }
            view.offsetLeftAndRight(i2);
            m1502o(view, 0.0f);
            m1505r(view, 0);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: c */
    public final void m1494c(boolean z2) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0510d c0510d = (C0510d) childAt.getLayoutParams();
            if (m1491l(childAt) && (!z2 || c0510d.f1390c)) {
                z3 |= m1492a(childAt, 3) ? this.f1942g.m1258s(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1943h.m1258s(childAt, getWidth(), childAt.getTop());
                c0510d.f1390c = false;
            }
        }
        C0512f c0512f = this.f1944i;
        c0512f.f1400d.removeCallbacks(c0512f.f1399c);
        C0512f c0512f2 = this.f1945j;
        c0512f2.f1400d.removeCallbacks(c0512f2.f1399c);
        if (z3) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0510d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f = Math.max(f, ((C0510d) getChildAt(i2).getLayoutParams()).f1389b);
        }
        this.f1940e = f;
        boolean m1246g = this.f1942g.m1246g();
        boolean m1246g2 = this.f1943h.m1246g();
        if (m1246g || m1246g2) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: d */
    public final View m1495d(int i2) {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((m1499h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1940e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (this.f1933A == null) {
                this.f1933A = new Rect();
            }
            childAt.getHitRect(this.f1933A);
            if (this.f1933A.contains((int) x2, (int) y2) && !m1489j(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f1934B == null) {
                            this.f1934B = new Matrix();
                        }
                        matrix.invert(this.f1934B);
                        obtain.transform(this.f1934B);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        Drawable background;
        int height = getHeight();
        boolean m1489j = m1489j(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (m1489j) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m1491l(childAt) && childAt.getHeight() >= height) {
                    if (m1492a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f = this.f1940e;
        if (f > 0.0f && m1489j) {
            int i5 = this.f1939d;
            Paint paint = this.f1941f;
            paint.setColor((((int) ((((-16777216) & i5) >>> 24) * f)) << 24) | (i5 & 16777215));
            canvas.drawRect(i2, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    /* renamed from: e */
    public final View m1496e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((C0510d) childAt.getLayoutParams()).f1391d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final View m1497f() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (m1491l(childAt)) {
                if (!m1491l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((C0510d) childAt.getLayoutParams()).f1389b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public final int m1498g(View view) {
        if (!m1491l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i2 = ((C0510d) view.getLayoutParams()).f1388a;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        int layoutDirection = getLayoutDirection();
        if (i2 == 3) {
            int i3 = this.f1949n;
            if (i3 != 3) {
                return i3;
            }
            int i4 = layoutDirection == 0 ? this.f1951p : this.f1952q;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i2 == 5) {
            int i5 = this.f1950o;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f1952q : this.f1951p;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i2 == 8388611) {
            int i7 = this.f1951p;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f1949n : this.f1950o;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i2 != 8388613) {
            return 0;
        }
        int i9 = this.f1952q;
        if (i9 != 3) {
            return i9;
        }
        int i10 = layoutDirection == 0 ? this.f1950o : this.f1949n;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0510d c0510d = new C0510d(-1, -1);
        c0510d.f1388a = 0;
        return c0510d;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0510d) {
            C0510d c0510d = (C0510d) layoutParams;
            C0510d c0510d2 = new C0510d(c0510d);
            c0510d2.f1388a = 0;
            c0510d2.f1388a = c0510d.f1388a;
            return c0510d2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0510d c0510d3 = new C0510d((ViewGroup.MarginLayoutParams) layoutParams);
            c0510d3.f1388a = 0;
            return c0510d3;
        }
        C0510d c0510d4 = new C0510d(layoutParams);
        c0510d4.f1388a = 0;
        return c0510d4;
    }

    public float getDrawerElevation() {
        if (f1931G) {
            return this.f1937b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1958w;
    }

    /* renamed from: h */
    public final int m1499h(View view) {
        int i2 = ((C0510d) view.getLayoutParams()).f1388a;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        return Gravity.getAbsoluteGravity(i2, getLayoutDirection());
    }

    /* renamed from: m */
    public final void m1500m(View view) {
        if (!m1491l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0510d c0510d = (C0510d) view.getLayoutParams();
        if (this.f1948m) {
            c0510d.f1389b = 1.0f;
            c0510d.f1391d = 1;
            m1504q(view, true);
            m1503p(view);
        } else {
            c0510d.f1391d |= 2;
            if (m1492a(view, 3)) {
                this.f1942g.m1258s(view, 0, view.getTop());
            } else {
                this.f1943h.m1258s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* renamed from: n */
    public final void m1501n(int i2, int i3) {
        View m1495d;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        if (i3 == 3) {
            this.f1949n = i2;
        } else if (i3 == 5) {
            this.f1950o = i2;
        } else if (i3 == 8388611) {
            this.f1951p = i2;
        } else if (i3 == 8388613) {
            this.f1952q = i2;
        }
        if (i2 != 0) {
            (absoluteGravity == 3 ? this.f1942g : this.f1943h).m1240a();
        }
        if (i2 != 1) {
            if (i2 == 2 && (m1495d = m1495d(absoluteGravity)) != null) {
                m1500m(m1495d);
                return;
            }
            return;
        }
        View m1495d2 = m1495d(absoluteGravity);
        if (m1495d2 != null) {
            m1493b(m1495d2, true);
        }
    }

    /* renamed from: o */
    public final void m1502o(View view, float f) {
        C0510d c0510d = (C0510d) view.getLayoutParams();
        if (f == c0510d.f1389b) {
            return;
        }
        c0510d.f1389b = f;
        ArrayList arrayList = this.f1955t;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC0509c) this.f1955t.get(size)).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1948m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1948m = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1960y || this.f1958w == null) {
            return;
        }
        WindowInsets windowInsets = this.f1959x;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f1958w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1958w.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            T.e r1 = r8.f1942g
            boolean r2 = r1.m1257r(r9)
            T.e r3 = r8.f1943h
            boolean r3 = r3.m1257r(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.f1311d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.f1318k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f1313f
            r5 = r5[r0]
            float[] r6 = r1.f1311d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f1314g
            r6 = r6[r0]
            float[] r7 = r1.f1312e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f1309b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            V.f r9 = r8.f1944i
            P0.A r0 = r9.f1399c
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f1400d
            r9.removeCallbacks(r0)
            V.f r9 = r8.f1945j
            P0.A r0 = r9.f1399c
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f1400d
            r9.removeCallbacks(r0)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.m1494c(r3)
            r8.f1953r = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f1956u = r0
            r8.f1957v = r9
            float r5 = r8.f1940e
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.m1247h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = m1489j(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.f1953r = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            V.d r1 = (p056V.C0510d) r1
            boolean r1 = r1.f1390c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.f1953r
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            return r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || m1497f() == null) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View m1497f = m1497f();
        if (m1497f != null && m1498g(m1497f) == 0) {
            m1494c(false);
        }
        return m1497f != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        float f;
        int i6;
        boolean z3 = true;
        this.f1947l = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0510d c0510d = (C0510d) childAt.getLayoutParams();
                if (m1489j(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) c0510d).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) c0510d).topMargin, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0510d).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m1492a(childAt, 3)) {
                        float f2 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (c0510d.f1389b * f2));
                        f = (measuredWidth + i6) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i7 - r11) / f3;
                        i6 = i7 - ((int) (c0510d.f1389b * f3));
                    }
                    boolean z4 = f != c0510d.f1389b ? z3 : false;
                    int i10 = c0510d.f1388a & 112;
                    if (i10 == 16) {
                        int i11 = i5 - i3;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) c0510d).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) c0510d).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c0510d).topMargin;
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight + i16);
                    } else {
                        int i17 = i5 - i3;
                        childAt.layout(i6, (i17 - ((ViewGroup.MarginLayoutParams) c0510d).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i17 - ((ViewGroup.MarginLayoutParams) c0510d).bottomMargin);
                    }
                    if (z4) {
                        m1502o(childAt, f);
                    }
                    int i18 = c0510d.f1389b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i8++;
            z3 = true;
        }
        if (f1932H && (rootWindowInsets = getRootWindowInsets()) != null) {
            C0041d mo930i = C0319s0.m936g(null, rootWindowInsets).f855a.mo930i();
            C0483e c0483e = this.f1942g;
            c0483e.f1322o = Math.max(c0483e.f1323p, mo930i.f107a);
            C0483e c0483e2 = this.f1943h;
            c0483e2.f1322o = Math.max(c0483e2.f1323p, mo930i.f109c);
        }
        this.f1947l = false;
        this.f1948m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View m1495d;
        if (!(parcelable instanceof C0511e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0511e c0511e = (C0511e) parcelable;
        super.onRestoreInstanceState(c0511e.f1273a);
        int i2 = c0511e.f1392c;
        if (i2 != 0 && (m1495d = m1495d(i2)) != null) {
            m1500m(m1495d);
        }
        int i3 = c0511e.f1393d;
        if (i3 != 3) {
            m1501n(i3, 3);
        }
        int i4 = c0511e.f1394e;
        if (i4 != 3) {
            m1501n(i4, 5);
        }
        int i5 = c0511e.f1395f;
        if (i5 != 3) {
            m1501n(i5, 8388611);
        }
        int i6 = c0511e.f1396g;
        if (i6 != 3) {
            m1501n(i6, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        if (f1931G) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0511e c0511e = new C0511e(super.onSaveInstanceState());
        c0511e.f1392c = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C0510d c0510d = (C0510d) getChildAt(i2).getLayoutParams();
            int i3 = c0510d.f1391d;
            boolean z2 = i3 == 1;
            boolean z3 = i3 == 2;
            if (z2 || z3) {
                c0511e.f1392c = c0510d.f1388a;
                break;
            }
        }
        c0511e.f1393d = this.f1949n;
        c0511e.f1394e = this.f1950o;
        c0511e.f1395f = this.f1951p;
        c0511e.f1396g = this.f1952q;
        return c0511e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (m1498g(r7) != 2) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            T.e r0 = r6.f1942g
            r0.m1250k(r7)
            T.e r1 = r6.f1943h
            r1.m1250k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.m1494c(r3)
            r6.f1953r = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.m1247h(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = m1489j(r4)
            if (r4 == 0) goto L54
            float r4 = r6.f1956u
            float r1 = r1 - r4
            float r4 = r6.f1957v
            float r7 = r7 - r4
            int r0 = r0.f1309b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.m1496e()
            if (r7 == 0) goto L54
            int r7 = r6.m1498g(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.m1494c(r2)
            return r3
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f1956u = r0
            r6.f1957v = r7
            r6.f1953r = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m1503p(View view) {
        C0337d c0337d = C0337d.f884l;
        AbstractC0272P.m820j(view, c0337d.m961a());
        AbstractC0272P.m818h(view, 0);
        if (!m1490k(view) || m1498g(view) == 2) {
            return;
        }
        AbstractC0272P.m821k(view, c0337d, this.f1935C);
    }

    /* renamed from: q */
    public final void m1504q(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z2 || m1491l(childAt)) && !(z2 && childAt == view)) {
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    /* renamed from: r */
    public final void m1505r(View view, int i2) {
        int i3;
        View rootView;
        int i4 = this.f1942g.f1308a;
        int i5 = this.f1943h.f1308a;
        if (i4 == 1 || i5 == 1) {
            i3 = 1;
        } else {
            i3 = 2;
            if (i4 != 2 && i5 != 2) {
                i3 = 0;
            }
        }
        if (view != null && i2 == 0) {
            float f = ((C0510d) view.getLayoutParams()).f1389b;
            if (f == 0.0f) {
                C0510d c0510d = (C0510d) view.getLayoutParams();
                if ((c0510d.f1391d & 1) == 1) {
                    c0510d.f1391d = 0;
                    ArrayList arrayList = this.f1955t;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            NavigationView navigationView = ((C0198d) ((InterfaceC0509c) this.f1955t.get(size))).f572a;
                            if (view == navigationView) {
                                C0176h c0176h = navigationView.f2760u;
                                C0173e c0173e = (C0173e) c0176h.f515b;
                                if (c0173e != null) {
                                    c0173e.m518c((NavigationView) c0176h.f517d);
                                }
                                if (navigationView.f2756q && navigationView.f2755p != 0) {
                                    navigationView.f2755p = 0;
                                    navigationView.m1970g(navigationView.getWidth(), navigationView.getHeight());
                                }
                            }
                        }
                    }
                    m1504q(view, false);
                    m1503p(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C0510d c0510d2 = (C0510d) view.getLayoutParams();
                if ((c0510d2.f1391d & 1) == 0) {
                    c0510d2.f1391d = 1;
                    ArrayList arrayList2 = this.f1955t;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            NavigationView navigationView2 = ((C0198d) ((InterfaceC0509c) this.f1955t.get(size2))).f572a;
                            if (view == navigationView2) {
                                C0176h c0176h2 = navigationView2.f2760u;
                                Objects.requireNonNull(c0176h2);
                                view.post(new RunnableC0130G(1, c0176h2));
                            }
                        }
                    }
                    m1504q(view, true);
                    m1503p(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i3 != this.f1946k) {
            this.f1946k = i3;
            ArrayList arrayList3 = this.f1955t;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((InterfaceC0509c) this.f1955t.get(size3)).getClass();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            m1494c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1947l) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f1937b = f;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (m1491l(childAt)) {
                float f2 = this.f1937b;
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                AbstractC0261E.m758s(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0509c interfaceC0509c) {
        ArrayList arrayList;
        InterfaceC0509c interfaceC0509c2 = this.f1954s;
        if (interfaceC0509c2 != null && (arrayList = this.f1955t) != null) {
            arrayList.remove(interfaceC0509c2);
        }
        if (interfaceC0509c != null) {
            if (this.f1955t == null) {
                this.f1955t = new ArrayList();
            }
            this.f1955t.add(interfaceC0509c);
        }
        this.f1954s = interfaceC0509c;
    }

    public void setDrawerLockMode(int i2) {
        m1501n(i2, 3);
        m1501n(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.f1939d = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1958w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.f1958w = new ColorDrawable(i2);
        invalidate();
    }

    public void setStatusBarBackground(int i2) {
        this.f1958w = i2 != 0 ? AbstractC0000a.m1b(getContext(), i2) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0510d c0510d = new C0510d(context, attributeSet);
        c0510d.f1388a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1929E);
        c0510d.f1388a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return c0510d;
    }
}
