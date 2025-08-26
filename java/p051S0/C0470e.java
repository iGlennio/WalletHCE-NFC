package p051S0;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: S0.e */
/* loaded from: classes.dex */
public final class C0470e extends AbstractC0471f implements Iterable {

    /* renamed from: a */
    public final ArrayList f1284a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C0470e) && ((C0470e) obj).f1284a.equals(this.f1284a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f1284a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1284a.iterator();
    }
}
