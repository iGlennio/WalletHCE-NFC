package p002B;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: B.q */
/* loaded from: classes.dex */
public abstract class AbstractC0027q {

    /* renamed from: a */
    public static final ThreadLocal f60a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f61b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f62c = new Object();

    /* renamed from: a */
    public static Typeface m89a(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return m90b(context, i2, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m90b(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, p002B.AbstractC0012b r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p002B.AbstractC0027q.m90b(android.content.Context, int, android.util.TypedValue, int, B.b, boolean, boolean):android.graphics.Typeface");
    }
}
