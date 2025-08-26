package androidx.activity;

import androidx.fragment.app.C0649w;
import java.util.ListIterator;
import p072c1.C0699c;
import p075d1.C0755g;
import p092k1.InterfaceC1114l;
import p095l1.AbstractC1136c;
import p095l1.AbstractC1137d;

/* renamed from: androidx.activity.l */
/* loaded from: classes.dex */
public final class C0572l extends AbstractC1137d implements InterfaceC1114l {

    /* renamed from: a */
    public final /* synthetic */ int f1595a;

    /* renamed from: b */
    public final /* synthetic */ C0581s f1596b;

    public /* synthetic */ C0572l(C0581s c0581s, int i2) {
        this.f1595a = i2;
        this.f1596b = c0581s;
    }

    @Override // p092k1.InterfaceC1114l
    /* renamed from: b */
    public final Object mo1365b(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1595a) {
            case 0:
                AbstractC1136c.m2637e((C0562b) obj, "backEvent");
                C0581s c0581s = this.f1596b;
                C0755g c0755g = c0581s.f1617b;
                ListIterator listIterator = c0755g.listIterator(c0755g.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((C0649w) obj2).f2264a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                c0581s.f1618c = (C0649w) obj2;
                break;
            default:
                AbstractC1136c.m2637e((C0562b) obj, "backEvent");
                C0755g c0755g2 = this.f1596b.f1617b;
                ListIterator listIterator2 = c0755g2.listIterator(c0755g2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (((C0649w) obj3).f2264a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                break;
        }
        return C0699c.f2483c;
    }
}
