package p001A1;

import p026J1.C0242j;
import p034M0.C0360e;
import p095l1.AbstractC1136c;
import p123v1.C1290t;
import p126w1.AbstractC1302b;

/* renamed from: A1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0007f {
    static {
        C0242j c0242j = C0242j.f716d;
        C0360e.m1010g("\"\\");
        C0360e.m1010g("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m18a(C1290t c1290t) {
        if (AbstractC1136c.m2633a((String) c1290t.f5281a.f4046d, "HEAD")) {
            return false;
        }
        int i2 = c1290t.f5284d;
        return (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && AbstractC1302b.m3002k(c1290t) == -1 && !"chunked".equalsIgnoreCase(C1290t.m2982g("Transfer-Encoding", c1290t))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e8, code lost:
    
        if (((java.util.regex.Pattern) r3.f4339b).matcher(r0).matches() == false) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m19b(p123v1.C1272b r36, p123v1.C1283m r37, p123v1.C1281k r38) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p001A1.AbstractC0007f.m19b(v1.b, v1.m, v1.k):void");
    }
}
