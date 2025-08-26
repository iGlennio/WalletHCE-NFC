package p057V0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p005C.AbstractC0044g;
import p010D1.AbstractC0096d;
import p051S0.C0475j;
import p061X0.AbstractC0545c;
import p068a1.C0558a;

/* renamed from: V0.l */
/* loaded from: classes.dex */
public final class C0524l extends AbstractC0522j {

    /* renamed from: e */
    public static final HashMap f1434e;

    /* renamed from: b */
    public final Constructor f1435b;

    /* renamed from: c */
    public final Object[] f1436c;

    /* renamed from: d */
    public final HashMap f1437d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f1434e = hashMap;
    }

    public C0524l(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f1437d = new HashMap();
        AbstractC0096d abstractC0096d = AbstractC0545c.f1501a;
        Constructor mo378u = abstractC0096d.mo378u(cls);
        this.f1435b = mo378u;
        AbstractC0545c.m1300e(mo378u);
        String[] mo359G = abstractC0096d.mo359G(cls);
        for (int i2 = 0; i2 < mo359G.length; i2++) {
            this.f1437d.put(mo359G[i2], Integer.valueOf(i2));
        }
        Class<?>[] parameterTypes = this.f1435b.getParameterTypes();
        this.f1436c = new Object[parameterTypes.length];
        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
            this.f1436c[i3] = f1434e.get(parameterTypes[i3]);
        }
    }

    @Override // p057V0.AbstractC0522j
    /* renamed from: c */
    public final Object mo1285c() {
        return (Object[]) this.f1436c.clone();
    }

    @Override // p057V0.AbstractC0522j
    /* renamed from: d */
    public final Object mo1286d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f1435b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            AbstractC0096d abstractC0096d = AbstractC0545c.f1501a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0545c.m1297b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0545c.m1297b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0545c.m1297b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
        }
    }

    @Override // p057V0.AbstractC0522j
    /* renamed from: e */
    public final void mo1287e(Object obj, C0558a c0558a, C0521i c0521i) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f1437d;
        String str = c0521i.f1422c;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC0545c.m1297b(this.f1435b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int intValue = num.intValue();
        Object mo1221a = c0521i.f1427h.mo1221a(c0558a);
        if (mo1221a != null || !c0521i.f1430k) {
            objArr[intValue] = mo1221a;
        } else {
            StringBuilder m156h = AbstractC0044g.m156h("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            m156h.append(c0558a.m1318n(false));
            throw new C0475j(m156h.toString());
        }
    }
}
