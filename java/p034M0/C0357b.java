package p034M0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: M0.b */
/* loaded from: classes.dex */
public final class C0357b implements InterfaceC0358c {

    /* renamed from: a */
    public final InterfaceC0358c f909a;

    /* renamed from: b */
    public final float f910b;

    public C0357b(float f, InterfaceC0358c interfaceC0358c) {
        while (interfaceC0358c instanceof C0357b) {
            interfaceC0358c = ((C0357b) interfaceC0358c).f909a;
            f += ((C0357b) interfaceC0358c).f910b;
        }
        this.f909a = interfaceC0358c;
        this.f910b = f;
    }

    @Override // p034M0.InterfaceC0358c
    /* renamed from: a */
    public final float mo1004a(RectF rectF) {
        return Math.max(0.0f, this.f909a.mo1004a(rectF) + this.f910b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0357b)) {
            return false;
        }
        C0357b c0357b = (C0357b) obj;
        return this.f909a.equals(c0357b.f909a) && this.f910b == c0357b.f910b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f909a, Float.valueOf(this.f910b)});
    }
}
