package p005C;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p002B.C0016f;
import p002B.C0017g;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p018H.C0191k;

/* renamed from: C.k */
/* loaded from: classes.dex */
public class C0048k extends AbstractC0096d {

    /* renamed from: n */
    public static Class f119n = null;

    /* renamed from: o */
    public static Constructor f120o = null;

    /* renamed from: p */
    public static Method f121p = null;

    /* renamed from: q */
    public static Method f122q = null;

    /* renamed from: r */
    public static boolean f123r = false;

    /* renamed from: o0 */
    public static boolean m191o0(Object obj, String str, int i2, boolean z2) {
        m192p0();
        try {
            return ((Boolean) f121p.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: p0 */
    public static void m192p0() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f123r) {
            return;
        }
        f123r = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f120o = constructor;
        f119n = cls;
        f121p = method2;
        f122q = method;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: n */
    public Typeface mo193n(Context context, C0016f c0016f, Resources resources, int i2) {
        m192p0();
        try {
            Object newInstance = f120o.newInstance(new Object[0]);
            for (C0017g c0017g : c0016f.f35a) {
                File m418z = AbstractC0104l.m418z(context);
                if (m418z == null) {
                    return null;
                }
                try {
                    if (!AbstractC0104l.m406m(m418z, resources, c0017g.f41f)) {
                        return null;
                    }
                    if (!m191o0(newInstance, m418z.getPath(), c0017g.f37b, c0017g.f38c)) {
                        return null;
                    }
                    m418z.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    m418z.delete();
                }
            }
            m192p0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f119n, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f122q.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: o */
    public Typeface mo194o(Context context, C0191k[] c0191kArr, int i2) {
        File file;
        String readlink;
        if (c0191kArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo208r(i2, c0191kArr).f556a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } catch (ErrnoException unused) {
                        }
                        try {
                            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                                file = new File(readlink);
                                if (file != null && file.canRead()) {
                                    Typeface createFromFile = Typeface.createFromFile(file);
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                                Typeface mo207p = mo207p(context, fileInputStream);
                                fileInputStream.close();
                                openFileDescriptor.close();
                                return mo207p;
                            }
                            Typeface mo207p2 = mo207p(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return mo207p2;
                        } finally {
                        }
                        file = null;
                        if (file != null) {
                            Typeface createFromFile2 = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile2;
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    } finally {
                    }
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
