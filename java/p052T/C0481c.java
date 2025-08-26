package p052T;

import android.graphics.Rect;
import java.util.Comparator;
import p030L.C0342i;
import p034M0.C0360e;

/* renamed from: T.c */
/* loaded from: classes.dex */
public final class C0481c implements Comparator {

    /* renamed from: a */
    public final Rect f1302a = new Rect();

    /* renamed from: b */
    public final Rect f1303b = new Rect();

    /* renamed from: c */
    public final boolean f1304c;

    /* renamed from: d */
    public final C0360e f1305d;

    public C0481c(boolean z2, C0360e c0360e) {
        this.f1304c = z2;
        this.f1305d = c0360e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1305d.getClass();
        Rect rect = this.f1302a;
        ((C0342i) obj).m993f(rect);
        Rect rect2 = this.f1303b;
        ((C0342i) obj2).m993f(rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        boolean z2 = this.f1304c;
        if (i4 < i5) {
            return z2 ? 1 : -1;
        }
        if (i4 > i5) {
            return z2 ? -1 : 1;
        }
        int i6 = rect.bottom;
        int i7 = rect2.bottom;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if (i8 < i9) {
            return z2 ? 1 : -1;
        }
        if (i8 > i9) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
