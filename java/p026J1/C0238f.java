package p026J1;

import java.io.Closeable;
import java.util.Arrays;
import p095l1.AbstractC1136c;

/* renamed from: J1.f */
/* loaded from: classes.dex */
public final class C0238f implements Closeable {

    /* renamed from: a */
    public C0239g f707a;

    /* renamed from: b */
    public boolean f708b;

    /* renamed from: c */
    public C0250r f709c;

    /* renamed from: e */
    public byte[] f711e;

    /* renamed from: d */
    public long f710d = -1;

    /* renamed from: f */
    public int f712f = -1;

    /* renamed from: g */
    public int f713g = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!(this.f707a != null)) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f707a = null;
        this.f709c = null;
        this.f710d = -1L;
        this.f711e = null;
        this.f712f = -1;
        this.f713g = -1;
    }

    /* renamed from: g */
    public final void m655g(long j2) {
        C0239g c0239g = this.f707a;
        if (c0239g == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f708b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j3 = c0239g.f715b;
        if (j2 <= j3) {
            if (j2 < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
            }
            long j4 = j3 - j2;
            while (true) {
                if (j4 <= 0) {
                    break;
                }
                C0250r c0250r = c0239g.f714a;
                AbstractC1136c.m2634b(c0250r);
                C0250r c0250r2 = c0250r.f745g;
                AbstractC1136c.m2634b(c0250r2);
                int i2 = c0250r2.f741c;
                long j5 = i2 - c0250r2.f740b;
                if (j5 > j4) {
                    c0250r2.f741c = i2 - ((int) j4);
                    break;
                } else {
                    c0239g.f714a = c0250r2.m725a();
                    AbstractC0251s.m729a(c0250r2);
                    j4 -= j5;
                }
            }
            this.f709c = null;
            this.f710d = j2;
            this.f711e = null;
            this.f712f = -1;
            this.f713g = -1;
        } else if (j2 > j3) {
            long j6 = j2 - j3;
            int i3 = 1;
            boolean z2 = true;
            for (long j7 = 0; j6 > j7; j7 = 0) {
                C0250r m680u = c0239g.m680u(i3);
                int min = (int) Math.min(j6, 8192 - m680u.f741c);
                int i4 = m680u.f741c + min;
                m680u.f741c = i4;
                j6 -= min;
                if (z2) {
                    this.f709c = m680u;
                    this.f710d = j3;
                    this.f711e = m680u.f739a;
                    this.f712f = i4 - min;
                    this.f713g = i4;
                    z2 = false;
                }
                i3 = 1;
            }
        }
        c0239g.f715b = j2;
    }

    /* renamed from: h */
    public final int m656h(long j2) {
        C0239g c0239g = this.f707a;
        if (c0239g == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j2 >= -1) {
            long j3 = c0239g.f715b;
            if (j2 <= j3) {
                if (j2 == -1 || j2 == j3) {
                    this.f709c = null;
                    this.f710d = j2;
                    this.f711e = null;
                    this.f712f = -1;
                    this.f713g = -1;
                    return -1;
                }
                C0250r c0250r = c0239g.f714a;
                C0250r c0250r2 = this.f709c;
                long j4 = 0;
                if (c0250r2 != null) {
                    long j5 = this.f710d - (this.f712f - c0250r2.f740b);
                    if (j5 > j2) {
                        c0250r2 = c0250r;
                        c0250r = c0250r2;
                        j3 = j5;
                    } else {
                        j4 = j5;
                    }
                } else {
                    c0250r2 = c0250r;
                }
                if (j3 - j2 > j2 - j4) {
                    while (true) {
                        AbstractC1136c.m2634b(c0250r2);
                        long j6 = (c0250r2.f741c - c0250r2.f740b) + j4;
                        if (j2 < j6) {
                            break;
                        }
                        c0250r2 = c0250r2.f744f;
                        j4 = j6;
                    }
                } else {
                    while (j3 > j2) {
                        AbstractC1136c.m2634b(c0250r);
                        c0250r = c0250r.f745g;
                        AbstractC1136c.m2634b(c0250r);
                        j3 -= c0250r.f741c - c0250r.f740b;
                    }
                    c0250r2 = c0250r;
                    j4 = j3;
                }
                if (this.f708b) {
                    AbstractC1136c.m2634b(c0250r2);
                    if (c0250r2.f742d) {
                        byte[] bArr = c0250r2.f739a;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        AbstractC1136c.m2636d(copyOf, "java.util.Arrays.copyOf(this, size)");
                        C0250r c0250r3 = new C0250r(copyOf, c0250r2.f740b, c0250r2.f741c, false, true);
                        if (c0239g.f714a == c0250r2) {
                            c0239g.f714a = c0250r3;
                        }
                        c0250r2.m726b(c0250r3);
                        C0250r c0250r4 = c0250r3.f745g;
                        AbstractC1136c.m2634b(c0250r4);
                        c0250r4.m725a();
                        c0250r2 = c0250r3;
                    }
                }
                this.f709c = c0250r2;
                this.f710d = j2;
                AbstractC1136c.m2634b(c0250r2);
                this.f711e = c0250r2.f739a;
                int i2 = c0250r2.f740b + ((int) (j2 - j4));
                this.f712f = i2;
                int i3 = c0250r2.f741c;
                this.f713g = i3;
                return i3 - i2;
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(c0239g.f715b)}, 2)));
    }
}
