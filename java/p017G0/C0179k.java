package p017G0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: G0.k */
/* loaded from: classes.dex */
public final class C0179k extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f522a;

    /* renamed from: b */
    public final /* synthetic */ int f523b;

    /* renamed from: c */
    public final /* synthetic */ C0180l f524c;

    public C0179k(C0180l c0180l, boolean z2, int i2) {
        this.f524c = c0180l;
        this.f522a = z2;
        this.f523b = i2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0180l c0180l = this.f524c;
        c0180l.f502b.setTranslationX(0.0f);
        c0180l.m556c(0.0f, this.f522a, this.f523b);
    }
}
