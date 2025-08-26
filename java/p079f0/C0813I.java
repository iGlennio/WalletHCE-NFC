package p079f0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: f0.I */
/* loaded from: classes.dex */
public class C0813I extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC0827X f3231a;

    /* renamed from: b */
    public final Rect f3232b;

    /* renamed from: c */
    public boolean f3233c;

    /* renamed from: d */
    public boolean f3234d;

    public C0813I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3232b = new Rect();
        this.f3233c = true;
        this.f3234d = false;
    }

    public C0813I(int i2, int i3) {
        super(i2, i3);
        this.f3232b = new Rect();
        this.f3233c = true;
        this.f3234d = false;
    }

    public C0813I(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3232b = new Rect();
        this.f3233c = true;
        this.f3234d = false;
    }

    public C0813I(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3232b = new Rect();
        this.f3233c = true;
        this.f3234d = false;
    }

    public C0813I(C0813I c0813i) {
        super((ViewGroup.LayoutParams) c0813i);
        this.f3232b = new Rect();
        this.f3233c = true;
        this.f3234d = false;
    }
}
