package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0646t implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0620J f2259a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0647u f2260b;

    public ViewOnAttachStateChangeListenerC0646t(LayoutInflaterFactory2C0647u layoutInflaterFactory2C0647u, C0620J c0620j) {
        this.f2260b = layoutInflaterFactory2C0647u;
        this.f2259a = c0620j;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0620J c0620j = this.f2259a;
        c0620j.m1620k();
        C0634h.m1645f((ViewGroup) c0620j.f2096c.f2207E.getParent(), this.f2260b.f2261a.m1563C()).m1650e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
