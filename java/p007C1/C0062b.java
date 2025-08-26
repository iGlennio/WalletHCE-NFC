package p007C1;

import p026J1.C0242j;
import p034M0.C0360e;
import p095l1.AbstractC1136c;

/* renamed from: C1.b */
/* loaded from: classes.dex */
public final class C0062b {

    /* renamed from: d */
    public static final C0242j f145d;

    /* renamed from: e */
    public static final C0242j f146e;

    /* renamed from: f */
    public static final C0242j f147f;

    /* renamed from: g */
    public static final C0242j f148g;

    /* renamed from: h */
    public static final C0242j f149h;

    /* renamed from: i */
    public static final C0242j f150i;

    /* renamed from: a */
    public final int f151a;

    /* renamed from: b */
    public final C0242j f152b;

    /* renamed from: c */
    public final C0242j f153c;

    static {
        C0242j c0242j = C0242j.f716d;
        f145d = C0360e.m1010g(":");
        f146e = C0360e.m1010g(":status");
        f147f = C0360e.m1010g(":method");
        f148g = C0360e.m1010g(":path");
        f149h = C0360e.m1010g(":scheme");
        f150i = C0360e.m1010g(":authority");
    }

    public C0062b(C0242j c0242j, C0242j c0242j2) {
        AbstractC1136c.m2637e(c0242j, "name");
        AbstractC1136c.m2637e(c0242j2, "value");
        this.f152b = c0242j;
        this.f153c = c0242j2;
        this.f151a = c0242j2.mo688c() + c0242j.mo688c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0062b)) {
            return false;
        }
        C0062b c0062b = (C0062b) obj;
        return AbstractC1136c.m2633a(this.f152b, c0062b.f152b) && AbstractC1136c.m2633a(this.f153c, c0062b.f153c);
    }

    public final int hashCode() {
        C0242j c0242j = this.f152b;
        int hashCode = (c0242j != null ? c0242j.hashCode() : 0) * 31;
        C0242j c0242j2 = this.f153c;
        return hashCode + (c0242j2 != null ? c0242j2.hashCode() : 0);
    }

    public final String toString() {
        return this.f152b.m695j() + ": " + this.f153c.m695j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0062b(String str, String str2) {
        this(C0360e.m1010g(str), C0360e.m1010g(str2));
        AbstractC1136c.m2637e(str, "name");
        AbstractC1136c.m2637e(str2, "value");
        C0242j c0242j = C0242j.f716d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0062b(C0242j c0242j, String str) {
        this(c0242j, C0360e.m1010g(str));
        AbstractC1136c.m2637e(c0242j, "name");
        AbstractC1136c.m2637e(str, "value");
        C0242j c0242j2 = C0242j.f716d;
    }
}
