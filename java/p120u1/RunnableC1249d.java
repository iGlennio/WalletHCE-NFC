package p120u1;

import android.util.Log;
import nfc.share.nfcshare.model.MqttChannel;
import nfc.share.nfcshare.model.WSMessage;
import p017G0.C0176h;
import p051S0.C0469d;
import p088j.C0985d0;
import p118t1.AbstractC1244n;
import p118t1.C1234d;
import p118t1.RunnableC1238h;

/* renamed from: u1.d */
/* loaded from: classes.dex */
public final class RunnableC1249d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4863a;

    /* renamed from: b */
    public final /* synthetic */ C0985d0 f4864b;

    public /* synthetic */ RunnableC1249d(C0985d0 c0985d0, int i2) {
        this.f4863a = i2;
        this.f4864b = c0985d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4863a) {
            case 0:
                C0985d0 c0985d0 = ((C1250e) this.f4864b.f3904b).f4871g;
                c0985d0.getClass();
                Log.d("test", "ws 连接成功");
                AbstractC1244n.m2911a("已连接");
                C0176h.f513f = true;
                C0176h c0176h = (C0176h) c0985d0.f3904b;
                C1234d c1234d = (C1234d) c0176h.f516c;
                if (c1234d != null) {
                    c1234d.f4828b.runOnUiThread(new RunnableC1238h(true));
                }
                Log.i("MqttService", "uid: " + AbstractC1244n.f4853g);
                if (((C1250e) c0176h.f517d).f4869e) {
                    ((C1250e) c0176h.f517d).m2921b(new C0469d().m1226d(new WSMessage("join", AbstractC1244n.f4853g, "ssss", "")));
                    AbstractC1244n.m2911a("等待对方连接");
                    c0176h.m521C(MqttChannel.NOTIFICATION_CHANNEL, "双方建立-连接成功");
                    if (AbstractC1244n.f4854h != null) {
                        Log.d("test", "resend card..");
                        c0176h.m521C(MqttChannel.CARD_INFO_CHANNEL, AbstractC1244n.m2913c(AbstractC1244n.f4854h.toString().getBytes()));
                        break;
                    }
                }
                break;
            default:
                C0985d0 c0985d02 = ((C1250e) this.f4864b.f3904b).f4871g;
                c0985d02.getClass();
                Log.d("test", "ws 连接关闭");
                C0176h.f513f = false;
                C1234d c1234d2 = (C1234d) ((C0176h) c0985d02.f3904b).f516c;
                if (c1234d2 != null) {
                    c1234d2.f4828b.runOnUiThread(new RunnableC1238h(false));
                    break;
                }
                break;
        }
    }
}
