package p060X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0596j;

/* renamed from: X.j */
/* loaded from: classes.dex */
public final class C0542j implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f1496a;

    public C0542j(TransformationMethod transformationMethod) {
        this.f1496a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1496a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0596j.m1525a().m1526b() != 1) {
            return charSequence;
        }
        C0596j m1525a = C0596j.m1525a();
        m1525a.getClass();
        return m1525a.m1529e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f1496a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i2, rect);
        }
    }
}
