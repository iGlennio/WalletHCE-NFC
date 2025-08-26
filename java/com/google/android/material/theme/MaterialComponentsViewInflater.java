package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.nfupay.s145.R;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p014F0.AbstractC0128E;
import p022I0.C0216a;
import p043P0.C0429w;
import p045Q.AbstractC0435b;
import p046Q0.C0453a;
import p049R0.AbstractC0463a;
import p076e.C0800x;
import p088j.C0930D;
import p088j.C0991f0;
import p088j.C1017o;
import p088j.C1023q;
import p088j.C1026r;
import p108q0.AbstractC1183a;
import p131y0.C1320c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0800x {
    @Override // p076e.C0800x
    /* renamed from: a */
    public final C1017o mo2002a(Context context, AttributeSet attributeSet) {
        return new C0429w(context, attributeSet);
    }

    @Override // p076e.C0800x
    /* renamed from: b */
    public final C1023q mo2003b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p076e.C0800x
    /* renamed from: c */
    public final C1026r mo2004c(Context context, AttributeSet attributeSet) {
        return new C1320c(context, attributeSet);
    }

    @Override // p076e.C0800x
    /* renamed from: d */
    public final C0930D mo2005d(Context context, AttributeSet attributeSet) {
        C0216a c0216a = new C0216a(AbstractC0463a.m1220a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0216a.getContext();
        TypedArray m456f = AbstractC0128E.m456f(context2, attributeSet, AbstractC1183a.f4536o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (m456f.hasValue(0)) {
            AbstractC0435b.m1127c(c0216a, AbstractC0104l.m413t(context2, m456f, 0));
        }
        c0216a.f602f = m456f.getBoolean(1, false);
        m456f.recycle();
        return c0216a;
    }

    @Override // p076e.C0800x
    /* renamed from: e */
    public final C0991f0 mo2006e(Context context, AttributeSet attributeSet) {
        C0453a c0453a = new C0453a(AbstractC0463a.m1220a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0453a.getContext();
        if (AbstractC0096d.m338a0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC1183a.f4539r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int m1162g = C0453a.m1162g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m1162g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC1183a.f4538q);
                    int m1162g2 = C0453a.m1162g(c0453a.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (m1162g2 >= 0) {
                        c0453a.setLineHeight(m1162g2);
                    }
                }
            }
        }
        return c0453a;
    }
}
