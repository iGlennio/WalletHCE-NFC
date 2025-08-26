package p121v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: v.m */
/* loaded from: classes.dex */
public final class C1263m {

    /* renamed from: n */
    public static final SparseIntArray f5071n;

    /* renamed from: a */
    public float f5072a;

    /* renamed from: b */
    public float f5073b;

    /* renamed from: c */
    public float f5074c;

    /* renamed from: d */
    public float f5075d;

    /* renamed from: e */
    public float f5076e;

    /* renamed from: f */
    public float f5077f;

    /* renamed from: g */
    public float f5078g;

    /* renamed from: h */
    public int f5079h;

    /* renamed from: i */
    public float f5080i;

    /* renamed from: j */
    public float f5081j;

    /* renamed from: k */
    public float f5082k;

    /* renamed from: l */
    public boolean f5083l;

    /* renamed from: m */
    public float f5084m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5071n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* renamed from: a */
    public final void m2943a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1267q.f5099i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f5071n.get(index)) {
                case 1:
                    this.f5072a = obtainStyledAttributes.getFloat(index, this.f5072a);
                    break;
                case 2:
                    this.f5073b = obtainStyledAttributes.getFloat(index, this.f5073b);
                    break;
                case 3:
                    this.f5074c = obtainStyledAttributes.getFloat(index, this.f5074c);
                    break;
                case 4:
                    this.f5075d = obtainStyledAttributes.getFloat(index, this.f5075d);
                    break;
                case 5:
                    this.f5076e = obtainStyledAttributes.getFloat(index, this.f5076e);
                    break;
                case 6:
                    this.f5077f = obtainStyledAttributes.getDimension(index, this.f5077f);
                    break;
                case 7:
                    this.f5078g = obtainStyledAttributes.getDimension(index, this.f5078g);
                    break;
                case 8:
                    this.f5080i = obtainStyledAttributes.getDimension(index, this.f5080i);
                    break;
                case 9:
                    this.f5081j = obtainStyledAttributes.getDimension(index, this.f5081j);
                    break;
                case 10:
                    this.f5082k = obtainStyledAttributes.getDimension(index, this.f5082k);
                    break;
                case 11:
                    this.f5083l = true;
                    this.f5084m = obtainStyledAttributes.getDimension(index, this.f5084m);
                    break;
                case 12:
                    this.f5079h = C1264n.m2946f(obtainStyledAttributes, index, this.f5079h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
