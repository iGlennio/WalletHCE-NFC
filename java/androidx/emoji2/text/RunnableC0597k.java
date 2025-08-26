package androidx.emoji2.text;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ThreadPoolExecutor;
import nfc.share.nfcshare.model.MqttChannel;
import nfc.share.nfcshare.model.NfcInfo;
import nfc.share.nfcshare.model.WSMessage;
import p005C.C0046i;
import p010D1.AbstractC0104l;
import p017G0.C0176h;
import p047Q1.AbstractC0458e;
import p051S0.C0469d;
import p118t1.AbstractC1244n;
import p120u1.C1250e;

/* renamed from: androidx.emoji2.text.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0597k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1983a;

    /* renamed from: b */
    public final /* synthetic */ Object f1984b;

    /* renamed from: c */
    public final /* synthetic */ Object f1985c;

    /* renamed from: d */
    public final /* synthetic */ Object f1986d;

    public /* synthetic */ RunnableC0597k(Object obj, Object obj2, Object obj3, int i2) {
        this.f1983a = i2;
        this.f1984b = obj;
        this.f1985c = obj2;
        this.f1986d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1983a) {
            case 0:
                C0046i c0046i = (C0046i) this.f1984b;
                AbstractC0458e abstractC0458e = (AbstractC0458e) this.f1985c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1986d;
                c0046i.getClass();
                try {
                    C0603q m408o = AbstractC0104l.m408o((Context) c0046i.f116b);
                    if (m408o == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0602p c0602p = (C0602p) ((InterfaceC0595i) m408o.f1971b);
                    synchronized (c0602p.f2003d) {
                        c0602p.f2005f = threadPoolExecutor;
                    }
                    ((InterfaceC0595i) m408o.f1971b).mo183s(new C0598l(abstractC0458e, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0458e.mo1210J(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                String str = (String) this.f1985c;
                MqttChannel mqttChannel = (MqttChannel) this.f1986d;
                C0176h c0176h = (C0176h) this.f1984b;
                c0176h.getClass();
                try {
                    NfcInfo nfcInfo = new NfcInfo(str, AbstractC1244n.f4851e, mqttChannel);
                    if (((C1250e) c0176h.f517d).f4869e) {
                        C0469d c0469d = AbstractC1244n.f4847a;
                        ((C1250e) c0176h.f517d).m2921b(c0469d.m1226d(new WSMessage("message", "", c0469d.m1226d(nfcInfo), "")));
                    } else {
                        Log.e("test", "ws未连接");
                    }
                    return;
                } catch (Exception e2) {
                    Log.i("nfcshare", "推送消息至服务器失败！错误：" + e2.getMessage());
                    return;
                }
        }
    }
}
