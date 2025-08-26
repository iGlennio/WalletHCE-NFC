package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p010D1.AbstractC0104l;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1199i;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public abstract class AbstractC0686u {

    /* renamed from: a */
    public static final HashMap f2331a = new HashMap();

    /* renamed from: b */
    public static final HashMap f2332b = new HashMap();

    /* renamed from: a */
    public static void m1707a(Constructor constructor, InterfaceC0682q interfaceC0682q) {
        try {
            AbstractC1136c.m2636d(constructor.newInstance(interfaceC0682q), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    public static int m1708b(Class cls) {
        Constructor<?> constructor;
        boolean z2;
        HashMap hashMap = f2331a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                AbstractC1136c.m2636d(name, "fullPackage");
                if (name.length() != 0) {
                    AbstractC1136c.m2636d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC1136c.m2636d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC1136c.m2636d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = AbstractC1199i.m2757C0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap hashMap2 = f2332b;
            if (constructor != null) {
                hashMap2.put(cls, AbstractC0104l.m391F(constructor));
            } else {
                C0668c c0668c = C0668c.f2309c;
                HashMap hashMap3 = c0668c.f2311b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            }
                            if (((InterfaceC0690y) declaredMethods[i3].getAnnotation(InterfaceC0690y.class)) != null) {
                                c0668c.m1696a(cls, declaredMethods);
                                z2 = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0682q.class.isAssignableFrom(superclass)) {
                        AbstractC1136c.m2636d(superclass, "superclass");
                        if (m1708b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            AbstractC1136c.m2634b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    AbstractC1136c.m2636d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            Class<?> cls2 = interfaces[i4];
                            if (cls2 != null && InterfaceC0682q.class.isAssignableFrom(cls2)) {
                                AbstractC1136c.m2636d(cls2, "intrface");
                                if (m1708b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                AbstractC1136c.m2634b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i4++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
