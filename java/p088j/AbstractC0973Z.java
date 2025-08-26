package p088j;

import android.widget.TextView;

/* renamed from: j.Z */
/* loaded from: classes.dex */
public abstract class AbstractC0973Z {
    /* renamed from: a */
    public static int m2440a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: b */
    public static void m2441b(TextView textView, int i2, int i3, int i4, int i5) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    /* renamed from: c */
    public static void m2442c(TextView textView, int[] iArr, int i2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    /* renamed from: d */
    public static boolean m2443d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
