package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p002B.C0019i;
import p005C.AbstractC0044g;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p014F0.ViewOnClickListenerC0141i;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p043P0.RunnableC0402A;
import p073d.AbstractC0734a;
import p083h.C0881i;
import p086i.C0909n;
import p086i.MenuC0907l;
import p088j.AbstractC0925A1;
import p088j.AbstractC1016n1;
import p088j.C0962T0;
import p088j.C0991f0;
import p088j.C1005k;
import p088j.C1013m1;
import p088j.C1019o1;
import p088j.C1022p1;
import p088j.C1028r1;
import p088j.C1034t1;
import p088j.C1047y;
import p088j.C1050z;
import p088j.InterfaceC1024q0;
import p088j.InterfaceC1025q1;
import p088j.RunnableC1010l1;
import p088j.ViewOnClickListenerC1031s1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public ColorStateList f1780A;

    /* renamed from: B */
    public boolean f1781B;

    /* renamed from: C */
    public boolean f1782C;

    /* renamed from: D */
    public final ArrayList f1783D;

    /* renamed from: E */
    public final ArrayList f1784E;

    /* renamed from: F */
    public final int[] f1785F;

    /* renamed from: G */
    public final C0019i f1786G;

    /* renamed from: H */
    public ArrayList f1787H;

    /* renamed from: I */
    public final C1013m1 f1788I;

    /* renamed from: J */
    public C1034t1 f1789J;

    /* renamed from: K */
    public C1005k f1790K;

    /* renamed from: L */
    public C1019o1 f1791L;

    /* renamed from: M */
    public boolean f1792M;

    /* renamed from: N */
    public OnBackInvokedCallback f1793N;

    /* renamed from: O */
    public OnBackInvokedDispatcher f1794O;

    /* renamed from: P */
    public boolean f1795P;

    /* renamed from: Q */
    public final RunnableC0402A f1796Q;

    /* renamed from: a */
    public ActionMenuView f1797a;

    /* renamed from: b */
    public C0991f0 f1798b;

    /* renamed from: c */
    public C0991f0 f1799c;

    /* renamed from: d */
    public C1047y f1800d;

    /* renamed from: e */
    public C1050z f1801e;

    /* renamed from: f */
    public final Drawable f1802f;

    /* renamed from: g */
    public final CharSequence f1803g;

    /* renamed from: h */
    public C1047y f1804h;

    /* renamed from: i */
    public View f1805i;

    /* renamed from: j */
    public Context f1806j;

    /* renamed from: k */
    public int f1807k;

    /* renamed from: l */
    public int f1808l;

    /* renamed from: m */
    public int f1809m;

    /* renamed from: n */
    public final int f1810n;

    /* renamed from: o */
    public final int f1811o;

    /* renamed from: p */
    public int f1812p;

    /* renamed from: q */
    public int f1813q;

    /* renamed from: r */
    public int f1814r;

    /* renamed from: s */
    public int f1815s;

    /* renamed from: t */
    public C0962T0 f1816t;

    /* renamed from: u */
    public int f1817u;

    /* renamed from: v */
    public int f1818v;

    /* renamed from: w */
    public final int f1819w;

    /* renamed from: x */
    public CharSequence f1820x;

    /* renamed from: y */
    public CharSequence f1821y;

    /* renamed from: z */
    public ColorStateList f1822z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0881i(getContext());
    }

    /* renamed from: h */
    public static C1022p1 m1421h() {
        C1022p1 c1022p1 = new C1022p1(-2, -2);
        c1022p1.f4025b = 0;
        c1022p1.f4024a = 8388627;
        return c1022p1;
    }

    /* renamed from: i */
    public static C1022p1 m1422i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof C1022p1;
        if (z2) {
            C1022p1 c1022p1 = (C1022p1) layoutParams;
            C1022p1 c1022p12 = new C1022p1(c1022p1);
            c1022p12.f4025b = 0;
            c1022p12.f4025b = c1022p1.f4025b;
            return c1022p12;
        }
        if (z2) {
            C1022p1 c1022p13 = new C1022p1((C1022p1) layoutParams);
            c1022p13.f4025b = 0;
            return c1022p13;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1022p1 c1022p14 = new C1022p1(layoutParams);
            c1022p14.f4025b = 0;
            return c1022p14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1022p1 c1022p15 = new C1022p1(marginLayoutParams);
        c1022p15.f4025b = 0;
        ((ViewGroup.MarginLayoutParams) c1022p15).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1022p15).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1022p15).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1022p15).bottomMargin = marginLayoutParams.bottomMargin;
        return c1022p15;
    }

    /* renamed from: k */
    public static int m1423k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: l */
    public static int m1424l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m1425a(ArrayList arrayList, int i2) {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C1022p1 c1022p1 = (C1022p1) childAt.getLayoutParams();
                if (c1022p1.f4025b == 0 && m1440t(childAt)) {
                    int i4 = c1022p1.f4024a;
                    WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            C1022p1 c1022p12 = (C1022p1) childAt2.getLayoutParams();
            if (c1022p12.f4025b == 0 && m1440t(childAt2)) {
                int i6 = c1022p12.f4024a;
                WeakHashMap weakHashMap3 = AbstractC0272P.f768a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1426b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1022p1 m1421h = layoutParams == null ? m1421h() : !checkLayoutParams(layoutParams) ? m1422i(layoutParams) : (C1022p1) layoutParams;
        m1421h.f4025b = 1;
        if (!z2 || this.f1805i == null) {
            addView(view, m1421h);
        } else {
            view.setLayoutParams(m1421h);
            this.f1784E.add(view);
        }
    }

    /* renamed from: c */
    public final void m1427c() {
        if (this.f1804h == null) {
            C1047y c1047y = new C1047y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1804h = c1047y;
            c1047y.setImageDrawable(this.f1802f);
            this.f1804h.setContentDescription(this.f1803g);
            C1022p1 m1421h = m1421h();
            m1421h.f4024a = (this.f1810n & 112) | 8388611;
            m1421h.f4025b = 2;
            this.f1804h.setLayoutParams(m1421h);
            this.f1804h.setOnClickListener(new ViewOnClickListenerC0141i(4, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1022p1);
    }

    /* renamed from: d */
    public final void m1428d() {
        if (this.f1816t == null) {
            C0962T0 c0962t0 = new C0962T0();
            c0962t0.f3861a = 0;
            c0962t0.f3862b = 0;
            c0962t0.f3863c = Integer.MIN_VALUE;
            c0962t0.f3864d = Integer.MIN_VALUE;
            c0962t0.f3865e = 0;
            c0962t0.f3866f = 0;
            c0962t0.f3867g = false;
            c0962t0.f3868h = false;
            this.f1816t = c0962t0;
        }
    }

    /* renamed from: e */
    public final void m1429e() {
        m1430f();
        ActionMenuView actionMenuView = this.f1797a;
        if (actionMenuView.f1712p == null) {
            MenuC0907l menuC0907l = (MenuC0907l) actionMenuView.getMenu();
            if (this.f1791L == null) {
                this.f1791L = new C1019o1(this);
            }
            this.f1797a.setExpandedActionViewsExclusive(true);
            menuC0907l.m2338b(this.f1791L, this.f1806j);
            m1441u();
        }
    }

    /* renamed from: f */
    public final void m1430f() {
        if (this.f1797a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1797a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1807k);
            this.f1797a.setOnMenuItemClickListener(this.f1788I);
            ActionMenuView actionMenuView2 = this.f1797a;
            C1013m1 c1013m1 = new C1013m1(this);
            actionMenuView2.getClass();
            actionMenuView2.f1717u = c1013m1;
            C1022p1 m1421h = m1421h();
            m1421h.f4024a = (this.f1810n & 112) | 8388613;
            this.f1797a.setLayoutParams(m1421h);
            m1426b(this.f1797a, false);
        }
    }

    /* renamed from: g */
    public final void m1431g() {
        if (this.f1800d == null) {
            this.f1800d = new C1047y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1022p1 m1421h = m1421h();
            m1421h.f4024a = (this.f1810n & 112) | 8388611;
            this.f1800d.setLayoutParams(m1421h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1421h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1422i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1047y c1047y = this.f1804h;
        if (c1047y != null) {
            return c1047y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1047y c1047y = this.f1804h;
        if (c1047y != null) {
            return c1047y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0962T0 c0962t0 = this.f1816t;
        if (c0962t0 != null) {
            return c0962t0.f3867g ? c0962t0.f3861a : c0962t0.f3862b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1818v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0962T0 c0962t0 = this.f1816t;
        if (c0962t0 != null) {
            return c0962t0.f3861a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0962T0 c0962t0 = this.f1816t;
        if (c0962t0 != null) {
            return c0962t0.f3862b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0962T0 c0962t0 = this.f1816t;
        if (c0962t0 != null) {
            return c0962t0.f3867g ? c0962t0.f3862b : c0962t0.f3861a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1817u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0907l menuC0907l;
        ActionMenuView actionMenuView = this.f1797a;
        return (actionMenuView == null || (menuC0907l = actionMenuView.f1712p) == null || !menuC0907l.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1818v, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1817u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1050z c1050z = this.f1801e;
        if (c1050z != null) {
            return c1050z.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1050z c1050z = this.f1801e;
        if (c1050z != null) {
            return c1050z.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1429e();
        return this.f1797a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1800d;
    }

    public CharSequence getNavigationContentDescription() {
        C1047y c1047y = this.f1800d;
        if (c1047y != null) {
            return c1047y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1047y c1047y = this.f1800d;
        if (c1047y != null) {
            return c1047y.getDrawable();
        }
        return null;
    }

    public C1005k getOuterActionMenuPresenter() {
        return this.f1790K;
    }

    public Drawable getOverflowIcon() {
        m1429e();
        return this.f1797a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1806j;
    }

    public int getPopupTheme() {
        return this.f1807k;
    }

    public CharSequence getSubtitle() {
        return this.f1821y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1799c;
    }

    public CharSequence getTitle() {
        return this.f1820x;
    }

    public int getTitleMarginBottom() {
        return this.f1815s;
    }

    public int getTitleMarginEnd() {
        return this.f1813q;
    }

    public int getTitleMarginStart() {
        return this.f1812p;
    }

    public int getTitleMarginTop() {
        return this.f1814r;
    }

    public final TextView getTitleTextView() {
        return this.f1798b;
    }

    public InterfaceC1024q0 getWrapper() {
        Drawable drawable;
        if (this.f1789J == null) {
            C1034t1 c1034t1 = new C1034t1();
            c1034t1.f4067n = 0;
            c1034t1.f4054a = this;
            c1034t1.f4061h = getTitle();
            c1034t1.f4062i = getSubtitle();
            c1034t1.f4060g = c1034t1.f4061h != null;
            c1034t1.f4059f = getNavigationIcon();
            C0176h m519B = C0176h.m519B(getContext(), null, AbstractC0734a.f2911a, R.attr.actionBarStyle);
            c1034t1.f4068o = m519B.m542q(15);
            TypedArray typedArray = (TypedArray) m519B.f516c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1034t1.f4060g = true;
                c1034t1.f4061h = text;
                if ((c1034t1.f4055b & 8) != 0) {
                    Toolbar toolbar = c1034t1.f4054a;
                    toolbar.setTitle(text);
                    if (c1034t1.f4060g) {
                        AbstractC0272P.m824n(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1034t1.f4062i = text2;
                if ((c1034t1.f4055b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable m542q = m519B.m542q(20);
            if (m542q != null) {
                c1034t1.f4058e = m542q;
                c1034t1.m2526c();
            }
            Drawable m542q2 = m519B.m542q(17);
            if (m542q2 != null) {
                c1034t1.f4057d = m542q2;
                c1034t1.m2526c();
            }
            if (c1034t1.f4059f == null && (drawable = c1034t1.f4068o) != null) {
                c1034t1.f4059f = drawable;
                int i2 = c1034t1.f4055b & 4;
                Toolbar toolbar2 = c1034t1.f4054a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c1034t1.m2524a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1034t1.f4056c;
                if (view != null && (c1034t1.f4055b & 16) != 0) {
                    removeView(view);
                }
                c1034t1.f4056c = inflate;
                if (inflate != null && (c1034t1.f4055b & 16) != 0) {
                    addView(inflate);
                }
                c1034t1.m2524a(c1034t1.f4055b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                m1428d();
                this.f1816t.m2433a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1808l = resourceId2;
                C0991f0 c0991f0 = this.f1798b;
                if (c0991f0 != null) {
                    c0991f0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1809m = resourceId3;
                C0991f0 c0991f02 = this.f1799c;
                if (c0991f02 != null) {
                    c0991f02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            m519B.m523E();
            if (R.string.abc_action_bar_up_description != c1034t1.f4067n) {
                c1034t1.f4067n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = c1034t1.f4067n;
                    c1034t1.f4063j = i3 != 0 ? getContext().getString(i3) : null;
                    c1034t1.m2525b();
                }
            }
            c1034t1.f4063j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1031s1(c1034t1));
            this.f1789J = c1034t1;
        }
        return this.f1789J;
    }

    /* renamed from: j */
    public final int m1432j(View view, int i2) {
        C1022p1 c1022p1 = (C1022p1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = c1022p1.f4024a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1819w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1022p1).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) c1022p1).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) c1022p1).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    /* renamed from: m */
    public void mo1433m(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    /* renamed from: n */
    public final void m1434n() {
        Iterator it = this.f1787H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1786G.f48c).iterator();
        if (it2.hasNext()) {
            throw AbstractC0044g.m152d(it2);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1787H = currentMenuItems2;
    }

    /* renamed from: o */
    public final boolean m1435o(View view) {
        return view.getParent() == this || this.f1784E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1441u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1796Q);
        m1441u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1782C = false;
        }
        if (!this.f1782C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1782C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1782C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0295 A[LOOP:0: B:40:0x0293->B:41:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ad A[LOOP:1: B:44:0x02ab->B:45:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cd A[LOOP:2: B:48:0x02cb->B:49:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0321 A[LOOP:3: B:57:0x031f->B:58:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean m2376a = AbstractC0925A1.m2376a(this);
        int i11 = !m2376a ? 1 : 0;
        int i12 = 0;
        if (m1440t(this.f1800d)) {
            m1439s(this.f1800d, i2, 0, i3, this.f1811o);
            i4 = m1423k(this.f1800d) + this.f1800d.getMeasuredWidth();
            i5 = Math.max(0, m1424l(this.f1800d) + this.f1800d.getMeasuredHeight());
            i6 = View.combineMeasuredStates(0, this.f1800d.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (m1440t(this.f1804h)) {
            m1439s(this.f1804h, i2, 0, i3, this.f1811o);
            i4 = m1423k(this.f1804h) + this.f1804h.getMeasuredWidth();
            i5 = Math.max(i5, m1424l(this.f1804h) + this.f1804h.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1804h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4);
        int max2 = Math.max(0, currentContentInsetStart - i4);
        int[] iArr = this.f1785F;
        iArr[m2376a ? 1 : 0] = max2;
        if (m1440t(this.f1797a)) {
            m1439s(this.f1797a, i2, max, i3, this.f1811o);
            i7 = m1423k(this.f1797a) + this.f1797a.getMeasuredWidth();
            i5 = Math.max(i5, m1424l(this.f1797a) + this.f1797a.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1797a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i7);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (m1440t(this.f1805i)) {
            max3 += m1438r(this.f1805i, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, m1424l(this.f1805i) + this.f1805i.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1805i.getMeasuredState());
        }
        if (m1440t(this.f1801e)) {
            max3 += m1438r(this.f1801e, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, m1424l(this.f1801e) + this.f1801e.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1801e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((C1022p1) childAt.getLayoutParams()).f4025b == 0 && m1440t(childAt)) {
                max3 += m1438r(childAt, i2, max3, i3, 0, iArr);
                int max4 = Math.max(i5, m1424l(childAt) + childAt.getMeasuredHeight());
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
                i5 = max4;
            } else {
                max3 = max3;
            }
        }
        int i14 = max3;
        int i15 = this.f1814r + this.f1815s;
        int i16 = this.f1812p + this.f1813q;
        if (m1440t(this.f1798b)) {
            m1438r(this.f1798b, i2, i14 + i16, i3, i15, iArr);
            int m1423k = m1423k(this.f1798b) + this.f1798b.getMeasuredWidth();
            i8 = m1424l(this.f1798b) + this.f1798b.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i6, this.f1798b.getMeasuredState());
            i10 = m1423k;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (m1440t(this.f1799c)) {
            i10 = Math.max(i10, m1438r(this.f1799c, i2, i14 + i16, i3, i15 + i8, iArr));
            i8 += m1424l(this.f1799c) + this.f1799c.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.f1799c.getMeasuredState());
        }
        int max5 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + i10;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i9 << 16);
        if (this.f1792M) {
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!m1440t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i12);
        }
        i12 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C1028r1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1028r1 c1028r1 = (C1028r1) parcelable;
        super.onRestoreInstanceState(c1028r1.f1273a);
        ActionMenuView actionMenuView = this.f1797a;
        MenuC0907l menuC0907l = actionMenuView != null ? actionMenuView.f1712p : null;
        int i2 = c1028r1.f4035c;
        if (i2 != 0 && this.f1791L != null && menuC0907l != null && (findItem = menuC0907l.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (c1028r1.f4036d) {
            RunnableC0402A runnableC0402A = this.f1796Q;
            removeCallbacks(runnableC0402A);
            post(runnableC0402A);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        m1428d();
        C0962T0 c0962t0 = this.f1816t;
        boolean z2 = i2 == 1;
        if (z2 == c0962t0.f3867g) {
            return;
        }
        c0962t0.f3867g = z2;
        if (!c0962t0.f3868h) {
            c0962t0.f3861a = c0962t0.f3865e;
            c0962t0.f3862b = c0962t0.f3866f;
            return;
        }
        if (z2) {
            int i3 = c0962t0.f3864d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0962t0.f3865e;
            }
            c0962t0.f3861a = i3;
            int i4 = c0962t0.f3863c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c0962t0.f3866f;
            }
            c0962t0.f3862b = i4;
            return;
        }
        int i5 = c0962t0.f3863c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0962t0.f3865e;
        }
        c0962t0.f3861a = i5;
        int i6 = c0962t0.f3864d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = c0962t0.f3866f;
        }
        c0962t0.f3862b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1005k c1005k;
        C0909n c0909n;
        C1028r1 c1028r1 = new C1028r1(super.onSaveInstanceState());
        C1019o1 c1019o1 = this.f1791L;
        if (c1019o1 != null && (c0909n = c1019o1.f4016b) != null) {
            c1028r1.f4035c = c0909n.f3693a;
        }
        ActionMenuView actionMenuView = this.f1797a;
        c1028r1.f4036d = (actionMenuView == null || (c1005k = actionMenuView.f1716t) == null || !c1005k.m2488i()) ? false : true;
        return c1028r1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1781B = false;
        }
        if (!this.f1781B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1781B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1781B = false;
        return true;
    }

    /* renamed from: p */
    public final int m1436p(View view, int i2, int i3, int[] iArr) {
        C1022p1 c1022p1 = (C1022p1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c1022p1).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int m1432j = m1432j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m1432j, max + measuredWidth, view.getMeasuredHeight() + m1432j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1022p1).rightMargin + max;
    }

    /* renamed from: q */
    public final int m1437q(View view, int i2, int i3, int[] iArr) {
        C1022p1 c1022p1 = (C1022p1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c1022p1).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int m1432j = m1432j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m1432j, max, view.getMeasuredHeight() + m1432j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1022p1).leftMargin);
    }

    /* renamed from: r */
    public final int m1438r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: s */
    public final void m1439s(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1795P != z2) {
            this.f1795P = z2;
            m1441u();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AbstractC0104l.m415w(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f1792M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1818v) {
            this.f1818v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1817u) {
            this.f1817u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AbstractC0104l.m415w(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0104l.m415w(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1431g();
        this.f1800d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m1429e();
        this.f1797a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1807k != i2) {
            this.f1807k = i2;
            if (i2 == 0) {
                this.f1806j = getContext();
            } else {
                this.f1806j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f1815s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1813q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1812p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1814r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    /* renamed from: t */
    public final boolean m1440t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: u */
    public final void m1441u() {
        boolean z2;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m2502a = AbstractC1016n1.m2502a(this);
            C1019o1 c1019o1 = this.f1791L;
            if (c1019o1 != null && c1019o1.f4016b != null && m2502a != null) {
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                if (isAttachedToWindow() && this.f1795P) {
                    z2 = true;
                    if (!z2 && this.f1794O == null) {
                        if (this.f1793N == null) {
                            this.f1793N = AbstractC1016n1.m2503b(new RunnableC1010l1(this, i2));
                        }
                        AbstractC1016n1.m2504c(m2502a, this.f1793N);
                        this.f1794O = m2502a;
                        return;
                    }
                    if (!z2 || (onBackInvokedDispatcher = this.f1794O) == null) {
                    }
                    AbstractC1016n1.m2505d(onBackInvokedDispatcher, this.f1793N);
                    this.f1794O = null;
                    return;
                }
            }
            z2 = false;
            if (!z2) {
            }
            if (z2) {
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1819w = 8388627;
        this.f1783D = new ArrayList();
        this.f1784E = new ArrayList();
        this.f1785F = new int[2];
        this.f1786G = new C0019i(new RunnableC1010l1(this, 1));
        this.f1787H = new ArrayList();
        this.f1788I = new C1013m1(this);
        this.f1796Q = new RunnableC0402A(12, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0734a.f2934x;
        C0176h m519B = C0176h.m519B(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC0272P.m822l(this, context, iArr, attributeSet, (TypedArray) m519B.f516c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) m519B.f516c;
        this.f1808l = typedArray.getResourceId(28, 0);
        this.f1809m = typedArray.getResourceId(19, 0);
        this.f1819w = typedArray.getInteger(0, 8388627);
        this.f1810n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1815s = dimensionPixelOffset;
        this.f1814r = dimensionPixelOffset;
        this.f1813q = dimensionPixelOffset;
        this.f1812p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1812p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1813q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1814r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1815s = dimensionPixelOffset5;
        }
        this.f1811o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m1428d();
        C0962T0 c0962t0 = this.f1816t;
        c0962t0.f3868h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0962t0.f3865e = dimensionPixelSize;
            c0962t0.f3861a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0962t0.f3866f = dimensionPixelSize2;
            c0962t0.f3862b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0962t0.m2433a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1817u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1818v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1802f = m519B.m542q(4);
        this.f1803g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1806j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable m542q = m519B.m542q(16);
        if (m542q != null) {
            setNavigationIcon(m542q);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable m542q2 = m519B.m542q(11);
        if (m542q2 != null) {
            setLogo(m542q2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(m519B.m541p(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(m519B.m541p(20));
        }
        if (typedArray.hasValue(14)) {
            mo1433m(typedArray.getResourceId(14, 0));
        }
        m519B.m523E();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1022p1 c1022p1 = new C1022p1(context, attributeSet);
        c1022p1.f4024a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0734a.f2912b);
        c1022p1.f4024a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        c1022p1.f4025b = 0;
        return c1022p1;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1427c();
        }
        C1047y c1047y = this.f1804h;
        if (c1047y != null) {
            c1047y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1427c();
            this.f1804h.setImageDrawable(drawable);
        } else {
            C1047y c1047y = this.f1804h;
            if (c1047y != null) {
                c1047y.setImageDrawable(this.f1802f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1801e == null) {
                this.f1801e = new C1050z(getContext(), null, 0);
            }
            if (!m1435o(this.f1801e)) {
                m1426b(this.f1801e, true);
            }
        } else {
            C1050z c1050z = this.f1801e;
            if (c1050z != null && m1435o(c1050z)) {
                removeView(this.f1801e);
                this.f1784E.remove(this.f1801e);
            }
        }
        C1050z c1050z2 = this.f1801e;
        if (c1050z2 != null) {
            c1050z2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1801e == null) {
            this.f1801e = new C1050z(getContext(), null, 0);
        }
        C1050z c1050z = this.f1801e;
        if (c1050z != null) {
            c1050z.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1431g();
        }
        C1047y c1047y = this.f1800d;
        if (c1047y != null) {
            c1047y.setContentDescription(charSequence);
            AbstractC0096d.m344e0(this.f1800d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1431g();
            if (!m1435o(this.f1800d)) {
                m1426b(this.f1800d, true);
            }
        } else {
            C1047y c1047y = this.f1800d;
            if (c1047y != null && m1435o(c1047y)) {
                removeView(this.f1800d);
                this.f1784E.remove(this.f1800d);
            }
        }
        C1047y c1047y2 = this.f1800d;
        if (c1047y2 != null) {
            c1047y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0991f0 c0991f0 = this.f1799c;
            if (c0991f0 != null && m1435o(c0991f0)) {
                removeView(this.f1799c);
                this.f1784E.remove(this.f1799c);
            }
        } else {
            if (this.f1799c == null) {
                Context context = getContext();
                C0991f0 c0991f02 = new C0991f0(context, null);
                this.f1799c = c0991f02;
                c0991f02.setSingleLine();
                this.f1799c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1809m;
                if (i2 != 0) {
                    this.f1799c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1780A;
                if (colorStateList != null) {
                    this.f1799c.setTextColor(colorStateList);
                }
            }
            if (!m1435o(this.f1799c)) {
                m1426b(this.f1799c, true);
            }
        }
        C0991f0 c0991f03 = this.f1799c;
        if (c0991f03 != null) {
            c0991f03.setText(charSequence);
        }
        this.f1821y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1780A = colorStateList;
        C0991f0 c0991f0 = this.f1799c;
        if (c0991f0 != null) {
            c0991f0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0991f0 c0991f0 = this.f1798b;
            if (c0991f0 != null && m1435o(c0991f0)) {
                removeView(this.f1798b);
                this.f1784E.remove(this.f1798b);
            }
        } else {
            if (this.f1798b == null) {
                Context context = getContext();
                C0991f0 c0991f02 = new C0991f0(context, null);
                this.f1798b = c0991f02;
                c0991f02.setSingleLine();
                this.f1798b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1808l;
                if (i2 != 0) {
                    this.f1798b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1822z;
                if (colorStateList != null) {
                    this.f1798b.setTextColor(colorStateList);
                }
            }
            if (!m1435o(this.f1798b)) {
                m1426b(this.f1798b, true);
            }
        }
        C0991f0 c0991f03 = this.f1798b;
        if (c0991f03 != null) {
            c0991f03.setText(charSequence);
        }
        this.f1820x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1822z = colorStateList;
        C0991f0 c0991f0 = this.f1798b;
        if (c0991f0 != null) {
            c0991f0.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC1025q1 interfaceC1025q1) {
    }
}
