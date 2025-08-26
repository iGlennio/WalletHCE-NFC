package p055U0;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: U0.b */
/* loaded from: classes.dex */
public final class C0488b implements ParameterizedType, Serializable {

    /* renamed from: a */
    public final Type f1333a;

    /* renamed from: b */
    public final Type f1334b;

    /* renamed from: c */
    public final Type[] f1335c;

    public C0488b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z2 = true;
            boolean z3 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z3) {
                z2 = false;
            }
            AbstractC0490d.m1261b(z2);
        }
        this.f1333a = type == null ? null : AbstractC0490d.m1260a(type);
        this.f1334b = AbstractC0490d.m1260a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f1335c = typeArr2;
        int length = typeArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Objects.requireNonNull(this.f1335c[i2]);
            AbstractC0490d.m1262c(this.f1335c[i2]);
            Type[] typeArr3 = this.f1335c;
            typeArr3[i2] = AbstractC0490d.m1260a(typeArr3[i2]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC0490d.m1263d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f1335c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f1333a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f1334b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f1335c) ^ this.f1334b.hashCode();
        Type type = this.f1333a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f1335c;
        int length = typeArr.length;
        Type type = this.f1334b;
        if (length == 0) {
            return AbstractC0490d.m1268i(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC0490d.m1268i(type));
        sb.append("<");
        sb.append(AbstractC0490d.m1268i(typeArr[0]));
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(", ");
            sb.append(AbstractC0490d.m1268i(typeArr[i2]));
        }
        sb.append(">");
        return sb.toString();
    }
}
