package p131y0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p002B.AbstractC0020j;
import p002B.AbstractC0027q;
import p005C.AbstractC0044g;
import p008D.AbstractC0087a;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p014F0.AbstractC0128E;
import p017G0.C0176h;
import p017G0.C0177i;
import p045Q.AbstractC0435b;
import p045Q.AbstractC0436c;
import p047Q1.AbstractC0458e;
import p049R0.AbstractC0463a;
import p088j.C1026r;
import p091k0.C1088b;
import p091k0.C1090d;
import p091k0.C1091e;
import p091k0.C1092f;
import p108q0.AbstractC1183a;

/* renamed from: y0.c */
/* loaded from: classes.dex */
public final class C1320c extends C1026r {

    /* renamed from: e */
    public final LinkedHashSet f5384e;

    /* renamed from: f */
    public final LinkedHashSet f5385f;

    /* renamed from: g */
    public ColorStateList f5386g;

    /* renamed from: h */
    public boolean f5387h;

    /* renamed from: i */
    public boolean f5388i;

    /* renamed from: j */
    public boolean f5389j;

    /* renamed from: k */
    public CharSequence f5390k;

    /* renamed from: l */
    public Drawable f5391l;

    /* renamed from: m */
    public Drawable f5392m;

    /* renamed from: n */
    public boolean f5393n;

    /* renamed from: o */
    public ColorStateList f5394o;

    /* renamed from: p */
    public ColorStateList f5395p;

    /* renamed from: q */
    public PorterDuff.Mode f5396q;

    /* renamed from: r */
    public int f5397r;

    /* renamed from: s */
    public int[] f5398s;

    /* renamed from: t */
    public boolean f5399t;

    /* renamed from: u */
    public CharSequence f5400u;

    /* renamed from: v */
    public CompoundButton.OnCheckedChangeListener f5401v;

    /* renamed from: w */
    public final C1092f f5402w;

    /* renamed from: x */
    public final C1318a f5403x;

    /* renamed from: y */
    public static final int[] f5382y = {R.attr.state_indeterminate};

    /* renamed from: z */
    public static final int[] f5383z = {R.attr.state_error};

    /* renamed from: A */
    public static final int[][] f5380A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B */
    public static final int f5381B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C1320c(Context context, AttributeSet attributeSet) {
        super(AbstractC0463a.m1220a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f5384e = new LinkedHashSet();
        this.f5385f = new LinkedHashSet();
        Context context2 = getContext();
        C1092f c1092f = new C1092f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC0027q.f60a;
        Drawable m84a = AbstractC0020j.m84a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c1092f.f4245a = m84a;
        m84a.setCallback(c1092f.f4244f);
        new C1091e(c1092f.f4245a.getConstantState());
        this.f5402w = c1092f;
        this.f5403x = new C1318a(this);
        Context context3 = getContext();
        this.f5391l = AbstractC0436c.m1129a(this);
        this.f5394o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC1183a.f4535n;
        AbstractC0128E.m451a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        AbstractC0128E.m452b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0176h c0176h = new C0176h(context3, obtainStyledAttributes);
        this.f5392m = c0176h.m542q(2);
        if (this.f5391l != null && AbstractC0096d.m338a0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f5381B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f5391l = AbstractC0104l.m415w(context3, R.drawable.mtrl_checkbox_button);
                this.f5393n = true;
                if (this.f5392m == null) {
                    this.f5392m = AbstractC0104l.m415w(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f5395p = AbstractC0104l.m412s(context3, c0176h, 3);
        this.f5396q = AbstractC0128E.m457g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f5387h = obtainStyledAttributes.getBoolean(10, false);
        this.f5388i = obtainStyledAttributes.getBoolean(6, true);
        this.f5389j = obtainStyledAttributes.getBoolean(9, false);
        this.f5390k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0176h.m523E();
        m3023a();
    }

    private String getButtonStateDescription() {
        int i2 = this.f5397r;
        return i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5386g == null) {
            int m1208z = AbstractC0458e.m1208z(this, R.attr.colorControlActivated);
            int m1208z2 = AbstractC0458e.m1208z(this, R.attr.colorError);
            int m1208z3 = AbstractC0458e.m1208z(this, R.attr.colorSurface);
            int m1208z4 = AbstractC0458e.m1208z(this, R.attr.colorOnSurface);
            this.f5386g = new ColorStateList(f5380A, new int[]{AbstractC0458e.m1174H(m1208z3, m1208z2, 1.0f), AbstractC0458e.m1174H(m1208z3, m1208z, 1.0f), AbstractC0458e.m1174H(m1208z3, m1208z4, 0.54f), AbstractC0458e.m1174H(m1208z3, m1208z4, 0.38f), AbstractC0458e.m1174H(m1208z3, m1208z4, 0.38f)});
        }
        return this.f5386g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f5394o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: a */
    public final void m3023a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0177i c0177i;
        Drawable drawable = this.f5391l;
        ColorStateList colorStateList3 = this.f5394o;
        PorterDuff.Mode m1126b = AbstractC0435b.m1126b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (m1126b != null) {
                AbstractC0087a.m306i(drawable, m1126b);
            }
        }
        this.f5391l = drawable;
        Drawable drawable2 = this.f5392m;
        ColorStateList colorStateList4 = this.f5395p;
        PorterDuff.Mode mode = this.f5396q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                AbstractC0087a.m306i(drawable2, mode);
            }
        }
        this.f5392m = drawable2;
        if (this.f5393n) {
            C1092f c1092f = this.f5402w;
            if (c1092f != null) {
                Drawable drawable3 = c1092f.f4245a;
                C1318a c1318a = this.f5403x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c1318a.f5377a == null) {
                        c1318a.f5377a = new C1088b(c1318a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c1318a.f5377a);
                }
                ArrayList arrayList = c1092f.f4243e;
                C1090d c1090d = c1092f.f4240b;
                if (arrayList != null && c1318a != null) {
                    arrayList.remove(c1318a);
                    if (c1092f.f4243e.size() == 0 && (c0177i = c1092f.f4242d) != null) {
                        c1090d.f4236b.removeListener(c0177i);
                        c1092f.f4242d = null;
                    }
                }
                Drawable drawable4 = c1092f.f4245a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c1318a.f5377a == null) {
                        c1318a.f5377a = new C1088b(c1318a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c1318a.f5377a);
                } else if (c1318a != null) {
                    if (c1092f.f4243e == null) {
                        c1092f.f4243e = new ArrayList();
                    }
                    if (!c1092f.f4243e.contains(c1318a)) {
                        c1092f.f4243e.add(c1318a);
                        if (c1092f.f4242d == null) {
                            c1092f.f4242d = new C0177i(6, c1092f);
                        }
                        c1090d.f4236b.addListener(c1092f.f4242d);
                    }
                }
            }
            Drawable drawable5 = this.f5391l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c1092f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c1092f, false);
                ((AnimatedStateListDrawable) this.f5391l).addTransition(R.id.indeterminate, R.id.unchecked, c1092f, false);
            }
        }
        Drawable drawable6 = this.f5391l;
        if (drawable6 != null && (colorStateList2 = this.f5394o) != null) {
            AbstractC0087a.m305h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f5392m;
        if (drawable7 != null && (colorStateList = this.f5395p) != null) {
            AbstractC0087a.m305h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f5391l;
        Drawable drawable9 = this.f5392m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f5391l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f5392m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f5395p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f5396q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f5394o;
    }

    public int getCheckedState() {
        return this.f5397r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f5390k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f5397r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5387h && this.f5394o == null && this.f5395p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f5382y);
        }
        if (this.f5389j) {
            View.mergeDrawableStates(onCreateDrawableState, f5383z);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i4 = onCreateDrawableState[i3];
            if (i4 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i4 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i3] = 16842912;
                break;
            }
            i3++;
        }
        this.f5398s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable m1129a;
        if (!this.f5388i || !TextUtils.isEmpty(getText()) || (m1129a = AbstractC0436c.m1129a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - m1129a.getIntrinsicWidth()) / 2) * (AbstractC0128E.m455e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = m1129a.getBounds();
            AbstractC0087a.m303f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f5389j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f5390k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1319b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1319b c1319b = (C1319b) parcelable;
        super.onRestoreInstanceState(c1319b.getSuperState());
        setCheckedState(c1319b.f5379a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1319b c1319b = new C1319b(super.onSaveInstanceState());
        c1319b.f5379a = getCheckedState();
        return c1319b;
    }

    @Override // p088j.C1026r, android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(AbstractC0104l.m415w(getContext(), i2));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f5392m = drawable;
        m3023a();
    }

    public void setButtonIconDrawableResource(int i2) {
        setButtonIconDrawable(AbstractC0104l.m415w(getContext(), i2));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f5395p == colorStateList) {
            return;
        }
        this.f5395p = colorStateList;
        m3023a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f5396q == mode) {
            return;
        }
        this.f5396q = mode;
        m3023a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f5394o == colorStateList) {
            return;
        }
        this.f5394o = colorStateList;
        m3023a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m3023a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f5388i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i2) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f5397r != i2) {
            this.f5397r = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && this.f5400u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f5399t) {
                return;
            }
            this.f5399t = true;
            LinkedHashSet linkedHashSet = this.f5385f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC0044g.m152d(it);
                }
            }
            if (this.f5397r != 2 && (onCheckedChangeListener = this.f5401v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i3 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f5399t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f5390k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i2) {
        setErrorAccessibilityLabel(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f5389j == z2) {
            return;
        }
        this.f5389j = z2;
        refreshDrawableState();
        Iterator it = this.f5384e.iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5401v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f5400u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f5387h = z2;
        if (z2) {
            AbstractC0435b.m1127c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0435b.m1127c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p088j.C1026r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f5391l = drawable;
        this.f5393n = false;
        m3023a();
    }
}
