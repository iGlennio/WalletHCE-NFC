package p026J1;

import java.nio.ByteBuffer;
import p095l1.AbstractC1136c;

/* renamed from: J1.p */
/* loaded from: classes.dex */
public final class C0248p implements InterfaceC0240h {

    /* renamed from: a */
    public final C0239g f733a;

    /* renamed from: b */
    public boolean f734b;

    /* renamed from: c */
    public final InterfaceC0253u f735c;

    public C0248p(InterfaceC0253u interfaceC0253u) {
        AbstractC1136c.m2637e(interfaceC0253u, "sink");
        this.f735c = interfaceC0253u;
        this.f733a = new C0239g();
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: a */
    public final C0256x mo103a() {
        return this.f735c.mo103a();
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: b */
    public final void mo104b(C0239g c0239g, long j2) {
        AbstractC1136c.m2637e(c0239g, "source");
        if (this.f734b) {
            throw new IllegalStateException("closed");
        }
        this.f733a.mo104b(c0239g, j2);
        m709g();
    }

    @Override // p026J1.InterfaceC0253u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC0253u interfaceC0253u = this.f735c;
        if (this.f734b) {
            return;
        }
        try {
            C0239g c0239g = this.f733a;
            long j2 = c0239g.f715b;
            if (j2 > 0) {
                interfaceC0253u.mo104b(c0239g, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC0253u.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f734b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p026J1.InterfaceC0240h
    /* renamed from: e */
    public final InterfaceC0240h mo664e(String str) {
        AbstractC1136c.m2637e(str, "string");
        if (this.f734b) {
            throw new IllegalStateException("closed");
        }
        this.f733a.m660D(str);
        m709g();
        return this;
    }

    @Override // p026J1.InterfaceC0253u, java.io.Flushable
    public final void flush() {
        if (this.f734b) {
            throw new IllegalStateException("closed");
        }
        C0239g c0239g = this.f733a;
        long j2 = c0239g.f715b;
        InterfaceC0253u interfaceC0253u = this.f735c;
        if (j2 > 0) {
            interfaceC0253u.mo104b(c0239g, j2);
        }
        interfaceC0253u.flush();
    }

    /* renamed from: g */
    public final InterfaceC0240h m709g() {
        if (this.f734b) {
            throw new IllegalStateException("closed");
        }
        C0239g c0239g = this.f733a;
        long j2 = c0239g.f715b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            C0250r c0250r = c0239g.f714a;
            AbstractC1136c.m2634b(c0250r);
            C0250r c0250r2 = c0250r.f745g;
            AbstractC1136c.m2634b(c0250r2);
            if (c0250r2.f741c < 8192 && c0250r2.f743e) {
                j2 -= r6 - c0250r2.f740b;
            }
        }
        if (j2 > 0) {
            this.f735c.mo104b(c0239g, j2);
        }
        return this;
    }

    /* renamed from: h */
    public final InterfaceC0240h m710h(int i2) {
        if (this.f734b) {
            throw new IllegalStateException("closed");
        }
        this.f733a.m685z(i2);
        m709g();
        return this;
    }

    /* renamed from: i */
    public final InterfaceC0240h m711i(int i2) {
        if (this.f734b) {
            throw new IllegalStateException("closed");
        }
        this.f733a.m658B(i2);
        m709g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f734b;
    }

    public final String toString() {
        return "buffer(" + this.f735c + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1136c.m2637e(byteBuffer, "source");
        if (this.f734b) {
            throw new IllegalStateException("closed");
        }
        int write = this.f733a.write(byteBuffer);
        m709g();
        return write;
    }
}
