package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p043P0.RunnableC0402A;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0630d implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2160a;

    /* renamed from: b */
    public final /* synthetic */ View f2161b;

    /* renamed from: c */
    public final /* synthetic */ C0631e f2162c;

    public AnimationAnimationListenerC0630d(View view, ViewGroup viewGroup, C0631e c0631e) {
        this.f2160a = viewGroup;
        this.f2161b = view;
        this.f2162c = c0631e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2160a.post(new RunnableC0402A(5, this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
