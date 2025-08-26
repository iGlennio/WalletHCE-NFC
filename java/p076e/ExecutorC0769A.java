package p076e;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p002B.RunnableC0024n;

/* renamed from: e.A */
/* loaded from: classes.dex */
public final class ExecutorC0769A implements Executor {

    /* renamed from: a */
    public final Object f2999a = new Object();

    /* renamed from: b */
    public final ArrayDeque f3000b = new ArrayDeque();

    /* renamed from: c */
    public final ExecutorC0770B f3001c;

    /* renamed from: d */
    public Runnable f3002d;

    public ExecutorC0769A(ExecutorC0770B executorC0770B) {
        this.f3001c = executorC0770B;
    }

    /* renamed from: a */
    public final void m2061a() {
        synchronized (this.f2999a) {
            try {
                Runnable runnable = (Runnable) this.f3000b.poll();
                this.f3002d = runnable;
                if (runnable != null) {
                    this.f3001c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2999a) {
            try {
                this.f3000b.add(new RunnableC0024n(this, 2, runnable));
                if (this.f3002d == null) {
                    m2061a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
