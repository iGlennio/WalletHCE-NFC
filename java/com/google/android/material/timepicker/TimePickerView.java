package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.nfupay.s145.R;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f2899t = 0;

    /* renamed from: s */
    public final Chip f2900s;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0731g viewOnClickListenerC0731g = new ViewOnClickListenerC0731g(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f2588c.add(new C0730f());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f2900s = chip2;
        ViewOnTouchListenerC0733i viewOnTouchListenerC0733i = new ViewOnTouchListenerC0733i(new GestureDetector(getContext(), new C0732h(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0733i);
        chip2.setOnTouchListener(viewOnTouchListenerC0733i);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC0731g);
        chip2.setOnClickListener(viewOnClickListenerC0731g);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            this.f2900s.sendAccessibilityEvent(8);
        }
    }
}
