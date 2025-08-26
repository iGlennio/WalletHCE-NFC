package p088j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import p001A1.C0010i;
import p010D1.AbstractC0104l;

/* renamed from: j.y */
/* loaded from: classes.dex */
public class C1047y extends ImageButton {

    /* renamed from: a */
    public final C1020p f4117a;

    /* renamed from: b */
    public final C0010i f4118b;

    /* renamed from: c */
    public boolean f4119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1047y(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC1001i1.m2479a(context);
        this.f4119c = false;
        AbstractC0998h1.m2474a(this, getContext());
        C1020p c1020p = new C1020p(this);
        this.f4117a = c1020p;
        c1020p.m2509d(attributeSet, i2);
        C0010i c0010i = new C0010i(this);
        this.f4118b = c0010i;
        c0010i.m29e(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1020p c1020p = this.f4117a;
        if (c1020p != null) {
            c1020p.m2506a();
        }
        C0010i c0010i = this.f4118b;
        if (c0010i != null) {
            c0010i.m27a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1020p c1020p = this.f4117a;
        if (c1020p != null) {
            return c1020p.m2507b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1020p c1020p = this.f4117a;
        if (c1020p != null) {
            return c1020p.m2508c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1004j1 c1004j1;
        C0010i c0010i = this.f4118b;
        if (c0010i == null || (c1004j1 = (C1004j1) c0010i.f20d) == null) {
            return null;
        }
        return (ColorStateList) c1004j1.f3959c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1004j1 c1004j1;
        C0010i c0010i = this.f4118b;
        if (c0010i == null || (c1004j1 = (C1004j1) c0010i.f20d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c1004j1.f3960d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f4118b.f19c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1020p c1020p = this.f4117a;
        if (c1020p != null) {
            c1020p.m2510e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C1020p c1020p = this.f4117a;
        if (c1020p != null) {
            c1020p.m2511f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0010i c0010i = this.f4118b;
        if (c0010i != null) {
            c0010i.m27a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0010i c0010i = this.f4118b;
        if (c0010i != null && drawable != null && !this.f4119c) {
            c0010i.f18b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0010i != null) {
            c0010i.m27a();
            if (this.f4119c) {
                return;
            }
            ImageView imageView = (ImageView) c0010i.f19c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0010i.f18b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f4119c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0010i c0010i = this.f4118b;
        ImageView imageView = (ImageView) c0010i.f19c;
        if (i2 != 0) {
            Drawable m415w = AbstractC0104l.m415w(imageView.getContext(), i2);
            if (m415w != null) {
                AbstractC1027r0.m2515a(m415w);
            }
            imageView.setImageDrawable(m415w);
        } else {
            imageView.setImageDrawable(null);
        }
        c0010i.m27a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0010i c0010i = this.f4118b;
        if (c0010i != null) {
            c0010i.m27a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1020p c1020p = this.f4117a;
        if (c1020p != null) {
            c1020p.m2513h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1020p c1020p = this.f4117a;
        if (c1020p != null) {
            c1020p.m2514i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0010i c0010i = this.f4118b;
        if (c0010i != null) {
            if (((C1004j1) c0010i.f20d) == null) {
                c0010i.f20d = new C1004j1();
            }
            C1004j1 c1004j1 = (C1004j1) c0010i.f20d;
            c1004j1.f3959c = colorStateList;
            c1004j1.f3958b = true;
            c0010i.m27a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0010i c0010i = this.f4118b;
        if (c0010i != null) {
            if (((C1004j1) c0010i.f20d) == null) {
                c0010i.f20d = new C1004j1();
            }
            C1004j1 c1004j1 = (C1004j1) c0010i.f20d;
            c1004j1.f3960d = mode;
            c1004j1.f3957a = true;
            c0010i.m27a();
        }
    }
}
