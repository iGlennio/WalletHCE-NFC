package p109q1;

import java.util.Iterator;
import p075d1.C0750b;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public final class C1184a implements InterfaceC1185b {

    /* renamed from: a */
    public final InterfaceC1185b f4548a;

    /* renamed from: b */
    public final int f4549b;

    public C1184a(InterfaceC1185b interfaceC1185b, int i2) {
        this.f4548a = interfaceC1185b;
        this.f4549b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // p109q1.InterfaceC1185b
    public final Iterator iterator() {
        return new C0750b(this);
    }
}
