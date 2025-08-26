package p017G0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import androidx.activity.C0562b;
import com.nfupay.s145.R;
import p033M.AbstractC0355a;
import p047Q1.AbstractC0458e;

/* renamed from: G0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0169a {

    /* renamed from: a */
    public final TimeInterpolator f501a;

    /* renamed from: b */
    public final View f502b;

    /* renamed from: c */
    public final int f503c;

    /* renamed from: d */
    public final int f504d;

    /* renamed from: e */
    public final int f505e;

    /* renamed from: f */
    public C0562b f506f;

    public AbstractC0169a(View view) {
        this.f502b = view;
        Context context = view.getContext();
        this.f501a = AbstractC0458e.m1180T(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0355a.m1002b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f503c = AbstractC0458e.m1179S(context, R.attr.motionDurationMedium2, 300);
        this.f504d = AbstractC0458e.m1179S(context, R.attr.motionDurationShort3, 150);
        this.f505e = AbstractC0458e.m1179S(context, R.attr.motionDurationShort2, 100);
    }
}
