package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p010D1.AbstractC0104l;
import p027K.AbstractC0272P;
import p108q0.AbstractC1183a;
import p114s0.AbstractC1210a;
import p127x.AbstractC1303a;
import p127x.C1306d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1210a {

    /* renamed from: b */
    public final int f2490b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* renamed from: w */
    public static void m1895w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
        }
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: h */
    public boolean mo1897h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1303a abstractC1303a = ((C1306d) view2.getLayoutParams()).f5345a;
        if (abstractC1303a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC1303a).getClass();
            int i2 = this.f2490b;
            int m403h = bottom - (i2 == 0 ? 0 : AbstractC0104l.m403h((int) (0.0f * i2), 0, i2));
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            view.offsetTopAndBottom(m403h);
        }
        return false;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: l */
    public final boolean mo1887l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        m1895w(coordinatorLayout.m1461j(view));
        return false;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: p */
    public final void mo1898p(CoordinatorLayout coordinatorLayout, View view) {
        m1895w(coordinatorLayout.m1461j(view));
    }

    @Override // p114s0.AbstractC1210a
    /* renamed from: v */
    public final void mo1899v(CoordinatorLayout coordinatorLayout, View view, int i2) {
        m1895w(coordinatorLayout.m1461j(view));
        coordinatorLayout.m1466q(view, i2);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1183a.f4544w);
        this.f2490b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: f */
    public final void mo1896f(View view) {
    }
}
