package p007C1;

import java.io.IOException;
import java.util.List;
import p132y1.AbstractC1321a;

/* renamed from: C1.m */
/* loaded from: classes.dex */
public final class C0073m extends AbstractC1321a {

    /* renamed from: e */
    public final /* synthetic */ int f188e = 1;

    /* renamed from: f */
    public final /* synthetic */ C0077q f189f;

    /* renamed from: g */
    public final /* synthetic */ int f190g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073m(String str, C0077q c0077q, int i2, List list) {
        super(str, true);
        this.f189f = c0077q;
        this.f190g = i2;
    }

    @Override // p132y1.AbstractC1321a
    /* renamed from: a */
    public final long mo256a() {
        switch (this.f188e) {
            case 0:
                this.f189f.f211k.getClass();
                try {
                    this.f189f.f224x.m296m(this.f190g, 9);
                    synchronized (this.f189f) {
                        this.f189f.f226z.remove(Integer.valueOf(this.f190g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f189f.f211k.getClass();
                try {
                    this.f189f.f224x.m296m(this.f190g, 9);
                    synchronized (this.f189f) {
                        this.f189f.f226z.remove(Integer.valueOf(this.f190g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073m(String str, C0077q c0077q, int i2, List list, boolean z2) {
        super(str, true);
        this.f189f = c0077q;
        this.f190g = i2;
    }
}
