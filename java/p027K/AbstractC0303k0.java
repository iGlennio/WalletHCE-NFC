package p027K;

import p005C.C0041d;
import p010D1.AbstractC0104l;

/* renamed from: K.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC0303k0 {

    /* renamed from: a */
    public final C0319s0 f828a;

    /* renamed from: b */
    public C0041d[] f829b;

    public AbstractC0303k0() {
        this(new C0319s0());
    }

    /* renamed from: a */
    public final void m881a() {
        C0041d[] c0041dArr = this.f829b;
        if (c0041dArr != null) {
            C0041d c0041d = c0041dArr[0];
            C0041d c0041d2 = c0041dArr[1];
            C0319s0 c0319s0 = this.f828a;
            if (c0041d2 == null) {
                c0041d2 = c0319s0.f855a.mo900f(2);
            }
            if (c0041d == null) {
                c0041d = c0319s0.f855a.mo900f(1);
            }
            mo869g(C0041d.m144a(c0041d, c0041d2));
            C0041d c0041d3 = this.f829b[AbstractC0104l.m388C(16)];
            if (c0041d3 != null) {
                mo877f(c0041d3);
            }
            C0041d c0041d4 = this.f829b[AbstractC0104l.m388C(32)];
            if (c0041d4 != null) {
                mo876d(c0041d4);
            }
            C0041d c0041d5 = this.f829b[AbstractC0104l.m388C(64)];
            if (c0041d5 != null) {
                mo878h(c0041d5);
            }
        }
    }

    /* renamed from: b */
    public abstract C0319s0 mo867b();

    /* renamed from: c */
    public void mo879c(int i2, C0041d c0041d) {
        if (this.f829b == null) {
            this.f829b = new C0041d[9];
        }
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                this.f829b[AbstractC0104l.m388C(i3)] = c0041d;
            }
        }
    }

    /* renamed from: e */
    public abstract void mo868e(C0041d c0041d);

    /* renamed from: g */
    public abstract void mo869g(C0041d c0041d);

    public AbstractC0303k0(C0319s0 c0319s0) {
        this.f828a = c0319s0;
    }

    /* renamed from: d */
    public void mo876d(C0041d c0041d) {
    }

    /* renamed from: f */
    public void mo877f(C0041d c0041d) {
    }

    /* renamed from: h */
    public void mo878h(C0041d c0041d) {
    }
}
