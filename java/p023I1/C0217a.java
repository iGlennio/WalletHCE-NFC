package p023I1;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import p004B1.C0035f;
import p026J1.C0239g;
import p026J1.C0245m;
import p026J1.C0249q;

/* renamed from: I1.a */
/* loaded from: classes.dex */
public final class C0217a implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ int f603a;

    /* renamed from: b */
    public final C0239g f604b;

    /* renamed from: c */
    public final boolean f605c;

    /* renamed from: d */
    public final Object f606d;

    /* renamed from: e */
    public final Closeable f607e;

    public C0217a(int i2, boolean z2) {
        this.f603a = i2;
        switch (i2) {
            case 1:
                this.f605c = z2;
                C0239g c0239g = new C0239g();
                this.f604b = c0239g;
                Inflater inflater = new Inflater(true);
                this.f606d = inflater;
                this.f607e = new C0245m(new C0249q(c0239g), inflater);
                break;
            default:
                this.f605c = z2;
                C0239g c0239g2 = new C0239g();
                this.f604b = c0239g2;
                Deflater deflater = new Deflater(-1, true);
                this.f606d = deflater;
                this.f607e = new C0035f(c0239g2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f603a) {
            case 0:
                ((C0035f) this.f607e).close();
                break;
            default:
                ((C0245m) this.f607e).close();
                break;
        }
    }
}
