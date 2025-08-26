package androidx.lifecycle;

import androidx.activity.AbstractActivityC0571k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p067a0.AbstractC0555b;
import p067a0.C0557d;
import p075d1.C0765q;
import p092k1.InterfaceC1103a;
import p095l1.AbstractC1136c;
import p095l1.AbstractC1137d;
import p095l1.AbstractC1140g;
import p095l1.C1135b;

/* renamed from: androidx.lifecycle.G */
/* loaded from: classes.dex */
public final class C0659G extends AbstractC1137d implements InterfaceC1103a {

    /* renamed from: a */
    public final /* synthetic */ int f2289a;

    /* renamed from: b */
    public final /* synthetic */ Object f2290b;

    public /* synthetic */ C0659G(int i2, Object obj) {
        this.f2289a = i2;
        this.f2290b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k1.a, l1.d] */
    @Override // p092k1.InterfaceC1103a
    /* renamed from: a */
    public final Object mo259a() {
        switch (this.f2289a) {
            case 0:
                AbstractActivityC0571k abstractActivityC0571k = (AbstractActivityC0571k) this.f2290b;
                ArrayList arrayList = new ArrayList();
                AbstractC1140g.f4340a.getClass();
                Class mo2632a = new C1135b(C0661I.class).mo2632a();
                AbstractC1136c.m2635c(mo2632a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new C0557d(mo2632a));
                C0557d[] c0557dArr = (C0557d[]) arrayList.toArray(new C0557d[0]);
                C0557d[] c0557dArr2 = (C0557d[]) Arrays.copyOf(c0557dArr, c0557dArr.length);
                AbstractC1136c.m2637e(c0557dArr2, "initializers");
                C0664L mo1361c = abstractActivityC0571k.mo1361c();
                AbstractC0555b mo1359a = abstractActivityC0571k.mo1359a();
                AbstractC1136c.m2637e(mo1361c, "store");
                AbstractC1136c.m2637e(mo1359a, "defaultCreationExtras");
                LinkedHashMap linkedHashMap = mo1361c.f2300a;
                AbstractC0662J abstractC0662J = (AbstractC0662J) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (C0661I.class.isInstance(abstractC0662J)) {
                    AbstractC1136c.m2635c(abstractC0662J, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(mo1359a.f1524a);
                    linkedHashMap2.put(C0663K.f2299b, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        abstractC0662J = null;
                        for (C0557d c0557d : c0557dArr2) {
                            if (c0557d.f1525a.equals(C0661I.class)) {
                                abstractC0662J = new C0661I();
                            }
                        }
                        if (abstractC0662J == null) {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(C0661I.class.getName()));
                        }
                        AbstractC0662J abstractC0662J2 = (AbstractC0662J) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", abstractC0662J);
                        if (abstractC0662J2 != null) {
                            abstractC0662J2.mo1607a();
                        }
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (C0661I) abstractC0662J;
            case 1:
                return (List) this.f2290b;
            default:
                try {
                    return (List) ((AbstractC1137d) this.f2290b).mo259a();
                } catch (SSLPeerUnverifiedException unused2) {
                    return C0765q.f2996a;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0659G(InterfaceC1103a interfaceC1103a) {
        this.f2289a = 2;
        this.f2290b = (AbstractC1137d) interfaceC1103a;
    }
}
