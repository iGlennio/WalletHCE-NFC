package p135z1;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p007C1.C0075o;
import p010D1.C0106n;
import p095l1.AbstractC1136c;
import p123v1.C1271a;
import p126w1.AbstractC1302b;
import p132y1.C1322b;
import p132y1.C1323c;

/* renamed from: z1.m */
/* loaded from: classes.dex */
public final class C1345m {

    /* renamed from: a */
    public final long f5572a;

    /* renamed from: b */
    public final C1322b f5573b;

    /* renamed from: c */
    public final C0075o f5574c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue f5575d;

    public C1345m(C1323c c1323c) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        AbstractC1136c.m2637e(c1323c, "taskRunner");
        AbstractC1136c.m2637e(timeUnit, "timeUnit");
        this.f5572a = timeUnit.toNanos(5L);
        this.f5573b = c1323c.m3033e();
        this.f5574c = new C0075o(this, AbstractC1302b.f5343g + " ConnectionPool", 2);
        this.f5575d = new ConcurrentLinkedQueue();
    }

    /* renamed from: a */
    public final boolean m3104a(C1271a c1271a, C1340h c1340h, ArrayList arrayList, boolean z2) {
        AbstractC1136c.m2637e(c1340h, "call");
        Iterator it = this.f5575d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            C1344l c1344l = (C1344l) it.next();
            AbstractC1136c.m2636d(c1344l, "connection");
            synchronized (c1344l) {
                if (z2) {
                    if (!(c1344l.f5560f != null)) {
                    }
                }
                if (c1344l.m3099h(c1271a, arrayList)) {
                    c1340h.m3085b(c1344l);
                    return true;
                }
            }
        }
    }

    /* renamed from: b */
    public final int m3105b(C1344l c1344l, long j2) {
        byte[] bArr = AbstractC1302b.f5337a;
        ArrayList arrayList = c1344l.f5569o;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                String str = "A connection to " + c1344l.f5571q.f5296a.f5108a + " was leaked. Did you forget to close a response body?";
                C0106n c0106n = C0106n.f319a;
                C0106n.f319a.mo322j(((C1339g) reference).f5531a, str);
                arrayList.remove(i2);
                c1344l.f5563i = true;
                if (arrayList.isEmpty()) {
                    c1344l.f5570p = j2 - this.f5572a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
