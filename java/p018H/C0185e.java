package p018H;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001A1.C0010i;
import p005C.AbstractC0044g;
import p005C.C0046i;
import p010D1.AbstractC0096d;
import p024J.C0226a;
import p075d1.C0766r;
import p079f0.C0830a;
import p079f0.C0861y;
import p088j.C0985d0;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1199i;
import p123v1.C1281k;
import p123v1.C1282l;
import p123v1.C1283m;
import p126w1.AbstractC1302b;

/* renamed from: H.e */
/* loaded from: classes.dex */
public final class C0185e {

    /* renamed from: a */
    public final /* synthetic */ int f535a;

    /* renamed from: b */
    public Object f536b;

    /* renamed from: c */
    public Object f537c;

    /* renamed from: d */
    public Object f538d;

    /* renamed from: e */
    public Object f539e;

    /* renamed from: f */
    public Object f540f;

    public /* synthetic */ C0185e(boolean z2) {
        this.f535a = 2;
    }

    /* renamed from: a */
    public void m558a(String str, String str2) {
        AbstractC1136c.m2637e(str2, "value");
        C0985d0 c0985d0 = (C0985d0) this.f538d;
        c0985d0.getClass();
        AbstractC0096d.m348j(str);
        AbstractC0096d.m350k(str2, str);
        c0985d0.m2461g(str, str2);
    }

    /* renamed from: b */
    public C1032t m559b() {
        Map unmodifiableMap;
        C1283m c1283m = (C1283m) this.f537c;
        if (c1283m == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f536b;
        C1281k m2462i = ((C0985d0) this.f538d).m2462i();
        C0010i c0010i = (C0010i) this.f539e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f540f;
        byte[] bArr = AbstractC1302b.f5337a;
        AbstractC1136c.m2637e(linkedHashMap, "$this$toImmutableMap");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = C0766r.f2997a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC1136c.m2636d(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        }
        return new C1032t(c1283m, str, m2462i, c0010i, unmodifiableMap);
    }

    /* renamed from: c */
    public boolean m560c(int i2) {
        ArrayList arrayList = (ArrayList) this.f538d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0830a c0830a = (C0830a) arrayList.get(i3);
            int i4 = c0830a.f3302a;
            if (i4 != 8) {
                if (i4 == 1) {
                    int i5 = c0830a.f3303b;
                    int i6 = c0830a.f3304c + i5;
                    while (i5 < i6) {
                        if (m564g(i5, i3 + 1) == i2) {
                            return true;
                        }
                        i5++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m564g(c0830a.f3304c, i3 + 1) == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m561d() {
        ArrayList arrayList = (ArrayList) this.f538d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0861y) this.f539e).m2277a((C0830a) arrayList.get(i2));
        }
        m570m(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f537c;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C0830a c0830a = (C0830a) arrayList2.get(i3);
            int i4 = c0830a.f3302a;
            C0861y c0861y = (C0861y) this.f539e;
            if (i4 == 1) {
                c0861y.m2277a(c0830a);
                c0861y.m2280d(c0830a.f3303b, c0830a.f3304c);
            } else if (i4 == 2) {
                c0861y.m2277a(c0830a);
                int i5 = c0830a.f3303b;
                int i6 = c0830a.f3304c;
                RecyclerView recyclerView = c0861y.f3491a;
                recyclerView.m1814O(i5, i6, true);
                recyclerView.f2407f0 = true;
                recyclerView.f2401c0.f3260c += i6;
            } else if (i4 == 4) {
                c0861y.m2277a(c0830a);
                c0861y.m2279c(c0830a.f3303b, c0830a.f3304c);
            } else if (i4 == 8) {
                c0861y.m2277a(c0830a);
                c0861y.m2281e(c0830a.f3303b, c0830a.f3304c);
            }
        }
        m570m(arrayList2);
    }

    /* renamed from: e */
    public void m562e(C0830a c0830a) {
        int i2;
        C0226a c0226a;
        int i3 = c0830a.f3302a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m571n = m571n(c0830a.f3303b, i3);
        int i4 = c0830a.f3303b;
        int i5 = c0830a.f3302a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0830a);
            }
            i2 = 1;
        }
        int i6 = 1;
        int i7 = 1;
        while (true) {
            int i8 = c0830a.f3304c;
            c0226a = (C0226a) this.f536b;
            if (i6 >= i8) {
                break;
            }
            int m571n2 = m571n((i2 * i6) + c0830a.f3303b, c0830a.f3302a);
            int i9 = c0830a.f3302a;
            if (i9 == 2 ? m571n2 != m571n : !(i9 == 4 && m571n2 == m571n + 1)) {
                C0830a m568k = m568k(i9, m571n, i7);
                m563f(m568k, i4);
                c0226a.mo632c(m568k);
                if (c0830a.f3302a == 4) {
                    i4 += i7;
                }
                i7 = 1;
                m571n = m571n2;
            } else {
                i7++;
            }
            i6++;
        }
        c0226a.mo632c(c0830a);
        if (i7 > 0) {
            C0830a m568k2 = m568k(c0830a.f3302a, m571n, i7);
            m563f(m568k2, i4);
            c0226a.mo632c(m568k2);
        }
    }

    /* renamed from: f */
    public void m563f(C0830a c0830a, int i2) {
        C0861y c0861y = (C0861y) this.f539e;
        c0861y.m2277a(c0830a);
        int i3 = c0830a.f3302a;
        if (i3 != 2) {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0861y.m2279c(i2, c0830a.f3304c);
        } else {
            int i4 = c0830a.f3304c;
            RecyclerView recyclerView = c0861y.f3491a;
            recyclerView.m1814O(i2, i4, true);
            recyclerView.f2407f0 = true;
            recyclerView.f2401c0.f3260c += i4;
        }
    }

    /* renamed from: g */
    public int m564g(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f538d;
        int size = arrayList.size();
        while (i3 < size) {
            C0830a c0830a = (C0830a) arrayList.get(i3);
            int i4 = c0830a.f3302a;
            if (i4 == 8) {
                int i5 = c0830a.f3303b;
                if (i5 == i2) {
                    i2 = c0830a.f3304c;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (c0830a.f3304c <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = c0830a.f3303b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = c0830a.f3304c;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += c0830a.f3304c;
                }
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: h */
    public boolean m565h() {
        return ((ArrayList) this.f537c).size() > 0;
    }

    /* renamed from: i */
    public void m566i(String str, String str2) {
        AbstractC1136c.m2637e(str2, "value");
        C0985d0 c0985d0 = (C0985d0) this.f538d;
        c0985d0.getClass();
        AbstractC0096d.m348j(str);
        AbstractC0096d.m350k(str2, str);
        c0985d0.m2463j(str);
        c0985d0.m2461g(str, str2);
    }

    /* renamed from: j */
    public void m567j(String str, C0010i c0010i) {
        AbstractC1136c.m2637e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (c0010i == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC0044g.m155g("method ", str, " must have a request body.").toString());
            }
        } else if (!AbstractC0096d.m333V(str)) {
            throw new IllegalArgumentException(AbstractC0044g.m155g("method ", str, " must not have a request body.").toString());
        }
        this.f536b = str;
        this.f539e = c0010i;
    }

    /* renamed from: k */
    public C0830a m568k(int i2, int i3, int i4) {
        C0830a c0830a = (C0830a) ((C0226a) this.f536b).mo630a();
        if (c0830a != null) {
            c0830a.f3302a = i2;
            c0830a.f3303b = i3;
            c0830a.f3304c = i4;
            return c0830a;
        }
        C0830a c0830a2 = new C0830a();
        c0830a2.f3302a = i2;
        c0830a2.f3303b = i3;
        c0830a2.f3304c = i4;
        return c0830a2;
    }

    /* renamed from: l */
    public void m569l(C0830a c0830a) {
        ((ArrayList) this.f538d).add(c0830a);
        int i2 = c0830a.f3302a;
        C0861y c0861y = (C0861y) this.f539e;
        if (i2 == 1) {
            c0861y.m2280d(c0830a.f3303b, c0830a.f3304c);
            return;
        }
        if (i2 == 2) {
            int i3 = c0830a.f3303b;
            int i4 = c0830a.f3304c;
            RecyclerView recyclerView = c0861y.f3491a;
            recyclerView.m1814O(i3, i4, false);
            recyclerView.f2407f0 = true;
            return;
        }
        if (i2 == 4) {
            c0861y.m2279c(c0830a.f3303b, c0830a.f3304c);
        } else if (i2 == 8) {
            c0861y.m2281e(c0830a.f3303b, c0830a.f3304c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0830a);
        }
    }

    /* renamed from: m */
    public void m570m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0830a c0830a = (C0830a) arrayList.get(i2);
            c0830a.getClass();
            ((C0226a) this.f536b).mo632c(c0830a);
        }
        arrayList.clear();
    }

    /* renamed from: n */
    public int m571n(int i2, int i3) {
        int i4;
        int i5;
        ArrayList arrayList = (ArrayList) this.f538d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0830a c0830a = (C0830a) arrayList.get(size);
            int i6 = c0830a.f3302a;
            if (i6 == 8) {
                int i7 = c0830a.f3303b;
                int i8 = c0830a.f3304c;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            c0830a.f3303b = i7 + 1;
                            c0830a.f3304c = i8 + 1;
                        } else if (i3 == 2) {
                            c0830a.f3303b = i7 - 1;
                            c0830a.f3304c = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        c0830a.f3304c = i8 + 1;
                    } else if (i3 == 2) {
                        c0830a.f3304c = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        c0830a.f3303b = i7 + 1;
                    } else if (i3 == 2) {
                        c0830a.f3303b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = c0830a.f3303b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= c0830a.f3304c;
                    } else if (i6 == 2) {
                        i2 += c0830a.f3304c;
                    }
                } else if (i3 == 1) {
                    c0830a.f3303b = i9 + 1;
                } else if (i3 == 2) {
                    c0830a.f3303b = i9 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0830a c0830a2 = (C0830a) arrayList.get(size2);
            int i10 = c0830a2.f3302a;
            C0226a c0226a = (C0226a) this.f536b;
            if (i10 == 8) {
                int i11 = c0830a2.f3304c;
                if (i11 == c0830a2.f3303b || i11 < 0) {
                    arrayList.remove(size2);
                    c0226a.mo632c(c0830a2);
                }
            } else if (c0830a2.f3304c <= 0) {
                arrayList.remove(size2);
                c0226a.mo632c(c0830a2);
            }
        }
        return i2;
    }

    /* renamed from: o */
    public void m572o(String str) {
        AbstractC1136c.m2637e(str, "url");
        if (AbstractC1199i.m2760F0(str, "ws:", true)) {
            String substring = str.substring(3);
            AbstractC1136c.m2636d(substring, "(this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (AbstractC1199i.m2760F0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            AbstractC1136c.m2636d(substring2, "(this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        AbstractC1136c.m2637e(str, "$this$toHttpUrl");
        C1282l c1282l = new C1282l();
        c1282l.m2970c(null, str);
        this.f537c = c1282l.m2968a();
    }

    public String toString() {
        switch (this.f535a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f536b) + ", mProviderPackage: " + ((String) this.f537c) + ", mQuery: " + ((String) this.f538d) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f540f;
                    if (i2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i2);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i2++;
                }
            default:
                return super.toString();
        }
    }

    public C0185e(String str, String str2, String str3, List list) {
        this.f535a = 0;
        str.getClass();
        this.f536b = str;
        str2.getClass();
        this.f537c = str2;
        this.f538d = str3;
        list.getClass();
        this.f540f = list;
        this.f539e = str + "-" + str2 + "-" + str3;
    }

    public C0185e(C0861y c0861y) {
        this.f535a = 1;
        this.f536b = new C0226a(30);
        this.f537c = new ArrayList();
        this.f538d = new ArrayList();
        this.f539e = c0861y;
        this.f540f = new C0046i(25, this);
    }

    public C0185e() {
        this.f535a = 2;
        this.f540f = new LinkedHashMap();
        this.f536b = "GET";
        this.f538d = new C0985d0(8);
    }
}
