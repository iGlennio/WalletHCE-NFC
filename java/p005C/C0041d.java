package p005C;

import android.graphics.Insets;

/* renamed from: C.d */
/* loaded from: classes.dex */
public final class C0041d {

    /* renamed from: e */
    public static final C0041d f106e = new C0041d(0, 0, 0, 0);

    /* renamed from: a */
    public final int f107a;

    /* renamed from: b */
    public final int f108b;

    /* renamed from: c */
    public final int f109c;

    /* renamed from: d */
    public final int f110d;

    public C0041d(int i2, int i3, int i4, int i5) {
        this.f107a = i2;
        this.f108b = i3;
        this.f109c = i4;
        this.f110d = i5;
    }

    /* renamed from: a */
    public static C0041d m144a(C0041d c0041d, C0041d c0041d2) {
        return m145b(Math.max(c0041d.f107a, c0041d2.f107a), Math.max(c0041d.f108b, c0041d2.f108b), Math.max(c0041d.f109c, c0041d2.f109c), Math.max(c0041d.f110d, c0041d2.f110d));
    }

    /* renamed from: b */
    public static C0041d m145b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f106e : new C0041d(i2, i3, i4, i5);
    }

    /* renamed from: c */
    public static C0041d m146c(Insets insets) {
        int i2;
        int i3;
        int i4;
        int i5;
        i2 = insets.left;
        i3 = insets.top;
        i4 = insets.right;
        i5 = insets.bottom;
        return m145b(i2, i3, i4, i5);
    }

    /* renamed from: d */
    public final Insets m147d() {
        return AbstractC0040c.m143a(this.f107a, this.f108b, this.f109c, this.f110d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0041d.class != obj.getClass()) {
            return false;
        }
        C0041d c0041d = (C0041d) obj;
        return this.f110d == c0041d.f110d && this.f107a == c0041d.f107a && this.f109c == c0041d.f109c && this.f108b == c0041d.f108b;
    }

    public final int hashCode() {
        return (((((this.f107a * 31) + this.f108b) * 31) + this.f109c) * 31) + this.f110d;
    }

    public final String toString() {
        return "Insets{left=" + this.f107a + ", top=" + this.f108b + ", right=" + this.f109c + ", bottom=" + this.f110d + '}';
    }
}
