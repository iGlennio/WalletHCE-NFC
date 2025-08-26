package p088j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import p095l1.AbstractC1136c;
import p123v1.C1277g;
import p123v1.C1278h;
import p123v1.EnumC1294x;

/* renamed from: j.j1 */
/* loaded from: classes.dex */
public final class C1004j1 {

    /* renamed from: a */
    public boolean f3957a = true;

    /* renamed from: b */
    public boolean f3958b;

    /* renamed from: c */
    public Object f3959c;

    /* renamed from: d */
    public Serializable f3960d;

    /* renamed from: a */
    public C1278h m2481a() {
        return new C1278h(this.f3957a, this.f3958b, (String[]) this.f3959c, (String[]) this.f3960d);
    }

    /* renamed from: b */
    public void m2482b(String... strArr) {
        AbstractC1136c.m2637e(strArr, "cipherSuites");
        if (!this.f3957a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object clone = strArr.clone();
        if (clone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.f3959c = (String[]) clone;
    }

    /* renamed from: c */
    public void m2483c(C1277g... c1277gArr) {
        AbstractC1136c.m2637e(c1277gArr, "cipherSuites");
        if (!this.f3957a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c1277gArr.length);
        for (C1277g c1277g : c1277gArr) {
            arrayList.add(c1277g.f5157a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        m2482b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: d */
    public void m2484d(String... strArr) {
        AbstractC1136c.m2637e(strArr, "tlsVersions");
        if (!this.f3957a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object clone = strArr.clone();
        if (clone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.f3960d = (String[]) clone;
    }

    /* renamed from: e */
    public void m2485e(EnumC1294x... enumC1294xArr) {
        if (!this.f3957a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC1294xArr.length);
        for (EnumC1294x enumC1294x : enumC1294xArr) {
            arrayList.add(enumC1294x.f5305a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        m2484d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
