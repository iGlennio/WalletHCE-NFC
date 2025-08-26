package p089j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.nfupay.s145.R;

/* renamed from: j0.g */
/* loaded from: classes.dex */
public final class C1065g extends AnimatorListenerAdapter implements InterfaceC1069k {

    /* renamed from: a */
    public final View f4168a;

    /* renamed from: b */
    public boolean f4169b = false;

    public C1065g(View view) {
        this.f4168a = view;
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: b */
    public final void mo2552b() {
        View view = this.f4168a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC1081w.f4222a.mo361I(view) : 0.0f));
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: e */
    public final void mo2555e() {
        this.f4168a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC1081w.f4222a.mo369f0(this.f4168a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f4168a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f4169b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f4169b;
        View view = this.f4168a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C1054B c1054b = AbstractC1081w.f4222a;
        c1054b.mo369f0(view, 1.0f);
        c1054b.getClass();
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: a */
    public final void mo2551a(AbstractC1071m abstractC1071m) {
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: c */
    public final void mo2553c(AbstractC1071m abstractC1071m) {
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: d */
    public final void mo2554d(AbstractC1071m abstractC1071m) {
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: f */
    public final void mo2579f(AbstractC1071m abstractC1071m) {
    }
}
