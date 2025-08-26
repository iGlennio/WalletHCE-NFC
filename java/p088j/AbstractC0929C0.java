package p088j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p073d.AbstractC0734a;

/* renamed from: j.C0 */
/* loaded from: classes.dex */
public abstract class AbstractC0929C0 extends ViewGroup {

    /* renamed from: a */
    public boolean f3761a;

    /* renamed from: b */
    public int f3762b;

    /* renamed from: c */
    public int f3763c;

    /* renamed from: d */
    public int f3764d;

    /* renamed from: e */
    public int f3765e;

    /* renamed from: f */
    public int f3766f;

    /* renamed from: g */
    public float f3767g;

    /* renamed from: h */
    public boolean f3768h;

    /* renamed from: i */
    public int[] f3769i;

    /* renamed from: j */
    public int[] f3770j;

    /* renamed from: k */
    public Drawable f3771k;

    /* renamed from: l */
    public int f3772l;

    /* renamed from: m */
    public int f3773m;

    /* renamed from: n */
    public int f3774n;

    /* renamed from: o */
    public int f3775o;

    public AbstractC0929C0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3761a = true;
        this.f3762b = -1;
        this.f3763c = 0;
        this.f3765e = 8388659;
        int[] iArr = AbstractC0734a.f2924n;
        C0176h m519B = C0176h.m519B(context, attributeSet, iArr, i2);
        AbstractC0272P.m822l(this, context, iArr, attributeSet, (TypedArray) m519B.f516c, i2);
        TypedArray typedArray = (TypedArray) m519B.f516c;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f3767g = typedArray.getFloat(4, -1.0f);
        this.f3762b = typedArray.getInt(3, -1);
        this.f3768h = typedArray.getBoolean(7, false);
        setDividerDrawable(m519B.m542q(5));
        this.f3774n = typedArray.getInt(8, 0);
        this.f3775o = typedArray.getDimensionPixelSize(6, 0);
        m519B.m523E();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0927B0;
    }

    /* renamed from: f */
    public final void m2382f(Canvas canvas, int i2) {
        this.f3771k.setBounds(getPaddingLeft() + this.f3775o, i2, (getWidth() - getPaddingRight()) - this.f3775o, this.f3773m + i2);
        this.f3771k.draw(canvas);
    }

    /* renamed from: g */
    public final void m2383g(Canvas canvas, int i2) {
        this.f3771k.setBounds(i2, getPaddingTop() + this.f3775o, this.f3772l + i2, (getHeight() - getPaddingBottom()) - this.f3775o);
        this.f3771k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f3762b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f3762b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3762b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i4 = this.f3763c;
        if (this.f3764d == 1 && (i2 = this.f3765e & 112) != 48) {
            if (i2 == 16) {
                i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3766f) / 2;
            } else if (i2 == 80) {
                i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3766f;
            }
        }
        return i4 + ((LinearLayout.LayoutParams) ((C0927B0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3762b;
    }

    public Drawable getDividerDrawable() {
        return this.f3771k;
    }

    public int getDividerPadding() {
        return this.f3775o;
    }

    public int getDividerWidth() {
        return this.f3772l;
    }

    public int getGravity() {
        return this.f3765e;
    }

    public int getOrientation() {
        return this.f3764d;
    }

    public int getShowDividers() {
        return this.f3774n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3767g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0927B0 generateDefaultLayoutParams() {
        int i2 = this.f3764d;
        if (i2 == 0) {
            return new C0927B0(-2, -2);
        }
        if (i2 == 1) {
            return new C0927B0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0927B0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0927B0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0927B0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0927B0(layoutParams);
    }

    /* renamed from: k */
    public final boolean m2384k(int i2) {
        if (i2 == 0) {
            return (this.f3774n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f3774n & 4) != 0;
        }
        if ((this.f3774n & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f3771k == null) {
            return;
        }
        int i3 = 0;
        if (this.f3764d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && m2384k(i3)) {
                    m2382f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0927B0) childAt.getLayoutParams())).topMargin) - this.f3773m);
                }
                i3++;
            }
            if (m2384k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2382f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f3773m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0927B0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean m2376a = AbstractC0925A1.m2376a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2384k(i3)) {
                C0927B0 c0927b0 = (C0927B0) childAt3.getLayoutParams();
                m2383g(canvas, m2376a ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0927b0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0927b0).leftMargin) - this.f3772l);
            }
            i3++;
        }
        if (m2384k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0927B0 c0927b02 = (C0927B0) childAt4.getLayoutParams();
                if (m2376a) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0927b02).leftMargin;
                    i2 = this.f3772l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0927b02).rightMargin;
                }
            } else if (m2376a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f3772l;
                right = left - i2;
            }
            m2383g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j.AbstractC0929C0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j.AbstractC0929C0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f3761a = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f3762b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3771k) {
            return;
        }
        this.f3771k = drawable;
        if (drawable != null) {
            this.f3772l = drawable.getIntrinsicWidth();
            this.f3773m = drawable.getIntrinsicHeight();
        } else {
            this.f3772l = 0;
            this.f3773m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f3775o = i2;
    }

    public void setGravity(int i2) {
        if (this.f3765e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f3765e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f3765e;
        if ((8388615 & i4) != i3) {
            this.f3765e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f3768h = z2;
    }

    public void setOrientation(int i2) {
        if (this.f3764d != i2) {
            this.f3764d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f3774n) {
            requestLayout();
        }
        this.f3774n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f3765e;
        if ((i4 & 112) != i3) {
            this.f3765e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f3767g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
