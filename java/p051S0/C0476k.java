package p051S0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import p055U0.C0496j;

/* renamed from: S0.k */
/* loaded from: classes.dex */
public final class C0476k extends AbstractC0471f {

    /* renamed from: a */
    public final Serializable f1287a;

    public C0476k(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f1287a = bool;
    }

    /* renamed from: c */
    public static boolean m1228c(C0476k c0476k) {
        Serializable serializable = c0476k.f1287a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: a */
    public final Number m1229a() {
        Serializable serializable = this.f1287a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C0496j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* renamed from: b */
    public final String m1230b() {
        Serializable serializable = this.f1287a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m1229a().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0476k.class != obj.getClass()) {
            return false;
        }
        C0476k c0476k = (C0476k) obj;
        Serializable serializable = this.f1287a;
        Serializable serializable2 = c0476k.f1287a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (m1228c(this) && m1228c(c0476k)) {
            return m1229a().longValue() == c0476k.m1229a().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double doubleValue = m1229a().doubleValue();
        double doubleValue2 = c0476k.m1229a().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f1287a;
        if (serializable == null) {
            return 31;
        }
        if (m1228c(this)) {
            doubleToLongBits = m1229a().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m1229a().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public C0476k(Number number) {
        Objects.requireNonNull(number);
        this.f1287a = number;
    }

    public C0476k(String str) {
        Objects.requireNonNull(str);
        this.f1287a = str;
    }
}
