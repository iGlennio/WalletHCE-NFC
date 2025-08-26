package p025J0;

import android.graphics.Typeface;
import p002B.AbstractC0012b;
import p047Q1.AbstractC0458e;

/* renamed from: J0.b */
/* loaded from: classes.dex */
public final class C0229b extends AbstractC0012b {

    /* renamed from: h */
    public final /* synthetic */ AbstractC0458e f674h;

    /* renamed from: i */
    public final /* synthetic */ C0231d f675i;

    public C0229b(C0231d c0231d, AbstractC0458e abstractC0458e) {
        this.f675i = c0231d;
        this.f674h = abstractC0458e;
    }

    @Override // p002B.AbstractC0012b
    /* renamed from: g */
    public final void mo43g(int i2) {
        this.f675i.f692m = true;
        this.f674h.mo448L(i2);
    }

    @Override // p002B.AbstractC0012b
    /* renamed from: h */
    public final void mo44h(Typeface typeface) {
        C0231d c0231d = this.f675i;
        c0231d.f693n = Typeface.create(typeface, c0231d.f682c);
        c0231d.f692m = true;
        this.f674h.mo449M(c0231d.f693n, false);
    }
}
