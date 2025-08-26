package p091k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: k0.e */
/* loaded from: classes.dex */
public final class C1091e extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4239a;

    public C1091e(Drawable.ConstantState constantState) {
        this.f4239a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4239a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4239a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1092f c1092f = new C1092f(null);
        Drawable newDrawable = this.f4239a.newDrawable();
        c1092f.f4245a = newDrawable;
        newDrawable.setCallback(c1092f.f4244f);
        return c1092f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1092f c1092f = new C1092f(null);
        Drawable newDrawable = this.f4239a.newDrawable(resources);
        c1092f.f4245a = newDrawable;
        newDrawable.setCallback(c1092f.f4244f);
        return c1092f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1092f c1092f = new C1092f(null);
        Drawable newDrawable = this.f4239a.newDrawable(resources, theme);
        c1092f.f4245a = newDrawable;
        newDrawable.setCallback(c1092f.f4244f);
        return c1092f;
    }
}
