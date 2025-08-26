package p040O0;

import android.os.Handler;
import android.os.Message;
import p005C.C0046i;

/* renamed from: O0.e */
/* loaded from: classes.dex */
public final class C0396e implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C0046i f1053a;

    public C0396e(C0046i c0046i) {
        this.f1053a = c0046i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0046i c0046i = this.f1053a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (c0046i.f116b) {
            throw null;
        }
    }
}
