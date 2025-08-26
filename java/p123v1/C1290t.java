package p123v1;

import androidx.emoji2.text.C0605s;
import java.io.Closeable;
import p088j.C1032t;
import p095l1.AbstractC1136c;

/* renamed from: v1.t */
/* loaded from: classes.dex */
public final class C1290t implements Closeable {

    /* renamed from: a */
    public final C1032t f5281a;

    /* renamed from: b */
    public final EnumC1288r f5282b;

    /* renamed from: c */
    public final String f5283c;

    /* renamed from: d */
    public final int f5284d;

    /* renamed from: e */
    public final C1280j f5285e;

    /* renamed from: f */
    public final C1281k f5286f;

    /* renamed from: g */
    public final AbstractC1292v f5287g;

    /* renamed from: h */
    public final C1290t f5288h;

    /* renamed from: i */
    public final C1290t f5289i;

    /* renamed from: j */
    public final C1290t f5290j;

    /* renamed from: k */
    public final long f5291k;

    /* renamed from: l */
    public final long f5292l;

    /* renamed from: m */
    public final C0605s f5293m;

    public C1290t(C1032t c1032t, EnumC1288r enumC1288r, String str, int i2, C1280j c1280j, C1281k c1281k, AbstractC1292v abstractC1292v, C1290t c1290t, C1290t c1290t2, C1290t c1290t3, long j2, long j3, C0605s c0605s) {
        AbstractC1136c.m2637e(c1032t, "request");
        AbstractC1136c.m2637e(enumC1288r, "protocol");
        AbstractC1136c.m2637e(str, "message");
        this.f5281a = c1032t;
        this.f5282b = enumC1288r;
        this.f5283c = str;
        this.f5284d = i2;
        this.f5285e = c1280j;
        this.f5286f = c1281k;
        this.f5287g = abstractC1292v;
        this.f5288h = c1290t;
        this.f5289i = c1290t2;
        this.f5290j = c1290t3;
        this.f5291k = j2;
        this.f5292l = j3;
        this.f5293m = c0605s;
    }

    /* renamed from: g */
    public static String m2982g(String str, C1290t c1290t) {
        c1290t.getClass();
        String m2964a = c1290t.f5286f.m2964a(str);
        if (m2964a != null) {
            return m2964a;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC1292v abstractC1292v = this.f5287g;
        if (abstractC1292v == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC1292v.close();
    }

    /* renamed from: h */
    public final C1289s m2983h() {
        C1289s c1289s = new C1289s();
        c1289s.f5268a = this.f5281a;
        c1289s.f5269b = this.f5282b;
        c1289s.f5270c = this.f5284d;
        c1289s.f5271d = this.f5283c;
        c1289s.f5272e = this.f5285e;
        c1289s.f5273f = this.f5286f.m2966c();
        c1289s.f5274g = this.f5287g;
        c1289s.f5275h = this.f5288h;
        c1289s.f5276i = this.f5289i;
        c1289s.f5277j = this.f5290j;
        c1289s.f5278k = this.f5291k;
        c1289s.f5279l = this.f5292l;
        c1289s.f5280m = this.f5293m;
        return c1289s;
    }

    public final String toString() {
        return "Response{protocol=" + this.f5282b + ", code=" + this.f5284d + ", message=" + this.f5283c + ", url=" + ((C1283m) this.f5281a.f4045c) + '}';
    }
}
