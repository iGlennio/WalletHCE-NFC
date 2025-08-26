package p034M0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import p005C.AbstractC0038a;
import p005C.C0046i;
import p006C0.AbstractC0053a;
import p006C0.AbstractC0055c;
import p009D0.C0092a;
import p031L0.C0353a;
import p047Q1.AbstractC0458e;

/* renamed from: M0.g */
/* loaded from: classes.dex */
public class C0362g extends Drawable implements InterfaceC0377v {

    /* renamed from: w */
    public static final Paint f930w;

    /* renamed from: a */
    public C0361f f931a;

    /* renamed from: b */
    public final AbstractC0375t[] f932b;

    /* renamed from: c */
    public final AbstractC0375t[] f933c;

    /* renamed from: d */
    public final BitSet f934d;

    /* renamed from: e */
    public boolean f935e;

    /* renamed from: f */
    public final Matrix f936f;

    /* renamed from: g */
    public final Path f937g;

    /* renamed from: h */
    public final Path f938h;

    /* renamed from: i */
    public final RectF f939i;

    /* renamed from: j */
    public final RectF f940j;

    /* renamed from: k */
    public final Region f941k;

    /* renamed from: l */
    public final Region f942l;

    /* renamed from: m */
    public C0366k f943m;

    /* renamed from: n */
    public final Paint f944n;

    /* renamed from: o */
    public final Paint f945o;

    /* renamed from: p */
    public final C0353a f946p;

    /* renamed from: q */
    public final C0046i f947q;

    /* renamed from: r */
    public final C0368m f948r;

    /* renamed from: s */
    public PorterDuffColorFilter f949s;

    /* renamed from: t */
    public PorterDuffColorFilter f950t;

    /* renamed from: u */
    public final RectF f951u;

    /* renamed from: v */
    public final boolean f952v;

    static {
        Paint paint = new Paint(1);
        f930w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0362g() {
        this(new C0366k());
    }

    /* renamed from: a */
    public final void m1018a(RectF rectF, Path path) {
        C0361f c0361f = this.f931a;
        this.f948r.m1038a(c0361f.f914a, c0361f.f922i, rectF, this.f947q, path);
        if (this.f931a.f921h != 1.0f) {
            Matrix matrix = this.f936f;
            matrix.reset();
            float f = this.f931a.f921h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f951u, true);
    }

    /* renamed from: b */
    public final int m1019b(int i2) {
        int i3;
        C0361f c0361f = this.f931a;
        float f = c0361f.f926m + 0.0f + c0361f.f925l;
        C0092a c0092a = c0361f.f915b;
        if (c0092a == null || !c0092a.f278a || AbstractC0038a.m112d(i2, 255) != c0092a.f281d) {
            return i2;
        }
        float min = (c0092a.f282e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i2);
        int m1174H = AbstractC0458e.m1174H(AbstractC0038a.m112d(i2, 255), c0092a.f279b, min);
        if (min > 0.0f && (i3 = c0092a.f280c) != 0) {
            m1174H = AbstractC0038a.m110b(AbstractC0038a.m112d(i3, C0092a.f277f), m1174H);
        }
        return AbstractC0038a.m112d(m1174H, alpha);
    }

    /* renamed from: c */
    public final void m1020c(Canvas canvas) {
        if (this.f934d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.f931a.f928o;
        Path path = this.f937g;
        C0353a c0353a = this.f946p;
        if (i2 != 0) {
            canvas.drawPath(path, c0353a.f900a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            AbstractC0375t abstractC0375t = this.f932b[i3];
            int i4 = this.f931a.f927n;
            Matrix matrix = AbstractC0375t.f1007b;
            abstractC0375t.mo1040a(matrix, c0353a, i4, canvas);
            this.f933c[i3].mo1040a(matrix, c0353a, this.f931a.f927n, canvas);
        }
        if (this.f952v) {
            double d2 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * this.f931a.f928o);
            int cos = (int) (Math.cos(Math.toRadians(d2)) * this.f931a.f928o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f930w);
            canvas.translate(sin, cos);
        }
    }

    /* renamed from: d */
    public final void m1021d(Canvas canvas, Paint paint, Path path, C0366k c0366k, RectF rectF) {
        if (!c0366k.m1036d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float mo1004a = c0366k.f971f.mo1004a(rectF) * this.f931a.f922i;
            canvas.drawRoundRect(rectF, mo1004a, mo1004a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f944n;
        paint.setColorFilter(this.f949s);
        int alpha = paint.getAlpha();
        int i2 = this.f931a.f924k;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f945o;
        paint2.setColorFilter(this.f950t);
        paint2.setStrokeWidth(this.f931a.f923j);
        int alpha2 = paint2.getAlpha();
        int i3 = this.f931a.f924k;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f935e;
        Path path = this.f937g;
        if (z2) {
            float f = -(m1024g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C0366k c0366k = this.f931a.f914a;
            C0365j m1037e = c0366k.m1037e();
            InterfaceC0358c interfaceC0358c = c0366k.f970e;
            if (!(interfaceC0358c instanceof C0363h)) {
                interfaceC0358c = new C0357b(f, interfaceC0358c);
            }
            m1037e.f958e = interfaceC0358c;
            InterfaceC0358c interfaceC0358c2 = c0366k.f971f;
            if (!(interfaceC0358c2 instanceof C0363h)) {
                interfaceC0358c2 = new C0357b(f, interfaceC0358c2);
            }
            m1037e.f959f = interfaceC0358c2;
            InterfaceC0358c interfaceC0358c3 = c0366k.f973h;
            if (!(interfaceC0358c3 instanceof C0363h)) {
                interfaceC0358c3 = new C0357b(f, interfaceC0358c3);
            }
            m1037e.f961h = interfaceC0358c3;
            InterfaceC0358c interfaceC0358c4 = c0366k.f972g;
            if (!(interfaceC0358c4 instanceof C0363h)) {
                interfaceC0358c4 = new C0357b(f, interfaceC0358c4);
            }
            m1037e.f960g = interfaceC0358c4;
            C0366k m1032a = m1037e.m1032a();
            this.f943m = m1032a;
            float f2 = this.f931a.f922i;
            RectF rectF = this.f940j;
            rectF.set(m1023f());
            float strokeWidth = m1024g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f948r.m1038a(m1032a, f2, rectF, null, this.f938h);
            m1018a(m1023f(), path);
            this.f935e = false;
        }
        C0361f c0361f = this.f931a;
        c0361f.getClass();
        if (c0361f.f927n > 0) {
            int i4 = Build.VERSION.SDK_INT;
            if (!this.f931a.f914a.m1036d(m1023f()) && !path.isConvex() && i4 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * this.f931a.f928o), (int) (Math.cos(Math.toRadians(d2)) * this.f931a.f928o));
                if (this.f952v) {
                    RectF rectF2 = this.f951u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f931a.f927n * 2) + ((int) rectF2.width()) + width, (this.f931a.f927n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f3 = (getBounds().left - this.f931a.f927n) - width;
                    float f4 = (getBounds().top - this.f931a.f927n) - height;
                    canvas2.translate(-f3, -f4);
                    m1020c(canvas2);
                    canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    m1020c(canvas);
                    canvas.restore();
                }
            }
        }
        C0361f c0361f2 = this.f931a;
        Paint.Style style = c0361f2.f929p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m1021d(canvas, paint, path, c0361f2.f914a, m1023f());
        }
        if (m1024g()) {
            mo1022e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* renamed from: e */
    public void mo1022e(Canvas canvas) {
        Paint paint = this.f945o;
        Path path = this.f938h;
        C0366k c0366k = this.f943m;
        RectF rectF = this.f940j;
        rectF.set(m1023f());
        float strokeWidth = m1024g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m1021d(canvas, paint, path, c0366k, rectF);
    }

    /* renamed from: f */
    public final RectF m1023f() {
        RectF rectF = this.f939i;
        rectF.set(getBounds());
        return rectF;
    }

    /* renamed from: g */
    public final boolean m1024g() {
        Paint.Style style = this.f931a.f929p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f945o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f931a.f924k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f931a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f931a.getClass();
        if (this.f931a.f914a.m1036d(m1023f())) {
            outline.setRoundRect(getBounds(), this.f931a.f914a.f970e.mo1004a(m1023f()) * this.f931a.f922i);
            return;
        }
        RectF m1023f = m1023f();
        Path path = this.f937g;
        m1018a(m1023f, path);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            AbstractC0055c.m240a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                AbstractC0053a.m209a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0053a.m209a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f931a.f920g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f941k;
        region.set(bounds);
        RectF m1023f = m1023f();
        Path path = this.f937g;
        m1018a(m1023f, path);
        Region region2 = this.f942l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: h */
    public final void m1025h(Context context) {
        this.f931a.f915b = new C0092a(context);
        m1030m();
    }

    /* renamed from: i */
    public final void m1026i(float f) {
        C0361f c0361f = this.f931a;
        if (c0361f.f926m != f) {
            c0361f.f926m = f;
            m1030m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f935e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f931a.f918e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f931a.getClass();
        ColorStateList colorStateList2 = this.f931a.f917d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f931a.f916c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* renamed from: j */
    public final void m1027j(ColorStateList colorStateList) {
        C0361f c0361f = this.f931a;
        if (c0361f.f916c != colorStateList) {
            c0361f.f916c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k */
    public final boolean m1028k(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f931a.f916c == null || color2 == (colorForState2 = this.f931a.f916c.getColorForState(iArr, (color2 = (paint2 = this.f944n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f931a.f917d == null || color == (colorForState = this.f931a.f917d.getColorForState(iArr, (color = (paint = this.f945o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: l */
    public final boolean m1029l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f949s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f950t;
        C0361f c0361f = this.f931a;
        ColorStateList colorStateList = c0361f.f918e;
        PorterDuff.Mode mode = c0361f.f919f;
        Paint paint = this.f944n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int m1019b = m1019b(color);
            porterDuffColorFilter = m1019b != color ? new PorterDuffColorFilter(m1019b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m1019b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f949s = porterDuffColorFilter;
        this.f931a.getClass();
        this.f950t = null;
        this.f931a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f949s) && Objects.equals(porterDuffColorFilter3, this.f950t)) ? false : true;
    }

    /* renamed from: m */
    public final void m1030m() {
        C0361f c0361f = this.f931a;
        float f = c0361f.f926m + 0.0f;
        c0361f.f927n = (int) Math.ceil(0.75f * f);
        this.f931a.f928o = (int) Math.ceil(f * 0.25f);
        m1029l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f931a = new C0361f(this.f931a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f935e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = m1028k(iArr) || m1029l();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        C0361f c0361f = this.f931a;
        if (c0361f.f924k != i2) {
            c0361f.f924k = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f931a.getClass();
        super.invalidateSelf();
    }

    @Override // p034M0.InterfaceC0377v
    public final void setShapeAppearanceModel(C0366k c0366k) {
        this.f931a.f914a = c0366k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f931a.f918e = colorStateList;
        m1029l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0361f c0361f = this.f931a;
        if (c0361f.f919f != mode) {
            c0361f.f919f = mode;
            m1029l();
            super.invalidateSelf();
        }
    }

    public C0362g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(C0366k.m1034b(context, attributeSet, i2, i3).m1032a());
    }

    public C0362g(C0366k c0366k) {
        this(new C0361f(c0366k));
    }

    public C0362g(C0361f c0361f) {
        C0368m c0368m;
        this.f932b = new AbstractC0375t[4];
        this.f933c = new AbstractC0375t[4];
        this.f934d = new BitSet(8);
        this.f936f = new Matrix();
        this.f937g = new Path();
        this.f938h = new Path();
        this.f939i = new RectF();
        this.f940j = new RectF();
        this.f941k = new Region();
        this.f942l = new Region();
        Paint paint = new Paint(1);
        this.f944n = paint;
        Paint paint2 = new Paint(1);
        this.f945o = paint2;
        this.f946p = new C0353a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0368m = AbstractC0367l.f978a;
        } else {
            c0368m = new C0368m();
        }
        this.f948r = c0368m;
        this.f951u = new RectF();
        this.f952v = true;
        this.f931a = c0361f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m1029l();
        m1028k(getState());
        this.f947q = new C0046i(5, this);
    }
}
