package p010D1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p095l1.AbstractC1136c;

/* renamed from: D1.i */
/* loaded from: classes.dex */
public final class C0101i implements InvocationHandler {

    /* renamed from: a */
    public boolean f308a;

    /* renamed from: b */
    public String f309b;

    /* renamed from: c */
    public final ArrayList f310c;

    public C0101i(ArrayList arrayList) {
        this.f310c = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC1136c.m2637e(obj, "proxy");
        AbstractC1136c.m2637e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC1136c.m2633a(name, "supports") && AbstractC1136c.m2633a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC1136c.m2633a(name, "unsupported") && AbstractC1136c.m2633a(Void.TYPE, returnType)) {
            this.f308a = true;
            return null;
        }
        boolean m2633a = AbstractC1136c.m2633a(name, "protocols");
        ArrayList arrayList = this.f310c;
        if (m2633a && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC1136c.m2633a(name, "selectProtocol") || AbstractC1136c.m2633a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = list.get(i2);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i2 == size) {
                                break;
                            }
                            i2++;
                        } else {
                            this.f309b = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f309b = str2;
                return str2;
            }
        }
        if ((!AbstractC1136c.m2633a(name, "protocolSelected") && !AbstractC1136c.m2633a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f309b = (String) obj4;
        return null;
    }
}
