package p121v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p110r.AbstractC1187a;

/* renamed from: v.k */
/* loaded from: classes.dex */
public final class C1261k {

    /* renamed from: j */
    public static final SparseIntArray f5057j;

    /* renamed from: a */
    public int f5058a;

    /* renamed from: b */
    public int f5059b;

    /* renamed from: c */
    public int f5060c;

    /* renamed from: d */
    public float f5061d;

    /* renamed from: e */
    public float f5062e;

    /* renamed from: f */
    public float f5063f;

    /* renamed from: g */
    public int f5064g;

    /* renamed from: h */
    public String f5065h;

    /* renamed from: i */
    public int f5066i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5057j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* renamed from: a */
    public final void m2941a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1267q.f5096f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f5057j.get(index)) {
                case 1:
                    this.f5062e = obtainStyledAttributes.getFloat(index, this.f5062e);
                    break;
                case 2:
                    this.f5060c = obtainStyledAttributes.getInt(index, this.f5060c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC1187a.f4551a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f5058a = C1264n.m2946f(obtainStyledAttributes, index, this.f5058a);
                    break;
                case 6:
                    this.f5059b = obtainStyledAttributes.getInteger(index, this.f5059b);
                    break;
                case 7:
                    this.f5061d = obtainStyledAttributes.getFloat(index, this.f5061d);
                    break;
                case 8:
                    this.f5064g = obtainStyledAttributes.getInteger(index, this.f5064g);
                    break;
                case 9:
                    this.f5063f = obtainStyledAttributes.getFloat(index, this.f5063f);
                    break;
                case 10:
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        this.f5066i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i3 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f5065h = string;
                        if (string.indexOf("/") > 0) {
                            this.f5066i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f5066i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
