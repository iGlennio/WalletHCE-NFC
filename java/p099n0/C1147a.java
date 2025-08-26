package p099n0;

import java.util.Arrays;

/* renamed from: n0.a */
/* loaded from: classes.dex */
public final class C1147a {

    /* renamed from: a */
    public final byte[] f4356a;

    /* renamed from: b */
    public final int f4357b;

    public C1147a(byte[] bArr) {
        this.f4356a = bArr;
        this.f4357b = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1147a)) {
            return false;
        }
        return Arrays.equals(this.f4356a, ((C1147a) obj).f4356a);
    }

    public final int hashCode() {
        return this.f4357b;
    }
}
