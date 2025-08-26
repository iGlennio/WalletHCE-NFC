package p057V0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p051S0.InterfaceC0478m;
import p055U0.AbstractC0490d;
import p063Y0.C0547a;
import p065Z0.C0551a;

/* renamed from: V0.a */
/* loaded from: classes.dex */
public final class C0513a implements InterfaceC0478m {

    /* renamed from: a */
    public final /* synthetic */ int f1401a;

    public /* synthetic */ C0513a(int i2) {
        this.f1401a = i2;
    }

    @Override // p051S0.InterfaceC0478m
    /* renamed from: a */
    public final AbstractC0477l mo1231a(C0469d c0469d, C0551a c0551a) {
        switch (this.f1401a) {
            case 0:
                Type type = c0551a.f1519b;
                boolean z2 = type instanceof GenericArrayType;
                if (!z2 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z2 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new C0514b(c0469d, c0469d.m1225c(new C0551a(genericComponentType)), AbstractC0490d.m1266g(genericComponentType));
            case 1:
                if (c0551a.f1518a == Date.class) {
                    return new C0516d();
                }
                return null;
            case 2:
                if (c0551a.f1518a == Object.class) {
                    return new C0520h(c0469d);
                }
                return null;
            case 3:
                Class cls = c0551a.f1518a;
                if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                    return null;
                }
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new C0525m(cls);
            case 4:
                if (c0551a.f1518a == java.sql.Date.class) {
                    return new C0547a(0);
                }
                return null;
            case 5:
                if (c0551a.f1518a == Time.class) {
                    return new C0547a(1);
                }
                return null;
            default:
                if (c0551a.f1518a != Timestamp.class) {
                    return null;
                }
                c0469d.getClass();
                return new C0547a(c0469d.m1225c(new C0551a(Date.class)));
        }
    }
}
