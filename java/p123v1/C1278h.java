package p123v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p010D1.AbstractC0096d;
import p075d1.AbstractC0757i;
import p078e1.C0804a;
import p088j.C1004j1;
import p126w1.AbstractC1302b;

/* renamed from: v1.h */
/* loaded from: classes.dex */
public final class C1278h {

    /* renamed from: e */
    public static final C1278h f5158e;

    /* renamed from: f */
    public static final C1278h f5159f;

    /* renamed from: a */
    public final boolean f5160a;

    /* renamed from: b */
    public final boolean f5161b;

    /* renamed from: c */
    public final String[] f5162c;

    /* renamed from: d */
    public final String[] f5163d;

    static {
        C1277g c1277g = C1277g.f5153q;
        C1277g c1277g2 = C1277g.f5154r;
        C1277g c1277g3 = C1277g.f5155s;
        C1277g c1277g4 = C1277g.f5147k;
        C1277g c1277g5 = C1277g.f5149m;
        C1277g c1277g6 = C1277g.f5148l;
        C1277g c1277g7 = C1277g.f5150n;
        C1277g c1277g8 = C1277g.f5152p;
        C1277g c1277g9 = C1277g.f5151o;
        C1277g[] c1277gArr = {c1277g, c1277g2, c1277g3, c1277g4, c1277g5, c1277g6, c1277g7, c1277g8, c1277g9};
        C1277g[] c1277gArr2 = {c1277g, c1277g2, c1277g3, c1277g4, c1277g5, c1277g6, c1277g7, c1277g8, c1277g9, C1277g.f5145i, C1277g.f5146j, C1277g.f5143g, C1277g.f5144h, C1277g.f5141e, C1277g.f5142f, C1277g.f5140d};
        C1004j1 c1004j1 = new C1004j1();
        c1004j1.m2483c((C1277g[]) Arrays.copyOf(c1277gArr, 9));
        EnumC1294x enumC1294x = EnumC1294x.TLS_1_3;
        EnumC1294x enumC1294x2 = EnumC1294x.TLS_1_2;
        c1004j1.m2485e(enumC1294x, enumC1294x2);
        if (!c1004j1.f3957a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c1004j1.f3958b = true;
        c1004j1.m2481a();
        C1004j1 c1004j12 = new C1004j1();
        c1004j12.m2483c((C1277g[]) Arrays.copyOf(c1277gArr2, 16));
        c1004j12.m2485e(enumC1294x, enumC1294x2);
        if (!c1004j12.f3957a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c1004j12.f3958b = true;
        f5158e = c1004j12.m2481a();
        C1004j1 c1004j13 = new C1004j1();
        c1004j13.m2483c((C1277g[]) Arrays.copyOf(c1277gArr2, 16));
        c1004j13.m2485e(enumC1294x, enumC1294x2, EnumC1294x.TLS_1_1, EnumC1294x.TLS_1_0);
        if (!c1004j13.f3957a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c1004j13.f3958b = true;
        c1004j13.m2481a();
        f5159f = new C1278h(false, false, null, null);
    }

    public C1278h(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f5160a = z2;
        this.f5161b = z3;
        this.f5162c = strArr;
        this.f5163d = strArr2;
    }

    /* renamed from: a */
    public final List m2960a() {
        String[] strArr = this.f5162c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1277g.f5156t.m2959d(str));
        }
        return AbstractC0757i.m2055a0(arrayList);
    }

    /* renamed from: b */
    public final boolean m2961b(SSLSocket sSLSocket) {
        if (!this.f5160a) {
            return false;
        }
        String[] strArr = this.f5163d;
        if (strArr != null && !AbstractC1302b.m3001j(strArr, sSLSocket.getEnabledProtocols(), C0804a.f3201b)) {
            return false;
        }
        String[] strArr2 = this.f5162c;
        return strArr2 == null || AbstractC1302b.m3001j(strArr2, sSLSocket.getEnabledCipherSuites(), C1277g.f5138b);
    }

    /* renamed from: c */
    public final List m2962c() {
        String[] strArr = this.f5163d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0096d.m354s(str));
        }
        return AbstractC0757i.m2055a0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1278h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1278h c1278h = (C1278h) obj;
        boolean z2 = c1278h.f5160a;
        boolean z3 = this.f5160a;
        if (z3 != z2) {
            return false;
        }
        if (z3) {
            return Arrays.equals(this.f5162c, c1278h.f5162c) && Arrays.equals(this.f5163d, c1278h.f5163d) && this.f5161b == c1278h.f5161b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f5160a) {
            return 17;
        }
        String[] strArr = this.f5162c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f5163d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f5161b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f5160a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m2960a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m2962c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f5161b + ')';
    }
}
