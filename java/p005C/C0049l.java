package p005C;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p018H.C0191k;
import p101o.C1161k;

/* renamed from: C.l */
/* loaded from: classes.dex */
public final class C0049l extends AbstractC0096d {

    /* renamed from: n */
    public static final Class f124n;

    /* renamed from: o */
    public static final Constructor f125o;

    /* renamed from: p */
    public static final Method f126p;

    /* renamed from: q */
    public static final Method f127q;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f125o = constructor;
        f124n = cls;
        f126p = method;
        f127q = method2;
    }

    /* renamed from: o0 */
    public static boolean m195o0(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f126p.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p0 */
    public static Typeface m196p0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f124n, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f127q.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[SYNTHETIC] */
    @Override // p010D1.AbstractC0096d
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface mo193n(android.content.Context r17, p002B.C0016f r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            r0 = 0
            java.lang.reflect.Constructor r2 = p005C.C0049l.f125o     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            goto L68
        Lf:
            r3 = r18
            B.g[] r3 = r3.f35a
            int r4 = r3.length
            r5 = r0
        L15:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f41f
            java.io.File r7 = p010D1.AbstractC0104l.m418z(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L59
        L25:
            r8 = r19
            boolean r0 = p010D1.AbstractC0104l.m406m(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            goto L68
        L5c:
            int r7 = r6.f37b
            boolean r9 = r6.f38c
            int r6 = r6.f40e
            boolean r0 = m195o0(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
        L68:
            return r1
        L69:
            int r5 = r5 + 1
            goto L15
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = m196p0(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005C.C0049l.mo193n(android.content.Context, B.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: o */
    public final Typeface mo194o(Context context, C0191k[] c0191kArr, int i2) {
        Object obj;
        int i3 = 0;
        try {
            obj = f125o.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C1161k c1161k = new C1161k();
            int length = c0191kArr.length;
            while (true) {
                if (i3 >= length) {
                    Typeface m196p0 = m196p0(obj);
                    if (m196p0 != null) {
                        return Typeface.create(m196p0, i2);
                    }
                } else {
                    C0191k c0191k = c0191kArr[i3];
                    Uri uri = c0191k.f556a;
                    ByteBuffer byteBuffer = (ByteBuffer) c1161k.getOrDefault(uri, null);
                    if (byteBuffer == null) {
                        byteBuffer = AbstractC0104l.m392G(context, uri);
                        c1161k.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!m195o0(obj, byteBuffer, c0191k.f557b, c0191k.f558c, c0191k.f559d)) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return null;
    }
}
