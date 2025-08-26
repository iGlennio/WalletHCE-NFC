package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p014F0.C0133a;
import p014F0.C0135c;
import p027K.AbstractC0272P;
import p088j.C1047y;

/* loaded from: classes.dex */
public class CheckableImageButton extends C1047y implements Checkable {

    /* renamed from: g */
    public static final int[] f2728g = {R.attr.state_checked};

    /* renamed from: d */
    public boolean f2729d;

    /* renamed from: e */
    public boolean f2730e;

    /* renamed from: f */
    public boolean f2731f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.nfupay.s145.R.attr.imageButtonStyle);
        this.f2730e = true;
        this.f2731f = true;
        AbstractC0272P.m823m(this, new C0133a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2729d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.f2729d ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f2728g) : super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0135c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0135c c0135c = (C0135c) parcelable;
        super.onRestoreInstanceState(c0135c.f1273a);
        setChecked(c0135c.f362c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0135c c0135c = new C0135c(super.onSaveInstanceState());
        c0135c.f362c = this.f2729d;
        return c0135c;
    }

    public void setCheckable(boolean z2) {
        if (this.f2730e != z2) {
            this.f2730e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f2730e || this.f2729d == z2) {
            return;
        }
        this.f2729d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f2731f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f2731f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2729d);
    }
}
