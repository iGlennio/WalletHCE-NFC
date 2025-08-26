package p061X0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p010D1.AbstractC0096d;

/* renamed from: X0.b */
/* loaded from: classes.dex */
public final class C0544b extends AbstractC0096d {

    /* renamed from: n */
    public final Method f1497n = Class.class.getMethod("isRecord", new Class[0]);

    /* renamed from: o */
    public final Method f1498o;

    /* renamed from: p */
    public final Method f1499p;

    /* renamed from: q */
    public final Method f1500q;

    public C0544b() {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f1498o = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f1499p = componentType.getMethod("getName", new Class[0]);
        this.f1500q = componentType.getMethod("getType", new Class[0]);
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: G */
    public final String[] mo359G(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f1498o.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                strArr[i2] = (String) this.f1499p.invoke(objArr[i2], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: N */
    public final boolean mo363N(Class cls) {
        try {
            return ((Boolean) this.f1497n.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: t */
    public final Method mo377t(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: u */
    public final Constructor mo378u(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f1498o.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                clsArr[i2] = (Class) this.f1500q.invoke(objArr[i2], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }
}
