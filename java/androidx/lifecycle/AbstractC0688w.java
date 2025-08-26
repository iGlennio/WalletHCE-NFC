package androidx.lifecycle;

import p005C.C0046i;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public abstract class AbstractC0688w {

    /* renamed from: a */
    public final C0046i f2333a;

    /* renamed from: b */
    public boolean f2334b;

    /* renamed from: c */
    public int f2335c = -1;

    /* renamed from: d */
    public final /* synthetic */ C0689x f2336d;

    public AbstractC0688w(C0689x c0689x, C0046i c0046i) {
        this.f2336d = c0689x;
        this.f2333a = c0046i;
    }

    /* renamed from: c */
    public final void m1709c(boolean z2) {
        if (z2 == this.f2334b) {
            return;
        }
        this.f2334b = z2;
        int i2 = z2 ? 1 : -1;
        C0689x c0689x = this.f2336d;
        int i3 = c0689x.f2340c;
        c0689x.f2340c = i2 + i3;
        if (!c0689x.f2341d) {
            c0689x.f2341d = true;
            while (true) {
                try {
                    int i4 = c0689x.f2340c;
                    if (i3 == i4) {
                        break;
                    } else {
                        i3 = i4;
                    }
                } finally {
                    c0689x.f2341d = false;
                }
            }
        }
        if (this.f2334b) {
            c0689x.m1712c(this);
        }
    }

    /* renamed from: d */
    public void mo1692d() {
    }

    /* renamed from: e */
    public abstract boolean mo1693e();
}
