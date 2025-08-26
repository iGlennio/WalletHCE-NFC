package p091k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002B.AbstractC0012b;
import p002B.AbstractC0013c;
import p008D.AbstractC0087a;
import p008D.AbstractC0088b;
import p010D1.AbstractC0096d;
import p047Q1.AbstractC0458e;
import p101o.C1152b;

/* renamed from: k0.p */
/* loaded from: classes.dex */
public final class C1102p extends AbstractC1093g {

    /* renamed from: j */
    public static final PorterDuff.Mode f4300j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public C1100n f4301b;

    /* renamed from: c */
    public PorterDuffColorFilter f4302c;

    /* renamed from: d */
    public ColorFilter f4303d;

    /* renamed from: e */
    public boolean f4304e;

    /* renamed from: f */
    public boolean f4305f;

    /* renamed from: g */
    public final float[] f4306g;

    /* renamed from: h */
    public final Matrix f4307h;

    /* renamed from: i */
    public final Rect f4308i;

    public C1102p() {
        this.f4305f = true;
        this.f4306g = new float[9];
        this.f4307h = new Matrix();
        this.f4308i = new Rect();
        C1100n c1100n = new C1100n();
        c1100n.f4289c = null;
        c1100n.f4290d = f4300j;
        c1100n.f4288b = new C1099m();
        this.f4301b = c1100n;
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m2618a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4245a;
        if (drawable == null) {
            return false;
        }
        AbstractC0087a.m299b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f4308i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4303d;
        if (colorFilter == null) {
            colorFilter = this.f4302c;
        }
        Matrix matrix = this.f4307h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f4306g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC0088b.m307a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C1100n c1100n = this.f4301b;
        Bitmap bitmap = c1100n.f4292f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c1100n.f4292f.getHeight()) {
            c1100n.f4292f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c1100n.f4297k = true;
        }
        if (this.f4305f) {
            C1100n c1100n2 = this.f4301b;
            if (c1100n2.f4297k || c1100n2.f4293g != c1100n2.f4289c || c1100n2.f4294h != c1100n2.f4290d || c1100n2.f4296j != c1100n2.f4291e || c1100n2.f4295i != c1100n2.f4288b.getRootAlpha()) {
                C1100n c1100n3 = this.f4301b;
                c1100n3.f4292f.eraseColor(0);
                Canvas canvas2 = new Canvas(c1100n3.f4292f);
                C1099m c1099m = c1100n3.f4288b;
                c1099m.m2617a(c1099m.f4278g, C1099m.f4271p, canvas2, min, min2);
                C1100n c1100n4 = this.f4301b;
                c1100n4.f4293g = c1100n4.f4289c;
                c1100n4.f4294h = c1100n4.f4290d;
                c1100n4.f4295i = c1100n4.f4288b.getRootAlpha();
                c1100n4.f4296j = c1100n4.f4291e;
                c1100n4.f4297k = false;
            }
        } else {
            C1100n c1100n5 = this.f4301b;
            c1100n5.f4292f.eraseColor(0);
            Canvas canvas3 = new Canvas(c1100n5.f4292f);
            C1099m c1099m2 = c1100n5.f4288b;
            c1099m2.m2617a(c1099m2.f4278g, C1099m.f4271p, canvas3, min, min2);
        }
        C1100n c1100n6 = this.f4301b;
        if (c1100n6.f4288b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c1100n6.f4298l == null) {
                Paint paint2 = new Paint();
                c1100n6.f4298l = paint2;
                paint2.setFilterBitmap(true);
            }
            c1100n6.f4298l.setAlpha(c1100n6.f4288b.getRootAlpha());
            c1100n6.f4298l.setColorFilter(colorFilter);
            paint = c1100n6.f4298l;
        }
        canvas.drawBitmap(c1100n6.f4292f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.getAlpha() : this.f4301b.f4288b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4301b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4245a;
        return drawable != null ? AbstractC0087a.m300c(drawable) : this.f4303d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4245a != null) {
            return new C1101o(this.f4245a.getConstantState());
        }
        this.f4301b.f4287a = getChangingConfigurations();
        return this.f4301b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4301b.f4288b.f4280i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4301b.f4288b.f4279h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.isAutoMirrored() : this.f4301b.f4291e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C1100n c1100n = this.f4301b;
        if (c1100n == null) {
            return false;
        }
        C1099m c1099m = c1100n.f4288b;
        if (c1099m.f4285n == null) {
            c1099m.f4285n = Boolean.valueOf(c1099m.f4278g.mo2614a());
        }
        if (c1099m.f4285n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f4301b.f4289c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4304e && super.mutate() == this) {
            C1100n c1100n = this.f4301b;
            C1100n c1100n2 = new C1100n();
            c1100n2.f4289c = null;
            c1100n2.f4290d = f4300j;
            if (c1100n != null) {
                c1100n2.f4287a = c1100n.f4287a;
                C1099m c1099m = new C1099m(c1100n.f4288b);
                c1100n2.f4288b = c1099m;
                if (c1100n.f4288b.f4276e != null) {
                    c1099m.f4276e = new Paint(c1100n.f4288b.f4276e);
                }
                if (c1100n.f4288b.f4275d != null) {
                    c1100n2.f4288b.f4275d = new Paint(c1100n.f4288b.f4275d);
                }
                c1100n2.f4289c = c1100n.f4289c;
                c1100n2.f4290d = c1100n.f4290d;
                c1100n2.f4291e = c1100n.f4291e;
            }
            this.f4301b = c1100n2;
            this.f4304e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1100n c1100n = this.f4301b;
        ColorStateList colorStateList = c1100n.f4289c;
        if (colorStateList == null || (mode = c1100n.f4290d) == null) {
            z2 = false;
        } else {
            this.f4302c = m2618a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C1099m c1099m = c1100n.f4288b;
        if (c1099m.f4285n == null) {
            c1099m.f4285n = Boolean.valueOf(c1099m.f4278g.mo2614a());
        }
        if (c1099m.f4285n.booleanValue()) {
            boolean mo2615b = c1100n.f4288b.f4278g.mo2615b(iArr);
            c1100n.f4297k |= mo2615b;
            if (mo2615b) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f4301b.f4288b.getRootAlpha() != i2) {
            this.f4301b.f4288b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4301b.f4291e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4303d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            AbstractC0096d.m342d0(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            AbstractC0087a.m305h(drawable, colorStateList);
            return;
        }
        C1100n c1100n = this.f4301b;
        if (c1100n.f4289c != colorStateList) {
            c1100n.f4289c = colorStateList;
            this.f4302c = m2618a(colorStateList, c1100n.f4290d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            AbstractC0087a.m306i(drawable, mode);
            return;
        }
        C1100n c1100n = this.f4301b;
        if (c1100n.f4290d != mode) {
            c1100n.f4290d = mode;
            this.f4302c = m2618a(c1100n.f4289c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1099m c1099m;
        int i2;
        boolean z2;
        char c2;
        int i3;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            AbstractC0087a.m301d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1100n c1100n = this.f4301b;
        c1100n.f4288b = new C1099m();
        TypedArray m37f = AbstractC0012b.m37f(resources, theme, attributeSet, AbstractC1087a.f4227a);
        C1100n c1100n2 = this.f4301b;
        C1099m c1099m2 = c1100n2.f4288b;
        int i4 = !AbstractC0012b.m34c(xmlPullParser, "tintMode") ? -1 : m37f.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c1100n2.f4290d = mode;
        int i5 = 1;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            m37f.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i6 >= 28 && i6 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = m37f.getResources();
                int resourceId = m37f.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0013c.f34a;
                try {
                    colorStateList = AbstractC0013c.m45a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c1100n2.f4289c = colorStateList2;
        }
        boolean z3 = c1100n2.f4291e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z3 = m37f.getBoolean(5, z3);
        }
        c1100n2.f4291e = z3;
        float f = c1099m2.f4281j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = m37f.getFloat(7, f);
        }
        c1099m2.f4281j = f;
        float f2 = c1099m2.f4282k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = m37f.getFloat(8, f2);
        }
        c1099m2.f4282k = f2;
        boolean z4 = false;
        if (c1099m2.f4281j <= 0.0f) {
            throw new XmlPullParserException(m37f.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c1099m2.f4279h = m37f.getDimension(3, c1099m2.f4279h);
            float dimension = m37f.getDimension(2, c1099m2.f4280i);
            c1099m2.f4280i = dimension;
            if (c1099m2.f4279h <= 0.0f) {
                throw new XmlPullParserException(m37f.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c1099m2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = m37f.getFloat(4, alpha);
                }
                c1099m2.setAlpha(alpha);
                String string = m37f.getString(0);
                if (string != null) {
                    c1099m2.f4284m = string;
                    c1099m2.f4286o.put(string, c1099m2);
                }
                m37f.recycle();
                c1100n.f4287a = getChangingConfigurations();
                c1100n.f4297k = true;
                C1100n c1100n3 = this.f4301b;
                C1099m c1099m3 = c1100n3.f4288b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c1099m3.f4278g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z5 = true;
                while (eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C1096j c1096j = (C1096j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i2 = depth;
                        C1152b c1152b = c1099m3.f4286o;
                        if (equals) {
                            C1095i c1095i = new C1095i();
                            c1095i.f4247e = 0.0f;
                            c1095i.f4249g = 1.0f;
                            c1095i.f4250h = 1.0f;
                            c1099m = c1099m3;
                            c1095i.f4251i = 0.0f;
                            c1095i.f4252j = 1.0f;
                            c1095i.f4253k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c1095i.f4254l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c1095i.f4255m = join2;
                            c1095i.f4256n = 4.0f;
                            TypedArray m37f2 = AbstractC0012b.m37f(resources, theme, attributeSet, AbstractC1087a.f4229c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = m37f2.getString(0);
                                if (string2 != null) {
                                    c1095i.f4269b = string2;
                                }
                                String string3 = m37f2.getString(2);
                                if (string3 != null) {
                                    c1095i.f4268a = AbstractC0458e.m1199q(string3);
                                }
                                c1095i.f4248f = AbstractC0012b.m33b(m37f2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c1095i.f4250h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = m37f2.getFloat(12, f3);
                                }
                                c1095i.f4250h = f3;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? m37f2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c1095i.f4254l;
                                if (i7 == 0) {
                                    cap = cap2;
                                } else if (i7 != 1) {
                                    cap = i7 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c1095i.f4254l = cap;
                                int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? m37f2.getInt(9, -1) : -1;
                                Paint.Join join3 = c1095i.f4255m;
                                if (i8 == 0) {
                                    join = join2;
                                } else if (i8 != 1) {
                                    join = i8 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c1095i.f4255m = join;
                                float f4 = c1095i.f4256n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = m37f2.getFloat(10, f4);
                                }
                                c1095i.f4256n = f4;
                                c1095i.f4246d = AbstractC0012b.m33b(m37f2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c1095i.f4249g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = m37f2.getFloat(11, f5);
                                }
                                c1095i.f4249g = f5;
                                float f6 = c1095i.f4247e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = m37f2.getFloat(4, f6);
                                }
                                c1095i.f4247e = f6;
                                float f7 = c1095i.f4252j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = m37f2.getFloat(6, f7);
                                }
                                c1095i.f4252j = f7;
                                float f8 = c1095i.f4253k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = m37f2.getFloat(7, f8);
                                }
                                c1095i.f4253k = f8;
                                float f9 = c1095i.f4251i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = m37f2.getFloat(5, f9);
                                }
                                c1095i.f4251i = f9;
                                int i9 = c1095i.f4270c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i9 = m37f2.getInt(13, i9);
                                }
                                c1095i.f4270c = i9;
                            }
                            m37f2.recycle();
                            c1096j.f4258b.add(c1095i);
                            if (c1095i.getPathName() != null) {
                                c1152b.put(c1095i.getPathName(), c1095i);
                            }
                            c1100n3.f4287a = c1100n3.f4287a;
                            z5 = false;
                            c2 = '\b';
                            z2 = false;
                        } else {
                            c1099m = c1099m3;
                            c2 = '\b';
                            z2 = false;
                            if ("clip-path".equals(name)) {
                                C1094h c1094h = new C1094h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray m37f3 = AbstractC0012b.m37f(resources, theme, attributeSet, AbstractC1087a.f4230d);
                                    String string4 = m37f3.getString(0);
                                    if (string4 != null) {
                                        c1094h.f4269b = string4;
                                    }
                                    String string5 = m37f3.getString(1);
                                    if (string5 != null) {
                                        c1094h.f4268a = AbstractC0458e.m1199q(string5);
                                    }
                                    c1094h.f4270c = !AbstractC0012b.m34c(xmlPullParser, "fillType") ? 0 : m37f3.getInt(2, 0);
                                    m37f3.recycle();
                                }
                                c1096j.f4258b.add(c1094h);
                                if (c1094h.getPathName() != null) {
                                    c1152b.put(c1094h.getPathName(), c1094h);
                                }
                                c1100n3.f4287a = c1100n3.f4287a;
                            } else if ("group".equals(name)) {
                                C1096j c1096j2 = new C1096j();
                                TypedArray m37f4 = AbstractC0012b.m37f(resources, theme, attributeSet, AbstractC1087a.f4228b);
                                float f10 = c1096j2.f4259c;
                                if (AbstractC0012b.m34c(xmlPullParser, "rotation")) {
                                    f10 = m37f4.getFloat(5, f10);
                                }
                                c1096j2.f4259c = f10;
                                c1096j2.f4260d = m37f4.getFloat(1, c1096j2.f4260d);
                                c1096j2.f4261e = m37f4.getFloat(2, c1096j2.f4261e);
                                float f11 = c1096j2.f4262f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = m37f4.getFloat(3, f11);
                                }
                                c1096j2.f4262f = f11;
                                float f12 = c1096j2.f4263g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = m37f4.getFloat(4, f12);
                                }
                                c1096j2.f4263g = f12;
                                float f13 = c1096j2.f4264h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = m37f4.getFloat(6, f13);
                                }
                                c1096j2.f4264h = f13;
                                float f14 = c1096j2.f4265i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = m37f4.getFloat(7, f14);
                                }
                                c1096j2.f4265i = f14;
                                String string6 = m37f4.getString(0);
                                if (string6 != null) {
                                    c1096j2.f4267k = string6;
                                }
                                c1096j2.m2616c();
                                m37f4.recycle();
                                c1096j.f4258b.add(c1096j2);
                                arrayDeque.push(c1096j2);
                                if (c1096j2.getGroupName() != null) {
                                    c1152b.put(c1096j2.getGroupName(), c1096j2);
                                }
                                c1100n3.f4287a = c1100n3.f4287a;
                            }
                        }
                        i3 = 1;
                    } else {
                        c1099m = c1099m3;
                        i2 = depth;
                        z2 = z4;
                        c2 = '\b';
                        i3 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i3;
                    z4 = z2;
                    c1099m3 = c1099m;
                    depth = i2;
                }
                if (!z5) {
                    this.f4302c = m2618a(c1100n.f4289c, c1100n.f4290d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(m37f.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(m37f.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C1102p(C1100n c1100n) {
        this.f4305f = true;
        this.f4306g = new float[9];
        this.f4307h = new Matrix();
        this.f4308i = new Rect();
        this.f4301b = c1100n;
        this.f4302c = m2618a(c1100n.f4289c, c1100n.f4290d);
    }
}
