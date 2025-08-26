package p121v;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p113s.C1206g;

/* renamed from: v.s */
/* loaded from: classes.dex */
public abstract class AbstractC1269s extends AbstractC1253c {

    /* renamed from: h */
    public boolean f5101h;

    /* renamed from: i */
    public boolean f5102i;

    @Override // p121v.AbstractC1253c
    /* renamed from: e */
    public final void mo2928e(ConstraintLayout constraintLayout) {
        m2927d(constraintLayout);
    }

    @Override // p121v.AbstractC1253c
    /* renamed from: g */
    public void mo2930g(AttributeSet attributeSet) {
        super.mo2930g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1267q.f5092b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f5101h = true;
                } else if (index == 22) {
                    this.f5102i = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public abstract void mo1447j(C1206g c1206g, int i2, int i3);

    @Override // p121v.AbstractC1253c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5101h || this.f5102i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.f4883b; i2++) {
                    View view = (View) constraintLayout.f1839a.get(this.f4882a[i2]);
                    if (view != null) {
                        if (this.f5101h) {
                            view.setVisibility(visibility);
                        }
                        if (this.f5102i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m2927d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m2927d((ConstraintLayout) parent);
    }
}
