package p060X;

import android.text.Editable;
import androidx.emoji2.text.C0607u;

/* renamed from: X.a */
/* loaded from: classes.dex */
public final class C0533a extends Editable.Factory {

    /* renamed from: a */
    public static final Object f1477a = new Object();

    /* renamed from: b */
    public static volatile C0533a f1478b;

    /* renamed from: c */
    public static Class f1479c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1479c;
        return cls != null ? new C0607u(cls, charSequence) : super.newEditable(charSequence);
    }
}
