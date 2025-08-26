package p014F0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p010D1.AbstractC0096d;
import p021I.AbstractC0215j;
import p025J0.C0228a;
import p027K.AbstractC0272P;
import p064Z.C0549a;
import p111r0.AbstractC1188a;

/* renamed from: F0.d */
/* loaded from: classes.dex */
public final class C0136d {

    /* renamed from: A */
    public CharSequence f363A;

    /* renamed from: B */
    public CharSequence f364B;

    /* renamed from: C */
    public boolean f365C;

    /* renamed from: E */
    public Bitmap f367E;

    /* renamed from: F */
    public float f368F;

    /* renamed from: G */
    public float f369G;

    /* renamed from: H */
    public float f370H;

    /* renamed from: I */
    public float f371I;

    /* renamed from: J */
    public float f372J;

    /* renamed from: K */
    public int f373K;

    /* renamed from: L */
    public int[] f374L;

    /* renamed from: M */
    public boolean f375M;

    /* renamed from: N */
    public final TextPaint f376N;

    /* renamed from: O */
    public final TextPaint f377O;

    /* renamed from: P */
    public LinearInterpolator f378P;

    /* renamed from: Q */
    public LinearInterpolator f379Q;

    /* renamed from: R */
    public float f380R;

    /* renamed from: S */
    public float f381S;

    /* renamed from: T */
    public float f382T;

    /* renamed from: U */
    public ColorStateList f383U;

    /* renamed from: V */
    public float f384V;

    /* renamed from: W */
    public float f385W;

    /* renamed from: X */
    public float f386X;

    /* renamed from: Y */
    public StaticLayout f387Y;

    /* renamed from: Z */
    public float f388Z;

    /* renamed from: a */
    public final TextInputLayout f389a;

    /* renamed from: a0 */
    public float f390a0;

    /* renamed from: b */
    public float f391b;

    /* renamed from: b0 */
    public float f392b0;

    /* renamed from: c */
    public final Rect f393c;

    /* renamed from: c0 */
    public CharSequence f394c0;

    /* renamed from: d */
    public final Rect f395d;

    /* renamed from: e */
    public final RectF f397e;

    /* renamed from: j */
    public ColorStateList f404j;

    /* renamed from: k */
    public ColorStateList f405k;

    /* renamed from: l */
    public float f406l;

    /* renamed from: m */
    public float f407m;

    /* renamed from: n */
    public float f408n;

    /* renamed from: o */
    public float f409o;

    /* renamed from: p */
    public float f410p;

    /* renamed from: q */
    public float f411q;

    /* renamed from: r */
    public Typeface f412r;

    /* renamed from: s */
    public Typeface f413s;

    /* renamed from: t */
    public Typeface f414t;

    /* renamed from: u */
    public Typeface f415u;

    /* renamed from: v */
    public Typeface f416v;

    /* renamed from: w */
    public Typeface f417w;

    /* renamed from: x */
    public Typeface f418x;

    /* renamed from: y */
    public C0228a f419y;

    /* renamed from: f */
    public int f399f = 16;

    /* renamed from: g */
    public int f401g = 16;

    /* renamed from: h */
    public float f402h = 15.0f;

    /* renamed from: i */
    public float f403i = 15.0f;

    /* renamed from: z */
    public final TextUtils.TruncateAt f420z = TextUtils.TruncateAt.END;

    /* renamed from: D */
    public final boolean f366D = true;

    /* renamed from: d0 */
    public final int f396d0 = 1;

    /* renamed from: e0 */
    public final float f398e0 = 1.0f;

    /* renamed from: f0 */
    public final int f400f0 = 1;

    public C0136d(TextInputLayout textInputLayout) {
        this.f389a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f376N = textPaint;
        this.f377O = new TextPaint(textPaint);
        this.f395d = new Rect();
        this.f393c = new Rect();
        this.f397e = new RectF();
        m466g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* renamed from: a */
    public static int m460a(int i2, int i3, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i3) * f) + (Color.alpha(i2) * f2)), Math.round((Color.red(i3) * f) + (Color.red(i2) * f2)), Math.round((Color.green(i3) * f) + (Color.green(i2) * f2)), Math.round((Color.blue(i3) * f) + (Color.blue(i2) * f2)));
    }

    /* renamed from: f */
    public static float m461f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC1188a.m2747a(f, f2, f3);
    }

    /* renamed from: b */
    public final boolean m462b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        boolean z2 = this.f389a.getLayoutDirection() == 1;
        if (this.f366D) {
            return (z2 ? AbstractC0215j.f599d : AbstractC0215j.f598c).m618b(charSequence, charSequence.length());
        }
        return z2;
    }

    /* renamed from: c */
    public final void m463c(float f, boolean z2) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f363A == null) {
            return;
        }
        float width = this.f395d.width();
        float width2 = this.f393c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f403i;
            f3 = this.f384V;
            this.f368F = 1.0f;
            typeface = this.f412r;
        } else {
            float f4 = this.f402h;
            float f5 = this.f385W;
            Typeface typeface2 = this.f415u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f368F = 1.0f;
            } else {
                this.f368F = m461f(this.f402h, this.f403i, f, this.f379Q) / this.f402h;
            }
            float f6 = this.f403i / this.f402h;
            width = (z2 || width2 * f6 <= width) ? width2 : Math.min(width / f6, width2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f376N;
        if (width > 0.0f) {
            boolean z4 = this.f369G != f2;
            boolean z5 = this.f386X != f3;
            boolean z6 = this.f418x != typeface;
            StaticLayout staticLayout = this.f387Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f375M;
            this.f369G = f2;
            this.f386X = f3;
            this.f418x = typeface;
            this.f375M = false;
            textPaint.setLinearText(this.f368F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f364B == null || z3) {
            textPaint.setTextSize(this.f369G);
            textPaint.setTypeface(this.f418x);
            textPaint.setLetterSpacing(this.f386X);
            boolean m462b = m462b(this.f363A);
            this.f365C = m462b;
            int i2 = this.f396d0;
            if (i2 <= 1 || m462b) {
                i2 = 1;
            }
            if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f399f, m462b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f365C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f365C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C0158z c0158z = new C0158z(this.f363A, textPaint, (int) width);
            c0158z.f490k = this.f420z;
            c0158z.f489j = m462b;
            c0158z.f484e = alignment;
            c0158z.f488i = false;
            c0158z.f485f = i2;
            c0158z.f486g = this.f398e0;
            c0158z.f487h = this.f400f0;
            StaticLayout m493a = c0158z.m493a();
            m493a.getClass();
            this.f387Y = m493a;
            this.f364B = m493a.getText();
        }
    }

    /* renamed from: d */
    public final float m464d() {
        TextPaint textPaint = this.f377O;
        textPaint.setTextSize(this.f403i);
        textPaint.setTypeface(this.f412r);
        textPaint.setLetterSpacing(this.f384V);
        return -textPaint.ascent();
    }

    /* renamed from: e */
    public final int m465e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f374L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: g */
    public final void m466g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f414t;
            if (typeface != null) {
                this.f413s = AbstractC0096d.m330R(configuration, typeface);
            }
            Typeface typeface2 = this.f417w;
            if (typeface2 != null) {
                this.f416v = AbstractC0096d.m330R(configuration, typeface2);
            }
            Typeface typeface3 = this.f413s;
            if (typeface3 == null) {
                typeface3 = this.f414t;
            }
            this.f412r = typeface3;
            Typeface typeface4 = this.f416v;
            if (typeface4 == null) {
                typeface4 = this.f417w;
            }
            this.f415u = typeface4;
            m467h(true);
        }
    }

    /* renamed from: h */
    public final void m467h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f389a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        m463c(1.0f, z2);
        CharSequence charSequence = this.f364B;
        TextPaint textPaint = this.f376N;
        if (charSequence != null && (staticLayout = this.f387Y) != null) {
            this.f394c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f420z);
        }
        CharSequence charSequence2 = this.f394c0;
        if (charSequence2 != null) {
            this.f388Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f388Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f401g, this.f365C ? 1 : 0);
        int i2 = absoluteGravity & 112;
        Rect rect = this.f395d;
        if (i2 == 48) {
            this.f407m = rect.top;
        } else if (i2 != 80) {
            this.f407m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f407m = textPaint.ascent() + rect.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.f409o = rect.centerX() - (this.f388Z / 2.0f);
        } else if (i3 != 5) {
            this.f409o = rect.left;
        } else {
            this.f409o = rect.right - this.f388Z;
        }
        m463c(0.0f, z2);
        float height = this.f387Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f387Y;
        if (staticLayout2 == null || this.f396d0 <= 1) {
            CharSequence charSequence3 = this.f364B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f387Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f399f, this.f365C ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        Rect rect2 = this.f393c;
        if (i4 == 48) {
            this.f406l = rect2.top;
        } else if (i4 != 80) {
            this.f406l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f406l = textPaint.descent() + (rect2.bottom - height);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.f408n = rect2.centerX() - (measureText / 2.0f);
        } else if (i5 != 5) {
            this.f408n = rect2.left;
        } else {
            this.f408n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f367E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f367E = null;
        }
        m471l(this.f391b);
        float f = this.f391b;
        float m461f = m461f(rect2.left, rect.left, f, this.f378P);
        RectF rectF = this.f397e;
        rectF.left = m461f;
        rectF.top = m461f(this.f406l, this.f407m, f, this.f378P);
        rectF.right = m461f(rect2.right, rect.right, f, this.f378P);
        rectF.bottom = m461f(rect2.bottom, rect.bottom, f, this.f378P);
        this.f410p = m461f(this.f408n, this.f409o, f, this.f378P);
        this.f411q = m461f(this.f406l, this.f407m, f, this.f378P);
        m471l(f);
        C0549a c0549a = AbstractC1188a.f4553b;
        this.f390a0 = 1.0f - m461f(0.0f, 1.0f, 1.0f - f, c0549a);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        textInputLayout.postInvalidateOnAnimation();
        this.f392b0 = m461f(1.0f, 0.0f, f, c0549a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f405k;
        ColorStateList colorStateList2 = this.f404j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m460a(m465e(colorStateList2), m465e(this.f405k), f));
        } else {
            textPaint.setColor(m465e(colorStateList));
        }
        float f2 = this.f384V;
        float f3 = this.f385W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m461f(f3, f2, f, c0549a));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f370H = AbstractC1188a.m2747a(0.0f, this.f380R, f);
        this.f371I = AbstractC1188a.m2747a(0.0f, this.f381S, f);
        this.f372J = AbstractC1188a.m2747a(0.0f, this.f382T, f);
        int m460a = m460a(0, m465e(this.f383U), f);
        this.f373K = m460a;
        textPaint.setShadowLayer(this.f370H, this.f371I, this.f372J, m460a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* renamed from: i */
    public final void m468i(ColorStateList colorStateList) {
        if (this.f405k == colorStateList && this.f404j == colorStateList) {
            return;
        }
        this.f405k = colorStateList;
        this.f404j = colorStateList;
        m467h(false);
    }

    /* renamed from: j */
    public final boolean m469j(Typeface typeface) {
        C0228a c0228a = this.f419y;
        if (c0228a != null) {
            c0228a.f673j = true;
        }
        if (this.f414t == typeface) {
            return false;
        }
        this.f414t = typeface;
        Typeface m330R = AbstractC0096d.m330R(this.f389a.getContext().getResources().getConfiguration(), typeface);
        this.f413s = m330R;
        if (m330R == null) {
            m330R = this.f414t;
        }
        this.f412r = m330R;
        return true;
    }

    /* renamed from: k */
    public final void m470k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f391b) {
            this.f391b = f;
            float f2 = this.f393c.left;
            Rect rect = this.f395d;
            float m461f = m461f(f2, rect.left, f, this.f378P);
            RectF rectF = this.f397e;
            rectF.left = m461f;
            rectF.top = m461f(this.f406l, this.f407m, f, this.f378P);
            rectF.right = m461f(r1.right, rect.right, f, this.f378P);
            rectF.bottom = m461f(r1.bottom, rect.bottom, f, this.f378P);
            this.f410p = m461f(this.f408n, this.f409o, f, this.f378P);
            this.f411q = m461f(this.f406l, this.f407m, f, this.f378P);
            m471l(f);
            C0549a c0549a = AbstractC1188a.f4553b;
            this.f390a0 = 1.0f - m461f(0.0f, 1.0f, 1.0f - f, c0549a);
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            TextInputLayout textInputLayout = this.f389a;
            textInputLayout.postInvalidateOnAnimation();
            this.f392b0 = m461f(1.0f, 0.0f, f, c0549a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f405k;
            ColorStateList colorStateList2 = this.f404j;
            TextPaint textPaint = this.f376N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m460a(m465e(colorStateList2), m465e(this.f405k), f));
            } else {
                textPaint.setColor(m465e(colorStateList));
            }
            float f3 = this.f384V;
            float f4 = this.f385W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m461f(f4, f3, f, c0549a));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f370H = AbstractC1188a.m2747a(0.0f, this.f380R, f);
            this.f371I = AbstractC1188a.m2747a(0.0f, this.f381S, f);
            this.f372J = AbstractC1188a.m2747a(0.0f, this.f382T, f);
            int m460a = m460a(0, m465e(this.f383U), f);
            this.f373K = m460a;
            textPaint.setShadowLayer(this.f370H, this.f371I, this.f372J, m460a);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* renamed from: l */
    public final void m471l(float f) {
        m463c(f, false);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        this.f389a.postInvalidateOnAnimation();
    }

    /* renamed from: m */
    public final void m472m(Typeface typeface) {
        boolean z2;
        boolean m469j = m469j(typeface);
        if (this.f417w != typeface) {
            this.f417w = typeface;
            Typeface m330R = AbstractC0096d.m330R(this.f389a.getContext().getResources().getConfiguration(), typeface);
            this.f416v = m330R;
            if (m330R == null) {
                m330R = this.f417w;
            }
            this.f415u = m330R;
            z2 = true;
        } else {
            z2 = false;
        }
        if (m469j || z2) {
            m467h(false);
        }
    }
}
