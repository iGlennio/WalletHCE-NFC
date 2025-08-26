package p091k0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p101o.C1152b;

/* renamed from: k0.d */
/* loaded from: classes.dex */
public final class C1090d extends Drawable.ConstantState {

    /* renamed from: a */
    public C1102p f4235a;

    /* renamed from: b */
    public AnimatorSet f4236b;

    /* renamed from: c */
    public ArrayList f4237c;

    /* renamed from: d */
    public C1152b f4238d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
