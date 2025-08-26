package p057V0;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005C.AbstractC0044g;
import p034M0.C0360e;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p051S0.InterfaceC0478m;
import p055U0.AbstractC0490d;
import p055U0.C0494h;
import p061X0.AbstractC0545c;
import p065Z0.C0551a;

/* renamed from: V0.n */
/* loaded from: classes.dex */
public final class C0526n implements InterfaceC0478m {

    /* renamed from: a */
    public final /* synthetic */ int f1442a;

    /* renamed from: b */
    public final Object f1443b;

    /* renamed from: c */
    public final Object f1444c;

    public /* synthetic */ C0526n(Class cls, AbstractC0477l abstractC0477l, int i2) {
        this.f1442a = i2;
        this.f1443b = cls;
        this.f1444c = abstractC0477l;
    }

    @Override // p051S0.InterfaceC0478m
    /* renamed from: a */
    public final AbstractC0477l mo1231a(C0469d c0469d, C0551a c0551a) {
        switch (this.f1442a) {
            case 0:
                if (c0551a.f1518a == ((Class) this.f1443b)) {
                    return (AbstractC0477l) this.f1444c;
                }
                return null;
            case 1:
                Class cls = (Class) this.f1443b;
                Class<?> cls2 = c0551a.f1518a;
                if (cls.isAssignableFrom(cls2)) {
                    return new C0514b(this, cls2);
                }
                return null;
            default:
                Class cls3 = c0551a.f1518a;
                if (!Object.class.isAssignableFrom(cls3)) {
                    return null;
                }
                List list = Collections.EMPTY_LIST;
                AbstractC0490d.m1264e();
                return AbstractC0545c.f1501a.mo363N(cls3) ? new C0524l(cls3, m1288b(c0469d, c0551a, cls3, true)) : new C0523k(((C0360e) this.f1443b).m1015h(c0551a), m1288b(c0469d, c0551a, cls3, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d1, code lost:
    
        r14 = new p065Z0.C0551a(p055U0.AbstractC0490d.m1267h(r6, r15, r15.getGenericSuperclass(), new java.util.HashMap()));
        r15 = r14.f1518a;
        r0 = r26;
        r9 = r27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b0  */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedHashMap m1288b(p051S0.C0469d r27, p065Z0.C0551a r28, java.lang.Class r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p057V0.C0526n.m1288b(S0.d, Z0.a, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    /* renamed from: c */
    public boolean m1289c(Field field, boolean z2) {
        Class<?> type = field.getType();
        C0494h c0494h = (C0494h) this.f1444c;
        c0494h.getClass();
        if (C0494h.m1269c(type)) {
            return false;
        }
        c0494h.m1270b(z2);
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || C0494h.m1269c(field.getType())) {
            return false;
        }
        List list = z2 ? c0494h.f1350a : c0494h.f1351b;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        return true;
    }

    public String toString() {
        switch (this.f1442a) {
            case 0:
                return "Factory[type=" + ((Class) this.f1443b).getName() + ",adapter=" + ((AbstractC0477l) this.f1444c) + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f1443b).getName() + ",adapter=" + ((AbstractC0477l) this.f1444c) + "]";
            default:
                return super.toString();
        }
    }

    public C0526n(C0360e c0360e, C0494h c0494h, C0515c c0515c) {
        this.f1442a = 2;
        List list = Collections.EMPTY_LIST;
        this.f1443b = c0360e;
        this.f1444c = c0494h;
    }
}
