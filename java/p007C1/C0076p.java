package p007C1;

import java.io.IOException;
import p132y1.AbstractC1321a;

/* renamed from: C1.p */
/* loaded from: classes.dex */
public final class C0076p extends AbstractC1321a {

    /* renamed from: e */
    public final /* synthetic */ C0077q f197e;

    /* renamed from: f */
    public final /* synthetic */ int f198f;

    /* renamed from: g */
    public final /* synthetic */ long f199g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076p(String str, C0077q c0077q, int i2, long j2) {
        super(str, true);
        this.f197e = c0077q;
        this.f198f = i2;
        this.f199g = j2;
    }

    @Override // p132y1.AbstractC1321a
    /* renamed from: a */
    public final long mo256a() {
        C0077q c0077q = this.f197e;
        try {
            c0077q.f224x.m297n(this.f198f, this.f199g);
            return -1L;
        } catch (IOException e2) {
            c0077q.m260g(2, 2, e2);
            return -1L;
        }
    }
}
