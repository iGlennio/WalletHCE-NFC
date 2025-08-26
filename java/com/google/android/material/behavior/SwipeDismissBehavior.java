package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p030L.C0337d;
import p052T.C0483e;
import p088j.C0985d0;
import p117t0.C1230a;
import p127x.AbstractC1303a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC1303a {

    /* renamed from: a */
    public C0483e f2505a;

    /* renamed from: b */
    public boolean f2506b;

    /* renamed from: c */
    public boolean f2507c;

    /* renamed from: d */
    public int f2508d = 2;

    /* renamed from: e */
    public float f2509e = 0.0f;

    /* renamed from: f */
    public float f2510f = 0.5f;

    /* renamed from: g */
    public final C1230a f2511g = new C1230a(this);

    @Override // p127x.AbstractC1303a
    /* renamed from: j */
    public boolean mo1885j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f2506b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.m1464o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2506b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2506b = false;
        }
        if (z2) {
            if (this.f2505a == null) {
                this.f2505a = new C0483e(coordinatorLayout.getContext(), coordinatorLayout, this.f2511g);
            }
            if (!this.f2507c && this.f2505a.m1257r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: k */
    public final boolean mo1886k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3 = 1;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC0272P.m820j(view, 1048576);
            AbstractC0272P.m818h(view, 0);
            if (mo1901v(view)) {
                AbstractC0272P.m821k(view, C0337d.f884l, new C0985d0(i3, this));
            }
        }
        return false;
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: u */
    public final boolean mo1894u(View view, MotionEvent motionEvent) {
        if (this.f2505a == null) {
            return false;
        }
        if (this.f2507c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2505a.m1250k(motionEvent);
        return true;
    }

    /* renamed from: v */
    public boolean mo1901v(View view) {
        return true;
    }
}
