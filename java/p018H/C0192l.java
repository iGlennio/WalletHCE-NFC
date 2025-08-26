package p018H;

import android.os.Process;

/* renamed from: H.l */
/* loaded from: classes.dex */
public final class C0192l extends Thread {

    /* renamed from: a */
    public final int f561a;

    public C0192l(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f561a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f561a);
        super.run();
    }
}
