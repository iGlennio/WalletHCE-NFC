package p016G;

import java.util.Locale;

/* renamed from: G.g */
/* loaded from: classes.dex */
public final class C0166g {

    /* renamed from: b */
    public static final C0166g f497b = new C0166g(new C0167h(AbstractC0165f.m499a(new Locale[0])));

    /* renamed from: a */
    public final C0167h f498a;

    public C0166g(C0167h c0167h) {
        this.f498a = c0167h;
    }

    /* renamed from: a */
    public static C0166g m502a(String str) {
        if (str == null || str.isEmpty()) {
            return f497b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = AbstractC0164e.m497a(split[i2]);
        }
        return new C0166g(new C0167h(AbstractC0165f.m499a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0166g) {
            return this.f498a.equals(((C0166g) obj).f498a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f498a.f499a.hashCode();
    }

    public final String toString() {
        return this.f498a.f499a.toString();
    }
}
