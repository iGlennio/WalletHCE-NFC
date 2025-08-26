package p017G0;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Log;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0562b;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p064Z.C0549a;
import p111r0.AbstractC1188a;

/* renamed from: G0.l */
/* loaded from: classes.dex */
public final class C0180l extends AbstractC0169a {

    /* renamed from: g */
    public final float f525g;

    /* renamed from: h */
    public final float f526h;

    /* renamed from: i */
    public final float f527i;

    public C0180l(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f525g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f526h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f527i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    /* renamed from: a */
    public final void m554a() {
        if (this.f506f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0562b c0562b = this.f506f;
        this.f506f = null;
        if (c0562b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f502b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f505e);
        animatorSet.start();
    }

    /* renamed from: b */
    public final void m555b(C0562b c0562b, int i2, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i3;
        boolean z2 = c0562b.f1565d == 0;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        View view = this.f502b;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
        }
        float f = scaleX + i3;
        Property property = View.TRANSLATION_X;
        if (z3) {
            f = -f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new C0549a(1));
        ofFloat.setDuration(AbstractC1188a.m2749c(this.f503c, this.f504d, c0562b.f1564c));
        ofFloat.addListener(new C0179k(this, z2, i2));
        ofFloat.addListener(animatorListenerAdapter);
        ofFloat.start();
    }

    /* renamed from: c */
    public final void m556c(float f, boolean z2, int i2) {
        float interpolation = this.f501a.getInterpolation(f);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        View view = this.f502b;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 3) == 3;
        boolean z4 = z2 == z3;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.f525g / f2;
            float f5 = this.f526h / f2;
            float f6 = this.f527i / f3;
            if (z3) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z4) {
                f5 = -f4;
            }
            float m2747a = AbstractC1188a.m2747a(0.0f, f5, interpolation);
            float f7 = m2747a + 1.0f;
            view.setScaleX(f7);
            float m2747a2 = 1.0f - AbstractC1188a.m2747a(0.0f, f6, interpolation);
            view.setScaleY(m2747a2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    childAt.setPivotX(z3 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z4 ? 1.0f - m2747a : 1.0f;
                    float f9 = m2747a2 != 0.0f ? (f7 / m2747a2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }
}
