package p082g1;

import p080f1.C0864b;
import p095l1.AbstractC1136c;

/* renamed from: g1.b */
/* loaded from: classes.dex */
public class C0872b extends C0864b {
    @Override // p080f1.C0864b
    /* renamed from: a */
    public final void mo2285a(Throwable th, Throwable th2) {
        AbstractC1136c.m2637e(th, "cause");
        AbstractC1136c.m2637e(th2, "exception");
        Integer num = AbstractC0871a.f3503a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.mo2285a(th, th2);
        }
    }
}
