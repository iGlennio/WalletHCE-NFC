package p043P0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;

/* renamed from: P0.z */
/* loaded from: classes.dex */
public final class C0432z implements TextWatcher {

    /* renamed from: a */
    public int f1200a;

    /* renamed from: b */
    public final /* synthetic */ EditText f1201b;

    /* renamed from: c */
    public final /* synthetic */ TextInputLayout f1202c;

    public C0432z(TextInputLayout textInputLayout, EditText editText) {
        this.f1202c = textInputLayout;
        this.f1201b = editText;
        this.f1200a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f1202c;
        textInputLayout.m1998u(!textInputLayout.f2793A0, false);
        if (textInputLayout.f2837k) {
            textInputLayout.m1991n(editable);
        }
        if (textInputLayout.f2853s) {
            textInputLayout.m1999v(editable);
        }
        EditText editText = this.f1201b;
        int lineCount = editText.getLineCount();
        int i2 = this.f1200a;
        if (lineCount != i2) {
            if (lineCount < i2) {
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                int minimumHeight = editText.getMinimumHeight();
                int i3 = textInputLayout.f2856t0;
                if (minimumHeight != i3) {
                    editText.setMinimumHeight(i3);
                }
            }
            this.f1200a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
