package p005C;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: C.n */
/* loaded from: classes.dex */
public final class C0051n extends C0050m {
    @Override // p005C.C0050m
    /* renamed from: s0 */
    public final Typeface mo201s0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f128s, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f134y.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p005C.C0050m
    /* renamed from: w0 */
    public final Method mo204w0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
