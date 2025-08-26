package p088j;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: j.Y */
/* loaded from: classes.dex */
public abstract class AbstractC0971Y {
    /* renamed from: a */
    public static LocaleList m2438a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* renamed from: b */
    public static void m2439b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
