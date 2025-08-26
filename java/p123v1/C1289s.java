package p123v1;

import androidx.emoji2.text.C0605s;
import p088j.C0985d0;
import p088j.C1032t;

/* renamed from: v1.s */
/* loaded from: classes.dex */
public final class C1289s {

    /* renamed from: a */
    public C1032t f5268a;

    /* renamed from: b */
    public EnumC1288r f5269b;

    /* renamed from: d */
    public String f5271d;

    /* renamed from: e */
    public C1280j f5272e;

    /* renamed from: g */
    public AbstractC1292v f5274g;

    /* renamed from: h */
    public C1290t f5275h;

    /* renamed from: i */
    public C1290t f5276i;

    /* renamed from: j */
    public C1290t f5277j;

    /* renamed from: k */
    public long f5278k;

    /* renamed from: l */
    public long f5279l;

    /* renamed from: m */
    public C0605s f5280m;

    /* renamed from: c */
    public int f5270c = -1;

    /* renamed from: f */
    public C0985d0 f5273f = new C0985d0(8);

    /* renamed from: b */
    public static void m2980b(String str, C1290t c1290t) {
        if (c1290t != null) {
            if (c1290t.f5287g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c1290t.f5288h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c1290t.f5289i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c1290t.f5290j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* renamed from: a */
    public final C1290t m2981a() {
        int i2 = this.f5270c;
        if (i2 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f5270c).toString());
        }
        C1032t c1032t = this.f5268a;
        if (c1032t == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC1288r enumC1288r = this.f5269b;
        if (enumC1288r == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f5271d;
        if (str != null) {
            return new C1290t(c1032t, enumC1288r, str, i2, this.f5272e, this.f5273f.m2462i(), this.f5274g, this.f5275h, this.f5276i, this.f5277j, this.f5278k, this.f5279l, this.f5280m);
        }
        throw new IllegalStateException("message == null");
    }
}
