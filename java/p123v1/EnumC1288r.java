package p123v1;

/* renamed from: v1.r */
/* loaded from: classes.dex */
public enum EnumC1288r {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: a */
    public final String f5267a;

    EnumC1288r(String str) {
        this.f5267a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5267a;
    }
}
