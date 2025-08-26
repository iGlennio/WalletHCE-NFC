package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C0667b {

    /* renamed from: a */
    public final int f2307a;

    /* renamed from: b */
    public final Method f2308b;

    public C0667b(int i2, Method method) {
        this.f2307a = i2;
        this.f2308b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0667b)) {
            return false;
        }
        C0667b c0667b = (C0667b) obj;
        return this.f2307a == c0667b.f2307a && this.f2308b.getName().equals(c0667b.f2308b.getName());
    }

    public final int hashCode() {
        return this.f2308b.getName().hashCode() + (this.f2307a * 31);
    }
}
