package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p073d.AbstractC0734a;
import p088j.AbstractC0964U0;
import p088j.C0978b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f1655a;

    /* renamed from: b */
    public View f1656b;

    /* renamed from: c */
    public View f1657c;

    /* renamed from: d */
    public Drawable f1658d;

    /* renamed from: e */
    public Drawable f1659e;

    /* renamed from: f */
    public Drawable f1660f;

    /* renamed from: g */
    public final boolean f1661g;

    /* renamed from: h */
    public boolean f1662h;

    /* renamed from: i */
    public final int f1663i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0978b c0978b = new C0978b(this);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setBackground(c0978b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0734a.f2911a);
        boolean z2 = false;
        this.f1658d = obtainStyledAttributes.getDrawable(0);
        this.f1659e = obtainStyledAttributes.getDrawable(2);
        this.f1663i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1661g = true;
            this.f1660f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1661g ? !(this.f1658d != null || this.f1659e != null) : this.f1660f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1658d;
        if (drawable != null && drawable.isStateful()) {
            this.f1658d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1659e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1659e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1660f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1660f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1658d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1659e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1660f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1656b = findViewById(R.id.action_bar);
        this.f1657c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1655a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f1661g) {
            Drawable drawable = this.f1660f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1658d == null) {
                z3 = false;
            } else if (this.f1656b.getVisibility() == 0) {
                this.f1658d.setBounds(this.f1656b.getLeft(), this.f1656b.getTop(), this.f1656b.getRight(), this.f1656b.getBottom());
            } else {
                View view = this.f1657c;
                if (view == null || view.getVisibility() != 0) {
                    this.f1658d.setBounds(0, 0, 0, 0);
                } else {
                    this.f1658d.setBounds(this.f1657c.getLeft(), this.f1657c.getTop(), this.f1657c.getRight(), this.f1657c.getBottom());
                }
            }
            this.f1662h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1656b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1663i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1656b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1658d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1658d);
        }
        this.f1658d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1656b;
            if (view != null) {
                this.f1658d.setBounds(view.getLeft(), this.f1656b.getTop(), this.f1656b.getRight(), this.f1656b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1661g ? !(this.f1658d != null || this.f1659e != null) : this.f1660f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1660f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1660f);
        }
        this.f1660f = drawable;
        boolean z2 = this.f1661g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1660f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1658d != null || this.f1659e != null) : this.f1660f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1659e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1659e);
        }
        this.f1659e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1662h && this.f1659e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1661g ? !(this.f1658d != null || this.f1659e != null) : this.f1660f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1655a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1658d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1659e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1660f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1658d;
        boolean z2 = this.f1661g;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f1659e && this.f1662h) {
            return true;
        }
        return (drawable == this.f1660f && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(AbstractC0964U0 abstractC0964U0) {
    }
}
