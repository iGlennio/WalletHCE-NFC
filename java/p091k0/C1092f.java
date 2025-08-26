package p091k0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p002B.AbstractC0012b;
import p002B.AbstractC0020j;
import p002B.AbstractC0027q;
import p008D.AbstractC0087a;
import p010D1.AbstractC0096d;
import p017G0.C0177i;
import p101o.C1152b;

/* renamed from: k0.f */
/* loaded from: classes.dex */
public final class C1092f extends AbstractC1093g implements Animatable {

    /* renamed from: c */
    public final Context f4241c;

    /* renamed from: d */
    public C0177i f4242d = null;

    /* renamed from: e */
    public ArrayList f4243e = null;

    /* renamed from: f */
    public final C1089c f4244f = new C1089c(this);

    /* renamed from: b */
    public final C1090d f4240b = new C1090d();

    public C1092f(Context context) {
        this.f4241c = context;
    }

    @Override // p091k0.AbstractC1093g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            AbstractC0087a.m298a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            return AbstractC0087a.m299b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1090d c1090d = this.f4240b;
        c1090d.f4235a.draw(canvas);
        if (c1090d.f4236b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.getAlpha() : this.f4240b.f4235a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4240b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4245a;
        return drawable != null ? AbstractC0087a.m300c(drawable) : this.f4240b.f4235a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4245a != null) {
            return new C1091e(this.f4245a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4240b.f4235a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4240b.f4235a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.getOpacity() : this.f4240b.f4235a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1090d c1090d;
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            AbstractC0087a.m301d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c1090d = this.f4240b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m37f = AbstractC0012b.m37f(resources, theme, attributeSet, AbstractC1087a.f4231e);
                    int resourceId = m37f.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1102p c1102p = new C1102p();
                        ThreadLocal threadLocal = AbstractC0027q.f60a;
                        c1102p.f4245a = AbstractC0020j.m84a(resources, resourceId, theme);
                        new C1101o(c1102p.f4245a.getConstantState());
                        c1102p.f4305f = false;
                        c1102p.setCallback(this.f4244f);
                        C1102p c1102p2 = c1090d.f4235a;
                        if (c1102p2 != null) {
                            c1102p2.setCallback(null);
                        }
                        c1090d.f4235a = c1102p;
                    }
                    m37f.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1087a.f4232f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4241c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c1090d.f4235a.f4301b.f4288b.f4286o.getOrDefault(string, null));
                        if (c1090d.f4237c == null) {
                            c1090d.f4237c = new ArrayList();
                            c1090d.f4238d = new C1152b();
                        }
                        c1090d.f4237c.add(loadAnimator);
                        c1090d.f4238d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c1090d.f4236b == null) {
            c1090d.f4236b = new AnimatorSet();
        }
        c1090d.f4236b.playTogether(c1090d.f4237c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.isAutoMirrored() : this.f4240b.f4235a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4245a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4240b.f4236b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.isStateful() : this.f4240b.f4235a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4240b.f4235a.setBounds(rect);
        }
    }

    @Override // p091k0.AbstractC1093g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.setLevel(i2) : this.f4240b.f4235a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4245a;
        return drawable != null ? drawable.setState(iArr) : this.f4240b.f4235a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f4240b.f4235a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4240b.f4235a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4240b.f4235a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            AbstractC0096d.m342d0(drawable, i2);
        } else {
            this.f4240b.f4235a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            AbstractC0087a.m305h(drawable, colorStateList);
        } else {
            this.f4240b.f4235a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            AbstractC0087a.m306i(drawable, mode);
        } else {
            this.f4240b.f4235a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f4240b.f4235a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1090d c1090d = this.f4240b;
        if (c1090d.f4236b.isStarted()) {
            return;
        }
        c1090d.f4236b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4245a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4240b.f4236b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
