package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p121v.C1255e;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a */
    public boolean f1856a;

    public Guideline(Context context) {
        super(context);
        this.f1856a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f1856a = z2;
    }

    public void setGuidelineBegin(int i2) {
        C1255e c1255e = (C1255e) getLayoutParams();
        if (this.f1856a && c1255e.f4916a == i2) {
            return;
        }
        c1255e.f4916a = i2;
        setLayoutParams(c1255e);
    }

    public void setGuidelineEnd(int i2) {
        C1255e c1255e = (C1255e) getLayoutParams();
        if (this.f1856a && c1255e.f4918b == i2) {
            return;
        }
        c1255e.f4918b = i2;
        setLayoutParams(c1255e);
    }

    public void setGuidelinePercent(float f) {
        C1255e c1255e = (C1255e) getLayoutParams();
        if (this.f1856a && c1255e.f4920c == f) {
            return;
        }
        c1255e.f4920c = f;
        setLayoutParams(c1255e);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1856a = true;
        super.setVisibility(8);
    }
}
