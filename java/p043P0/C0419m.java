package p043P0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: P0.m */
/* loaded from: classes.dex */
public final class C0419m {

    /* renamed from: a */
    public final /* synthetic */ C0422p f1107a;

    public C0419m(C0422p c0422p) {
        this.f1107a = c0422p;
    }

    /* renamed from: a */
    public final void m1085a(TextInputLayout textInputLayout) {
        C0422p c0422p = this.f1107a;
        if (c0422p.f1132s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0422p.f1132s;
        C0418l c0418l = c0422p.f1135v;
        if (editText != null) {
            editText.removeTextChangedListener(c0418l);
            if (c0422p.f1132s.getOnFocusChangeListener() == c0422p.m1090b().mo1067e()) {
                c0422p.f1132s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0422p.f1132s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0418l);
        }
        c0422p.m1090b().mo1070m(c0422p.f1132s);
        c0422p.m1098j(c0422p.m1090b());
    }
}
