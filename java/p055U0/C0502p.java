package p055U0;

import java.lang.reflect.Method;
import p034M0.C0360e;

/* renamed from: U0.p */
/* loaded from: classes.dex */
public final class C0502p extends AbstractC0506t {

    /* renamed from: b */
    public final /* synthetic */ Method f1379b;

    /* renamed from: c */
    public final /* synthetic */ Object f1380c;

    public C0502p(Method method, Object obj) {
        this.f1379b = method;
        this.f1380c = obj;
    }

    @Override // p055U0.AbstractC0506t
    /* renamed from: a */
    public final Object mo1279a(Class cls) {
        String m1007d = C0360e.m1007d(cls);
        if (m1007d != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m1007d));
        }
        return this.f1379b.invoke(this.f1380c, cls);
    }
}
