package p116t;

import java.util.Iterator;

/* renamed from: t.g */
/* loaded from: classes.dex */
public class C1221g extends C1220f {

    /* renamed from: m */
    public int f4799m;

    public C1221g(AbstractC1229o abstractC1229o) {
        super(abstractC1229o);
        if (abstractC1229o instanceof C1225k) {
            this.f4791e = 2;
        } else {
            this.f4791e = 3;
        }
    }

    @Override // p116t.C1220f
    /* renamed from: d */
    public final void mo2876d(int i2) {
        if (this.f4796j) {
            return;
        }
        this.f4796j = true;
        this.f4793g = i2;
        Iterator it = this.f4797k.iterator();
        while (it.hasNext()) {
            InterfaceC1218d interfaceC1218d = (InterfaceC1218d) it.next();
            interfaceC1218d.mo2859a(interfaceC1218d);
        }
    }
}
