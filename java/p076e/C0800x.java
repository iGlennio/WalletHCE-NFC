package p076e;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p088j.C0930D;
import p088j.C0991f0;
import p088j.C1017o;
import p088j.C1023q;
import p088j.C1026r;
import p101o.C1161k;

/* renamed from: e.x */
/* loaded from: classes.dex */
public class C0800x {

    /* renamed from: b */
    public static final Class[] f3191b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f3192c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f3193d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f3194e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f3195f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f3196g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C1161k f3197h = new C1161k();

    /* renamed from: a */
    public final Object[] f3198a = new Object[2];

    /* renamed from: a */
    public C1017o mo2002a(Context context, AttributeSet attributeSet) {
        return new C1017o(context, attributeSet);
    }

    /* renamed from: b */
    public C1023q mo2003b(Context context, AttributeSet attributeSet) {
        return new C1023q(context, attributeSet, com.nfupay.s145.R.attr.buttonStyle);
    }

    /* renamed from: c */
    public C1026r mo2004c(Context context, AttributeSet attributeSet) {
        return new C1026r(context, attributeSet, com.nfupay.s145.R.attr.checkboxStyle);
    }

    /* renamed from: d */
    public C0930D mo2005d(Context context, AttributeSet attributeSet) {
        return new C0930D(context, attributeSet);
    }

    /* renamed from: e */
    public C0991f0 mo2006e(Context context, AttributeSet attributeSet) {
        return new C0991f0(context, attributeSet);
    }

    /* renamed from: f */
    public final View m2150f(Context context, String str, String str2) {
        String concat;
        C1161k c1161k = f3197h;
        Constructor constructor = (Constructor) c1161k.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3191b);
            c1161k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3198a);
    }
}
