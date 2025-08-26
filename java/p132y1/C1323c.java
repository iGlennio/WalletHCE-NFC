package p132y1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p005C.AbstractC0044g;
import p043P0.RunnableC0402A;
import p088j.C0985d0;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;
import p126w1.ThreadFactoryC1301a;

/* renamed from: y1.c */
/* loaded from: classes.dex */
public final class C1323c {

    /* renamed from: h */
    public static final C1323c f5414h;

    /* renamed from: i */
    public static final Logger f5415i;

    /* renamed from: b */
    public boolean f5417b;

    /* renamed from: c */
    public long f5418c;

    /* renamed from: g */
    public final C0985d0 f5422g;

    /* renamed from: a */
    public int f5416a = 10000;

    /* renamed from: d */
    public final ArrayList f5419d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f5420e = new ArrayList();

    /* renamed from: f */
    public final RunnableC0402A f5421f = new RunnableC0402A(17, this);

    static {
        String str = AbstractC1302b.f5343g + " TaskRunner";
        AbstractC1136c.m2637e(str, "name");
        f5414h = new C1323c(new C0985d0(new ThreadFactoryC1301a(str, true)));
        Logger logger = Logger.getLogger(C1323c.class.getName());
        AbstractC1136c.m2636d(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f5415i = logger;
    }

    public C1323c(C0985d0 c0985d0) {
        this.f5422g = c0985d0;
    }

    /* renamed from: a */
    public static final void m3029a(C1323c c1323c, AbstractC1321a abstractC1321a) {
        c1323c.getClass();
        byte[] bArr = AbstractC1302b.f5337a;
        Thread currentThread = Thread.currentThread();
        AbstractC1136c.m2636d(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(abstractC1321a.f5406c);
        try {
            long mo256a = abstractC1321a.mo256a();
            synchronized (c1323c) {
                c1323c.m3030b(abstractC1321a, mo256a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (c1323c) {
                c1323c.m3030b(abstractC1321a, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m3030b(AbstractC1321a abstractC1321a, long j2) {
        byte[] bArr = AbstractC1302b.f5337a;
        C1322b c1322b = abstractC1321a.f5404a;
        AbstractC1136c.m2634b(c1322b);
        if (c1322b.f5409b != abstractC1321a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = c1322b.f5411d;
        c1322b.f5411d = false;
        c1322b.f5409b = null;
        this.f5419d.remove(c1322b);
        if (j2 != -1 && !z2 && !c1322b.f5408a) {
            c1322b.m3027d(abstractC1321a, j2, true);
        }
        if (c1322b.f5410c.isEmpty()) {
            return;
        }
        this.f5420e.add(c1322b);
    }

    /* renamed from: c */
    public final AbstractC1321a m3031c() {
        long j2;
        AbstractC1321a abstractC1321a;
        boolean z2;
        byte[] bArr = AbstractC1302b.f5337a;
        while (true) {
            ArrayList arrayList = this.f5420e;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0985d0 c0985d0 = this.f5422g;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j3 = Long.MAX_VALUE;
            AbstractC1321a abstractC1321a2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j2 = nanoTime;
                    abstractC1321a = null;
                    z2 = false;
                    break;
                }
                AbstractC1321a abstractC1321a3 = (AbstractC1321a) ((C1322b) it.next()).f5410c.get(0);
                j2 = nanoTime;
                abstractC1321a = null;
                long max = Math.max(0L, abstractC1321a3.f5405b - j2);
                if (max > 0) {
                    j3 = Math.min(max, j3);
                } else {
                    if (abstractC1321a2 != null) {
                        z2 = true;
                        break;
                    }
                    abstractC1321a2 = abstractC1321a3;
                }
                nanoTime = j2;
            }
            ArrayList arrayList2 = this.f5419d;
            if (abstractC1321a2 != null) {
                byte[] bArr2 = AbstractC1302b.f5337a;
                abstractC1321a2.f5405b = -1L;
                C1322b c1322b = abstractC1321a2.f5404a;
                AbstractC1136c.m2634b(c1322b);
                c1322b.f5410c.remove(abstractC1321a2);
                arrayList.remove(c1322b);
                c1322b.f5409b = abstractC1321a2;
                arrayList2.add(c1322b);
                if (z2 || (!this.f5417b && !arrayList.isEmpty())) {
                    RunnableC0402A runnableC0402A = this.f5421f;
                    AbstractC1136c.m2637e(runnableC0402A, "runnable");
                    ((ThreadPoolExecutor) c0985d0.f3904b).execute(runnableC0402A);
                }
                return abstractC1321a2;
            }
            if (this.f5417b) {
                if (j3 >= this.f5418c - j2) {
                    return abstractC1321a;
                }
                notify();
                return abstractC1321a;
            }
            this.f5417b = true;
            this.f5418c = j2 + j3;
            try {
                try {
                    long j4 = j3 / 1000000;
                    long j5 = j3 - (1000000 * j4);
                    if (j4 > 0 || j3 > 0) {
                        wait(j4, (int) j5);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        ((C1322b) arrayList2.get(size)).m3025b();
                    }
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        C1322b c1322b2 = (C1322b) arrayList.get(size2);
                        c1322b2.m3025b();
                        if (c1322b2.f5410c.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f5417b = false;
            }
        }
    }

    /* renamed from: d */
    public final void m3032d(C1322b c1322b) {
        AbstractC1136c.m2637e(c1322b, "taskQueue");
        byte[] bArr = AbstractC1302b.f5337a;
        if (c1322b.f5409b == null) {
            boolean isEmpty = c1322b.f5410c.isEmpty();
            ArrayList arrayList = this.f5420e;
            if (isEmpty) {
                arrayList.remove(c1322b);
            } else {
                AbstractC1136c.m2637e(arrayList, "$this$addIfAbsent");
                if (!arrayList.contains(c1322b)) {
                    arrayList.add(c1322b);
                }
            }
        }
        boolean z2 = this.f5417b;
        C0985d0 c0985d0 = this.f5422g;
        if (z2) {
            notify();
            return;
        }
        RunnableC0402A runnableC0402A = this.f5421f;
        AbstractC1136c.m2637e(runnableC0402A, "runnable");
        ((ThreadPoolExecutor) c0985d0.f3904b).execute(runnableC0402A);
    }

    /* renamed from: e */
    public final C1322b m3033e() {
        int i2;
        synchronized (this) {
            i2 = this.f5416a;
            this.f5416a = i2 + 1;
        }
        return new C1322b(this, AbstractC0044g.m153e("Q", i2));
    }
}
