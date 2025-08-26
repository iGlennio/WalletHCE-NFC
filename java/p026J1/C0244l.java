package p026J1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p095l1.AbstractC1136c;

/* renamed from: J1.l */
/* loaded from: classes.dex */
public final class C0244l implements InterfaceC0254v {

    /* renamed from: a */
    public byte f721a;

    /* renamed from: b */
    public final C0249q f722b;

    /* renamed from: c */
    public final Inflater f723c;

    /* renamed from: d */
    public final C0245m f724d;

    /* renamed from: e */
    public final CRC32 f725e;

    public C0244l(InterfaceC0254v interfaceC0254v) {
        AbstractC1136c.m2637e(interfaceC0254v, "source");
        C0249q c0249q = new C0249q(interfaceC0254v);
        this.f722b = c0249q;
        Inflater inflater = new Inflater(true);
        this.f723c = inflater;
        this.f724d = new C0245m(c0249q, inflater);
        this.f725e = new CRC32();
    }

    /* renamed from: g */
    public static void m705g(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3)));
        }
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: a */
    public final C0256x mo100a() {
        return this.f722b.f738c.mo100a();
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: c */
    public final long mo101c(C0239g c0239g, long j2) {
        long j3;
        long j4;
        C0244l c0244l = this;
        AbstractC1136c.m2637e(c0239g, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        byte b = c0244l.f721a;
        CRC32 crc32 = c0244l.f725e;
        C0249q c0249q = c0244l.f722b;
        if (b == 0) {
            c0249q.m723r(10L);
            C0239g c0239g2 = c0249q.f736a;
            byte m667h = c0239g2.m667h(3L);
            boolean z2 = ((m667h >> 1) & 1) == 1;
            if (z2) {
                c0244l.m706h(c0239g2, 0L, 10L);
            }
            m705g("ID1ID2", 8075, c0249q.m720o());
            c0249q.m724s(8L);
            if (((m667h >> 2) & 1) == 1) {
                c0249q.m723r(2L);
                if (z2) {
                    m706h(c0239g2, 0L, 2L);
                }
                short m675p = c0239g2.m675p();
                long j5 = (short) (((m675p & 255) << 8) | ((m675p & 65280) >>> 8));
                c0249q.m723r(j5);
                if (z2) {
                    m706h(c0239g2, 0L, j5);
                }
                c0249q.m724s(j5);
            }
            if (((m667h >> 3) & 1) == 1) {
                long m713h = c0249q.m713h((byte) 0, 0L, Long.MAX_VALUE);
                if (m713h == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    j3 = -1;
                    j4 = 2;
                    m706h(c0239g2, 0L, m713h + 1);
                } else {
                    j3 = -1;
                    j4 = 2;
                }
                c0249q.m724s(m713h + 1);
            } else {
                j3 = -1;
                j4 = 2;
            }
            if (((m667h >> 4) & 1) == 1) {
                long m713h2 = c0249q.m713h((byte) 0, 0L, Long.MAX_VALUE);
                if (m713h2 == j3) {
                    throw new EOFException();
                }
                if (z2) {
                    c0244l = this;
                    c0244l.m706h(c0239g2, 0L, m713h2 + 1);
                } else {
                    c0244l = this;
                }
                c0249q.m724s(m713h2 + 1);
            } else {
                c0244l = this;
            }
            if (z2) {
                c0249q.m723r(j4);
                short m675p2 = c0239g2.m675p();
                m705g("FHCRC", (short) (((m675p2 & 255) << 8) | ((m675p2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            c0244l.f721a = (byte) 1;
        } else {
            j3 = -1;
        }
        if (c0244l.f721a == 1) {
            long j6 = c0239g.f715b;
            long mo101c = c0244l.f724d.mo101c(c0239g, j2);
            if (mo101c != j3) {
                c0244l.m706h(c0239g, j6, mo101c);
                return mo101c;
            }
            c0244l.f721a = (byte) 2;
        }
        if (c0244l.f721a == 2) {
            m705g("CRC", c0249q.m719n(), (int) crc32.getValue());
            m705g("ISIZE", c0249q.m719n(), (int) c0244l.f723c.getBytesWritten());
            c0244l.f721a = (byte) 3;
            if (!c0249q.m712g()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f724d.close();
    }

    /* renamed from: h */
    public final void m706h(C0239g c0239g, long j2, long j3) {
        C0250r c0250r = c0239g.f714a;
        AbstractC1136c.m2634b(c0250r);
        while (true) {
            int i2 = c0250r.f741c;
            int i3 = c0250r.f740b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            c0250r = c0250r.f744f;
            AbstractC1136c.m2634b(c0250r);
        }
        while (j3 > 0) {
            int min = (int) Math.min(c0250r.f741c - r6, j3);
            this.f725e.update(c0250r.f739a, (int) (c0250r.f740b + j2), min);
            j3 -= min;
            c0250r = c0250r.f744f;
            AbstractC1136c.m2634b(c0250r);
            j2 = 0;
        }
    }
}
