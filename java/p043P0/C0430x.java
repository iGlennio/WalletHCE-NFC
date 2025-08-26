package p043P0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.nfupay.s145.R;

/* renamed from: P0.x */
/* loaded from: classes.dex */
public final class C0430x extends AbstractC0423q {

    /* renamed from: e */
    public final int f1187e;

    /* renamed from: f */
    public EditText f1188f;

    /* renamed from: g */
    public final ViewOnClickListenerC0407a f1189g;

    public C0430x(C0422p c0422p, int i2) {
        super(c0422p);
        this.f1187e = R.drawable.design_password_eye;
        this.f1189g = new ViewOnClickListenerC0407a(2, this);
        if (i2 != 0) {
            this.f1187e = i2;
        }
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: b */
    public final void mo1103b() {
        m1105q();
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: c */
    public final int mo1065c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: d */
    public final int mo1066d() {
        return this.f1187e;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: f */
    public final View.OnClickListener mo1068f() {
        return this.f1189g;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: k */
    public final boolean mo1104k() {
        return true;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: l */
    public final boolean mo1080l() {
        EditText editText = this.f1188f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: m */
    public final void mo1070m(EditText editText) {
        this.f1188f = editText;
        m1105q();
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: r */
    public final void mo1072r() {
        EditText editText = this.f1188f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1188f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: s */
    public final void mo1073s() {
        EditText editText = this.f1188f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
