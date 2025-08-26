package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p114s0.AbstractC1210a;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC1210a {

    /* renamed from: b */
    public boolean f2485b;

    /* renamed from: d */
    public int f2487d;

    /* renamed from: f */
    public VelocityTracker f2489f;

    /* renamed from: c */
    public int f2486c = -1;

    /* renamed from: e */
    public int f2488e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: j */
    public final boolean mo1885j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f2488e < 0) {
            this.f2488e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2485b) {
            int i2 = this.f2486c;
            if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                int y2 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y2 - this.f2487d) > this.f2488e) {
                    this.f2487d = y2;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f2489f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f2486c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // p114s0.AbstractC1210a, p127x.AbstractC1303a
    /* renamed from: k */
    public final boolean mo1886k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: l */
    public final boolean mo1887l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: n */
    public final /* synthetic */ void mo1888n(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: o */
    public final void mo1889o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: q */
    public final void mo1890q(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: r */
    public final Parcelable mo1891r(View view) {
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: s */
    public final boolean mo1892s(View view, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p127x.AbstractC1303a
    /* renamed from: t */
    public final void mo1893t(View view, View view2, int i2) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[RETURN] */
    @Override // p127x.AbstractC1303a
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1894u(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L46
            r4 = 2
            if (r0 == r4) goto L2d
            r6 = 3
            if (r0 == r6) goto L4a
            r6 = 6
            if (r0 == r6) goto L13
            goto L58
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1b
            r6 = r2
            goto L1c
        L1b:
            r6 = r3
        L1c:
            int r0 = r7.getPointerId(r6)
            r5.f2486c = r0
            float r6 = r7.getY(r6)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.f2487d = r6
            goto L58
        L2d:
            int r0 = r5.f2486c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L36
            goto L63
        L36:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.f2487d = r7
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        L46:
            android.view.VelocityTracker r0 = r5.f2489f
            if (r0 != 0) goto L65
        L4a:
            r5.f2485b = r3
            r5.f2486c = r1
            android.view.VelocityTracker r6 = r5.f2489f
            if (r6 == 0) goto L58
            r6.recycle()
            r6 = 0
            r5.f2489f = r6
        L58:
            android.view.VelocityTracker r6 = r5.f2489f
            if (r6 == 0) goto L5f
            r6.addMovement(r7)
        L5f:
            boolean r6 = r5.f2485b
            if (r6 != 0) goto L64
        L63:
            return r3
        L64:
            return r2
        L65:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f2489f
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f2489f
            int r0 = r5.f2486c
            r7.getYVelocity(r0)
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.mo1894u(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
