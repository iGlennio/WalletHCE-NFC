package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import p027K.AbstractC0272P;
import p045Q.C0441h;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final boolean f2620a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0721v.m1964c(null);
        if (C0711l.m1952D(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.nfupay.s145.R.id.cancel_button);
            setNextFocusRightId(com.nfupay.s145.R.id.confirm_button);
        }
        this.f2620a = C0711l.m1952D(getContext(), com.nfupay.s145.R.attr.nestedScrollable);
        AbstractC0272P.m823m(this, new C0441h(4));
    }

    /* renamed from: a */
    public final C0714o m1945a() {
        return (C0714o) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0714o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0714o) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0714o c0714o = (C0714o) super.getAdapter();
        c0714o.getClass();
        int max = Math.max(c0714o.m1958a(), getFirstVisiblePosition());
        int min = Math.min(c0714o.m1960c(), getLastVisiblePosition());
        c0714o.getItem(max);
        c0714o.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i2, rect);
            return;
        }
        if (i2 == 33) {
            setSelection(((C0714o) super.getAdapter()).m1960c());
        } else if (i2 == 130) {
            setSelection(((C0714o) super.getAdapter()).m1958a());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0714o) super.getAdapter()).m1958a()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(((C0714o) super.getAdapter()).m1958a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f2620a) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i2) {
        if (i2 < ((C0714o) super.getAdapter()).m1958a()) {
            super.setSelection(((C0714o) super.getAdapter()).m1958a());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (C0714o) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0714o)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0714o.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
