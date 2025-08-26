package p088j;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p005C.AbstractC0047j;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p021I.AbstractC0212g;
import p021I.C0211f;
import p045Q.AbstractC0447n;
import p047Q1.AbstractC0458e;

/* renamed from: j.f0 */
/* loaded from: classes.dex */
public class C0991f0 extends TextView {

    /* renamed from: a */
    public final C1020p f3915a;

    /* renamed from: b */
    public final C0979b0 f3916b;

    /* renamed from: c */
    public final C0928C f3917c;

    /* renamed from: d */
    public C1044x f3918d;

    /* renamed from: e */
    public boolean f3919e;

    /* renamed from: f */
    public C0985d0 f3920f;

    /* renamed from: g */
    public Future f3921g;

    public C0991f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1044x getEmojiTextViewHelper() {
        if (this.f3918d == null) {
            this.f3918d = new C1044x(this);
        }
        return this.f3918d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1020p c1020p = this.f3915a;
        if (c1020p != null) {
            c1020p.m2506a();
        }
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    /* renamed from: f */
    public final void m2466f() {
        Future future = this.f3921g;
        if (future == null) {
            return;
        }
        try {
            this.f3921g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0458e.m1170D(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0925A1.f3756b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            return Math.round(c0979b0.f3896i.f4000e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0925A1.f3756b) {
            return super.getAutoSizeMinTextSize();
        }
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            return Math.round(c0979b0.f3896i.f3999d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0925A1.f3756b) {
            return super.getAutoSizeStepGranularity();
        }
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            return Math.round(c0979b0.f3896i.f3998c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0925A1.f3756b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0979b0 c0979b0 = this.f3916b;
        return c0979b0 != null ? c0979b0.f3896i.f4001f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0925A1.f3756b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            return c0979b0.f3896i.f3996a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0458e.m1185c0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0982c0 getSuperCaller() {
        if (this.f3920f == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                this.f3920f = new C0988e0(this);
            } else if (i2 >= 26) {
                this.f3920f = new C0985d0(0, this);
            }
        }
        return this.f3920f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1020p c1020p = this.f3915a;
        if (c1020p != null) {
            return c1020p.m2507b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1020p c1020p = this.f3915a;
        if (c1020p != null) {
            return c1020p.m2508c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3916b.m2449d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3916b.m2450e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m2466f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0928C c0928c;
        if (Build.VERSION.SDK_INT >= 28 || (c0928c = this.f3917c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0928c.f3760c;
        return textClassifier == null ? AbstractC0963U.m2434a((TextView) c0928c.f3759b) : textClassifier;
    }

    public C0211f getTextMetricsParamsCompat() {
        return AbstractC0458e.m1170D(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3916b.getClass();
        C0979b0.m2446h(editorInfo, onCreateInputConnection, this);
        AbstractC0458e.m1175I(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 == null || AbstractC0925A1.f3756b) {
            return;
        }
        c0979b0.f3896i.m2494a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        m2466f();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 == null || AbstractC0925A1.f3756b) {
            return;
        }
        C1012m0 c1012m0 = c0979b0.f3896i;
        if (c1012m0.m2496f()) {
            c1012m0.m2494a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2543b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (AbstractC0925A1.f3756b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2453i(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (AbstractC0925A1.f3756b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2454j(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (AbstractC0925A1.f3756b) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2455k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1020p c1020p = this.f3915a;
        if (c1020p != null) {
            c1020p.m2510e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C1020p c1020p = this.f3915a;
        if (c1020p != null) {
            c1020p.m2511f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0458e.m1186d0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2544c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0458e) getEmojiTextViewHelper().f4097b.f116b).mo1209B(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo2459a(i2);
        } else {
            AbstractC0458e.m1181Y(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo2460e(i2);
        } else {
            AbstractC0458e.m1182Z(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        AbstractC0458e.m1191i(i2);
        if (i2 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(AbstractC0212g abstractC0212g) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0458e.m1170D(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1020p c1020p = this.f3915a;
        if (c1020p != null) {
            c1020p.m2513h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1020p c1020p = this.f3915a;
        if (c1020p != null) {
            c1020p.m2514i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0979b0 c0979b0 = this.f3916b;
        c0979b0.m2456l(colorStateList);
        c0979b0.m2448b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0979b0 c0979b0 = this.f3916b;
        c0979b0.m2457m(mode);
        c0979b0.m2448b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2452g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0928C c0928c;
        if (Build.VERSION.SDK_INT >= 28 || (c0928c = this.f3917c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0928c.f3760c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0212g> future) {
        this.f3921g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0211f c0211f) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0211f.f590b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(c0211f.f589a);
        AbstractC0447n.m1152e(this, c0211f.f591c);
        AbstractC0447n.m1155h(this, c0211f.f592d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        boolean z2 = AbstractC0925A1.f3756b;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 == null || z2) {
            return;
        }
        C1012m0 c1012m0 = c0979b0.f3896i;
        if (c1012m0.m2496f()) {
            return;
        }
        c1012m0.m2497g(i2, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (this.f3919e) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC0096d abstractC0096d = AbstractC0047j.f117a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i2);
        }
        this.f3919e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f3919e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0991f0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC1001i1.m2479a(context);
        this.f3919e = false;
        this.f3920f = null;
        AbstractC0998h1.m2474a(this, getContext());
        C1020p c1020p = new C1020p(this);
        this.f3915a = c1020p;
        c1020p.m2509d(attributeSet, i2);
        C0979b0 c0979b0 = new C0979b0(this);
        this.f3916b = c0979b0;
        c0979b0.m2451f(attributeSet, i2);
        c0979b0.m2448b();
        C0928C c0928c = new C0928C();
        c0928c.f3759b = this;
        this.f3917c = c0928c;
        getEmojiTextViewHelper().m2542a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0104l.m415w(context, i2) : null, i3 != 0 ? AbstractC0104l.m415w(context, i3) : null, i4 != 0 ? AbstractC0104l.m415w(context, i4) : null, i5 != 0 ? AbstractC0104l.m415w(context, i5) : null);
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0104l.m415w(context, i2) : null, i3 != 0 ? AbstractC0104l.m415w(context, i3) : null, i4 != 0 ? AbstractC0104l.m415w(context, i4) : null, i5 != 0 ? AbstractC0104l.m415w(context, i5) : null);
        C0979b0 c0979b0 = this.f3916b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }
}
