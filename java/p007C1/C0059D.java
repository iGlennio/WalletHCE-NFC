package p007C1;

import p095l1.AbstractC1136c;

/* renamed from: C1.D */
/* loaded from: classes.dex */
public final class C0059D {

    /* renamed from: a */
    public int f142a;

    /* renamed from: b */
    public final int[] f143b = new int[10];

    /* renamed from: a */
    public final int m241a() {
        if ((this.f142a & 128) != 0) {
            return this.f143b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final void m242b(C0059D c0059d) {
        AbstractC1136c.m2637e(c0059d, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (((1 << i2) & c0059d.f142a) != 0) {
                m243c(i2, c0059d.f143b[i2]);
            }
        }
    }

    /* renamed from: c */
    public final void m243c(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f143b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f142a = (1 << i2) | this.f142a;
            iArr[i2] = i3;
        }
    }
}
