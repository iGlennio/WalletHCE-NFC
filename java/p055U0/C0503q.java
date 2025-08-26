package p055U0;

import java.lang.reflect.Method;
import p034M0.C0360e;

/* renamed from: U0.q */
/* loaded from: classes.dex */
public final class C0503q extends AbstractC0506t {

    /* renamed from: b */
    public final /* synthetic */ Method f1381b;

    /* renamed from: c */
    public final /* synthetic */ int f1382c;

    public C0503q(int i2, Method method) {
        this.f1381b = method;
        this.f1382c = i2;
    }

    @Override // p055U0.AbstractC0506t
    /* renamed from: a */
    public final Object mo1279a(Class cls) {
        String m1007d = C0360e.m1007d(cls);
        if (m1007d != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m1007d));
        }
        return this.f1381b.invoke(null, cls, Integer.valueOf(this.f1382c));
    }
}
