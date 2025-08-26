package p016G;

import java.util.Locale;
import p021I.AbstractC0208c;

/* renamed from: G.e */
/* loaded from: classes.dex */
public abstract class AbstractC0164e {

    /* renamed from: a */
    public static final Locale[] f496a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* renamed from: a */
    public static Locale m497a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: b */
    public static boolean m498b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f496a;
            for (Locale locale3 : localeArr) {
                if (locale3.equals(locale)) {
                    return false;
                }
            }
            for (Locale locale4 : localeArr) {
                if (locale4.equals(locale2)) {
                    return false;
                }
            }
            String m586c = AbstractC0208c.m586c(AbstractC0208c.m584a(AbstractC0208c.m585b(locale)));
            if (!m586c.isEmpty()) {
                return m586c.equals(AbstractC0208c.m586c(AbstractC0208c.m584a(AbstractC0208c.m585b(locale2))));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
        }
        return false;
    }
}
