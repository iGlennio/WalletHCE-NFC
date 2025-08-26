package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p127x.AbstractC1303a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC1303a {
    public ExpandableBehavior() {
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: f */
    public abstract void mo1896f(View view);

    @Override // p127x.AbstractC1303a
    /* renamed from: h */
    public final boolean mo1897h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: k */
    public final boolean mo1886k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (!view.isLaidOut()) {
            ArrayList m1461j = coordinatorLayout.m1461j(view);
            int size = m1461j.size();
            for (int i3 = 0; i3 < size; i3++) {
                mo1896f(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
