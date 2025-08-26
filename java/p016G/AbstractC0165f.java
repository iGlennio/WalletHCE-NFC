package p016G;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: G.f */
/* loaded from: classes.dex */
public abstract class AbstractC0165f {
    /* renamed from: a */
    public static LocaleList m499a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* renamed from: b */
    public static LocaleList m500b() {
        return LocaleList.getAdjustedDefault();
    }

    /* renamed from: c */
    public static LocaleList m501c() {
        return LocaleList.getDefault();
    }
}
