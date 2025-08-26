package p090k;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: k.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC1086b implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f4226a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f4226a.getAndIncrement());
        return thread;
    }
}
