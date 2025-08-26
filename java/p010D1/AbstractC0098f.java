package p010D1;

import org.conscrypt.Conscrypt;

/* renamed from: D1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0098f {
    /* renamed from: a */
    public static boolean m385a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }
}
