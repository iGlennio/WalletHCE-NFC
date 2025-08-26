package p075d1;

import java.util.Collection;
import p095l1.AbstractC1136c;

/* renamed from: d1.k */
/* loaded from: classes.dex */
public abstract class AbstractC0759k extends AbstractC0758j {
    /* renamed from: X */
    public static int m2057X(Iterable iterable) {
        AbstractC1136c.m2637e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
