package p089j0;

/* renamed from: j0.r */
/* loaded from: classes.dex */
public final class C1076r extends AbstractC1072n {

    /* renamed from: a */
    public final /* synthetic */ int f4216a = 1;

    /* renamed from: b */
    public AbstractC1071m f4217b;

    public /* synthetic */ C1076r() {
    }

    @Override // p089j0.AbstractC1072n, p089j0.InterfaceC1069k
    /* renamed from: c */
    public void mo2553c(AbstractC1071m abstractC1071m) {
        switch (this.f4216a) {
            case 1:
                C1059a c1059a = (C1059a) this.f4217b;
                if (!c1059a.f4150D) {
                    c1059a.m2589G();
                    c1059a.f4150D = true;
                    break;
                }
                break;
        }
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: d */
    public final void mo2554d(AbstractC1071m abstractC1071m) {
        switch (this.f4216a) {
            case 0:
                this.f4217b.mo2575z();
                abstractC1071m.mo2573x(this);
                break;
            default:
                C1059a c1059a = (C1059a) this.f4217b;
                int i2 = c1059a.f4149C - 1;
                c1059a.f4149C = i2;
                if (i2 == 0) {
                    c1059a.f4150D = false;
                    c1059a.m2594m();
                }
                abstractC1071m.mo2573x(this);
                break;
        }
    }

    public C1076r(AbstractC1071m abstractC1071m) {
        this.f4217b = abstractC1071m;
    }
}
