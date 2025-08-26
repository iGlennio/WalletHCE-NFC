package androidx.fragment.app;

import java.util.ArrayList;
import p005C.AbstractC0044g;

/* renamed from: androidx.fragment.app.N */
/* loaded from: classes.dex */
public final class RunnableC0624N implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2112a;

    /* renamed from: b */
    public final /* synthetic */ C0625O f2113b;

    /* renamed from: c */
    public final /* synthetic */ C0634h f2114c;

    public /* synthetic */ RunnableC0624N(C0634h c0634h, C0625O c0625o, int i2) {
        this.f2112a = i2;
        this.f2114c = c0634h;
        this.f2113b = c0625o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2112a) {
            case 0:
                ArrayList arrayList = this.f2114c.f2169b;
                C0625O c0625o = this.f2113b;
                if (arrayList.contains(c0625o)) {
                    AbstractC0044g.m149a(c0625o.f2117c.f2207E, c0625o.f2115a);
                    break;
                }
                break;
            default:
                C0634h c0634h = this.f2114c;
                ArrayList arrayList2 = c0634h.f2169b;
                C0625O c0625o2 = this.f2113b;
                arrayList2.remove(c0625o2);
                c0634h.f2170c.remove(c0625o2);
                break;
        }
    }
}
