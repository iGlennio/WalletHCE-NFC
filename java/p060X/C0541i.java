package p060X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0596j;

/* renamed from: X.i */
/* loaded from: classes.dex */
public final class C0541i implements TextWatcher {

    /* renamed from: a */
    public final EditText f1493a;

    /* renamed from: b */
    public C0540h f1494b;

    /* renamed from: c */
    public boolean f1495c = true;

    public C0541i(EditText editText) {
        this.f1493a = editText;
    }

    /* renamed from: a */
    public static void m1295a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0596j m1525a = C0596j.m1525a();
            if (editableText == null) {
                length = 0;
            } else {
                m1525a.getClass();
                length = editableText.length();
            }
            m1525a.m1529e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        EditText editText = this.f1493a;
        if (editText.isInEditMode() || !this.f1495c || C0596j.f1974j == null || i3 > i4 || !(charSequence instanceof Spannable)) {
            return;
        }
        int m1526b = C0596j.m1525a().m1526b();
        if (m1526b != 0) {
            if (m1526b == 1) {
                C0596j.m1525a().m1529e((Spannable) charSequence, i2, i4 + i2);
                return;
            } else if (m1526b != 3) {
                return;
            }
        }
        C0596j m1525a = C0596j.m1525a();
        if (this.f1494b == null) {
            this.f1494b = new C0540h(editText);
        }
        m1525a.m1530f(this.f1494b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
