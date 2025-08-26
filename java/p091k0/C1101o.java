package p091k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: k0.o */
/* loaded from: classes.dex */
public final class C1101o extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4299a;

    public C1101o(Drawable.ConstantState constantState) {
        this.f4299a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4299a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4299a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1102p c1102p = new C1102p();
        c1102p.f4245a = (VectorDrawable) this.f4299a.newDrawable();
        return c1102p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1102p c1102p = new C1102p();
        c1102p.f4245a = (VectorDrawable) this.f4299a.newDrawable(resources);
        return c1102p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1102p c1102p = new C1102p();
        c1102p.f4245a = (VectorDrawable) this.f4299a.newDrawable(resources, theme);
        return c1102p;
    }
}
