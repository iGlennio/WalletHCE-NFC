package p120u1;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CardInfo;
import nfc.share.nfcshare.model.MqttChannel;
import p017G0.C0176h;
import p051S0.C0469d;
import p071c0.C0696c;
import p099n0.AbstractC1148b;
import p099n0.C1149c;
import p102o0.C1163a;
import p105p0.AbstractC1175a;
import p118t1.AbstractC1244n;

/* renamed from: u1.c */
/* loaded from: classes.dex */
public final class C1248c implements NfcAdapter.ReaderCallback {

    /* renamed from: e */
    public static IsoDep f4858e;

    /* renamed from: a */
    public final NfcAdapter f4859a;

    /* renamed from: b */
    public String f4860b = "";

    /* renamed from: c */
    public Timer f4861c;

    /* renamed from: d */
    public final MainActivity f4862d;

    public C1248c(MainActivity mainActivity) {
        this.f4862d = mainActivity;
        Log.i("NfcService", "正在初始化NFC适配器...");
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(mainActivity);
        this.f4859a = defaultAdapter;
        if (defaultAdapter == null) {
            Log.e("NfcService", "NFC初始化失败：设备不支持NFC");
        } else if (!defaultAdapter.isEnabled()) {
            Log.w("NfcService", "NFC初始化警告：NFC功能未启用");
        } else {
            this.f4859a.enableReaderMode(mainActivity, this, 1, null);
            Log.i("NfcService", "NFC读卡器模式已启用（NFC-A）");
        }
    }

    /* renamed from: d */
    public static String m2915d(String str) {
        try {
            IsoDep isoDep = f4858e;
            if (isoDep == null || !isoDep.isConnected()) {
                throw new IOException("连接未建立");
            }
            Log.d("NfcService", "APDU发送 => " + str);
            return AbstractC1244n.m2913c(f4858e.transceive(AbstractC1244n.m2912b(str)));
        } catch (SecurityException e2) {
            Log.e("test", e2.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public final void m2916a() {
        Log.i("NfcService", "开始清理NFC连接资源...");
        f4858e = null;
        if (this.f4861c != null) {
            Log.d("NfcService", "正在停止心跳定时器...");
            this.f4861c.cancel();
            this.f4861c = null;
            Log.i("NfcService", "心跳定时器已停止");
        }
        this.f4860b = "";
        Log.i("NfcService", "资源清理完成");
    }

    /* renamed from: b */
    public final String m2917b(Tag tag) {
        byte[] bArr;
        Log.i("NfcService", "正在建立ISO-DEP连接...");
        IsoDep isoDep = IsoDep.get(tag);
        f4858e = isoDep;
        if (isoDep == null) {
            throw new IOException("不支持的卡片类型（需ISO 14443-4 Type A）");
        }
        if (!isoDep.isConnected()) {
            Log.d("NfcService", "正在连接卡片...");
            f4858e.connect();
            Log.d("NfcService", "设置通信超时：120000ms");
            f4858e.setTimeout(120000);
        }
        String m2913c = AbstractC1244n.m2913c(tag.getId());
        Log.d("NfcService", "卡片原始ID字节: ".concat(m2913c));
        byte[] m2912b = AbstractC1244n.m2912b(m2915d("00A404000E325041592E5359532E444446303100"));
        ArrayList arrayList = new ArrayList();
        ArrayList m2699b = AbstractC1175a.m2699b(m2912b, AbstractC1148b.f4359b, AbstractC1148b.f4360c);
        Log.d("test", "listTlv size" + m2699b.size());
        Iterator it = m2699b.iterator();
        while (it.hasNext()) {
            C1149c c1149c = (C1149c) it.next();
            C1163a c1163a = c1149c.f4361a;
            C1163a c1163a2 = AbstractC1148b.f4360c;
            byte[] bArr2 = c1149c.f4362b;
            if (c1163a != c1163a2 || arrayList.size() == 0) {
                arrayList.add(bArr2);
            } else {
                byte[] bArr3 = (byte[]) arrayList.get(arrayList.size() - 1);
                if (bArr3 == null) {
                    bArr = (byte[]) bArr2.clone();
                } else {
                    byte[] bArr4 = new byte[bArr3.length + bArr2.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    System.arraycopy(bArr2, 0, bArr4, bArr3.length, bArr2.length);
                    bArr = bArr4;
                }
                arrayList.add(bArr);
            }
            Log.i("NfcService", "getAids: listTlv");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr5 = (byte[]) it2.next();
            Log.i("NfcService", "getAids: ret");
            arrayList2.add(AbstractC1244n.m2913c(bArr5).toUpperCase());
            Log.d("NfcService", "RUNNNNNNNNNNNNNNN getAids +++++++" + AbstractC1244n.m2913c(bArr5).toUpperCase());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            while (true) {
                sb.append((CharSequence) it3.next());
                if (!it3.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ",");
            }
        }
        String sb2 = sb.toString();
        Log.i("NfcService", "connectCard: " + sb2);
        C0469d c0469d = AbstractC1244n.f4847a;
        String.valueOf(((int) (Math.random() * 3.0d)) + 1);
        CardInfo cardInfo = new CardInfo("", "Bank Card", new Date(), sb2);
        Log.d("NfcService", "发送本地广播更新界面");
        Intent intent = new Intent("nfc.share.nfcshare");
        intent.putExtra("card_info", cardInfo);
        C0696c.m1882a(this.f4862d).m1883b(intent);
        AbstractC1244n.f4854h = cardInfo;
        AbstractC1244n.f4848b.m521C(MqttChannel.CARD_INFO_CHANNEL, AbstractC1244n.m2913c(cardInfo.toString().getBytes()));
        return m2913c;
    }

    /* renamed from: c */
    public final void m2918c() {
        Log.i("NfcService", "卡片已移出感应区");
        C0176h c0176h = AbstractC1244n.f4848b;
        if (c0176h != null) {
            c0176h.m521C(MqttChannel.CARD_REMOVED, "卡片已移出感应区");
            AbstractC1244n.f4854h = null;
            Intent intent = new Intent("nfc.share.nfcshare");
            intent.putExtra("card_removed", true);
            C0696c.m1882a(this.f4862d).m1883b(intent);
            m2916a();
        }
    }

    /* renamed from: e */
    public final void m2919e() {
        Log.i("NfcService", "初始化心跳检测（间隔1秒）");
        Timer timer = this.f4861c;
        if (timer != null) {
            timer.cancel();
            Log.d("NfcService", "已存在定时器，先执行取消");
        }
        Timer timer2 = new Timer("NFCCardCheckTimer");
        this.f4861c = timer2;
        timer2.schedule(new C1247b(this), 1500L, 1500L);
    }

    @Override // android.nfc.NfcAdapter.ReaderCallback
    public final void onTagDiscovered(Tag tag) {
        Log.i("NfcService", ">>>>>>>> NFC标签进入感应区 <<<<<<<<");
        if (tag == null) {
            Log.w("NfcService", "发现空标签对象");
            return;
        }
        try {
            AbstractC1244n.f4849c.clear();
            Log.d("NfcService", "指令队列已重置");
            this.f4860b = m2917b(tag);
            m2919e();
            String concat = "卡片连接成功 | UID: ".concat(this.f4860b);
            Log.i("NfcService", concat);
            AbstractC1244n.f4848b.m521C(MqttChannel.LOG_CHANNEL, concat);
        } catch (IOException e2) {
            Log.e("NfcService", "卡片连接失败: " + e2.getMessage(), e2);
            m2916a();
        } catch (Exception e3) {
            Log.e("NfcService", "未知连接异常: ".concat(e3.getClass().getSimpleName()), e3);
            m2916a();
        }
    }
}
