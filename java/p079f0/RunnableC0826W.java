package p079f0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p052T.InterpolatorC0482d;

/* renamed from: f0.W */
/* loaded from: classes.dex */
public final class RunnableC0826W implements Runnable {

    /* renamed from: a */
    public int f3272a;

    /* renamed from: b */
    public int f3273b;

    /* renamed from: c */
    public OverScroller f3274c;

    /* renamed from: d */
    public Interpolator f3275d;

    /* renamed from: e */
    public boolean f3276e;

    /* renamed from: f */
    public boolean f3277f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f3278g;

    public RunnableC0826W(RecyclerView recyclerView) {
        this.f3278g = recyclerView;
        InterpolatorC0482d interpolatorC0482d = RecyclerView.f2372u0;
        this.f3275d = interpolatorC0482d;
        this.f3276e = false;
        this.f3277f = false;
        this.f3274c = new OverScroller(recyclerView.getContext(), interpolatorC0482d);
    }

    /* renamed from: a */
    public final void m2212a() {
        if (this.f3276e) {
            this.f3277f = true;
            return;
        }
        RecyclerView recyclerView = this.f3278g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        recyclerView.postOnAnimation(this);
    }

    /* renamed from: b */
    public final void m2213b(int i2, int i3, int i4, BaseInterpolator baseInterpolator) {
        int i5;
        RecyclerView recyclerView = this.f3278g;
        if (i4 == Integer.MIN_VALUE) {
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i3);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i3 * i3) + (i2 * i2));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            i4 = Math.min(i5, 2000);
        }
        int i7 = i4;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f2372u0;
        }
        if (this.f3275d != interpolator) {
            this.f3275d = interpolator;
            this.f3274c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3273b = 0;
        this.f3272a = 0;
        recyclerView.setScrollState(2);
        this.f3274c.startScroll(0, 0, i2, i3, i7);
        m2212a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3278g;
        if (recyclerView.f2418l == null) {
            recyclerView.removeCallbacks(this);
            this.f3274c.abortAnimation();
            return;
        }
        this.f3277f = false;
        this.f3276e = true;
        recyclerView.m1836m();
        OverScroller overScroller = this.f3274c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f3272a;
            int i7 = currY - this.f3273b;
            this.f3272a = currX;
            this.f3273b = currY;
            int[] iArr = recyclerView.f2425o0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean m1841r = recyclerView.m1841r(i6, i7, iArr, null, 1);
            int[] iArr2 = recyclerView.f2425o0;
            if (m1841r) {
                i2 = i6 - iArr2[0];
                i3 = i7 - iArr2[1];
            } else {
                i2 = i6;
                i3 = i7;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1835l(i2, i3);
            }
            if (recyclerView.f2416k != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m1824Y(i2, i3, iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
                i2 -= i4;
                i3 -= i5;
                C0857u c0857u = recyclerView.f2418l.f3220e;
                if (c0857u != null && !c0857u.f3471d && c0857u.f3472e) {
                    int m2211b = recyclerView.f2401c0.m2211b();
                    if (m2211b == 0) {
                        c0857u.m2270i();
                    } else if (c0857u.f3468a >= m2211b) {
                        c0857u.f3468a = m2211b - 1;
                        c0857u.m2268g(i4, i5);
                    } else {
                        c0857u.m2268g(i4, i5);
                    }
                }
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (!recyclerView.f2420m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f2425o0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m1842s(i4, i5, i2, i3, null, 1, iArr3);
            int i8 = i2 - iArr2[0];
            int i9 = i3 - iArr2[1];
            if (i4 != 0 || i5 != 0) {
                recyclerView.m1843t(i4, i5);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i8 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i9 != 0));
            C0857u c0857u2 = recyclerView.f2418l.f3220e;
            if ((c0857u2 == null || !c0857u2.f3471d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i10 = i8 < 0 ? -currVelocity : i8 > 0 ? currVelocity : 0;
                    if (i9 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i9 <= 0) {
                        currVelocity = 0;
                    }
                    if (i10 < 0) {
                        recyclerView.m1845v();
                        if (recyclerView.f2376D.isFinished()) {
                            recyclerView.f2376D.onAbsorb(-i10);
                        }
                    } else if (i10 > 0) {
                        recyclerView.m1846w();
                        if (recyclerView.f2378F.isFinished()) {
                            recyclerView.f2378F.onAbsorb(i10);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1847x();
                        if (recyclerView.f2377E.isFinished()) {
                            recyclerView.f2377E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1844u();
                        if (recyclerView.f2379G.isFinished()) {
                            recyclerView.f2379G.onAbsorb(currVelocity);
                        }
                    }
                    if (i10 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC0272P.f768a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0848l c0848l = recyclerView.f2399b0;
                int[] iArr4 = c0848l.f3420c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0848l.f3421d = 0;
            } else {
                m2212a();
                RunnableC0850n runnableC0850n = recyclerView.f2397a0;
                if (runnableC0850n != null) {
                    runnableC0850n.m2255a(recyclerView, i4, i5);
                }
            }
        }
        C0857u c0857u3 = recyclerView.f2418l.f3220e;
        if (c0857u3 != null && c0857u3.f3471d) {
            c0857u3.m2268g(0, 0);
        }
        this.f3276e = false;
        if (!this.f3277f) {
            recyclerView.setScrollState(0);
            recyclerView.m1829d0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
            recyclerView.postOnAnimation(this);
        }
    }
}
