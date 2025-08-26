package p060X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0594h;
import androidx.emoji2.text.C0596j;
import java.lang.ref.WeakReference;

/* renamed from: X.c */
/* loaded from: classes.dex */
public final class C0535c extends AbstractC0594h {

    /* renamed from: a */
    public final WeakReference f1482a;

    /* renamed from: b */
    public final WeakReference f1483b;

    public C0535c(TextView textView, C0536d c0536d) {
        this.f1482a = new WeakReference(textView);
        this.f1483b = new WeakReference(c0536d);
    }

    @Override // androidx.emoji2.text.AbstractC0594h
    /* renamed from: a */
    public final void mo1293a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f1482a.get();
        InputFilter inputFilter = (InputFilter) this.f1483b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0596j m1525a = C0596j.m1525a();
                    if (text == null) {
                        length = 0;
                    } else {
                        m1525a.getClass();
                        length = text.length();
                    }
                    CharSequence m1529e = m1525a.m1529e(text, 0, length);
                    if (text == m1529e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(m1529e);
                    int selectionEnd = Selection.getSelectionEnd(m1529e);
                    textView.setText(m1529e);
                    if (m1529e instanceof Spannable) {
                        Spannable spannable = (Spannable) m1529e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
