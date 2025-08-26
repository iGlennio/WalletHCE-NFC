package p089j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.nfupay.s145.R;

/* renamed from: j0.E */
/* loaded from: classes.dex */
public final class C1057E extends AnimatorListenerAdapter implements InterfaceC1069k {

    /* renamed from: a */
    public final ViewGroup f4136a;

    /* renamed from: b */
    public final View f4137b;

    /* renamed from: c */
    public final View f4138c;

    /* renamed from: d */
    public boolean f4139d = true;

    /* renamed from: e */
    public final /* synthetic */ C1066h f4140e;

    public C1057E(C1066h c1066h, ViewGroup viewGroup, View view, View view2) {
        this.f4140e = c1066h;
        this.f4136a = viewGroup;
        this.f4137b = view;
        this.f4138c = view2;
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: a */
    public final void mo2551a(AbstractC1071m abstractC1071m) {
        if (this.f4139d) {
            m2557g();
        }
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: d */
    public final void mo2554d(AbstractC1071m abstractC1071m) {
        abstractC1071m.mo2573x(this);
    }

    /* renamed from: g */
    public final void m2557g() {
        this.f4138c.setTag(R.id.save_overlay_view, null);
        this.f4136a.getOverlay().remove(this.f4137b);
        this.f4139d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m2557g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f4136a.getOverlay().remove(this.f4137b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f4137b;
        if (view.getParent() == null) {
            this.f4136a.getOverlay().add(view);
        } else {
            this.f4140e.mo2566c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f4138c;
            View view2 = this.f4137b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f4136a.getOverlay().add(view2);
            this.f4139d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        m2557g();
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: c */
    public final void mo2553c(AbstractC1071m abstractC1071m) {
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: b */
    public final void mo2552b() {
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: e */
    public final void mo2555e() {
    }
}
