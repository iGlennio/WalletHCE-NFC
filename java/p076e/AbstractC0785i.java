package p076e;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: e.i */
/* loaded from: classes.dex */
public abstract class AbstractC0785i {
    /* renamed from: a */
    public static LocaleList m2104a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* renamed from: b */
    public static void m2105b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
