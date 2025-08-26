package p121v;

import java.util.Arrays;

/* renamed from: v.h */
/* loaded from: classes.dex */
public final class C1258h {

    /* renamed from: a */
    public int[] f4971a;

    /* renamed from: b */
    public int[] f4972b;

    /* renamed from: c */
    public int f4973c;

    /* renamed from: d */
    public int[] f4974d;

    /* renamed from: e */
    public float[] f4975e;

    /* renamed from: f */
    public int f4976f;

    /* renamed from: g */
    public int[] f4977g;

    /* renamed from: h */
    public String[] f4978h;

    /* renamed from: i */
    public int f4979i;

    /* renamed from: j */
    public int[] f4980j;

    /* renamed from: k */
    public boolean[] f4981k;

    /* renamed from: l */
    public int f4982l;

    /* renamed from: a */
    public final void m2935a(int i2, float f) {
        int i3 = this.f4976f;
        int[] iArr = this.f4974d;
        if (i3 >= iArr.length) {
            this.f4974d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4975e;
            this.f4975e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4974d;
        int i4 = this.f4976f;
        iArr2[i4] = i2;
        float[] fArr2 = this.f4975e;
        this.f4976f = i4 + 1;
        fArr2[i4] = f;
    }

    /* renamed from: b */
    public final void m2936b(int i2, int i3) {
        int i4 = this.f4973c;
        int[] iArr = this.f4971a;
        if (i4 >= iArr.length) {
            this.f4971a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4972b;
            this.f4972b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4971a;
        int i5 = this.f4973c;
        iArr3[i5] = i2;
        int[] iArr4 = this.f4972b;
        this.f4973c = i5 + 1;
        iArr4[i5] = i3;
    }

    /* renamed from: c */
    public final void m2937c(int i2, boolean z2) {
        int i3 = this.f4982l;
        int[] iArr = this.f4980j;
        if (i3 >= iArr.length) {
            this.f4980j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4981k;
            this.f4981k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4980j;
        int i4 = this.f4982l;
        iArr2[i4] = i2;
        boolean[] zArr2 = this.f4981k;
        this.f4982l = i4 + 1;
        zArr2[i4] = z2;
    }

    /* renamed from: d */
    public final void m2938d(String str, int i2) {
        int i3 = this.f4979i;
        int[] iArr = this.f4977g;
        if (i3 >= iArr.length) {
            this.f4977g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4978h;
            this.f4978h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4977g;
        int i4 = this.f4979i;
        iArr2[i4] = i2;
        String[] strArr2 = this.f4978h;
        this.f4979i = i4 + 1;
        strArr2[i4] = str;
    }
}
