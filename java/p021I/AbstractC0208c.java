package p021I;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: I.c */
/* loaded from: classes.dex */
public abstract class AbstractC0208c {
    /* renamed from: a */
    public static ULocale m584a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* renamed from: b */
    public static ULocale m585b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: c */
    public static String m586c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
