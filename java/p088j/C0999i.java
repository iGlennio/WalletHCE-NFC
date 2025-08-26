package p088j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.nfupay.s145.R;
import p008D.AbstractC0087a;
import p010D1.AbstractC0096d;
import p086i.C0897b;

/* renamed from: j.i */
/* loaded from: classes.dex */
public final class C0999i extends C1050z implements InterfaceC1008l {

    /* renamed from: d */
    public final /* synthetic */ C1005k f3954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0999i(C1005k c1005k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f3954d = c1005k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0096d.m344e0(this, getContentDescription());
        setOnTouchListener(new C0897b(this, this));
    }

    @Override // p088j.InterfaceC1008l
    /* renamed from: a */
    public final boolean mo1375a() {
        return false;
    }

    @Override // p088j.InterfaceC1008l
    /* renamed from: b */
    public final boolean mo1376b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3954d.m2489o();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0087a.m303f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
