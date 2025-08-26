package p079f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: f0.w */
/* loaded from: classes.dex */
public final class C0859w extends C0857u {

    /* renamed from: q */
    public final /* synthetic */ int f3485q;

    /* renamed from: r */
    public final /* synthetic */ Object f3486r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0859w(Object obj, Context context, int i2) {
        super(context);
        this.f3485q = i2;
        this.f3486r = obj;
    }

    @Override // p079f0.C0857u
    /* renamed from: b */
    public int mo2264b(View view, int i2) {
        switch (this.f3485q) {
            case 1:
                ((CarouselLayoutManager) this.f3486r).getClass();
                return 0;
            default:
                return super.mo2264b(view, i2);
        }
    }

    @Override // p079f0.C0857u
    /* renamed from: c */
    public int mo2265c(View view, int i2) {
        switch (this.f3485q) {
            case 1:
                ((CarouselLayoutManager) this.f3486r).getClass();
                return 0;
            default:
                return super.mo2265c(view, i2);
        }
    }

    @Override // p079f0.C0857u
    /* renamed from: d */
    public float mo1961d(DisplayMetrics displayMetrics) {
        switch (this.f3485q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo1961d(displayMetrics);
        }
    }

    @Override // p079f0.C0857u
    /* renamed from: e */
    public int mo2266e(int i2) {
        switch (this.f3485q) {
            case 0:
                return Math.min(100, super.mo2266e(i2));
            default:
                return super.mo2266e(i2);
        }
    }

    @Override // p079f0.C0857u
    /* renamed from: f */
    public PointF mo2267f(int i2) {
        switch (this.f3485q) {
            case 1:
                ((CarouselLayoutManager) this.f3486r).getClass();
                return null;
            default:
                return super.mo2267f(i2);
        }
    }

    @Override // p079f0.C0857u
    /* renamed from: h */
    public void mo2269h(View view, C0822S c0822s) {
        switch (this.f3485q) {
            case 0:
                C0860x c0860x = (C0860x) this.f3486r;
                int[] m2273a = c0860x.m2273a(c0860x.f3487a.getLayoutManager(), view);
                int i2 = m2273a[0];
                int i3 = m2273a[1];
                int ceil = (int) Math.ceil(mo2266e(Math.max(Math.abs(i2), Math.abs(i3))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f3477j;
                    c0822s.f3251a = i2;
                    c0822s.f3252b = i3;
                    c0822s.f3253c = ceil;
                    c0822s.f3255e = decelerateInterpolator;
                    c0822s.f3256f = true;
                    break;
                }
                break;
            default:
                super.mo2269h(view, c0822s);
                break;
        }
    }
}
