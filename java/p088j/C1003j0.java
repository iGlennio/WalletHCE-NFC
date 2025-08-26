package p088j;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: j.j0 */
/* loaded from: classes.dex */
public class C1003j0 extends AbstractC1009l0 {
    @Override // p088j.AbstractC1009l0
    /* renamed from: a */
    public void mo2480a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C1012m0.m2493e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
