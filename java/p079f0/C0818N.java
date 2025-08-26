package p079f0;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p027K.C0284b;
import p056V.C0508b;

/* renamed from: f0.N */
/* loaded from: classes.dex */
public final class C0818N {

    /* renamed from: a */
    public final ArrayList f3241a;

    /* renamed from: b */
    public ArrayList f3242b;

    /* renamed from: c */
    public final ArrayList f3243c;

    /* renamed from: d */
    public final List f3244d;

    /* renamed from: e */
    public int f3245e;

    /* renamed from: f */
    public int f3246f;

    /* renamed from: g */
    public C0817M f3247g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f3248h;

    public C0818N(RecyclerView recyclerView) {
        this.f3248h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3241a = arrayList;
        this.f3242b = null;
        this.f3243c = new ArrayList();
        this.f3244d = Collections.unmodifiableList(arrayList);
        this.f3245e = 2;
        this.f3246f = 2;
    }

    /* renamed from: a */
    public final void m2198a(AbstractC0827X abstractC0827X, boolean z2) {
        RecyclerView.m1801j(abstractC0827X);
        RecyclerView recyclerView = this.f3248h;
        C0828Y c0828y = recyclerView.f2415j0;
        if (c0828y != null) {
            C0508b c0508b = c0828y.f3299e;
            View view = abstractC0827X.f3280a;
            AbstractC0272P.m823m(view, c0508b != null ? (C0284b) ((WeakHashMap) c0508b.f1387f).remove(view) : null);
        }
        if (z2) {
            AbstractC0862z abstractC0862z = recyclerView.f2416k;
            if (abstractC0862z != null) {
                abstractC0862z.mo479f(abstractC0827X);
            }
            if (recyclerView.f2401c0 != null) {
                recyclerView.f2406f.m58I(abstractC0827X);
            }
        }
        abstractC0827X.f3297r = null;
        C0817M m2200c = m2200c();
        m2200c.getClass();
        int i2 = abstractC0827X.f3285f;
        ArrayList arrayList = m2200c.m2197a(i2).f3235a;
        if (((C0816L) m2200c.f3239a.get(i2)).f3236b <= arrayList.size()) {
            return;
        }
        abstractC0827X.m2226m();
        arrayList.add(abstractC0827X);
    }

    /* renamed from: b */
    public final int m2199b(int i2) {
        RecyclerView recyclerView = this.f3248h;
        if (i2 >= 0 && i2 < recyclerView.f2401c0.m2211b()) {
            return !recyclerView.f2401c0.f3264g ? i2 : recyclerView.f2402d.m564g(i2, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f2401c0.m2211b() + recyclerView.m1848y());
    }

    /* renamed from: c */
    public final C0817M m2200c() {
        if (this.f3247g == null) {
            C0817M c0817m = new C0817M();
            c0817m.f3239a = new SparseArray();
            c0817m.f3240b = 0;
            this.f3247g = c0817m;
        }
        return this.f3247g;
    }

    /* renamed from: d */
    public final void m2201d() {
        ArrayList arrayList = this.f3243c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2202e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f2370s0;
        C0848l c0848l = this.f3248h.f2399b0;
        int[] iArr2 = c0848l.f3420c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0848l.f3421d = 0;
    }

    /* renamed from: e */
    public final void m2202e(int i2) {
        ArrayList arrayList = this.f3243c;
        m2198a((AbstractC0827X) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    /* renamed from: f */
    public final void m2203f(View view) {
        AbstractC0827X m1796I = RecyclerView.m1796I(view);
        boolean m2223j = m1796I.m2223j();
        RecyclerView recyclerView = this.f3248h;
        if (m2223j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (m1796I.m2222i()) {
            m1796I.f3293n.m2207j(m1796I);
        } else if (m1796I.m2229p()) {
            m1796I.f3289j &= -33;
        }
        m2204g(m1796I);
        if (recyclerView.f2380H == null || m1796I.m2220g()) {
            return;
        }
        recyclerView.f2380H.mo2157d(m1796I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a6  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2204g(p079f0.AbstractC0827X r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f0.C0818N.m2204g(f0.X):void");
    }

    /* renamed from: h */
    public final void m2205h(View view) {
        AbstractC0808D abstractC0808D;
        AbstractC0827X m1796I = RecyclerView.m1796I(view);
        boolean z2 = (m1796I.f3289j & 12) != 0;
        RecyclerView recyclerView = this.f3248h;
        if (!z2 && m1796I.m2224k() && (abstractC0808D = recyclerView.f2380H) != null) {
            C0844h c0844h = (C0844h) abstractC0808D;
            if (m1796I.m2216c().isEmpty() && c0844h.f3373g && !m1796I.m2219f()) {
                if (this.f3242b == null) {
                    this.f3242b = new ArrayList();
                }
                m1796I.f3293n = this;
                m1796I.f3294o = true;
                this.f3242b.add(m1796I);
                return;
            }
        }
        if (m1796I.m2219f() && !m1796I.m2221h() && !recyclerView.f2416k.f3493b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m1848y());
        }
        m1796I.f3293n = this;
        m1796I.f3294o = false;
        this.f3241a.add(m1796I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0441, code lost:
    
        if (r11.m2219f() == false) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x054e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0082  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p079f0.AbstractC0827X m2206i(int r29, long r30) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f0.C0818N.m2206i(int, long):f0.X");
    }

    /* renamed from: j */
    public final void m2207j(AbstractC0827X abstractC0827X) {
        if (abstractC0827X.f3294o) {
            this.f3242b.remove(abstractC0827X);
        } else {
            this.f3241a.remove(abstractC0827X);
        }
        abstractC0827X.f3293n = null;
        abstractC0827X.f3294o = false;
        abstractC0827X.f3289j &= -33;
    }

    /* renamed from: k */
    public final void m2208k() {
        AbstractC0812H abstractC0812H = this.f3248h.f2418l;
        this.f3246f = this.f3245e + (abstractC0812H != null ? abstractC0812H.f3225j : 0);
        ArrayList arrayList = this.f3243c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3246f; size--) {
            m2202e(size);
        }
    }
}
