package p009D0;

import android.content.Context;
import com.nfupay.s145.R;
import p010D1.AbstractC0096d;
import p047Q1.AbstractC0458e;

/* renamed from: D0.a */
/* loaded from: classes.dex */
public final class C0092a {

    /* renamed from: f */
    public static final int f277f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f278a;

    /* renamed from: b */
    public final int f279b;

    /* renamed from: c */
    public final int f280c;

    /* renamed from: d */
    public final int f281d;

    /* renamed from: e */
    public final float f282e;

    public C0092a(Context context) {
        boolean m338a0 = AbstractC0096d.m338a0(context, R.attr.elevationOverlayEnabled, false);
        int m1207y = AbstractC0458e.m1207y(context, R.attr.elevationOverlayColor, 0);
        int m1207y2 = AbstractC0458e.m1207y(context, R.attr.elevationOverlayAccentColor, 0);
        int m1207y3 = AbstractC0458e.m1207y(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f278a = m338a0;
        this.f279b = m1207y;
        this.f280c = m1207y2;
        this.f281d = m1207y3;
        this.f282e = f;
    }
}
