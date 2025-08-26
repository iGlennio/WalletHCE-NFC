package p076e;

/* renamed from: e.D */
/* loaded from: classes.dex */
public final class C0772D {

    /* renamed from: d */
    public static C0772D f3003d;

    /* renamed from: a */
    public long f3004a;

    /* renamed from: b */
    public long f3005b;

    /* renamed from: c */
    public int f3006c;

    /* renamed from: a */
    public final void m2063a(long j2, double d2, double d3) {
        double d4 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d5 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.f3006c = 1;
            this.f3004a = -1L;
            this.f3005b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f3006c = 0;
                this.f3004a = -1L;
                this.f3005b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f3004a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f3005b = round;
            if (round >= j2 || this.f3004a <= j2) {
                this.f3006c = 1;
            } else {
                this.f3006c = 0;
            }
        }
    }
}
