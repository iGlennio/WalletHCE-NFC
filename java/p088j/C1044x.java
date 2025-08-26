package p088j;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p005C.C0046i;
import p047Q1.AbstractC0458e;
import p073d.AbstractC0734a;

/* renamed from: j.x */
/* loaded from: classes.dex */
public final class C1044x {

    /* renamed from: a */
    public final TextView f4096a;

    /* renamed from: b */
    public final C0046i f4097b;

    public C1044x(TextView textView) {
        this.f4096a = textView;
        this.f4097b = new C0046i(textView);
    }

    /* renamed from: a */
    public final void m2542a(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f4096a.getContext().obtainStyledAttributes(attributeSet, AbstractC0734a.f2919i, i2, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            m2544c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m2543b(boolean z2) {
        ((AbstractC0458e) this.f4097b.f116b).mo1214U(z2);
    }

    /* renamed from: c */
    public final void m2544c(boolean z2) {
        ((AbstractC0458e) this.f4097b.f116b).mo1215X(z2);
    }
}
