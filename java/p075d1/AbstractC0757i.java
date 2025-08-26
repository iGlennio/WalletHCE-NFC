package p075d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p095l1.AbstractC1136c;

/* renamed from: d1.i */
/* loaded from: classes.dex */
public abstract class AbstractC0757i extends AbstractC0763o {
    /* renamed from: Z */
    public static final void m2054Z(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, C0749a c0749a) {
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : collection) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            AbstractC0096d.m341d(sb, obj, c0749a);
        }
        sb.append(charSequence3);
    }

    /* renamed from: a0 */
    public static List m2055a0(List list) {
        AbstractC1136c.m2637e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : AbstractC0104l.m391F(list.get(0)) : C0765q.f2996a;
    }
}
