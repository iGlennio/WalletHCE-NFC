package p043P0;

import android.content.res.TypedArray;
import android.util.SparseArray;
import p017G0.C0176h;

/* renamed from: P0.o */
/* loaded from: classes.dex */
public final class C0421o {

    /* renamed from: a */
    public final SparseArray f1110a = new SparseArray();

    /* renamed from: b */
    public final C0422p f1111b;

    /* renamed from: c */
    public final int f1112c;

    /* renamed from: d */
    public final int f1113d;

    public C0421o(C0422p c0422p, C0176h c0176h) {
        this.f1111b = c0422p;
        TypedArray typedArray = (TypedArray) c0176h.f516c;
        this.f1112c = typedArray.getResourceId(28, 0);
        this.f1113d = typedArray.getResourceId(52, 0);
    }
}
