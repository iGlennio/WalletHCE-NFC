package p079f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.c */
/* loaded from: classes.dex */
public final class C0834c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3316a = 1;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0827X f3317b;

    /* renamed from: c */
    public final /* synthetic */ View f3318c;

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f3319d;

    /* renamed from: e */
    public final /* synthetic */ C0844h f3320e;

    public C0834c(C0844h c0844h, AbstractC0827X abstractC0827X, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3320e = c0844h;
        this.f3317b = abstractC0827X;
        this.f3319d = viewPropertyAnimator;
        this.f3318c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3316a) {
            case 1:
                this.f3318c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3316a) {
            case 0:
                this.f3319d.setListener(null);
                this.f3318c.setAlpha(1.0f);
                C0844h c0844h = this.f3320e;
                AbstractC0827X abstractC0827X = this.f3317b;
                c0844h.m2156c(abstractC0827X);
                c0844h.f3383q.remove(abstractC0827X);
                c0844h.m2243i();
                break;
            default:
                this.f3319d.setListener(null);
                C0844h c0844h2 = this.f3320e;
                AbstractC0827X abstractC0827X2 = this.f3317b;
                c0844h2.m2156c(abstractC0827X2);
                c0844h2.f3381o.remove(abstractC0827X2);
                c0844h2.m2243i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3316a) {
            case 0:
                this.f3320e.getClass();
                break;
            default:
                this.f3320e.getClass();
                break;
        }
    }

    public C0834c(C0844h c0844h, AbstractC0827X abstractC0827X, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3320e = c0844h;
        this.f3317b = abstractC0827X;
        this.f3318c = view;
        this.f3319d = viewPropertyAnimator;
    }
}
