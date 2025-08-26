package p104p;

import p010D1.AbstractC0104l;

/* renamed from: p.e */
/* loaded from: classes.dex */
public final class C1171e extends AbstractC0104l {
    @Override // p010D1.AbstractC0104l
    /* renamed from: Q */
    public final void mo427Q(C1172f c1172f, C1172f c1172f2) {
        c1172f.f4459b = c1172f2;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: R */
    public final void mo428R(C1172f c1172f, Thread thread) {
        c1172f.f4458a = thread;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: c */
    public final boolean mo430c(AbstractFutureC1173g abstractFutureC1173g, C1169c c1169c) {
        C1169c c1169c2 = C1169c.f4450b;
        synchronized (abstractFutureC1173g) {
            try {
                if (abstractFutureC1173g.f4465b != c1169c) {
                    return false;
                }
                abstractFutureC1173g.f4465b = c1169c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: d */
    public final boolean mo431d(AbstractFutureC1173g abstractFutureC1173g, Object obj, Object obj2) {
        synchronized (abstractFutureC1173g) {
            try {
                if (abstractFutureC1173g.f4464a != obj) {
                    return false;
                }
                abstractFutureC1173g.f4464a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: e */
    public final boolean mo432e(AbstractFutureC1173g abstractFutureC1173g, C1172f c1172f, C1172f c1172f2) {
        synchronized (abstractFutureC1173g) {
            try {
                if (abstractFutureC1173g.f4466c != c1172f) {
                    return false;
                }
                abstractFutureC1173g.f4466c = c1172f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
