package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p108q0.AbstractC1183a;
import p127x.AbstractC1303a;
import p127x.C1306d;

/* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* loaded from: classes.dex */
public class C0724xe6e79f6<T> extends AbstractC1303a {
    public C0724xe6e79f6() {
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: e */
    public final /* synthetic */ boolean mo1965e(View view) {
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: g */
    public final void mo1916g(C1306d c1306d) {
        if (c1306d.f5352h == 0) {
            c1306d.f5352h = 80;
        }
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: h */
    public final boolean mo1897h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: k */
    public final boolean mo1886k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    public C0724xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1183a.f4527f);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
