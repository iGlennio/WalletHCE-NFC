package p079f0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p043P0.C0403B;
import p043P0.RunnableC0402A;

/* renamed from: f0.k */
/* loaded from: classes.dex */
public final class C0847k extends AbstractC0809E {

    /* renamed from: C */
    public static final int[] f3388C = {R.attr.state_pressed};

    /* renamed from: D */
    public static final int[] f3389D = new int[0];

    /* renamed from: A */
    public int f3390A;

    /* renamed from: B */
    public final RunnableC0402A f3391B;

    /* renamed from: a */
    public final int f3392a;

    /* renamed from: b */
    public final int f3393b;

    /* renamed from: c */
    public final StateListDrawable f3394c;

    /* renamed from: d */
    public final Drawable f3395d;

    /* renamed from: e */
    public final int f3396e;

    /* renamed from: f */
    public final int f3397f;

    /* renamed from: g */
    public final StateListDrawable f3398g;

    /* renamed from: h */
    public final Drawable f3399h;

    /* renamed from: i */
    public final int f3400i;

    /* renamed from: j */
    public final int f3401j;

    /* renamed from: k */
    public int f3402k;

    /* renamed from: l */
    public int f3403l;

    /* renamed from: m */
    public float f3404m;

    /* renamed from: n */
    public int f3405n;

    /* renamed from: o */
    public int f3406o;

    /* renamed from: p */
    public float f3407p;

    /* renamed from: s */
    public final RecyclerView f3410s;

    /* renamed from: z */
    public final ValueAnimator f3417z;

    /* renamed from: q */
    public int f3408q = 0;

    /* renamed from: r */
    public int f3409r = 0;

    /* renamed from: t */
    public boolean f3411t = false;

    /* renamed from: u */
    public boolean f3412u = false;

    /* renamed from: v */
    public int f3413v = 0;

    /* renamed from: w */
    public int f3414w = 0;

    /* renamed from: x */
    public final int[] f3415x = new int[2];

    /* renamed from: y */
    public final int[] f3416y = new int[2];

    public C0847k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3417z = ofFloat;
        this.f3390A = 0;
        RunnableC0402A runnableC0402A = new RunnableC0402A(8, this);
        this.f3391B = runnableC0402A;
        C0845i c0845i = new C0845i(this);
        this.f3394c = stateListDrawable;
        this.f3395d = drawable;
        this.f3398g = stateListDrawable2;
        this.f3399h = drawable2;
        this.f3396e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f3397f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f3400i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f3401j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f3392a = i3;
        this.f3393b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0846j(this));
        ofFloat.addUpdateListener(new C0403B(true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f3410s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0812H abstractC0812H = recyclerView2.f2418l;
            if (abstractC0812H != null) {
                abstractC0812H.mo1780c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2420m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1813N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3410s;
            recyclerView3.f2422n.remove(this);
            if (recyclerView3.f2424o == this) {
                recyclerView3.f2424o = null;
            }
            ArrayList arrayList2 = this.f3410s.f2405e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0845i);
            }
            this.f3410s.removeCallbacks(runnableC0402A);
        }
        this.f3410s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1831g(this);
            this.f3410s.f2422n.add(this);
            this.f3410s.m1832h(c0845i);
        }
    }

    /* renamed from: e */
    public static int m2247e(float f, float f2, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f2 - f) / i5) * i6);
            int i8 = i3 + i7;
            if (i8 < i6 && i8 >= 0) {
                return i7;
            }
        }
        return 0;
    }

    @Override // p079f0.AbstractC0809E
    /* renamed from: b */
    public final void mo2160b(Canvas canvas, RecyclerView recyclerView) {
        int i2 = this.f3408q;
        RecyclerView recyclerView2 = this.f3410s;
        if (i2 != recyclerView2.getWidth() || this.f3409r != recyclerView2.getHeight()) {
            this.f3408q = recyclerView2.getWidth();
            this.f3409r = recyclerView2.getHeight();
            m2250f(0);
            return;
        }
        if (this.f3390A != 0) {
            if (this.f3411t) {
                int i3 = this.f3408q;
                int i4 = this.f3396e;
                int i5 = i3 - i4;
                int i6 = this.f3403l;
                int i7 = this.f3402k;
                int i8 = i6 - (i7 / 2);
                StateListDrawable stateListDrawable = this.f3394c;
                stateListDrawable.setBounds(0, 0, i4, i7);
                int i9 = this.f3409r;
                int i10 = this.f3397f;
                Drawable drawable = this.f3395d;
                drawable.setBounds(0, 0, i10, i9);
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i4, i8);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i4, -i8);
                } else {
                    canvas.translate(i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i8);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i5, -i8);
                }
            }
            if (this.f3412u) {
                int i11 = this.f3409r;
                int i12 = this.f3400i;
                int i13 = i11 - i12;
                int i14 = this.f3406o;
                int i15 = this.f3405n;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.f3398g;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.f3408q;
                int i18 = this.f3401j;
                Drawable drawable2 = this.f3399h;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, i13);
                drawable2.draw(canvas);
                canvas.translate(i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i16, -i13);
            }
        }
    }

    /* renamed from: c */
    public final boolean m2248c(float f, float f2) {
        if (f2 < this.f3409r - this.f3400i) {
            return false;
        }
        int i2 = this.f3406o;
        int i3 = this.f3405n;
        return f >= ((float) (i2 - (i3 / 2))) && f <= ((float) ((i3 / 2) + i2));
    }

    /* renamed from: d */
    public final boolean m2249d(float f, float f2) {
        RecyclerView recyclerView = this.f3410s;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f3396e;
        if (!z2 ? f >= this.f3408q - i2 : f <= i2 / 2) {
            int i3 = this.f3403l;
            int i4 = this.f3402k / 2;
            if (f2 >= i3 - i4 && f2 <= i4 + i3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m2250f(int i2) {
        RunnableC0402A runnableC0402A = this.f3391B;
        StateListDrawable stateListDrawable = this.f3394c;
        if (i2 == 2 && this.f3413v != 2) {
            stateListDrawable.setState(f3388C);
            this.f3410s.removeCallbacks(runnableC0402A);
        }
        if (i2 == 0) {
            this.f3410s.invalidate();
        } else {
            m2251g();
        }
        if (this.f3413v == 2 && i2 != 2) {
            stateListDrawable.setState(f3389D);
            this.f3410s.removeCallbacks(runnableC0402A);
            this.f3410s.postDelayed(runnableC0402A, 1200);
        } else if (i2 == 1) {
            this.f3410s.removeCallbacks(runnableC0402A);
            this.f3410s.postDelayed(runnableC0402A, 1500);
        }
        this.f3413v = i2;
    }

    /* renamed from: g */
    public final void m2251g() {
        int i2 = this.f3390A;
        ValueAnimator valueAnimator = this.f3417z;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3390A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
