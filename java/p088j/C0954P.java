package p088j;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.nfupay.s145.R;
import p019H0.ViewTreeObserverOnGlobalLayoutListenerC0199e;
import p043P0.C0427u;

/* renamed from: j.P */
/* loaded from: classes.dex */
public final class C0954P extends C0943J0 implements InterfaceC0959S {

    /* renamed from: C */
    public CharSequence f3836C;

    /* renamed from: D */
    public C0950N f3837D;

    /* renamed from: E */
    public final Rect f3838E;

    /* renamed from: F */
    public int f3839F;

    /* renamed from: G */
    public final /* synthetic */ C0961T f3840G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0954P(C0961T c0961t, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f3840G = c0961t;
        this.f3838E = new Rect();
        this.f3812o = c0961t;
        this.f3822y = true;
        this.f3823z.setFocusable(true);
        this.f3813p = new C0427u(1, this);
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: a */
    public final CharSequence mo2411a() {
        return this.f3836C;
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: e */
    public final void mo2415e(int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        C0926B c0926b = this.f3823z;
        boolean isShowing = c0926b.isShowing();
        m2424s();
        this.f3823z.setInputMethodMode(2);
        mo2310i();
        C1045x0 c1045x0 = this.f3800c;
        c1045x0.setChoiceMode(1);
        AbstractC0944K.m2407d(c1045x0, i2);
        AbstractC0944K.m2406c(c1045x0, i3);
        C0961T c0961t = this.f3840G;
        int selectedItemPosition = c0961t.getSelectedItemPosition();
        C1045x0 c1045x02 = this.f3800c;
        if (c0926b.isShowing() && c1045x02 != null) {
            c1045x02.setListSelectionHidden(false);
            c1045x02.setSelection(selectedItemPosition);
            if (c1045x02.getChoiceMode() != 0) {
                c1045x02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0961t.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0199e viewTreeObserverOnGlobalLayoutListenerC0199e = new ViewTreeObserverOnGlobalLayoutListenerC0199e(4, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0199e);
        this.f3823z.setOnDismissListener(new C0952O(this, viewTreeObserverOnGlobalLayoutListenerC0199e));
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: h */
    public final void mo2416h(CharSequence charSequence) {
        this.f3836C = charSequence;
    }

    @Override // p088j.C0943J0, p088j.InterfaceC0959S
    /* renamed from: o */
    public final void mo2401o(ListAdapter listAdapter) {
        super.mo2401o(listAdapter);
        this.f3837D = (C0950N) listAdapter;
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: p */
    public final void mo2421p(int i2) {
        this.f3839F = i2;
    }

    /* renamed from: s */
    public final void m2424s() {
        int i2;
        C0926B c0926b = this.f3823z;
        Drawable background = c0926b.getBackground();
        C0961T c0961t = this.f3840G;
        if (background != null) {
            background.getPadding(c0961t.f3860h);
            boolean m2376a = AbstractC0925A1.m2376a(c0961t);
            Rect rect = c0961t.f3860h;
            i2 = m2376a ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0961t.f3860h;
            rect2.right = 0;
            rect2.left = 0;
            i2 = 0;
        }
        int paddingLeft = c0961t.getPaddingLeft();
        int paddingRight = c0961t.getPaddingRight();
        int width = c0961t.getWidth();
        int i3 = c0961t.f3859g;
        if (i3 == -2) {
            int m2432a = c0961t.m2432a(this.f3837D, c0926b.getBackground());
            int i4 = c0961t.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0961t.f3860h;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (m2432a > i5) {
                m2432a = i5;
            }
            m2403r(Math.max(m2432a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            m2403r((width - paddingLeft) - paddingRight);
        } else {
            m2403r(i3);
        }
        this.f3803f = AbstractC0925A1.m2376a(c0961t) ? (((width - paddingRight) - this.f3802e) - this.f3839F) + i2 : paddingLeft + this.f3839F + i2;
    }
}
