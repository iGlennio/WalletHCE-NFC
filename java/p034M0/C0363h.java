package p034M0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: M0.h */
/* loaded from: classes.dex */
public final class C0363h implements InterfaceC0358c {

    /* renamed from: a */
    public final float f953a;

    public C0363h(float f) {
        this.f953a = f;
    }

    @Override // p034M0.InterfaceC0358c
    /* renamed from: a */
    public final float mo1004a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f953a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0363h) && this.f953a == ((C0363h) obj).f953a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f953a)});
    }
}
