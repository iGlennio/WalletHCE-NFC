package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p005C.C0046i;
import p010D1.AbstractC0104l;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p027K.C0296h;
import p027K.C0306m;
import p027K.C0312p;
import p027K.InterfaceC0310o;
import p045Q.AbstractC0438e;
import p045Q.AbstractC0442i;
import p045Q.C0441h;
import p045Q.C0445l;
import p045Q.InterfaceC0443j;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0310o {

    /* renamed from: B */
    public static final float f1898B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C */
    public static final C0441h f1899C = new C0441h(0);

    /* renamed from: D */
    public static final int[] f1900D = {R.attr.fillViewport};

    /* renamed from: A */
    public final C0296h f1901A;

    /* renamed from: a */
    public final float f1902a;

    /* renamed from: b */
    public long f1903b;

    /* renamed from: c */
    public final Rect f1904c;

    /* renamed from: d */
    public final OverScroller f1905d;

    /* renamed from: e */
    public final EdgeEffect f1906e;

    /* renamed from: f */
    public final EdgeEffect f1907f;

    /* renamed from: g */
    public int f1908g;

    /* renamed from: h */
    public boolean f1909h;

    /* renamed from: i */
    public boolean f1910i;

    /* renamed from: j */
    public View f1911j;

    /* renamed from: k */
    public boolean f1912k;

    /* renamed from: l */
    public VelocityTracker f1913l;

    /* renamed from: m */
    public boolean f1914m;

    /* renamed from: n */
    public boolean f1915n;

    /* renamed from: o */
    public final int f1916o;

    /* renamed from: p */
    public final int f1917p;

    /* renamed from: q */
    public final int f1918q;

    /* renamed from: r */
    public int f1919r;

    /* renamed from: s */
    public final int[] f1920s;

    /* renamed from: t */
    public final int[] f1921t;

    /* renamed from: u */
    public int f1922u;

    /* renamed from: v */
    public int f1923v;

    /* renamed from: w */
    public C0445l f1924w;

    /* renamed from: x */
    public final C0312p f1925x;

    /* renamed from: y */
    public final C0306m f1926y;

    /* renamed from: z */
    public float f1927z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.nfupay.s145.R.attr.nestedScrollViewStyle);
        this.f1904c = new Rect();
        this.f1909h = true;
        this.f1910i = false;
        this.f1911j = null;
        this.f1912k = false;
        this.f1915n = true;
        this.f1919r = -1;
        this.f1920s = new int[2];
        this.f1921t = new int[2];
        this.f1901A = new C0296h(getContext(), new C0046i(9, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f1906e = i2 >= 31 ? AbstractC0438e.m1131a(context, attributeSet) : new EdgeEffect(context);
        this.f1907f = i2 >= 31 ? AbstractC0438e.m1131a(context, attributeSet) : new EdgeEffect(context);
        this.f1902a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1905d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1916o = viewConfiguration.getScaledTouchSlop();
        this.f1917p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1918q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1900D, com.nfupay.s145.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1925x = new C0312p();
        this.f1926y = new C0306m(this);
        setNestedScrollingEnabled(true);
        AbstractC0272P.m823m(this, f1899C);
    }

    /* renamed from: l */
    public static boolean m1471l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1471l((View) parent, nestedScrollView);
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: a */
    public final void mo921a(View view, View view2, int i2, int i3) {
        C0312p c0312p = this.f1925x;
        if (i3 == 1) {
            c0312p.f850b = i2;
        } else {
            c0312p.f849a = i2;
        }
        this.f1926y.m914g(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p027K.InterfaceC0310o
    /* renamed from: b */
    public final void mo928b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m1478n(i5, i6, iArr);
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: c */
    public final void mo922c(View view, int i2, int i3, int i4, int i5, int i6) {
        m1478n(i5, i6, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: d */
    public final void mo923d(View view, int i2) {
        C0312p c0312p = this.f1925x;
        if (i2 == 1) {
            c0312p.f850b = 0;
        } else {
            c0312p.f849a = 0;
        }
        m1487w(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1474i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return this.f1926y.m908a(f, f2, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1926y.m909b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1926y.m910c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1926y.m911d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1906e;
        int i3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (AbstractC0442i.m1143a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (AbstractC0442i.m1143a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1907f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0442i.m1143a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i3 = getPaddingLeft();
        }
        if (AbstractC0442i.m1143a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: e */
    public final void mo924e(View view, int i2, int i3, int[] iArr, int i4) {
        this.f1926y.m910c(i2, i3, iArr, null, i4);
    }

    @Override // p027K.InterfaceC0308n
    /* renamed from: f */
    public final boolean mo925f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    /* renamed from: g */
    public final boolean m1472g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1477m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1483s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1904c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            m1483s(m1473h(rect), 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && !m1477m(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0312p c0312p = this.f1925x;
        return c0312p.f850b | c0312p.f849a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1927z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1927z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1927z;
    }

    /* renamed from: h */
    public final int m1473h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1926y.m913f(0);
    }

    /* renamed from: i */
    public final boolean m1474i(KeyEvent keyEvent) {
        this.f1904c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m1476k(33) : m1472g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m1476k(130) : m1472g(130);
                    }
                    if (keyCode == 62) {
                        m1481q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m1476k(33);
                    }
                    if (keyCode == 93) {
                        return m1476k(130);
                    }
                    if (keyCode == 122) {
                        m1481q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m1481q(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1926y.f843d;
    }

    /* renamed from: j */
    public final void m1475j(int i2) {
        if (getChildCount() > 0) {
            this.f1905d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1926y.m914g(2, 1);
            this.f1923v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: k */
    public final boolean m1476k(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1904c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m1482r(i2, rect.top, rect.bottom);
    }

    /* renamed from: m */
    public final boolean m1477m(View view, int i2, int i3) {
        Rect rect = this.f1904c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void m1478n(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1926y.m911d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    /* renamed from: o */
    public final void m1479o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1919r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1908g = (int) motionEvent.getY(i2);
            this.f1919r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1913l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1910i = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x012b, code lost:
    
        if (r2 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d7, code lost:
    
        if (r2 >= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1912k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f1919r;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1908g) > this.f1916o && (2 & getNestedScrollAxes()) == 0) {
                                this.f1912k = true;
                                this.f1908g = y2;
                                if (this.f1913l == null) {
                                    this.f1913l = VelocityTracker.obtain();
                                }
                                this.f1913l.addMovement(motionEvent);
                                this.f1922u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        m1479o(motionEvent);
                    }
                }
            }
            this.f1912k = false;
            this.f1919r = -1;
            VelocityTracker velocityTracker = this.f1913l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1913l = null;
            }
            if (this.f1905d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m1487w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f1908g = y3;
                    this.f1919r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1913l;
                    if (velocityTracker2 == null) {
                        this.f1913l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1913l.addMovement(motionEvent);
                    this.f1905d.computeScrollOffset();
                    if (!m1486v(motionEvent) && this.f1905d.isFinished()) {
                        z2 = false;
                    }
                    this.f1912k = z2;
                    this.f1926y.m914g(2, 0);
                }
            }
            if (!m1486v(motionEvent) && this.f1905d.isFinished()) {
                z2 = false;
            }
            this.f1912k = z2;
            VelocityTracker velocityTracker3 = this.f1913l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1913l = null;
            }
        }
        return this.f1912k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        int i7 = 0;
        this.f1909h = false;
        View view = this.f1911j;
        if (view != null && m1471l(view, this)) {
            View view2 = this.f1911j;
            Rect rect = this.f1904c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1473h = m1473h(rect);
            if (m1473h != 0) {
                scrollBy(0, m1473h);
            }
        }
        this.f1911j = null;
        if (!this.f1910i) {
            if (this.f1924w != null) {
                scrollTo(getScrollX(), this.f1924w.f1234a);
                this.f1924w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i6 = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i6 && scrollY >= 0) {
                i7 = paddingTop + scrollY > i6 ? i6 - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1910i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1914m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m1475j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f1926y.m909b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f1926y.m910c(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m1478n(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        mo921a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && m1477m(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0445l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0445l c0445l = (C0445l) parcelable;
        super.onRestoreInstanceState(c0445l.getSuperState());
        this.f1924w = c0445l;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0445l c0445l = new C0445l(super.onSaveInstanceState());
        c0445l.f1234a = getScrollY();
        return c0445l;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1477m(findFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f1904c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int m1473h = m1473h(rect);
        if (m1473h != 0) {
            if (this.f1915n) {
                m1485u(0, m1473h, false);
            } else {
                scrollBy(0, m1473h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo925f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo923d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1913l == null) {
            this.f1913l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1922u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.f1922u);
        C0306m c0306m = this.f1926y;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1907f;
            EdgeEffect edgeEffect2 = this.f1906e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1913l;
                velocityTracker.computeCurrentVelocity(1000, this.f1918q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1919r);
                if (Math.abs(yVelocity) >= this.f1917p) {
                    if (AbstractC0104l.m414v(edgeEffect2) != 0.0f) {
                        if (m1484t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m1475j(-yVelocity);
                        }
                    } else if (AbstractC0104l.m414v(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (m1484t(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            m1475j(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!c0306m.m909b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m1475j(i3);
                        }
                    }
                } else if (this.f1905d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1919r = -1;
                this.f1912k = false;
                VelocityTracker velocityTracker2 = this.f1913l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1913l = null;
                }
                m1487w(0);
                this.f1906e.onRelease();
                this.f1907f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1919r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1919r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i4 = this.f1908g - y2;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (AbstractC0104l.m414v(edgeEffect2) != 0.0f) {
                        float f3 = -AbstractC0104l.m393J(edgeEffect2, -height, x2);
                        if (AbstractC0104l.m414v(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (AbstractC0104l.m414v(edgeEffect) != 0.0f) {
                        float m393J = AbstractC0104l.m393J(edgeEffect, height, 1.0f - x2);
                        if (AbstractC0104l.m414v(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = m393J;
                    }
                    int round = Math.round(f * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i5 = i4 - round;
                    if (!this.f1912k && Math.abs(i5) > this.f1916o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1912k = true;
                        i5 = i5 > 0 ? i5 - this.f1916o : i5 + this.f1916o;
                    }
                    if (this.f1912k) {
                        int m1483s = m1483s(i5, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f1908g = y2 - m1483s;
                        this.f1922u += m1483s;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1912k && getChildCount() > 0 && this.f1905d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1919r = -1;
                this.f1912k = false;
                VelocityTracker velocityTracker3 = this.f1913l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1913l = null;
                }
                m1487w(0);
                this.f1906e.onRelease();
                this.f1907f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1908g = (int) motionEvent.getY(actionIndex);
                this.f1919r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1479o(motionEvent);
                this.f1908g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1919r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1912k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1905d.isFinished()) {
                this.f1905d.abortAnimation();
                m1487w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1908g = y3;
            this.f1919r = pointerId;
            c0306m.m914g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1913l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public final boolean m1480p(int i2, int i3, int i4, int i5) {
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            i6 = i3;
            z2 = false;
        } else {
            i6 = 0;
            z2 = true;
        }
        if (i8 > i5) {
            i7 = i5;
        } else {
            if (i8 >= 0) {
                i7 = i8;
                z3 = false;
                if (z3 && !this.f1926y.m913f(1)) {
                    this.f1905d.springBack(i6, i7, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i6, i7);
                return !z2 || z3;
            }
            i7 = 0;
        }
        z3 = true;
        if (z3) {
            this.f1905d.springBack(i6, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i6, i7);
        if (z2) {
        }
    }

    /* renamed from: q */
    public final void m1481q(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1904c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        m1482r(i2, i3, i4);
    }

    /* renamed from: r */
    public final boolean m1482r(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            m1483s(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1909h) {
            this.f1911j = view2;
        } else {
            Rect rect = this.f1904c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1473h = m1473h(rect);
            if (m1473h != 0) {
                scrollBy(0, m1473h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m1473h = m1473h(rect);
        boolean z3 = m1473h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, m1473h);
                return z3;
            }
            m1485u(0, m1473h, false);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1913l) != null) {
            velocityTracker.recycle();
            this.f1913l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1909h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final int m1483s(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        VelocityTracker velocityTracker;
        C0306m c0306m = this.f1926y;
        if (i4 == 1) {
            c0306m.m914g(2, i4);
        }
        boolean m910c = this.f1926y.m910c(0, i2, this.f1921t, this.f1920s, i4);
        int[] iArr = this.f1921t;
        int[] iArr2 = this.f1920s;
        if (m910c) {
            i5 = i2 - iArr[1];
            i6 = iArr2[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = m1480p(i5, 0, scrollY, scrollRange) && !c0306m.m913f(i4);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1926y.m911d(0, scrollY2, 0, i5 - scrollY2, this.f1920s, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f1907f;
        EdgeEffect edgeEffect2 = this.f1906e;
        if (i9 < 0) {
            if (z4) {
                AbstractC0104l.m393J(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            AbstractC0104l.m393J(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i4 == 0 && (velocityTracker = this.f1913l) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            m1487w(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1914m) {
            this.f1914m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0306m c0306m = this.f1926y;
        if (c0306m.f843d) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            AbstractC0261E.m765z(c0306m.f842c);
        }
        c0306m.f843d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1915n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f1926y.m914g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1487w(0);
    }

    /* renamed from: t */
    public final boolean m1484t(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float m414v = AbstractC0104l.m414v(edgeEffect) * getHeight();
        float abs = Math.abs(-i2) * 0.35f;
        float f = this.f1902a * 0.015f;
        double log = Math.log(abs / f);
        double d2 = f1898B;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f))) < m414v;
    }

    /* renamed from: u */
    public final void m1485u(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1903b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1905d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f1926y.m914g(2, 1);
            } else {
                m1487w(1);
            }
            this.f1923v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1905d.isFinished()) {
                this.f1905d.abortAnimation();
                m1487w(1);
            }
            scrollBy(i2, i3);
        }
        this.f1903b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: v */
    public final boolean m1486v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1906e;
        if (AbstractC0104l.m414v(edgeEffect) != 0.0f) {
            AbstractC0104l.m393J(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1907f;
        if (AbstractC0104l.m414v(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC0104l.m393J(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: w */
    public final void m1487w(int i2) {
        this.f1926y.m915h(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC0443j interfaceC0443j) {
    }
}
