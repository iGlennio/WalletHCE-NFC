package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p027K.AbstractC0272P;
import p108q0.AbstractC1183a;
import p121v.C1259i;
import p121v.C1260j;
import p121v.C1264n;

/* loaded from: classes.dex */
class ClockFaceView extends AbstractC0729e implements InterfaceC0728d {

    /* renamed from: A */
    public final C0727c f2871A;

    /* renamed from: B */
    public final int[] f2872B;

    /* renamed from: C */
    public final float[] f2873C;

    /* renamed from: D */
    public final int f2874D;

    /* renamed from: E */
    public final int f2875E;

    /* renamed from: F */
    public final int f2876F;

    /* renamed from: G */
    public final int f2877G;

    /* renamed from: H */
    public final String[] f2878H;

    /* renamed from: I */
    public float f2879I;

    /* renamed from: J */
    public final ColorStateList f2880J;

    /* renamed from: v */
    public final ClockHandView f2881v;

    /* renamed from: w */
    public final Rect f2882w;

    /* renamed from: x */
    public final RectF f2883x;

    /* renamed from: y */
    public final Rect f2884y;

    /* renamed from: z */
    public final SparseArray f2885z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2882w = new Rect();
        this.f2883x = new RectF();
        this.f2884y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2885z = sparseArray;
        this.f2873C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1183a.f4525d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m413t = AbstractC0104l.m413t(context, obtainStyledAttributes, 1);
        this.f2880J = m413t;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2881v = clockHandView;
        this.f2874D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = m413t.getColorForState(new int[]{android.R.attr.state_selected}, m413t.getDefaultColor());
        this.f2872B = new int[]{colorForState, colorForState, m413t.getDefaultColor()};
        clockHandView.f2888c.add(this);
        int defaultColor = AbstractC0096d.m355v(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m413t2 = AbstractC0104l.m413t(context, obtainStyledAttributes, 0);
        setBackgroundColor(m413t2 != null ? m413t2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0726b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2871A = new C0727c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2878H = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < Math.max(this.f2878H.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f2878H.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f2878H[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z2 = i3 > 1 ? true : z2;
                AbstractC0272P.m823m(textView, this.f2871A);
                textView.setTextColor(this.f2880J);
            }
        }
        ClockHandView clockHandView2 = this.f2881v;
        if (clockHandView2.f2887b && !z2) {
            clockHandView2.f2898m = 1;
        }
        clockHandView2.f2887b = z2;
        clockHandView2.invalidate();
        this.f2875E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f2876F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2877G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC0729e
    /* renamed from: m */
    public final void mo2008m() {
        C1264n c1264n = new C1264n();
        c1264n.m2950b(this);
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, new ArrayList());
                }
                ((List) hashMap.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2905t * 0.66f) : this.f2905t;
            Iterator it = list.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = c1264n.f5090c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C1259i());
                }
                C1260j c1260j = ((C1259i) hashMap2.get(Integer.valueOf(id))).f4986d;
                c1260j.f5056z = R.id.circle_center;
                c1260j.f4990A = round;
                c1260j.f4991B = f;
                f += 360.0f / list.size();
            }
        }
        c1264n.m2949a(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f2885z;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    /* renamed from: n */
    public final void m2009n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f2881v.f2892g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.f2885z;
            int size = sparseArray.size();
            rectF = this.f2883x;
            rect = this.f2882w;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            TextView textView3 = (TextView) sparseArray.get(i3);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2884y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2872B, this.f2873C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2878H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        m2009n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f2877G / Math.max(Math.max(this.f2875E / displayMetrics.heightPixels, this.f2876F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
