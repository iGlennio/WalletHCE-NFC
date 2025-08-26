package p043P0;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p014F0.AbstractC0128E;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p088j.C0991f0;

/* renamed from: P0.y */
/* loaded from: classes.dex */
public final class C0431y extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f1190a;

    /* renamed from: b */
    public final C0991f0 f1191b;

    /* renamed from: c */
    public CharSequence f1192c;

    /* renamed from: d */
    public final CheckableImageButton f1193d;

    /* renamed from: e */
    public ColorStateList f1194e;

    /* renamed from: f */
    public PorterDuff.Mode f1195f;

    /* renamed from: g */
    public int f1196g;

    /* renamed from: h */
    public ImageView.ScaleType f1197h;

    /* renamed from: i */
    public View.OnLongClickListener f1198i;

    /* renamed from: j */
    public boolean f1199j;

    public C0431y(TextInputLayout textInputLayout, C0176h c0176h) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1190a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1193d = checkableImageButton;
        C0991f0 c0991f0 = new C0991f0(getContext(), null);
        this.f1191b = c0991f0;
        if (AbstractC0104l.m390E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f1198i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0096d.m340c0(checkableImageButton, onLongClickListener);
        this.f1198i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0096d.m340c0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0176h.f516c;
        if (typedArray.hasValue(69)) {
            this.f1194e = AbstractC0104l.m412s(getContext(), c0176h, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f1195f = AbstractC0128E.m457g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m1120b(c0176h.m542q(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1196g) {
            this.f1196g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType m353m = AbstractC0096d.m353m(typedArray.getInt(68, -1));
            this.f1197h = m353m;
            checkableImageButton.setScaleType(m353m);
        }
        c0991f0.setVisibility(8);
        c0991f0.setId(R.id.textinput_prefix_text);
        c0991f0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        c0991f0.setAccessibilityLiveRegion(1);
        c0991f0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0991f0.setTextColor(c0176h.m541p(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1192c = TextUtils.isEmpty(text2) ? null : text2;
        c0991f0.setText(text2);
        m1123e();
        addView(checkableImageButton);
        addView(c0991f0);
    }

    /* renamed from: a */
    public final int m1119a() {
        int i2;
        CheckableImageButton checkableImageButton = this.f1193d;
        if (checkableImageButton.getVisibility() == 0) {
            i2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        return this.f1191b.getPaddingStart() + getPaddingStart() + i2;
    }

    /* renamed from: b */
    public final void m1120b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1193d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1194e;
            PorterDuff.Mode mode = this.f1195f;
            TextInputLayout textInputLayout = this.f1190a;
            AbstractC0096d.m343e(textInputLayout, checkableImageButton, colorStateList, mode);
            m1121c(true);
            AbstractC0096d.m336Y(textInputLayout, checkableImageButton, this.f1194e);
            return;
        }
        m1121c(false);
        View.OnLongClickListener onLongClickListener = this.f1198i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0096d.m340c0(checkableImageButton, onLongClickListener);
        this.f1198i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0096d.m340c0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* renamed from: c */
    public final void m1121c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f1193d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            m1122d();
            m1123e();
        }
    }

    /* renamed from: d */
    public final void m1122d() {
        int paddingStart;
        EditText editText = this.f1190a.f2823d;
        if (editText == null) {
            return;
        }
        if (this.f1193d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
        this.f1191b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* renamed from: e */
    public final void m1123e() {
        int i2 = (this.f1192c == null || this.f1199j) ? 8 : 0;
        setVisibility((this.f1193d.getVisibility() == 0 || i2 == 0) ? 0 : 8);
        this.f1191b.setVisibility(i2);
        this.f1190a.m1994q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        m1122d();
    }
}
