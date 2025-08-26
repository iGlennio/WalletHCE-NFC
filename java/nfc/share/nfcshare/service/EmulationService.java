package nfc.share.nfcshare.service;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.util.Log;
import nfc.share.nfcshare.model.MqttChannel;
import p118t1.AbstractC1244n;

/* loaded from: classes.dex */
public class EmulationService extends HostApduService {
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        AbstractC1244n.f4852f = this;
        Log.i("EmulationService", "NFC模拟服务已启动");
    }

    @Override // android.nfc.cardemulation.HostApduService
    public final void onDeactivated(int i2) {
        Log.w("EmulationService", "NFC通信中断，原因: ".concat(i2 == 0 ? "NFC连接丢失" : "通信被主动断开"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        AbstractC1244n.f4852f = null;
        Log.i("EmulationService", "NFC模拟服务已停止");
    }

    @Override // android.nfc.cardemulation.HostApduService
    public final byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        try {
            AbstractC1244n.f4848b.m521C(MqttChannel.FETCH_CHANNEL, AbstractC1244n.m2913c(bArr));
            return null;
        } catch (Exception e2) {
            Log.e("EmulationService", "处理APDU指令时发生异常: " + e2.getMessage(), e2);
            return AbstractC1244n.m2912b("6F00");
        }
    }
}
