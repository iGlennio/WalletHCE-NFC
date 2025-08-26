package p089j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p047Q1.AbstractC0458e;

/* renamed from: j0.D */
/* loaded from: classes.dex */
public final class C1056D extends AnimatorListenerAdapter implements InterfaceC1069k {

    /* renamed from: a */
    public final View f4130a;

    /* renamed from: b */
    public final int f4131b;

    /* renamed from: c */
    public final ViewGroup f4132c;

    /* renamed from: e */
    public boolean f4134e;

    /* renamed from: f */
    public boolean f4135f = false;

    /* renamed from: d */
    public final boolean f4133d = true;

    public C1056D(View view, int i2) {
        this.f4130a = view;
        this.f4131b = i2;
        this.f4132c = (ViewGroup) view.getParent();
        m2556g(true);
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: b */
    public final void mo2552b() {
        m2556g(false);
        if (this.f4135f) {
            return;
        }
        AbstractC1081w.m2606b(this.f4130a, this.f4131b);
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: d */
    public final void mo2554d(AbstractC1071m abstractC1071m) {
        abstractC1071m.mo2573x(this);
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: e */
    public final void mo2555e() {
        m2556g(true);
        if (this.f4135f) {
            return;
        }
        AbstractC1081w.m2606b(this.f4130a, 0);
    }

    /* renamed from: g */
    public final void m2556g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f4133d || this.f4134e == z2 || (viewGroup = this.f4132c) == null) {
            return;
        }
        this.f4134e = z2;
        AbstractC0458e.m1184b0(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4135f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f4135f) {
            AbstractC1081w.m2606b(this.f4130a, this.f4131b);
            ViewGroup viewGroup = this.f4132c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2556g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            AbstractC1081w.m2606b(this.f4130a, 0);
            ViewGroup viewGroup = this.f4132c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.f4135f) {
            AbstractC1081w.m2606b(this.f4130a, this.f4131b);
            ViewGroup viewGroup = this.f4132c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2556g(false);
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: a */
    public final void mo2551a(AbstractC1071m abstractC1071m) {
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: c */
    public final void mo2553c(AbstractC1071m abstractC1071m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
