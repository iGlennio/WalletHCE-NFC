package p023I1;

import p095l1.AbstractC1136c;

/* renamed from: I1.g */
/* loaded from: classes.dex */
public final class C0223g {

    /* renamed from: a */
    public final boolean f637a;

    /* renamed from: b */
    public final Integer f638b;

    /* renamed from: c */
    public final boolean f639c;

    /* renamed from: d */
    public final Integer f640d;

    /* renamed from: e */
    public final boolean f641e;

    /* renamed from: f */
    public final boolean f642f;

    public C0223g(boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5) {
        this.f637a = z2;
        this.f638b = num;
        this.f639c = z3;
        this.f640d = num2;
        this.f641e = z4;
        this.f642f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0223g)) {
            return false;
        }
        C0223g c0223g = (C0223g) obj;
        return this.f637a == c0223g.f637a && AbstractC1136c.m2633a(this.f638b, c0223g.f638b) && this.f639c == c0223g.f639c && AbstractC1136c.m2633a(this.f640d, c0223g.f640d) && this.f641e == c0223g.f641e && this.f642f == c0223g.f642f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z2 = this.f637a;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = i2 * 31;
        Integer num = this.f638b;
        int hashCode = (i3 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z3 = this.f639c;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        Integer num2 = this.f640d;
        int hashCode2 = (i5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z4 = this.f641e;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode2 + i6) * 31;
        boolean z5 = this.f642f;
        return i7 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f637a + ", clientMaxWindowBits=" + this.f638b + ", clientNoContextTakeover=" + this.f639c + ", serverMaxWindowBits=" + this.f640d + ", serverNoContextTakeover=" + this.f641e + ", unknownValues=" + this.f642f + ")";
    }
}
