package p026J1;

import p047Q1.AbstractC0458e;

/* renamed from: J1.b */
/* loaded from: classes.dex */
public final class C0234b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C0237e m1189g;
        while (true) {
            try {
                synchronized (C0237e.class) {
                    C0237e c0237e = C0237e.f703j;
                    m1189g = AbstractC0458e.m1189g();
                    if (m1189g == C0237e.f703j) {
                        C0237e.f703j = null;
                        return;
                    }
                }
                if (m1189g != null) {
                    m1189g.mo276k();
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
