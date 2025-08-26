package p027K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.t */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0320t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f856a;

    /* renamed from: b */
    public ViewTreeObserver f857b;

    /* renamed from: c */
    public final Runnable f858c;

    public ViewTreeObserverOnPreDrawListenerC0320t(View view, Runnable runnable) {
        this.f856a = view;
        this.f857b = view.getViewTreeObserver();
        this.f858c = runnable;
    }

    /* renamed from: a */
    public static void m942a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0320t viewTreeObserverOnPreDrawListenerC0320t = new ViewTreeObserverOnPreDrawListenerC0320t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0320t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0320t);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f857b.isAlive();
        View view = this.f856a;
        if (isAlive) {
            this.f857b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f858c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f857b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f857b.isAlive();
        View view2 = this.f856a;
        if (isAlive) {
            this.f857b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
