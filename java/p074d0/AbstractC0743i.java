package p074d0;

import android.view.Choreographer;

/* renamed from: d0.i */
/* loaded from: classes.dex */
public abstract class AbstractC0743i {
    /* renamed from: a */
    public static void m2036a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: d0.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
