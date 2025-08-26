package p057V0;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p053T0.InterfaceC0485b;
import p068a1.C0558a;

/* renamed from: V0.m */
/* loaded from: classes.dex */
public final class C0525m extends AbstractC0477l {

    /* renamed from: a */
    public final /* synthetic */ int f1438a;

    /* renamed from: b */
    public final Object f1439b;

    /* renamed from: c */
    public final Object f1440c;

    /* renamed from: d */
    public final Object f1441d;

    public C0525m(C0469d c0469d, AbstractC0477l abstractC0477l, Type type) {
        this.f1438a = 0;
        this.f1439b = c0469d;
        this.f1440c = abstractC0477l;
        this.f1441d = type;
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        switch (this.f1438a) {
            case 0:
                return ((AbstractC0477l) this.f1440c).mo1221a(c0558a);
            default:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                String m1330z = c0558a.m1330z();
                Enum r02 = (Enum) ((HashMap) this.f1439b).get(m1330z);
                return r02 == null ? (Enum) ((HashMap) this.f1440c).get(m1330z) : r02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if ((r1 instanceof p057V0.AbstractC0522j) != false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1222b(p068a1.C0559b r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.f1438a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto Lb
            r6 = 0
            goto L15
        Lb:
            java.lang.Object r0 = r4.f1441d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.m1345u(r6)
            return
        L19:
            java.lang.Object r0 = r4.f1441d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L2c
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L2c
        L27:
            java.lang.Class r1 = r6.getClass()
            goto L2d
        L2c:
            r1 = r0
        L2d:
            java.lang.Object r2 = r4.f1440c
            S0.l r2 = (p051S0.AbstractC0477l) r2
            if (r1 == r0) goto L64
            Z0.a r0 = new Z0.a
            r0.<init>(r1)
            java.lang.Object r1 = r4.f1439b
            S0.d r1 = (p051S0.C0469d) r1
            S0.l r0 = r1.m1225c(r0)
            boolean r1 = r0 instanceof p057V0.AbstractC0522j
            if (r1 != 0) goto L45
            goto L63
        L45:
            r1 = r2
        L46:
            boolean r3 = r1 instanceof p051S0.C0468c
            if (r3 == 0) goto L5e
            r3 = r1
            S0.c r3 = (p051S0.C0468c) r3
            S0.l r3 = r3.f1277a
            if (r3 == 0) goto L56
            if (r3 != r1) goto L54
            goto L5e
        L54:
            r1 = r3
            goto L46
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            r5.<init>(r6)
            throw r5
        L5e:
            boolean r1 = r1 instanceof p057V0.AbstractC0522j
            if (r1 != 0) goto L63
            goto L64
        L63:
            r2 = r0
        L64:
            r2.mo1222b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p057V0.C0525m.mo1222b(a1.b, java.lang.Object):void");
    }

    public C0525m(Class cls) {
        this.f1438a = 1;
        this.f1439b = new HashMap();
        this.f1440c = new HashMap();
        this.f1441d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C0528p(cls))) {
                Enum r4 = (Enum) field.get(null);
                String name = r4.name();
                String str = r4.toString();
                InterfaceC0485b interfaceC0485b = (InterfaceC0485b) field.getAnnotation(InterfaceC0485b.class);
                if (interfaceC0485b != null) {
                    name = interfaceC0485b.value();
                    for (String str2 : interfaceC0485b.alternate()) {
                        ((HashMap) this.f1439b).put(str2, r4);
                    }
                }
                ((HashMap) this.f1439b).put(name, r4);
                ((HashMap) this.f1440c).put(str, r4);
                ((HashMap) this.f1441d).put(r4, name);
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
