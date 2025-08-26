package p121v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p107q.AbstractC1181e;
import p113s.AbstractC1209j;
import p113s.C1202c;
import p113s.C1203d;
import p113s.C1204e;
import p113s.C1206g;
import p116t.C1216b;

/* renamed from: v.f */
/* loaded from: classes.dex */
public final class C1256f {

    /* renamed from: a */
    public final ConstraintLayout f4958a;

    /* renamed from: b */
    public int f4959b;

    /* renamed from: c */
    public int f4960c;

    /* renamed from: d */
    public int f4961d;

    /* renamed from: e */
    public int f4962e;

    /* renamed from: f */
    public int f4963f;

    /* renamed from: g */
    public int f4964g;

    /* renamed from: h */
    public final /* synthetic */ ConstraintLayout f4965h;

    public C1256f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f4965h = constraintLayout;
        this.f4958a = constraintLayout2;
    }

    /* renamed from: a */
    public static boolean m2933a(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    /* renamed from: b */
    public final void m2934b(C1203d c1203d, C1216b c1216b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c1203d == null) {
            return;
        }
        if (c1203d.f4640g0 == 8) {
            c1216b.f4771e = 0;
            c1216b.f4772f = 0;
            c1216b.f4773g = 0;
            return;
        }
        if (c1203d.f4620T == null) {
            return;
        }
        int i4 = c1216b.f4767a;
        int i5 = c1216b.f4768b;
        int i6 = c1216b.f4769c;
        int i7 = c1216b.f4770d;
        int i8 = this.f4959b + this.f4960c;
        int i9 = this.f4961d;
        View view = c1203d.f4638f0;
        int m2740a = AbstractC1181e.m2740a(i4);
        C1202c c1202c = c1203d.f4611K;
        C1202c c1202c2 = c1203d.f4609I;
        if (m2740a == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (m2740a == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4963f, i9, -2);
        } else if (m2740a == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4963f, i9, -2);
            boolean z3 = c1203d.f4660r == 1;
            int i10 = c1216b.f4776j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c1203d.m2818k();
                if (c1216b.f4776j == 2 || !z3 || ((z3 && z4) || c1203d.mo2775A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1203d.m2822q(), 1073741824);
                }
            }
        } else if (m2740a != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f4963f;
            int i12 = c1202c2 != null ? c1202c2.f4598g : 0;
            if (c1202c != null) {
                i12 += c1202c.f4598g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int m2740a2 = AbstractC1181e.m2740a(i5);
        if (m2740a2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (m2740a2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4964g, i8, -2);
        } else if (m2740a2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4964g, i8, -2);
            boolean z5 = c1203d.f4661s == 1;
            int i13 = c1216b.f4776j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c1203d.m2822q();
                if (c1216b.f4776j == 2 || !z5 || ((z5 && z6) || c1203d.mo2776B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c1203d.m2818k(), 1073741824);
                }
            }
        } else if (m2740a2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f4964g;
            int i15 = c1202c2 != null ? c1203d.f4610J.f4598g : 0;
            if (c1202c != null) {
                i15 += c1203d.f4612L.f4598g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C1204e c1204e = (C1204e) c1203d.f4620T;
        ConstraintLayout constraintLayout = this.f4965h;
        if (c1204e != null && AbstractC1209j.m2853c(constraintLayout.f1847i, 256) && view.getMeasuredWidth() == c1203d.m2822q() && view.getMeasuredWidth() < c1204e.m2822q() && view.getMeasuredHeight() == c1203d.m2818k() && view.getMeasuredHeight() < c1204e.m2818k() && view.getBaseline() == c1203d.f4628a0 && !c1203d.m2831z() && m2933a(c1203d.f4607G, makeMeasureSpec, c1203d.m2822q()) && m2933a(c1203d.f4608H, makeMeasureSpec2, c1203d.m2818k())) {
            c1216b.f4771e = c1203d.m2822q();
            c1216b.f4772f = c1203d.m2818k();
            c1216b.f4773g = c1203d.f4628a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c1203d.f4623W > 0.0f;
        boolean z12 = z8 && c1203d.f4623W > 0.0f;
        if (view == null) {
            return;
        }
        C1255e c1255e = (C1255e) view.getLayoutParams();
        int i16 = c1216b.f4776j;
        if (i16 != 1 && i16 != 2 && z7 && c1203d.f4660r == 0 && z8 && c1203d.f4661s == 0) {
            z2 = false;
            measuredWidth = 0;
            baseline = 0;
            i3 = -1;
            max = 0;
        } else {
            if ((view instanceof AbstractC1269s) && (c1203d instanceof C1206g)) {
                ((AbstractC1269s) view).mo1447j((C1206g) c1203d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c1203d.f4607G = makeMeasureSpec;
            c1203d.f4608H = makeMeasureSpec2;
            c1203d.f4639g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c1203d.f4663u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c1203d.f4664v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c1203d.f4666x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            boolean z13 = z10;
            int i20 = c1203d.f4667y;
            if (i20 > 0) {
                max = Math.min(i20, max);
            }
            if (!AbstractC1209j.m2853c(constraintLayout.f1847i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c1203d.f4623W) + 0.5f);
                } else if (z12 && z13) {
                    max = (int) ((max2 / c1203d.f4623W) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z2 = false;
            } else {
                if (measuredWidth2 != max2) {
                    i2 = 1073741824;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                } else {
                    i2 = 1073741824;
                }
                if (measuredHeight != max) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, i2);
                }
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                c1203d.f4607G = makeMeasureSpec;
                c1203d.f4608H = makeMeasureSpec2;
                z2 = false;
                c1203d.f4639g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z14 = baseline != i3 ? true : z2;
        if (measuredWidth != c1216b.f4769c || max != c1216b.f4770d) {
            z2 = true;
        }
        c1216b.f4775i = z2;
        boolean z15 = c1255e.f4921c0 ? true : z14;
        if (z15 && baseline != -1 && c1203d.f4628a0 != baseline) {
            c1216b.f4775i = true;
        }
        c1216b.f4771e = measuredWidth;
        c1216b.f4772f = max;
        c1216b.f4774h = z15;
        c1216b.f4773g = baseline;
    }
}
