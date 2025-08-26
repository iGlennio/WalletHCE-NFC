package p043P0;

import android.text.Editable;
import p014F0.AbstractC0127D;

/* renamed from: P0.l */
/* loaded from: classes.dex */
public final class C0418l extends AbstractC0127D {

    /* renamed from: a */
    public final /* synthetic */ C0422p f1106a;

    public C0418l(C0422p c0422p) {
        this.f1106a = c0422p;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1106a.m1090b().mo1064a();
    }

    @Override // p014F0.AbstractC0127D, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f1106a.m1090b().mo1103b();
    }
}
