package p113s;

import p107q.C1179c;
import p107q.C1182f;

/* renamed from: s.j */
/* loaded from: classes.dex */
public abstract class AbstractC1209j {

    /* renamed from: a */
    public static final boolean[] f4753a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:162:0x028e, code lost:
    
        if (r8.f4595d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        if (r4.f4595d == r8) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06ec A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2851a(p113s.C1204e r39, p107q.C1179c r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p113s.AbstractC1209j.m2851a(s.e, q.c, java.util.ArrayList, int):void");
    }

    /* renamed from: b */
    public static void m2852b(C1204e c1204e, C1179c c1179c, C1203d c1203d) {
        c1203d.f4655o = -1;
        c1203d.f4657p = -1;
        int i2 = c1204e.f4658p0[0];
        int[] iArr = c1203d.f4658p0;
        if (i2 != 2 && iArr[0] == 4) {
            C1202c c1202c = c1203d.f4609I;
            int i3 = c1202c.f4598g;
            int m2822q = c1204e.m2822q();
            C1202c c1202c2 = c1203d.f4611K;
            int i4 = m2822q - c1202c2.f4598g;
            c1202c.f4600i = c1179c.m2729k(c1202c);
            c1202c2.f4600i = c1179c.m2729k(c1202c2);
            c1179c.m2722d(c1202c.f4600i, i3);
            c1179c.m2722d(c1202c2.f4600i, i4);
            c1203d.f4655o = 2;
            c1203d.f4625Y = i3;
            int i5 = i4 - i3;
            c1203d.f4621U = i5;
            int i6 = c1203d.f4630b0;
            if (i5 < i6) {
                c1203d.f4621U = i6;
            }
        }
        if (c1204e.f4658p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C1202c c1202c3 = c1203d.f4610J;
        int i7 = c1202c3.f4598g;
        int m2818k = c1204e.m2818k();
        C1202c c1202c4 = c1203d.f4612L;
        int i8 = m2818k - c1202c4.f4598g;
        c1202c3.f4600i = c1179c.m2729k(c1202c3);
        c1202c4.f4600i = c1179c.m2729k(c1202c4);
        c1179c.m2722d(c1202c3.f4600i, i7);
        c1179c.m2722d(c1202c4.f4600i, i8);
        if (c1203d.f4628a0 > 0 || c1203d.f4640g0 == 8) {
            C1202c c1202c5 = c1203d.f4613M;
            C1182f m2729k = c1179c.m2729k(c1202c5);
            c1202c5.f4600i = m2729k;
            c1179c.m2722d(m2729k, c1203d.f4628a0 + i7);
        }
        c1203d.f4657p = 2;
        c1203d.f4626Z = i7;
        int i9 = i8 - i7;
        c1203d.f4622V = i9;
        int i10 = c1203d.f4632c0;
        if (i9 < i10) {
            c1203d.f4622V = i10;
        }
    }

    /* renamed from: c */
    public static final boolean m2853c(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
