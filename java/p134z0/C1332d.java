package p134z0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p008D.AbstractC0087a;
import p008D.AbstractC0088b;
import p008D.InterfaceC0090d;
import p014F0.C0124A;
import p014F0.C0126C;
import p014F0.InterfaceC0125B;
import p025J0.C0231d;
import p028K0.AbstractC0331a;
import p034M0.C0356a;
import p034M0.C0361f;
import p034M0.C0362g;
import p034M0.C0365j;
import p111r0.C1189b;

/* renamed from: z0.d */
/* loaded from: classes.dex */
public final class C1332d extends C0362g implements Drawable.Callback, InterfaceC0125B {

    /* renamed from: F0 */
    public static final int[] f5439F0 = {R.attr.state_enabled};

    /* renamed from: G0 */
    public static final ShapeDrawable f5440G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public float f5441A;

    /* renamed from: A0 */
    public WeakReference f5442A0;

    /* renamed from: B */
    public ColorStateList f5443B;

    /* renamed from: B0 */
    public TextUtils.TruncateAt f5444B0;

    /* renamed from: C */
    public float f5445C;

    /* renamed from: C0 */
    public boolean f5446C0;

    /* renamed from: D */
    public ColorStateList f5447D;

    /* renamed from: D0 */
    public int f5448D0;

    /* renamed from: E */
    public CharSequence f5449E;

    /* renamed from: E0 */
    public boolean f5450E0;

    /* renamed from: F */
    public boolean f5451F;

    /* renamed from: G */
    public Drawable f5452G;

    /* renamed from: H */
    public ColorStateList f5453H;

    /* renamed from: I */
    public float f5454I;

    /* renamed from: J */
    public boolean f5455J;

    /* renamed from: K */
    public boolean f5456K;

    /* renamed from: L */
    public Drawable f5457L;

    /* renamed from: M */
    public RippleDrawable f5458M;

    /* renamed from: N */
    public ColorStateList f5459N;

    /* renamed from: O */
    public float f5460O;

    /* renamed from: P */
    public SpannableStringBuilder f5461P;

    /* renamed from: Q */
    public boolean f5462Q;

    /* renamed from: R */
    public boolean f5463R;

    /* renamed from: S */
    public Drawable f5464S;

    /* renamed from: T */
    public ColorStateList f5465T;

    /* renamed from: U */
    public C1189b f5466U;

    /* renamed from: V */
    public C1189b f5467V;

    /* renamed from: W */
    public float f5468W;

    /* renamed from: X */
    public float f5469X;

    /* renamed from: Y */
    public float f5470Y;

    /* renamed from: Z */
    public float f5471Z;

    /* renamed from: a0 */
    public float f5472a0;

    /* renamed from: b0 */
    public float f5473b0;

    /* renamed from: c0 */
    public float f5474c0;

    /* renamed from: d0 */
    public float f5475d0;

    /* renamed from: e0 */
    public final Context f5476e0;

    /* renamed from: f0 */
    public final Paint f5477f0;

    /* renamed from: g0 */
    public final Paint.FontMetrics f5478g0;

    /* renamed from: h0 */
    public final RectF f5479h0;

    /* renamed from: i0 */
    public final PointF f5480i0;

    /* renamed from: j0 */
    public final Path f5481j0;

    /* renamed from: k0 */
    public final C0126C f5482k0;

    /* renamed from: l0 */
    public int f5483l0;

    /* renamed from: m0 */
    public int f5484m0;

    /* renamed from: n0 */
    public int f5485n0;

    /* renamed from: o0 */
    public int f5486o0;

    /* renamed from: p0 */
    public int f5487p0;

    /* renamed from: q0 */
    public int f5488q0;

    /* renamed from: r0 */
    public boolean f5489r0;

    /* renamed from: s0 */
    public int f5490s0;

    /* renamed from: t0 */
    public int f5491t0;

    /* renamed from: u0 */
    public ColorFilter f5492u0;

    /* renamed from: v0 */
    public PorterDuffColorFilter f5493v0;

    /* renamed from: w0 */
    public ColorStateList f5494w0;

    /* renamed from: x */
    public ColorStateList f5495x;

    /* renamed from: x0 */
    public PorterDuff.Mode f5496x0;

    /* renamed from: y */
    public ColorStateList f5497y;

    /* renamed from: y0 */
    public int[] f5498y0;

    /* renamed from: z */
    public float f5499z;

    /* renamed from: z0 */
    public ColorStateList f5500z0;

    public C1332d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.nfupay.s145.R.attr.chipStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Chip_Action);
        this.f5441A = -1.0f;
        this.f5477f0 = new Paint(1);
        this.f5478g0 = new Paint.FontMetrics();
        this.f5479h0 = new RectF();
        this.f5480i0 = new PointF();
        this.f5481j0 = new Path();
        this.f5491t0 = 255;
        this.f5496x0 = PorterDuff.Mode.SRC_IN;
        this.f5442A0 = new WeakReference(null);
        m1025h(context);
        this.f5476e0 = context;
        C0126C c0126c = new C0126C(this);
        this.f5482k0 = c0126c;
        this.f5449E = "";
        c0126c.f343a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f5439F0;
        setState(iArr);
        if (!Arrays.equals(this.f5498y0, iArr)) {
            this.f5498y0 = iArr;
            if (m3063T()) {
                m3070v(getState(), iArr);
            }
        }
        this.f5446C0 = true;
        int[] iArr2 = AbstractC0331a.f869a;
        f5440G0.setTint(-1);
    }

    /* renamed from: U */
    public static void m3041U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: s */
    public static boolean m3042s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: t */
    public static boolean m3043t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m3044A(float f) {
        if (this.f5441A != f) {
            this.f5441A = f;
            C0365j m1037e = this.f931a.f914a.m1037e();
            m1037e.f958e = new C0356a(f);
            m1037e.f959f = new C0356a(f);
            m1037e.f960g = new C0356a(f);
            m1037e.f961h = new C0356a(f);
            setShapeAppearanceModel(m1037e.m1032a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final void m3045B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5452G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0090d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float m3066p = m3066p();
            this.f5452G = drawable != null ? drawable.mutate() : null;
            float m3066p2 = m3066p();
            m3041U(drawable2);
            if (m3062S()) {
                m3064n(this.f5452G);
            }
            invalidateSelf();
            if (m3066p != m3066p2) {
                m3069u();
            }
        }
    }

    /* renamed from: C */
    public final void m3046C(float f) {
        if (this.f5454I != f) {
            float m3066p = m3066p();
            this.f5454I = f;
            float m3066p2 = m3066p();
            invalidateSelf();
            if (m3066p != m3066p2) {
                m3069u();
            }
        }
    }

    /* renamed from: D */
    public final void m3047D(ColorStateList colorStateList) {
        this.f5455J = true;
        if (this.f5453H != colorStateList) {
            this.f5453H = colorStateList;
            if (m3062S()) {
                AbstractC0087a.m305h(this.f5452G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: E */
    public final void m3048E(boolean z2) {
        if (this.f5451F != z2) {
            boolean m3062S = m3062S();
            this.f5451F = z2;
            boolean m3062S2 = m3062S();
            if (m3062S != m3062S2) {
                if (m3062S2) {
                    m3064n(this.f5452G);
                } else {
                    m3041U(this.f5452G);
                }
                invalidateSelf();
                m3069u();
            }
        }
    }

    /* renamed from: F */
    public final void m3049F(ColorStateList colorStateList) {
        if (this.f5443B != colorStateList) {
            this.f5443B = colorStateList;
            if (this.f5450E0) {
                C0361f c0361f = this.f931a;
                if (c0361f.f917d != colorStateList) {
                    c0361f.f917d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: G */
    public final void m3050G(float f) {
        if (this.f5445C != f) {
            this.f5445C = f;
            this.f5477f0.setStrokeWidth(f);
            if (this.f5450E0) {
                this.f931a.f923j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3051H(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r5.f5457L
            if (r1 == 0) goto Lb
            boolean r2 = r1 instanceof p008D.InterfaceC0090d
            if (r2 == 0) goto Lc
            D.d r1 = (p008D.InterfaceC0090d) r1
        Lb:
            r1 = r0
        Lc:
            if (r1 == r6) goto L49
            float r2 = r5.m3067q()
            if (r6 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r6.mutate()
        L18:
            r5.f5457L = r0
            int[] r6 = p028K0.AbstractC0331a.f869a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r0 = r5.f5447D
            android.content.res.ColorStateList r0 = p028K0.AbstractC0331a.m952a(r0)
            android.graphics.drawable.Drawable r3 = r5.f5457L
            android.graphics.drawable.ShapeDrawable r4 = p134z0.C1332d.f5440G0
            r6.<init>(r0, r3, r4)
            r5.f5458M = r6
            float r6 = r5.m3067q()
            m3041U(r1)
            boolean r0 = r5.m3063T()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r5.f5457L
            r5.m3064n(r0)
        L3f:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L49
            r5.m3069u()
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p134z0.C1332d.m3051H(android.graphics.drawable.Drawable):void");
    }

    /* renamed from: I */
    public final void m3052I(float f) {
        if (this.f5474c0 != f) {
            this.f5474c0 = f;
            invalidateSelf();
            if (m3063T()) {
                m3069u();
            }
        }
    }

    /* renamed from: J */
    public final void m3053J(float f) {
        if (this.f5460O != f) {
            this.f5460O = f;
            invalidateSelf();
            if (m3063T()) {
                m3069u();
            }
        }
    }

    /* renamed from: K */
    public final void m3054K(float f) {
        if (this.f5473b0 != f) {
            this.f5473b0 = f;
            invalidateSelf();
            if (m3063T()) {
                m3069u();
            }
        }
    }

    /* renamed from: L */
    public final void m3055L(ColorStateList colorStateList) {
        if (this.f5459N != colorStateList) {
            this.f5459N = colorStateList;
            if (m3063T()) {
                AbstractC0087a.m305h(this.f5457L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: M */
    public final void m3056M(boolean z2) {
        if (this.f5456K != z2) {
            boolean m3063T = m3063T();
            this.f5456K = z2;
            boolean m3063T2 = m3063T();
            if (m3063T != m3063T2) {
                if (m3063T2) {
                    m3064n(this.f5457L);
                } else {
                    m3041U(this.f5457L);
                }
                invalidateSelf();
                m3069u();
            }
        }
    }

    /* renamed from: N */
    public final void m3057N(float f) {
        if (this.f5470Y != f) {
            float m3066p = m3066p();
            this.f5470Y = f;
            float m3066p2 = m3066p();
            invalidateSelf();
            if (m3066p != m3066p2) {
                m3069u();
            }
        }
    }

    /* renamed from: O */
    public final void m3058O(float f) {
        if (this.f5469X != f) {
            float m3066p = m3066p();
            this.f5469X = f;
            float m3066p2 = m3066p();
            invalidateSelf();
            if (m3066p != m3066p2) {
                m3069u();
            }
        }
    }

    /* renamed from: P */
    public final void m3059P(ColorStateList colorStateList) {
        if (this.f5447D != colorStateList) {
            this.f5447D = colorStateList;
            this.f5500z0 = null;
            onStateChange(getState());
        }
    }

    /* renamed from: Q */
    public final void m3060Q(C0231d c0231d) {
        C0126C c0126c = this.f5482k0;
        if (c0126c.f348f != c0231d) {
            c0126c.f348f = c0231d;
            if (c0231d != null) {
                TextPaint textPaint = c0126c.f343a;
                Context context = this.f5476e0;
                C0124A c0124a = c0126c.f344b;
                c0231d.m638f(context, textPaint, c0124a);
                InterfaceC0125B interfaceC0125B = (InterfaceC0125B) c0126c.f347e.get();
                if (interfaceC0125B != null) {
                    textPaint.drawableState = interfaceC0125B.getState();
                }
                c0231d.m637e(context, textPaint, c0124a);
                c0126c.f346d = true;
            }
            InterfaceC0125B interfaceC0125B2 = (InterfaceC0125B) c0126c.f347e.get();
            if (interfaceC0125B2 != null) {
                C1332d c1332d = (C1332d) interfaceC0125B2;
                c1332d.m3069u();
                c1332d.invalidateSelf();
                c1332d.onStateChange(interfaceC0125B2.getState());
            }
        }
    }

    /* renamed from: R */
    public final boolean m3061R() {
        return this.f5463R && this.f5464S != null && this.f5489r0;
    }

    /* renamed from: S */
    public final boolean m3062S() {
        return this.f5451F && this.f5452G != null;
    }

    /* renamed from: T */
    public final boolean m3063T() {
        return this.f5456K && this.f5457L != null;
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2;
        Canvas canvas2;
        int i3;
        int i4;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.f5491t0) == 0) {
            return;
        }
        if (i2 < 255) {
            canvas2 = canvas;
            i3 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
        } else {
            canvas2 = canvas;
            i3 = 0;
        }
        boolean z2 = this.f5450E0;
        Paint paint = this.f5477f0;
        RectF rectF = this.f5479h0;
        if (!z2) {
            paint.setColor(this.f5483l0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m3068r(), m3068r(), paint);
        }
        if (!this.f5450E0) {
            paint.setColor(this.f5484m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f5492u0;
            if (colorFilter == null) {
                colorFilter = this.f5493v0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m3068r(), m3068r(), paint);
        }
        if (this.f5450E0) {
            super.draw(canvas);
        }
        if (this.f5445C > 0.0f && !this.f5450E0) {
            paint.setColor(this.f5486o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f5450E0) {
                ColorFilter colorFilter2 = this.f5492u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f5493v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f5445C / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f5441A - (this.f5445C / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f5487p0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f5450E0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f5481j0;
            C0361f c0361f = this.f931a;
            this.f948r.m1038a(c0361f.f914a, c0361f.f922i, rectF2, this.f947q, path);
            m1021d(canvas2, paint, path, this.f931a.f914a, m1023f());
        } else {
            canvas2.drawRoundRect(rectF, m3068r(), m3068r(), paint);
        }
        if (m3062S()) {
            m3065o(bounds, rectF);
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas2.translate(f4, f5);
            this.f5452G.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f5452G.draw(canvas2);
            canvas2.translate(-f4, -f5);
        }
        if (m3061R()) {
            m3065o(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f5464S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f5464S.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (this.f5446C0 && this.f5449E != null) {
            PointF pointF = this.f5480i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f5449E;
            C0126C c0126c = this.f5482k0;
            if (charSequence != null) {
                float m3066p = m3066p() + this.f5468W + this.f5471Z;
                if (AbstractC0088b.m307a(this) == 0) {
                    pointF.x = bounds.left + m3066p;
                } else {
                    pointF.x = bounds.right - m3066p;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = c0126c.f343a;
                Paint.FontMetrics fontMetrics = this.f5478g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f5449E != null) {
                float m3066p2 = m3066p() + this.f5468W + this.f5471Z;
                float m3067q = m3067q() + this.f5475d0 + this.f5472a0;
                if (AbstractC0088b.m307a(this) == 0) {
                    rectF.left = bounds.left + m3066p2;
                    rectF.right = bounds.right - m3067q;
                } else {
                    rectF.left = bounds.left + m3067q;
                    rectF.right = bounds.right - m3066p2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C0231d c0231d = c0126c.f348f;
            TextPaint textPaint2 = c0126c.f343a;
            if (c0231d != null) {
                textPaint2.drawableState = getState();
                c0126c.f348f.m637e(this.f5476e0, textPaint2, c0126c.f344b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(c0126c.m450a(this.f5449E.toString())) > Math.round(rectF.width());
            if (z3) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i4 = save;
            } else {
                i4 = 0;
            }
            CharSequence charSequence2 = this.f5449E;
            if (z3 && this.f5444B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.f5444B0);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z3) {
                canvas2.restoreToCount(i4);
            }
        }
        if (m3063T()) {
            rectF.setEmpty();
            if (m3063T()) {
                float f8 = this.f5475d0 + this.f5474c0;
                if (AbstractC0088b.m307a(this) == 0) {
                    float f9 = bounds.right - f8;
                    rectF.right = f9;
                    rectF.left = f9 - this.f5460O;
                } else {
                    float f10 = bounds.left + f8;
                    rectF.left = f10;
                    rectF.right = f10 + this.f5460O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f11 = this.f5460O;
                float f12 = exactCenterY - (f11 / 2.0f);
                rectF.top = f12;
                rectF.bottom = f12 + f11;
            }
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f5457L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = AbstractC0331a.f869a;
            this.f5458M.setBounds(this.f5457L.getBounds());
            this.f5458M.jumpToCurrentState();
            this.f5458M.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.f5491t0 < 255) {
            canvas2.restoreToCount(i3);
        }
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5491t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f5492u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f5499z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m3067q() + this.f5482k0.m450a(this.f5449E.toString()) + m3066p() + this.f5468W + this.f5471Z + this.f5472a0 + this.f5475d0), this.f5448D0);
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f5450E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f5499z, this.f5441A);
        } else {
            outline.setRoundRect(bounds, this.f5441A);
            outline2 = outline;
        }
        outline2.setAlpha(this.f5491t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m3042s(this.f5495x) || m3042s(this.f5497y) || m3042s(this.f5443B)) {
            return true;
        }
        C0231d c0231d = this.f5482k0.f348f;
        if (c0231d == null || (colorStateList = c0231d.f689j) == null || !colorStateList.isStateful()) {
            return (this.f5463R && this.f5464S != null && this.f5462Q) || m3043t(this.f5452G) || m3043t(this.f5464S) || m3042s(this.f5494w0);
        }
        return true;
    }

    /* renamed from: n */
    public final void m3064n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0088b.m308b(drawable, AbstractC0088b.m307a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f5457L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f5498y0);
            }
            AbstractC0087a.m305h(drawable, this.f5459N);
            return;
        }
        Drawable drawable2 = this.f5452G;
        if (drawable == drawable2 && this.f5455J) {
            AbstractC0087a.m305h(drawable2, this.f5453H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: o */
    public final void m3065o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m3062S() || m3061R()) {
            float f = this.f5468W + this.f5469X;
            Drawable drawable = this.f5489r0 ? this.f5464S : this.f5452G;
            float f2 = this.f5454I;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (AbstractC0088b.m307a(this) == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.f5489r0 ? this.f5464S : this.f5452G;
            float f5 = this.f5454I;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f5476e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (m3062S()) {
            onLayoutDirectionChanged |= AbstractC0088b.m308b(this.f5452G, i2);
        }
        if (m3061R()) {
            onLayoutDirectionChanged |= AbstractC0088b.m308b(this.f5464S, i2);
        }
        if (m3063T()) {
            onLayoutDirectionChanged |= AbstractC0088b.m308b(this.f5457L, i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (m3062S()) {
            onLevelChange |= this.f5452G.setLevel(i2);
        }
        if (m3061R()) {
            onLevelChange |= this.f5464S.setLevel(i2);
        }
        if (m3063T()) {
            onLevelChange |= this.f5457L.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f5450E0) {
            super.onStateChange(iArr);
        }
        return m3070v(iArr, this.f5498y0);
    }

    /* renamed from: p */
    public final float m3066p() {
        if (!m3062S() && !m3061R()) {
            return 0.0f;
        }
        float f = this.f5469X;
        Drawable drawable = this.f5489r0 ? this.f5464S : this.f5452G;
        float f2 = this.f5454I;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.f5470Y;
    }

    /* renamed from: q */
    public final float m3067q() {
        if (m3063T()) {
            return this.f5473b0 + this.f5460O + this.f5474c0;
        }
        return 0.0f;
    }

    /* renamed from: r */
    public final float m3068r() {
        return this.f5450E0 ? this.f931a.f914a.f970e.mo1004a(m1023f()) : this.f5441A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f5491t0 != i2) {
            this.f5491t0 = i2;
            invalidateSelf();
        }
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f5492u0 != colorFilter) {
            this.f5492u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f5494w0 != colorStateList) {
            this.f5494w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f5496x0 != mode) {
            this.f5496x0 = mode;
            ColorStateList colorStateList = this.f5494w0;
            this.f5493v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (m3062S()) {
            visible |= this.f5452G.setVisible(z2, z3);
        }
        if (m3061R()) {
            visible |= this.f5464S.setVisible(z2, z3);
        }
        if (m3063T()) {
            visible |= this.f5457L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: u */
    public final void m3069u() {
        InterfaceC1331c interfaceC1331c = (InterfaceC1331c) this.f5442A0.get();
        if (interfaceC1331c != null) {
            Chip chip = (Chip) interfaceC1331c;
            chip.m1939b(chip.f2613p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3070v(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p134z0.C1332d.m3070v(int[], int[]):boolean");
    }

    /* renamed from: w */
    public final void m3071w(boolean z2) {
        if (this.f5462Q != z2) {
            this.f5462Q = z2;
            float m3066p = m3066p();
            if (!z2 && this.f5489r0) {
                this.f5489r0 = false;
            }
            float m3066p2 = m3066p();
            invalidateSelf();
            if (m3066p != m3066p2) {
                m3069u();
            }
        }
    }

    /* renamed from: x */
    public final void m3072x(Drawable drawable) {
        if (this.f5464S != drawable) {
            float m3066p = m3066p();
            this.f5464S = drawable;
            float m3066p2 = m3066p();
            m3041U(this.f5464S);
            m3064n(this.f5464S);
            invalidateSelf();
            if (m3066p != m3066p2) {
                m3069u();
            }
        }
    }

    /* renamed from: y */
    public final void m3073y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f5465T != colorStateList) {
            this.f5465T = colorStateList;
            if (this.f5463R && (drawable = this.f5464S) != null && this.f5462Q) {
                AbstractC0087a.m305h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: z */
    public final void m3074z(boolean z2) {
        if (this.f5463R != z2) {
            boolean m3061R = m3061R();
            this.f5463R = z2;
            boolean m3061R2 = m3061R();
            if (m3061R != m3061R2) {
                if (m3061R2) {
                    m3064n(this.f5464S);
                } else {
                    m3041U(this.f5464S);
                }
                invalidateSelf();
                m3069u();
            }
        }
    }
}
