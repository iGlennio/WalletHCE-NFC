package p043P0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.C0711l;

/* renamed from: P0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0407a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f1069a;

    /* renamed from: b */
    public final /* synthetic */ Object f1070b;

    public /* synthetic */ ViewOnClickListenerC0407a(int i2, Object obj) {
        this.f1069a = i2;
        this.f1070b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1069a) {
            case 0:
                C0411e c0411e = (C0411e) this.f1070b;
                EditText editText = c0411e.f1081i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0411e.m1105q();
                return;
            case 1:
                ((C0417k) this.f1070b).m1084u();
                return;
            case 2:
                C0430x c0430x = (C0430x) this.f1070b;
                EditText editText2 = c0430x.f1188f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c0430x.f1188f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0430x.f1188f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0430x.f1188f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0430x.f1188f.setSelection(selectionEnd);
                }
                c0430x.m1105q();
                return;
            default:
                ((C0711l) this.f1070b).m1953B();
                throw null;
        }
    }
}
