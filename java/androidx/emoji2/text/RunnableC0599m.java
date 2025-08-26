package androidx.emoji2.text;

import android.os.Trace;
import p016G.AbstractC0168i;
import p118t1.AbstractC1244n;

/* renamed from: androidx.emoji2.text.m */
/* loaded from: classes.dex */
public final class RunnableC0599m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1989a;

    public /* synthetic */ RunnableC0599m(int i2) {
        this.f1989a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1989a) {
            case 0:
                try {
                    int i2 = AbstractC0168i.f500a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C0596j.f1974j != null) {
                        C0596j.m1525a().m1527c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i3 = AbstractC0168i.f500a;
                    Trace.endSection();
                    throw th;
                }
            default:
                AbstractC1244n.f4848b.m535i();
                return;
        }
    }
}
