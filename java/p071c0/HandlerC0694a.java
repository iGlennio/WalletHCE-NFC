package p071c0;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p002B.C0019i;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public final class HandlerC0694a extends Handler {

    /* renamed from: a */
    public final /* synthetic */ int f2465a = 1;

    /* renamed from: b */
    public Object f2466b;

    public /* synthetic */ HandlerC0694a() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        C0019i[] c0019iArr;
        switch (this.f2465a) {
            case 0:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C0696c c0696c = (C0696c) this.f2466b;
                while (true) {
                    synchronized (c0696c.f2473b) {
                        try {
                            size = c0696c.f2475d.size();
                            if (size <= 0) {
                                return;
                            }
                            c0019iArr = new C0019i[size];
                            c0696c.f2475d.toArray(c0019iArr);
                            c0696c.f2475d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        C0019i c0019i = c0019iArr[i2];
                        int size2 = ((ArrayList) c0019i.f48c).size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            C0695b c0695b = (C0695b) ((ArrayList) c0019i.f48c).get(i3);
                            c0695b.getClass();
                            c0695b.f2468b.onReceive(c0696c.f2472a, (Intent) c0019i.f47b);
                        }
                    }
                }
            default:
                int i4 = message.what;
                if (i4 == -3 || i4 == -2 || i4 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f2466b).get(), message.what);
                    return;
                } else {
                    if (i4 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0694a(C0696c c0696c, Looper looper) {
        super(looper);
        this.f2466b = c0696c;
    }
}
