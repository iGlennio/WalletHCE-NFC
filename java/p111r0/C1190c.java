package p111r0;

import android.animation.TimeInterpolator;

/* renamed from: r0.c */
/* loaded from: classes.dex */
public final class C1190c {

    /* renamed from: a */
    public long f4558a;

    /* renamed from: b */
    public long f4559b;

    /* renamed from: c */
    public TimeInterpolator f4560c;

    /* renamed from: d */
    public int f4561d;

    /* renamed from: e */
    public int f4562e;

    /* renamed from: a */
    public final TimeInterpolator m2752a() {
        TimeInterpolator timeInterpolator = this.f4560c;
        return timeInterpolator != null ? timeInterpolator : AbstractC1188a.f4553b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190c)) {
            return false;
        }
        C1190c c1190c = (C1190c) obj;
        if (this.f4558a == c1190c.f4558a && this.f4559b == c1190c.f4559b && this.f4561d == c1190c.f4561d && this.f4562e == c1190c.f4562e) {
            return m2752a().getClass().equals(c1190c.m2752a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f4558a;
        long j3 = this.f4559b;
        return ((((m2752a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f4561d) * 31) + this.f4562e;
    }

    public final String toString() {
        return "\n" + C1190c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4558a + " duration: " + this.f4559b + " interpolator: " + m2752a().getClass() + " repeatCount: " + this.f4561d + " repeatMode: " + this.f4562e + "}\n";
    }
}
