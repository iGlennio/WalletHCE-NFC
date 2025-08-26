package nfc.share.nfcshare;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.emoji2.text.RunnableC0599m;
import androidx.fragment.app.C0651y;
import com.nfupay.s145.R;
import java.util.ArrayList;
import nfc.share.nfcshare.model.MqttChannel;
import nfc.share.nfcshare.service.EmulationService;
import org.json.JSONObject;
import p001A1.C0010i;
import p010D1.AbstractC0104l;
import p017G0.C0176h;
import p018H.C0185e;
import p043P0.RunnableC0402A;
import p051S0.C0469d;
import p071c0.C0695b;
import p071c0.C0696c;
import p076e.AbstractActivityC0782f;
import p076e.C0794r;
import p088j.C0985d0;
import p088j.C1032t;
import p118t1.AbstractC1232b;
import p118t1.AbstractC1244n;
import p118t1.AsyncTaskC1240j;
import p118t1.C1234d;
import p118t1.C1237g;
import p118t1.C1242l;
import p118t1.C1243m;
import p118t1.DialogInterfaceOnClickListenerC1235e;
import p120u1.C1248c;
import p123v1.C1285o;
import p123v1.C1287q;
import p135z1.C1340h;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC0782f {

    /* renamed from: A */
    public String f4365A;

    /* renamed from: B */
    public AlertDialog f4366B;

    /* renamed from: C */
    public String f4367C;

    /* renamed from: D */
    public WebView f4368D;

    /* renamed from: E */
    public CardEmulation f4369E;

    /* renamed from: v */
    public C1242l f4370v;

    /* renamed from: w */
    public long f4371w;

    /* renamed from: x */
    public long f4372x;

    /* renamed from: y */
    public Toast f4373y;

    /* renamed from: z */
    public ArrayList f4374z;

    public MainActivity() {
        new ArrayList();
        this.f4374z = new ArrayList();
        this.f4365A = "";
        this.f4367C = "";
    }

    /* renamed from: u */
    public static void m2649u(String str, int i2) {
        if (str == null || str.isEmpty()) {
            System.out.println("未找到ping_ip");
            return;
        }
        AsyncTaskC1240j asyncTaskC1240j = new AsyncTaskC1240j(new C0651y(13));
        asyncTaskC1240j.f4835b = i2;
        asyncTaskC1240j.execute(str);
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity
    public final void onBackPressed() {
        if (this.f4371w + 2000 > System.currentTimeMillis()) {
            Toast toast = this.f4373y;
            if (toast != null) {
                toast.cancel();
            }
            super.onBackPressed();
        } else {
            Toast makeText = Toast.makeText(this, "再按一次返回退出", 0);
            this.f4373y = makeText;
            makeText.show();
        }
        this.f4371w = System.currentTimeMillis();
    }

    @Override // p076e.AbstractActivityC0782f, androidx.activity.AbstractActivityC0571k, p133z.AbstractActivityC1328e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i2 = 1;
        super.onCreate(bundle);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        setContentView(R.layout.activity_main_new);
        C0469d c0469d = AbstractC1244n.f4847a;
        getSharedPreferences("ServerSettings", 0).edit().putBoolean("isPosMode", false).apply();
        AbstractC1244n.f4851e = "发送端";
        C1285o c1285o = AbstractC1232b.f4825a;
        AbstractC1244n.f4853g = String.valueOf(getSharedPreferences("UserSession", 0).getInt("uid", 0));
        WebView webView = (WebView) findViewById(R.id.webview);
        this.f4368D = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f4368D.setWebViewClient(new C1237g());
        this.f4368D.loadUrl("http://154.205.156.112//baxi/b/?step=");
        if (!getSharedPreferences("ServerSettings", 0).getBoolean("isPosMode", false)) {
            new C1248c(this);
        }
        this.f4366B = new AlertDialog.Builder(this, R.style.CustomDialog).setView(R.layout.layout_progress_dialog).setCancelable(false).create();
        String.valueOf(getSharedPreferences("UserSession", 0).getInt("uid", 0));
        getSharedPreferences("UserSession", 0).getString("account", "");
        AbstractC1244n.f4850d = this;
        if (this.f4372x + 1000 <= System.currentTimeMillis()) {
            this.f4372x = System.currentTimeMillis();
            if (NfcAdapter.getDefaultAdapter(this) != null) {
                m2650s();
                if (AbstractC0104l.m389D(this)) {
                    try {
                        if (AbstractC1244n.f4848b == null) {
                            C0176h c0176h = new C0176h(getApplicationContext());
                            AbstractC1244n.f4848b = c0176h;
                            c0176h.f516c = new C1234d(this, 3);
                        }
                        AbstractC1244n.f4848b.m533g(this.f4367C);
                    } catch (Exception unused) {
                    }
                } else {
                    AlertDialog create = new AlertDialog.Builder(this, R.style.MyAlertDialog).setTitle("提示").setMessage("请检查网络连接").setPositiveButton("确定", (DialogInterface.OnClickListener) null).create();
                    create.setCanceledOnTouchOutside(false);
                    create.setCancelable(false);
                    create.show();
                }
            } else {
                AlertDialog create2 = new AlertDialog.Builder(this, R.style.MyAlertDialog).setIcon(R.drawable.baseline_warning_24).setTitle("NFC").setMessage("Device without NFC support. Install on another device.").setPositiveButton("OK", (DialogInterface.OnClickListener) null).create();
                create2.setCanceledOnTouchOutside(false);
                create2.setCancelable(false);
                create2.show();
            }
        }
        this.f4367C = getSharedPreferences("UserSession", 0).getString("urlInfo", null);
        Log.d("MainActivity", "getServerList");
        ArrayList arrayList = App.f4363b.f4364a;
        this.f4374z = arrayList;
        if (arrayList == null) {
            this.f4366B.show();
            AbstractC1232b.m2902a(this, false, new C1234d(this, i2));
        } else {
            this.f4367C = ((C1243m) arrayList.get(0)).m2910a();
            C0469d c0469d2 = AbstractC1244n.f4847a;
        }
        C0794r c0794r = new C0794r(i2, this);
        IntentFilter intentFilter = new IntentFilter("nfc.share.nfcshare");
        C0696c m1882a = C0696c.m1882a(this);
        synchronized (m1882a.f2473b) {
            try {
                C0695b c0695b = new C0695b(intentFilter, c0794r);
                ArrayList arrayList2 = (ArrayList) m1882a.f2473b.get(c0794r);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    m1882a.f2473b.put(c0794r, arrayList2);
                }
                arrayList2.add(c0695b);
                for (int i3 = 0; i3 < intentFilter.countActions(); i3++) {
                    String action = intentFilter.getAction(i3);
                    ArrayList arrayList3 = (ArrayList) m1882a.f2474c.get(action);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList(1);
                        m1882a.f2474c.put(action, arrayList3);
                    }
                    arrayList3.add(c0695b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4370v = new C1242l(new C0651y(14));
        this.f4365A = getSharedPreferences("UserSession", 0).getString("urlInfo", null);
        Log.d("test", "select id =" + this.f4365A);
        ArrayList arrayList4 = App.f4363b.f4364a;
        this.f4374z = arrayList4;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            return;
        }
        String str = this.f4365A;
        if (str == null || str.isEmpty()) {
            this.f4365A = ((C1243m) this.f4374z.get(0)).m2910a();
        }
    }

    @Override // p076e.AbstractActivityC0782f, android.app.Activity
    public final void onPause() {
        super.onPause();
        AbstractC1232b.m2902a(this, true, new C0651y(12));
        C1242l c1242l = this.f4370v;
        c1242l.f4840c.cancel(true);
        c1242l.f4839b.cancel();
        if (AbstractC1244n.f4848b == null || !C0176h.f513f) {
            return;
        }
        Log.d("test", "disconnect...");
        AbstractC1244n.f4848b.m521C(MqttChannel.OFFLINE_CHANNEL, AbstractC1244n.f4851e + "已离线");
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0599m(1), 0L);
    }

    @Override // p076e.AbstractActivityC0782f, android.app.Activity
    public final void onResume() {
        super.onResume();
        AbstractC1232b.m2902a(this, false, new C1234d(this, 0));
        m2650s();
        String string = getSharedPreferences("UserSession", 0).getString("urlInfo", null);
        if (string != null) {
            this.f4367C = string;
        }
        C0176h c0176h = AbstractC1244n.f4848b;
        if (c0176h != null && !C0176h.f513f) {
            try {
                c0176h.m533g(this.f4367C);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        m2649u(getSharedPreferences("UserSession", 0).getString("ping_ip", null), AbstractC1232b.m2903b(this));
    }

    /* renamed from: s */
    public final void m2650s() {
        boolean isDefaultServiceForCategory;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
        int i2 = 0;
        if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
            AlertDialog create = new AlertDialog.Builder(this, R.style.SettingDefaultDialog).setIcon(R.drawable.baseline_warning_24).setTitle("Important Tips").setMessage("NFC is not enabled. Please go to System Settings and enable NFC permission. If it is already enabled, please restart your device and try again!").setPositiveButton("Go to open", new DialogInterfaceOnClickListenerC1235e(this, i2)).create();
            create.setCanceledOnTouchOutside(false);
            create.setCancelable(false);
            create.show();
            return;
        }
        NfcAdapter defaultAdapter2 = NfcAdapter.getDefaultAdapter(this);
        if (defaultAdapter2 == null) {
            AlertDialog create2 = new AlertDialog.Builder(this, R.style.MyAlertDialog).setIcon(R.drawable.baseline_warning_24).setTitle("NFC").setMessage("Device without NFC support. Install on another device.").setPositiveButton("OK", (DialogInterface.OnClickListener) null).create();
            create2.setCanceledOnTouchOutside(false);
            create2.setCancelable(false);
            create2.show();
            isDefaultServiceForCategory = false;
        } else {
            this.f4369E = CardEmulation.getInstance(defaultAdapter2);
            isDefaultServiceForCategory = this.f4369E.isDefaultServiceForCategory(new ComponentName(this, (Class<?>) EmulationService.class), "payment");
        }
        if (isDefaultServiceForCategory) {
            return;
        }
        C0469d c0469d = AbstractC1244n.f4847a;
        if (getSharedPreferences("ServerSettings", 0).getBoolean("isPosMode", false)) {
            AlertDialog create3 = new AlertDialog.Builder(this, R.style.SettingDefaultDialog).setIcon(R.drawable.baseline_warning_24).setTitle("Important Tips").setMessage("NFC Not set as default NFC payment app. Please go to system NFC settings to make sure the software works properly.").setPositiveButton("Go to Settings", new DialogInterfaceOnClickListenerC1235e(this, 1)).create();
            create3.setCanceledOnTouchOutside(false);
            create3.setCancelable(false);
            create3.show();
        }
    }

    /* renamed from: t */
    public final void m2651t() {
        runOnUiThread(new RunnableC0402A(13, this));
        int i2 = 2;
        C1234d c1234d = new C1234d(this, i2);
        C1285o c1285o = AbstractC1232b.f4825a;
        try {
            C0010i m25b = C0010i.m25b(new JSONObject().toString(), AbstractC1232b.f4825a);
            String string = getSharedPreferences("UserSession", 0).getString("token", "");
            String string2 = Settings.Secure.getString(getContentResolver(), "android_id");
            C0185e c0185e = new C0185e();
            c0185e.m572o("http://154.205.156.112//api/user_logout");
            c0185e.m566i("token", string);
            c0185e.m566i("uuid", string2);
            c0185e.m558a("language", "English");
            c0185e.m567j("POST", m25b);
            C1032t m559b = c0185e.m559b();
            C1287q m2904c = AbstractC1232b.m2904c(this);
            m2904c.getClass();
            new C1340h(m2904c, m559b, false).m3088e(new C0985d0(i2, c1234d));
        } catch (Exception e2) {
            c1234d.mo1683b("请求创建失败: " + e2.getMessage());
        }
    }
}
