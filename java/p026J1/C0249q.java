package p026J1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p010D1.AbstractC0104l;
import p029K1.AbstractC0332a;
import p095l1.AbstractC1136c;

/* renamed from: J1.q */
/* loaded from: classes.dex */
public final class C0249q implements InterfaceC0241i {

    /* renamed from: a */
    public final C0239g f736a;

    /* renamed from: b */
    public boolean f737b;

    /* renamed from: c */
    public final InterfaceC0254v f738c;

    public C0249q(InterfaceC0254v interfaceC0254v) {
        AbstractC1136c.m2637e(interfaceC0254v, "source");
        this.f738c = interfaceC0254v;
        this.f736a = new C0239g();
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: a */
    public final C0256x mo100a() {
        return this.f738c.mo100a();
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: c */
    public final long mo101c(C0239g c0239g, long j2) {
        AbstractC1136c.m2637e(c0239g, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f737b) {
            throw new IllegalStateException("closed");
        }
        C0239g c0239g2 = this.f736a;
        if (c0239g2.f715b == 0) {
            if (this.f738c.mo101c(c0239g2, 8192) == -1) {
                return -1L;
            }
        }
        return c0239g2.mo101c(c0239g, Math.min(j2, c0239g2.f715b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f737b) {
            return;
        }
        this.f737b = true;
        this.f738c.close();
        C0239g c0239g = this.f736a;
        c0239g.m678s(c0239g.f715b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        return -1;
     */
    @Override // p026J1.InterfaceC0241i
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo663d(p026J1.C0247o r7) {
        /*
            r6 = this;
            java.lang.String r0 = "options"
            p095l1.AbstractC1136c.m2637e(r7, r0)
            boolean r0 = r6.f737b
            if (r0 != 0) goto L33
        L9:
            J1.g r0 = r6.f736a
            r1 = 1
            int r1 = p029K1.AbstractC0332a.m955b(r0, r7, r1)
            r2 = -2
            r3 = -1
            if (r1 == r2) goto L23
            if (r1 == r3) goto L32
            J1.j[] r7 = r7.f731a
            r7 = r7[r1]
            int r7 = r7.mo688c()
            long r2 = (long) r7
            r0.m678s(r2)
            return r1
        L23:
            r1 = 8192(0x2000, float:1.148E-41)
            long r1 = (long) r1
            J1.v r4 = r6.f738c
            long r0 = r4.mo101c(r0, r1)
            r4 = -1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L9
        L32:
            return r3
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p026J1.C0249q.mo663d(J1.o):int");
    }

    @Override // p026J1.InterfaceC0241i
    /* renamed from: f */
    public final String mo665f(Charset charset) {
        C0239g c0239g = this.f736a;
        c0239g.m684y(this.f738c);
        return c0239g.m676q(c0239g.f715b, charset);
    }

    /* renamed from: g */
    public final boolean m712g() {
        if (this.f737b) {
            throw new IllegalStateException("closed");
        }
        C0239g c0239g = this.f736a;
        if (c0239g.m666g()) {
            return this.f738c.mo101c(c0239g, (long) 8192) == -1;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m713h(byte r21, long r22, long r24) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p026J1.C0249q.m713h(byte, long, long):long");
    }

    /* renamed from: i */
    public final byte m714i() {
        m723r(1L);
        return this.f736a.m670k();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f737b;
    }

    /* renamed from: j */
    public final C0242j m715j(long j2) {
        m723r(j2);
        return this.f736a.m672m(j2);
    }

    /* renamed from: k */
    public final void m716k(C0239g c0239g, long j2) {
        C0239g c0239g2 = this.f736a;
        try {
            m723r(j2);
            long j3 = c0239g2.f715b;
            if (j3 >= j2) {
                c0239g.mo104b(c0239g2, j2);
            } else {
                c0239g.mo104b(c0239g2, j3);
                throw new EOFException();
            }
        } catch (EOFException e2) {
            c0239g.m684y(c0239g2);
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
    
        r14.f715b -= r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0131, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[LOOP:2: B:28:0x007f->B:37:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m717l() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p026J1.C0249q.m717l():long");
    }

    /* renamed from: m */
    public final int m718m() {
        m723r(4L);
        return this.f736a.m674o();
    }

    /* renamed from: n */
    public final int m719n() {
        m723r(4L);
        int m674o = this.f736a.m674o();
        return ((m674o & 255) << 24) | (((-16777216) & m674o) >>> 24) | ((16711680 & m674o) >>> 8) | ((65280 & m674o) << 8);
    }

    /* renamed from: o */
    public final short m720o() {
        m723r(2L);
        return this.f736a.m675p();
    }

    /* renamed from: p */
    public final String m721p(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        byte b = (byte) 10;
        long m713h = m713h(b, 0L, j3);
        C0239g c0239g = this.f736a;
        if (m713h != -1) {
            return AbstractC0332a.m954a(c0239g, m713h);
        }
        if (j3 < Long.MAX_VALUE && m722q(j3) && c0239g.m667h(j3 - 1) == ((byte) 13) && m722q(j3 + 1) && c0239g.m667h(j3) == b) {
            return AbstractC0332a.m954a(c0239g, j3);
        }
        C0239g c0239g2 = new C0239g();
        long min = Math.min(32, c0239g.f715b);
        long j4 = 0;
        c0239g.getClass();
        AbstractC1136c.m2637e(c0239g2, "out");
        AbstractC0104l.m401f(c0239g.f715b, 0L, min);
        if (min != 0) {
            c0239g2.f715b += min;
            C0250r c0250r = c0239g.f714a;
            while (true) {
                AbstractC1136c.m2634b(c0250r);
                long j5 = c0250r.f741c - c0250r.f740b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                c0250r = c0250r.f744f;
            }
            long j6 = j4;
            long j7 = min;
            while (j7 > 0) {
                AbstractC1136c.m2634b(c0250r);
                C0250r m727c = c0250r.m727c();
                int i2 = m727c.f740b + ((int) j6);
                m727c.f740b = i2;
                m727c.f741c = Math.min(i2 + ((int) j7), m727c.f741c);
                C0250r c0250r2 = c0239g2.f714a;
                if (c0250r2 == null) {
                    m727c.f745g = m727c;
                    m727c.f744f = m727c;
                    c0239g2.f714a = m727c;
                } else {
                    C0250r c0250r3 = c0250r2.f745g;
                    AbstractC1136c.m2634b(c0250r3);
                    c0250r3.m726b(m727c);
                }
                j7 -= m727c.f741c - m727c.f740b;
                c0250r = c0250r.f744f;
                j6 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c0239g.f715b, j2) + " content=" + c0239g2.m672m(c0239g2.f715b).mo689d() + "…");
    }

    /* renamed from: q */
    public final boolean m722q(long j2) {
        C0239g c0239g;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f737b) {
            throw new IllegalStateException("closed");
        }
        do {
            c0239g = this.f736a;
            if (c0239g.f715b >= j2) {
                return true;
            }
        } while (this.f738c.mo101c(c0239g, 8192) != -1);
        return false;
    }

    /* renamed from: r */
    public final void m723r(long j2) {
        if (!m722q(j2)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1136c.m2637e(byteBuffer, "sink");
        C0239g c0239g = this.f736a;
        if (c0239g.f715b == 0) {
            if (this.f738c.mo101c(c0239g, 8192) == -1) {
                return -1;
            }
        }
        return c0239g.read(byteBuffer);
    }

    /* renamed from: s */
    public final void m724s(long j2) {
        if (this.f737b) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            C0239g c0239g = this.f736a;
            if (c0239g.f715b == 0) {
                if (this.f738c.mo101c(c0239g, 8192) == -1) {
                    throw new EOFException();
                }
            }
            long min = Math.min(j2, c0239g.f715b);
            c0239g.m678s(min);
            j2 -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f738c + ')';
    }
}
