package p004B1;

import p026J1.C0239g;
import p026J1.C0243k;
import p026J1.C0248p;
import p026J1.C0256x;
import p026J1.InterfaceC0253u;

/* renamed from: B1.c */
/* loaded from: classes.dex */
public final class C0032c implements InterfaceC0253u {

    /* renamed from: a */
    public final C0243k f84a;

    /* renamed from: b */
    public boolean f85b;

    /* renamed from: c */
    public final /* synthetic */ C0037h f86c;

    public C0032c(C0037h c0037h) {
        this.f86c = c0037h;
        this.f84a = new C0243k(((C0248p) c0037h.f99b).f735c.mo103a());
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: a */
    public final C0256x mo103a() {
        return this.f84a;
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: b */
    public final void mo104b(C0239g c0239g, long j2) {
        if (this.f85b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        C0037h c0037h = this.f86c;
        C0248p c0248p = (C0248p) c0037h.f99b;
        if (c0248p.f734b) {
            throw new IllegalStateException("closed");
        }
        c0248p.f733a.m657A(j2);
        c0248p.m709g();
        C0248p c0248p2 = (C0248p) c0037h.f99b;
        c0248p2.mo664e("\r\n");
        c0248p2.mo104b(c0239g, j2);
        c0248p2.mo664e("\r\n");
    }

    @Override // p026J1.InterfaceC0253u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f85b) {
            return;
        }
        this.f85b = true;
        ((C0248p) this.f86c.f99b).mo664e("0\r\n\r\n");
        C0037h c0037h = this.f86c;
        C0243k c0243k = this.f84a;
        c0037h.getClass();
        C0256x c0256x = c0243k.f720e;
        c0243k.f720e = C0256x.f751d;
        c0256x.mo697a();
        c0256x.mo698b();
        this.f86c.f100c = 3;
    }

    @Override // p026J1.InterfaceC0253u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f85b) {
            return;
        }
        ((C0248p) this.f86c.f99b).flush();
    }
}
