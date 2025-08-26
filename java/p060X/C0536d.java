package p060X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0596j;

/* renamed from: X.d */
/* loaded from: classes.dex */
public final class C0536d implements InputFilter {

    /* renamed from: a */
    public final TextView f1484a;

    /* renamed from: b */
    public C0535c f1485b;

    public C0536d(TextView textView) {
        this.f1484a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.f1484a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int m1526b = C0596j.m1525a().m1526b();
        if (m1526b != 0) {
            if (m1526b == 1) {
                if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return C0596j.m1525a().m1529e(charSequence, 0, charSequence.length());
            }
            if (m1526b != 3) {
                return charSequence;
            }
        }
        C0596j m1525a = C0596j.m1525a();
        if (this.f1485b == null) {
            this.f1485b = new C0535c(textView, this);
        }
        m1525a.m1530f(this.f1485b);
        return charSequence;
    }
}
