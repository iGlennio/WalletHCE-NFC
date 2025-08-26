package p088j;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.nfupay.s145.R;

/* renamed from: j.E */
/* loaded from: classes.dex */
public final class C0932E extends RatingBar {

    /* renamed from: a */
    public final C0928C f3782a;

    public C0932E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC0998h1.m2474a(this, getContext());
        C0928C c0928c = new C0928C(this);
        this.f3782a = c0928c;
        c0928c.mo2378b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = (Bitmap) this.f3782a.f3760c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
