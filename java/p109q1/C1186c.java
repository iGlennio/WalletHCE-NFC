package p109q1;

import java.util.Iterator;
import p002B.C0019i;
import p112r1.C1192b;

/* renamed from: q1.c */
/* loaded from: classes.dex */
public final class C1186c implements Iterable {

    /* renamed from: a */
    public final /* synthetic */ C0019i f4550a;

    public C1186c(C0019i c0019i) {
        this.f4550a = c0019i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1192b(this.f4550a);
    }
}
