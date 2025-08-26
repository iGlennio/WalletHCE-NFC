package p051S0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p068a1.C0558a;
import p068a1.C0559b;

/* renamed from: S0.b */
/* loaded from: classes.dex */
public final class C0467b extends AbstractC0477l {

    /* renamed from: a */
    public final /* synthetic */ int f1275a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0477l f1276b;

    public /* synthetic */ C0467b(AbstractC0477l abstractC0477l, int i2) {
        this.f1275a = i2;
        this.f1276b = abstractC0477l;
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        switch (this.f1275a) {
            case 0:
                return new AtomicLong(((Number) this.f1276b.mo1221a(c0558a)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                c0558a.m1311g();
                while (c0558a.m1319o()) {
                    arrayList.add(Long.valueOf(((Number) this.f1276b.mo1221a(c0558a)).longValue()));
                }
                c0558a.m1315k();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                if (c0558a.m1303B() != 9) {
                    return this.f1276b.mo1221a(c0558a);
                }
                c0558a.m1328x();
                return null;
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        switch (this.f1275a) {
            case 0:
                this.f1276b.mo1222b(c0559b, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c0559b.m1332h();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    this.f1276b.mo1222b(c0559b, Long.valueOf(atomicLongArray.get(i2)));
                }
                c0559b.m1335k();
                break;
            default:
                if (obj == null) {
                    c0559b.m1339o();
                    break;
                } else {
                    this.f1276b.mo1222b(c0559b, obj);
                    break;
                }
        }
    }
}
