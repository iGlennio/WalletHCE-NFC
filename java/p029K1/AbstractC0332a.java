package p029K1;

import p026J1.C0239g;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1191a;

/* renamed from: K1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0332a {

    /* renamed from: a */
    public static final byte[] f871a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1191a.f4563a);
        AbstractC1136c.m2636d(bytes, "(this as java.lang.String).getBytes(charset)");
        f871a = bytes;
    }

    /* renamed from: a */
    public static final String m954a(C0239g c0239g, long j2) {
        AbstractC1136c.m2637e(c0239g, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (c0239g.m667h(j3) == ((byte) 13)) {
                String m676q = c0239g.m676q(j3, AbstractC1191a.f4563a);
                c0239g.m678s(2L);
                return m676q;
            }
        }
        String m676q2 = c0239g.m676q(j2, AbstractC1191a.f4563a);
        c0239g.m678s(1L);
        return m676q2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r19 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return -2;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m955b(p026J1.C0239g r17, p026J1.C0247o r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p029K1.AbstractC0332a.m955b(J1.g, J1.o, boolean):int");
    }
}
