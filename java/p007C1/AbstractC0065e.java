package p007C1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p026J1.C0242j;
import p095l1.AbstractC1136c;

/* renamed from: C1.e */
/* loaded from: classes.dex */
public abstract class AbstractC0065e {

    /* renamed from: a */
    public static final C0062b[] f169a;

    /* renamed from: b */
    public static final Map f170b;

    static {
        C0062b c0062b = new C0062b(C0062b.f150i, "");
        C0242j c0242j = C0062b.f147f;
        C0062b c0062b2 = new C0062b(c0242j, "GET");
        C0062b c0062b3 = new C0062b(c0242j, "POST");
        C0242j c0242j2 = C0062b.f148g;
        C0062b c0062b4 = new C0062b(c0242j2, "/");
        C0062b c0062b5 = new C0062b(c0242j2, "/index.html");
        C0242j c0242j3 = C0062b.f149h;
        C0062b c0062b6 = new C0062b(c0242j3, "http");
        C0062b c0062b7 = new C0062b(c0242j3, "https");
        C0242j c0242j4 = C0062b.f146e;
        C0062b[] c0062bArr = {c0062b, c0062b2, c0062b3, c0062b4, c0062b5, c0062b6, c0062b7, new C0062b(c0242j4, "200"), new C0062b(c0242j4, "204"), new C0062b(c0242j4, "206"), new C0062b(c0242j4, "304"), new C0062b(c0242j4, "400"), new C0062b(c0242j4, "404"), new C0062b(c0242j4, "500"), new C0062b("accept-charset", ""), new C0062b("accept-encoding", "gzip, deflate"), new C0062b("accept-language", ""), new C0062b("accept-ranges", ""), new C0062b("accept", ""), new C0062b("access-control-allow-origin", ""), new C0062b("age", ""), new C0062b("allow", ""), new C0062b("authorization", ""), new C0062b("cache-control", ""), new C0062b("content-disposition", ""), new C0062b("content-encoding", ""), new C0062b("content-language", ""), new C0062b("content-length", ""), new C0062b("content-location", ""), new C0062b("content-range", ""), new C0062b("content-type", ""), new C0062b("cookie", ""), new C0062b("date", ""), new C0062b("etag", ""), new C0062b("expect", ""), new C0062b("expires", ""), new C0062b("from", ""), new C0062b("host", ""), new C0062b("if-match", ""), new C0062b("if-modified-since", ""), new C0062b("if-none-match", ""), new C0062b("if-range", ""), new C0062b("if-unmodified-since", ""), new C0062b("last-modified", ""), new C0062b("link", ""), new C0062b("location", ""), new C0062b("max-forwards", ""), new C0062b("proxy-authenticate", ""), new C0062b("proxy-authorization", ""), new C0062b("range", ""), new C0062b("referer", ""), new C0062b("refresh", ""), new C0062b("retry-after", ""), new C0062b("server", ""), new C0062b("set-cookie", ""), new C0062b("strict-transport-security", ""), new C0062b("transfer-encoding", ""), new C0062b("user-agent", ""), new C0062b("vary", ""), new C0062b("via", ""), new C0062b("www-authenticate", "")};
        f169a = c0062bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i2 = 0; i2 < 61; i2++) {
            if (!linkedHashMap.containsKey(c0062bArr[i2].f152b)) {
                linkedHashMap.put(c0062bArr[i2].f152b, Integer.valueOf(i2));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC1136c.m2636d(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f170b = unmodifiableMap;
    }

    /* renamed from: a */
    public static void m254a(C0242j c0242j) {
        AbstractC1136c.m2637e(c0242j, "name");
        int mo688c = c0242j.mo688c();
        for (int i2 = 0; i2 < mo688c; i2++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte mo691f = c0242j.mo691f(i2);
            if (b <= mo691f && b2 >= mo691f) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0242j.m695j()));
            }
        }
    }
}
