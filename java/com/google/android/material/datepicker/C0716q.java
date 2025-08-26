package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p027K.C0330z;
import p079f0.AbstractC0827X;

/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public final class C0716q extends AbstractC0827X {

    /* renamed from: t */
    public final TextView f2700t;

    /* renamed from: u */
    public final MaterialCalendarGridView f2701u;

    public C0716q(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2700t = textView;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        new C0330z(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m735d(textView, Boolean.TRUE);
        this.f2701u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
