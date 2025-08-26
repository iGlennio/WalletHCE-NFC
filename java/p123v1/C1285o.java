package p123v1;

import java.util.regex.Pattern;
import p095l1.AbstractC1136c;

/* renamed from: v1.o */
/* loaded from: classes.dex */
public final class C1285o {

    /* renamed from: c */
    public static final Pattern f5200c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d */
    public static final Pattern f5201d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f5202a;

    /* renamed from: b */
    public final String[] f5203b;

    public C1285o(String str, String[] strArr) {
        this.f5202a = str;
        this.f5203b = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset m2978a(java.nio.charset.Charset r8) {
        /*
            r7 = this;
            java.lang.String[] r0 = r7.f5203b
            o1.c r1 = new o1.c
            int r2 = r0.length
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r1.<init>(r4, r2, r3)
            r2 = 2
            o1.a r1 = p010D1.AbstractC0096d.m351k0(r1, r2)
            int r2 = r1.f4432a
            int r4 = r1.f4433b
            int r1 = r1.f4434c
            if (r1 < 0) goto L1b
            if (r2 > r4) goto L2f
            goto L1d
        L1b:
            if (r2 < r4) goto L2f
        L1d:
            r5 = r0[r2]
            java.lang.String r6 = "charset"
            boolean r5 = p112r1.AbstractC1199i.m2766r0(r5, r6)
            if (r5 == 0) goto L2b
            int r2 = r2 + r3
            r0 = r0[r2]
            goto L30
        L2b:
            if (r2 == r4) goto L2f
            int r2 = r2 + r1
            goto L1d
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L36
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L36
        L36:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p123v1.C1285o.m2978a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1285o) && AbstractC1136c.m2633a(((C1285o) obj).f5202a, this.f5202a);
    }

    public final int hashCode() {
        return this.f5202a.hashCode();
    }

    public final String toString() {
        return this.f5202a;
    }
}
