package p007C1;

import java.util.ArrayList;
import java.util.Arrays;
import p026J1.C0239g;
import p026J1.C0242j;
import p075d1.AbstractC0756h;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;

/* renamed from: C1.d */
/* loaded from: classes.dex */
public final class C0064d {

    /* renamed from: b */
    public boolean f162b;

    /* renamed from: f */
    public int f166f;

    /* renamed from: g */
    public int f167g;

    /* renamed from: h */
    public final C0239g f168h;

    /* renamed from: a */
    public int f161a = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f163c = 4096;

    /* renamed from: d */
    public C0062b[] f164d = new C0062b[8];

    /* renamed from: e */
    public int f165e = 7;

    public C0064d(C0239g c0239g) {
        this.f168h = c0239g;
    }

    /* renamed from: a */
    public final void m249a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f164d.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f165e;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                C0062b c0062b = this.f164d[length];
                AbstractC1136c.m2634b(c0062b);
                i2 -= c0062b.f151a;
                int i5 = this.f167g;
                C0062b c0062b2 = this.f164d[length];
                AbstractC1136c.m2634b(c0062b2);
                this.f167g = i5 - c0062b2.f151a;
                this.f166f--;
                i4++;
                length--;
            }
            C0062b[] c0062bArr = this.f164d;
            int i6 = i3 + 1;
            System.arraycopy(c0062bArr, i6, c0062bArr, i6 + i4, this.f166f);
            C0062b[] c0062bArr2 = this.f164d;
            int i7 = this.f165e + 1;
            Arrays.fill(c0062bArr2, i7, i7 + i4, (Object) null);
            this.f165e += i4;
        }
    }

    /* renamed from: b */
    public final void m250b(C0062b c0062b) {
        int i2 = this.f163c;
        int i3 = c0062b.f151a;
        if (i3 > i2) {
            C0062b[] c0062bArr = this.f164d;
            AbstractC0756h.m2052r0(c0062bArr, 0, c0062bArr.length);
            this.f165e = this.f164d.length - 1;
            this.f166f = 0;
            this.f167g = 0;
            return;
        }
        m249a((this.f167g + i3) - i2);
        int i4 = this.f166f + 1;
        C0062b[] c0062bArr2 = this.f164d;
        if (i4 > c0062bArr2.length) {
            C0062b[] c0062bArr3 = new C0062b[c0062bArr2.length * 2];
            System.arraycopy(c0062bArr2, 0, c0062bArr3, c0062bArr2.length, c0062bArr2.length);
            this.f165e = this.f164d.length - 1;
            this.f164d = c0062bArr3;
        }
        int i5 = this.f165e;
        this.f165e = i5 - 1;
        this.f164d[i5] = c0062b;
        this.f166f++;
        this.f167g += i3;
    }

    /* renamed from: c */
    public final void m251c(C0242j c0242j) {
        AbstractC1136c.m2637e(c0242j, "data");
        C0239g c0239g = this.f168h;
        int[] iArr = AbstractC0057B.f138a;
        int mo688c = c0242j.mo688c();
        long j2 = 0;
        for (int i2 = 0; i2 < mo688c; i2++) {
            byte mo691f = c0242j.mo691f(i2);
            byte[] bArr = AbstractC1302b.f5337a;
            j2 += AbstractC0057B.f139b[mo691f & 255];
        }
        if (((int) ((j2 + 7) >> 3)) >= c0242j.mo688c()) {
            m253e(c0242j.mo688c(), 127, 0);
            c0239g.m681v(c0242j);
            return;
        }
        C0239g c0239g2 = new C0239g();
        int[] iArr2 = AbstractC0057B.f138a;
        int mo688c2 = c0242j.mo688c();
        long j3 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < mo688c2; i4++) {
            byte mo691f2 = c0242j.mo691f(i4);
            byte[] bArr2 = AbstractC1302b.f5337a;
            int i5 = mo691f2 & 255;
            int i6 = AbstractC0057B.f138a[i5];
            byte b = AbstractC0057B.f139b[i5];
            j3 = (j3 << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                c0239g2.m685z((int) (j3 >> i3));
            }
        }
        if (i3 > 0) {
            c0239g2.m685z((int) ((255 >>> i3) | (j3 << (8 - i3))));
        }
        C0242j m672m = c0239g2.m672m(c0239g2.f715b);
        m253e(m672m.mo688c(), 127, 128);
        c0239g.m681v(m672m);
    }

    /* renamed from: d */
    public final void m252d(ArrayList arrayList) {
        int i2;
        int i3;
        if (this.f162b) {
            int i4 = this.f161a;
            if (i4 < this.f163c) {
                m253e(i4, 31, 32);
            }
            this.f162b = false;
            this.f161a = Integer.MAX_VALUE;
            m253e(this.f163c, 31, 32);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0062b c0062b = (C0062b) arrayList.get(i5);
            C0242j mo694i = c0062b.f152b.mo694i();
            Integer num = (Integer) AbstractC0065e.f170b.get(mo694i);
            C0242j c0242j = c0062b.f153c;
            if (num != null) {
                int intValue = num.intValue();
                i3 = intValue + 1;
                if (2 <= i3 && 7 >= i3) {
                    C0062b[] c0062bArr = AbstractC0065e.f169a;
                    if (AbstractC1136c.m2633a(c0062bArr[intValue].f153c, c0242j)) {
                        i2 = i3;
                    } else if (AbstractC1136c.m2633a(c0062bArr[i3].f153c, c0242j)) {
                        i3 = intValue + 2;
                        i2 = i3;
                    }
                }
                i2 = i3;
                i3 = -1;
            } else {
                i2 = -1;
                i3 = -1;
            }
            if (i3 == -1) {
                int i6 = this.f165e + 1;
                int length = this.f164d.length;
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    C0062b c0062b2 = this.f164d[i6];
                    AbstractC1136c.m2634b(c0062b2);
                    if (AbstractC1136c.m2633a(c0062b2.f152b, mo694i)) {
                        C0062b c0062b3 = this.f164d[i6];
                        AbstractC1136c.m2634b(c0062b3);
                        if (AbstractC1136c.m2633a(c0062b3.f153c, c0242j)) {
                            i3 = AbstractC0065e.f169a.length + (i6 - this.f165e);
                            break;
                        } else if (i2 == -1) {
                            i2 = (i6 - this.f165e) + AbstractC0065e.f169a.length;
                        }
                    }
                    i6++;
                }
            }
            if (i3 != -1) {
                m253e(i3, 127, 128);
            } else if (i2 == -1) {
                this.f168h.m685z(64);
                m251c(mo694i);
                m251c(c0242j);
                m250b(c0062b);
            } else {
                C0242j c0242j2 = C0062b.f145d;
                mo694i.getClass();
                AbstractC1136c.m2637e(c0242j2, "prefix");
                if (!mo694i.mo692g(c0242j2.mo688c(), c0242j2) || AbstractC1136c.m2633a(C0062b.f150i, mo694i)) {
                    m253e(i2, 63, 64);
                    m251c(c0242j);
                    m250b(c0062b);
                } else {
                    m253e(i2, 15, 0);
                    m251c(c0242j);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m253e(int i2, int i3, int i4) {
        C0239g c0239g = this.f168h;
        if (i2 < i3) {
            c0239g.m685z(i2 | i4);
            return;
        }
        c0239g.m685z(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            c0239g.m685z(128 | (i5 & 127));
            i5 >>>= 7;
        }
        c0239g.m685z(i5);
    }
}
