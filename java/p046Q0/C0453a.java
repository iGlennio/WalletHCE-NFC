package p046Q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.nfupay.s145.R;
import p010D1.AbstractC0096d;
import p088j.C0991f0;
import p108q0.AbstractC1183a;

/* renamed from: Q0.a */
/* loaded from: classes.dex */
public final class C0453a extends C0991f0 {
    /* renamed from: g */
    public static int m1162g(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            int i4 = iArr[i3];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i4, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i2 = dimensionPixelSize;
            } else {
                i2 = typedArray.getDimensionPixelSize(i4, -1);
            }
        }
        return i2;
    }

    @Override // p088j.C0991f0, android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (AbstractC0096d.m338a0(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i2, AbstractC1183a.f4538q);
            int m1162g = m1162g(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m1162g >= 0) {
                setLineHeight(m1162g);
            }
        }
    }
}
