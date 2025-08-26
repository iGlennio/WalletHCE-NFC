package p017G0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.nfupay.s145.R;
import p064Z.C0549a;
import p111r0.AbstractC1188a;

/* renamed from: G0.j */
/* loaded from: classes.dex */
public final class C0178j extends AbstractC0169a {

    /* renamed from: g */
    public final float f520g;

    /* renamed from: h */
    public final float f521h;

    public C0178j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f520g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f521h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    /* renamed from: a */
    public final AnimatorSet m552a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f502b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C0549a(1));
        return animatorSet;
    }

    /* renamed from: b */
    public final void m553b(float f) {
        float interpolation = this.f501a.getInterpolation(f);
        View view = this.f502b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.f520g / width;
        float f3 = this.f521h / height;
        float m2747a = 1.0f - AbstractC1188a.m2747a(0.0f, f2, interpolation);
        float m2747a2 = 1.0f - AbstractC1188a.m2747a(0.0f, f3, interpolation);
        view.setScaleX(m2747a);
        view.setPivotY(height);
        view.setScaleY(m2747a2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(m2747a2 != 0.0f ? m2747a / m2747a2 : 1.0f);
            }
        }
    }
}
