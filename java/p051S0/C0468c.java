package p051S0;

import p068a1.C0558a;
import p068a1.C0559b;

/* renamed from: S0.c */
/* loaded from: classes.dex */
public final class C0468c extends AbstractC0477l {

    /* renamed from: a */
    public AbstractC0477l f1277a;

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        AbstractC0477l abstractC0477l = this.f1277a;
        if (abstractC0477l != null) {
            return abstractC0477l.mo1221a(c0558a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        AbstractC0477l abstractC0477l = this.f1277a;
        if (abstractC0477l == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC0477l.mo1222b(c0559b, obj);
    }
}
