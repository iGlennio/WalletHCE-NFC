package p135z1;

import java.io.IOException;
import p004B1.C0037h;
import p007C1.C0060E;
import p007C1.C0061a;
import p018H.C0190j;
import p095l1.AbstractC1136c;
import p123v1.C1271a;
import p123v1.C1283m;
import p123v1.C1293w;

/* renamed from: z1.e */
/* loaded from: classes.dex */
public final class C1337e {

    /* renamed from: a */
    public C0190j f5519a;

    /* renamed from: b */
    public C0037h f5520b;

    /* renamed from: c */
    public int f5521c;

    /* renamed from: d */
    public int f5522d;

    /* renamed from: e */
    public int f5523e;

    /* renamed from: f */
    public C1293w f5524f;

    /* renamed from: g */
    public final C1345m f5525g;

    /* renamed from: h */
    public final C1271a f5526h;

    /* renamed from: i */
    public final C1340h f5527i;

    public C1337e(C1345m c1345m, C1271a c1271a, C1340h c1340h) {
        AbstractC1136c.m2637e(c1345m, "connectionPool");
        AbstractC1136c.m2637e(c1340h, "call");
        this.f5525g = c1345m;
        this.f5526h = c1271a;
        this.f5527i = c1340h;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p135z1.C1344l m3081a(int r14, int r15, int r16, int r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135z1.C1337e.m3081a(int, int, int, int, boolean, boolean):z1.l");
    }

    /* renamed from: b */
    public final boolean m3082b(C1283m c1283m) {
        AbstractC1136c.m2637e(c1283m, "url");
        C1283m c1283m2 = this.f5526h.f5108a;
        return c1283m.f5196f == c1283m2.f5196f && AbstractC1136c.m2633a(c1283m.f5195e, c1283m2.f5195e);
    }

    /* renamed from: c */
    public final void m3083c(IOException iOException) {
        AbstractC1136c.m2637e(iOException, "e");
        this.f5524f = null;
        if ((iOException instanceof C0060E) && ((C0060E) iOException).f144a == 8) {
            this.f5521c++;
        } else if (iOException instanceof C0061a) {
            this.f5522d++;
        } else {
            this.f5523e++;
        }
    }
}
