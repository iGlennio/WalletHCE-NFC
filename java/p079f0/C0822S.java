package p079f0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.S */
/* loaded from: classes.dex */
public final class C0822S {

    /* renamed from: a */
    public int f3251a;

    /* renamed from: b */
    public int f3252b;

    /* renamed from: c */
    public int f3253c;

    /* renamed from: d */
    public int f3254d;

    /* renamed from: e */
    public BaseInterpolator f3255e;

    /* renamed from: f */
    public boolean f3256f;

    /* renamed from: g */
    public int f3257g;

    /* renamed from: a */
    public final void m2209a(RecyclerView recyclerView) {
        int i2 = this.f3254d;
        if (i2 >= 0) {
            this.f3254d = -1;
            recyclerView.m1812M(i2);
            this.f3256f = false;
            return;
        }
        if (!this.f3256f) {
            this.f3257g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f3255e;
        if (baseInterpolator != null && this.f3253c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i3 = this.f3253c;
        if (i3 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f2395W.m2213b(this.f3251a, this.f3252b, i3, baseInterpolator);
        int i4 = this.f3257g + 1;
        this.f3257g = i4;
        if (i4 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3256f = false;
    }
}
