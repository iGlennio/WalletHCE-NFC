package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.D */
/* loaded from: classes.dex */
public final class C0614D implements InterfaceC0613C {

    /* renamed from: a */
    public final int f2027a;

    /* renamed from: b */
    public final /* synthetic */ C0615E f2028b;

    public C0614D(C0615E c0615e, int i2) {
        this.f2028b = c0615e;
        this.f2027a = i2;
    }

    @Override // androidx.fragment.app.InterfaceC0613C
    /* renamed from: a */
    public final boolean mo1555a(ArrayList arrayList, ArrayList arrayList2) {
        C0615E c0615e = this.f2028b;
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0615e.f2052q;
        int i2 = this.f2027a;
        if (abstractComponentCallbacksC0641o == null || i2 >= 0 || !abstractComponentCallbacksC0641o.m1665g().m1567K()) {
            return c0615e.m1568L(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
