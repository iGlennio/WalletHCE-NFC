package p007C1;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;
import p132y1.AbstractC1321a;
import p135z1.C1344l;
import p135z1.C1345m;

/* renamed from: C1.o */
/* loaded from: classes.dex */
public final class C0075o extends AbstractC1321a {

    /* renamed from: e */
    public final /* synthetic */ int f195e;

    /* renamed from: f */
    public final /* synthetic */ Object f196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0075o(Object obj, String str, int i2) {
        super(str, true);
        this.f195e = i2;
        this.f196f = obj;
    }

    @Override // p132y1.AbstractC1321a
    /* renamed from: a */
    public final long mo256a() {
        switch (this.f195e) {
            case 0:
                C0077q c0077q = (C0077q) this.f196f;
                c0077q.getClass();
                try {
                    c0077q.f224x.m295l(2, 0, false);
                    return -1L;
                } catch (IOException e2) {
                    c0077q.m260g(2, 2, e2);
                    return -1L;
                }
            case 1:
                ((C0071k) this.f196f).mo259a();
                return -1L;
            default:
                C1345m c1345m = (C1345m) this.f196f;
                long nanoTime = System.nanoTime();
                Iterator it = c1345m.f5575d.iterator();
                int i2 = 0;
                long j2 = Long.MIN_VALUE;
                C1344l c1344l = null;
                int i3 = 0;
                while (it.hasNext()) {
                    C1344l c1344l2 = (C1344l) it.next();
                    AbstractC1136c.m2636d(c1344l2, "connection");
                    synchronized (c1344l2) {
                        if (c1345m.m3105b(c1344l2, nanoTime) > 0) {
                            i3++;
                        } else {
                            i2++;
                            long j3 = nanoTime - c1344l2.f5570p;
                            if (j3 > j2) {
                                c1344l = c1344l2;
                                j2 = j3;
                            }
                        }
                    }
                }
                long j4 = c1345m.f5572a;
                if (j2 < j4 && i2 <= 5) {
                    if (i2 > 0) {
                        return j4 - j2;
                    }
                    if (i3 > 0) {
                        return j4;
                    }
                    return -1L;
                }
                AbstractC1136c.m2634b(c1344l);
                synchronized (c1344l) {
                    if (!c1344l.f5569o.isEmpty()) {
                        return 0L;
                    }
                    if (c1344l.f5570p + j2 != nanoTime) {
                        return 0L;
                    }
                    c1344l.f5563i = true;
                    c1345m.f5575d.remove(c1344l);
                    Socket socket = c1344l.f5557c;
                    AbstractC1136c.m2634b(socket);
                    AbstractC1302b.m2995d(socket);
                    if (!c1345m.f5575d.isEmpty()) {
                        return 0L;
                    }
                    c1345m.f5573b.m3024a();
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075o(String str, C0077q c0077q) {
        super(str, true);
        this.f195e = 0;
        this.f196f = c0077q;
    }
}
