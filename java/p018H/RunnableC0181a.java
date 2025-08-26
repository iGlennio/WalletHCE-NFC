package p018H;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CurrencyLookup;
import nfc.share.nfcshare.model.MqttChannel;
import nfc.share.nfcshare.model.NfcInfo;
import nfc.share.nfcshare.model.WSMessage;
import nfc.share.nfcshare.service.EmulationService;
import p002B.AbstractC0012b;
import p002B.C0019i;
import p005C.C0046i;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p051S0.C0469d;
import p052T.C0483e;
import p071c0.C0696c;
import p088j.C0985d0;
import p118t1.AbstractActivityC1233c;
import p118t1.AbstractC1232b;
import p118t1.AbstractC1244n;
import p118t1.C1234d;
import p118t1.RunnableC1238h;
import p120u1.AbstractC1246a;
import p120u1.C1248c;
import p120u1.C1250e;
import p123v1.C1285o;
import p133z.AbstractC1325b;
import p133z.C1324a;

/* renamed from: H.a */
/* loaded from: classes.dex */
public final class RunnableC0181a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f528a;

    /* renamed from: b */
    public final Object f529b;

    /* renamed from: c */
    public final /* synthetic */ Object f530c;

    public /* synthetic */ RunnableC0181a(Object obj, int i2, Object obj2) {
        this.f528a = i2;
        this.f529b = obj;
        this.f530c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String substring;
        Object obj = this.f529b;
        Object obj2 = this.f530c;
        switch (this.f528a) {
            case 0:
                AbstractC0012b abstractC0012b = (AbstractC0012b) ((C0046i) obj).f116b;
                if (abstractC0012b != null) {
                    abstractC0012b.mo44h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((C0187g) obj).m573a(obj2);
                return;
            case 2:
                C0483e c0483e = ((SwipeDismissBehavior) obj2).f2505a;
                if (c0483e == null || !c0483e.m1246g()) {
                    return;
                }
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                ((View) obj).postOnAnimation(this);
                return;
            case 3:
                Toast.makeText((MainActivity) ((C0019i) obj2).f48c, (String) obj, 0).show();
                return;
            case 4:
                C1234d c1234d = (C1234d) obj2;
                Toast.makeText(c1234d.f4828b, (String) obj, 0).show();
                MainActivity mainActivity = c1234d.f4828b;
                C1285o c1285o = AbstractC1232b.f4825a;
                SharedPreferences.Editor edit = mainActivity.getSharedPreferences("UserSession", 0).edit();
                edit.clear();
                edit.apply();
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) AbstractActivityC1233c.class));
                mainActivity.finish();
                return;
            case 5:
                C0985d0 c0985d0 = ((C1250e) ((C0985d0) obj2).f3904b).f4871g;
                c0985d0.getClass();
                String str = (String) obj;
                Log.d("test", "ws 接收到消息：".concat(str));
                String text = ((WSMessage) new C0469d().m1224b(str, WSMessage.class)).getText();
                if (text == null || text.isEmpty()) {
                    return;
                }
                Log.d("test", "text = ".concat(text));
                NfcInfo nfcInfo = (NfcInfo) AbstractC1244n.f4847a.m1224b(text, NfcInfo.class);
                String[] strArr = {nfcInfo.getCardBytes()};
                Log.d("TAG111", strArr[0]);
                String upperCase = strArr[0].toUpperCase();
                if (upperCase.contains("80A") && upperCase.length() >= 64) {
                    Log.d("Utils", "检测到交易指令(80A)，开始解析金额和货币代码...");
                    try {
                        String substring2 = upperCase.substring(24, 36);
                        String substring3 = upperCase.substring(36, 50);
                        String substring4 = upperCase.substring(50, 64);
                        Log.d("Utils", "原始金额字段: " + substring2);
                        Log.d("Utils", "辅助字段1: " + substring3);
                        Log.d("Utils", "辅助字段2: " + substring4);
                        if (substring3.equals(substring4)) {
                            substring = substring3.substring(substring3.length() - 4);
                            Log.d("Utils", "字段相同，货币代码位置: 辅助字段1末尾4位");
                        } else {
                            substring = substring4.substring(substring4.length() - 4);
                            Log.d("Utils", "字段不同，货币代码位置: 辅助字段2末尾4位");
                        }
                        byte[] m2912b = AbstractC1244n.m2912b(substring);
                        int i2 = (m2912b[1] & 255) | ((m2912b[0] & 255) << 8);
                        Log.d("Utils", "解析出的货币代码值: " + i2);
                        String substring5 = substring2.substring(0, 8);
                        String substring6 = substring2.substring(8);
                        String replaceFirst = substring5.replaceFirst("^0+(?!$)", "");
                        if (replaceFirst.isEmpty()) {
                            replaceFirst = "0";
                        }
                        String replaceAll = substring6.replaceAll("0+$", "");
                        if (replaceAll.isEmpty()) {
                            replaceAll = "00";
                        }
                        if (replaceAll.length() > 2) {
                            replaceAll = replaceAll.substring(0, 2);
                        } else if (replaceAll.length() == 1) {
                            replaceAll = replaceAll.concat("0");
                        }
                        Log.i("Utils", "成功解析交易金额: " + (replaceFirst + "." + replaceAll) + " (货币代码: " + i2 + ")");
                        CurrencyLookup.lookup(i2);
                        AbstractC1244n.f4850d.getClass();
                    } catch (Exception e2) {
                        Log.e("Utils", "金额解析异常: " + e2.getMessage(), e2);
                    }
                }
                int i3 = AbstractC1246a.f4856a[nfcInfo.getChannel().ordinal()];
                C0176h c0176h = (C0176h) c0985d0.f3904b;
                switch (i3) {
                    case 1:
                        try {
                            C0469d c0469d = AbstractC1244n.f4847a;
                            c0176h.m521C(MqttChannel.SEND_CHANNEL, C1248c.m2915d(nfcInfo.getCardBytes()));
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    case 2:
                        EmulationService emulationService = AbstractC1244n.f4852f;
                        if (emulationService != null) {
                            emulationService.sendResponseApdu(AbstractC1244n.m2912b(nfcInfo.getCardBytes()));
                            return;
                        }
                        return;
                    case 3:
                        String str2 = new String(AbstractC1244n.m2912b(nfcInfo.getCardBytes().toString()));
                        Log.d("test", "接收到卡:".concat(str2));
                        Intent intent = new Intent("nfc.share.nfcshare");
                        intent.putExtra("card_info_string", str2);
                        C0696c.m1882a((Context) c0176h.f515b).m1883b(intent);
                        return;
                    case 4:
                        if (AbstractC1244n.f4854h == null) {
                            Intent intent2 = new Intent("nfc.share.nfcshare");
                            intent2.putExtra("card_removed", true);
                            C0696c.m1882a((Context) c0176h.f515b).m1883b(intent2);
                            return;
                        }
                        return;
                    case 5:
                        AbstractC1244n.m2911a("双方建立-连接成功");
                        c0176h.m521C(MqttChannel.ANSWER_CHANNEL, "双方建立-连接成功");
                        if (AbstractC1244n.f4854h != null) {
                            Log.d("test", "resend card..");
                            c0176h.m521C(MqttChannel.CARD_INFO_CHANNEL, AbstractC1244n.m2913c(AbstractC1244n.f4854h.toString().getBytes()));
                            return;
                        }
                        return;
                    case 6:
                        if (AbstractC1244n.f4854h != null) {
                            Log.d("test", "resend card..");
                            c0176h.m521C(MqttChannel.CARD_INFO_CHANNEL, AbstractC1244n.m2913c(AbstractC1244n.f4854h.toString().getBytes()));
                        }
                        AbstractC1244n.m2911a("双方建立-连接成功");
                        return;
                    case 7:
                        AbstractC1244n.m2911a(nfcInfo.getCardBytes());
                        if (AbstractC1244n.f4854h == null) {
                            AbstractC1244n.m2911a(nfcInfo.getCardBytes());
                            Intent intent3 = new Intent("nfc.share.nfcshare");
                            intent3.putExtra("card_removed", true);
                            C0696c.m1882a((Context) c0176h.f515b).m1883b(intent3);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 6:
                C0985d0 c0985d02 = ((C1250e) ((C0985d0) obj2).f3904b).f4871g;
                String message = ((Exception) obj).getMessage();
                c0985d02.getClass();
                Log.d("test", "ws 连接失败，原因：" + message);
                C0176h.f513f = false;
                C1234d c1234d2 = (C1234d) ((C0176h) c0985d02.f3904b).f516c;
                if (c1234d2 != null) {
                    c1234d2.f4828b.runOnUiThread(new RunnableC1238h(false));
                    return;
                }
                return;
            case 7:
                ((C1324a) obj).f5423a = obj2;
                return;
            case 8:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C1324a) obj2);
                return;
            default:
                try {
                    Method method = AbstractC1325b.f5432d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC1325b.f5433e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e3) {
                    if (e3.getClass() == RuntimeException.class && e3.getMessage() != null && e3.getMessage().startsWith("Unable to stop")) {
                        throw e3;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0181a(Object obj, Serializable serializable, int i2) {
        this.f528a = i2;
        this.f530c = obj;
        this.f529b = serializable;
    }

    public RunnableC0181a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f528a = 2;
        this.f530c = swipeDismissBehavior;
        this.f529b = view;
    }
}
