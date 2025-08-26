package androidx.lifecycle;

import android.os.Handler;
import p005C.C0046i;
import p014F0.RunnableC0130G;
import p095l1.AbstractC1136c;

/* renamed from: androidx.lifecycle.B */
/* loaded from: classes.dex */
public final class C0654B implements InterfaceC0683r {

    /* renamed from: i */
    public static final C0654B f2272i = new C0654B();

    /* renamed from: a */
    public int f2273a;

    /* renamed from: b */
    public int f2274b;

    /* renamed from: e */
    public Handler f2277e;

    /* renamed from: c */
    public boolean f2275c = true;

    /* renamed from: d */
    public boolean f2276d = true;

    /* renamed from: f */
    public final C0685t f2278f = new C0685t(this);

    /* renamed from: g */
    public final RunnableC0130G f2279g = new RunnableC0130G(10, this);

    /* renamed from: h */
    public final C0046i f2280h = new C0046i(20, this);

    /* renamed from: a */
    public final void m1687a() {
        int i2 = this.f2274b + 1;
        this.f2274b = i2;
        if (i2 == 1) {
            if (this.f2275c) {
                this.f2278f.m1702d(EnumC0677l.ON_RESUME);
                this.f2275c = false;
            } else {
                Handler handler = this.f2277e;
                AbstractC1136c.m2634b(handler);
                handler.removeCallbacks(this.f2279g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0683r
    /* renamed from: d */
    public final C0685t mo1362d() {
        return this.f2278f;
    }
}
