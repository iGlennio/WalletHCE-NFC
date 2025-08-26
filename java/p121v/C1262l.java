package p121v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: v.l */
/* loaded from: classes.dex */
public final class C1262l {

    /* renamed from: a */
    public int f5067a;

    /* renamed from: b */
    public int f5068b;

    /* renamed from: c */
    public float f5069c;

    /* renamed from: d */
    public float f5070d;

    /* renamed from: a */
    public final void m2942a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1267q.f5097g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f5069c = obtainStyledAttributes.getFloat(index, this.f5069c);
            } else if (index == 0) {
                int i3 = obtainStyledAttributes.getInt(index, this.f5067a);
                this.f5067a = i3;
                this.f5067a = C1264n.f5085d[i3];
            } else if (index == 4) {
                this.f5068b = obtainStyledAttributes.getInt(index, this.f5068b);
            } else if (index == 3) {
                this.f5070d = obtainStyledAttributes.getFloat(index, this.f5070d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
