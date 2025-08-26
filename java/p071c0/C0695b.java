package p071c0;

import android.content.IntentFilter;
import p076e.C0794r;

/* renamed from: c0.b */
/* loaded from: classes.dex */
public final class C0695b {

    /* renamed from: a */
    public final IntentFilter f2467a;

    /* renamed from: b */
    public final C0794r f2468b;

    /* renamed from: c */
    public boolean f2469c;

    public C0695b(IntentFilter intentFilter, C0794r c0794r) {
        this.f2467a = intentFilter;
        this.f2468b = c0794r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f2468b);
        sb.append(" filter=");
        sb.append(this.f2467a);
        sb.append("}");
        return sb.toString();
    }
}
