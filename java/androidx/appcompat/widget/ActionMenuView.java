package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.fragment.app.C0651y;
import p005C.C0046i;
import p086i.C0909n;
import p086i.InterfaceC0891A;
import p086i.InterfaceC0906k;
import p086i.MenuC0907l;
import p088j.AbstractC0925A1;
import p088j.AbstractC0929C0;
import p088j.C0927B0;
import p088j.C0990f;
import p088j.C0999i;
import p088j.C1005k;
import p088j.C1011m;
import p088j.C1013m1;
import p088j.InterfaceC1008l;
import p088j.InterfaceC1014n;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0929C0 implements InterfaceC0906k, InterfaceC0891A {

    /* renamed from: p */
    public MenuC0907l f1712p;

    /* renamed from: q */
    public Context f1713q;

    /* renamed from: r */
    public int f1714r;

    /* renamed from: s */
    public boolean f1715s;

    /* renamed from: t */
    public C1005k f1716t;

    /* renamed from: u */
    public C1013m1 f1717u;

    /* renamed from: v */
    public boolean f1718v;

    /* renamed from: w */
    public int f1719w;

    /* renamed from: x */
    public final int f1720x;

    /* renamed from: y */
    public final int f1721y;

    /* renamed from: z */
    public InterfaceC1014n f1722z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1720x = (int) (56.0f * f);
        this.f1721y = (int) (f * 4.0f);
        this.f1713q = context;
        this.f1714r = 0;
    }

    /* renamed from: l */
    public static C1011m m1397l() {
        C1011m c1011m = new C1011m(-2, -2);
        c1011m.f3988a = false;
        ((LinearLayout.LayoutParams) c1011m).gravity = 16;
        return c1011m;
    }

    /* renamed from: m */
    public static C1011m m1398m(ViewGroup.LayoutParams layoutParams) {
        C1011m c1011m;
        if (layoutParams == null) {
            return m1397l();
        }
        if (layoutParams instanceof C1011m) {
            C1011m c1011m2 = (C1011m) layoutParams;
            c1011m = new C1011m(c1011m2);
            c1011m.f3988a = c1011m2.f3988a;
        } else {
            c1011m = new C1011m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1011m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1011m).gravity = 16;
        }
        return c1011m;
    }

    @Override // p086i.InterfaceC0891A
    /* renamed from: b */
    public final void mo1380b(MenuC0907l menuC0907l) {
        this.f1712p = menuC0907l;
    }

    @Override // p086i.InterfaceC0906k
    /* renamed from: c */
    public final boolean mo1381c(C0909n c0909n) {
        return this.f1712p.m2344q(c0909n, null, 0);
    }

    @Override // p088j.AbstractC0929C0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1011m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p088j.AbstractC0929C0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1397l();
    }

    @Override // p088j.AbstractC0929C0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1398m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1712p == null) {
            Context context = getContext();
            MenuC0907l menuC0907l = new MenuC0907l(context);
            this.f1712p = menuC0907l;
            menuC0907l.f3667e = new C0046i(29, this);
            C1005k c1005k = new C1005k(context);
            this.f1716t = c1005k;
            c1005k.f3973m = true;
            c1005k.f3974n = true;
            c1005k.f3965e = new C0651y(8);
            this.f1712p.m2338b(c1005k, this.f1713q);
            C1005k c1005k2 = this.f1716t;
            c1005k2.f3968h = this;
            this.f1712p = c1005k2.f3963c;
        }
        return this.f1712p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1005k c1005k = this.f1716t;
        C0999i c0999i = c1005k.f3970j;
        if (c0999i != null) {
            return c0999i.getDrawable();
        }
        if (c1005k.f3972l) {
            return c1005k.f3971k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1714r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p088j.AbstractC0929C0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0927B0 generateDefaultLayoutParams() {
        return m1397l();
    }

    @Override // p088j.AbstractC0929C0
    /* renamed from: i */
    public final C0927B0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1011m(getContext(), attributeSet);
    }

    @Override // p088j.AbstractC0929C0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0927B0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1398m(layoutParams);
    }

    /* renamed from: n */
    public final boolean m1402n(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC1008l)) {
            z2 = ((InterfaceC1008l) childAt).mo1376b();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC1008l)) ? z2 : ((InterfaceC1008l) childAt2).mo1375a() | z2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1005k c1005k = this.f1716t;
        if (c1005k != null) {
            c1005k.mo483c();
            if (this.f1716t.m2488i()) {
                this.f1716t.m2487f();
                this.f1716t.m2489o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1005k c1005k = this.f1716t;
        if (c1005k != null) {
            c1005k.m2487f();
            C0990f c0990f = c1005k.f3981u;
            if (c0990f == null || !c0990f.m2361b()) {
                return;
            }
            c0990f.f3739i.dismiss();
        }
    }

    @Override // p088j.AbstractC0929C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.f1718v) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean m2376a = AbstractC0925A1.m2376a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C1011m c1011m = (C1011m) childAt.getLayoutParams();
                if (c1011m.f3988a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1402n(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2376a) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) c1011m).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1011m).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1011m).leftMargin) + ((LinearLayout.LayoutParams) c1011m).rightMargin;
                    m1402n(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (m2376a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C1011m c1011m2 = (C1011m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1011m2.f3988a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c1011m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1011m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C1011m c1011m3 = (C1011m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1011m3.f3988a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) c1011m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c1011m3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // p088j.AbstractC0929C0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        ?? r11;
        int i6;
        int i7;
        MenuC0907l menuC0907l;
        boolean z2 = this.f1718v;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f1718v = z3;
        if (z2 != z3) {
            this.f1719w = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f1718v && (menuC0907l = this.f1712p) != null && size != this.f1719w) {
            this.f1719w = size;
            menuC0907l.mo492p(true);
        }
        int childCount = getChildCount();
        if (!this.f1718v || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C1011m c1011m = (C1011m) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c1011m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1011m).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f1720x;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z4 = false;
        int i18 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f1721y;
            if (i17 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i17);
            int i19 = size3;
            int i20 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i6 = i13;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i15++;
                if (z5) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C1011m c1011m2 = (C1011m) childAt.getLayoutParams();
                c1011m2.f3993f = false;
                c1011m2.f3990c = 0;
                c1011m2.f3989b = 0;
                c1011m2.f3991d = false;
                ((LinearLayout.LayoutParams) c1011m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1011m2).rightMargin = 0;
                c1011m2.f3992e = z5 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i21 = c1011m2.f3988a ? 1 : i11;
                C1011m c1011m3 = (C1011m) childAt.getLayoutParams();
                int i22 = i11;
                i6 = i13;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i20, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z7 = z6;
                if (i21 <= 0 || (z6 && i21 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i21, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i6;
                    if (measuredWidth % i6 != 0) {
                        i7++;
                    }
                    if (z7 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c1011m3.f3991d = !c1011m3.f3988a && z7;
                c1011m3.f3989b = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i6, 1073741824), makeMeasureSpec);
                i16 = Math.max(i16, i7);
                if (c1011m2.f3991d) {
                    i18++;
                }
                if (c1011m2.f3988a) {
                    z4 = true;
                }
                i11 = i22 - i7;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    j2 |= 1 << i17;
                }
            }
            i17++;
            size3 = i19;
            paddingBottom = i20;
            i13 = i6;
        }
        int i23 = size3;
        int i24 = i11;
        int i25 = i13;
        boolean z8 = z4 && i15 == 2;
        int i26 = i24;
        boolean z9 = false;
        while (i18 > 0 && i26 > 0) {
            int i27 = Integer.MAX_VALUE;
            long j3 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i29 < childCount2) {
                boolean z10 = z8;
                C1011m c1011m4 = (C1011m) getChildAt(i29).getLayoutParams();
                int i30 = i14;
                if (c1011m4.f3991d) {
                    int i31 = c1011m4.f3989b;
                    if (i31 < i27) {
                        j3 = 1 << i29;
                        i27 = i31;
                        i28 = 1;
                    } else if (i31 == i27) {
                        j3 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                i14 = i30;
                z8 = z10;
            }
            boolean z11 = z8;
            i5 = i14;
            j2 |= j3;
            if (i28 > i26) {
                break;
            }
            int i32 = i27 + 1;
            int i33 = 0;
            while (i33 < childCount2) {
                View childAt2 = getChildAt(i33);
                C1011m c1011m5 = (C1011m) childAt2.getLayoutParams();
                boolean z12 = z4;
                long j4 = 1 << i33;
                if ((j3 & j4) != 0) {
                    if (z11 && c1011m5.f3992e) {
                        r11 = 1;
                        r11 = 1;
                        if (i26 == 1) {
                            childAt2.setPadding(i4 + i25, 0, i4, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1011m5.f3989b += r11;
                    c1011m5.f3993f = r11;
                    i26--;
                } else if (c1011m5.f3989b == i32) {
                    j2 |= j4;
                }
                i33++;
                z4 = z12;
            }
            i14 = i5;
            z8 = z11;
            z9 = true;
        }
        i5 = i14;
        boolean z13 = !z4 && i15 == 1;
        if (i26 > 0 && j2 != 0 && (i26 < i15 - 1 || z13 || i16 > 1)) {
            float bitCount = Long.bitCount(j2);
            if (!z13) {
                if ((j2 & 1) != 0 && !((C1011m) getChildAt(0).getLayoutParams()).f3992e) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j2 & (1 << i34)) != 0 && !((C1011m) getChildAt(i34).getLayoutParams()).f3992e) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) ((i26 * i25) / bitCount) : 0;
            boolean z14 = z9;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j2 & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    C1011m c1011m6 = (C1011m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1011m6.f3990c = i35;
                        c1011m6.f3993f = true;
                        if (i36 == 0 && !c1011m6.f3992e) {
                            ((LinearLayout.LayoutParams) c1011m6).leftMargin = (-i35) / 2;
                        }
                        z14 = true;
                    } else if (c1011m6.f3988a) {
                        c1011m6.f3990c = i35;
                        c1011m6.f3993f = true;
                        ((LinearLayout.LayoutParams) c1011m6).rightMargin = (-i35) / 2;
                        z14 = true;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) c1011m6).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1011m6).rightMargin = i35 / 2;
                        }
                    }
                }
            }
            z9 = z14;
        }
        if (z9) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                C1011m c1011m7 = (C1011m) childAt4.getLayoutParams();
                if (c1011m7.f3993f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1011m7.f3989b * i25) + c1011m7.f3990c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, mode != 1073741824 ? i5 : i23);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1716t.f3978r = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC1014n interfaceC1014n) {
        this.f1722z = interfaceC1014n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1005k c1005k = this.f1716t;
        C0999i c0999i = c1005k.f3970j;
        if (c0999i != null) {
            c0999i.setImageDrawable(drawable);
        } else {
            c1005k.f3972l = true;
            c1005k.f3971k = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1715s = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.f1714r != i2) {
            this.f1714r = i2;
            if (i2 == 0) {
                this.f1713q = getContext();
            } else {
                this.f1713q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C1005k c1005k) {
        this.f1716t = c1005k;
        c1005k.f3968h = this;
        this.f1712p = c1005k.f3963c;
    }

    @Override // p088j.AbstractC0929C0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1011m(getContext(), attributeSet);
    }
}
