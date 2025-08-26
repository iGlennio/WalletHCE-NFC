package p079f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.u */
/* loaded from: classes.dex */
public class C0857u {

    /* renamed from: a */
    public int f3468a = -1;

    /* renamed from: b */
    public RecyclerView f3469b;

    /* renamed from: c */
    public AbstractC0812H f3470c;

    /* renamed from: d */
    public boolean f3471d;

    /* renamed from: e */
    public boolean f3472e;

    /* renamed from: f */
    public View f3473f;

    /* renamed from: g */
    public final C0822S f3474g;

    /* renamed from: h */
    public boolean f3475h;

    /* renamed from: i */
    public final LinearInterpolator f3476i;

    /* renamed from: j */
    public final DecelerateInterpolator f3477j;

    /* renamed from: k */
    public PointF f3478k;

    /* renamed from: l */
    public final DisplayMetrics f3479l;

    /* renamed from: m */
    public boolean f3480m;

    /* renamed from: n */
    public float f3481n;

    /* renamed from: o */
    public int f3482o;

    /* renamed from: p */
    public int f3483p;

    public C0857u(Context context) {
        C0822S c0822s = new C0822S();
        c0822s.f3254d = -1;
        c0822s.f3256f = false;
        c0822s.f3257g = 0;
        c0822s.f3251a = 0;
        c0822s.f3252b = 0;
        c0822s.f3253c = Integer.MIN_VALUE;
        c0822s.f3255e = null;
        this.f3474g = c0822s;
        this.f3476i = new LinearInterpolator();
        this.f3477j = new DecelerateInterpolator();
        this.f3480m = false;
        this.f3482o = 0;
        this.f3483p = 0;
        this.f3479l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public static int m2263a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    /* renamed from: b */
    public int mo2264b(View view, int i2) {
        AbstractC0812H abstractC0812H = this.f3470c;
        if (abstractC0812H == null || !abstractC0812H.mo1782d()) {
            return 0;
        }
        C0813I c0813i = (C0813I) view.getLayoutParams();
        return m2263a((view.getLeft() - ((C0813I) view.getLayoutParams()).f3232b.left) - ((ViewGroup.MarginLayoutParams) c0813i).leftMargin, view.getRight() + ((C0813I) view.getLayoutParams()).f3232b.right + ((ViewGroup.MarginLayoutParams) c0813i).rightMargin, abstractC0812H.m2176E(), abstractC0812H.f3229n - abstractC0812H.m2177F(), i2);
    }

    /* renamed from: c */
    public int mo2265c(View view, int i2) {
        AbstractC0812H abstractC0812H = this.f3470c;
        if (abstractC0812H == null || !abstractC0812H.mo1785e()) {
            return 0;
        }
        C0813I c0813i = (C0813I) view.getLayoutParams();
        return m2263a((view.getTop() - ((C0813I) view.getLayoutParams()).f3232b.top) - ((ViewGroup.MarginLayoutParams) c0813i).topMargin, view.getBottom() + ((C0813I) view.getLayoutParams()).f3232b.bottom + ((ViewGroup.MarginLayoutParams) c0813i).bottomMargin, abstractC0812H.m2178G(), abstractC0812H.f3230o - abstractC0812H.m2175D(), i2);
    }

    /* renamed from: d */
    public float mo1961d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: e */
    public int mo2266e(int i2) {
        float abs = Math.abs(i2);
        if (!this.f3480m) {
            this.f3481n = mo1961d(this.f3479l);
            this.f3480m = true;
        }
        return (int) Math.ceil(abs * this.f3481n);
    }

    /* renamed from: f */
    public PointF mo2267f(int i2) {
        Object obj = this.f3470c;
        if (obj instanceof InterfaceC0823T) {
            return ((InterfaceC0823T) obj).mo1778a(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0823T.class.getCanonicalName());
        return null;
    }

    /* renamed from: g */
    public final void m2268g(int i2, int i3) {
        PointF mo2267f;
        RecyclerView recyclerView = this.f3469b;
        if (this.f3468a == -1 || recyclerView == null) {
            m2270i();
        }
        if (this.f3471d && this.f3473f == null && this.f3470c != null && (mo2267f = mo2267f(this.f3468a)) != null) {
            float f = mo2267f.x;
            if (f != 0.0f || mo2267f.y != 0.0f) {
                recyclerView.m1824Y((int) Math.signum(f), (int) Math.signum(mo2267f.y), null);
            }
        }
        this.f3471d = false;
        View view = this.f3473f;
        C0822S c0822s = this.f3474g;
        if (view != null) {
            this.f3469b.getClass();
            AbstractC0827X m1796I = RecyclerView.m1796I(view);
            if ((m1796I != null ? m1796I.m2215b() : -1) == this.f3468a) {
                View view2 = this.f3473f;
                C0824U c0824u = recyclerView.f2401c0;
                mo2269h(view2, c0822s);
                c0822s.m2209a(recyclerView);
                m2270i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3473f = null;
            }
        }
        if (this.f3472e) {
            C0824U c0824u2 = recyclerView.f2401c0;
            if (this.f3469b.f2418l.m2194v() == 0) {
                m2270i();
            } else {
                int i4 = this.f3482o;
                int i5 = i4 - i2;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.f3482o = i5;
                int i6 = this.f3483p;
                int i7 = i6 - i3;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f3483p = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF mo2267f2 = mo2267f(this.f3468a);
                    if (mo2267f2 != null) {
                        if (mo2267f2.x != 0.0f || mo2267f2.y != 0.0f) {
                            float f2 = mo2267f2.y;
                            float sqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                            float f3 = mo2267f2.x / sqrt;
                            mo2267f2.x = f3;
                            float f4 = mo2267f2.y / sqrt;
                            mo2267f2.y = f4;
                            this.f3478k = mo2267f2;
                            this.f3482o = (int) (f3 * 10000.0f);
                            this.f3483p = (int) (f4 * 10000.0f);
                            int mo2266e = mo2266e(10000);
                            LinearInterpolator linearInterpolator = this.f3476i;
                            c0822s.f3251a = (int) (this.f3482o * 1.2f);
                            c0822s.f3252b = (int) (this.f3483p * 1.2f);
                            c0822s.f3253c = (int) (mo2266e * 1.2f);
                            c0822s.f3255e = linearInterpolator;
                            c0822s.f3256f = true;
                        }
                    }
                    c0822s.f3254d = this.f3468a;
                    m2270i();
                }
            }
            boolean z2 = c0822s.f3254d >= 0;
            c0822s.m2209a(recyclerView);
            if (z2 && this.f3472e) {
                this.f3471d = true;
                recyclerView.f2395W.m2212a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2269h(android.view.View r7, p079f0.C0822S r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f3478k
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.mo2264b(r7, r0)
            android.graphics.PointF r5 = r6.f3478k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.mo2265c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.mo2266e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.f3477j
            r8.f3251a = r0
            r8.f3252b = r7
            r8.f3253c = r2
            r8.f3255e = r3
            r8.f3256f = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f0.C0857u.mo2269h(android.view.View, f0.S):void");
    }

    /* renamed from: i */
    public final void m2270i() {
        if (this.f3472e) {
            this.f3472e = false;
            this.f3483p = 0;
            this.f3482o = 0;
            this.f3478k = null;
            this.f3469b.f2401c0.f3258a = -1;
            this.f3473f = null;
            this.f3468a = -1;
            this.f3471d = false;
            AbstractC0812H abstractC0812H = this.f3470c;
            if (abstractC0812H.f3220e == this) {
                abstractC0812H.f3220e = null;
            }
            this.f3470c = null;
            this.f3469b = null;
        }
    }
}
