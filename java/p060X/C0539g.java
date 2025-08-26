package p060X;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.C0596j;
import p047Q1.AbstractC0458e;

/* renamed from: X.g */
/* loaded from: classes.dex */
public final class C0539g extends AbstractC0458e {

    /* renamed from: h */
    public final C0538f f1491h;

    public C0539g(TextView textView) {
        this.f1491h = new C0538f(textView);
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: B */
    public final InputFilter[] mo1209B(InputFilter[] inputFilterArr) {
        return !(C0596j.f1974j != null) ? inputFilterArr : this.f1491h.mo1209B(inputFilterArr);
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: U */
    public final void mo1214U(boolean z2) {
        if (C0596j.f1974j != null) {
            this.f1491h.mo1214U(z2);
        }
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: X */
    public final void mo1215X(boolean z2) {
        boolean z3 = C0596j.f1974j != null;
        C0538f c0538f = this.f1491h;
        if (z3) {
            c0538f.mo1215X(z2);
        } else {
            c0538f.f1490j = z2;
        }
    }
}
