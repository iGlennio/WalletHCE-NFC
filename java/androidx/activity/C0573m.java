package androidx.activity;

import androidx.fragment.app.C0649w;
import java.util.ListIterator;
import p072c1.C0699c;
import p075d1.C0755g;
import p092k1.InterfaceC1103a;
import p095l1.AbstractC1137d;

/* renamed from: androidx.activity.m */
/* loaded from: classes.dex */
public final class C0573m extends AbstractC1137d implements InterfaceC1103a {

    /* renamed from: a */
    public final /* synthetic */ int f1597a;

    /* renamed from: b */
    public final /* synthetic */ C0581s f1598b;

    public /* synthetic */ C0573m(C0581s c0581s, int i2) {
        this.f1597a = i2;
        this.f1598b = c0581s;
    }

    @Override // p092k1.InterfaceC1103a
    /* renamed from: a */
    public final Object mo259a() {
        Object obj;
        switch (this.f1597a) {
            case 0:
                this.f1598b.m1372b();
                break;
            case 1:
                C0581s c0581s = this.f1598b;
                C0755g c0755g = c0581s.f1617b;
                ListIterator listIterator = c0755g.listIterator(c0755g.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((C0649w) obj).f2264a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                c0581s.f1618c = null;
                break;
            default:
                this.f1598b.m1372b();
                break;
        }
        return C0699c.f2483c;
    }
}
