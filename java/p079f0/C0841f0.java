package p079f0;

/* renamed from: f0.f0 */
/* loaded from: classes.dex */
public final class C0841f0 {

    /* renamed from: a */
    public int f3358a;

    /* renamed from: b */
    public int f3359b;

    /* renamed from: c */
    public int f3360c;

    /* renamed from: d */
    public int f3361d;

    /* renamed from: e */
    public int f3362e;

    /* renamed from: a */
    public final boolean m2239a() {
        int i2 = this.f3358a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i4 = this.f3361d;
            int i5 = this.f3359b;
            if (((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i6 = this.f3361d;
            int i7 = this.f3360c;
            if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i8 = this.f3362e;
            int i9 = this.f3359b;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i10 = this.f3362e;
            int i11 = this.f3360c;
            if (i10 > i11) {
                i3 = 1;
            } else if (i10 != i11) {
                i3 = 4;
            }
            if ((i2 & (i3 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
