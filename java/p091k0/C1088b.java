package p091k0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import p008D.AbstractC0087a;
import p131y0.C1318a;
import p131y0.C1320c;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public final class C1088b extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C1318a f4233a;

    public C1088b(C1318a c1318a) {
        this.f4233a = c1318a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f4233a.f5378b.f5394o;
        if (colorStateList != null) {
            AbstractC0087a.m305h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C1320c c1320c = this.f4233a.f5378b;
        ColorStateList colorStateList = c1320c.f5394o;
        if (colorStateList != null) {
            AbstractC0087a.m304g(drawable, colorStateList.getColorForState(c1320c.f5398s, colorStateList.getDefaultColor()));
        }
    }
}
