package p026J1;

import java.io.IOException;
import java.io.OutputStream;
import p007C1.C0084x;
import p010D1.AbstractC0104l;
import p095l1.AbstractC1136c;

/* renamed from: J1.c */
/* loaded from: classes.dex */
public final class C0235c implements InterfaceC0253u {

    /* renamed from: a */
    public final /* synthetic */ int f695a = 0;

    /* renamed from: b */
    public final C0084x f696b;

    /* renamed from: c */
    public final Object f697c;

    public C0235c(OutputStream outputStream, C0084x c0084x) {
        this.f697c = outputStream;
        this.f696b = c0084x;
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: a */
    public final C0256x mo103a() {
        switch (this.f695a) {
        }
        return this.f696b;
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: b */
    public final void mo104b(C0239g c0239g, long j2) {
        switch (this.f695a) {
            case 0:
                AbstractC0104l.m401f(c0239g.f715b, 0L, j2);
                long j3 = j2;
                while (true) {
                    long j4 = 0;
                    if (j3 <= 0) {
                        return;
                    }
                    C0250r c0250r = c0239g.f714a;
                    AbstractC1136c.m2634b(c0250r);
                    while (true) {
                        if (j4 < 65536) {
                            j4 += c0250r.f741c - c0250r.f740b;
                            if (j4 >= j3) {
                                j4 = j3;
                            } else {
                                c0250r = c0250r.f744f;
                                AbstractC1136c.m2634b(c0250r);
                            }
                        }
                    }
                    C0084x c0084x = this.f696b;
                    c0084x.m653i();
                    try {
                        try {
                            ((C0235c) this.f697c).mo104b(c0239g, j4);
                            if (c0084x.m654j()) {
                                throw c0084x.m278m(null);
                            }
                            j3 -= j4;
                        } catch (IOException e2) {
                            if (!c0084x.m654j()) {
                                throw e2;
                            }
                            throw c0084x.m278m(e2);
                        }
                    } catch (Throwable th) {
                        c0084x.m654j();
                        throw th;
                    }
                }
            default:
                AbstractC0104l.m401f(c0239g.f715b, 0L, j2);
                while (j2 > 0) {
                    this.f696b.mo702f();
                    C0250r c0250r2 = c0239g.f714a;
                    AbstractC1136c.m2634b(c0250r2);
                    int min = (int) Math.min(j2, c0250r2.f741c - c0250r2.f740b);
                    ((OutputStream) this.f697c).write(c0250r2.f739a, c0250r2.f740b, min);
                    int i2 = c0250r2.f740b + min;
                    c0250r2.f740b = i2;
                    long j5 = min;
                    j2 -= j5;
                    c0239g.f715b -= j5;
                    if (i2 == c0250r2.f741c) {
                        c0239g.f714a = c0250r2.m725a();
                        AbstractC0251s.m729a(c0250r2);
                    }
                }
                return;
        }
    }

    @Override // p026J1.InterfaceC0253u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f695a) {
            case 0:
                C0084x c0084x = this.f696b;
                c0084x.m653i();
                try {
                    ((C0235c) this.f697c).close();
                    if (c0084x.m654j()) {
                        throw c0084x.m278m(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!c0084x.m654j()) {
                        throw e2;
                    }
                    throw c0084x.m278m(e2);
                } finally {
                    c0084x.m654j();
                }
            default:
                ((OutputStream) this.f697c).close();
                return;
        }
    }

    @Override // p026J1.InterfaceC0253u, java.io.Flushable
    public final void flush() {
        switch (this.f695a) {
            case 0:
                C0084x c0084x = this.f696b;
                c0084x.m653i();
                try {
                    ((C0235c) this.f697c).flush();
                    if (c0084x.m654j()) {
                        throw c0084x.m278m(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!c0084x.m654j()) {
                        throw e2;
                    }
                    throw c0084x.m278m(e2);
                } finally {
                    c0084x.m654j();
                }
            default:
                ((OutputStream) this.f697c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f695a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0235c) this.f697c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f697c) + ')';
        }
    }

    public C0235c(C0084x c0084x, C0235c c0235c) {
        this.f696b = c0084x;
        this.f697c = c0235c;
    }
}
