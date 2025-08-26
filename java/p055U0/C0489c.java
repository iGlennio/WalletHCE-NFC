package p055U0;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* renamed from: U0.c */
/* loaded from: classes.dex */
public final class C0489c implements WildcardType, Serializable {

    /* renamed from: a */
    public final Type f1336a;

    /* renamed from: b */
    public final Type f1337b;

    public C0489c(Type[] typeArr, Type[] typeArr2) {
        AbstractC0490d.m1261b(typeArr2.length <= 1);
        AbstractC0490d.m1261b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC0490d.m1262c(typeArr[0]);
            this.f1337b = null;
            this.f1336a = AbstractC0490d.m1260a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC0490d.m1262c(typeArr2[0]);
        AbstractC0490d.m1261b(typeArr[0] == Object.class);
        this.f1337b = AbstractC0490d.m1260a(typeArr2[0]);
        this.f1336a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC0490d.m1263d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f1337b;
        return type != null ? new Type[]{type} : AbstractC0490d.f1338a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f1336a};
    }

    public final int hashCode() {
        Type type = this.f1337b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f1336a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f1337b;
        if (type != null) {
            return "? super " + AbstractC0490d.m1268i(type);
        }
        Type type2 = this.f1336a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC0490d.m1268i(type2);
    }
}
