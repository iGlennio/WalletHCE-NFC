package p088j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p005C.AbstractC0044g;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p042P.AbstractC0399a;
import p045Q.AbstractC0447n;
import p047Q1.AbstractC0458e;
import p073d.AbstractC0734a;

/* renamed from: j.b0 */
/* loaded from: classes.dex */
public final class C0979b0 {

    /* renamed from: a */
    public final TextView f3888a;

    /* renamed from: b */
    public C1004j1 f3889b;

    /* renamed from: c */
    public C1004j1 f3890c;

    /* renamed from: d */
    public C1004j1 f3891d;

    /* renamed from: e */
    public C1004j1 f3892e;

    /* renamed from: f */
    public C1004j1 f3893f;

    /* renamed from: g */
    public C1004j1 f3894g;

    /* renamed from: h */
    public C1004j1 f3895h;

    /* renamed from: i */
    public final C1012m0 f3896i;

    /* renamed from: j */
    public int f3897j = 0;

    /* renamed from: k */
    public int f3898k = -1;

    /* renamed from: l */
    public Typeface f3899l;

    /* renamed from: m */
    public boolean f3900m;

    public C0979b0(TextView textView) {
        this.f3888a = textView;
        this.f3896i = new C1012m0(textView);
    }

    /* renamed from: c */
    public static C1004j1 m2445c(Context context, C1035u c1035u, int i2) {
        ColorStateList m2430f;
        synchronized (c1035u) {
            m2430f = c1035u.f4071a.m2430f(context, i2);
        }
        if (m2430f == null) {
            return null;
        }
        C1004j1 c1004j1 = new C1004j1();
        c1004j1.f3958b = true;
        c1004j1.f3959c = m2430f;
        return c1004j1;
    }

    /* renamed from: h */
    public static void m2446h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            AbstractC0399a.m1063a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            AbstractC0399a.m1063a(editorInfo, text);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = text.length();
        if (i5 < 0 || i3 > length) {
            AbstractC0104l.m396S(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            AbstractC0104l.m396S(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0104l.m396S(editorInfo, text, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int min = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (i9 * 0.8d)));
        int min2 = Math.min(i5, i9 - min);
        int i10 = i5 - min2;
        if (Character.isLowSurrogate(text.charAt(i10))) {
            i10++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i3 + min) - 1))) {
            min--;
        }
        int i11 = min2 + i8;
        AbstractC0104l.m396S(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + min2), text.subSequence(i3, min + i3)) : text.subSequence(i10, i11 + min + i10), min2, i11);
    }

    /* renamed from: a */
    public final void m2447a(Drawable drawable, C1004j1 c1004j1) {
        if (drawable == null || c1004j1 == null) {
            return;
        }
        C1035u.m2530e(drawable, c1004j1, this.f3888a.getDrawableState());
    }

    /* renamed from: b */
    public final void m2448b() {
        C1004j1 c1004j1 = this.f3889b;
        TextView textView = this.f3888a;
        if (c1004j1 != null || this.f3890c != null || this.f3891d != null || this.f3892e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m2447a(compoundDrawables[0], this.f3889b);
            m2447a(compoundDrawables[1], this.f3890c);
            m2447a(compoundDrawables[2], this.f3891d);
            m2447a(compoundDrawables[3], this.f3892e);
        }
        if (this.f3893f == null && this.f3894g == null) {
            return;
        }
        Drawable[] m2435a = AbstractC0969X.m2435a(textView);
        m2447a(m2435a[0], this.f3893f);
        m2447a(m2435a[2], this.f3894g);
    }

    /* renamed from: d */
    public final ColorStateList m2449d() {
        C1004j1 c1004j1 = this.f3895h;
        if (c1004j1 != null) {
            return (ColorStateList) c1004j1.f3959c;
        }
        return null;
    }

    /* renamed from: e */
    public final PorterDuff.Mode m2450e() {
        C1004j1 c1004j1 = this.f3895h;
        if (c1004j1 != null) {
            return (PorterDuff.Mode) c1004j1.f3960d;
        }
        return null;
    }

    /* renamed from: f */
    public final void m2451f(AttributeSet attributeSet, int i2) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        ColorStateList colorStateList;
        int resourceId;
        int i3;
        int resourceId2;
        TextView textView = this.f3888a;
        Context context = textView.getContext();
        C1035u m2527a = C1035u.m2527a();
        int[] iArr = AbstractC0734a.f2918h;
        C0176h m519B = C0176h.m519B(context, attributeSet, iArr, i2);
        AbstractC0272P.m822l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) m519B.f516c, i2);
        TypedArray typedArray = (TypedArray) m519B.f516c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3889b = m2445c(context, m2527a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3890c = m2445c(context, m2527a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f3891d = m2445c(context, m2527a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3892e = m2445c(context, m2527a, typedArray.getResourceId(2, 0));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f3893f = m2445c(context, m2527a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f3894g = m2445c(context, m2527a, typedArray.getResourceId(6, 0));
        }
        m519B.m523E();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0734a.f2933w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0176h c0176h = new C0176h(context, obtainStyledAttributes);
            if (z4 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = obtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            m2458n(context, c0176h);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i4 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            c0176h.m523E();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C0176h c0176h2 = new C0176h(context, obtainStyledAttributes2);
        if (!z4 && obtainStyledAttributes2.hasValue(14)) {
            z3 = obtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z5 = z3;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i4 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i4 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2458n(context, c0176h2);
        c0176h2.m523E();
        if (!z4 && z2) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f3899l;
        if (typeface != null) {
            if (this.f3898k == -1) {
                textView.setTypeface(typeface, this.f3897j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            AbstractC0973Z.m2443d(textView, str);
        }
        if (str2 != null) {
            AbstractC0971Y.m2439b(textView, AbstractC0971Y.m2438a(str2));
        }
        int[] iArr3 = AbstractC0734a.f2919i;
        C1012m0 c1012m0 = this.f3896i;
        Context context2 = c1012m0.f4005j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView2 = c1012m0.f4004i;
        AbstractC0272P.m822l(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i2);
        if (obtainStyledAttributes3.hasValue(5)) {
            c1012m0.f3996a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = obtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                c1012m0.f4001f = C1012m0.m2491b(iArr4);
                c1012m0.m2499i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c1012m0.m2500j()) {
            c1012m0.f3996a = 0;
        } else if (c1012m0.f3996a == 1) {
            if (!c1012m0.f4002g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c1012m0.m2501k(dimension2, f, dimension);
            }
            c1012m0.m2498h();
        }
        if (AbstractC0925A1.f3756b && c1012m0.f3996a != 0) {
            int[] iArr5 = c1012m0.f4001f;
            if (iArr5.length > 0) {
                if (AbstractC0973Z.m2440a(textView) != -1.0f) {
                    AbstractC0973Z.m2441b(textView, Math.round(c1012m0.f3999d), Math.round(c1012m0.f4000e), Math.round(c1012m0.f3998c), 0);
                } else {
                    AbstractC0973Z.m2442c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable m2531b = resourceId4 != -1 ? m2527a.m2531b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable m2531b2 = resourceId5 != -1 ? m2527a.m2531b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable m2531b3 = resourceId6 != -1 ? m2527a.m2531b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable m2531b4 = resourceId7 != -1 ? m2527a.m2531b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable m2531b5 = resourceId8 != -1 ? m2527a.m2531b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable m2531b6 = resourceId9 != -1 ? m2527a.m2531b(context, resourceId9) : null;
        if (m2531b5 != null || m2531b6 != null) {
            Drawable[] m2435a = AbstractC0969X.m2435a(textView);
            if (m2531b5 == null) {
                m2531b5 = m2435a[0];
            }
            if (m2531b2 == null) {
                m2531b2 = m2435a[1];
            }
            if (m2531b6 == null) {
                m2531b6 = m2435a[2];
            }
            if (m2531b4 == null) {
                m2531b4 = m2435a[3];
            }
            AbstractC0969X.m2436b(textView, m2531b5, m2531b2, m2531b6, m2531b4);
        } else if (m2531b != null || m2531b2 != null || m2531b3 != null || m2531b4 != null) {
            Drawable[] m2435a2 = AbstractC0969X.m2435a(textView);
            Drawable drawable = m2435a2[0];
            if (drawable == null && m2435a2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (m2531b == null) {
                    m2531b = compoundDrawables[0];
                }
                if (m2531b2 == null) {
                    m2531b2 = compoundDrawables[1];
                }
                if (m2531b3 == null) {
                    m2531b3 = compoundDrawables[2];
                }
                if (m2531b4 == null) {
                    m2531b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(m2531b, m2531b2, m2531b3, m2531b4);
            } else {
                if (m2531b2 == null) {
                    m2531b2 = m2435a2[1];
                }
                Drawable drawable2 = m2435a2[2];
                if (m2531b4 == null) {
                    m2531b4 = m2435a2[3];
                }
                AbstractC0969X.m2436b(textView, drawable, m2531b2, drawable2, m2531b4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0096d.m355v(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            AbstractC0447n.m1153f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            AbstractC0447n.m1154g(textView, AbstractC1027r0.m2516b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0458e.m1181Y(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0458e.m1182Z(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            AbstractC0458e.m1191i(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    /* renamed from: g */
    public final void m2452g(Context context, int i2) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0734a.f2933w);
        C0176h c0176h = new C0176h(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3888a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2458n(context, c0176h);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC0973Z.m2443d(textView, string);
        }
        c0176h.m523E();
        Typeface typeface = this.f3899l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3897j);
        }
    }

    /* renamed from: i */
    public final void m2453i(int i2, int i3, int i4, int i5) {
        C1012m0 c1012m0 = this.f3896i;
        if (c1012m0.m2500j()) {
            DisplayMetrics displayMetrics = c1012m0.f4005j.getResources().getDisplayMetrics();
            c1012m0.m2501k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c1012m0.m2498h()) {
                c1012m0.m2494a();
            }
        }
    }

    /* renamed from: j */
    public final void m2454j(int[] iArr, int i2) {
        C1012m0 c1012m0 = this.f3896i;
        if (c1012m0.m2500j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1012m0.f4005j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c1012m0.f4001f = C1012m0.m2491b(iArr2);
                if (!c1012m0.m2499i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1012m0.f4002g = false;
            }
            if (c1012m0.m2498h()) {
                c1012m0.m2494a();
            }
        }
    }

    /* renamed from: k */
    public final void m2455k(int i2) {
        C1012m0 c1012m0 = this.f3896i;
        if (c1012m0.m2500j()) {
            if (i2 == 0) {
                c1012m0.f3996a = 0;
                c1012m0.f3999d = -1.0f;
                c1012m0.f4000e = -1.0f;
                c1012m0.f3998c = -1.0f;
                c1012m0.f4001f = new int[0];
                c1012m0.f3997b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(AbstractC0044g.m153e("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = c1012m0.f4005j.getResources().getDisplayMetrics();
            c1012m0.m2501k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1012m0.m2498h()) {
                c1012m0.m2494a();
            }
        }
    }

    /* renamed from: l */
    public final void m2456l(ColorStateList colorStateList) {
        if (this.f3895h == null) {
            this.f3895h = new C1004j1();
        }
        C1004j1 c1004j1 = this.f3895h;
        c1004j1.f3959c = colorStateList;
        c1004j1.f3958b = colorStateList != null;
        this.f3889b = c1004j1;
        this.f3890c = c1004j1;
        this.f3891d = c1004j1;
        this.f3892e = c1004j1;
        this.f3893f = c1004j1;
        this.f3894g = c1004j1;
    }

    /* renamed from: m */
    public final void m2457m(PorterDuff.Mode mode) {
        if (this.f3895h == null) {
            this.f3895h = new C1004j1();
        }
        C1004j1 c1004j1 = this.f3895h;
        c1004j1.f3960d = mode;
        c1004j1.f3957a = mode != null;
        this.f3889b = c1004j1;
        this.f3890c = c1004j1;
        this.f3891d = c1004j1;
        this.f3892e = c1004j1;
        this.f3893f = c1004j1;
        this.f3894g = c1004j1;
    }

    /* renamed from: n */
    public final void m2458n(Context context, C0176h c0176h) {
        String string;
        int i2 = this.f3897j;
        TypedArray typedArray = (TypedArray) c0176h.f516c;
        this.f3897j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f3898k = i4;
            if (i4 != -1) {
                this.f3897j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3900m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f3899l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f3899l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f3899l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3899l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f3898k;
        int i8 = this.f3897j;
        if (!context.isRestricted()) {
            try {
                Typeface m544s = c0176h.m544s(i6, this.f3897j, new C0965V(this, i7, i8, new WeakReference(this.f3888a)));
                if (m544s != null) {
                    if (i3 < 28 || this.f3898k == -1) {
                        this.f3899l = m544s;
                    } else {
                        this.f3899l = AbstractC0976a0.m2444a(Typeface.create(m544s, 0), this.f3898k, (this.f3897j & 2) != 0);
                    }
                }
                this.f3900m = this.f3899l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3899l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3898k == -1) {
            this.f3899l = Typeface.create(string, this.f3897j);
        } else {
            this.f3899l = AbstractC0976a0.m2444a(Typeface.create(string, 0), this.f3898k, (this.f3897j & 2) != 0);
        }
    }
}
