package p007C1;

import java.io.IOException;

/* renamed from: C1.s */
/* loaded from: classes.dex */
public abstract class AbstractC0079s {
    /* renamed from: a */
    public static int m268a(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
    }
}
