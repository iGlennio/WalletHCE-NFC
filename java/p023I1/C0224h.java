package p023I1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p005C.AbstractC0044g;
import p026J1.AbstractC0251s;
import p026J1.C0239g;
import p026J1.C0242j;
import p026J1.C0249q;
import p026J1.C0250r;
import p026J1.InterfaceC0254v;
import p088j.C0985d0;
import p095l1.AbstractC1136c;
import p120u1.C1250e;
import p120u1.RunnableC1249d;
import p126w1.AbstractC1302b;
import p135z1.C1343k;

/* renamed from: I1.h */
/* loaded from: classes.dex */
public final class C0224h implements Closeable {

    /* renamed from: a */
    public boolean f643a;

    /* renamed from: b */
    public int f644b;

    /* renamed from: c */
    public long f645c;

    /* renamed from: d */
    public boolean f646d;

    /* renamed from: e */
    public boolean f647e;

    /* renamed from: f */
    public boolean f648f;

    /* renamed from: g */
    public final C0239g f649g;

    /* renamed from: h */
    public final C0239g f650h;

    /* renamed from: i */
    public C0217a f651i;

    /* renamed from: j */
    public final byte[] f652j;

    /* renamed from: k */
    public final C0249q f653k;

    /* renamed from: l */
    public final C0222f f654l;

    /* renamed from: m */
    public final boolean f655m;

    /* renamed from: n */
    public final boolean f656n;

    public C0224h(C0249q c0249q, C0222f c0222f, boolean z2, boolean z3) {
        AbstractC1136c.m2637e(c0249q, "source");
        this.f653k = c0249q;
        this.f654l = c0222f;
        this.f655m = z2;
        this.f656n = z3;
        this.f649g = new C0239g();
        this.f650h = new C0239g();
        this.f652j = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0217a c0217a = this.f651i;
        if (c0217a != null) {
            c0217a.close();
        }
    }

    /* renamed from: g */
    public final void m626g() {
        String str;
        short s2;
        C0224h c0224h;
        C0225i c0225i;
        String m153e;
        int i2 = 1;
        long j2 = this.f645c;
        if (j2 > 0) {
            this.f653k.m716k(this.f649g, j2);
        }
        switch (this.f644b) {
            case 8:
                C0239g c0239g = this.f649g;
                long j3 = c0239g.f715b;
                if (j3 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                C1343k c1343k = null;
                if (j3 != 0) {
                    s2 = c0239g.m675p();
                    str = this.f649g.m677r();
                    if (s2 < 1000 || s2 >= 5000) {
                        m153e = AbstractC0044g.m153e("Code must be in range [1000,5000): ", s2);
                    } else if ((1004 > s2 || 1006 < s2) && (1015 > s2 || 2999 < s2)) {
                        m153e = null;
                    } else {
                        m153e = "Code " + ((int) s2) + " is reserved and may not be used.";
                    }
                    if (m153e != null) {
                        throw new ProtocolException(m153e);
                    }
                } else {
                    str = "";
                    s2 = 1005;
                }
                C0222f c0222f = this.f654l;
                if (s2 == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (c0222f) {
                    if (c0222f.f627m != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    c0222f.f627m = s2;
                    c0222f.f628n = str;
                    if (c0222f.f626l && c0222f.f624j.isEmpty()) {
                        C1343k c1343k2 = c0222f.f622h;
                        c0222f.f622h = null;
                        c0224h = c0222f.f618d;
                        c0222f.f618d = null;
                        c0225i = c0222f.f619e;
                        c0222f.f619e = null;
                        c0222f.f620f.m3028e();
                        c1343k = c1343k2;
                    } else {
                        c0224h = null;
                        c0225i = null;
                    }
                }
                try {
                    c0222f.f632r.getClass();
                    if (c1343k != null) {
                        C0985d0 c0985d0 = c0222f.f632r;
                        c0985d0.getClass();
                        C1250e c1250e = (C1250e) c0985d0.f3904b;
                        c1250e.f4869e = false;
                        if (c1250e.f4871g != null) {
                            C1250e.m2920a(c1250e, new RunnableC1249d(c0985d0, i2));
                        }
                    }
                    this.f643a = true;
                    return;
                } finally {
                    if (c1343k != null) {
                        AbstractC1302b.m2994c(c1343k);
                    }
                    if (c0224h != null) {
                        AbstractC1302b.m2994c(c0224h);
                    }
                    if (c0225i != null) {
                        AbstractC1302b.m2994c(c0225i);
                    }
                }
            case 9:
                C0222f c0222f2 = this.f654l;
                C0239g c0239g2 = this.f649g;
                C0242j m672m = c0239g2.m672m(c0239g2.f715b);
                synchronized (c0222f2) {
                    try {
                        AbstractC1136c.m2637e(m672m, "payload");
                        if (!c0222f2.f629o && (!c0222f2.f626l || !c0222f2.f624j.isEmpty())) {
                            c0222f2.f623i.add(m672m);
                            c0222f2.m624f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                C0222f c0222f3 = this.f654l;
                C0239g c0239g3 = this.f649g;
                C0242j m672m2 = c0239g3.m672m(c0239g3.f715b);
                synchronized (c0222f3) {
                    AbstractC1136c.m2637e(m672m2, "payload");
                    c0222f3.f631q = false;
                }
                return;
            default:
                int i3 = this.f644b;
                byte[] bArr = AbstractC1302b.f5337a;
                String hexString = Integer.toHexString(i3);
                AbstractC1136c.m2636d(hexString, "Integer.toHexString(this)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    /* renamed from: h */
    public final void m627h() {
        boolean z2;
        long j2;
        C0224h c0224h = this;
        if (c0224h.f643a) {
            throw new IOException("closed");
        }
        C0249q c0249q = c0224h.f653k;
        long mo704h = c0249q.f738c.mo100a().mo704h();
        InterfaceC0254v interfaceC0254v = c0249q.f738c;
        interfaceC0254v.mo100a().mo698b();
        try {
            byte m714i = c0249q.m714i();
            byte[] bArr = AbstractC1302b.f5337a;
            interfaceC0254v.mo100a().mo703g(mo704h, TimeUnit.NANOSECONDS);
            int i2 = m714i & 15;
            c0224h.f644b = i2;
            boolean z3 = (m714i & 128) != 0;
            c0224h.f646d = z3;
            boolean z4 = (m714i & 8) != 0;
            c0224h.f647e = z4;
            if (z4 && !z3) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z5 = (m714i & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z5) {
                    z2 = false;
                } else {
                    if (!c0224h.f655m) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z2 = true;
                }
                c0224h.f648f = z2;
            } else if (z5) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((m714i & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((m714i & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte m714i2 = c0249q.m714i();
            boolean z6 = (m714i2 & 128) != 0;
            if (z6) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j3 = m714i2 & Byte.MAX_VALUE;
            c0224h.f645c = j3;
            long j4 = 126;
            C0239g c0239g = c0249q.f736a;
            if (j3 == j4) {
                c0224h.f645c = c0249q.m720o() & 65535;
            } else if (j3 == 127) {
                c0249q.m723r(8L);
                if (c0239g.f715b < 8) {
                    throw new EOFException();
                }
                C0250r c0250r = c0239g.f714a;
                AbstractC1136c.m2634b(c0250r);
                int i3 = c0250r.f740b;
                int i4 = c0250r.f741c;
                if (i4 - i3 < 8) {
                    j2 = ((c0239g.m674o() & 4294967295L) << 32) | (4294967295L & c0239g.m674o());
                } else {
                    byte[] bArr2 = c0250r.f739a;
                    int i5 = i3 + 7;
                    long j5 = ((bArr2[i3 + 2] & 255) << 40) | ((bArr2[i3] & 255) << 56) | ((bArr2[i3 + 1] & 255) << 48) | ((bArr2[i3 + 3] & 255) << 32) | ((bArr2[i3 + 4] & 255) << 24) | ((bArr2[i3 + 5] & 255) << 16) | ((bArr2[i3 + 6] & 255) << 8);
                    int i6 = i3 + 8;
                    j2 = (bArr2[i5] & 255) | j5;
                    c0239g.f715b -= 8;
                    if (i6 == i4) {
                        c0239g.f714a = c0250r.m725a();
                        AbstractC0251s.m729a(c0250r);
                    } else {
                        c0250r.f740b = i6;
                    }
                    c0224h = this;
                }
                c0224h.f645c = j2;
                if (j2 < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(c0224h.f645c);
                    AbstractC1136c.m2636d(hexString, "java.lang.Long.toHexString(this)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (c0224h.f647e && c0224h.f645c > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!z6) {
                return;
            }
            byte[] bArr3 = c0224h.f652j;
            AbstractC1136c.m2634b(bArr3);
            try {
                c0249q.m723r(bArr3.length);
                c0239g.m673n(bArr3);
            } catch (EOFException e2) {
                int i7 = 0;
                while (true) {
                    long j6 = c0239g.f715b;
                    if (j6 <= 0) {
                        throw e2;
                    }
                    int m668i = c0239g.m668i(i7, (int) j6, bArr3);
                    if (m668i == -1) {
                        throw new AssertionError();
                    }
                    i7 += m668i;
                }
            }
        } catch (Throwable th) {
            interfaceC0254v.mo100a().mo703g(mo704h, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
