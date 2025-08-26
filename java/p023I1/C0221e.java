package p023I1;

import java.io.IOException;
import p095l1.AbstractC1136c;
import p132y1.AbstractC1321a;
import p135z1.C1340h;

/* renamed from: I1.e */
/* loaded from: classes.dex */
public final class C0221e extends AbstractC1321a {

    /* renamed from: e */
    public final /* synthetic */ int f612e = 0;

    /* renamed from: f */
    public final /* synthetic */ C0222f f613f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0221e(String str, C0222f c0222f) {
        super(str, true);
        this.f613f = c0222f;
    }

    @Override // p132y1.AbstractC1321a
    /* renamed from: a */
    public final long mo256a() {
        switch (this.f612e) {
            case 0:
                C0222f c0222f = this.f613f;
                try {
                    if (c0222f.m625g()) {
                    }
                } catch (IOException e2) {
                    c0222f.m621c(e2);
                    break;
                }
                break;
            default:
                C1340h c1340h = this.f613f.f616b;
                AbstractC1136c.m2634b(c1340h);
                c1340h.m3087d();
                break;
        }
        return -1L;
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0221e(C0222f c0222f) {
        super(c0222f.f621g + " writer", true);
        this.f613f = c0222f;
    }
}
