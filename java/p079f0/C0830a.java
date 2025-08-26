package p079f0;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public final class C0830a {

    /* renamed from: a */
    public int f3302a;

    /* renamed from: b */
    public int f3303b;

    /* renamed from: c */
    public int f3304c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C0830a.class != obj.getClass()) {
                return false;
            }
            C0830a c0830a = (C0830a) obj;
            int i2 = this.f3302a;
            if (i2 != c0830a.f3302a) {
                return false;
            }
            if (i2 != 8 || Math.abs(this.f3304c - this.f3303b) != 1 || this.f3304c != c0830a.f3303b || this.f3303b != c0830a.f3304c) {
                return this.f3304c == c0830a.f3304c && this.f3303b == c0830a.f3303b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3302a * 31) + this.f3303b) * 31) + this.f3304c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i2 = this.f3302a;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f3303b);
        sb.append("c:");
        sb.append(this.f3304c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
