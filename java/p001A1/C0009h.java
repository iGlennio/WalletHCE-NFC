package p001A1;

import java.util.regex.Pattern;
import p010D1.AbstractC0104l;
import p026J1.C0249q;
import p026J1.InterfaceC0241i;
import p123v1.AbstractC1292v;
import p123v1.C1285o;

/* renamed from: A1.h */
/* loaded from: classes.dex */
public final class C0009h extends AbstractC1292v {

    /* renamed from: a */
    public final String f14a;

    /* renamed from: b */
    public final long f15b;

    /* renamed from: c */
    public final C0249q f16c;

    public C0009h(String str, long j2, C0249q c0249q) {
        this.f14a = str;
        this.f15b = j2;
        this.f16c = c0249q;
    }

    @Override // p123v1.AbstractC1292v
    /* renamed from: g */
    public final long mo22g() {
        return this.f15b;
    }

    @Override // p123v1.AbstractC1292v
    /* renamed from: h */
    public final C1285o mo23h() {
        String str = this.f14a;
        if (str == null) {
            return null;
        }
        Pattern pattern = C1285o.f5200c;
        try {
            return AbstractC0104l.m411r(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // p123v1.AbstractC1292v
    /* renamed from: i */
    public final InterfaceC0241i mo24i() {
        return this.f16c;
    }
}
