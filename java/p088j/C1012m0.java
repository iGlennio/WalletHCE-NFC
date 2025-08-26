package p088j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j.m0 */
/* loaded from: classes.dex */
public final class C1012m0 {

    /* renamed from: l */
    public static final RectF f3994l = new RectF();

    /* renamed from: m */
    public static final ConcurrentHashMap f3995m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f3996a = 0;

    /* renamed from: b */
    public boolean f3997b = false;

    /* renamed from: c */
    public float f3998c = -1.0f;

    /* renamed from: d */
    public float f3999d = -1.0f;

    /* renamed from: e */
    public float f4000e = -1.0f;

    /* renamed from: f */
    public int[] f4001f = new int[0];

    /* renamed from: g */
    public boolean f4002g = false;

    /* renamed from: h */
    public TextPaint f4003h;

    /* renamed from: i */
    public final TextView f4004i;

    /* renamed from: j */
    public final Context f4005j;

    /* renamed from: k */
    public final C1003j0 f4006k;

    static {
        new ConcurrentHashMap();
    }

    public C1012m0(TextView textView) {
        this.f4004i = textView;
        this.f4005j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4006k = new C1006k0();
        } else {
            this.f4006k = new C1003j0();
        }
    }

    /* renamed from: b */
    public static int[] m2491b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public static Method m2492d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3995m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* renamed from: e */
    public static Object m2493e(Object obj, String str, Object obj2) {
        try {
            return m2492d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    /* renamed from: a */
    public final void m2494a() {
        if (m2496f()) {
            if (this.f3997b) {
                if (this.f4004i.getMeasuredHeight() <= 0 || this.f4004i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f4006k.mo2490b(this.f4004i) ? 1048576 : (this.f4004i.getMeasuredWidth() - this.f4004i.getTotalPaddingLeft()) - this.f4004i.getTotalPaddingRight();
                int height = (this.f4004i.getHeight() - this.f4004i.getCompoundPaddingBottom()) - this.f4004i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3994l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float m2495c = m2495c(rectF);
                        if (m2495c != this.f4004i.getTextSize()) {
                            m2497g(0, m2495c);
                        }
                    } finally {
                    }
                }
            }
            this.f3997b = true;
        }
    }

    /* renamed from: c */
    public final int m2495c(RectF rectF) {
        CharSequence transformation;
        int length = this.f4001f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 <= i2) {
            int i5 = (i4 + i2) / 2;
            int i6 = this.f4001f[i5];
            TextView textView = this.f4004i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int m2468b = AbstractC0994g0.m2468b(textView);
            TextPaint textPaint = this.f4003h;
            if (textPaint == null) {
                this.f4003h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f4003h.set(textView.getPaint());
            this.f4003h.setTextSize(i6);
            StaticLayout m2478a = AbstractC1000i0.m2478a(charSequence, (Layout.Alignment) m2493e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m2468b, this.f4004i, this.f4003h, this.f4006k);
            if ((m2468b == -1 || (m2478a.getLineCount() <= m2468b && m2478a.getLineEnd(m2478a.getLineCount() - 1) == charSequence.length())) && m2478a.getHeight() <= rectF.bottom) {
                int i7 = i5 + 1;
                i3 = i4;
                i4 = i7;
            } else {
                i3 = i5 - 1;
                i2 = i3;
            }
        }
        return this.f4001f[i3];
    }

    /* renamed from: f */
    public final boolean m2496f() {
        return m2500j() && this.f3996a != 0;
    }

    /* renamed from: g */
    public final void m2497g(int i2, float f) {
        Context context = this.f4005j;
        float applyDimension = TypedValue.applyDimension(i2, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f4004i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean m2473a = AbstractC0997h0.m2473a(textView);
            if (textView.getLayout() != null) {
                this.f3997b = false;
                try {
                    Method m2492d = m2492d("nullLayouts");
                    if (m2492d != null) {
                        m2492d.invoke(textView, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (m2473a) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: h */
    public final boolean m2498h() {
        if (m2500j() && this.f3996a == 1) {
            if (!this.f4002g || this.f4001f.length == 0) {
                int floor = ((int) Math.floor((this.f4000e - this.f3999d) / this.f3998c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f3998c) + this.f3999d);
                }
                this.f4001f = m2491b(iArr);
            }
            this.f3997b = true;
        } else {
            this.f3997b = false;
        }
        return this.f3997b;
    }

    /* renamed from: i */
    public final boolean m2499i() {
        boolean z2 = this.f4001f.length > 0;
        this.f4002g = z2;
        if (z2) {
            this.f3996a = 1;
            this.f3999d = r0[0];
            this.f4000e = r0[r1 - 1];
            this.f3998c = -1.0f;
        }
        return z2;
    }

    /* renamed from: j */
    public final boolean m2500j() {
        return !(this.f4004i instanceof C1041w);
    }

    /* renamed from: k */
    public final void m2501k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f3996a = 1;
        this.f3999d = f;
        this.f4000e = f2;
        this.f3998c = f3;
        this.f4002g = false;
    }
}
