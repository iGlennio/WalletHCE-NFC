package p034M0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: M0.a */
/* loaded from: classes.dex */
public final class C0356a implements InterfaceC0358c {

    /* renamed from: a */
    public final float f908a;

    public C0356a(float f) {
        this.f908a = f;
    }

    @Override // p034M0.InterfaceC0358c
    /* renamed from: a */
    public final float mo1004a(RectF rectF) {
        return this.f908a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0356a) && this.f908a == ((C0356a) obj).f908a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f908a)});
    }
}
