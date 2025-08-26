package p075d1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p095l1.AbstractC1136c;

/* renamed from: d1.o */
/* loaded from: classes.dex */
public abstract class AbstractC0763o extends AbstractC0762n {
    /* renamed from: Y */
    public static void m2058Y(List list, Iterable iterable) {
        AbstractC1136c.m2637e(list, "<this>");
        AbstractC1136c.m2637e(iterable, "elements");
        if (iterable instanceof Collection) {
            list.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            list.add(it.next());
        }
    }
}
