package p079f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e */
/* loaded from: classes.dex */
public final class C0838e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3341a;

    /* renamed from: b */
    public final /* synthetic */ C0840f f3342b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3343c;

    /* renamed from: d */
    public final /* synthetic */ View f3344d;

    /* renamed from: e */
    public final /* synthetic */ C0844h f3345e;

    public /* synthetic */ C0838e(C0844h c0844h, C0840f c0840f, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.f3341a = i2;
        this.f3345e = c0844h;
        this.f3342b = c0840f;
        this.f3343c = viewPropertyAnimator;
        this.f3344d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3341a) {
            case 0:
                this.f3343c.setListener(null);
                View view = this.f3344d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0840f c0840f = this.f3342b;
                AbstractC0827X abstractC0827X = c0840f.f3352a;
                C0844h c0844h = this.f3345e;
                c0844h.m2156c(abstractC0827X);
                c0844h.f3384r.remove(c0840f.f3352a);
                c0844h.m2243i();
                break;
            default:
                this.f3343c.setListener(null);
                View view2 = this.f3344d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0840f c0840f2 = this.f3342b;
                AbstractC0827X abstractC0827X2 = c0840f2.f3353b;
                C0844h c0844h2 = this.f3345e;
                c0844h2.m2156c(abstractC0827X2);
                c0844h2.f3384r.remove(c0840f2.f3353b);
                c0844h2.m2243i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3341a) {
            case 0:
                AbstractC0827X abstractC0827X = this.f3342b.f3352a;
                this.f3345e.getClass();
                break;
            default:
                AbstractC0827X abstractC0827X2 = this.f3342b.f3353b;
                this.f3345e.getClass();
                break;
        }
    }
}
