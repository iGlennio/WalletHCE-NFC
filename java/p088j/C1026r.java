package p088j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p010D1.AbstractC0104l;
import p045Q.InterfaceC0452s;
import p047Q1.AbstractC0458e;
import p081g0.C0869d;

/* renamed from: j.r */
/* loaded from: classes.dex */
public class C1026r extends CheckBox implements InterfaceC0452s {

    /* renamed from: a */
    public final C0869d f4029a;

    /* renamed from: b */
    public final C1020p f4030b;

    /* renamed from: c */
    public final C0979b0 f4031c;

    /* renamed from: d */
    public C1044x f4032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026r(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC1001i1.m2479a(context);
        AbstractC0998h1.m2474a(this, getContext());
        C0869d c0869d = new C0869d(this);
        this.f4029a = c0869d;
        c0869d.m2290d(attributeSet, i2);
        C1020p c1020p = new C1020p(this);
        this.f4030b = c1020p;
        c1020p.m2509d(attributeSet, i2);
        C0979b0 c0979b0 = new C0979b0(this);
        this.f4031c = c0979b0;
        c0979b0.m2451f(attributeSet, i2);
        getEmojiTextViewHelper().m2542a(attributeSet, i2);
    }

    private C1044x getEmojiTextViewHelper() {
        if (this.f4032d == null) {
            this.f4032d = new C1044x(this);
        }
        return this.f4032d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1020p c1020p = this.f4030b;
        if (c1020p != null) {
            c1020p.m2506a();
        }
        C0979b0 c0979b0 = this.f4031c;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0869d c0869d = this.f4029a;
        if (c0869d != null) {
            c0869d.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1020p c1020p = this.f4030b;
        if (c1020p != null) {
            return c1020p.m2507b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1020p c1020p = this.f4030b;
        if (c1020p != null) {
            return c1020p.m2508c();
        }
        return null;
    }

    @Override // p045Q.InterfaceC0452s
    public ColorStateList getSupportButtonTintList() {
        C0869d c0869d = this.f4029a;
        if (c0869d != null) {
            return (ColorStateList) c0869d.f3501e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0869d c0869d = this.f4029a;
        if (c0869d != null) {
            return (PorterDuff.Mode) c0869d.f3502f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4031c.m2449d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4031c.m2450e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2543b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1020p c1020p = this.f4030b;
        if (c1020p != null) {
            c1020p.m2510e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C1020p c1020p = this.f4030b;
        if (c1020p != null) {
            c1020p.m2511f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0869d c0869d = this.f4029a;
        if (c0869d != null) {
            if (c0869d.f3499c) {
                c0869d.f3499c = false;
            } else {
                c0869d.f3499c = true;
                c0869d.m2287a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f4031c;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f4031c;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2544c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0458e) getEmojiTextViewHelper().f4097b.f116b).mo1209B(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1020p c1020p = this.f4030b;
        if (c1020p != null) {
            c1020p.m2513h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1020p c1020p = this.f4030b;
        if (c1020p != null) {
            c1020p.m2514i(mode);
        }
    }

    @Override // p045Q.InterfaceC0452s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0869d c0869d = this.f4029a;
        if (c0869d != null) {
            c0869d.f3501e = colorStateList;
            c0869d.f3497a = true;
            c0869d.m2287a();
        }
    }

    @Override // p045Q.InterfaceC0452s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0869d c0869d = this.f4029a;
        if (c0869d != null) {
            c0869d.f3502f = mode;
            c0869d.f3498b = true;
            c0869d.m2287a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0979b0 c0979b0 = this.f4031c;
        c0979b0.m2456l(colorStateList);
        c0979b0.m2448b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0979b0 c0979b0 = this.f4031c;
        c0979b0.m2457m(mode);
        c0979b0.m2448b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(AbstractC0104l.m415w(getContext(), i2));
    }
}
