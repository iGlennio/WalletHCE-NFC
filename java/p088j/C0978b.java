package p088j;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: j.b */
/* loaded from: classes.dex */
public final class C0978b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f3887a;

    public C0978b(ActionBarContainer actionBarContainer) {
        this.f3887a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3887a;
        if (actionBarContainer.f1661g) {
            Drawable drawable = actionBarContainer.f1660f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1658d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1659e;
        if (drawable3 == null || !actionBarContainer.f1662h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3887a;
        if (actionBarContainer.f1661g) {
            if (actionBarContainer.f1660f != null) {
                actionBarContainer.f1658d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1658d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
