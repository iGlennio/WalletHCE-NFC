package p019H0;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import p005C.AbstractC0038a;
import p005C.C0046i;
import p043P0.C0417k;
import p076e.C0776H;
import p111r0.AbstractC1188a;

/* renamed from: H0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0195a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f566a;

    /* renamed from: b */
    public final /* synthetic */ Object f567b;

    public /* synthetic */ C0195a(int i2, Object obj) {
        this.f566a = i2;
        this.f567b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f566a) {
            case 0:
                ((DrawerLayout) this.f567b).setScrimColor(AbstractC0038a.m112d(-1728053248, AbstractC1188a.m2749c(AbstractC0197c.f571a, 0, valueAnimator.getAnimatedFraction())));
                break;
            case 1:
                ((View) ((C0776H) ((C0046i) this.f567b).f116b).f3032q.getParent()).invalidate();
                break;
            default:
                C0417k c0417k = (C0417k) this.f567b;
                c0417k.getClass();
                c0417k.f1139d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0195a(C0046i c0046i, View view) {
        this.f566a = 1;
        this.f567b = c0046i;
    }
}
