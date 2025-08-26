package p079f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: f0.a0 */
/* loaded from: classes.dex */
public final class C0831a0 {

    /* renamed from: a */
    public int f3305a;

    /* renamed from: b */
    public int f3306b;

    /* renamed from: c */
    public boolean f3307c;

    /* renamed from: d */
    public boolean f3308d;

    /* renamed from: e */
    public boolean f3309e;

    /* renamed from: f */
    public int[] f3310f;

    /* renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f3311g;

    public C0831a0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3311g = staggeredGridLayoutManager;
        m2230a();
    }

    /* renamed from: a */
    public final void m2230a() {
        this.f3305a = -1;
        this.f3306b = Integer.MIN_VALUE;
        this.f3307c = false;
        this.f3308d = false;
        this.f3309e = false;
        int[] iArr = this.f3310f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
