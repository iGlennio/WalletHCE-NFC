package p026J1;

import p075d1.AbstractC0756h;
import p095l1.AbstractC1136c;

/* renamed from: J1.r */
/* loaded from: classes.dex */
public final class C0250r {

    /* renamed from: a */
    public final byte[] f739a;

    /* renamed from: b */
    public int f740b;

    /* renamed from: c */
    public int f741c;

    /* renamed from: d */
    public boolean f742d;

    /* renamed from: e */
    public final boolean f743e;

    /* renamed from: f */
    public C0250r f744f;

    /* renamed from: g */
    public C0250r f745g;

    public C0250r() {
        this.f739a = new byte[8192];
        this.f743e = true;
        this.f742d = false;
    }

    /* renamed from: a */
    public final C0250r m725a() {
        C0250r c0250r = this.f744f;
        if (c0250r == this) {
            c0250r = null;
        }
        C0250r c0250r2 = this.f745g;
        AbstractC1136c.m2634b(c0250r2);
        c0250r2.f744f = this.f744f;
        C0250r c0250r3 = this.f744f;
        AbstractC1136c.m2634b(c0250r3);
        c0250r3.f745g = this.f745g;
        this.f744f = null;
        this.f745g = null;
        return c0250r;
    }

    /* renamed from: b */
    public final void m726b(C0250r c0250r) {
        AbstractC1136c.m2637e(c0250r, "segment");
        c0250r.f745g = this;
        c0250r.f744f = this.f744f;
        C0250r c0250r2 = this.f744f;
        AbstractC1136c.m2634b(c0250r2);
        c0250r2.f745g = c0250r;
        this.f744f = c0250r;
    }

    /* renamed from: c */
    public final C0250r m727c() {
        this.f742d = true;
        return new C0250r(this.f739a, this.f740b, this.f741c, true, false);
    }

    /* renamed from: d */
    public final void m728d(C0250r c0250r, int i2) {
        AbstractC1136c.m2637e(c0250r, "sink");
        if (!c0250r.f743e) {
            throw new IllegalStateException("only owner can write");
        }
        int i3 = c0250r.f741c;
        int i4 = i3 + i2;
        byte[] bArr = c0250r.f739a;
        if (i4 > 8192) {
            if (c0250r.f742d) {
                throw new IllegalArgumentException();
            }
            int i5 = c0250r.f740b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0756h.m2049o0(0, i5, i3, bArr, bArr);
            c0250r.f741c -= c0250r.f740b;
            c0250r.f740b = 0;
        }
        int i6 = c0250r.f741c;
        int i7 = this.f740b;
        AbstractC0756h.m2049o0(i6, i7, i7 + i2, this.f739a, bArr);
        c0250r.f741c += i2;
        this.f740b += i2;
    }

    public C0250r(byte[] bArr, int i2, int i3, boolean z2, boolean z3) {
        AbstractC1136c.m2637e(bArr, "data");
        this.f739a = bArr;
        this.f740b = i2;
        this.f741c = i3;
        this.f742d = z2;
        this.f743e = z3;
    }
}
