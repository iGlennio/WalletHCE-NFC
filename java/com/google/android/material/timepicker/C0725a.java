package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p014F0.AbstractC0127D;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public final class C0725a extends AbstractC0127D {

    /* renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f2901a;

    public C0725a(ChipTextInputComboView chipTextInputComboView) {
        this.f2901a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2901a;
        if (isEmpty) {
            chipTextInputComboView.f2869a.setText(ChipTextInputComboView.m2007a(chipTextInputComboView, "00"));
            return;
        }
        String m2007a = ChipTextInputComboView.m2007a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2869a;
        if (TextUtils.isEmpty(m2007a)) {
            m2007a = ChipTextInputComboView.m2007a(chipTextInputComboView, "00");
        }
        chip.setText(m2007a);
    }
}
