package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p010D1.AbstractC0104l;
import p014F0.ViewOnClickListenerC0141i;
import p027K.AbstractC0272P;
import p027K.C0278W;
import p073d.AbstractC0734a;
import p083h.AbstractC0873a;
import p086i.InterfaceC0891A;
import p086i.MenuC0907l;
import p088j.AbstractC0925A1;
import p088j.C0975a;
import p088j.C0990f;
import p088j.C1005k;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a */
    public final C0975a f1664a;

    /* renamed from: b */
    public final Context f1665b;

    /* renamed from: c */
    public ActionMenuView f1666c;

    /* renamed from: d */
    public C1005k f1667d;

    /* renamed from: e */
    public int f1668e;

    /* renamed from: f */
    public C0278W f1669f;

    /* renamed from: g */
    public boolean f1670g;

    /* renamed from: h */
    public boolean f1671h;

    /* renamed from: i */
    public CharSequence f1672i;

    /* renamed from: j */
    public CharSequence f1673j;

    /* renamed from: k */
    public View f1674k;

    /* renamed from: l */
    public View f1675l;

    /* renamed from: m */
    public View f1676m;

    /* renamed from: n */
    public LinearLayout f1677n;

    /* renamed from: o */
    public TextView f1678o;

    /* renamed from: p */
    public TextView f1679p;

    /* renamed from: q */
    public final int f1680q;

    /* renamed from: r */
    public final int f1681r;

    /* renamed from: s */
    public boolean f1682s;

    /* renamed from: t */
    public final int f1683t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1664a = new C0975a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1665b = context;
        } else {
            this.f1665b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0734a.f2914d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0104l.m415w(context, resourceId);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setBackground(drawable);
        this.f1680q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1681r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1668e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1683t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public static int m1384f(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    /* renamed from: g */
    public static int m1385g(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: c */
    public final void m1386c(AbstractC0873a abstractC0873a) {
        View view = this.f1674k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1683t, (ViewGroup) this, false);
            this.f1674k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1674k);
        }
        View findViewById = this.f1674k.findViewById(R.id.action_mode_close_button);
        this.f1675l = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC0141i(3, abstractC0873a));
        MenuC0907l mo2066c = abstractC0873a.mo2066c();
        C1005k c1005k = this.f1667d;
        if (c1005k != null) {
            c1005k.m2487f();
            C0990f c0990f = c1005k.f3981u;
            if (c0990f != null && c0990f.m2361b()) {
                c0990f.f3739i.dismiss();
            }
        }
        C1005k c1005k2 = new C1005k(getContext());
        this.f1667d = c1005k2;
        c1005k2.f3973m = true;
        c1005k2.f3974n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mo2066c.m2338b(this.f1667d, this.f1665b);
        C1005k c1005k3 = this.f1667d;
        InterfaceC0891A interfaceC0891A = c1005k3.f3968h;
        if (interfaceC0891A == null) {
            InterfaceC0891A interfaceC0891A2 = (InterfaceC0891A) c1005k3.f3964d.inflate(c1005k3.f3966f, (ViewGroup) this, false);
            c1005k3.f3968h = interfaceC0891A2;
            interfaceC0891A2.mo1380b(c1005k3.f3963c);
            c1005k3.mo483c();
        }
        InterfaceC0891A interfaceC0891A3 = c1005k3.f3968h;
        if (interfaceC0891A != interfaceC0891A3) {
            ((ActionMenuView) interfaceC0891A3).setPresenter(c1005k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0891A3;
        this.f1666c = actionMenuView;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        actionMenuView.setBackground(null);
        addView(this.f1666c, layoutParams);
    }

    /* renamed from: d */
    public final void m1387d() {
        if (this.f1677n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1677n = linearLayout;
            this.f1678o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1679p = (TextView) this.f1677n.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f1680q;
            if (i2 != 0) {
                this.f1678o.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f1681r;
            if (i3 != 0) {
                this.f1679p.setTextAppearance(getContext(), i3);
            }
        }
        this.f1678o.setText(this.f1672i);
        this.f1679p.setText(this.f1673j);
        boolean isEmpty = TextUtils.isEmpty(this.f1672i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1673j);
        this.f1679p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1677n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1677n.getParent() == null) {
            addView(this.f1677n);
        }
    }

    /* renamed from: e */
    public final void m1388e() {
        removeAllViews();
        this.f1676m = null;
        this.f1666c = null;
        this.f1667d = null;
        View view = this.f1675l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f1669f != null ? this.f1664a.f3885b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1668e;
    }

    public CharSequence getSubtitle() {
        return this.f1673j;
    }

    public CharSequence getTitle() {
        return this.f1672i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            C0278W c0278w = this.f1669f;
            if (c0278w != null) {
                c0278w.m840b();
            }
            super.setVisibility(i2);
        }
    }

    /* renamed from: i */
    public final C0278W m1390i(int i2, long j2) {
        C0278W c0278w = this.f1669f;
        if (c0278w != null) {
            c0278w.m840b();
        }
        C0975a c0975a = this.f1664a;
        if (i2 != 0) {
            C0278W m811a = AbstractC0272P.m811a(this);
            m811a.m839a(0.0f);
            m811a.m841c(j2);
            c0975a.f3886c.f1669f = m811a;
            c0975a.f3885b = i2;
            m811a.m842d(c0975a);
            return m811a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0278W m811a2 = AbstractC0272P.m811a(this);
        m811a2.m839a(1.0f);
        m811a2.m841c(j2);
        c0975a.f3886c.f1669f = m811a2;
        c0975a.f3885b = i2;
        m811a2.m842d(c0975a);
        return m811a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0734a.f2911a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C1005k c1005k = this.f1667d;
        if (c1005k != null) {
            Configuration configuration2 = c1005k.f3962b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            c1005k.f3977q = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            MenuC0907l menuC0907l = c1005k.f3963c;
            if (menuC0907l != null) {
                menuC0907l.mo492p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1005k c1005k = this.f1667d;
        if (c1005k != null) {
            c1005k.m2487f();
            C0990f c0990f = this.f1667d.f3981u;
            if (c0990f == null || !c0990f.m2361b()) {
                return;
            }
            c0990f.f3739i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1671h = false;
        }
        if (!this.f1671h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1671h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1671h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean m2376a = AbstractC0925A1.m2376a(this);
        int paddingRight = m2376a ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1674k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1674k.getLayoutParams();
            int i6 = m2376a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = m2376a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = m2376a ? paddingRight - i6 : paddingRight + i6;
            int m1385g = m1385g(this.f1674k, i8, paddingTop, paddingTop2, m2376a) + i8;
            paddingRight = m2376a ? m1385g - i7 : m1385g + i7;
        }
        LinearLayout linearLayout = this.f1677n;
        if (linearLayout != null && this.f1676m == null && linearLayout.getVisibility() != 8) {
            paddingRight += m1385g(this.f1677n, paddingRight, paddingTop, paddingTop2, m2376a);
        }
        View view2 = this.f1676m;
        if (view2 != null) {
            m1385g(view2, paddingRight, paddingTop, paddingTop2, m2376a);
        }
        int paddingLeft = m2376a ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1666c;
        if (actionMenuView != null) {
            m1385g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m2376a);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.f1668e;
        if (i4 <= 0) {
            i4 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i5 = i4 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        View view = this.f1674k;
        if (view != null) {
            int m1384f = m1384f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1674k.getLayoutParams();
            paddingLeft = m1384f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1666c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m1384f(this.f1666c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1677n;
        if (linearLayout != null && this.f1676m == null) {
            if (this.f1682s) {
                this.f1677n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1677n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1677n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = m1384f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1676m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                i5 = Math.min(i8, i5);
            }
            this.f1676m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i9));
        }
        if (this.f1668e > 0) {
            setMeasuredDimension(size, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1670g = false;
        }
        if (!this.f1670g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1670g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1670g = false;
        return true;
    }

    public void setContentHeight(int i2) {
        this.f1668e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1676m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1676m = view;
        if (view != null && (linearLayout = this.f1677n) != null) {
            removeView(linearLayout);
            this.f1677n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1673j = charSequence;
        m1387d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1672i = charSequence;
        m1387d();
        AbstractC0272P.m824n(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1682s) {
            requestLayout();
        }
        this.f1682s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
