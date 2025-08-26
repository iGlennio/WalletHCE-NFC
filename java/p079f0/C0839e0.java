package p079f0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: f0.e0 */
/* loaded from: classes.dex */
public final class C0839e0 {

    /* renamed from: a */
    public final ArrayList f3346a = new ArrayList();

    /* renamed from: b */
    public int f3347b = Integer.MIN_VALUE;

    /* renamed from: c */
    public int f3348c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f3349d = 0;

    /* renamed from: e */
    public final int f3350e;

    /* renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f3351f;

    public C0839e0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f3351f = staggeredGridLayoutManager;
        this.f3350e = i2;
    }

    /* renamed from: a */
    public final void m2231a() {
        View view = (View) this.f3346a.get(r0.size() - 1);
        C0833b0 c0833b0 = (C0833b0) view.getLayoutParams();
        this.f3348c = this.f3351f.f2453r.mo1511b(view);
        c0833b0.getClass();
    }

    /* renamed from: b */
    public final void m2232b() {
        this.f3346a.clear();
        this.f3347b = Integer.MIN_VALUE;
        this.f3348c = Integer.MIN_VALUE;
        this.f3349d = 0;
    }

    /* renamed from: c */
    public final int m2233c() {
        return this.f3351f.f2458w ? m2235e(r1.size() - 1, -1) : m2235e(0, this.f3346a.size());
    }

    /* renamed from: d */
    public final int m2234d() {
        return this.f3351f.f2458w ? m2235e(0, this.f3346a.size()) : m2235e(r1.size() - 1, -1);
    }

    /* renamed from: e */
    public final int m2235e(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3351f;
        int mo1520k = staggeredGridLayoutManager.f2453r.mo1520k();
        int mo1516g = staggeredGridLayoutManager.f2453r.mo1516g();
        int i4 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View view = (View) this.f3346a.get(i2);
            int mo1514e = staggeredGridLayoutManager.f2453r.mo1514e(view);
            int mo1511b = staggeredGridLayoutManager.f2453r.mo1511b(view);
            boolean z2 = mo1514e <= mo1516g;
            boolean z3 = mo1511b >= mo1520k;
            if (z2 && z3 && (mo1514e < mo1520k || mo1511b > mo1516g)) {
                return AbstractC0812H.m2166H(view);
            }
            i2 += i4;
        }
        return -1;
    }

    /* renamed from: f */
    public final int m2236f(int i2) {
        int i3 = this.f3348c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f3346a.size() == 0) {
            return i2;
        }
        m2231a();
        return this.f3348c;
    }

    /* renamed from: g */
    public final View m2237g(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3351f;
        ArrayList arrayList = this.f3346a;
        View view = null;
        if (i3 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2458w && AbstractC0812H.m2166H(view2) >= i2) || ((!staggeredGridLayoutManager.f2458w && AbstractC0812H.m2166H(view2) <= i2) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            View view3 = (View) arrayList.get(i4);
            if ((staggeredGridLayoutManager.f2458w && AbstractC0812H.m2166H(view3) <= i2) || ((!staggeredGridLayoutManager.f2458w && AbstractC0812H.m2166H(view3) >= i2) || !view3.hasFocusable())) {
                break;
            }
            i4++;
            view = view3;
        }
        return view;
    }

    /* renamed from: h */
    public final int m2238h(int i2) {
        int i3 = this.f3347b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f3346a.size() == 0) {
            return i2;
        }
        View view = (View) this.f3346a.get(0);
        C0833b0 c0833b0 = (C0833b0) view.getLayoutParams();
        this.f3347b = this.f3351f.f2453r.mo1514e(view);
        c0833b0.getClass();
        return this.f3347b;
    }
}
