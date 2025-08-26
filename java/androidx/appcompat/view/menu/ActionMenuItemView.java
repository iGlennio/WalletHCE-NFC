package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p010D1.AbstractC0096d;
import p073d.AbstractC0734a;
import p086i.AbstractC0898c;
import p086i.C0897b;
import p086i.C0909n;
import p086i.InterfaceC0906k;
import p086i.InterfaceC0921z;
import p086i.MenuC0907l;
import p088j.C0991f0;
import p088j.InterfaceC1008l;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0991f0 implements InterfaceC0921z, View.OnClickListener, InterfaceC1008l {

    /* renamed from: h */
    public C0909n f1625h;

    /* renamed from: i */
    public CharSequence f1626i;

    /* renamed from: j */
    public Drawable f1627j;

    /* renamed from: k */
    public InterfaceC0906k f1628k;

    /* renamed from: l */
    public C0897b f1629l;

    /* renamed from: m */
    public AbstractC0898c f1630m;

    /* renamed from: n */
    public boolean f1631n;

    /* renamed from: o */
    public boolean f1632o;

    /* renamed from: p */
    public final int f1633p;

    /* renamed from: q */
    public int f1634q;

    /* renamed from: r */
    public final int f1635r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1631n = m1378g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0734a.f2913c, 0, 0);
        this.f1633p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1635r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1634q = -1;
        setSaveEnabled(false);
    }

    @Override // p088j.InterfaceC1008l
    /* renamed from: a */
    public final boolean mo1375a() {
        return !TextUtils.isEmpty(getText()) && this.f1625h.getIcon() == null;
    }

    @Override // p088j.InterfaceC1008l
    /* renamed from: b */
    public final boolean mo1376b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p086i.InterfaceC0921z
    /* renamed from: e */
    public final void mo1377e(C0909n c0909n) {
        this.f1625h = c0909n;
        setIcon(c0909n.getIcon());
        setTitle(c0909n.getTitleCondensed());
        setId(c0909n.f3693a);
        setVisibility(c0909n.isVisible() ? 0 : 8);
        setEnabled(c0909n.isEnabled());
        if (c0909n.hasSubMenu() && this.f1629l == null) {
            this.f1629l = new C0897b(this);
        }
    }

    /* renamed from: g */
    public final boolean m1378g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 480) {
            return (i2 >= 640 && i3 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p086i.InterfaceC0921z
    public C0909n getItemData() {
        return this.f1625h;
    }

    /* renamed from: h */
    public final void m1379h() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1626i);
        if (this.f1627j != null && ((this.f1625h.f3717y & 4) != 4 || (!this.f1631n && !this.f1632o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1626i : null);
        CharSequence charSequence = this.f1625h.f3709q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1625h.f3697e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1625h.f3710r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0096d.m344e0(this, z4 ? null : this.f1625h.f3697e);
        } else {
            AbstractC0096d.m344e0(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0906k interfaceC0906k = this.f1628k;
        if (interfaceC0906k != null) {
            interfaceC0906k.mo1381c(this.f1625h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1631n = m1378g();
        m1379h();
    }

    @Override // p088j.C0991f0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.f1634q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f1633p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!isEmpty || this.f1627j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1627j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0897b c0897b;
        if (this.f1625h.hasSubMenu() && (c0897b = this.f1629l) != null && c0897b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1632o != z2) {
            this.f1632o = z2;
            C0909n c0909n = this.f1625h;
            if (c0909n != null) {
                MenuC0907l menuC0907l = c0909n.f3706n;
                menuC0907l.f3673k = true;
                menuC0907l.mo492p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1627j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1635r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1379h();
    }

    public void setItemInvoker(InterfaceC0906k interfaceC0906k) {
        this.f1628k = interfaceC0906k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f1634q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0898c abstractC0898c) {
        this.f1630m = abstractC0898c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1626i = charSequence;
        m1379h();
    }
}
