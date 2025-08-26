package p043P0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: P0.d */
/* loaded from: classes.dex */
public final class C0410d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f1075a;

    /* renamed from: b */
    public final /* synthetic */ C0411e f1076b;

    public /* synthetic */ C0410d(C0411e c0411e, int i2) {
        this.f1075a = i2;
        this.f1076b = c0411e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1075a) {
            case 1:
                this.f1076b.f1137b.m1096h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1075a) {
            case 0:
                this.f1076b.f1137b.m1096h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
