package p094l0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p101o.C1152b;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1131a {

    /* renamed from: a */
    public final C1152b f4324a;

    /* renamed from: b */
    public final C1152b f4325b;

    /* renamed from: c */
    public final C1152b f4326c;

    public AbstractC1131a(C1152b c1152b, C1152b c1152b2, C1152b c1152b3) {
        this.f4324a = c1152b;
        this.f4325b = c1152b2;
        this.f4326c = c1152b3;
    }

    /* renamed from: a */
    public abstract C1132b mo2623a();

    /* renamed from: b */
    public final Class m2624b(Class cls) {
        String name = cls.getName();
        C1152b c1152b = this.f4326c;
        Class cls2 = (Class) c1152b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1152b.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final Method m2625c(String str) {
        C1152b c1152b = this.f4324a;
        Method method = (Method) c1152b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1131a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1131a.class);
        c1152b.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: d */
    public final Method m2626d(Class cls) {
        String name = cls.getName();
        C1152b c1152b = this.f4325b;
        Method method = (Method) c1152b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class m2624b = m2624b(cls);
        System.currentTimeMillis();
        Method declaredMethod = m2624b.getDeclaredMethod("write", cls, AbstractC1131a.class);
        c1152b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo2627e(int i2);

    /* renamed from: f */
    public final Parcelable m2628f(Parcelable parcelable, int i2) {
        if (!mo2627e(i2)) {
            return parcelable;
        }
        return ((C1132b) this).f4328e.readParcelable(C1132b.class.getClassLoader());
    }

    /* renamed from: g */
    public final InterfaceC1133c m2629g() {
        String readString = ((C1132b) this).f4328e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC1133c) m2625c(readString).invoke(null, mo2623a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    /* renamed from: h */
    public abstract void mo2630h(int i2);

    /* renamed from: i */
    public final void m2631i(InterfaceC1133c interfaceC1133c) {
        if (interfaceC1133c == null) {
            ((C1132b) this).f4328e.writeString(null);
            return;
        }
        try {
            ((C1132b) this).f4328e.writeString(m2624b(interfaceC1133c.getClass()).getName());
            C1132b mo2623a = mo2623a();
            try {
                m2626d(interfaceC1133c.getClass()).invoke(null, interfaceC1133c, mo2623a);
                int i2 = mo2623a.f4332i;
                if (i2 >= 0) {
                    int i3 = mo2623a.f4327d.get(i2);
                    Parcel parcel = mo2623a.f4328e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(dataPosition - i3);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(interfaceC1133c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
