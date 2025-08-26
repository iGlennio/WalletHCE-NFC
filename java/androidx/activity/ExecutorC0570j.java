package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import p014F0.RunnableC0130G;
import p047Q1.C0456c;
import p076e.AbstractActivityC0782f;

/* renamed from: androidx.activity.j */
/* loaded from: classes.dex */
public final class ExecutorC0570j implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b */
    public Runnable f1578b;

    /* renamed from: d */
    public final /* synthetic */ AbstractActivityC0782f f1580d;

    /* renamed from: a */
    public final long f1577a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c */
    public boolean f1579c = false;

    public ExecutorC0570j(AbstractActivityC0782f abstractActivityC0782f) {
        this.f1580d = abstractActivityC0782f;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1578b = runnable;
        View decorView = this.f1580d.getWindow().getDecorView();
        if (!this.f1579c) {
            decorView.postOnAnimation(new RunnableC0130G(7, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1578b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1577a) {
                this.f1579c = false;
                this.f1580d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1578b = null;
        C0456c c0456c = this.f1580d.f1588i;
        synchronized (c0456c.f1250b) {
            z2 = c0456c.f1249a;
        }
        if (z2) {
            this.f1579c = false;
            this.f1580d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1580d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
