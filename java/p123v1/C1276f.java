package p123v1;

import java.util.Comparator;
import p095l1.AbstractC1136c;

/* renamed from: v1.f */
/* loaded from: classes.dex */
public final class C1276f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC1136c.m2637e(str, "a");
        AbstractC1136c.m2637e(str2, "b");
        int min = Math.min(str.length(), str2.length());
        for (int i2 = 4; i2 < min; i2++) {
            char charAt = str.charAt(i2);
            char charAt2 = str2.charAt(i2);
            if (charAt != charAt2) {
                return AbstractC1136c.m2638f(charAt, charAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
