package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p014F0.RunnableC0130G;
import p027K.AbstractC0272P;
import p034M0.C0362g;
import p034M0.C0363h;
import p034M0.C0365j;
import p108q0.AbstractC1183a;

/* renamed from: com.google.android.material.timepicker.e */
/* loaded from: classes.dex */
public abstract class AbstractC0729e extends ConstraintLayout {

    /* renamed from: s */
    public final RunnableC0130G f2904s;

    /* renamed from: t */
    public int f2905t;

    /* renamed from: u */
    public final C0362g f2906u;

    public AbstractC0729e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0362g c0362g = new C0362g();
        this.f2906u = c0362g;
        C0363h c0363h = new C0363h(0.5f);
        C0365j m1037e = c0362g.f931a.f914a.m1037e();
        m1037e.f958e = c0363h;
        m1037e.f959f = c0363h;
        m1037e.f960g = c0363h;
        m1037e.f961h = c0363h;
        c0362g.setShapeAppearanceModel(m1037e.m1032a());
        this.f2906u.m1027j(ColorStateList.valueOf(-1));
        C0362g c0362g2 = this.f2906u;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setBackground(c0362g2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1183a.f4542u, R.attr.materialClockStyle, 0);
        this.f2905t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2904s = new RunnableC0130G(11, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0130G runnableC0130G = this.f2904s;
            handler.removeCallbacks(runnableC0130G);
            handler.post(runnableC0130G);
        }
    }

    /* renamed from: m */
    public abstract void mo2008m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo2008m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0130G runnableC0130G = this.f2904s;
            handler.removeCallbacks(runnableC0130G);
            handler.post(runnableC0130G);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.f2906u.m1027j(ColorStateList.valueOf(i2));
    }
}
