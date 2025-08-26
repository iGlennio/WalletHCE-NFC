package p072c1;

import java.io.Serializable;
import p095l1.AbstractC1136c;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public final class C0697a implements Serializable {

    /* renamed from: a */
    public final Object f2477a;

    /* renamed from: b */
    public final Object f2478b;

    public C0697a(Object obj, Object obj2) {
        this.f2477a = obj;
        this.f2478b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0697a)) {
            return false;
        }
        C0697a c0697a = (C0697a) obj;
        return AbstractC1136c.m2633a(this.f2477a, c0697a.f2477a) && AbstractC1136c.m2633a(this.f2478b, c0697a.f2478b);
    }

    public final int hashCode() {
        Object obj = this.f2477a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2478b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2477a + ", " + this.f2478b + ')';
    }
}
