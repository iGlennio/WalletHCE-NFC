package p088j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.nfupay.s145.R;
import p008D.AbstractC0087a;
import p008D.AbstractC0088b;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p073d.AbstractC0734a;

/* renamed from: j.H */
/* loaded from: classes.dex */
public final class C0938H extends C0928C {

    /* renamed from: e */
    public final C0936G f3786e;

    /* renamed from: f */
    public Drawable f3787f;

    /* renamed from: g */
    public ColorStateList f3788g;

    /* renamed from: h */
    public PorterDuff.Mode f3789h;

    /* renamed from: i */
    public boolean f3790i;

    /* renamed from: j */
    public boolean f3791j;

    public C0938H(C0936G c0936g) {
        super(c0936g);
        this.f3788g = null;
        this.f3789h = null;
        this.f3790i = false;
        this.f3791j = false;
        this.f3786e = c0936g;
    }

    @Override // p088j.C0928C
    /* renamed from: b */
    public final void mo2378b(AttributeSet attributeSet, int i2) {
        super.mo2378b(attributeSet, R.attr.seekBarStyle);
        C0936G c0936g = this.f3786e;
        Context context = c0936g.getContext();
        int[] iArr = AbstractC0734a.f2917g;
        C0176h m519B = C0176h.m519B(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC0272P.m822l(c0936g, c0936g.getContext(), iArr, attributeSet, (TypedArray) m519B.f516c, R.attr.seekBarStyle);
        Drawable m543r = m519B.m543r(0);
        if (m543r != null) {
            c0936g.setThumb(m543r);
        }
        Drawable m542q = m519B.m542q(1);
        Drawable drawable = this.f3787f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3787f = m542q;
        if (m542q != null) {
            m542q.setCallback(c0936g);
            AbstractC0088b.m308b(m542q, c0936g.getLayoutDirection());
            if (m542q.isStateful()) {
                m542q.setState(c0936g.getDrawableState());
            }
            m2392f();
        }
        c0936g.invalidate();
        TypedArray typedArray = (TypedArray) m519B.f516c;
        if (typedArray.hasValue(3)) {
            this.f3789h = AbstractC1027r0.m2516b(typedArray.getInt(3, -1), this.f3789h);
            this.f3791j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f3788g = m519B.m541p(2);
            this.f3790i = true;
        }
        m519B.m523E();
        m2392f();
    }

    /* renamed from: f */
    public final void m2392f() {
        Drawable drawable = this.f3787f;
        if (drawable != null) {
            if (this.f3790i || this.f3791j) {
                Drawable mutate = drawable.mutate();
                this.f3787f = mutate;
                if (this.f3790i) {
                    AbstractC0087a.m305h(mutate, this.f3788g);
                }
                if (this.f3791j) {
                    AbstractC0087a.m306i(this.f3787f, this.f3789h);
                }
                if (this.f3787f.isStateful()) {
                    this.f3787f.setState(this.f3786e.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public final void m2393g(Canvas canvas) {
        if (this.f3787f != null) {
            int max = this.f3786e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3787f.getIntrinsicWidth();
                int intrinsicHeight = this.f3787f.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3787f.setBounds(-i2, -i3, i2, i3);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f3787f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
