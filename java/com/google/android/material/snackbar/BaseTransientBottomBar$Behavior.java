package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p005C.C0046i;
import p034M0.C0360e;
import p040O0.AbstractC0394c;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C0360e f2785h;

    public BaseTransientBottomBar$Behavior() {
        C0360e c0360e = new C0360e(7);
        this.f2509e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2510f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2508d = 0;
        this.f2785h = c0360e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p127x.AbstractC1303a
    /* renamed from: j */
    public final boolean mo1885j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2785h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0046i.f114c == null) {
                    C0046i.f114c = new C0046i(6);
                }
                synchronized (C0046i.f114c.f116b) {
                }
            }
        } else if (coordinatorLayout.m1464o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0046i.f114c == null) {
                C0046i.f114c = new C0046i(6);
            }
            synchronized (C0046i.f114c.f116b) {
            }
        }
        return super.mo1885j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: v */
    public final boolean mo1901v(View view) {
        this.f2785h.getClass();
        return view instanceof AbstractC0394c;
    }
}
