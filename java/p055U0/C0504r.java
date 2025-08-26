package p055U0;

import java.lang.reflect.Method;
import p034M0.C0360e;

/* renamed from: U0.r */
/* loaded from: classes.dex */
public final class C0504r extends AbstractC0506t {

    /* renamed from: b */
    public final /* synthetic */ Method f1383b;

    public C0504r(Method method) {
        this.f1383b = method;
    }

    @Override // p055U0.AbstractC0506t
    /* renamed from: a */
    public final Object mo1279a(Class cls) {
        String m1007d = C0360e.m1007d(cls);
        if (m1007d != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m1007d));
        }
        return this.f1383b.invoke(null, cls, Object.class);
    }
}
