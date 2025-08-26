package p002B;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: B.m */
/* loaded from: classes.dex */
public final class C0023m {

    /* renamed from: a */
    public final Resources f52a;

    /* renamed from: b */
    public final Resources.Theme f53b;

    public C0023m(Resources resources, Resources.Theme theme) {
        this.f52a = resources;
        this.f53b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0023m.class == obj.getClass()) {
            C0023m c0023m = (C0023m) obj;
            if (this.f52a.equals(c0023m.f52a) && Objects.equals(this.f53b, c0023m.f53b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f52a, this.f53b);
    }
}
