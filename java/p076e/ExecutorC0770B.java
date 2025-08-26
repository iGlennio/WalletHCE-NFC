package p076e;

import java.util.concurrent.Executor;

/* renamed from: e.B */
/* loaded from: classes.dex */
public final class ExecutorC0770B implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
