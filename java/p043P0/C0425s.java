package p043P0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: P0.s */
/* loaded from: classes.dex */
public final class C0425s extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ C0426t f1145a;

    public C0425s(C0426t c0426t) {
        this.f1145a = c0426t;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f1145a.f1155h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
