package p018H;

import java.util.concurrent.ThreadFactory;

/* renamed from: H.m */
/* loaded from: classes.dex */
public final class ThreadFactoryC0193m implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0192l(runnable);
    }
}
