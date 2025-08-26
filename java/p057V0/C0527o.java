package p057V0;

import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p051S0.InterfaceC0478m;
import p065Z0.C0551a;

/* renamed from: V0.o */
/* loaded from: classes.dex */
public final class C0527o implements InterfaceC0478m {

    /* renamed from: a */
    public final /* synthetic */ Class f1445a;

    /* renamed from: b */
    public final /* synthetic */ Class f1446b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0477l f1447c;

    public C0527o(Class cls, Class cls2, AbstractC0477l abstractC0477l) {
        this.f1445a = cls;
        this.f1446b = cls2;
        this.f1447c = abstractC0477l;
    }

    @Override // p051S0.InterfaceC0478m
    /* renamed from: a */
    public final AbstractC0477l mo1231a(C0469d c0469d, C0551a c0551a) {
        Class cls = this.f1445a;
        Class cls2 = c0551a.f1518a;
        if (cls2 == cls || cls2 == this.f1446b) {
            return this.f1447c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f1446b.getName() + "+" + this.f1445a.getName() + ",adapter=" + this.f1447c + "]";
    }
}
