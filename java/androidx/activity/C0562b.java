package androidx.activity;

import android.window.BackEvent;
import p095l1.AbstractC1136c;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public final class C0562b {

    /* renamed from: a */
    public final float f1562a;

    /* renamed from: b */
    public final float f1563b;

    /* renamed from: c */
    public final float f1564c;

    /* renamed from: d */
    public final int f1565d;

    public C0562b(BackEvent backEvent) {
        AbstractC1136c.m2637e(backEvent, "backEvent");
        C0561a c0561a = C0561a.f1561a;
        float m1352d = c0561a.m1352d(backEvent);
        float m1353e = c0561a.m1353e(backEvent);
        float m1350b = c0561a.m1350b(backEvent);
        int m1351c = c0561a.m1351c(backEvent);
        this.f1562a = m1352d;
        this.f1563b = m1353e;
        this.f1564c = m1350b;
        this.f1565d = m1351c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1562a + ", touchY=" + this.f1563b + ", progress=" + this.f1564c + ", swipeEdge=" + this.f1565d + '}';
    }
}
