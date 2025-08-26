package p043P0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p034M0.C0361f;
import p034M0.C0366k;

/* renamed from: P0.g */
/* loaded from: classes.dex */
public final class C0413g extends C0361f {

    /* renamed from: q */
    public final RectF f1087q;

    public C0413g(C0366k c0366k, RectF rectF) {
        super(c0366k);
        this.f1087q = rectF;
    }

    @Override // p034M0.C0361f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0414h c0414h = new C0414h(this);
        c0414h.f1089x = this;
        c0414h.invalidateSelf();
        return c0414h;
    }

    public C0413g(C0413g c0413g) {
        super(c0413g);
        this.f1087q = c0413g.f1087q;
    }
}
