package p088j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p047Q1.AbstractC0458e;

/* renamed from: j.n0 */
/* loaded from: classes.dex */
public final class C1015n0 extends ToggleButton {

    /* renamed from: a */
    public final C1020p f4008a;

    /* renamed from: b */
    public final C0979b0 f4009b;

    /* renamed from: c */
    public C1044x f4010c;

    public C1015n0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC0998h1.m2474a(this, getContext());
        C1020p c1020p = new C1020p(this);
        this.f4008a = c1020p;
        c1020p.m2509d(attributeSet, R.attr.buttonStyleToggle);
        C0979b0 c0979b0 = new C0979b0(this);
        this.f4009b = c0979b0;
        c0979b0.m2451f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m2542a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1044x getEmojiTextViewHelper() {
        if (this.f4010c == null) {
            this.f4010c = new C1044x(this);
        }
        return this.f4010c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1020p c1020p = this.f4008a;
        if (c1020p != null) {
            c1020p.m2506a();
        }
        C0979b0 c0979b0 = this.f4009b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1020p c1020p = this.f4008a;
        if (c1020p != null) {
            return c1020p.m2507b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1020p c1020p = this.f4008a;
        if (c1020p != null) {
            return c1020p.m2508c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4009b.m2449d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4009b.m2450e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2543b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1020p c1020p = this.f4008a;
        if (c1020p != null) {
            c1020p.m2510e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C1020p c1020p = this.f4008a;
        if (c1020p != null) {
            c1020p.m2511f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f4009b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f4009b;
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
        C1020p c1020p = this.f4008a;
        if (c1020p != null) {
            c1020p.m2513h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1020p c1020p = this.f4008a;
        if (c1020p != null) {
            c1020p.m2514i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0979b0 c0979b0 = this.f4009b;
        c0979b0.m2456l(colorStateList);
        c0979b0.m2448b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0979b0 c0979b0 = this.f4009b;
        c0979b0.m2457m(mode);
        c0979b0.m2448b();
    }
}
