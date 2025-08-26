package p057V0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p034M0.C0360e;
import p051S0.AbstractC0477l;
import p051S0.C0467b;
import p051S0.C0469d;
import p051S0.InterfaceC0478m;
import p053T0.InterfaceC0484a;
import p055U0.AbstractC0490d;
import p055U0.InterfaceC0501o;
import p065Z0.C0551a;

/* renamed from: V0.c */
/* loaded from: classes.dex */
public final class C0515c implements InterfaceC0478m {

    /* renamed from: a */
    public final /* synthetic */ int f1406a;

    /* renamed from: b */
    public final C0360e f1407b;

    public /* synthetic */ C0515c(C0360e c0360e, int i2) {
        this.f1406a = i2;
        this.f1407b = c0360e;
    }

    /* renamed from: b */
    public static AbstractC0477l m1280b(C0360e c0360e, C0469d c0469d, C0551a c0551a, InterfaceC0484a interfaceC0484a) {
        AbstractC0477l mo1231a;
        Object mo178n = c0360e.m1015h(new C0551a(interfaceC0484a.value())).mo178n();
        boolean nullSafe = interfaceC0484a.nullSafe();
        if (mo178n instanceof AbstractC0477l) {
            mo1231a = (AbstractC0477l) mo178n;
        } else {
            if (!(mo178n instanceof InterfaceC0478m)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo178n.getClass().getName() + " as a @JsonAdapter for " + AbstractC0490d.m1268i(c0551a.f1519b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            mo1231a = ((InterfaceC0478m) mo178n).mo1231a(c0469d, c0551a);
        }
        return (mo1231a == null || !nullSafe) ? mo1231a : new C0467b(mo1231a, 2);
    }

    @Override // p051S0.InterfaceC0478m
    /* renamed from: a */
    public final AbstractC0477l mo1231a(C0469d c0469d, C0551a c0551a) {
        Class cls;
        Type[] actualTypeArguments;
        cls = Object.class;
        C0360e c0360e = this.f1407b;
        switch (this.f1406a) {
            case 0:
                Class cls2 = c0551a.f1518a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = c0551a.f1519b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC0490d.m1261b(Collection.class.isAssignableFrom(cls2));
                Type m1267h = AbstractC0490d.m1267h(type, cls2, AbstractC0490d.m1265f(type, cls2, Collection.class), new HashMap());
                cls = m1267h instanceof ParameterizedType ? ((ParameterizedType) m1267h).getActualTypeArguments()[0] : Object.class;
                return new C0514b(c0469d, cls, c0469d.m1225c(new C0551a(cls)), c0360e.m1015h(c0551a));
            case 1:
                InterfaceC0484a interfaceC0484a = (InterfaceC0484a) c0551a.f1518a.getAnnotation(InterfaceC0484a.class);
                if (interfaceC0484a == null) {
                    return null;
                }
                return m1280b(c0360e, c0469d, c0551a, interfaceC0484a);
            default:
                Class cls3 = c0551a.f1518a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                Type type2 = c0551a.f1519b;
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC0490d.m1261b(Map.class.isAssignableFrom(cls3));
                    Type m1267h2 = AbstractC0490d.m1267h(type2, cls3, AbstractC0490d.m1265f(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = m1267h2 instanceof ParameterizedType ? ((ParameterizedType) m1267h2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                AbstractC0477l m1225c = (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC0529q.f1452c : c0469d.m1225c(new C0551a(type3));
                AbstractC0477l m1225c2 = c0469d.m1225c(new C0551a(actualTypeArguments[1]));
                InterfaceC0501o m1015h = c0360e.m1015h(c0551a);
                Type[] typeArr = actualTypeArguments;
                return new C0517e(this, c0469d, typeArr[0], m1225c, typeArr[1], m1225c2, m1015h);
        }
    }
}
