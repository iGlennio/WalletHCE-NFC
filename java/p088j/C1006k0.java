package p088j;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* renamed from: j.k0 */
/* loaded from: classes.dex */
public final class C1006k0 extends C1003j0 {
    @Override // p088j.C1003j0, p088j.AbstractC1009l0
    /* renamed from: a */
    public void mo2480a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // p088j.AbstractC1009l0
    /* renamed from: b */
    public boolean mo2490b(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
