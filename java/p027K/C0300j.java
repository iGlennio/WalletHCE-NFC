package p027K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.j */
/* loaded from: classes.dex */
public final class C0300j {

    /* renamed from: a */
    public final DisplayCutout f827a;

    public C0300j(DisplayCutout displayCutout) {
        this.f827a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0300j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f827a, ((C0300j) obj).f827a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f827a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f827a + "}";
    }
}
