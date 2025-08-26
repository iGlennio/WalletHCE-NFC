package p079f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.i */
/* loaded from: classes.dex */
public final class C0845i extends AbstractC0815K {

    /* renamed from: a */
    public final /* synthetic */ C0847k f3385a;

    public C0845i(C0847k c0847k) {
        this.f3385a = c0847k;
    }

    @Override // p079f0.AbstractC0815K
    /* renamed from: b */
    public final void mo1948b(RecyclerView recyclerView, int i2, int i3) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0847k c0847k = this.f3385a;
        int computeVerticalScrollRange = c0847k.f3410s.computeVerticalScrollRange();
        int i4 = c0847k.f3409r;
        int i5 = computeVerticalScrollRange - i4;
        int i6 = c0847k.f3392a;
        c0847k.f3411t = i5 > 0 && i4 >= i6;
        int computeHorizontalScrollRange = c0847k.f3410s.computeHorizontalScrollRange();
        int i7 = c0847k.f3408q;
        boolean z2 = computeHorizontalScrollRange - i7 > 0 && i7 >= i6;
        c0847k.f3412u = z2;
        boolean z3 = c0847k.f3411t;
        if (!z3 && !z2) {
            if (c0847k.f3413v != 0) {
                c0847k.m2250f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i4;
            c0847k.f3403l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            c0847k.f3402k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (c0847k.f3412u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i7;
            c0847k.f3406o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            c0847k.f3405n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
        }
        int i8 = c0847k.f3413v;
        if (i8 == 0 || i8 == 1) {
            c0847k.m2250f(1);
        }
    }
}
