package p129x1;

import p123v1.C1289s;
import p123v1.C1290t;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public final class C1315a {
    /* renamed from: a */
    public static final C1290t m3021a(C1290t c1290t) {
        if ((c1290t != null ? c1290t.f5287g : null) == null) {
            return c1290t;
        }
        C1289s m2983h = c1290t.m2983h();
        m2983h.f5274g = null;
        return m2983h.m2981a();
    }

    /* renamed from: b */
    public static boolean m3022b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
