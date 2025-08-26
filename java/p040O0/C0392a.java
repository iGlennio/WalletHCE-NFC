package p040O0;

import android.os.Handler;
import android.os.Message;

/* renamed from: O0.a */
/* loaded from: classes.dex */
public final class C0392a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        }
        if (i2 != 1) {
            return false;
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
