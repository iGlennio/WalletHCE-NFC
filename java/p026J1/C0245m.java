package p026J1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p095l1.AbstractC1136c;

/* renamed from: J1.m */
/* loaded from: classes.dex */
public final class C0245m implements InterfaceC0254v {

    /* renamed from: a */
    public int f726a;

    /* renamed from: b */
    public boolean f727b;

    /* renamed from: c */
    public final C0249q f728c;

    /* renamed from: d */
    public final Inflater f729d;

    public C0245m(C0249q c0249q, Inflater inflater) {
        this.f728c = c0249q;
        this.f729d = inflater;
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: a */
    public final C0256x mo100a() {
        return this.f728c.f738c.mo100a();
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: c */
    public final long mo101c(C0239g c0239g, long j2) {
        AbstractC1136c.m2637e(c0239g, "sink");
        do {
            long m707g = m707g(c0239g, j2);
            if (m707g > 0) {
                return m707g;
            }
            Inflater inflater = this.f729d;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f728c.m712g());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f727b) {
            return;
        }
        this.f729d.end();
        this.f727b = true;
        this.f728c.close();
    }

    /* renamed from: g */
    public final long m707g(C0239g c0239g, long j2) {
        Inflater inflater = this.f729d;
        AbstractC1136c.m2637e(c0239g, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f727b) {
            throw new IllegalStateException("closed");
        }
        if (j2 != 0) {
            try {
                C0250r m680u = c0239g.m680u(1);
                int min = (int) Math.min(j2, 8192 - m680u.f741c);
                boolean needsInput = inflater.needsInput();
                C0249q c0249q = this.f728c;
                if (needsInput && !c0249q.m712g()) {
                    C0250r c0250r = c0249q.f736a.f714a;
                    AbstractC1136c.m2634b(c0250r);
                    int i2 = c0250r.f741c;
                    int i3 = c0250r.f740b;
                    int i4 = i2 - i3;
                    this.f726a = i4;
                    inflater.setInput(c0250r.f739a, i3, i4);
                }
                int inflate = inflater.inflate(m680u.f739a, m680u.f741c, min);
                int i5 = this.f726a;
                if (i5 != 0) {
                    int remaining = i5 - inflater.getRemaining();
                    this.f726a -= remaining;
                    c0249q.m724s(remaining);
                }
                if (inflate > 0) {
                    m680u.f741c += inflate;
                    long j3 = inflate;
                    c0239g.f715b += j3;
                    return j3;
                }
                if (m680u.f740b == m680u.f741c) {
                    c0239g.f714a = m680u.m725a();
                    AbstractC0251s.m729a(m680u);
                }
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
        return 0L;
    }
}
