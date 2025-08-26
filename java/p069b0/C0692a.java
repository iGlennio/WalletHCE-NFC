package p069b0;

import androidx.lifecycle.AbstractC0662J;
import p101o.C1162l;

/* renamed from: b0.a */
/* loaded from: classes.dex */
public class C0692a extends AbstractC0662J {

    /* renamed from: c */
    public final C1162l f2464c = new C1162l();

    @Override // androidx.lifecycle.AbstractC0662J
    /* renamed from: a */
    public final void mo1607a() {
        C1162l c1162l = this.f2464c;
        int i2 = c1162l.f4426c;
        if (i2 > 0) {
            c1162l.f4425b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c1162l.f4425b;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        c1162l.f4426c = 0;
    }
}
