package p079f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.Z */
/* loaded from: classes.dex */
public final class C0829Z extends AbstractC0815K {

    /* renamed from: a */
    public boolean f3300a = false;

    /* renamed from: b */
    public final /* synthetic */ C0860x f3301b;

    public C0829Z(C0860x c0860x) {
        this.f3301b = c0860x;
    }

    @Override // p079f0.AbstractC0815K
    /* renamed from: a */
    public final void mo1947a(RecyclerView recyclerView, int i2) {
        if (i2 == 0 && this.f3300a) {
            this.f3300a = false;
            this.f3301b.m2276f();
        }
    }

    @Override // p079f0.AbstractC0815K
    /* renamed from: b */
    public final void mo1948b(RecyclerView recyclerView, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        this.f3300a = true;
    }
}
