package p060X;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p047Q1.AbstractC0458e;

/* renamed from: X.f */
/* loaded from: classes.dex */
public final class C0538f extends AbstractC0458e {

    /* renamed from: h */
    public final TextView f1488h;

    /* renamed from: i */
    public final C0536d f1489i;

    /* renamed from: j */
    public boolean f1490j = true;

    public C0538f(TextView textView) {
        this.f1488h = textView;
        this.f1489i = new C0536d(textView);
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: B */
    public final InputFilter[] mo1209B(InputFilter[] inputFilterArr) {
        if (!this.f1490j) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C0536d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            C0536d c0536d = this.f1489i;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0536d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i5] == c0536d) {
                return inputFilterArr;
            }
            i5++;
        }
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: U */
    public final void mo1214U(boolean z2) {
        if (z2) {
            m1294e0();
        }
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: X */
    public final void mo1215X(boolean z2) {
        this.f1490j = z2;
        m1294e0();
        TextView textView = this.f1488h;
        textView.setFilters(mo1209B(textView.getFilters()));
    }

    /* renamed from: e0 */
    public final void m1294e0() {
        TextView textView = this.f1488h;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f1490j) {
            if (!(transformationMethod instanceof C0542j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0542j(transformationMethod);
            }
        } else if (transformationMethod instanceof C0542j) {
            transformationMethod = ((C0542j) transformationMethod).f1496a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
