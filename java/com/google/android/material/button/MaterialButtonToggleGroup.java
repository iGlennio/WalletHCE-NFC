package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C0730f;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p014F0.AbstractC0128E;
import p014F0.C0133a;
import p027K.AbstractC0272P;
import p034M0.C0356a;
import p034M0.C0365j;
import p034M0.C0366k;
import p049R0.AbstractC0463a;
import p088j.C0985d0;
import p108q0.AbstractC1183a;
import p125w0.C1299d;
import p125w0.C1300e;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k */
    public static final /* synthetic */ int f2585k = 0;

    /* renamed from: a */
    public final ArrayList f2586a;

    /* renamed from: b */
    public final C0985d0 f2587b;

    /* renamed from: c */
    public final LinkedHashSet f2588c;

    /* renamed from: d */
    public final C1299d f2589d;

    /* renamed from: e */
    public Integer[] f2590e;

    /* renamed from: f */
    public boolean f2591f;

    /* renamed from: g */
    public boolean f2592g;

    /* renamed from: h */
    public boolean f2593h;

    /* renamed from: i */
    public final int f2594i;

    /* renamed from: j */
    public HashSet f2595j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0463a.m1220a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f2586a = new ArrayList();
        this.f2587b = new C0985d0(9, this);
        this.f2588c = new LinkedHashSet();
        this.f2589d = new C1299d(this);
        this.f2591f = false;
        this.f2595j = new HashSet();
        TypedArray m456f = AbstractC0128E.m456f(getContext(), attributeSet, AbstractC1183a.f4532k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(m456f.getBoolean(3, false));
        this.f2594i = m456f.getResourceId(1, -1);
        this.f2593h = m456f.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(m456f.getBoolean(0, true));
        m456f.recycle();
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m1929c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m1929c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && m1929c(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2587b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m1927a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i2 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m1928b(materialButton.getId(), materialButton.f2582o);
        C0366k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2586a.add(new C1300e(shapeAppearanceModel.f970e, shapeAppearanceModel.f973h, shapeAppearanceModel.f971f, shapeAppearanceModel.f972g));
        materialButton.setEnabled(isEnabled());
        AbstractC0272P.m823m(materialButton, new C0133a(3, this));
    }

    /* renamed from: b */
    public final void m1928b(int i2, boolean z2) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f2595j);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f2592g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.f2593h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        m1930d(hashSet);
    }

    /* renamed from: c */
    public final boolean m1929c(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    /* renamed from: d */
    public final void m1930d(Set set) {
        HashSet hashSet = this.f2595j;
        this.f2595j = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f2591f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f2591f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f2588c.iterator();
                while (it.hasNext()) {
                    ((C0730f) it.next()).m2012a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2589d);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f2590e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m1931e() {
        C1300e c1300e;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                C0365j m1037e = materialButton.getShapeAppearanceModel().m1037e();
                C1300e c1300e2 = (C1300e) this.f2586a.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    C0356a c0356a = C1300e.f5330e;
                    if (i2 == firstVisibleChildIndex) {
                        c1300e = z2 ? AbstractC0128E.m455e(this) ? new C1300e(c0356a, c0356a, c1300e2.f5332b, c1300e2.f5333c) : new C1300e(c1300e2.f5331a, c1300e2.f5334d, c0356a, c0356a) : new C1300e(c1300e2.f5331a, c0356a, c1300e2.f5332b, c0356a);
                    } else if (i2 == lastVisibleChildIndex) {
                        c1300e = z2 ? AbstractC0128E.m455e(this) ? new C1300e(c1300e2.f5331a, c1300e2.f5334d, c0356a, c0356a) : new C1300e(c0356a, c0356a, c1300e2.f5332b, c1300e2.f5333c) : new C1300e(c0356a, c1300e2.f5334d, c0356a, c1300e2.f5333c);
                    } else {
                        c1300e2 = null;
                    }
                    c1300e2 = c1300e;
                }
                if (c1300e2 == null) {
                    m1037e.f958e = new C0356a(0.0f);
                    m1037e.f959f = new C0356a(0.0f);
                    m1037e.f960g = new C0356a(0.0f);
                    m1037e.f961h = new C0356a(0.0f);
                } else {
                    m1037e.f958e = c1300e2.f5331a;
                    m1037e.f961h = c1300e2.f5334d;
                    m1037e.f959f = c1300e2.f5332b;
                    m1037e.f960g = c1300e2.f5333c;
                }
                materialButton.setShapeAppearanceModel(m1037e.m1032a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2592g || this.f2595j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2595j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            if (this.f2595j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f2590e;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f2594i;
        if (i2 != -1) {
            m1930d(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f2592g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        m1931e();
        m1927a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2586a.remove(indexOfChild);
        }
        m1931e();
        m1927a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f2593h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f2592g != z2) {
            this.f2592g = z2;
            m1930d(new HashSet());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName((this.f2592g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
