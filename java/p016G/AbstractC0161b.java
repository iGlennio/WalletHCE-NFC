package p016G;

import android.os.Build;
import java.util.Locale;
import p095l1.AbstractC1136c;

/* renamed from: G.b */
/* loaded from: classes.dex */
public abstract class AbstractC0161b {
    static {
        int i2 = Build.VERSION.SDK_INT;
        C0160a c0160a = C0160a.f492a;
        if (i2 >= 30) {
            c0160a.m494a(30);
        }
        if (i2 >= 30) {
            c0160a.m494a(31);
        }
        if (i2 >= 30) {
            c0160a.m494a(33);
        }
        if (i2 >= 30) {
            c0160a.m494a(1000000);
        }
    }

    /* renamed from: a */
    public static final boolean m495a() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return true;
        }
        if (i2 < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        AbstractC1136c.m2636d(str, "CODENAME");
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        AbstractC1136c.m2636d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = "Tiramisu".toUpperCase(locale);
        AbstractC1136c.m2636d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }
}
