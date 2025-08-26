package p012E0;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import p034M0.C0362g;

/* renamed from: E0.a */
/* loaded from: classes.dex */
public final class C0108a extends ViewOutlineProvider {

    /* renamed from: a */
    public final Rect f321a = new Rect();

    /* renamed from: b */
    public final /* synthetic */ ShapeableImageView f322b;

    public C0108a(ShapeableImageView shapeableImageView) {
        this.f322b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f322b;
        if (shapeableImageView.f2717l == null) {
            return;
        }
        if (shapeableImageView.f2716k == null) {
            shapeableImageView.f2716k = new C0362g(shapeableImageView.f2717l);
        }
        RectF rectF = shapeableImageView.f2710e;
        Rect rect = this.f321a;
        rectF.round(rect);
        shapeableImageView.f2716k.setBounds(rect);
        shapeableImageView.f2716k.getOutline(outline);
    }
}
