package p007C1;

import java.io.IOException;
import p026J1.C0239g;
import p132y1.AbstractC1321a;

/* renamed from: C1.l */
/* loaded from: classes.dex */
public final class C0072l extends AbstractC1321a {

    /* renamed from: e */
    public final /* synthetic */ C0077q f184e;

    /* renamed from: f */
    public final /* synthetic */ int f185f;

    /* renamed from: g */
    public final /* synthetic */ C0239g f186g;

    /* renamed from: h */
    public final /* synthetic */ int f187h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0072l(String str, C0077q c0077q, int i2, C0239g c0239g, int i3, boolean z2) {
        super(str, true);
        this.f184e = c0077q;
        this.f185f = i2;
        this.f186g = c0239g;
        this.f187h = i3;
    }

    @Override // p132y1.AbstractC1321a
    /* renamed from: a */
    public final long mo256a() {
        try {
            C0058C c0058c = this.f184e.f211k;
            C0239g c0239g = this.f186g;
            int i2 = this.f187h;
            c0058c.getClass();
            c0239g.m678s(i2);
            this.f184e.f224x.m296m(this.f185f, 9);
            synchronized (this.f184e) {
                this.f184e.f226z.remove(Integer.valueOf(this.f185f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
