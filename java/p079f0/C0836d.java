package p079f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d */
/* loaded from: classes.dex */
public final class C0836d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0827X f3325a;

    /* renamed from: b */
    public final /* synthetic */ int f3326b;

    /* renamed from: c */
    public final /* synthetic */ View f3327c;

    /* renamed from: d */
    public final /* synthetic */ int f3328d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f3329e;

    /* renamed from: f */
    public final /* synthetic */ C0844h f3330f;

    public C0836d(C0844h c0844h, AbstractC0827X abstractC0827X, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3330f = c0844h;
        this.f3325a = abstractC0827X;
        this.f3326b = i2;
        this.f3327c = view;
        this.f3328d = i3;
        this.f3329e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i2 = this.f3326b;
        View view = this.f3327c;
        if (i2 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3328d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3329e.setListener(null);
        C0844h c0844h = this.f3330f;
        AbstractC0827X abstractC0827X = this.f3325a;
        c0844h.m2156c(abstractC0827X);
        c0844h.f3382p.remove(abstractC0827X);
        c0844h.m2243i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3330f.getClass();
    }
}
