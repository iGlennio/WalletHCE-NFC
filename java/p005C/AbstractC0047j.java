package p005C;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p010D1.AbstractC0096d;
import p101o.C1156f;

/* renamed from: C.j */
/* loaded from: classes.dex */
public abstract class AbstractC0047j {

    /* renamed from: a */
    public static final AbstractC0096d f117a;

    /* renamed from: b */
    public static final C1156f f118b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f117a = new C0052o();
        } else if (i2 >= 28) {
            f117a = new C0051n();
        } else if (i2 >= 26) {
            f117a = new C0050m();
        } else {
            Method method = C0049l.f126p;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f117a = new C0049l();
            } else {
                f117a = new C0048k();
            }
        }
        f118b = new C1156f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.equals(r2) == false) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m189a(android.content.Context r12, p002B.InterfaceC0015e r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, p002B.AbstractC0012b r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p005C.AbstractC0047j.m189a(android.content.Context, B.e, android.content.res.Resources, int, java.lang.String, int, int, B.b, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m190b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
