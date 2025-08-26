package p045Q;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: Q.p */
/* loaded from: classes.dex */
public abstract class AbstractC0449p {
    /* renamed from: b */
    public static String[] m1158b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: c */
    public static PrecomputedText.Params m1159c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* renamed from: d */
    public static void m1160d(TextView textView, int i2) {
        textView.setFirstBaselineToTopHeight(i2);
    }

    /* renamed from: a */
    public static CharSequence m1157a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
