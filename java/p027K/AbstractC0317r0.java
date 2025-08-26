package p027K;

import android.view.WindowInsets;

/* renamed from: K.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC0317r0 {
    /* renamed from: a */
    public static int m933a(int i2) {
        int statusBars;
        int i3 = 0;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i2 & i4) != 0) {
                if (i4 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i4 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i4 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i4 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i4 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i4 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i4 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i4 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i3 |= statusBars;
            }
        }
        return i3;
    }
}
