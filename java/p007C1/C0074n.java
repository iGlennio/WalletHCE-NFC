package p007C1;

import java.io.IOException;
import p005C.AbstractC0044g;
import p132y1.AbstractC1321a;

/* renamed from: C1.n */
/* loaded from: classes.dex */
public final class C0074n extends AbstractC1321a {

    /* renamed from: e */
    public final /* synthetic */ int f191e;

    /* renamed from: f */
    public final /* synthetic */ Object f192f;

    /* renamed from: g */
    public final /* synthetic */ int f193g;

    /* renamed from: h */
    public final /* synthetic */ int f194h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0074n(String str, Object obj, int i2, int i3, int i4) {
        super(str, true);
        this.f191e = i4;
        this.f192f = obj;
        this.f193g = i2;
        this.f194h = i3;
    }

    @Override // p132y1.AbstractC1321a
    /* renamed from: a */
    public final long mo256a() {
        switch (this.f191e) {
            case 0:
                C0058C c0058c = ((C0077q) this.f192f).f211k;
                int i2 = this.f194h;
                c0058c.getClass();
                AbstractC0044g.m158j("errorCode", i2);
                synchronized (((C0077q) this.f192f)) {
                    ((C0077q) this.f192f).f226z.remove(Integer.valueOf(this.f193g));
                }
                return -1L;
            case 1:
                C0077q c0077q = (C0077q) this.f192f;
                try {
                    int i3 = this.f193g;
                    int i4 = this.f194h;
                    c0077q.getClass();
                    AbstractC0044g.m158j("statusCode", i4);
                    c0077q.f224x.m296m(i3, i4);
                    return -1L;
                } catch (IOException e2) {
                    c0077q.m260g(2, 2, e2);
                    return -1L;
                }
            default:
                C0077q c0077q2 = ((C0071k) this.f192f).f183b;
                int i5 = this.f193g;
                int i6 = this.f194h;
                c0077q2.getClass();
                try {
                    c0077q2.f224x.m295l(i5, i6, true);
                    return -1L;
                } catch (IOException e3) {
                    c0077q2.m260g(2, 2, e3);
                    return -1L;
                }
        }
    }
}
