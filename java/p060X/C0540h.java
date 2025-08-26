package p060X;

import android.widget.EditText;
import androidx.emoji2.text.AbstractC0594h;
import java.lang.ref.WeakReference;

/* renamed from: X.h */
/* loaded from: classes.dex */
public final class C0540h extends AbstractC0594h {

    /* renamed from: a */
    public final WeakReference f1492a;

    public C0540h(EditText editText) {
        this.f1492a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.AbstractC0594h
    /* renamed from: a */
    public final void mo1293a() {
        C0541i.m1295a((EditText) this.f1492a.get(), 1);
    }
}
