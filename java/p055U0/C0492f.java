package p055U0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;
import p051S0.C0472g;

/* renamed from: U0.f */
/* loaded from: classes.dex */
public final class C0492f implements InterfaceC0501o {

    /* renamed from: a */
    public final /* synthetic */ int f1341a;

    /* renamed from: b */
    public final /* synthetic */ Type f1342b;

    public /* synthetic */ C0492f(Type type, int i2) {
        this.f1341a = i2;
        this.f1342b = type;
    }

    @Override // p055U0.InterfaceC0501o
    /* renamed from: n */
    public final Object mo178n() {
        switch (this.f1341a) {
            case 0:
                Type type = this.f1342b;
                if (!(type instanceof ParameterizedType)) {
                    throw new C0472g("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C0472g("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.f1342b;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new C0472g("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new C0472g("Invalid EnumMap type: " + type3.toString());
        }
    }
}
