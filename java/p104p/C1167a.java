package p104p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a */
/* loaded from: classes.dex */
public final class C1167a {

    /* renamed from: b */
    public static final C1167a f4447b;

    /* renamed from: c */
    public static final C1167a f4448c;

    /* renamed from: a */
    public final CancellationException f4449a;

    static {
        if (AbstractFutureC1173g.f4460d) {
            f4448c = null;
            f4447b = null;
        } else {
            f4448c = new C1167a(false, null);
            f4447b = new C1167a(true, null);
        }
    }

    public C1167a(boolean z2, CancellationException cancellationException) {
        this.f4449a = cancellationException;
    }
}
