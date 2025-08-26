package androidx.activity;

import java.io.Serializable;
import p072c1.C0699c;
import p092k1.InterfaceC1103a;
import p095l1.AbstractC1136c;
import p095l1.AbstractC1140g;
import p095l1.C1135b;
import p095l1.C1138e;
import p095l1.InterfaceC1134a;

/* renamed from: androidx.activity.r */
/* loaded from: classes.dex */
public final /* synthetic */ class C0578r implements InterfaceC1103a, Serializable {

    /* renamed from: a */
    public transient C0578r f1607a;

    /* renamed from: b */
    public final Object f1608b;

    /* renamed from: c */
    public final boolean f1609c = false;

    /* renamed from: d */
    public final int f1610d = 0;

    /* renamed from: e */
    public final /* synthetic */ int f1611e;

    public C0578r(int i2, Object obj) {
        this.f1611e = i2;
        this.f1608b = obj;
    }

    @Override // p092k1.InterfaceC1103a
    /* renamed from: a */
    public final Object mo259a() {
        switch (this.f1611e) {
            case 0:
                ((C0581s) this.f1608b).m1374d();
                break;
            default:
                ((C0581s) this.f1608b).m1374d();
                break;
        }
        return C0699c.f2483c;
    }

    /* renamed from: b */
    public final InterfaceC1134a m1370b() {
        if (this.f1609c) {
            AbstractC1140g.f4340a.getClass();
            return new C1138e();
        }
        AbstractC1140g.f4340a.getClass();
        return new C1135b(C0581s.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0578r) {
            C0578r c0578r = (C0578r) obj;
            c0578r.getClass();
            return this.f1610d == c0578r.f1610d && AbstractC1136c.m2633a(this.f1608b, c0578r.f1608b) && m1370b().equals(c0578r.m1370b());
        }
        if (!(obj instanceof C0578r)) {
            return false;
        }
        C0578r c0578r2 = this.f1607a;
        if (c0578r2 == null) {
            AbstractC1140g.f4340a.getClass();
            this.f1607a = this;
            c0578r2 = this;
        }
        return obj.equals(c0578r2);
    }

    public final int hashCode() {
        m1370b();
        return (((m1370b().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        C0578r c0578r = this.f1607a;
        if (c0578r == null) {
            AbstractC1140g.f4340a.getClass();
            this.f1607a = this;
            c0578r = this;
        }
        return c0578r != this ? c0578r.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
