package p127x;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x.e */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1307e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f5360a;

    public ViewTreeObserverOnPreDrawListenerC1307e(CoordinatorLayout coordinatorLayout) {
        this.f5360a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f5360a.m1465p(0);
        return true;
    }
}
