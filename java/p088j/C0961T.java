package p088j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p010D1.AbstractC0104l;
import p019H0.ViewTreeObserverOnGlobalLayoutListenerC0199e;

/* renamed from: j.T */
/* loaded from: classes.dex */
public final class C0961T extends Spinner {

    /* renamed from: i */
    public static final int[] f3852i = {R.attr.spinnerMode};

    /* renamed from: a */
    public final C1020p f3853a;

    /* renamed from: b */
    public final Context f3854b;

    /* renamed from: c */
    public final C0940I f3855c;

    /* renamed from: d */
    public SpinnerAdapter f3856d;

    /* renamed from: e */
    public final boolean f3857e;

    /* renamed from: f */
    public final InterfaceC0959S f3858f;

    /* renamed from: g */
    public int f3859g;

    /* renamed from: h */
    public final Rect f3860h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0961T(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130904025(0x7f0303d9, float:1.7414885E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f3860h = r1
            android.content.Context r1 = r12.getContext()
            p088j.AbstractC0998h1.m2474a(r12, r1)
            int[] r1 = p073d.AbstractC0734a.f2932v
            G0.h r2 = p017G0.C0176h.m519B(r13, r14, r1, r0)
            j.p r3 = new j.p
            r3.<init>(r12)
            r12.f3853a = r3
            java.lang.Object r3 = r2.f516c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            h.d r6 = new h.d
            r6.<init>(r13, r4)
            r12.f3854b = r6
            goto L37
        L35:
            r12.f3854b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = p088j.C0961T.f3852i     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            j.P r4 = new j.P
            android.content.Context r9 = r12.f3854b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f3854b
            G0.h r1 = p017G0.C0176h.m519B(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f516c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f3859g = r9
            android.graphics.drawable.Drawable r9 = r1.m542q(r8)
            r4.m2398k(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f3836C = r7
            r1.m523E()
            r12.f3858f = r4
            j.I r1 = new j.I
            r1.<init>(r12, r12, r4)
            r12.f3855c = r1
            goto Laa
        L9d:
            j.M r1 = new j.M
            r1.<init>(r12)
            r12.f3858f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f3826c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131427441(0x7f0b0071, float:1.8476498E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.m523E()
            r12.f3857e = r8
            android.widget.SpinnerAdapter r13 = r12.f3856d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f3856d = r6
        Lcf:
            j.p r13 = r12.f3853a
            r13.m2509d(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j.C0961T.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final int m2432a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.f3860h;
        drawable.getPadding(rect);
        return rect.left + rect.right + i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1020p c1020p = this.f3853a;
        if (c1020p != null) {
            c1020p.m2506a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0959S interfaceC0959S = this.f3858f;
        return interfaceC0959S != null ? interfaceC0959S.mo2414d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0959S interfaceC0959S = this.f3858f;
        return interfaceC0959S != null ? interfaceC0959S.mo2417j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3858f != null ? this.f3859g : super.getDropDownWidth();
    }

    public final InterfaceC0959S getInternalPopup() {
        return this.f3858f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0959S interfaceC0959S = this.f3858f;
        return interfaceC0959S != null ? interfaceC0959S.mo2420n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3854b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0959S interfaceC0959S = this.f3858f;
        return interfaceC0959S != null ? interfaceC0959S.mo2411a() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1020p c1020p = this.f3853a;
        if (c1020p != null) {
            return c1020p.m2507b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1020p c1020p = this.f3853a;
        if (c1020p != null) {
            return c1020p.m2508c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0959S interfaceC0959S = this.f3858f;
        if (interfaceC0959S == null || !interfaceC0959S.mo2412b()) {
            return;
        }
        interfaceC0959S.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3858f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2432a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0956Q c0956q = (C0956Q) parcelable;
        super.onRestoreInstanceState(c0956q.getSuperState());
        if (!c0956q.f3843a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0199e(3, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0956Q c0956q = new C0956Q(super.onSaveInstanceState());
        InterfaceC0959S interfaceC0959S = this.f3858f;
        c0956q.f3843a = interfaceC0959S != null && interfaceC0959S.mo2412b();
        return c0956q;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0940I c0940i = this.f3855c;
        if (c0940i == null || !c0940i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0959S interfaceC0959S = this.f3858f;
        if (interfaceC0959S == null) {
            return super.performClick();
        }
        if (interfaceC0959S.mo2412b()) {
            return true;
        }
        this.f3858f.mo2415e(AbstractC0944K.m2405b(this), AbstractC0944K.m2404a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1020p c1020p = this.f3853a;
        if (c1020p != null) {
            c1020p.m2510e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C1020p c1020p = this.f3853a;
        if (c1020p != null) {
            c1020p.m2511f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0959S interfaceC0959S = this.f3858f;
        if (interfaceC0959S == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0959S.mo2421p(i2);
            interfaceC0959S.mo2413c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0959S interfaceC0959S = this.f3858f;
        if (interfaceC0959S != null) {
            interfaceC0959S.mo2419l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f3858f != null) {
            this.f3859g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0959S interfaceC0959S = this.f3858f;
        if (interfaceC0959S != null) {
            interfaceC0959S.mo2418k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AbstractC0104l.m415w(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0959S interfaceC0959S = this.f3858f;
        if (interfaceC0959S != null) {
            interfaceC0959S.mo2416h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1020p c1020p = this.f3853a;
        if (c1020p != null) {
            c1020p.m2513h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1020p c1020p = this.f3853a;
        if (c1020p != null) {
            c1020p.m2514i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3857e) {
            this.f3856d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0959S interfaceC0959S = this.f3858f;
        if (interfaceC0959S != null) {
            Context context = this.f3854b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0950N c0950n = new C0950N();
            c0950n.f3828a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0950n.f3829b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0946L.m2408a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0959S.mo2401o(c0950n);
        }
    }
}
