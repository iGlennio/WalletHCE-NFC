package p055U0;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: U0.a */
/* loaded from: classes.dex */
public final class C0487a implements GenericArrayType, Serializable {

    /* renamed from: a */
    public final Type f1332a;

    public C0487a(Type type) {
        Objects.requireNonNull(type);
        this.f1332a = AbstractC0490d.m1260a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC0490d.m1263d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f1332a;
    }

    public final int hashCode() {
        return this.f1332a.hashCode();
    }

    public final String toString() {
        return AbstractC0490d.m1268i(this.f1332a) + "[]";
    }
}
