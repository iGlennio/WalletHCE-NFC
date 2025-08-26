package p004B1;

import java.util.zip.Deflater;
import p010D1.AbstractC0104l;
import p026J1.AbstractC0251s;
import p026J1.C0239g;
import p026J1.C0243k;
import p026J1.C0248p;
import p026J1.C0250r;
import p026J1.C0256x;
import p026J1.InterfaceC0253u;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;

/* renamed from: B1.f */
/* loaded from: classes.dex */
public final class C0035f implements InterfaceC0253u {

    /* renamed from: a */
    public final /* synthetic */ int f93a = 0;

    /* renamed from: b */
    public boolean f94b;

    /* renamed from: c */
    public final Object f95c;

    /* renamed from: d */
    public final Object f96d;

    public C0035f(C0239g c0239g, Deflater deflater) {
        this.f95c = new C0248p(c0239g);
        this.f96d = deflater;
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: a */
    public final C0256x mo103a() {
        switch (this.f93a) {
            case 0:
                return (C0243k) this.f95c;
            default:
                return ((C0248p) this.f95c).f735c.mo103a();
        }
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: b */
    public final void mo104b(C0239g c0239g, long j2) {
        switch (this.f93a) {
            case 0:
                if (this.f94b) {
                    throw new IllegalStateException("closed");
                }
                AbstractC1302b.m2993b(c0239g.f715b, 0L, j2);
                ((C0248p) ((C0037h) this.f96d).f99b).mo104b(c0239g, j2);
                return;
            default:
                AbstractC0104l.m401f(c0239g.f715b, 0L, j2);
                while (j2 > 0) {
                    C0250r c0250r = c0239g.f714a;
                    AbstractC1136c.m2634b(c0250r);
                    int min = (int) Math.min(j2, c0250r.f741c - c0250r.f740b);
                    ((Deflater) this.f96d).setInput(c0250r.f739a, c0250r.f740b, min);
                    m105g(false);
                    long j3 = min;
                    c0239g.f715b -= j3;
                    int i2 = c0250r.f740b + min;
                    c0250r.f740b = i2;
                    if (i2 == c0250r.f741c) {
                        c0239g.f714a = c0250r.m725a();
                        AbstractC0251s.m729a(c0250r);
                    }
                    j2 -= j3;
                }
                return;
        }
    }

    @Override // p026J1.InterfaceC0253u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f93a) {
            case 0:
                if (this.f94b) {
                    return;
                }
                this.f94b = true;
                C0037h c0037h = (C0037h) this.f96d;
                c0037h.getClass();
                C0243k c0243k = (C0243k) this.f95c;
                C0256x c0256x = c0243k.f720e;
                c0243k.f720e = C0256x.f751d;
                c0256x.mo697a();
                c0256x.mo698b();
                c0037h.f100c = 3;
                return;
            default:
                Deflater deflater = (Deflater) this.f96d;
                if (this.f94b) {
                    return;
                }
                try {
                    deflater.finish();
                    m105g(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((C0248p) this.f95c).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.f94b = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    @Override // p026J1.InterfaceC0253u, java.io.Flushable
    public final void flush() {
        switch (this.f93a) {
            case 0:
                if (!this.f94b) {
                    ((C0248p) ((C0037h) this.f96d).f99b).flush();
                    break;
                }
                break;
            default:
                m105g(true);
                ((C0248p) this.f95c).flush();
                break;
        }
    }

    /* renamed from: g */
    public void m105g(boolean z2) {
        C0250r m680u;
        int deflate;
        C0248p c0248p = (C0248p) this.f95c;
        C0239g c0239g = c0248p.f733a;
        while (true) {
            m680u = c0239g.m680u(1);
            Deflater deflater = (Deflater) this.f96d;
            byte[] bArr = m680u.f739a;
            if (z2) {
                int i2 = m680u.f741c;
                deflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                int i3 = m680u.f741c;
                deflate = deflater.deflate(bArr, i3, 8192 - i3);
            }
            if (deflate > 0) {
                m680u.f741c += deflate;
                c0239g.f715b += deflate;
                c0248p.m709g();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (m680u.f740b == m680u.f741c) {
            c0239g.f714a = m680u.m725a();
            AbstractC0251s.m729a(m680u);
        }
    }

    public String toString() {
        switch (this.f93a) {
            case 1:
                return "DeflaterSink(" + ((C0248p) this.f95c) + ')';
            default:
                return super.toString();
        }
    }

    public C0035f(C0037h c0037h) {
        this.f96d = c0037h;
        this.f95c = new C0243k(((C0248p) c0037h.f99b).f735c.mo103a());
    }
}
