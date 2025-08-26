package p034M0;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import p134z0.C1332d;

/* renamed from: M0.x */
/* loaded from: classes.dex */
public final class C0379x extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ int f1021a;

    /* renamed from: b */
    public final /* synthetic */ Object f1022b;

    public /* synthetic */ C0379x(int i2, Object obj) {
        this.f1021a = i2;
        this.f1022b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f1021a) {
            case 0:
                C0380y c0380y = (C0380y) this.f1022b;
                if (c0380y.f1018c != null && !c0380y.f1019d.isEmpty()) {
                    RectF rectF = c0380y.f1019d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c0380y.f1024g);
                    break;
                }
                break;
            case 1:
                Path path = ((C0381z) this.f1022b).f1020e;
                if (!path.isEmpty()) {
                    outline.setPath(path);
                    break;
                }
                break;
            default:
                C1332d c1332d = ((Chip) this.f1022b).f2602e;
                if (c1332d == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    c1332d.getOutline(outline);
                    break;
                }
        }
    }
}
