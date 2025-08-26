package p023I1;

import androidx.emoji2.text.C0605s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import p007C1.C0067g;
import p010D1.AbstractC0104l;
import p018H.RunnableC0181a;
import p026J1.C0239g;
import p026J1.C0242j;
import p026J1.C0245m;
import p034M0.C0360e;
import p088j.C0985d0;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p120u1.C1250e;
import p123v1.C1290t;
import p123v1.EnumC1288r;
import p126w1.AbstractC1302b;
import p132y1.C1322b;
import p132y1.C1323c;
import p135z1.C1340h;
import p135z1.C1343k;

/* renamed from: I1.f */
/* loaded from: classes.dex */
public final class C0222f {

    /* renamed from: w */
    public static final List f614w = AbstractC0104l.m391F(EnumC1288r.HTTP_1_1);

    /* renamed from: a */
    public final String f615a;

    /* renamed from: b */
    public C1340h f616b;

    /* renamed from: c */
    public C0221e f617c;

    /* renamed from: d */
    public C0224h f618d;

    /* renamed from: e */
    public C0225i f619e;

    /* renamed from: f */
    public final C1322b f620f;

    /* renamed from: g */
    public String f621g;

    /* renamed from: h */
    public C1343k f622h;

    /* renamed from: i */
    public final ArrayDeque f623i;

    /* renamed from: j */
    public final ArrayDeque f624j;

    /* renamed from: k */
    public long f625k;

    /* renamed from: l */
    public boolean f626l;

    /* renamed from: m */
    public int f627m;

    /* renamed from: n */
    public String f628n;

    /* renamed from: o */
    public boolean f629o;

    /* renamed from: p */
    public int f630p;

    /* renamed from: q */
    public boolean f631q;

    /* renamed from: r */
    public final C0985d0 f632r;

    /* renamed from: s */
    public final Random f633s;

    /* renamed from: t */
    public final long f634t;

    /* renamed from: u */
    public C0223g f635u;

    /* renamed from: v */
    public final long f636v;

    public C0222f(C1323c c1323c, C1032t c1032t, C0985d0 c0985d0, Random random, long j2, long j3) {
        AbstractC1136c.m2637e(c1323c, "taskRunner");
        AbstractC1136c.m2637e(c1032t, "originalRequest");
        AbstractC1136c.m2637e(c0985d0, "listener");
        this.f632r = c0985d0;
        this.f633s = random;
        this.f634t = j2;
        this.f635u = null;
        this.f636v = j3;
        this.f620f = c1323c.m3033e();
        this.f623i = new ArrayDeque();
        this.f624j = new ArrayDeque();
        this.f627m = -1;
        String str = (String) c1032t.f4046d;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(("Request must be GET: " + str).toString());
        }
        C0242j c0242j = C0242j.f716d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f615a = C0360e.m1013m(bArr).mo686a();
    }

    /* renamed from: a */
    public final void m619a(C1290t c1290t, C0605s c0605s) {
        int i2 = c1290t.f5284d;
        if (i2 != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + i2 + ' ' + c1290t.f5283c + '\'');
        }
        String m2982g = C1290t.m2982g("Connection", c1290t);
        if (!"Upgrade".equalsIgnoreCase(m2982g)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + m2982g + '\'');
        }
        String m2982g2 = C1290t.m2982g("Upgrade", c1290t);
        if (!"websocket".equalsIgnoreCase(m2982g2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + m2982g2 + '\'');
        }
        String m2982g3 = C1290t.m2982g("Sec-WebSocket-Accept", c1290t);
        C0242j c0242j = C0242j.f716d;
        String mo686a = C0360e.m1010g(this.f615a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").mo687b("SHA-1").mo686a();
        if (AbstractC1136c.m2633a(mo686a, m2982g3)) {
            if (c0605s == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + mo686a + "' but was '" + m2982g3 + '\'');
    }

    /* renamed from: b */
    public final boolean m620b(String str, int i2) {
        String str2;
        synchronized (this) {
            C0242j c0242j = null;
            try {
                if (i2 < 1000 || i2 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i2;
                } else if ((1004 > i2 || 1006 < i2) && (1015 > i2 || 2999 < i2)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i2 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    C0242j c0242j2 = C0242j.f716d;
                    c0242j = C0360e.m1010g(str);
                    if (c0242j.f719c.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f629o && !this.f626l) {
                    this.f626l = true;
                    this.f624j.add(new C0219c(i2, c0242j));
                    m624f();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    /* renamed from: c */
    public final void m621c(Exception exc) {
        synchronized (this) {
            if (this.f629o) {
                return;
            }
            this.f629o = true;
            C1343k c1343k = this.f622h;
            this.f622h = null;
            C0224h c0224h = this.f618d;
            this.f618d = null;
            C0225i c0225i = this.f619e;
            this.f619e = null;
            this.f620f.m3028e();
            try {
                C0985d0 c0985d0 = this.f632r;
                c0985d0.getClass();
                exc.printStackTrace();
                C1250e c1250e = (C1250e) c0985d0.f3904b;
                c1250e.f4869e = false;
                if (c1250e.f4871g != null) {
                    C1250e.m2920a(c1250e, new RunnableC0181a(c0985d0, exc, 6));
                }
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
        }
    }

    /* renamed from: d */
    public final void m622d(String str, C1343k c1343k) {
        AbstractC1136c.m2637e(str, "name");
        C0223g c0223g = this.f635u;
        AbstractC1136c.m2634b(c0223g);
        synchronized (this) {
            try {
                this.f621g = str;
                this.f622h = c1343k;
                this.f619e = new C0225i(c1343k.f5554b, this.f633s, c0223g.f637a, c0223g.f639c, this.f636v);
                this.f617c = new C0221e(this);
                long j2 = this.f634t;
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                    this.f620f.m3026c(new C0067g(str.concat(" ping"), nanos, this), nanos);
                }
                if (!this.f624j.isEmpty()) {
                    m624f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f618d = new C0224h(c1343k.f5553a, this, c0223g.f637a, c0223g.f641e);
    }

    /* renamed from: e */
    public final void m623e() {
        while (this.f627m == -1) {
            C0224h c0224h = this.f618d;
            AbstractC1136c.m2634b(c0224h);
            c0224h.m627h();
            if (!c0224h.f647e) {
                int i2 = c0224h.f644b;
                if (i2 != 1 && i2 != 2) {
                    byte[] bArr = AbstractC1302b.f5337a;
                    String hexString = Integer.toHexString(i2);
                    AbstractC1136c.m2636d(hexString, "Integer.toHexString(this)");
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (!c0224h.f643a) {
                    long j2 = c0224h.f645c;
                    C0239g c0239g = c0224h.f650h;
                    if (j2 > 0) {
                        c0224h.f653k.m716k(c0239g, j2);
                    }
                    if (c0224h.f646d) {
                        if (c0224h.f648f) {
                            C0217a c0217a = c0224h.f651i;
                            if (c0217a == null) {
                                c0217a = new C0217a(1, c0224h.f656n);
                                c0224h.f651i = c0217a;
                            }
                            C0239g c0239g2 = c0217a.f604b;
                            if (c0239g2.f715b != 0) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            Inflater inflater = (Inflater) c0217a.f606d;
                            if (c0217a.f605c) {
                                inflater.reset();
                            }
                            c0239g2.m684y(c0239g);
                            c0239g2.m658B(65535);
                            long bytesRead = inflater.getBytesRead() + c0239g2.f715b;
                            do {
                                ((C0245m) c0217a.f607e).m707g(c0239g, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        C0985d0 c0985d0 = c0224h.f654l.f632r;
                        if (i2 == 1) {
                            String m677r = c0239g.m677r();
                            c0985d0.getClass();
                            C1250e c1250e = (C1250e) c0985d0.f3904b;
                            if (c1250e.f4871g != null) {
                                C1250e.m2920a(c1250e, new RunnableC0181a(c0985d0, m677r, 5));
                            }
                        } else {
                            AbstractC1136c.m2637e(c0239g.m672m(c0239g.f715b), "bytes");
                            c0985d0.getClass();
                        }
                    } else {
                        while (!c0224h.f643a) {
                            c0224h.m627h();
                            if (!c0224h.f647e) {
                                break;
                            } else {
                                c0224h.m626g();
                            }
                        }
                        if (c0224h.f644b != 0) {
                            int i3 = c0224h.f644b;
                            byte[] bArr2 = AbstractC1302b.f5337a;
                            String hexString2 = Integer.toHexString(i3);
                            AbstractC1136c.m2636d(hexString2, "Integer.toHexString(this)");
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    }
                }
                throw new IOException("closed");
            }
            c0224h.m626g();
        }
    }

    /* renamed from: f */
    public final void m624f() {
        byte[] bArr = AbstractC1302b.f5337a;
        C0221e c0221e = this.f617c;
        if (c0221e != null) {
            this.f620f.m3026c(c0221e, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        r4 = new p026J1.C0239g();
        r4.m659C(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if (r5 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        r4.m681v(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011f, code lost:
    
        r1.m628g(8, r4.m672m(r4.f715b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0124, code lost:
    
        if (r6 == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0126, code lost:
    
        r1 = r12.f632r;
        p095l1.AbstractC1136c.m2634b(r7);
        r1.getClass();
        r3 = (p120u1.C1250e) r1.f3904b;
        r3.f4869e = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
    
        if (r3.f4871g == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0138, code lost:
    
        p120u1.C1250e.m2920a(r3, new p120u1.RunnableC1249d(r1, r0 ? 1 : 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0150, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        r1.f659c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0153, code lost:
    
        throw r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #3 {all -> 0x008b, blocks: (B:20:0x0081, B:28:0x008e, B:31:0x0094, B:32:0x00a1, B:35:0x00ad, B:39:0x00b1, B:40:0x00b2, B:41:0x00b3, B:42:0x00ba, B:43:0x00bb, B:46:0x00c1, B:55:0x00e6, B:57:0x010a, B:59:0x0114, B:60:0x0117, B:64:0x0122, B:66:0x0126, B:68:0x0138, B:71:0x0151, B:72:0x0153, B:73:0x0154, B:74:0x015d, B:80:0x00fa, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x016b, B:63:0x011f, B:34:0x00a2), top: B:18:0x007f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0142 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0147 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: all -> 0x008b, TryCatch #3 {all -> 0x008b, blocks: (B:20:0x0081, B:28:0x008e, B:31:0x0094, B:32:0x00a1, B:35:0x00ad, B:39:0x00b1, B:40:0x00b2, B:41:0x00b3, B:42:0x00ba, B:43:0x00bb, B:46:0x00c1, B:55:0x00e6, B:57:0x010a, B:59:0x0114, B:60:0x0117, B:64:0x0122, B:66:0x0126, B:68:0x0138, B:71:0x0151, B:72:0x0153, B:73:0x0154, B:74:0x015d, B:80:0x00fa, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x016b, B:63:0x011f, B:34:0x00a2), top: B:18:0x007f, inners: #0, #1 }] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [I1.i] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m625g() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p023I1.C0222f.m625g():boolean");
    }
}
