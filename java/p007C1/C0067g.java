package p007C1;

import java.io.IOException;
import java.net.SocketTimeoutException;
import p023I1.C0222f;
import p023I1.C0225i;
import p026J1.C0242j;
import p095l1.AbstractC1136c;
import p132y1.AbstractC1321a;

/* renamed from: C1.g */
/* loaded from: classes.dex */
public final class C0067g extends AbstractC1321a {

    /* renamed from: e */
    public final /* synthetic */ int f175e = 1;

    /* renamed from: f */
    public final /* synthetic */ long f176f;

    /* renamed from: g */
    public final /* synthetic */ Object f177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067g(String str, long j2, C0222f c0222f) {
        super(str, true);
        this.f176f = j2;
        this.f177g = c0222f;
    }

    @Override // p132y1.AbstractC1321a
    /* renamed from: a */
    public final long mo256a() {
        C0077q c0077q;
        boolean z2;
        switch (this.f175e) {
            case 0:
                synchronized (((C0077q) this.f177g)) {
                    c0077q = (C0077q) this.f177g;
                    long j2 = c0077q.f213m;
                    long j3 = c0077q.f212l;
                    if (j2 < j3) {
                        z2 = true;
                    } else {
                        c0077q.f212l = j3 + 1;
                        z2 = false;
                    }
                }
                if (z2) {
                    c0077q.m260g(2, 2, null);
                    return -1L;
                }
                try {
                    c0077q.f224x.m295l(1, 0, false);
                } catch (IOException e2) {
                    c0077q.m260g(2, 2, e2);
                }
                return this.f176f;
            default:
                C0222f c0222f = (C0222f) this.f177g;
                synchronized (c0222f) {
                    try {
                        if (!c0222f.f629o) {
                            C0225i c0225i = c0222f.f619e;
                            if (c0225i != null) {
                                int i2 = c0222f.f631q ? c0222f.f630p : -1;
                                c0222f.f630p++;
                                c0222f.f631q = true;
                                if (i2 != -1) {
                                    c0222f.m621c(new SocketTimeoutException("sent ping but didn't receive pong within " + c0222f.f634t + "ms (after " + (i2 - 1) + " successful ping/pongs)"));
                                } else {
                                    try {
                                        C0242j c0242j = C0242j.f716d;
                                        AbstractC1136c.m2637e(c0242j, "payload");
                                        c0225i.m628g(9, c0242j);
                                    } catch (IOException e3) {
                                        c0222f.m621c(e3);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return this.f176f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067g(String str, C0077q c0077q, long j2) {
        super(str, true);
        this.f177g = c0077q;
        this.f176f = j2;
    }
}
