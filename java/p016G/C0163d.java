package p016G;

/* renamed from: G.d */
/* loaded from: classes.dex */
public final class C0163d {

    /* renamed from: a */
    public boolean f493a;

    /* renamed from: b */
    public InterfaceC0162c f494b;

    /* renamed from: c */
    public boolean f495c;

    /* renamed from: a */
    public final void m496a(InterfaceC0162c interfaceC0162c) {
        synchronized (this) {
            while (this.f495c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f494b == interfaceC0162c) {
                return;
            }
            this.f494b = interfaceC0162c;
            if (this.f493a) {
                interfaceC0162c.mo179o();
            }
        }
    }
}
