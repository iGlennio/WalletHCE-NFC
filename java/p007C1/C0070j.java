package p007C1;

import java.io.IOException;
import p010D1.C0106n;
import p095l1.AbstractC1136c;
import p095l1.C1139f;
import p132y1.AbstractC1321a;

/* renamed from: C1.j */
/* loaded from: classes.dex */
public final class C0070j extends AbstractC1321a {

    /* renamed from: e */
    public final /* synthetic */ int f179e;

    /* renamed from: f */
    public final /* synthetic */ C0071k f180f;

    /* renamed from: g */
    public final /* synthetic */ Object f181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0070j(String str, C0071k c0071k, Object obj, int i2) {
        super(str, true);
        this.f179e = i2;
        this.f180f = c0071k;
        this.f181g = obj;
    }

    @Override // p132y1.AbstractC1321a
    /* renamed from: a */
    public final long mo256a() {
        long m241a;
        C0085y[] c0085yArr;
        C0085y[] c0085yArr2;
        int i2 = 0;
        switch (this.f179e) {
            case 0:
                C0077q c0077q = this.f180f.f183b;
                c0077q.f201a.mo258a(c0077q, (C0059D) ((C1139f) this.f181g).f4339b);
                return -1L;
            case 1:
                try {
                    this.f180f.f183b.f201a.mo257b((C0085y) this.f181g);
                } catch (IOException e2) {
                    C0106n c0106n = C0106n.f319a;
                    C0106n c0106n2 = C0106n.f319a;
                    String str = "Http2Connection.Listener failure for " + this.f180f.f183b.f203c;
                    c0106n2.getClass();
                    C0106n.m436i(str, 4, e2);
                    try {
                        ((C0085y) this.f181g).m281c(2, e2);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                C0071k c0071k = this.f180f;
                C0059D c0059d = (C0059D) this.f181g;
                c0071k.getClass();
                C1139f c1139f = new C1139f(0);
                synchronized (c0071k.f183b.f224x) {
                    synchronized (c0071k.f183b) {
                        try {
                            C0059D c0059d2 = c0071k.f183b.f218r;
                            C0059D c0059d3 = new C0059D();
                            c0059d3.m242b(c0059d2);
                            c0059d3.m242b(c0059d);
                            c1139f.f4339b = c0059d3;
                            m241a = c0059d3.m241a() - c0059d2.m241a();
                            if (m241a != 0 && !c0071k.f183b.f202b.isEmpty()) {
                                Object[] array = c0071k.f183b.f202b.values().toArray(new C0085y[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                                c0085yArr = (C0085y[]) array;
                                c0085yArr2 = c0085yArr;
                                C0077q c0077q2 = c0071k.f183b;
                                C0059D c0059d4 = (C0059D) c1139f.f4339b;
                                c0077q2.getClass();
                                AbstractC1136c.m2637e(c0059d4, "<set-?>");
                                c0077q2.f218r = c0059d4;
                                c0071k.f183b.f210j.m3026c(new C0070j(c0071k.f183b.f203c + " onSettings", c0071k, c1139f, i2), 0L);
                            }
                            c0085yArr = null;
                            c0085yArr2 = c0085yArr;
                            C0077q c0077q22 = c0071k.f183b;
                            C0059D c0059d42 = (C0059D) c1139f.f4339b;
                            c0077q22.getClass();
                            AbstractC1136c.m2637e(c0059d42, "<set-?>");
                            c0077q22.f218r = c0059d42;
                            c0071k.f183b.f210j.m3026c(new C0070j(c0071k.f183b.f203c + " onSettings", c0071k, c1139f, i2), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c0071k.f183b.f224x.m290g((C0059D) c1139f.f4339b);
                    } catch (IOException e3) {
                        c0071k.f183b.m260g(2, 2, e3);
                    }
                }
                C0085y[] c0085yArr3 = c0085yArr2;
                if (c0085yArr3 != null) {
                    int length = c0085yArr3.length;
                    while (i2 < length) {
                        C0085y c0085y = c0085yArr3[i2];
                        synchronized (c0085y) {
                            c0085y.f260d += m241a;
                            if (m241a > 0) {
                                c0085y.notifyAll();
                            }
                        }
                        i2++;
                    }
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0070j(String str, C0085y c0085y, C0071k c0071k) {
        super(str, true);
        this.f179e = 1;
        this.f181g = c0085y;
        this.f180f = c0071k;
    }
}
