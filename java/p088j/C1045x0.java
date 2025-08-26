package p088j;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.nfupay.s145.R;
import java.lang.reflect.InvocationTargetException;
import p043P0.RunnableC0402A;
import p045Q.ViewOnTouchListenerC0440g;

/* renamed from: j.x0 */
/* loaded from: classes.dex */
public class C1045x0 extends ListView {

    /* renamed from: a */
    public final Rect f4098a;

    /* renamed from: b */
    public int f4099b;

    /* renamed from: c */
    public int f4100c;

    /* renamed from: d */
    public int f4101d;

    /* renamed from: e */
    public int f4102e;

    /* renamed from: f */
    public int f4103f;

    /* renamed from: g */
    public C1039v0 f4104g;

    /* renamed from: h */
    public boolean f4105h;

    /* renamed from: i */
    public final boolean f4106i;

    /* renamed from: j */
    public boolean f4107j;

    /* renamed from: k */
    public ViewOnTouchListenerC0440g f4108k;

    /* renamed from: l */
    public RunnableC0402A f4109l;

    public C1045x0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4098a = new Rect();
        this.f4099b = 0;
        this.f4100c = 0;
        this.f4101d = 0;
        this.f4102e = 0;
        this.f4106i = z2;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final int m2545a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i4 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i2, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i3) {
                return i3;
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2546b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j.C1045x0.m2546b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4098a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4109l != null) {
            return;
        }
        super.drawableStateChanged();
        C1039v0 c1039v0 = this.f4104g;
        if (c1039v0 != null) {
            c1039v0.f4074b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4107j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f4106i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f4106i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f4106i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f4106i && this.f4105h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4109l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4109l == null) {
            RunnableC0402A runnableC0402A = new RunnableC0402A(11, this);
            this.f4109l = runnableC0402A;
            post(runnableC0402A);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i2 < 30 || !AbstractC1033t0.f4053d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1033t0.f4050a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1033t0.f4051b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC1033t0.f4052c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f4107j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4103f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0402A runnableC0402A = this.f4109l;
        if (runnableC0402A != null) {
            C1045x0 c1045x0 = (C1045x0) runnableC0402A.f1063b;
            c1045x0.f4109l = null;
            c1045x0.removeCallbacks(runnableC0402A);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f4105h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1039v0 c1039v0 = null;
        if (drawable != null) {
            C1039v0 c1039v02 = new C1039v0();
            Drawable drawable2 = c1039v02.f4073a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1039v02.f4073a = drawable;
            drawable.setCallback(c1039v02);
            c1039v02.f4074b = true;
            c1039v0 = c1039v02;
        }
        this.f4104g = c1039v0;
        super.setSelector(c1039v0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4099b = rect.left;
        this.f4100c = rect.top;
        this.f4101d = rect.right;
        this.f4102e = rect.bottom;
    }
}
