package p043P0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p027K.C0284b;
import p030L.C0342i;
import p088j.C0991f0;

/* renamed from: P0.C */
/* loaded from: classes.dex */
public final class C0404C extends C0284b {

    /* renamed from: d */
    public final TextInputLayout f1066d;

    public C0404C(TextInputLayout textInputLayout) {
        this.f1066d = textInputLayout;
    }

    @Override // p027K.C0284b
    /* renamed from: d */
    public final void mo459d(View view, C0342i c0342i) {
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0342i.f893a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1066d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f2858u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        C0431y c0431y = textInputLayout.f2819b;
        C0991f0 c0991f0 = c0431y.f1191b;
        if (c0991f0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0991f0);
            accessibilityNodeInfo.setTraversalAfter(c0991f0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c0431y.f1193d);
        }
        if (!isEmpty) {
            c0342i.m999l(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            c0342i.m999l(charSequence);
            if (!z2 && placeholderText != null) {
                c0342i.m999l(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c0342i.m999l(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                c0342i.m998k(charSequence);
            } else {
                if (!isEmpty) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                c0342i.m999l(charSequence);
            }
            if (i2 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                c0342i.m995h(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0991f0 c0991f02 = textInputLayout.f2835j.f1172y;
        if (c0991f02 != null) {
            accessibilityNodeInfo.setLabelFor(c0991f02);
        }
        textInputLayout.f2821c.m1090b().mo1081n(c0342i);
    }

    @Override // p027K.C0284b
    /* renamed from: e */
    public final void mo848e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo848e(view, accessibilityEvent);
        this.f1066d.f2821c.m1090b().mo1082o(accessibilityEvent);
    }
}
