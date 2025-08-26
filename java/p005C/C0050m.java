package p005C;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p002B.C0016f;
import p002B.C0017g;
import p010D1.AbstractC0104l;
import p018H.C0191k;

/* renamed from: C.m */
/* loaded from: classes.dex */
public class C0050m extends C0048k {

    /* renamed from: s */
    public final Class f128s;

    /* renamed from: t */
    public final Constructor f129t;

    /* renamed from: u */
    public final Method f130u;

    /* renamed from: v */
    public final Method f131v;

    /* renamed from: w */
    public final Method f132w;

    /* renamed from: x */
    public final Method f133x;

    /* renamed from: y */
    public final Method f134y;

    public C0050m() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = m197v0(cls);
            Class cls2 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = mo204w0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f128s = cls;
        this.f129t = constructor;
        this.f130u = method2;
        this.f131v = method3;
        this.f132w = method4;
        this.f133x = method;
        this.f134y = method5;
    }

    /* renamed from: v0 */
    public static Method m197v0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // p005C.C0048k, p010D1.AbstractC0096d
    /* renamed from: n */
    public final Typeface mo193n(Context context, C0016f c0016f, Resources resources, int i2) {
        Method method = this.f130u;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo193n(context, c0016f, resources, i2);
        }
        Object m203u0 = m203u0();
        if (m203u0 != null) {
            C0017g[] c0017gArr = c0016f.f35a;
            int length = c0017gArr.length;
            int i3 = 0;
            while (i3 < length) {
                C0017g c0017g = c0017gArr[i3];
                String str = c0017g.f36a;
                FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0017g.f39d);
                Context context2 = context;
                if (!m200r0(context2, m203u0, str, c0017g.f40e, c0017g.f37b, c0017g.f38c ? 1 : 0, fromFontVariationSettings)) {
                    m199q0(m203u0);
                    return null;
                }
                i3++;
                context = context2;
            }
            if (m202t0(m203u0)) {
                return mo201s0(m203u0);
            }
        }
        return null;
    }

    @Override // p005C.C0048k, p010D1.AbstractC0096d
    /* renamed from: o */
    public final Typeface mo194o(Context context, C0191k[] c0191kArr, int i2) {
        Typeface mo201s0;
        boolean z2;
        if (c0191kArr.length >= 1) {
            Method method = this.f130u;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (C0191k c0191k : c0191kArr) {
                    if (c0191k.f560e == 0) {
                        Uri uri = c0191k.f556a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, AbstractC0104l.m392G(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object m203u0 = m203u0();
                if (m203u0 != null) {
                    int length = c0191kArr.length;
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < length) {
                        C0191k c0191k2 = c0191kArr[i3];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0191k2.f556a);
                        if (byteBuffer != null) {
                            try {
                                z2 = ((Boolean) this.f131v.invoke(m203u0, byteBuffer, Integer.valueOf(c0191k2.f557b), null, Integer.valueOf(c0191k2.f558c), Integer.valueOf(c0191k2.f559d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z2 = false;
                            }
                            if (!z2) {
                                m199q0(m203u0);
                                return null;
                            }
                            z3 = true;
                        }
                        i3++;
                        z3 = z3;
                    }
                    if (!z3) {
                        m199q0(m203u0);
                        return null;
                    }
                    if (m202t0(m203u0) && (mo201s0 = mo201s0(m203u0)) != null) {
                        return Typeface.create(mo201s0, i2);
                    }
                }
            } else {
                C0191k mo208r = mo208r(i2, c0191kArr);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo208r.f556a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo208r.f558c).setItalic(mo208r.f559d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: q */
    public final Typeface mo198q(Context context, Resources resources, int i2, String str, int i3) {
        Method method = this.f130u;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo198q(context, resources, i2, str, i3);
        }
        Object m203u0 = m203u0();
        if (m203u0 != null) {
            if (!m200r0(context, m203u0, str, 0, -1, -1, null)) {
                m199q0(m203u0);
                return null;
            }
            if (m202t0(m203u0)) {
                return mo201s0(m203u0);
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public final void m199q0(Object obj) {
        try {
            this.f133x.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: r0 */
    public final boolean m200r0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f130u.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s0 */
    public Typeface mo201s0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f128s, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f134y.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: t0 */
    public final boolean m202t0(Object obj) {
        try {
            return ((Boolean) this.f132w.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: u0 */
    public final Object m203u0() {
        try {
            return this.f129t.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: w0 */
    public Method mo204w0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
