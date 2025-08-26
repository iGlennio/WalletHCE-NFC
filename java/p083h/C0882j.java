package p083h;

import p010D1.AbstractC0096d;
import p088j.C1034t1;

/* renamed from: h.j */
/* loaded from: classes.dex */
public final class C0882j extends AbstractC0096d {

    /* renamed from: n */
    public final /* synthetic */ int f3560n;

    /* renamed from: o */
    public boolean f3561o;

    /* renamed from: p */
    public int f3562p;

    /* renamed from: q */
    public final /* synthetic */ Object f3563q;

    public C0882j(C0883k c0883k) {
        this.f3560n = 0;
        this.f3563q = c0883k;
        this.f3561o = false;
        this.f3562p = 0;
    }

    @Override // p027K.InterfaceC0279X
    /* renamed from: a */
    public final void mo844a() {
        switch (this.f3560n) {
            case 0:
                int i2 = this.f3562p + 1;
                this.f3562p = i2;
                C0883k c0883k = (C0883k) this.f3563q;
                if (i2 == c0883k.f3564a.size()) {
                    AbstractC0096d abstractC0096d = c0883k.f3567d;
                    if (abstractC0096d != null) {
                        abstractC0096d.mo844a();
                    }
                    this.f3562p = 0;
                    this.f3561o = false;
                    c0883k.f3568e = false;
                    break;
                }
                break;
            default:
                if (!this.f3561o) {
                    ((C1034t1) this.f3563q).f4054a.setVisibility(this.f3562p);
                    break;
                }
                break;
        }
    }

    @Override // p010D1.AbstractC0096d, p027K.InterfaceC0279X
    /* renamed from: b */
    public void mo367b() {
        switch (this.f3560n) {
            case 1:
                this.f3561o = true;
                break;
        }
    }

    @Override // p010D1.AbstractC0096d, p027K.InterfaceC0279X
    /* renamed from: c */
    public final void mo368c() {
        switch (this.f3560n) {
            case 0:
                if (!this.f3561o) {
                    this.f3561o = true;
                    AbstractC0096d abstractC0096d = ((C0883k) this.f3563q).f3567d;
                    if (abstractC0096d != null) {
                        abstractC0096d.mo368c();
                        break;
                    }
                }
                break;
            default:
                ((C1034t1) this.f3563q).f4054a.setVisibility(0);
                break;
        }
    }

    public C0882j(C1034t1 c1034t1, int i2) {
        this.f3560n = 1;
        this.f3563q = c1034t1;
        this.f3562p = i2;
        this.f3561o = false;
    }
}
