package p026J1;

import java.io.IOException;
import java.io.InputStream;
import p007C1.C0084x;
import p010D1.AbstractC0096d;
import p095l1.AbstractC1136c;

/* renamed from: J1.d */
/* loaded from: classes.dex */
public final class C0236d implements InterfaceC0254v {

    /* renamed from: a */
    public final /* synthetic */ int f698a;

    /* renamed from: b */
    public final Object f699b;

    /* renamed from: c */
    public final Object f700c;

    public /* synthetic */ C0236d(Object obj, int i2, Object obj2) {
        this.f698a = i2;
        this.f699b = obj;
        this.f700c = obj2;
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: a */
    public final C0256x mo100a() {
        switch (this.f698a) {
            case 0:
                return (C0084x) this.f699b;
            default:
                return (C0256x) this.f700c;
        }
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: c */
    public final long mo101c(C0239g c0239g, long j2) {
        switch (this.f698a) {
            case 0:
                AbstractC1136c.m2637e(c0239g, "sink");
                C0084x c0084x = (C0084x) this.f699b;
                c0084x.m653i();
                try {
                    long mo101c = ((C0236d) this.f700c).mo101c(c0239g, j2);
                    if (c0084x.m654j()) {
                        throw c0084x.m278m(null);
                    }
                    return mo101c;
                } catch (IOException e2) {
                    if (c0084x.m654j()) {
                        throw c0084x.m278m(e2);
                    }
                    throw e2;
                } finally {
                    c0084x.m654j();
                }
            default:
                AbstractC1136c.m2637e(c0239g, "sink");
                if (j2 == 0) {
                    return 0L;
                }
                if (!(j2 >= 0)) {
                    throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
                }
                try {
                    ((C0256x) this.f700c).mo702f();
                    C0250r m680u = c0239g.m680u(1);
                    int read = ((InputStream) this.f699b).read(m680u.f739a, m680u.f741c, (int) Math.min(j2, 8192 - m680u.f741c));
                    if (read == -1) {
                        if (m680u.f740b == m680u.f741c) {
                            c0239g.f714a = m680u.m725a();
                            AbstractC0251s.m729a(m680u);
                        }
                        return -1L;
                    }
                    m680u.f741c += read;
                    long j3 = read;
                    c0239g.f715b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (AbstractC0096d.m326J(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f698a) {
            case 0:
                C0084x c0084x = (C0084x) this.f699b;
                c0084x.m653i();
                try {
                    ((C0236d) this.f700c).close();
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
                ((InputStream) this.f699b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f698a) {
            case 0:
                return "AsyncTimeout.source(" + ((C0236d) this.f700c) + ')';
            default:
                return "source(" + ((InputStream) this.f699b) + ')';
        }
    }
}
