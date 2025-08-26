package p072c1;

import java.io.Serializable;
import p092k1.InterfaceC1103a;
import p095l1.AbstractC1136c;
import p095l1.AbstractC1137d;

/* renamed from: c1.b */
/* loaded from: classes.dex */
public final class C0698b implements Serializable {

    /* renamed from: a */
    public AbstractC1137d f2479a;

    /* renamed from: b */
    public volatile Object f2480b = C0699c.f2482b;

    /* renamed from: c */
    public final Object f2481c = this;

    /* JADX WARN: Multi-variable type inference failed */
    public C0698b(InterfaceC1103a interfaceC1103a) {
        this.f2479a = (AbstractC1137d) interfaceC1103a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k1.a, l1.d] */
    /* renamed from: a */
    public final Object m1884a() {
        Object obj;
        Object obj2 = this.f2480b;
        C0699c c0699c = C0699c.f2482b;
        if (obj2 != c0699c) {
            return obj2;
        }
        synchronized (this.f2481c) {
            obj = this.f2480b;
            if (obj == c0699c) {
                ?? r12 = this.f2479a;
                AbstractC1136c.m2634b(r12);
                obj = r12.mo259a();
                this.f2480b = obj;
                this.f2479a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2480b != C0699c.f2482b ? String.valueOf(m1884a()) : "Lazy value not initialized yet.";
    }
}
