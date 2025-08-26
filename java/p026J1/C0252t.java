package p026J1;

import java.security.MessageDigest;
import p010D1.AbstractC0104l;
import p029K1.AbstractC0333b;
import p075d1.AbstractC0756h;
import p095l1.AbstractC1136c;

/* renamed from: J1.t */
/* loaded from: classes.dex */
public final class C0252t extends C0242j {

    /* renamed from: e */
    public final transient byte[][] f749e;

    /* renamed from: f */
    public final transient int[] f750f;

    public C0252t(byte[][] bArr, int[] iArr) {
        super(C0242j.f716d.f719c);
        this.f749e = bArr;
        this.f750f = iArr;
    }

    @Override // p026J1.C0242j
    /* renamed from: a */
    public final String mo686a() {
        throw null;
    }

    @Override // p026J1.C0242j
    /* renamed from: b */
    public final C0242j mo687b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f749e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f750f;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            messageDigest.update(bArr[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = messageDigest.digest();
        AbstractC1136c.m2636d(digest, "digest.digest()");
        return new C0242j(digest);
    }

    @Override // p026J1.C0242j
    /* renamed from: c */
    public final int mo688c() {
        return this.f750f[this.f749e.length - 1];
    }

    @Override // p026J1.C0242j
    /* renamed from: d */
    public final String mo689d() {
        return new C0242j(m731l()).mo689d();
    }

    @Override // p026J1.C0242j
    /* renamed from: e */
    public final byte[] mo690e() {
        return m731l();
    }

    @Override // p026J1.C0242j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0242j)) {
            return false;
        }
        C0242j c0242j = (C0242j) obj;
        return c0242j.mo688c() == mo688c() && mo692g(mo688c(), c0242j);
    }

    @Override // p026J1.C0242j
    /* renamed from: f */
    public final byte mo691f(int i2) {
        byte[][] bArr = this.f749e;
        int length = bArr.length - 1;
        int[] iArr = this.f750f;
        AbstractC0104l.m401f(iArr[length], i2, 1L);
        int m957b = AbstractC0333b.m957b(this, i2);
        return bArr[m957b][(i2 - (m957b == 0 ? 0 : iArr[m957b - 1])) + iArr[bArr.length + m957b]];
    }

    @Override // p026J1.C0242j
    /* renamed from: g */
    public final boolean mo692g(int i2, C0242j c0242j) {
        AbstractC1136c.m2637e(c0242j, "other");
        if (mo688c() - i2 >= 0) {
            int m957b = AbstractC0333b.m957b(this, 0);
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int[] iArr = this.f750f;
                int i5 = m957b == 0 ? 0 : iArr[m957b - 1];
                int i6 = iArr[m957b] - i5;
                byte[][] bArr = this.f749e;
                int i7 = iArr[bArr.length + m957b];
                int min = Math.min(i2, i6 + i5) - i3;
                if (c0242j.mo693h(i4, bArr[m957b], (i3 - i5) + i7, min)) {
                    i4 += min;
                    i3 += min;
                    m957b++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p026J1.C0242j
    /* renamed from: h */
    public final boolean mo693h(int i2, byte[] bArr, int i3, int i4) {
        AbstractC1136c.m2637e(bArr, "other");
        if (i2 < 0 || i2 > mo688c() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int m957b = AbstractC0333b.m957b(this, i2);
        while (i2 < i5) {
            int[] iArr = this.f750f;
            int i6 = m957b == 0 ? 0 : iArr[m957b - 1];
            int i7 = iArr[m957b] - i6;
            byte[][] bArr2 = this.f749e;
            int i8 = iArr[bArr2.length + m957b];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!AbstractC0104l.m399a((i2 - i6) + i8, i3, min, bArr2[m957b], bArr)) {
                return false;
            }
            i3 += min;
            i2 += min;
            m957b++;
        }
        return true;
    }

    @Override // p026J1.C0242j
    public final int hashCode() {
        int i2 = this.f717a;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f749e;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f750f;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f717a = i4;
        return i4;
    }

    @Override // p026J1.C0242j
    /* renamed from: i */
    public final C0242j mo694i() {
        return new C0242j(m731l()).mo694i();
    }

    @Override // p026J1.C0242j
    /* renamed from: k */
    public final void mo696k(C0239g c0239g, int i2) {
        AbstractC1136c.m2637e(c0239g, "buffer");
        int m957b = AbstractC0333b.m957b(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int[] iArr = this.f750f;
            int i4 = m957b == 0 ? 0 : iArr[m957b - 1];
            int i5 = iArr[m957b] - i4;
            byte[][] bArr = this.f749e;
            int i6 = iArr[bArr.length + m957b];
            int min = Math.min(i2, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            C0250r c0250r = new C0250r(bArr[m957b], i7, i7 + min, true, false);
            C0250r c0250r2 = c0239g.f714a;
            if (c0250r2 == null) {
                c0250r.f745g = c0250r;
                c0250r.f744f = c0250r;
                c0239g.f714a = c0250r;
            } else {
                C0250r c0250r3 = c0250r2.f745g;
                AbstractC1136c.m2634b(c0250r3);
                c0250r3.m726b(c0250r);
            }
            i3 += min;
            m957b++;
        }
        c0239g.f715b += mo688c();
    }

    /* renamed from: l */
    public final byte[] m731l() {
        byte[] bArr = new byte[mo688c()];
        byte[][] bArr2 = this.f749e;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f750f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            AbstractC0756h.m2049o0(i4, i5, i5 + i7, bArr2[i2], bArr);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // p026J1.C0242j
    public final String toString() {
        return new C0242j(m731l()).toString();
    }
}
