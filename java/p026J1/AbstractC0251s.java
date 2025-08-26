package p026J1;

import java.util.concurrent.atomic.AtomicReference;
import p095l1.AbstractC1136c;

/* renamed from: J1.s */
/* loaded from: classes.dex */
public abstract class AbstractC0251s {

    /* renamed from: a */
    public static final C0250r f746a = new C0250r(new byte[0], 0, 0, false, false);

    /* renamed from: b */
    public static final int f747b;

    /* renamed from: c */
    public static final AtomicReference[] f748c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f747b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f748c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m729a(C0250r c0250r) {
        AbstractC1136c.m2637e(c0250r, "segment");
        if (c0250r.f744f != null || c0250r.f745g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c0250r.f742d) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        AbstractC1136c.m2636d(currentThread, "Thread.currentThread()");
        AtomicReference atomicReference = f748c[(int) (currentThread.getId() & (f747b - 1))];
        C0250r c0250r2 = (C0250r) atomicReference.get();
        if (c0250r2 == f746a) {
            return;
        }
        int i2 = c0250r2 != null ? c0250r2.f741c : 0;
        if (i2 >= 65536) {
            return;
        }
        c0250r.f744f = c0250r2;
        c0250r.f740b = 0;
        c0250r.f741c = i2 + 8192;
        while (!atomicReference.compareAndSet(c0250r2, c0250r)) {
            if (atomicReference.get() != c0250r2) {
                c0250r.f744f = null;
                return;
            }
        }
    }

    /* renamed from: b */
    public static final C0250r m730b() {
        Thread currentThread = Thread.currentThread();
        AbstractC1136c.m2636d(currentThread, "Thread.currentThread()");
        AtomicReference atomicReference = f748c[(int) (currentThread.getId() & (f747b - 1))];
        C0250r c0250r = f746a;
        C0250r c0250r2 = (C0250r) atomicReference.getAndSet(c0250r);
        if (c0250r2 == c0250r) {
            return new C0250r();
        }
        if (c0250r2 == null) {
            atomicReference.set(null);
            return new C0250r();
        }
        atomicReference.set(c0250r2.f744f);
        c0250r2.f744f = null;
        c0250r2.f741c = 0;
        return c0250r2;
    }
}
