package p135z1;

import androidx.emoji2.text.C0605s;
import java.io.Closeable;
import p026J1.C0248p;
import p026J1.C0249q;
import p095l1.AbstractC1136c;

/* renamed from: z1.k */
/* loaded from: classes.dex */
public final class C1343k implements Closeable {

    /* renamed from: a */
    public final C0249q f5553a;

    /* renamed from: b */
    public final C0248p f5554b;

    /* renamed from: c */
    public final /* synthetic */ C0605s f5555c;

    public C1343k(C0605s c0605s, C0249q c0249q, C0248p c0248p) {
        this.f5555c = c0605s;
        AbstractC1136c.m2637e(c0249q, "source");
        AbstractC1136c.m2637e(c0248p, "sink");
        this.f5553a = c0249q;
        this.f5554b = c0248p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5555c.m1539a(true, true, null);
    }
}
