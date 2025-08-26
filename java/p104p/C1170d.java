package p104p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010D1.AbstractC0104l;

/* renamed from: p.d */
/* loaded from: classes.dex */
public final class C1170d extends AbstractC0104l {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f4452a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f4453b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f4454c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f4455d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f4456e;

    public C1170d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4452a = atomicReferenceFieldUpdater;
        this.f4453b = atomicReferenceFieldUpdater2;
        this.f4454c = atomicReferenceFieldUpdater3;
        this.f4455d = atomicReferenceFieldUpdater4;
        this.f4456e = atomicReferenceFieldUpdater5;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: Q */
    public final void mo427Q(C1172f c1172f, C1172f c1172f2) {
        this.f4453b.lazySet(c1172f, c1172f2);
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: R */
    public final void mo428R(C1172f c1172f, Thread thread) {
        this.f4452a.lazySet(c1172f, thread);
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: c */
    public final boolean mo430c(AbstractFutureC1173g abstractFutureC1173g, C1169c c1169c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1169c c1169c2 = C1169c.f4450b;
        do {
            atomicReferenceFieldUpdater = this.f4455d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1173g, c1169c, c1169c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1173g) == c1169c);
        return false;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: d */
    public final boolean mo431d(AbstractFutureC1173g abstractFutureC1173g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4456e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1173g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1173g) == obj);
        return false;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: e */
    public final boolean mo432e(AbstractFutureC1173g abstractFutureC1173g, C1172f c1172f, C1172f c1172f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4454c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1173g, c1172f, c1172f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1173g) == c1172f);
        return false;
    }
}
