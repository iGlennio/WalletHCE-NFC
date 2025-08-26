package p007C1;

import java.io.IOException;
import java.util.ArrayList;
import p026J1.C0239g;
import p026J1.C0242j;
import p026J1.C0249q;
import p075d1.AbstractC0756h;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;

/* renamed from: C1.c */
/* loaded from: classes.dex */
public final class C0063c {

    /* renamed from: b */
    public final C0249q f155b;

    /* renamed from: e */
    public int f158e;

    /* renamed from: f */
    public int f159f;

    /* renamed from: g */
    public int f160g = 4096;

    /* renamed from: a */
    public final ArrayList f154a = new ArrayList();

    /* renamed from: c */
    public C0062b[] f156c = new C0062b[8];

    /* renamed from: d */
    public int f157d = 7;

    public C0063c(C0080t c0080t) {
        this.f155b = new C0249q(c0080t);
    }

    /* renamed from: a */
    public final int m244a(int i2) {
        int i3;
        int i4 = 0;
        if (i2 > 0) {
            int length = this.f156c.length;
            while (true) {
                length--;
                i3 = this.f157d;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                C0062b c0062b = this.f156c[length];
                AbstractC1136c.m2634b(c0062b);
                int i5 = c0062b.f151a;
                i2 -= i5;
                this.f159f -= i5;
                this.f158e--;
                i4++;
            }
            C0062b[] c0062bArr = this.f156c;
            System.arraycopy(c0062bArr, i3 + 1, c0062bArr, i3 + 1 + i4, this.f158e);
            this.f157d += i4;
        }
        return i4;
    }

    /* renamed from: b */
    public final C0242j m245b(int i2) {
        if (i2 >= 0) {
            C0062b[] c0062bArr = AbstractC0065e.f169a;
            if (i2 <= c0062bArr.length - 1) {
                return c0062bArr[i2].f152b;
            }
        }
        int length = this.f157d + 1 + (i2 - AbstractC0065e.f169a.length);
        if (length >= 0) {
            C0062b[] c0062bArr2 = this.f156c;
            if (length < c0062bArr2.length) {
                C0062b c0062b = c0062bArr2[length];
                AbstractC1136c.m2634b(c0062b);
                return c0062b.f152b;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    /* renamed from: c */
    public final void m246c(C0062b c0062b) {
        this.f154a.add(c0062b);
        int i2 = this.f160g;
        int i3 = c0062b.f151a;
        if (i3 > i2) {
            C0062b[] c0062bArr = this.f156c;
            AbstractC0756h.m2052r0(c0062bArr, 0, c0062bArr.length);
            this.f157d = this.f156c.length - 1;
            this.f158e = 0;
            this.f159f = 0;
            return;
        }
        m244a((this.f159f + i3) - i2);
        int i4 = this.f158e + 1;
        C0062b[] c0062bArr2 = this.f156c;
        if (i4 > c0062bArr2.length) {
            C0062b[] c0062bArr3 = new C0062b[c0062bArr2.length * 2];
            System.arraycopy(c0062bArr2, 0, c0062bArr3, c0062bArr2.length, c0062bArr2.length);
            this.f157d = this.f156c.length - 1;
            this.f156c = c0062bArr3;
        }
        int i5 = this.f157d;
        this.f157d = i5 - 1;
        this.f156c[i5] = c0062b;
        this.f158e++;
        this.f159f += i3;
    }

    /* renamed from: d */
    public final C0242j m247d() {
        int i2;
        C0249q c0249q = this.f155b;
        byte m714i = c0249q.m714i();
        byte[] bArr = AbstractC1302b.f5337a;
        int i3 = m714i & 255;
        int i4 = 0;
        boolean z2 = (m714i & 128) == 128;
        long m248e = m248e(i3, 127);
        if (!z2) {
            return c0249q.m715j(m248e);
        }
        C0239g c0239g = new C0239g();
        int[] iArr = AbstractC0057B.f138a;
        AbstractC1136c.m2637e(c0249q, "source");
        C0056A c0056a = AbstractC0057B.f140c;
        C0056A c0056a2 = c0056a;
        int i5 = 0;
        for (long j2 = 0; j2 < m248e; j2++) {
            byte m714i2 = c0249q.m714i();
            byte[] bArr2 = AbstractC1302b.f5337a;
            i4 = (i4 << 8) | (m714i2 & 255);
            i5 += 8;
            while (i5 >= 8) {
                int i6 = i5 - 8;
                C0056A[] c0056aArr = (C0056A[]) c0056a2.f137c;
                AbstractC1136c.m2634b(c0056aArr);
                c0056a2 = c0056aArr[(i4 >>> i6) & 255];
                AbstractC1136c.m2634b(c0056a2);
                if (((C0056A[]) c0056a2.f137c) == null) {
                    c0239g.m685z(c0056a2.f135a);
                    i5 -= c0056a2.f136b;
                    c0056a2 = c0056a;
                } else {
                    i5 = i6;
                }
            }
        }
        while (i5 > 0) {
            C0056A[] c0056aArr2 = (C0056A[]) c0056a2.f137c;
            AbstractC1136c.m2634b(c0056aArr2);
            C0056A c0056a3 = c0056aArr2[(i4 << (8 - i5)) & 255];
            AbstractC1136c.m2634b(c0056a3);
            if (((C0056A[]) c0056a3.f137c) != null || (i2 = c0056a3.f136b) > i5) {
                break;
            }
            c0239g.m685z(c0056a3.f135a);
            i5 -= i2;
            c0056a2 = c0056a;
        }
        return c0239g.m672m(c0239g.f715b);
    }

    /* renamed from: e */
    public final int m248e(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            byte m714i = this.f155b.m714i();
            byte[] bArr = AbstractC1302b.f5337a;
            int i6 = m714i & 255;
            if ((m714i & 128) == 0) {
                return i3 + (i6 << i5);
            }
            i3 += (m714i & Byte.MAX_VALUE) << i5;
            i5 += 7;
        }
    }
}
