package p091k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: k0.n */
/* loaded from: classes.dex */
public final class C1100n extends Drawable.ConstantState {

    /* renamed from: a */
    public int f4287a;

    /* renamed from: b */
    public C1099m f4288b;

    /* renamed from: c */
    public ColorStateList f4289c;

    /* renamed from: d */
    public PorterDuff.Mode f4290d;

    /* renamed from: e */
    public boolean f4291e;

    /* renamed from: f */
    public Bitmap f4292f;

    /* renamed from: g */
    public ColorStateList f4293g;

    /* renamed from: h */
    public PorterDuff.Mode f4294h;

    /* renamed from: i */
    public int f4295i;

    /* renamed from: j */
    public boolean f4296j;

    /* renamed from: k */
    public boolean f4297k;

    /* renamed from: l */
    public Paint f4298l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4287a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1102p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1102p(this);
    }
}
