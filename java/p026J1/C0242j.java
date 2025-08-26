package p026J1;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import p010D1.AbstractC0104l;
import p029K1.AbstractC0333b;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1191a;

/* renamed from: J1.j */
/* loaded from: classes.dex */
public class C0242j implements Serializable, Comparable {

    /* renamed from: d */
    public static final C0242j f716d = new C0242j(new byte[0]);

    /* renamed from: a */
    public transient int f717a;

    /* renamed from: b */
    public transient String f718b;

    /* renamed from: c */
    public final byte[] f719c;

    public C0242j(byte[] bArr) {
        AbstractC1136c.m2637e(bArr, "data");
        this.f719c = bArr;
    }

    /* renamed from: a */
    public String mo686a() {
        byte[] bArr = AbstractC0233a.f694a;
        byte[] bArr2 = this.f719c;
        AbstractC1136c.m2637e(bArr2, "$this$encodeBase64");
        AbstractC1136c.m2637e(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b = bArr2[i2];
            int i4 = i2 + 2;
            byte b2 = bArr2[i2 + 1];
            i2 += 3;
            byte b3 = bArr2[i4];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr3[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr3[i5] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i2];
            bArr3[i3] = bArr[(b4 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i3 + 2] = b5;
            bArr3[i3 + 3] = b5;
        } else if (length2 == 2) {
            int i6 = i2 + 1;
            byte b6 = bArr2[i2];
            byte b7 = bArr2[i6];
            bArr3[i3] = bArr[(b6 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(b7 & 15) << 2];
            bArr3[i3 + 3] = (byte) 61;
        }
        return new String(bArr3, AbstractC1191a.f4563a);
    }

    /* renamed from: b */
    public C0242j mo687b(String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.f719c);
        AbstractC1136c.m2636d(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new C0242j(digest);
    }

    /* renamed from: c */
    public int mo688c() {
        return this.f719c.length;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0242j c0242j = (C0242j) obj;
        AbstractC1136c.m2637e(c0242j, "other");
        int mo688c = mo688c();
        int mo688c2 = c0242j.mo688c();
        int min = Math.min(mo688c, mo688c2);
        for (int i2 = 0; i2 < min; i2++) {
            int mo691f = mo691f(i2) & 255;
            int mo691f2 = c0242j.mo691f(i2) & 255;
            if (mo691f != mo691f2) {
                return mo691f < mo691f2 ? -1 : 1;
            }
        }
        if (mo688c == mo688c2) {
            return 0;
        }
        return mo688c < mo688c2 ? -1 : 1;
    }

    /* renamed from: d */
    public String mo689d() {
        byte[] bArr = this.f719c;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = AbstractC0333b.f872a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public byte[] mo690e() {
        return this.f719c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0242j) {
            C0242j c0242j = (C0242j) obj;
            int mo688c = c0242j.mo688c();
            byte[] bArr = this.f719c;
            if (mo688c == bArr.length && c0242j.mo693h(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte mo691f(int i2) {
        return this.f719c[i2];
    }

    /* renamed from: g */
    public boolean mo692g(int i2, C0242j c0242j) {
        AbstractC1136c.m2637e(c0242j, "other");
        return c0242j.mo693h(0, this.f719c, 0, i2);
    }

    /* renamed from: h */
    public boolean mo693h(int i2, byte[] bArr, int i3, int i4) {
        AbstractC1136c.m2637e(bArr, "other");
        if (i2 < 0) {
            return false;
        }
        byte[] bArr2 = this.f719c;
        return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && AbstractC0104l.m399a(i2, i3, i4, bArr2, bArr);
    }

    public int hashCode() {
        int i2 = this.f717a;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f719c);
        this.f717a = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public C0242j mo694i() {
        byte b;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f719c;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC1136c.m2636d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 + 32);
                    }
                }
                return new C0242j(copyOf);
            }
            i2++;
        }
    }

    /* renamed from: j */
    public final String m695j() {
        String str = this.f718b;
        if (str != null) {
            return str;
        }
        byte[] mo690e = mo690e();
        AbstractC1136c.m2637e(mo690e, "$this$toUtf8String");
        String str2 = new String(mo690e, AbstractC1191a.f4563a);
        this.f718b = str2;
        return str2;
    }

    /* renamed from: k */
    public void mo696k(C0239g c0239g, int i2) {
        AbstractC1136c.m2637e(c0239g, "buffer");
        c0239g.m683x(this.f719c, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00eb, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0125, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0129, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00cb, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0170, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x016b, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0161, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a0, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a3, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a6, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0135, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01a9, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008c, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b9, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007b, code lost:
    
        if (r6 == 64) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f4, code lost:
    
        if (r6 == 64) goto L184;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p026J1.C0242j.toString():java.lang.String");
    }
}
