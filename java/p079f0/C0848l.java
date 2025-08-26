package p079f0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: f0.l */
/* loaded from: classes.dex */
public final class C0848l {

    /* renamed from: a */
    public int f3418a;

    /* renamed from: b */
    public int f3419b;

    /* renamed from: c */
    public int[] f3420c;

    /* renamed from: d */
    public int f3421d;

    /* renamed from: a */
    public final void m2252a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i4 = this.f3421d;
        int i5 = i4 * 2;
        int[] iArr = this.f3420c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3420c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i5 >= iArr.length) {
            int[] iArr3 = new int[i4 * 4];
            this.f3420c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3420c;
        iArr4[i5] = i2;
        iArr4[i5 + 1] = i3;
        this.f3421d++;
    }

    /* renamed from: b */
    public final void m2253b(RecyclerView recyclerView, boolean z2) {
        this.f3421d = 0;
        int[] iArr = this.f3420c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0812H abstractC0812H = recyclerView.f2418l;
        if (recyclerView.f2416k == null || abstractC0812H == null || !abstractC0812H.f3224i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f2402d.m565h()) {
                abstractC0812H.mo1788i(recyclerView.f2416k.mo474a(), this);
            }
        } else if (!recyclerView.m1810K()) {
            abstractC0812H.mo1787h(this.f3418a, this.f3419b, recyclerView.f2401c0, this);
        }
        int i2 = this.f3421d;
        if (i2 > abstractC0812H.f3225j) {
            abstractC0812H.f3225j = i2;
            abstractC0812H.f3226k = z2;
            recyclerView.f2398b.m2208k();
        }
    }
}
