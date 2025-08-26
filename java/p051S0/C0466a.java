package p051S0;

import p068a1.C0558a;
import p068a1.C0559b;

/* renamed from: S0.a */
/* loaded from: classes.dex */
public final class C0466a extends AbstractC0477l {

    /* renamed from: a */
    public final /* synthetic */ int f1274a;

    public /* synthetic */ C0466a(int i2) {
        this.f1274a = i2;
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        switch (this.f1274a) {
            case 0:
                if (c0558a.m1303B() != 9) {
                    return Double.valueOf(c0558a.m1323s());
                }
                c0558a.m1328x();
                return null;
            default:
                if (c0558a.m1303B() != 9) {
                    return Float.valueOf((float) c0558a.m1323s());
                }
                c0558a.m1328x();
                return null;
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        switch (this.f1274a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double doubleValue = number.doubleValue();
                    C0469d.m1223a(doubleValue);
                    c0559b.m1342r(doubleValue);
                    break;
                } else {
                    c0559b.m1339o();
                    break;
                }
            default:
                Number number2 = (Number) obj;
                if (number2 != null) {
                    float floatValue = number2.floatValue();
                    C0469d.m1223a(floatValue);
                    if (!(number2 instanceof Float)) {
                        number2 = Float.valueOf(floatValue);
                    }
                    c0559b.m1344t(number2);
                    break;
                } else {
                    c0559b.m1339o();
                    break;
                }
        }
    }
}
