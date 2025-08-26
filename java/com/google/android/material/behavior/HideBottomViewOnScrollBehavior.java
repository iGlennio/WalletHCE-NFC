package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nfupay.s145.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p005C.AbstractC0044g;
import p017G0.C0177i;
import p047Q1.AbstractC0458e;
import p111r0.AbstractC1188a;
import p127x.AbstractC1303a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC1303a {

    /* renamed from: b */
    public int f2498b;

    /* renamed from: c */
    public int f2499c;

    /* renamed from: d */
    public TimeInterpolator f2500d;

    /* renamed from: e */
    public TimeInterpolator f2501e;

    /* renamed from: h */
    public ViewPropertyAnimator f2504h;

    /* renamed from: a */
    public final LinkedHashSet f2497a = new LinkedHashSet();

    /* renamed from: f */
    public int f2502f = 0;

    /* renamed from: g */
    public int f2503g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: k */
    public boolean mo1886k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f2502f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2498b = AbstractC0458e.m1179S(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2499c = AbstractC0458e.m1179S(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2500d = AbstractC0458e.m1180T(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1188a.f4555d);
        this.f2501e = AbstractC0458e.m1180T(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1188a.f4554c);
        return false;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: o */
    public final void mo1889o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2497a;
        if (i2 > 0) {
            if (this.f2503g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f2504h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2503g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC0044g.m152d(it);
            }
            this.f2504h = view.animate().translationY(this.f2502f).setInterpolator(this.f2501e).setDuration(this.f2499c).setListener(new C0177i(7, this));
            return;
        }
        if (i2 >= 0 || this.f2503g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f2504h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2503g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw AbstractC0044g.m152d(it2);
        }
        this.f2504h = view.animate().translationY(0).setInterpolator(this.f2500d).setDuration(this.f2498b).setListener(new C0177i(7, this));
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: s */
    public boolean mo1892s(View view, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
