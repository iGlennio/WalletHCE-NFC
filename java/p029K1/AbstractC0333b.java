package p029K1;

import p026J1.C0252t;
import p095l1.AbstractC1136c;

/* renamed from: K1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0333b {

    /* renamed from: a */
    public static final char[] f872a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static final int m956a(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* renamed from: b */
    public static final int m957b(C0252t c0252t, int i2) {
        int i3;
        AbstractC1136c.m2637e(c0252t, "$this$segment");
        int i4 = i2 + 1;
        int length = c0252t.f749e.length;
        int[] iArr = c0252t.f750f;
        AbstractC1136c.m2637e(iArr, "$this$binarySearch");
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }
}
