package p088j;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: j.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC0994g0 {
    /* renamed from: a */
    public static StaticLayout m2467a(CharSequence charSequence, Layout.Alignment alignment, int i2, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i2, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    /* renamed from: b */
    public static int m2468b(TextView textView) {
        return textView.getMaxLines();
    }
}
