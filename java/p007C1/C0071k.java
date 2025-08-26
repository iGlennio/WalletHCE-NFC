package p007C1;

import java.io.IOException;
import p072c1.C0699c;
import p092k1.InterfaceC1103a;
import p126w1.AbstractC1302b;

/* renamed from: C1.k */
/* loaded from: classes.dex */
public final class C0071k implements InterfaceC1103a {

    /* renamed from: a */
    public final C0081u f182a;

    /* renamed from: b */
    public final /* synthetic */ C0077q f183b;

    public C0071k(C0077q c0077q, C0081u c0081u) {
        this.f183b = c0077q;
        this.f182a = c0081u;
    }

    @Override // p092k1.InterfaceC1103a
    /* renamed from: a */
    public final Object mo259a() {
        C0077q c0077q = this.f183b;
        C0081u c0081u = this.f182a;
        try {
        } catch (IOException e2) {
            c0077q.m260g(2, 2, e2);
        } catch (Throwable th) {
            c0077q.m260g(3, 3, null);
            AbstractC1302b.m2994c(c0081u);
            throw th;
        }
        if (!c0081u.m269g(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (c0081u.m269g(false, this)) {
        }
        c0077q.m260g(1, 9, null);
        AbstractC1302b.m2994c(c0081u);
        return C0699c.f2483c;
    }
}
