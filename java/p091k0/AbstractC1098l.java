package p091k0;

import p005C.C0045h;
import p047Q1.AbstractC0458e;

/* renamed from: k0.l */
/* loaded from: classes.dex */
public abstract class AbstractC1098l extends AbstractC1097k {

    /* renamed from: a */
    public C0045h[] f4268a;

    /* renamed from: b */
    public String f4269b;

    /* renamed from: c */
    public int f4270c;

    public AbstractC1098l() {
        this.f4268a = null;
        this.f4270c = 0;
    }

    public C0045h[] getPathData() {
        return this.f4268a;
    }

    public String getPathName() {
        return this.f4269b;
    }

    public void setPathData(C0045h[] c0045hArr) {
        C0045h[] c0045hArr2 = this.f4268a;
        boolean z2 = false;
        if (c0045hArr2 != null && c0045hArr != null && c0045hArr2.length == c0045hArr.length) {
            int i2 = 0;
            while (true) {
                if (i2 >= c0045hArr2.length) {
                    z2 = true;
                    break;
                }
                C0045h c0045h = c0045hArr2[i2];
                char c2 = c0045h.f112a;
                C0045h c0045h2 = c0045hArr[i2];
                if (c2 != c0045h2.f112a || c0045h.f113b.length != c0045h2.f113b.length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (!z2) {
            this.f4268a = AbstractC0458e.m1200r(c0045hArr);
            return;
        }
        C0045h[] c0045hArr3 = this.f4268a;
        for (int i3 = 0; i3 < c0045hArr.length; i3++) {
            c0045hArr3[i3].f112a = c0045hArr[i3].f112a;
            int i4 = 0;
            while (true) {
                float[] fArr = c0045hArr[i3].f113b;
                if (i4 < fArr.length) {
                    c0045hArr3[i3].f113b[i4] = fArr[i4];
                    i4++;
                }
            }
        }
    }

    public AbstractC1098l(AbstractC1098l abstractC1098l) {
        this.f4268a = null;
        this.f4270c = 0;
        this.f4269b = abstractC1098l.f4269b;
        this.f4268a = AbstractC0458e.m1200r(abstractC1098l.f4268a);
    }
}
