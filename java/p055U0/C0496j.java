package p055U0;

import java.math.BigDecimal;

/* renamed from: U0.j */
/* loaded from: classes.dex */
public final class C0496j extends Number {

    /* renamed from: a */
    public final String f1353a;

    public C0496j(String str) {
        this.f1353a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f1353a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0496j)) {
            return false;
        }
        Object obj2 = ((C0496j) obj).f1353a;
        String str = this.f1353a;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f1353a);
    }

    public final int hashCode() {
        return this.f1353a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f1353a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f1353a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f1353a;
    }
}
