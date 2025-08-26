package p107q;

import java.util.Arrays;

/* renamed from: q.f */
/* loaded from: classes.dex */
public final class C1182f implements Comparable {

    /* renamed from: a */
    public boolean f4505a;

    /* renamed from: e */
    public float f4509e;

    /* renamed from: l */
    public int f4516l;

    /* renamed from: b */
    public int f4506b = -1;

    /* renamed from: c */
    public int f4507c = -1;

    /* renamed from: d */
    public int f4508d = 0;

    /* renamed from: f */
    public boolean f4510f = false;

    /* renamed from: g */
    public final float[] f4511g = new float[9];

    /* renamed from: h */
    public final float[] f4512h = new float[9];

    /* renamed from: i */
    public C1178b[] f4513i = new C1178b[16];

    /* renamed from: j */
    public int f4514j = 0;

    /* renamed from: k */
    public int f4515k = 0;

    public C1182f(int i2) {
        this.f4516l = i2;
    }

    /* renamed from: a */
    public final void m2742a(C1178b c1178b) {
        int i2 = 0;
        while (true) {
            int i3 = this.f4514j;
            if (i2 >= i3) {
                C1178b[] c1178bArr = this.f4513i;
                if (i3 >= c1178bArr.length) {
                    this.f4513i = (C1178b[]) Arrays.copyOf(c1178bArr, c1178bArr.length * 2);
                }
                C1178b[] c1178bArr2 = this.f4513i;
                int i4 = this.f4514j;
                c1178bArr2[i4] = c1178b;
                this.f4514j = i4 + 1;
                return;
            }
            if (this.f4513i[i2] == c1178b) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* renamed from: b */
    public final void m2743b(C1178b c1178b) {
        int i2 = this.f4514j;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f4513i[i3] == c1178b) {
                while (i3 < i2 - 1) {
                    C1178b[] c1178bArr = this.f4513i;
                    int i4 = i3 + 1;
                    c1178bArr[i3] = c1178bArr[i4];
                    i3 = i4;
                }
                this.f4514j--;
                return;
            }
            i3++;
        }
    }

    /* renamed from: c */
    public final void m2744c() {
        this.f4516l = 5;
        this.f4508d = 0;
        this.f4506b = -1;
        this.f4507c = -1;
        this.f4509e = 0.0f;
        this.f4510f = false;
        int i2 = this.f4514j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4513i[i3] = null;
        }
        this.f4514j = 0;
        this.f4515k = 0;
        this.f4505a = false;
        Arrays.fill(this.f4512h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4506b - ((C1182f) obj).f4506b;
    }

    /* renamed from: d */
    public final void m2745d(C1179c c1179c, float f) {
        this.f4509e = f;
        this.f4510f = true;
        int i2 = this.f4514j;
        this.f4507c = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4513i[i3].m2716h(c1179c, this, false);
        }
        this.f4514j = 0;
    }

    /* renamed from: e */
    public final void m2746e(C1179c c1179c, C1178b c1178b) {
        int i2 = this.f4514j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4513i[i3].mo2717i(c1179c, c1178b, false);
        }
        this.f4514j = 0;
    }

    public final String toString() {
        return "" + this.f4506b;
    }
}
