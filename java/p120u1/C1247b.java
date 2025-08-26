package p120u1;

import android.nfc.tech.IsoDep;
import android.util.Log;
import java.util.TimerTask;

/* renamed from: u1.b */
/* loaded from: classes.dex */
public final class C1247b extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ C1248c f4857a;

    public C1247b(C1248c c1248c) {
        this.f4857a = c1248c;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C1248c c1248c = this.f4857a;
        try {
            Log.v("NfcService", "[心跳检测] 检查卡片连接状态...");
            IsoDep isoDep = C1248c.f4858e;
            if (isoDep != null && isoDep.isConnected()) {
                return;
            }
            Log.w("NfcService", "[心跳检测] 连接已断开");
            c1248c.m2918c();
            cancel();
        } catch (Exception e2) {
            Log.e("NfcService", "[心跳检测] 异常: " + e2.getMessage(), e2);
            c1248c.m2918c();
        }
    }
}
