package p045Q;

/* renamed from: Q.a */
/* loaded from: classes.dex */
public final class C0434a {

    /* renamed from: a */
    public int f1205a;

    /* renamed from: b */
    public int f1206b;

    /* renamed from: c */
    public float f1207c;

    /* renamed from: d */
    public float f1208d;

    /* renamed from: e */
    public long f1209e;

    /* renamed from: f */
    public long f1210f;

    /* renamed from: g */
    public long f1211g;

    /* renamed from: h */
    public float f1212h;

    /* renamed from: i */
    public int f1213i;

    /* renamed from: a */
    public final float m1124a(long j2) {
        if (j2 < this.f1209e) {
            return 0.0f;
        }
        long j3 = this.f1211g;
        if (j3 < 0 || j2 < j3) {
            return ViewOnTouchListenerC0440g.m1138b((j2 - r0) / this.f1205a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f1212h;
        return (ViewOnTouchListenerC0440g.m1138b((j2 - j3) / this.f1213i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
