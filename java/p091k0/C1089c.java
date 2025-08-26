package p091k0;

import android.graphics.drawable.Drawable;

/* renamed from: k0.c */
/* loaded from: classes.dex */
public final class C1089c implements Drawable.Callback {

    /* renamed from: a */
    public final /* synthetic */ C1092f f4234a;

    public C1089c(C1092f c1092f) {
        this.f4234a = c1092f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f4234a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        this.f4234a.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f4234a.unscheduleSelf(runnable);
    }
}
