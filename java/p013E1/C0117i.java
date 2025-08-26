package p013E1;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: E1.i */
/* loaded from: classes.dex */
public final class C0117i {

    /* renamed from: a */
    public Method f335a;

    /* renamed from: b */
    public Method f336b;

    /* renamed from: c */
    public Method f337c;

    /* renamed from: a */
    public static void m445a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
