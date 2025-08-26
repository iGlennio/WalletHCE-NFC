package p075d1;

import java.util.ArrayList;
import java.util.Arrays;
import p010D1.AbstractC0096d;
import p095l1.AbstractC1136c;

/* renamed from: d1.h */
/* loaded from: classes.dex */
public abstract class AbstractC0756h extends AbstractC0096d {
    /* renamed from: o0 */
    public static void m2049o0(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        AbstractC1136c.m2637e(bArr, "<this>");
        AbstractC1136c.m2637e(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
    }

    /* renamed from: p0 */
    public static final void m2050p0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        AbstractC1136c.m2637e(objArr, "<this>");
        AbstractC1136c.m2637e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    /* renamed from: q0 */
    public static byte[] m2051q0(byte[] bArr, int i2) {
        AbstractC1136c.m2637e(bArr, "<this>");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i2);
            AbstractC1136c.m2636d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    /* renamed from: r0 */
    public static void m2052r0(Object[] objArr, int i2, int i3) {
        AbstractC1136c.m2637e(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, (Object) null);
    }

    /* renamed from: s0 */
    public static ArrayList m2053s0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
