package p043P0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import p034M0.C0361f;
import p034M0.C0362g;
import p079f0.C0847k;

/* renamed from: P0.B */
/* loaded from: classes.dex */
public final class C0403B implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f1064a;

    /* renamed from: b */
    public final /* synthetic */ Object f1065b;

    public /* synthetic */ C0403B(int i2, Object obj) {
        this.f1064a = i2;
        this.f1065b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1064a) {
            case 0:
                ((TextInputLayout) this.f1065b).f2860v0.m470k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0847k c0847k = (C0847k) this.f1065b;
                c0847k.f3394c.setAlpha(floatValue);
                c0847k.f3395d.setAlpha(floatValue);
                c0847k.f3410s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0362g c0362g = ((BottomSheetBehavior) this.f1065b).f2551i;
                if (c0362g != null) {
                    C0361f c0361f = c0362g.f931a;
                    if (c0361f.f922i != floatValue2) {
                        c0361f.f922i = floatValue2;
                        c0362g.f935e = true;
                        c0362g.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
