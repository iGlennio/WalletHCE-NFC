package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.fragment.app.C0651y;
import com.nfupay.s145.R;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p108q0.AbstractC1183a;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C0702c {

    /* renamed from: a */
    public final C0651y f2630a;

    /* renamed from: b */
    public final C0651y f2631b;

    public C0702c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0096d.m339b0(context, R.attr.materialCalendarStyle, C0709j.class.getCanonicalName()).data, AbstractC1183a.f4533l);
        C0651y.m1679d(context, obtainStyledAttributes.getResourceId(4, 0));
        C0651y.m1679d(context, obtainStyledAttributes.getResourceId(2, 0));
        C0651y.m1679d(context, obtainStyledAttributes.getResourceId(3, 0));
        C0651y.m1679d(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList m413t = AbstractC0104l.m413t(context, obtainStyledAttributes, 7);
        this.f2630a = C0651y.m1679d(context, obtainStyledAttributes.getResourceId(9, 0));
        C0651y.m1679d(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2631b = C0651y.m1679d(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(m413t.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
