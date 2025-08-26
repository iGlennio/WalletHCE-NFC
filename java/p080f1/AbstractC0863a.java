package p080f1;

import java.lang.reflect.Method;
import p095l1.AbstractC1136c;

/* renamed from: f1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0863a {

    /* renamed from: a */
    public static final Method f3494a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC1136c.m2636d(methods, "throwableMethods");
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methods[i2];
            if (AbstractC1136c.m2633a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC1136c.m2636d(parameterTypes, "it.parameterTypes");
                if (AbstractC1136c.m2633a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i2++;
        }
        f3494a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !AbstractC1136c.m2633a(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
