package p024J;

/* renamed from: J.b */
/* loaded from: classes.dex */
public final class C0227b extends C0226a {

    /* renamed from: c */
    public final Object f670c;

    public C0227b() {
        super(12);
        this.f670c = new Object();
    }

    @Override // p024J.C0226a
    /* renamed from: a */
    public final Object mo630a() {
        Object mo630a;
        synchronized (this.f670c) {
            mo630a = super.mo630a();
        }
        return mo630a;
    }

    @Override // p024J.C0226a
    /* renamed from: c */
    public final boolean mo632c(Object obj) {
        boolean mo632c;
        synchronized (this.f670c) {
            mo632c = super.mo632c(obj);
        }
        return mo632c;
    }
}
