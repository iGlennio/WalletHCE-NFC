package p088j;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.nfupay.s145.R;

/* renamed from: j.G */
/* loaded from: classes.dex */
public final class C0936G extends SeekBar {

    /* renamed from: a */
    public final C0938H f3783a;

    public C0936G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC0998h1.m2474a(this, getContext());
        C0938H c0938h = new C0938H(this);
        this.f3783a = c0938h;
        c0938h.mo2378b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0938H c0938h = this.f3783a;
        Drawable drawable = c0938h.f3787f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0936G c0936g = c0938h.f3786e;
        if (drawable.setState(c0936g.getDrawableState())) {
            c0936g.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3783a.f3787f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3783a.m2393g(canvas);
    }
}
