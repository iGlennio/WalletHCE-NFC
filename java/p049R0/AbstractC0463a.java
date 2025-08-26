package p049R0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p083h.C0876d;

/* renamed from: R0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0463a {

    /* renamed from: a */
    public static final int[] f1270a = {R.attr.theme, com.nfupay.s145.R.attr.theme};

    /* renamed from: b */
    public static final int[] f1271b = {com.nfupay.s145.R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m1220a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1271b, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0876d) && ((C0876d) context).f3507a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0876d c0876d = new C0876d(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1270a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0876d.getTheme().applyStyle(resourceId2, true);
        }
        return c0876d;
    }
}
