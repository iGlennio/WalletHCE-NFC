package p088j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p047Q1.AbstractC0458e;

/* renamed from: j.q */
/* loaded from: classes.dex */
public class C1023q extends Button {

    /* renamed from: a */
    public final C1020p f4026a;

    /* renamed from: b */
    public final C0979b0 f4027b;

    /* renamed from: c */
    public C1044x f4028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023q(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC1001i1.m2479a(context);
        AbstractC0998h1.m2474a(this, getContext());
        C1020p c1020p = new C1020p(this);
        this.f4026a = c1020p;
        c1020p.m2509d(attributeSet, i2);
        C0979b0 c0979b0 = new C0979b0(this);
        this.f4027b = c0979b0;
        c0979b0.m2451f(attributeSet, i2);
        c0979b0.m2448b();
        getEmojiTextViewHelper().m2542a(attributeSet, i2);
    }

    private C1044x getEmojiTextViewHelper() {
        if (this.f4028c == null) {
            this.f4028c = new C1044x(this);
        }
        return this.f4028c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1020p c1020p = this.f4026a;
        if (c1020p != null) {
            c1020p.m2506a();
        }
        C0979b0 c0979b0 = this.f4027b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0925A1.f3756b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0979b0 c0979b0 = this.f4027b;
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
        C0979b0 c0979b0 = this.f4027b;
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
        C0979b0 c0979b0 = this.f4027b;
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
        C0979b0 c0979b0 = this.f4027b;
        return c0979b0 != null ? c0979b0.f3896i.f4001f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0925A1.f3756b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0979b0 c0979b0 = this.f4027b;
        if (c0979b0 != null) {
            return c0979b0.f3896i.f3996a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0458e.m1185c0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1020p c1020p = this.f4026a;
        if (c1020p != null) {
            return c1020p.m2507b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1020p c1020p = this.f4026a;
        if (c1020p != null) {
            return c1020p.m2508c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4027b.m2449d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4027b.m2450e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0979b0 c0979b0 = this.f4027b;
        if (c0979b0 == null || AbstractC0925A1.f3756b) {
            return;
        }
        c0979b0.f3896i.m2494a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0979b0 c0979b0 = this.f4027b;
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
        C0979b0 c0979b0 = this.f4027b;
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
        C0979b0 c0979b0 = this.f4027b;
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
        C0979b0 c0979b0 = this.f4027b;
        if (c0979b0 != null) {
            c0979b0.m2455k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1020p c1020p = this.f4026a;
        if (c1020p != null) {
            c1020p.m2510e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C1020p c1020p = this.f4026a;
        if (c1020p != null) {
            c1020p.m2511f(i2);
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

    public void setSupportAllCaps(boolean z2) {
        C0979b0 c0979b0 = this.f4027b;
        if (c0979b0 != null) {
            c0979b0.f3888a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1020p c1020p = this.f4026a;
        if (c1020p != null) {
            c1020p.m2513h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1020p c1020p = this.f4026a;
        if (c1020p != null) {
            c1020p.m2514i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0979b0 c0979b0 = this.f4027b;
        c0979b0.m2456l(colorStateList);
        c0979b0.m2448b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0979b0 c0979b0 = this.f4027b;
        c0979b0.m2457m(mode);
        c0979b0.m2448b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0979b0 c0979b0 = this.f4027b;
        if (c0979b0 != null) {
            c0979b0.m2452g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        boolean z2 = AbstractC0925A1.f3756b;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        C0979b0 c0979b0 = this.f4027b;
        if (c0979b0 == null || z2) {
            return;
        }
        C1012m0 c1012m0 = c0979b0.f3896i;
        if (c1012m0.m2496f()) {
            return;
        }
        c1012m0.m2497g(i2, f);
    }
}
