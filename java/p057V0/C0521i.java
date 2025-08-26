package p057V0;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p005C.AbstractC0044g;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p051S0.C0472g;
import p061X0.AbstractC0545c;
import p065Z0.C0551a;
import p068a1.C0559b;

/* renamed from: V0.i */
/* loaded from: classes.dex */
public final class C0521i {

    /* renamed from: a */
    public final String f1420a;

    /* renamed from: b */
    public final Field f1421b;

    /* renamed from: c */
    public final String f1422c;

    /* renamed from: d */
    public final boolean f1423d;

    /* renamed from: e */
    public final boolean f1424e;

    /* renamed from: f */
    public final /* synthetic */ Method f1425f;

    /* renamed from: g */
    public final /* synthetic */ boolean f1426g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC0477l f1427h;

    /* renamed from: i */
    public final /* synthetic */ C0469d f1428i;

    /* renamed from: j */
    public final /* synthetic */ C0551a f1429j;

    /* renamed from: k */
    public final /* synthetic */ boolean f1430k;

    /* renamed from: l */
    public final /* synthetic */ boolean f1431l;

    public C0521i(String str, Field field, boolean z2, boolean z3, Method method, boolean z4, AbstractC0477l abstractC0477l, C0469d c0469d, C0551a c0551a, boolean z5, boolean z6) {
        this.f1425f = method;
        this.f1426g = z4;
        this.f1427h = abstractC0477l;
        this.f1428i = c0469d;
        this.f1429j = c0551a;
        this.f1430k = z5;
        this.f1431l = z6;
        this.f1420a = str;
        this.f1421b = field;
        this.f1422c = field.getName();
        this.f1423d = z2;
        this.f1424e = z3;
    }

    /* renamed from: a */
    public final void m1284a(C0559b c0559b, Object obj) {
        Object obj2;
        if (this.f1423d) {
            Field field = this.f1421b;
            Method method = this.f1425f;
            if (method != null) {
                try {
                    obj2 = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e2) {
                    throw new C0472g(AbstractC0044g.m155g("Accessor ", AbstractC0545c.m1299d(method, false), " threw exception"), e2.getCause());
                }
            } else {
                obj2 = field.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            c0559b.m1337m(this.f1420a);
            boolean z2 = this.f1426g;
            AbstractC0477l abstractC0477l = this.f1427h;
            if (!z2) {
                abstractC0477l = new C0525m(this.f1428i, abstractC0477l, this.f1429j.f1519b);
            }
            abstractC0477l.mo1222b(c0559b, obj2);
        }
    }
}
