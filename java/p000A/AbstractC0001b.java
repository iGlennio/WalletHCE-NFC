package p000A;

import android.content.Context;

/* renamed from: A.b */
/* loaded from: classes.dex */
public abstract class AbstractC0001b {
    /* renamed from: a */
    public static int m3a(Context context, int i2) {
        return context.getColor(i2);
    }

    /* renamed from: b */
    public static <T> T m4b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: c */
    public static String m5c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
