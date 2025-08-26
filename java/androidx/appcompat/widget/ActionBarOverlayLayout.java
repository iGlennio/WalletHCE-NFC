package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p005C.C0041d;
import p010D1.AbstractC0104l;
import p017G0.C0177i;
import p027K.AbstractC0259C;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p027K.AbstractC0303k0;
import p027K.C0297h0;
import p027K.C0299i0;
import p027K.C0301j0;
import p027K.C0312p;
import p027K.C0315q0;
import p027K.C0319s0;
import p027K.InterfaceC0308n;
import p027K.InterfaceC0310o;
import p076e.C0776H;
import p083h.C0883k;
import p086i.InterfaceC0919x;
import p086i.MenuC0907l;
import p088j.C0987e;
import p088j.C1005k;
import p088j.C1019o1;
import p088j.C1034t1;
import p088j.InterfaceC0984d;
import p088j.InterfaceC1021p0;
import p088j.InterfaceC1024q0;
import p088j.RunnableC0981c;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1021p0, InterfaceC0308n, InterfaceC0310o {

    /* renamed from: B */
    public static final int[] f1684B = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A */
    public final C0312p f1685A;

    /* renamed from: a */
    public int f1686a;

    /* renamed from: b */
    public int f1687b;

    /* renamed from: c */
    public ContentFrameLayout f1688c;

    /* renamed from: d */
    public ActionBarContainer f1689d;

    /* renamed from: e */
    public InterfaceC1024q0 f1690e;

    /* renamed from: f */
    public Drawable f1691f;

    /* renamed from: g */
    public boolean f1692g;

    /* renamed from: h */
    public boolean f1693h;

    /* renamed from: i */
    public boolean f1694i;

    /* renamed from: j */
    public boolean f1695j;

    /* renamed from: k */
    public boolean f1696k;

    /* renamed from: l */
    public int f1697l;

    /* renamed from: m */
    public int f1698m;

    /* renamed from: n */
    public final Rect f1699n;

    /* renamed from: o */
    public final Rect f1700o;

    /* renamed from: p */
    public final Rect f1701p;

    /* renamed from: q */
    public C0319s0 f1702q;

    /* renamed from: r */
    public C0319s0 f1703r;

    /* renamed from: s */
    public C0319s0 f1704s;

    /* renamed from: t */
    public C0319s0 f1705t;

    /* renamed from: u */
    public InterfaceC0984d f1706u;

    /* renamed from: v */
    public OverScroller f1707v;

    /* renamed from: w */
    public ViewPropertyAnimator f1708w;

    /* renamed from: x */
    public final C0177i f1709x;

    /* renamed from: y */
    public final RunnableC0981c f1710y;

    /* renamed from: z */
    public final RunnableC0981c f1711z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1687b = 0;
        this.f1699n = new Rect();
        this.f1700o = new Rect();
        this.f1701p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0319s0 c0319s0 = C0319s0.f854b;
        this.f1702q = c0319s0;
        this.f1703r = c0319s0;
        this.f1704s = c0319s0;
        this.f1705t = c0319s0;
        this.f1709x = new C0177i(4, this);
        this.f1710y = new RunnableC0981c(this, 0);
        this.f1711z = new RunnableC0981c(this, 1);
        m1393i(context);
        this.f1685A = new C0312p();
    }

    /* renamed from: g */
    public static boolean m1391g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0987e c0987e = (C0987e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0987e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0987e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0987e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0987e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0987e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0987e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0987e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0987e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: a */
    public final void mo921a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // p027K.InterfaceC0310o
    /* renamed from: b */
    public final void mo928b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        mo922c(view, i2, i3, i4, i5, i6);
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: c */
    public final void mo922c(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0987e;
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: d */
    public final void mo923d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1691f == null || this.f1692g) {
            return;
        }
        if (this.f1689d.getVisibility() == 0) {
            i2 = (int) (this.f1689d.getTranslationY() + this.f1689d.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f1691f.setBounds(0, i2, getWidth(), this.f1691f.getIntrinsicHeight() + i2);
        this.f1691f.draw(canvas);
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: e */
    public final void mo924e(View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: f */
    public final boolean mo925f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0987e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0987e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1689d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0312p c0312p = this.f1685A;
        return c0312p.f850b | c0312p.f849a;
    }

    public CharSequence getTitle() {
        m1395k();
        return ((C1034t1) this.f1690e).f4054a.getTitle();
    }

    /* renamed from: h */
    public final void m1392h() {
        removeCallbacks(this.f1710y);
        removeCallbacks(this.f1711z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1708w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public final void m1393i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1684B);
        this.f1686a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1691f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1692g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1707v = new OverScroller(context);
    }

    /* renamed from: j */
    public final void m1394j(int i2) {
        m1395k();
        if (i2 == 2) {
            ((C1034t1) this.f1690e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            ((C1034t1) this.f1690e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* renamed from: k */
    public final void m1395k() {
        InterfaceC1024q0 wrapper;
        if (this.f1688c == null) {
            this.f1688c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1689d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1024q0) {
                wrapper = (InterfaceC1024q0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1690e = wrapper;
        }
    }

    /* renamed from: l */
    public final void m1396l(MenuC0907l menuC0907l, InterfaceC0919x interfaceC0919x) {
        m1395k();
        C1034t1 c1034t1 = (C1034t1) this.f1690e;
        C1005k c1005k = c1034t1.f4066m;
        Toolbar toolbar = c1034t1.f4054a;
        if (c1005k == null) {
            C1005k c1005k2 = new C1005k(toolbar.getContext());
            c1034t1.f4066m = c1005k2;
            c1005k2.f3969i = R.id.action_menu_presenter;
        }
        C1005k c1005k3 = c1034t1.f4066m;
        c1005k3.f3965e = interfaceC0919x;
        if (menuC0907l == null && toolbar.f1797a == null) {
            return;
        }
        toolbar.m1430f();
        MenuC0907l menuC0907l2 = toolbar.f1797a.f1712p;
        if (menuC0907l2 == menuC0907l) {
            return;
        }
        if (menuC0907l2 != null) {
            menuC0907l2.m2345r(toolbar.f1790K);
            menuC0907l2.m2345r(toolbar.f1791L);
        }
        if (toolbar.f1791L == null) {
            toolbar.f1791L = new C1019o1(toolbar);
        }
        c1005k3.f3978r = true;
        if (menuC0907l != null) {
            menuC0907l.m2338b(c1005k3, toolbar.f1806j);
            menuC0907l.m2338b(toolbar.f1791L, toolbar.f1806j);
        } else {
            c1005k3.mo487h(toolbar.f1806j, null);
            toolbar.f1791L.mo487h(toolbar.f1806j, null);
            c1005k3.mo483c();
            toolbar.f1791L.mo483c();
        }
        toolbar.f1797a.setPopupTheme(toolbar.f1807k);
        toolbar.f1797a.setPresenter(c1005k3);
        toolbar.f1790K = c1005k3;
        toolbar.m1441u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1395k();
        C0319s0 m936g = C0319s0.m936g(this, windowInsets);
        boolean m1391g = m1391g(this.f1689d, new Rect(m936g.m938b(), m936g.m940d(), m936g.m939c(), m936g.m937a()), false);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        Rect rect = this.f1699n;
        AbstractC0261E.m741b(this, m936g, rect);
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        C0315q0 c0315q0 = m936g.f855a;
        C0319s0 mo902l = c0315q0.mo902l(i2, i3, i4, i5);
        this.f1702q = mo902l;
        boolean z2 = true;
        if (!this.f1703r.equals(mo902l)) {
            this.f1703r = this.f1702q;
            m1391g = true;
        }
        Rect rect2 = this.f1700o;
        if (rect2.equals(rect)) {
            z2 = m1391g;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return c0315q0.mo926a().f855a.mo917c().f855a.mo916b().m941f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1393i(getContext());
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        AbstractC0259C.m739c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1392h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0987e c0987e = (C0987e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0987e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0987e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int measuredHeight;
        m1395k();
        measureChildWithMargins(this.f1689d, i2, 0, i3, 0);
        C0987e c0987e = (C0987e) this.f1689d.getLayoutParams();
        int max = Math.max(0, this.f1689d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0987e).leftMargin + ((ViewGroup.MarginLayoutParams) c0987e).rightMargin);
        int max2 = Math.max(0, this.f1689d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0987e).topMargin + ((ViewGroup.MarginLayoutParams) c0987e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1689d.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1686a;
            if (this.f1694i && this.f1689d.getTabContainer() != null) {
                measuredHeight += this.f1686a;
            }
        } else {
            measuredHeight = this.f1689d.getVisibility() != 8 ? this.f1689d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1699n;
        Rect rect2 = this.f1701p;
        rect2.set(rect);
        C0319s0 c0319s0 = this.f1702q;
        this.f1704s = c0319s0;
        if (this.f1693h || z2) {
            C0041d m145b = C0041d.m145b(c0319s0.m938b(), this.f1704s.m940d() + measuredHeight, this.f1704s.m939c(), this.f1704s.m937a());
            C0319s0 c0319s02 = this.f1704s;
            int i4 = Build.VERSION.SDK_INT;
            AbstractC0303k0 c0301j0 = i4 >= 30 ? new C0301j0(c0319s02) : i4 >= 29 ? new C0299i0(c0319s02) : new C0297h0(c0319s02);
            c0301j0.mo869g(m145b);
            this.f1704s = c0301j0.mo867b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f1704s = c0319s0.f855a.mo902l(0, measuredHeight, 0, 0);
        }
        m1391g(this.f1688c, rect2, true);
        if (!this.f1705t.equals(this.f1704s)) {
            C0319s0 c0319s03 = this.f1704s;
            this.f1705t = c0319s03;
            AbstractC0272P.m812b(this.f1688c, c0319s03);
        }
        measureChildWithMargins(this.f1688c, i2, 0, i3, 0);
        C0987e c0987e2 = (C0987e) this.f1688c.getLayoutParams();
        int max3 = Math.max(max, this.f1688c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0987e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0987e2).rightMargin);
        int max4 = Math.max(max2, this.f1688c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0987e2).topMargin + ((ViewGroup.MarginLayoutParams) c0987e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1688c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (!this.f1695j || !z2) {
            return false;
        }
        this.f1707v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1707v.getFinalY() > this.f1689d.getHeight()) {
            m1392h();
            this.f1711z.run();
        } else {
            m1392h();
            this.f1710y.run();
        }
        this.f1696k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1697l + i3;
        this.f1697l = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        C0776H c0776h;
        C0883k c0883k;
        this.f1685A.f849a = i2;
        this.f1697l = getActionBarHideOffset();
        m1392h();
        InterfaceC0984d interfaceC0984d = this.f1706u;
        if (interfaceC0984d == null || (c0883k = (c0776h = (C0776H) interfaceC0984d).f3023F) == null) {
            return;
        }
        c0883k.m2299a();
        c0776h.f3023F = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1689d.getVisibility() != 0) {
            return false;
        }
        return this.f1695j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1695j || this.f1696k) {
            return;
        }
        if (this.f1697l <= this.f1689d.getHeight()) {
            m1392h();
            postDelayed(this.f1710y, 600L);
        } else {
            m1392h();
            postDelayed(this.f1711z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        m1395k();
        int i3 = this.f1698m ^ i2;
        this.f1698m = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        InterfaceC0984d interfaceC0984d = this.f1706u;
        if (interfaceC0984d != null) {
            C0776H c0776h = (C0776H) interfaceC0984d;
            c0776h.f3019B = !z3;
            if (z2 || !z3) {
                if (c0776h.f3020C) {
                    c0776h.f3020C = false;
                    c0776h.m2083t0(true);
                }
            } else if (!c0776h.f3020C) {
                c0776h.f3020C = true;
                c0776h.m2083t0(true);
            }
        }
        if ((i3 & 256) == 0 || this.f1706u == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        AbstractC0259C.m739c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f1687b = i2;
        InterfaceC0984d interfaceC0984d = this.f1706u;
        if (interfaceC0984d != null) {
            ((C0776H) interfaceC0984d).f3018A = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        m1392h();
        this.f1689d.setTranslationY(-Math.max(0, Math.min(i2, this.f1689d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0984d interfaceC0984d) {
        this.f1706u = interfaceC0984d;
        if (getWindowToken() != null) {
            ((C0776H) this.f1706u).f3018A = this.f1687b;
            int i2 = this.f1698m;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                AbstractC0259C.m739c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1694i = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1695j) {
            this.f1695j = z2;
            if (z2) {
                return;
            }
            m1392h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        m1395k();
        C1034t1 c1034t1 = (C1034t1) this.f1690e;
        c1034t1.f4057d = i2 != 0 ? AbstractC0104l.m415w(c1034t1.f4054a.getContext(), i2) : null;
        c1034t1.m2526c();
    }

    public void setLogo(int i2) {
        m1395k();
        C1034t1 c1034t1 = (C1034t1) this.f1690e;
        c1034t1.f4058e = i2 != 0 ? AbstractC0104l.m415w(c1034t1.f4054a.getContext(), i2) : null;
        c1034t1.m2526c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1693h = z2;
        this.f1692g = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // p088j.InterfaceC1021p0
    public void setWindowCallback(Window.Callback callback) {
        m1395k();
        ((C1034t1) this.f1690e).f4064k = callback;
    }

    @Override // p088j.InterfaceC1021p0
    public void setWindowTitle(CharSequence charSequence) {
        m1395k();
        C1034t1 c1034t1 = (C1034t1) this.f1690e;
        if (c1034t1.f4060g) {
            return;
        }
        c1034t1.f4061h = charSequence;
        if ((c1034t1.f4055b & 8) != 0) {
            Toolbar toolbar = c1034t1.f4054a;
            toolbar.setTitle(charSequence);
            if (c1034t1.f4060g) {
                AbstractC0272P.m824n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0987e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m1395k();
        C1034t1 c1034t1 = (C1034t1) this.f1690e;
        c1034t1.f4057d = drawable;
        c1034t1.m2526c();
    }
}
