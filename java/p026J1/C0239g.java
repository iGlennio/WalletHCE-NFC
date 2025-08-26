package p026J1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p005C.AbstractC0044g;
import p010D1.AbstractC0104l;
import p029K1.AbstractC0332a;
import p029K1.AbstractC0333b;
import p075d1.AbstractC0756h;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1191a;

/* renamed from: J1.g */
/* loaded from: classes.dex */
public final class C0239g implements InterfaceC0241i, InterfaceC0240h, Cloneable, ByteChannel {

    /* renamed from: a */
    public C0250r f714a;

    /* renamed from: b */
    public long f715b;

    /* renamed from: A */
    public final void m657A(long j2) {
        if (j2 == 0) {
            m685z(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        C0250r m680u = m680u(i2);
        int i3 = m680u.f741c;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            m680u.f739a[i4] = AbstractC0332a.f871a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        m680u.f741c += i2;
        this.f715b += i2;
    }

    /* renamed from: B */
    public final void m658B(int i2) {
        C0250r m680u = m680u(4);
        int i3 = m680u.f741c;
        byte[] bArr = m680u.f739a;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        m680u.f741c = i3 + 4;
        this.f715b += 4;
    }

    /* renamed from: C */
    public final void m659C(int i2) {
        C0250r m680u = m680u(2);
        int i3 = m680u.f741c;
        byte[] bArr = m680u.f739a;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 1] = (byte) (i2 & 255);
        m680u.f741c = i3 + 2;
        this.f715b += 2;
    }

    /* renamed from: D */
    public final void m660D(String str) {
        AbstractC1136c.m2637e(str, "string");
        m661E(str, 0, str.length());
    }

    /* renamed from: E */
    public final void m661E(String str, int i2, int i3) {
        AbstractC1136c.m2637e(str, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0044g.m153e("beginIndex < 0: ", i2).toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                C0250r m680u = m680u(1);
                int i4 = m680u.f741c - i2;
                int min = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                byte[] bArr = m680u.f739a;
                bArr[i2 + i4] = (byte) charAt;
                while (i5 < min) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i5 + i4] = (byte) charAt2;
                    i5++;
                }
                int i6 = m680u.f741c;
                int i7 = (i4 + i5) - i6;
                m680u.f741c = i6 + i7;
                this.f715b += i7;
                i2 = i5;
            } else {
                if (charAt < 2048) {
                    C0250r m680u2 = m680u(2);
                    int i8 = m680u2.f741c;
                    byte[] bArr2 = m680u2.f739a;
                    bArr2[i8] = (byte) ((charAt >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((charAt & '?') | 128);
                    m680u2.f741c = i8 + 2;
                    this.f715b += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    C0250r m680u3 = m680u(3);
                    int i9 = m680u3.f741c;
                    byte[] bArr3 = m680u3.f739a;
                    bArr3[i9] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((charAt & '?') | 128);
                    m680u3.f741c = i9 + 3;
                    this.f715b += 3;
                } else {
                    int i10 = i2 + 1;
                    char charAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                    if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        m685z(63);
                        i2 = i10;
                    } else {
                        int i11 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        C0250r m680u4 = m680u(4);
                        int i12 = m680u4.f741c;
                        byte[] bArr4 = m680u4.f739a;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        m680u4.f741c = i12 + 4;
                        this.f715b += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    /* renamed from: F */
    public final void m662F(int i2) {
        String str;
        int i3 = 0;
        if (i2 < 128) {
            m685z(i2);
            return;
        }
        if (i2 < 2048) {
            C0250r m680u = m680u(2);
            int i4 = m680u.f741c;
            byte[] bArr = m680u.f739a;
            bArr[i4] = (byte) ((i2 >> 6) | 192);
            bArr[1 + i4] = (byte) ((i2 & 63) | 128);
            m680u.f741c = i4 + 2;
            this.f715b += 2;
            return;
        }
        if (55296 <= i2 && 57343 >= i2) {
            m685z(63);
            return;
        }
        if (i2 < 65536) {
            C0250r m680u2 = m680u(3);
            int i5 = m680u2.f741c;
            byte[] bArr2 = m680u2.f739a;
            bArr2[i5] = (byte) ((i2 >> 12) | 224);
            bArr2[1 + i5] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[2 + i5] = (byte) ((i2 & 63) | 128);
            m680u2.f741c = i5 + 3;
            this.f715b += 3;
            return;
        }
        if (i2 <= 1114111) {
            C0250r m680u3 = m680u(4);
            int i6 = m680u3.f741c;
            byte[] bArr3 = m680u3.f739a;
            bArr3[i6] = (byte) ((i2 >> 18) | 240);
            bArr3[1 + i6] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[2 + i6] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[3 + i6] = (byte) ((i2 & 63) | 128);
            m680u3.f741c = i6 + 4;
            this.f715b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i2 != 0) {
            char[] cArr = AbstractC0333b.f872a;
            char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            str = new String(cArr2, i3, 8 - i3);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: a */
    public final C0256x mo100a() {
        return C0256x.f751d;
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: b */
    public final void mo104b(C0239g c0239g, long j2) {
        C0250r m730b;
        AbstractC1136c.m2637e(c0239g, "source");
        if (c0239g == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0104l.m401f(c0239g.f715b, 0L, j2);
        while (j2 > 0) {
            C0250r c0250r = c0239g.f714a;
            AbstractC1136c.m2634b(c0250r);
            int i2 = c0250r.f741c;
            C0250r c0250r2 = c0239g.f714a;
            AbstractC1136c.m2634b(c0250r2);
            long j3 = i2 - c0250r2.f740b;
            int i3 = 0;
            if (j2 < j3) {
                C0250r c0250r3 = this.f714a;
                C0250r c0250r4 = c0250r3 != null ? c0250r3.f745g : null;
                if (c0250r4 != null && c0250r4.f743e) {
                    if ((c0250r4.f741c + j2) - (c0250r4.f742d ? 0 : c0250r4.f740b) <= 8192) {
                        C0250r c0250r5 = c0239g.f714a;
                        AbstractC1136c.m2634b(c0250r5);
                        c0250r5.m728d(c0250r4, (int) j2);
                        c0239g.f715b -= j2;
                        this.f715b += j2;
                        return;
                    }
                }
                C0250r c0250r6 = c0239g.f714a;
                AbstractC1136c.m2634b(c0250r6);
                int i4 = (int) j2;
                if (i4 <= 0 || i4 > c0250r6.f741c - c0250r6.f740b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    m730b = c0250r6.m727c();
                } else {
                    m730b = AbstractC0251s.m730b();
                    int i5 = c0250r6.f740b;
                    AbstractC0756h.m2049o0(0, i5, i5 + i4, c0250r6.f739a, m730b.f739a);
                }
                m730b.f741c = m730b.f740b + i4;
                c0250r6.f740b += i4;
                C0250r c0250r7 = c0250r6.f745g;
                AbstractC1136c.m2634b(c0250r7);
                c0250r7.m726b(m730b);
                c0239g.f714a = m730b;
            }
            C0250r c0250r8 = c0239g.f714a;
            AbstractC1136c.m2634b(c0250r8);
            long j4 = c0250r8.f741c - c0250r8.f740b;
            c0239g.f714a = c0250r8.m725a();
            C0250r c0250r9 = this.f714a;
            if (c0250r9 == null) {
                this.f714a = c0250r8;
                c0250r8.f745g = c0250r8;
                c0250r8.f744f = c0250r8;
            } else {
                C0250r c0250r10 = c0250r9.f745g;
                AbstractC1136c.m2634b(c0250r10);
                c0250r10.m726b(c0250r8);
                C0250r c0250r11 = c0250r8.f745g;
                if (c0250r11 == c0250r8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC1136c.m2634b(c0250r11);
                if (c0250r11.f743e) {
                    int i6 = c0250r8.f741c - c0250r8.f740b;
                    C0250r c0250r12 = c0250r8.f745g;
                    AbstractC1136c.m2634b(c0250r12);
                    int i7 = 8192 - c0250r12.f741c;
                    C0250r c0250r13 = c0250r8.f745g;
                    AbstractC1136c.m2634b(c0250r13);
                    if (!c0250r13.f742d) {
                        C0250r c0250r14 = c0250r8.f745g;
                        AbstractC1136c.m2634b(c0250r14);
                        i3 = c0250r14.f740b;
                    }
                    if (i6 <= i7 + i3) {
                        C0250r c0250r15 = c0250r8.f745g;
                        AbstractC1136c.m2634b(c0250r15);
                        c0250r8.m728d(c0250r15, i6);
                        c0250r8.m725a();
                        AbstractC0251s.m729a(c0250r8);
                    }
                }
            }
            c0239g.f715b -= j4;
            this.f715b += j4;
            j2 -= j4;
        }
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: c */
    public final long mo101c(C0239g c0239g, long j2) {
        AbstractC1136c.m2637e(c0239g, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f715b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        c0239g.mo104b(this, j2);
        return j2;
    }

    public final Object clone() {
        C0239g c0239g = new C0239g();
        if (this.f715b == 0) {
            return c0239g;
        }
        C0250r c0250r = this.f714a;
        AbstractC1136c.m2634b(c0250r);
        C0250r m727c = c0250r.m727c();
        c0239g.f714a = m727c;
        m727c.f745g = m727c;
        m727c.f744f = m727c;
        for (C0250r c0250r2 = c0250r.f744f; c0250r2 != c0250r; c0250r2 = c0250r2.f744f) {
            C0250r c0250r3 = m727c.f745g;
            AbstractC1136c.m2634b(c0250r3);
            AbstractC1136c.m2634b(c0250r2);
            c0250r3.m726b(c0250r2.m727c());
        }
        c0239g.f715b = this.f715b;
        return c0239g;
    }

    @Override // p026J1.InterfaceC0241i
    /* renamed from: d */
    public final int mo663d(C0247o c0247o) {
        AbstractC1136c.m2637e(c0247o, "options");
        int m955b = AbstractC0332a.m955b(this, c0247o, false);
        if (m955b == -1) {
            return -1;
        }
        m678s(c0247o.f731a[m955b].mo688c());
        return m955b;
    }

    @Override // p026J1.InterfaceC0240h
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ InterfaceC0240h mo664e(String str) {
        m660D(str);
        return this;
    }

    public final boolean equals(Object obj) {
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        boolean z3 = false;
        if (!(obj instanceof C0239g)) {
            return false;
        }
        long j2 = this.f715b;
        C0239g c0239g = (C0239g) obj;
        if (j2 != c0239g.f715b) {
            return false;
        }
        if (j2 == 0) {
            return true;
        }
        C0250r c0250r = this.f714a;
        AbstractC1136c.m2634b(c0250r);
        C0250r c0250r2 = c0239g.f714a;
        AbstractC1136c.m2634b(c0250r2);
        int i2 = c0250r.f740b;
        int i3 = c0250r2.f740b;
        long j3 = 0;
        while (j3 < this.f715b) {
            long min = Math.min(c0250r.f741c - i2, c0250r2.f741c - i3);
            long j4 = 0;
            while (j4 < min) {
                int i4 = i2 + 1;
                boolean z4 = z2;
                byte b = c0250r.f739a[i2];
                int i5 = i3 + 1;
                boolean z5 = z3;
                if (b != c0250r2.f739a[i3]) {
                    return z5;
                }
                j4++;
                i3 = i5;
                i2 = i4;
                z2 = z4;
                z3 = z5;
            }
            boolean z6 = z2;
            boolean z7 = z3;
            if (i2 == c0250r.f741c) {
                C0250r c0250r3 = c0250r.f744f;
                AbstractC1136c.m2634b(c0250r3);
                i2 = c0250r3.f740b;
                c0250r = c0250r3;
            }
            if (i3 == c0250r2.f741c) {
                c0250r2 = c0250r2.f744f;
                AbstractC1136c.m2634b(c0250r2);
                i3 = c0250r2.f740b;
            }
            j3 += min;
            z2 = z6;
            z3 = z7;
        }
        return z2;
    }

    @Override // p026J1.InterfaceC0241i
    /* renamed from: f */
    public final String mo665f(Charset charset) {
        return m676q(this.f715b, charset);
    }

    /* renamed from: g */
    public final boolean m666g() {
        return this.f715b == 0;
    }

    /* renamed from: h */
    public final byte m667h(long j2) {
        AbstractC0104l.m401f(this.f715b, j2, 1L);
        C0250r c0250r = this.f714a;
        if (c0250r == null) {
            AbstractC1136c.m2634b(null);
            throw null;
        }
        long j3 = this.f715b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                c0250r = c0250r.f745g;
                AbstractC1136c.m2634b(c0250r);
                j3 -= c0250r.f741c - c0250r.f740b;
            }
            return c0250r.f739a[(int) ((c0250r.f740b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i2 = c0250r.f741c;
            int i3 = c0250r.f740b;
            long j5 = (i2 - i3) + j4;
            if (j5 > j2) {
                return c0250r.f739a[(int) ((i3 + j2) - j4)];
            }
            c0250r = c0250r.f744f;
            AbstractC1136c.m2634b(c0250r);
            j4 = j5;
        }
    }

    public final int hashCode() {
        C0250r c0250r = this.f714a;
        if (c0250r == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = c0250r.f741c;
            for (int i4 = c0250r.f740b; i4 < i3; i4++) {
                i2 = (i2 * 31) + c0250r.f739a[i4];
            }
            c0250r = c0250r.f744f;
            AbstractC1136c.m2634b(c0250r);
        } while (c0250r != this.f714a);
        return i2;
    }

    /* renamed from: i */
    public final int m668i(int i2, int i3, byte[] bArr) {
        AbstractC1136c.m2637e(bArr, "sink");
        AbstractC0104l.m401f(bArr.length, i2, i3);
        C0250r c0250r = this.f714a;
        if (c0250r == null) {
            return -1;
        }
        int min = Math.min(i3, c0250r.f741c - c0250r.f740b);
        int i4 = c0250r.f740b;
        AbstractC0756h.m2049o0(i2, i4, i4 + min, c0250r.f739a, bArr);
        int i5 = c0250r.f740b + min;
        c0250r.f740b = i5;
        this.f715b -= min;
        if (i5 == c0250r.f741c) {
            this.f714a = c0250r.m725a();
            AbstractC0251s.m729a(c0250r);
        }
        return min;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final void m669j(C0238f c0238f) {
        AbstractC1136c.m2637e(c0238f, "unsafeCursor");
        if (c0238f.f707a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c0238f.f707a = this;
        c0238f.f708b = true;
    }

    /* renamed from: k */
    public final byte m670k() {
        if (this.f715b == 0) {
            throw new EOFException();
        }
        C0250r c0250r = this.f714a;
        AbstractC1136c.m2634b(c0250r);
        int i2 = c0250r.f740b;
        int i3 = c0250r.f741c;
        int i4 = i2 + 1;
        byte b = c0250r.f739a[i2];
        this.f715b--;
        if (i4 != i3) {
            c0250r.f740b = i4;
            return b;
        }
        this.f714a = c0250r.m725a();
        AbstractC0251s.m729a(c0250r);
        return b;
    }

    /* renamed from: l */
    public final byte[] m671l(long j2) {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f715b < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        m673n(bArr);
        return bArr;
    }

    /* renamed from: m */
    public final C0242j m672m(long j2) {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f715b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new C0242j(m671l(j2));
        }
        C0242j m679t = m679t((int) j2);
        m678s(j2);
        return m679t;
    }

    /* renamed from: n */
    public final void m673n(byte[] bArr) {
        AbstractC1136c.m2637e(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int m668i = m668i(i2, bArr.length - i2, bArr);
            if (m668i == -1) {
                throw new EOFException();
            }
            i2 += m668i;
        }
    }

    /* renamed from: o */
    public final int m674o() {
        if (this.f715b < 4) {
            throw new EOFException();
        }
        C0250r c0250r = this.f714a;
        AbstractC1136c.m2634b(c0250r);
        int i2 = c0250r.f740b;
        int i3 = c0250r.f741c;
        if (i3 - i2 < 4) {
            return ((m670k() & 255) << 24) | ((m670k() & 255) << 16) | ((m670k() & 255) << 8) | (m670k() & 255);
        }
        byte[] bArr = c0250r.f739a;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i6 = i2 + 4;
        int i7 = i5 | (bArr[i4] & 255);
        this.f715b -= 4;
        if (i6 != i3) {
            c0250r.f740b = i6;
            return i7;
        }
        this.f714a = c0250r.m725a();
        AbstractC0251s.m729a(c0250r);
        return i7;
    }

    /* renamed from: p */
    public final short m675p() {
        if (this.f715b < 2) {
            throw new EOFException();
        }
        C0250r c0250r = this.f714a;
        AbstractC1136c.m2634b(c0250r);
        int i2 = c0250r.f740b;
        int i3 = c0250r.f741c;
        if (i3 - i2 < 2) {
            return (short) (((m670k() & 255) << 8) | (m670k() & 255));
        }
        int i4 = i2 + 1;
        byte[] bArr = c0250r.f739a;
        int i5 = (bArr[i2] & 255) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & 255) | i5;
        this.f715b -= 2;
        if (i6 == i3) {
            this.f714a = c0250r.m725a();
            AbstractC0251s.m729a(c0250r);
        } else {
            c0250r.f740b = i6;
        }
        return (short) i7;
    }

    /* renamed from: q */
    public final String m676q(long j2, Charset charset) {
        AbstractC1136c.m2637e(charset, "charset");
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f715b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        C0250r c0250r = this.f714a;
        AbstractC1136c.m2634b(c0250r);
        int i2 = c0250r.f740b;
        if (i2 + j2 > c0250r.f741c) {
            return new String(m671l(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(c0250r.f739a, i2, i3, charset);
        int i4 = c0250r.f740b + i3;
        c0250r.f740b = i4;
        this.f715b -= j2;
        if (i4 == c0250r.f741c) {
            this.f714a = c0250r.m725a();
            AbstractC0251s.m729a(c0250r);
        }
        return str;
    }

    /* renamed from: r */
    public final String m677r() {
        return m676q(this.f715b, AbstractC1191a.f4563a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1136c.m2637e(byteBuffer, "sink");
        C0250r c0250r = this.f714a;
        if (c0250r == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c0250r.f741c - c0250r.f740b);
        byteBuffer.put(c0250r.f739a, c0250r.f740b, min);
        int i2 = c0250r.f740b + min;
        c0250r.f740b = i2;
        this.f715b -= min;
        if (i2 == c0250r.f741c) {
            this.f714a = c0250r.m725a();
            AbstractC0251s.m729a(c0250r);
        }
        return min;
    }

    /* renamed from: s */
    public final void m678s(long j2) {
        while (j2 > 0) {
            C0250r c0250r = this.f714a;
            if (c0250r == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, c0250r.f741c - c0250r.f740b);
            long j3 = min;
            this.f715b -= j3;
            j2 -= j3;
            int i2 = c0250r.f740b + min;
            c0250r.f740b = i2;
            if (i2 == c0250r.f741c) {
                this.f714a = c0250r.m725a();
                AbstractC0251s.m729a(c0250r);
            }
        }
    }

    /* renamed from: t */
    public final C0242j m679t(int i2) {
        if (i2 == 0) {
            return C0242j.f716d;
        }
        AbstractC0104l.m401f(this.f715b, 0L, i2);
        C0250r c0250r = this.f714a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            AbstractC1136c.m2634b(c0250r);
            int i6 = c0250r.f741c;
            int i7 = c0250r.f740b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            c0250r = c0250r.f744f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        C0250r c0250r2 = this.f714a;
        int i8 = 0;
        while (i3 < i2) {
            AbstractC1136c.m2634b(c0250r2);
            bArr[i8] = c0250r2.f739a;
            i3 += c0250r2.f741c - c0250r2.f740b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = c0250r2.f740b;
            c0250r2.f742d = true;
            i8++;
            c0250r2 = c0250r2.f744f;
        }
        return new C0252t(bArr, iArr);
    }

    public final String toString() {
        long j2 = this.f715b;
        if (j2 <= Integer.MAX_VALUE) {
            return m679t((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f715b).toString());
    }

    /* renamed from: u */
    public final C0250r m680u(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C0250r c0250r = this.f714a;
        if (c0250r == null) {
            C0250r m730b = AbstractC0251s.m730b();
            this.f714a = m730b;
            m730b.f745g = m730b;
            m730b.f744f = m730b;
            return m730b;
        }
        C0250r c0250r2 = c0250r.f745g;
        AbstractC1136c.m2634b(c0250r2);
        if (c0250r2.f741c + i2 <= 8192 && c0250r2.f743e) {
            return c0250r2;
        }
        C0250r m730b2 = AbstractC0251s.m730b();
        c0250r2.m726b(m730b2);
        return m730b2;
    }

    /* renamed from: v */
    public final void m681v(C0242j c0242j) {
        AbstractC1136c.m2637e(c0242j, "byteString");
        c0242j.mo696k(this, c0242j.mo688c());
    }

    /* renamed from: w */
    public final void m682w(byte[] bArr) {
        AbstractC1136c.m2637e(bArr, "source");
        m683x(bArr, bArr.length);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1136c.m2637e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            C0250r m680u = m680u(1);
            int min = Math.min(i2, 8192 - m680u.f741c);
            byteBuffer.get(m680u.f739a, m680u.f741c, min);
            i2 -= min;
            m680u.f741c += min;
        }
        this.f715b += remaining;
        return remaining;
    }

    /* renamed from: x */
    public final void m683x(byte[] bArr, int i2) {
        AbstractC1136c.m2637e(bArr, "source");
        int i3 = 0;
        long j2 = i2;
        AbstractC0104l.m401f(bArr.length, 0, j2);
        while (i3 < i2) {
            C0250r m680u = m680u(1);
            int min = Math.min(i2 - i3, 8192 - m680u.f741c);
            int i4 = i3 + min;
            AbstractC0756h.m2049o0(m680u.f741c, i3, i4, bArr, m680u.f739a);
            m680u.f741c += min;
            i3 = i4;
        }
        this.f715b += j2;
    }

    /* renamed from: y */
    public final void m684y(InterfaceC0254v interfaceC0254v) {
        AbstractC1136c.m2637e(interfaceC0254v, "source");
        while (interfaceC0254v.mo101c(this, 8192) != -1) {
        }
    }

    /* renamed from: z */
    public final void m685z(int i2) {
        C0250r m680u = m680u(1);
        int i3 = m680u.f741c;
        m680u.f741c = i3 + 1;
        m680u.f739a[i3] = (byte) i2;
        this.f715b++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p026J1.InterfaceC0253u
    public final void close() {
    }

    @Override // p026J1.InterfaceC0253u, java.io.Flushable
    public final void flush() {
    }
}
