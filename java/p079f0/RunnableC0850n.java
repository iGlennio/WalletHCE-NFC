package p079f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p014F0.C0129F;
import p016G.AbstractC0168i;

/* renamed from: f0.n */
/* loaded from: classes.dex */
public final class RunnableC0850n implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f3427e = new ThreadLocal();

    /* renamed from: f */
    public static final C0129F f3428f = new C0129F(2);

    /* renamed from: a */
    public ArrayList f3429a;

    /* renamed from: b */
    public long f3430b;

    /* renamed from: c */
    public long f3431c;

    /* renamed from: d */
    public ArrayList f3432d;

    /* renamed from: c */
    public static AbstractC0827X m2254c(RecyclerView recyclerView, int i2, long j2) {
        int m548w = recyclerView.f2404e.m548w();
        for (int i3 = 0; i3 < m548w; i3++) {
            AbstractC0827X m1796I = RecyclerView.m1796I(recyclerView.f2404e.m547v(i3));
            if (m1796I.f3282c == i2 && !m1796I.m2219f()) {
                return null;
            }
        }
        C0818N c0818n = recyclerView.f2398b;
        try {
            recyclerView.m1815P();
            AbstractC0827X m2206i = c0818n.m2206i(i2, j2);
            if (m2206i != null) {
                if (!m2206i.m2218e() || m2206i.m2219f()) {
                    c0818n.m2198a(m2206i, false);
                } else {
                    c0818n.m2203f(m2206i.f3280a);
                }
            }
            recyclerView.m1816Q(false);
            return m2206i;
        } catch (Throwable th) {
            recyclerView.m1816Q(false);
            throw th;
        }
    }

    /* renamed from: a */
    public final void m2255a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f2426p && this.f3430b == 0) {
            this.f3430b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0848l c0848l = recyclerView.f2399b0;
        c0848l.f3418a = i2;
        c0848l.f3419b = i3;
    }

    /* renamed from: b */
    public final void m2256b(long j2) {
        C0849m c0849m;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0849m c0849m2;
        ArrayList arrayList = this.f3429a;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0848l c0848l = recyclerView3.f2399b0;
                c0848l.m2253b(recyclerView3, false);
                i2 += c0848l.f3421d;
            }
        }
        ArrayList arrayList2 = this.f3432d;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0848l c0848l2 = recyclerView4.f2399b0;
                int abs = Math.abs(c0848l2.f3419b) + Math.abs(c0848l2.f3418a);
                for (int i6 = 0; i6 < c0848l2.f3421d * 2; i6 += 2) {
                    if (i4 >= arrayList2.size()) {
                        c0849m2 = new C0849m();
                        arrayList2.add(c0849m2);
                    } else {
                        c0849m2 = (C0849m) arrayList2.get(i4);
                    }
                    int[] iArr = c0848l2.f3420c;
                    int i7 = iArr[i6 + 1];
                    c0849m2.f3422a = i7 <= abs;
                    c0849m2.f3423b = abs;
                    c0849m2.f3424c = i7;
                    c0849m2.f3425d = recyclerView4;
                    c0849m2.f3426e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(arrayList2, f3428f);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (c0849m = (C0849m) arrayList2.get(i8)).f3425d) != null; i8++) {
            AbstractC0827X m2254c = m2254c(recyclerView, c0849m.f3426e, c0849m.f3422a ? Long.MAX_VALUE : j2);
            if (m2254c != null && m2254c.f3281b != null && m2254c.m2218e() && !m2254c.m2219f() && (recyclerView2 = (RecyclerView) m2254c.f3281b.get()) != null) {
                if (recyclerView2.f2438y && recyclerView2.f2404e.m548w() != 0) {
                    AbstractC0808D abstractC0808D = recyclerView2.f2380H;
                    if (abstractC0808D != null) {
                        abstractC0808D.mo2158e();
                    }
                    AbstractC0812H abstractC0812H = recyclerView2.f2418l;
                    C0818N c0818n = recyclerView2.f2398b;
                    if (abstractC0812H != null) {
                        abstractC0812H.m2182g0(c0818n);
                        recyclerView2.f2418l.m2183h0(c0818n);
                    }
                    c0818n.f3241a.clear();
                    c0818n.m2201d();
                }
                C0848l c0848l3 = recyclerView2.f2399b0;
                c0848l3.m2253b(recyclerView2, true);
                if (c0848l3.f3421d != 0) {
                    try {
                        int i9 = AbstractC0168i.f500a;
                        Trace.beginSection("RV Nested Prefetch");
                        C0824U c0824u = recyclerView2.f2401c0;
                        AbstractC0862z abstractC0862z = recyclerView2.f2416k;
                        c0824u.f3261d = 1;
                        c0824u.f3262e = abstractC0862z.mo474a();
                        c0824u.f3264g = false;
                        c0824u.f3265h = false;
                        c0824u.f3266i = false;
                        for (int i10 = 0; i10 < c0848l3.f3421d * 2; i10 += 2) {
                            m2254c(recyclerView2, c0848l3.f3420c[i10], j2);
                        }
                        Trace.endSection();
                        c0849m.f3422a = false;
                        c0849m.f3423b = 0;
                        c0849m.f3424c = 0;
                        c0849m.f3425d = null;
                        c0849m.f3426e = 0;
                    } catch (Throwable th) {
                        int i11 = AbstractC0168i.f500a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0849m.f3422a = false;
            c0849m.f3423b = 0;
            c0849m.f3424c = 0;
            c0849m.f3425d = null;
            c0849m.f3426e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = AbstractC0168i.f500a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3429a;
            if (arrayList.isEmpty()) {
                this.f3430b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f3430b = 0L;
                Trace.endSection();
            } else {
                m2256b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f3431c);
                this.f3430b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f3430b = 0L;
            int i4 = AbstractC0168i.f500a;
            Trace.endSection();
            throw th;
        }
    }
}
