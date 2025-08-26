package p079f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.j */
/* loaded from: classes.dex */
public final class C0846j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f3386a = false;

    /* renamed from: b */
    public final /* synthetic */ C0847k f3387b;

    public C0846j(C0847k c0847k) {
        this.f3387b = c0847k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3386a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3386a) {
            this.f3386a = false;
            return;
        }
        C0847k c0847k = this.f3387b;
        if (((Float) c0847k.f3417z.getAnimatedValue()).floatValue() == 0.0f) {
            c0847k.f3390A = 0;
            c0847k.m2250f(0);
        } else {
            c0847k.f3390A = 2;
            c0847k.f3410s.invalidate();
        }
    }
}
