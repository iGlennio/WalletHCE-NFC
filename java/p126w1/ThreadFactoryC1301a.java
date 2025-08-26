package p126w1;

import java.util.concurrent.ThreadFactory;

/* renamed from: w1.a */
/* loaded from: classes.dex */
public final class ThreadFactoryC1301a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f5335a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5336b;

    public ThreadFactoryC1301a(String str, boolean z2) {
        this.f5335a = str;
        this.f5336b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f5335a);
        thread.setDaemon(this.f5336b);
        return thread;
    }
}
