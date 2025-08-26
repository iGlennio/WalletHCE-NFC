package p113s;

import java.util.ArrayList;
import p116t.AbstractC1222h;
import p116t.C1228n;

/* renamed from: s.i */
/* loaded from: classes.dex */
public abstract class AbstractC1208i extends C1203d {

    /* renamed from: q0 */
    public C1203d[] f4751q0 = new C1203d[4];

    /* renamed from: r0 */
    public int f4752r0 = 0;

    /* renamed from: R */
    public final void m2850R(int i2, ArrayList arrayList, C1228n c1228n) {
        for (int i3 = 0; i3 < this.f4752r0; i3++) {
            C1203d c1203d = this.f4751q0[i3];
            ArrayList arrayList2 = c1228n.f4807a;
            if (!arrayList2.contains(c1203d)) {
                arrayList2.add(c1203d);
            }
        }
        for (int i4 = 0; i4 < this.f4752r0; i4++) {
            AbstractC1222h.m2878b(this.f4751q0[i4], i2, arrayList, c1228n);
        }
    }

    /* renamed from: S */
    public void mo2844S() {
    }
}
