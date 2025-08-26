package p078e1;

import java.util.Comparator;
import p095l1.AbstractC1136c;

/* renamed from: e1.a */
/* loaded from: classes.dex */
public final class C0804a implements Comparator {

    /* renamed from: b */
    public static final C0804a f3201b = new C0804a(0);

    /* renamed from: c */
    public static final C0804a f3202c = new C0804a(1);

    /* renamed from: a */
    public final /* synthetic */ int f3203a;

    public /* synthetic */ C0804a(int i2) {
        this.f3203a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3203a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC1136c.m2637e(comparable, "a");
                AbstractC1136c.m2637e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC1136c.m2637e(comparable3, "a");
                AbstractC1136c.m2637e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f3203a) {
            case 0:
                return f3202c;
            default:
                return f3201b;
        }
    }
}
