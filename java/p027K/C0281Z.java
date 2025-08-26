package p027K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p005C.C0041d;

/* renamed from: K.Z */
/* loaded from: classes.dex */
public final class C0281Z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0293f0 f776a;

    /* renamed from: b */
    public final /* synthetic */ C0319s0 f777b;

    /* renamed from: c */
    public final /* synthetic */ C0319s0 f778c;

    /* renamed from: d */
    public final /* synthetic */ int f779d;

    /* renamed from: e */
    public final /* synthetic */ View f780e;

    public C0281Z(C0293f0 c0293f0, C0319s0 c0319s0, C0319s0 c0319s02, int i2, View view) {
        this.f776a = c0293f0;
        this.f777b = c0319s0;
        this.f778c = c0319s02;
        this.f779d = i2;
        this.f780e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int i2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0293f0 c0293f0 = this.f776a;
        c0293f0.f806a.mo864d(animatedFraction);
        float mo862b = c0293f0.f806a.mo862b();
        PathInterpolator pathInterpolator = C0285b0.f787e;
        int i3 = Build.VERSION.SDK_INT;
        C0319s0 c0319s0 = this.f777b;
        AbstractC0303k0 c0301j0 = i3 >= 30 ? new C0301j0(c0319s0) : i3 >= 29 ? new C0299i0(c0319s0) : new C0297h0(c0319s0);
        int i4 = 1;
        while (i4 <= 256) {
            int i5 = this.f779d & i4;
            C0315q0 c0315q0 = c0319s0.f855a;
            if (i5 == 0) {
                c0301j0.mo879c(i4, c0315q0.mo900f(i4));
                f = mo862b;
                i2 = 1;
            } else {
                C0041d mo900f = c0315q0.mo900f(i4);
                C0041d mo900f2 = this.f778c.f855a.mo900f(i4);
                float f2 = 1.0f - mo862b;
                f = mo862b;
                i2 = 1;
                c0301j0.mo879c(i4, C0319s0.m935e(mo900f, (int) (((mo900f.f107a - mo900f2.f107a) * f2) + 0.5d), (int) (((mo900f.f108b - mo900f2.f108b) * f2) + 0.5d), (int) (((mo900f.f109c - mo900f2.f109c) * f2) + 0.5d), (int) (((mo900f.f110d - mo900f2.f110d) * f2) + 0.5d)));
            }
            i4 <<= i2;
            mo862b = f;
        }
        C0285b0.m855g(this.f780e, c0301j0.mo867b(), Collections.singletonList(c0293f0));
    }
}
