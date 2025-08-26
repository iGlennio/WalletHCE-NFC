package p088j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p010D1.AbstractC0104l;
import p017G0.C0176h;
import p047Q1.AbstractC0458e;

/* renamed from: j.A */
/* loaded from: classes.dex */
public final class C0923A extends MultiAutoCompleteTextView {

    /* renamed from: d */
    public static final int[] f3742d = {R.attr.popupBackground};

    /* renamed from: a */
    public final C1020p f3743a;

    /* renamed from: b */
    public final C0979b0 f3744b;

    /* renamed from: c */
    public final C0928C f3745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0923A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.nfupay.s145.R.attr.autoCompleteTextViewStyle);
        AbstractC1001i1.m2479a(context);
        AbstractC0998h1.m2474a(this, getContext());
        C0176h m519B = C0176h.m519B(getContext(), attributeSet, f3742d, com.nfupay.s145.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) m519B.f516c).hasValue(0)) {
            setDropDownBackgroundDrawable(m519B.m542q(0));
        }
        m519B.m523E();
        C1020p c1020p = new C1020p(this);
        this.f3743a = c1020p;
        c1020p.m2509d(attributeSet, com.nfupay.s145.R.attr.autoCompleteTextViewStyle);
        C0979b0 c0979b0 = new C0979b0(this);
        this.f3744b = c0979b0;
        c0979b0.m2451f(attributeSet, com.nfupay.s145.R.attr.autoCompleteTextViewStyle);
        c0979b0.m2448b();
        C0928C c0928c = new C0928C(this);
        this.f3745c = c0928c;
        c0928c.mo2378b(attributeSet, com.nfupay.s145.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener m2377a = c0928c.m2377a(keyListener);
        if (m2377a == keyListener) {
            return;
        }
        super.setKeyListener(m2377a);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1020p c1020p = this.f3743a;
        if (c1020p != null) {
            c1020p.m2506a();
        }
        C0979b0 c0979b0 = this.f3744b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1020p c1020p = this.f3743a;
        if (c1020p != null) {
            return c1020p.m2507b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1020p c1020p = this.f3743a;
        if (c1020p != null) {
            return c1020p.m2508c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3744b.m2449d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3744b.m2450e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0458e.m1175I(editorInfo, onCreateInputConnection, this);
        return this.f3745c.m2379c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1020p c1020p = this.f3743a;
        if (c1020p != null) {
            c1020p.m2510e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C1020p c1020p = this.f3743a;
        if (c1020p != null) {
            c1020p.m2511f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f3744b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f3744b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0104l.m415w(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3745c.m2380d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3745c.m2377a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1020p c1020p = this.f3743a;
        if (c1020p != null) {
            c1020p.m2513h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1020p c1020p = this.f3743a;
        if (c1020p != null) {
            c1020p.m2514i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0979b0 c0979b0 = this.f3744b;
        c0979b0.m2456l(colorStateList);
        c0979b0.m2448b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0979b0 c0979b0 = this.f3744b;
        c0979b0.m2457m(mode);
        c0979b0.m2448b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0979b0 c0979b0 = this.f3744b;
        if (c0979b0 != null) {
            c0979b0.m2452g(context, i2);
        }
    }
}
