package p034M0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p031L0.C0353a;

/* renamed from: M0.n */
/* loaded from: classes.dex */
public final class C0369n extends AbstractC0375t {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f991c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f992d;

    public C0369n(ArrayList arrayList, Matrix matrix) {
        this.f991c = arrayList;
        this.f992d = matrix;
    }

    @Override // p034M0.AbstractC0375t
    /* renamed from: a */
    public final void mo1040a(Matrix matrix, C0353a c0353a, int i2, Canvas canvas) {
        Iterator it = this.f991c.iterator();
        while (it.hasNext()) {
            ((AbstractC0375t) it.next()).mo1040a(this.f992d, c0353a, i2, canvas);
        }
    }
}
