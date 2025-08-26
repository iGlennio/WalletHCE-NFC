package p088j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.nfupay.s145.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p027K.AbstractC0274S;
import p027K.AbstractC0276U;

/* renamed from: j.w1 */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC1043w1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static ViewOnLongClickListenerC1043w1 f4084k;

    /* renamed from: l */
    public static ViewOnLongClickListenerC1043w1 f4085l;

    /* renamed from: a */
    public final View f4086a;

    /* renamed from: b */
    public final CharSequence f4087b;

    /* renamed from: c */
    public final int f4088c;

    /* renamed from: d */
    public final RunnableC1040v1 f4089d;

    /* renamed from: e */
    public final RunnableC1040v1 f4090e;

    /* renamed from: f */
    public int f4091f;

    /* renamed from: g */
    public int f4092g;

    /* renamed from: h */
    public C1046x1 f4093h;

    /* renamed from: i */
    public boolean f4094i;

    /* renamed from: j */
    public boolean f4095j;

    /* JADX WARN: Type inference failed for: r0v0, types: [j.v1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [j.v1] */
    public ViewOnLongClickListenerC1043w1(View view, CharSequence charSequence) {
        final int i2 = 0;
        this.f4089d = new Runnable(this) { // from class: j.v1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC1043w1 f4076b;

            {
                this.f4076b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f4076b.m2541c(false);
                        break;
                    default:
                        this.f4076b.m2540a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f4090e = new Runnable(this) { // from class: j.v1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC1043w1 f4076b;

            {
                this.f4076b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f4076b.m2541c(false);
                        break;
                    default:
                        this.f4076b.m2540a();
                        break;
                }
            }
        };
        this.f4086a = view;
        this.f4087b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0276U.f774a;
        this.f4088c = Build.VERSION.SDK_INT >= 28 ? AbstractC0274S.m827a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f4095j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m2539b(ViewOnLongClickListenerC1043w1 viewOnLongClickListenerC1043w1) {
        ViewOnLongClickListenerC1043w1 viewOnLongClickListenerC1043w12 = f4084k;
        if (viewOnLongClickListenerC1043w12 != null) {
            viewOnLongClickListenerC1043w12.f4086a.removeCallbacks(viewOnLongClickListenerC1043w12.f4089d);
        }
        f4084k = viewOnLongClickListenerC1043w1;
        if (viewOnLongClickListenerC1043w1 != null) {
            viewOnLongClickListenerC1043w1.f4086a.postDelayed(viewOnLongClickListenerC1043w1.f4089d, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m2540a() {
        ViewOnLongClickListenerC1043w1 viewOnLongClickListenerC1043w1 = f4085l;
        View view = this.f4086a;
        if (viewOnLongClickListenerC1043w1 == this) {
            f4085l = null;
            C1046x1 c1046x1 = this.f4093h;
            if (c1046x1 != null) {
                View view2 = c1046x1.f4111b;
                if (view2.getParent() != null) {
                    ((WindowManager) c1046x1.f4110a.getSystemService("window")).removeView(view2);
                }
                this.f4093h = null;
                this.f4095j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f4084k == this) {
            m2539b(null);
        }
        view.removeCallbacks(this.f4090e);
    }

    /* renamed from: c */
    public final void m2541c(boolean z2) {
        int height;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long longPressTimeout;
        long j2;
        long j3;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        View view = this.f4086a;
        if (view.isAttachedToWindow()) {
            m2539b(null);
            ViewOnLongClickListenerC1043w1 viewOnLongClickListenerC1043w1 = f4085l;
            if (viewOnLongClickListenerC1043w1 != null) {
                viewOnLongClickListenerC1043w1.m2540a();
            }
            f4085l = this;
            this.f4094i = z2;
            C1046x1 c1046x1 = new C1046x1(view.getContext());
            this.f4093h = c1046x1;
            int i7 = this.f4091f;
            int i8 = this.f4092g;
            boolean z3 = this.f4094i;
            View view2 = c1046x1.f4111b;
            ViewParent parent = view2.getParent();
            Context context = c1046x1.f4110a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            c1046x1.f4112c.setText(this.f4087b);
            WindowManager.LayoutParams layoutParams = c1046x1.f4113d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i7 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i8 + dimensionPixelOffset2;
                i2 = i8 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i6 = 1;
            } else {
                Rect rect = c1046x1.f4114e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i3 = i7;
                    i4 = i2;
                    i5 = 0;
                    i6 = 1;
                } else {
                    Resources resources = context.getResources();
                    i6 = 1;
                    i3 = i7;
                    i4 = i2;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i5 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = c1046x1.f4116g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = c1046x1.f4115f;
                view.getLocationOnScreen(iArr2);
                int i9 = iArr2[i5] - iArr[i5];
                iArr2[i5] = i9;
                iArr2[i6] = iArr2[i6] - iArr[i6];
                layoutParams.x = (i9 + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i10 = iArr2[i6];
                int i11 = ((i10 + i4) - dimensionPixelOffset3) - measuredHeight;
                int i12 = i10 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i11 >= 0) {
                        layoutParams.y = i11;
                    } else {
                        layoutParams.y = i12;
                    }
                } else if (measuredHeight + i12 <= rect.height()) {
                    layoutParams.y = i12;
                } else {
                    layoutParams.y = i11;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f4094i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i6) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            RunnableC1040v1 runnableC1040v1 = this.f4090e;
            view.removeCallbacks(runnableC1040v1);
            view.postDelayed(runnableC1040v1, j3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f4092g) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            j.x1 r4 = r3.f4093h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f4094i
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f4086a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f4095j = r4
            r3.m2540a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            j.x1 r4 = r3.f4093h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f4095j
            if (r1 != 0) goto L66
            int r1 = r3.f4091f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f4088c
            if (r1 > r2) goto L66
            int r1 = r3.f4092g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f4091f = r4
            r3.f4092g = r5
            r3.f4095j = r0
            m2539b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j.ViewOnLongClickListenerC1043w1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f4091f = view.getWidth() / 2;
        this.f4092g = view.getHeight() / 2;
        m2541c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m2540a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
