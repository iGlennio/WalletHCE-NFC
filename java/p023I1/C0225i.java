package p023I1;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import p004B1.C0035f;
import p010D1.AbstractC0104l;
import p026J1.C0238f;
import p026J1.C0239g;
import p026J1.C0242j;
import p026J1.C0248p;
import p026J1.C0250r;
import p095l1.AbstractC1136c;

/* renamed from: I1.i */
/* loaded from: classes.dex */
public final class C0225i implements Closeable {

    /* renamed from: a */
    public final C0239g f657a;

    /* renamed from: b */
    public final C0239g f658b;

    /* renamed from: c */
    public boolean f659c;

    /* renamed from: d */
    public C0217a f660d;

    /* renamed from: e */
    public final byte[] f661e;

    /* renamed from: f */
    public final C0238f f662f;

    /* renamed from: g */
    public final C0248p f663g;

    /* renamed from: h */
    public final Random f664h;

    /* renamed from: i */
    public final boolean f665i;

    /* renamed from: j */
    public final boolean f666j;

    /* renamed from: k */
    public final long f667k;

    public C0225i(C0248p c0248p, Random random, boolean z2, boolean z3, long j2) {
        AbstractC1136c.m2637e(c0248p, "sink");
        this.f663g = c0248p;
        this.f664h = random;
        this.f665i = z2;
        this.f666j = z3;
        this.f667k = j2;
        this.f657a = new C0239g();
        this.f658b = c0248p.f733a;
        this.f661e = new byte[4];
        this.f662f = new C0238f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0217a c0217a = this.f660d;
        if (c0217a != null) {
            c0217a.close();
        }
    }

    /* renamed from: g */
    public final void m628g(int i2, C0242j c0242j) {
        if (this.f659c) {
            throw new IOException("closed");
        }
        int mo688c = c0242j.mo688c();
        if (mo688c > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        C0239g c0239g = this.f658b;
        c0239g.m685z(i2 | 128);
        c0239g.m685z(mo688c | 128);
        byte[] bArr = this.f661e;
        AbstractC1136c.m2634b(bArr);
        this.f664h.nextBytes(bArr);
        c0239g.m682w(bArr);
        if (mo688c > 0) {
            long j2 = c0239g.f715b;
            c0239g.m681v(c0242j);
            C0238f c0238f = this.f662f;
            AbstractC1136c.m2634b(c0238f);
            c0239g.m669j(c0238f);
            c0238f.m656h(j2);
            AbstractC0104l.m398U(c0238f, bArr);
            c0238f.close();
        }
        this.f663g.flush();
    }

    /* renamed from: h */
    public final void m629h(C0242j c0242j) {
        long j2;
        int i2;
        if (this.f659c) {
            throw new IOException("closed");
        }
        C0239g c0239g = this.f657a;
        c0239g.m681v(c0242j);
        if (!this.f665i || c0242j.f719c.length < this.f667k) {
            j2 = 0;
            i2 = 129;
        } else {
            C0217a c0217a = this.f660d;
            if (c0217a == null) {
                c0217a = new C0217a(0, this.f666j);
                this.f660d = c0217a;
            }
            C0239g c0239g2 = c0217a.f604b;
            if (c0239g2.f715b != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (c0217a.f605c) {
                ((Deflater) c0217a.f606d).reset();
            }
            long j3 = c0239g.f715b;
            C0035f c0035f = (C0035f) c0217a.f607e;
            c0035f.mo104b(c0239g, j3);
            c0035f.flush();
            C0242j c0242j2 = AbstractC0218b.f608a;
            long j4 = c0239g2.f715b;
            byte[] bArr = c0242j2.f719c;
            long length = j4 - bArr.length;
            int length2 = bArr.length;
            if (length < 0 || length2 < 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (j4 - length >= length2 && bArr.length >= length2) {
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (c0239g2.m667h(i3 + length) == c0242j2.f719c[i3]) {
                        }
                    }
                    long j5 = c0239g2.f715b - 4;
                    C0238f c0238f = new C0238f();
                    c0239g2.m669j(c0238f);
                    try {
                        c0238f.m655g(j5);
                        c0238f.close();
                        c0239g.mo104b(c0239g2, c0239g2.f715b);
                        i2 = 193;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC0104l.m404k(c0238f, th);
                            throw th2;
                        }
                    }
                }
            }
            c0239g2.m685z(0);
            c0239g.mo104b(c0239g2, c0239g2.f715b);
            i2 = 193;
        }
        long j6 = c0239g.f715b;
        C0239g c0239g3 = this.f658b;
        c0239g3.m685z(i2);
        if (j6 <= 125) {
            c0239g3.m685z(((int) j6) | 128);
        } else if (j6 <= 65535) {
            c0239g3.m685z(254);
            c0239g3.m659C((int) j6);
        } else {
            c0239g3.m685z(255);
            C0250r m680u = c0239g3.m680u(8);
            int i4 = m680u.f741c;
            byte[] bArr2 = m680u.f739a;
            bArr2[i4] = (byte) ((j6 >>> 56) & 255);
            bArr2[i4 + 1] = (byte) ((j6 >>> 48) & 255);
            bArr2[i4 + 2] = (byte) ((j6 >>> 40) & 255);
            bArr2[i4 + 3] = (byte) ((j6 >>> 32) & 255);
            bArr2[i4 + 4] = (byte) ((j6 >>> 24) & 255);
            bArr2[i4 + 5] = (byte) ((j6 >>> 16) & 255);
            bArr2[i4 + 6] = (byte) ((j6 >>> 8) & 255);
            bArr2[i4 + 7] = (byte) (j6 & 255);
            m680u.f741c = i4 + 8;
            c0239g3.f715b += 8;
        }
        byte[] bArr3 = this.f661e;
        AbstractC1136c.m2634b(bArr3);
        this.f664h.nextBytes(bArr3);
        c0239g3.m682w(bArr3);
        if (j6 > j2) {
            C0238f c0238f2 = this.f662f;
            AbstractC1136c.m2634b(c0238f2);
            c0239g.m669j(c0238f2);
            c0238f2.m656h(j2);
            AbstractC0104l.m398U(c0238f2, bArr3);
            c0238f2.close();
        }
        c0239g3.mo104b(c0239g, j6);
        C0248p c0248p = this.f663g;
        if (c0248p.f734b) {
            throw new IllegalStateException("closed");
        }
        C0239g c0239g4 = c0248p.f733a;
        long j7 = c0239g4.f715b;
        if (j7 > 0) {
            c0248p.f735c.mo104b(c0239g4, j7);
        }
    }
}
