package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p047Q1.AbstractC0458e;
import p111r0.AbstractC1188a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a */
    public TextView f2786a;

    /* renamed from: b */
    public Button f2787b;

    /* renamed from: c */
    public int f2788c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0458e.m1180T(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1188a.f4553b);
    }

    /* renamed from: a */
    public final boolean m1977a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2786a.getPaddingTop() == i3 && this.f2786a.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.f2786a;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f2787b;
    }

    public TextView getMessageView() {
        return this.f2786a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2786a = (TextView) findViewById(R.id.snackbar_text);
        this.f2787b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f2786a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f2788c <= 0 || this.f2787b.getMeasuredWidth() <= this.f2788c) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m1977a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m1977a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f2788c = i2;
    }
}
