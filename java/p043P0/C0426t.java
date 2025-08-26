package p043P0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p010D1.AbstractC0104l;
import p027K.AbstractC0272P;
import p047Q1.AbstractC0458e;
import p088j.C0991f0;
import p111r0.AbstractC1188a;

/* renamed from: P0.t */
/* loaded from: classes.dex */
public final class C0426t {

    /* renamed from: A */
    public ColorStateList f1146A;

    /* renamed from: B */
    public Typeface f1147B;

    /* renamed from: a */
    public final int f1148a;

    /* renamed from: b */
    public final int f1149b;

    /* renamed from: c */
    public final int f1150c;

    /* renamed from: d */
    public final TimeInterpolator f1151d;

    /* renamed from: e */
    public final TimeInterpolator f1152e;

    /* renamed from: f */
    public final TimeInterpolator f1153f;

    /* renamed from: g */
    public final Context f1154g;

    /* renamed from: h */
    public final TextInputLayout f1155h;

    /* renamed from: i */
    public LinearLayout f1156i;

    /* renamed from: j */
    public int f1157j;

    /* renamed from: k */
    public FrameLayout f1158k;

    /* renamed from: l */
    public AnimatorSet f1159l;

    /* renamed from: m */
    public final float f1160m;

    /* renamed from: n */
    public int f1161n;

    /* renamed from: o */
    public int f1162o;

    /* renamed from: p */
    public CharSequence f1163p;

    /* renamed from: q */
    public boolean f1164q;

    /* renamed from: r */
    public C0991f0 f1165r;

    /* renamed from: s */
    public CharSequence f1166s;

    /* renamed from: t */
    public int f1167t;

    /* renamed from: u */
    public int f1168u;

    /* renamed from: v */
    public ColorStateList f1169v;

    /* renamed from: w */
    public CharSequence f1170w;

    /* renamed from: x */
    public boolean f1171x;

    /* renamed from: y */
    public C0991f0 f1172y;

    /* renamed from: z */
    public int f1173z;

    public C0426t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1154g = context;
        this.f1155h = textInputLayout;
        this.f1160m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1148a = AbstractC0458e.m1179S(context, R.attr.motionDurationShort4, 217);
        this.f1149b = AbstractC0458e.m1179S(context, R.attr.motionDurationMedium4, 167);
        this.f1150c = AbstractC0458e.m1179S(context, R.attr.motionDurationShort4, 167);
        this.f1151d = AbstractC0458e.m1180T(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC1188a.f4555d);
        LinearInterpolator linearInterpolator = AbstractC1188a.f4552a;
        this.f1152e = AbstractC0458e.m1180T(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1153f = AbstractC0458e.m1180T(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: a */
    public final void m1106a(C0991f0 c0991f0, int i2) {
        if (this.f1156i == null && this.f1158k == null) {
            Context context = this.f1154g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1156i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1156i;
            TextInputLayout textInputLayout = this.f1155h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1158k = new FrameLayout(context);
            this.f1156i.addView(this.f1158k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m1107b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f1158k.setVisibility(0);
            this.f1158k.addView(c0991f0);
        } else {
            this.f1156i.addView(c0991f0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1156i.setVisibility(0);
        this.f1157j++;
    }

    /* renamed from: b */
    public final void m1107b() {
        if (this.f1156i != null) {
            TextInputLayout textInputLayout = this.f1155h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1154g;
                boolean m390E = AbstractC0104l.m390E(context);
                LinearLayout linearLayout = this.f1156i;
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                int paddingStart = editText.getPaddingStart();
                if (m390E) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (m390E) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (m390E) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* renamed from: c */
    public final void m1108c() {
        AnimatorSet animatorSet = this.f1159l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: d */
    public final void m1109d(ArrayList arrayList, boolean z2, C0991f0 c0991f0, int i2, int i3, int i4) {
        if (c0991f0 == null || !z2) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            boolean z3 = i4 == i2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0991f0, (Property<C0991f0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i5 = this.f1150c;
            ofFloat.setDuration(z3 ? this.f1149b : i5);
            ofFloat.setInterpolator(z3 ? this.f1152e : this.f1153f);
            if (i2 == i4 && i3 != 0) {
                ofFloat.setStartDelay(i5);
            }
            arrayList.add(ofFloat);
            if (i4 != i2 || i3 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0991f0, (Property<C0991f0, Float>) View.TRANSLATION_Y, -this.f1160m, 0.0f);
            ofFloat2.setDuration(this.f1148a);
            ofFloat2.setInterpolator(this.f1151d);
            ofFloat2.setStartDelay(i5);
            arrayList.add(ofFloat2);
        }
    }

    /* renamed from: e */
    public final TextView m1110e(int i2) {
        if (i2 == 1) {
            return this.f1165r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f1172y;
    }

    /* renamed from: f */
    public final void m1111f() {
        this.f1163p = null;
        m1108c();
        if (this.f1161n == 1) {
            if (!this.f1171x || TextUtils.isEmpty(this.f1170w)) {
                this.f1162o = 0;
            } else {
                this.f1162o = 2;
            }
        }
        m1114i(this.f1161n, this.f1162o, m1113h(this.f1165r, ""));
    }

    /* renamed from: g */
    public final void m1112g(C0991f0 c0991f0, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f1156i;
        if (linearLayout == null) {
            return;
        }
        if ((i2 == 0 || i2 == 1) && (frameLayout = this.f1158k) != null) {
            frameLayout.removeView(c0991f0);
        } else {
            linearLayout.removeView(c0991f0);
        }
        int i3 = this.f1157j - 1;
        this.f1157j = i3;
        LinearLayout linearLayout2 = this.f1156i;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final boolean m1113h(C0991f0 c0991f0, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        TextInputLayout textInputLayout = this.f1155h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f1162o == this.f1161n && c0991f0 != null && TextUtils.equals(c0991f0.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m1114i(int i2, int i3, boolean z2) {
        TextView m1110e;
        TextView m1110e2;
        C0426t c0426t = this;
        if (i2 == i3) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            c0426t.f1159l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c0426t.m1109d(arrayList, c0426t.f1171x, c0426t.f1172y, 2, i2, i3);
            c0426t.m1109d(arrayList, c0426t.f1164q, c0426t.f1165r, 1, i2, i3);
            int size = arrayList.size();
            long j2 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Animator animator = (Animator) arrayList.get(i4);
                j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j2);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            C0424r c0424r = new C0424r(this, i3, m1110e(i2), i2, c0426t.m1110e(i3));
            c0426t = this;
            animatorSet.addListener(c0424r);
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (m1110e2 = c0426t.m1110e(i3)) != null) {
                m1110e2.setVisibility(0);
                m1110e2.setAlpha(1.0f);
            }
            if (i2 != 0 && (m1110e = m1110e(i2)) != null) {
                m1110e.setVisibility(4);
                if (i2 == 1) {
                    m1110e.setText((CharSequence) null);
                }
            }
            c0426t.f1161n = i3;
        }
        TextInputLayout textInputLayout = c0426t.f1155h;
        textInputLayout.m1995r();
        textInputLayout.m1998u(z2, false);
        textInputLayout.m2001x();
    }
}
