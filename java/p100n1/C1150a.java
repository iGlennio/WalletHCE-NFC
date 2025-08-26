package p100n1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p095l1.AbstractC1136c;
import p097m1.AbstractC1143a;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public final class C1150a extends AbstractC1143a {
    @Override // p097m1.AbstractC1143a
    /* renamed from: a */
    public final Random mo2643a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC1136c.m2636d(current, "current()");
        return current;
    }
}
