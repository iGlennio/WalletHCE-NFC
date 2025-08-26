package p004B1;

import p026J1.C0249q;
import p088j.C0985d0;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1199i;
import p123v1.C1281k;

/* renamed from: B1.a */
/* loaded from: classes.dex */
public final class C0030a {

    /* renamed from: a */
    public final /* synthetic */ int f78a;

    /* renamed from: b */
    public long f79b;

    /* renamed from: c */
    public Object f80c;

    public C0030a(C0249q c0249q) {
        this.f78a = 0;
        AbstractC1136c.m2637e(c0249q, "source");
        this.f80c = c0249q;
        this.f79b = 262144;
    }

    /* renamed from: a */
    public void m91a(int i2) {
        if (i2 < 64) {
            this.f79b &= ~(1 << i2);
            return;
        }
        C0030a c0030a = (C0030a) this.f80c;
        if (c0030a != null) {
            c0030a.m91a(i2 - 64);
        }
    }

    /* renamed from: b */
    public int m92b(int i2) {
        C0030a c0030a = (C0030a) this.f80c;
        if (c0030a == null) {
            return i2 >= 64 ? Long.bitCount(this.f79b) : Long.bitCount(this.f79b & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f79b & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f79b) + c0030a.m92b(i2 - 64);
    }

    /* renamed from: c */
    public void m93c() {
        if (((C0030a) this.f80c) == null) {
            this.f80c = new C0030a();
        }
    }

    /* renamed from: d */
    public boolean m94d(int i2) {
        if (i2 < 64) {
            return (this.f79b & (1 << i2)) != 0;
        }
        m93c();
        return ((C0030a) this.f80c).m94d(i2 - 64);
    }

    /* renamed from: e */
    public void m95e(int i2, boolean z2) {
        if (i2 >= 64) {
            m93c();
            ((C0030a) this.f80c).m95e(i2 - 64, z2);
            return;
        }
        long j2 = this.f79b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i2) - 1;
        this.f79b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            m99i(i2);
        } else {
            m91a(i2);
        }
        if (z3 || ((C0030a) this.f80c) != null) {
            m93c();
            ((C0030a) this.f80c).m95e(0, z3);
        }
    }

    /* renamed from: f */
    public C1281k m96f() {
        C0985d0 c0985d0 = new C0985d0(8);
        while (true) {
            String m721p = ((C0249q) this.f80c).m721p(this.f79b);
            this.f79b -= m721p.length();
            if (m721p.length() == 0) {
                return c0985d0.m2462i();
            }
            int m2769u0 = AbstractC1199i.m2769u0(m721p, ':', 1, 4);
            if (m2769u0 != -1) {
                String substring = m721p.substring(0, m2769u0);
                AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = m721p.substring(m2769u0 + 1);
                AbstractC1136c.m2636d(substring2, "(this as java.lang.String).substring(startIndex)");
                c0985d0.m2461g(substring, substring2);
            } else if (m721p.charAt(0) == ':') {
                String substring3 = m721p.substring(1);
                AbstractC1136c.m2636d(substring3, "(this as java.lang.String).substring(startIndex)");
                c0985d0.m2461g("", substring3);
            } else {
                c0985d0.m2461g("", m721p);
            }
        }
    }

    /* renamed from: g */
    public boolean m97g(int i2) {
        if (i2 >= 64) {
            m93c();
            return ((C0030a) this.f80c).m97g(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.f79b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f79b = j4;
        long j5 = j2 - 1;
        this.f79b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0030a c0030a = (C0030a) this.f80c;
        if (c0030a != null) {
            if (c0030a.m94d(0)) {
                m99i(63);
            }
            ((C0030a) this.f80c).m97g(0);
        }
        return z2;
    }

    /* renamed from: h */
    public void m98h() {
        this.f79b = 0L;
        C0030a c0030a = (C0030a) this.f80c;
        if (c0030a != null) {
            c0030a.m98h();
        }
    }

    /* renamed from: i */
    public void m99i(int i2) {
        if (i2 < 64) {
            this.f79b |= 1 << i2;
        } else {
            m93c();
            ((C0030a) this.f80c).m99i(i2 - 64);
        }
    }

    public String toString() {
        switch (this.f78a) {
            case 1:
                if (((C0030a) this.f80c) == null) {
                    return Long.toBinaryString(this.f79b);
                }
                return ((C0030a) this.f80c).toString() + "xx" + Long.toBinaryString(this.f79b);
            default:
                return super.toString();
        }
    }

    public C0030a() {
        this.f78a = 1;
        this.f79b = 0L;
    }
}
