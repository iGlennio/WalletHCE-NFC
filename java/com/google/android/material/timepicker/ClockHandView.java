package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p047Q1.AbstractC0458e;
import p108q0.AbstractC1183a;
import p111r0.AbstractC1188a;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: a */
    public final ValueAnimator f2886a;

    /* renamed from: b */
    public boolean f2887b;

    /* renamed from: c */
    public final ArrayList f2888c;

    /* renamed from: d */
    public final int f2889d;

    /* renamed from: e */
    public final float f2890e;

    /* renamed from: f */
    public final Paint f2891f;

    /* renamed from: g */
    public final RectF f2892g;

    /* renamed from: h */
    public final int f2893h;

    /* renamed from: i */
    public float f2894i;

    /* renamed from: j */
    public boolean f2895j;

    /* renamed from: k */
    public double f2896k;

    /* renamed from: l */
    public int f2897l;

    /* renamed from: m */
    public int f2898m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f2886a = new ValueAnimator();
        this.f2888c = new ArrayList();
        Paint paint = new Paint();
        this.f2891f = paint;
        this.f2892g = new RectF();
        this.f2898m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1183a.f4526e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0458e.m1179S(context, R.attr.motionDurationLong2, 200);
        AbstractC0458e.m1180T(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1188a.f4553b);
        this.f2897l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2889d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2893h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2890e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m2011b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int m2010a(int i2) {
        return i2 == 2 ? Math.round(this.f2897l * 0.66f) : this.f2897l;
    }

    /* renamed from: b */
    public final void m2011b(float f) {
        ValueAnimator valueAnimator = this.f2886a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f2894i = f2;
        this.f2896k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float m2010a = m2010a(this.f2898m);
        float cos = (((float) Math.cos(this.f2896k)) * m2010a) + width;
        float sin = (m2010a * ((float) Math.sin(this.f2896k))) + height;
        float f3 = this.f2889d;
        this.f2892g.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.f2888c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0728d) it.next());
            if (Math.abs(clockFaceView.f2879I - f2) > 0.001f) {
                clockFaceView.f2879I = f2;
                clockFaceView.m2009n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float m2010a = m2010a(this.f2898m);
        float cos = (((float) Math.cos(this.f2896k)) * m2010a) + f;
        float f2 = height;
        float sin = (m2010a * ((float) Math.sin(this.f2896k))) + f2;
        Paint paint = this.f2891f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f2889d, paint);
        double sin2 = Math.sin(this.f2896k);
        paint.setStrokeWidth(this.f2893h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f2896k) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f, f2, this.f2890e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f2886a.isRunning()) {
            return;
        }
        m2011b(this.f2894i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.f2895j = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.f2895j;
            if (this.f2887b) {
                this.f2898m = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) m2010a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z5 = this.f2895j;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f = i2;
        boolean z6 = this.f2894i != f;
        if (!z2 || !z6) {
            if (z6 || z3) {
                m2011b(f);
            }
            this.f2895j = z5 | z4;
            return true;
        }
        z4 = true;
        this.f2895j = z5 | z4;
        return true;
    }
}
