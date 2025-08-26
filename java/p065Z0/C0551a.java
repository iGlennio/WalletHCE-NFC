package p065Z0;

import java.lang.reflect.Type;
import java.util.Objects;
import p055U0.AbstractC0490d;

/* renamed from: Z0.a */
/* loaded from: classes.dex */
public final class C0551a {

    /* renamed from: a */
    public final Class f1518a;

    /* renamed from: b */
    public final Type f1519b;

    /* renamed from: c */
    public final int f1520c;

    public C0551a(Type type) {
        Objects.requireNonNull(type);
        Type m1260a = AbstractC0490d.m1260a(type);
        this.f1519b = m1260a;
        this.f1518a = AbstractC0490d.m1266g(m1260a);
        this.f1520c = m1260a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0551a) {
            return AbstractC0490d.m1263d(this.f1519b, ((C0551a) obj).f1519b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1520c;
    }

    public final String toString() {
        return AbstractC0490d.m1268i(this.f1519b);
    }
}
