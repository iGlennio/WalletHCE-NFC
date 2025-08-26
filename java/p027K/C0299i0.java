package p027K;

import android.view.WindowInsets;
import p005C.AbstractC0039b;
import p005C.C0041d;

/* renamed from: K.i0 */
/* loaded from: classes.dex */
public class C0299i0 extends AbstractC0303k0 {

    /* renamed from: c */
    public final WindowInsets.Builder f826c;

    public C0299i0() {
        this.f826c = AbstractC0039b.m122f();
    }

    @Override // p027K.AbstractC0303k0
    /* renamed from: b */
    public C0319s0 mo867b() {
        WindowInsets build;
        m881a();
        build = this.f826c.build();
        C0319s0 m936g = C0319s0.m936g(null, build);
        m936g.f855a.mo904o(this.f829b);
        return m936g;
    }

    @Override // p027K.AbstractC0303k0
    /* renamed from: d */
    public void mo876d(C0041d c0041d) {
        this.f826c.setMandatorySystemGestureInsets(c0041d.m147d());
    }

    @Override // p027K.AbstractC0303k0
    /* renamed from: e */
    public void mo868e(C0041d c0041d) {
        this.f826c.setStableInsets(c0041d.m147d());
    }

    @Override // p027K.AbstractC0303k0
    /* renamed from: f */
    public void mo877f(C0041d c0041d) {
        this.f826c.setSystemGestureInsets(c0041d.m147d());
    }

    @Override // p027K.AbstractC0303k0
    /* renamed from: g */
    public void mo869g(C0041d c0041d) {
        this.f826c.setSystemWindowInsets(c0041d.m147d());
    }

    @Override // p027K.AbstractC0303k0
    /* renamed from: h */
    public void mo878h(C0041d c0041d) {
        this.f826c.setTappableElementInsets(c0041d.m147d());
    }

    public C0299i0(C0319s0 c0319s0) {
        super(c0319s0);
        WindowInsets.Builder m122f;
        WindowInsets m941f = c0319s0.m941f();
        if (m941f != null) {
            m122f = AbstractC0039b.m123g(m941f);
        } else {
            m122f = AbstractC0039b.m122f();
        }
        this.f826c = m122f;
    }
}
