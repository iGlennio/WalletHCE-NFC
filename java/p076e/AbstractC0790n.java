package p076e;

import android.content.res.Configuration;
import android.os.LocaleList;
import p016G.C0166g;

/* renamed from: e.n */
/* loaded from: classes.dex */
public abstract class AbstractC0790n {
    /* renamed from: a */
    public static void m2117a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* renamed from: b */
    public static C0166g m2118b(Configuration configuration) {
        return C0166g.m502a(configuration.getLocales().toLanguageTags());
    }

    /* renamed from: c */
    public static void m2119c(C0166g c0166g) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c0166g.f498a.f499a.toLanguageTags()));
    }

    /* renamed from: d */
    public static void m2120d(Configuration configuration, C0166g c0166g) {
        configuration.setLocales(LocaleList.forLanguageTags(c0166g.f498a.f499a.toLanguageTags()));
    }
}
