package p118t1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.regex.Pattern;
import nfc.share.nfcshare.App;
import nfc.share.nfcshare.MainActivity;
import org.json.JSONArray;
import org.json.JSONObject;
import p001A1.C0002a;
import p001A1.C0010i;
import p002B.C0019i;
import p010D1.AbstractC0104l;
import p018H.C0185e;
import p041O1.AbstractC0398b;
import p051S0.C0469d;
import p088j.C1032t;
import p123v1.C1285o;
import p123v1.C1286p;
import p123v1.C1287q;
import p135z1.C1340h;

/* renamed from: t1.b */
/* loaded from: classes.dex */
public abstract class AbstractC1232b {

    /* renamed from: a */
    public static final C1285o f4825a;

    /* renamed from: b */
    public static C1287q f4826b;

    static {
        C1285o c1285o;
        Pattern pattern = C1285o.f5200c;
        try {
            c1285o = AbstractC0104l.m411r("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            c1285o = null;
        }
        f4825a = c1285o;
        AbstractC0398b.m1056d(AbstractC1232b.class);
    }

    /* renamed from: a */
    public static void m2902a(MainActivity mainActivity, boolean z2, InterfaceC1231a interfaceC1231a) {
        int i2;
        mainActivity.getSharedPreferences("UserSession", 0).getString("token", "");
        String string = Settings.Secure.getString(mainActivity.getContentResolver(), "android_id");
        C0010i m25b = C0010i.m25b(new JSONObject().toString(), f4825a);
        C0185e c0185e = new C0185e();
        c0185e.m572o("http://154.205.156.112/api/user_config");
        c0185e.m558a("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJyYzg4MjByYyFAIyQlKiYiLCJhdWQiOiIiLCJpYXQiOjE3NTM1NTM5MDksIm5iZiI6MTc1MzU1MzkwOSwiZXhwIjoxNzU2MTQ1OTA5LCJkYXRhIjp7InVpZCI6Nzc5LCJyY19pZCI6IjEiLCJhY2NvdW50IjoiY2FyZDEiLCJwYXNzd29yZCI6IjgxYWI2MDZiYzRiMWMxNzMwM2U5OTRiNTlmZTdlOWU1In19.lw07roXDYYfn2wGo5iM_tZNz9CEdLRV6E8LusOC1cYg");
        StringBuilder sb = new StringBuilder();
        C0469d c0469d = AbstractC1244n.f4847a;
        try {
            i2 = mainActivity.getPackageManager().getPackageInfo(mainActivity.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            i2 = -1;
        }
        sb.append(i2);
        sb.append("");
        c0185e.m558a("version", sb.toString());
        c0185e.m558a("uuid", string);
        c0185e.m558a("language", "English");
        c0185e.m558a("exit", z2 ? "exit" : "enter");
        c0185e.m567j("POST", m25b);
        C1032t m559b = c0185e.m559b();
        C1287q m2904c = m2904c(mainActivity);
        m2904c.getClass();
        new C1340h(m2904c, m559b, false).m3088e(new C0019i(interfaceC1231a, 21, mainActivity));
    }

    /* renamed from: b */
    public static int m2903b(Context context) {
        return context.getSharedPreferences("UserSession", 0).getInt("ping_port", 8083);
    }

    /* renamed from: c */
    public static C1287q m2904c(MainActivity mainActivity) {
        if (f4826b == null) {
            C1286p c1286p = new C1286p();
            c1286p.f5207c.add(new C0002a(mainActivity));
            f4826b = new C1287q(c1286p);
        }
        return f4826b;
    }

    /* renamed from: d */
    public static ArrayList m2905d(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String string = jSONObject2.getString("expiry");
            App app = App.f4363b;
            Log.d("test", "save expire date = " + string);
            app.getSharedPreferences("UserSession", 0).edit().putString("expire_date", string).apply();
            JSONArray jSONArray = jSONObject2.getJSONArray("servers");
            jSONObject2.getString("expiry");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("product_price");
            String string2 = jSONObject3.getString("day");
            String string3 = jSONObject3.getString("week");
            String string4 = jSONObject3.getString("month");
            App app2 = App.f4363b;
            String str = string2 + "-" + string3 + "-" + string4;
            Log.d("test", "save price = " + str);
            app2.getSharedPreferences("UserSession", 0).edit().putString("price", str).apply();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                String string5 = jSONObject4.getString("name");
                String string6 = jSONObject4.getString("scheme");
                String string7 = jSONObject4.getString("host");
                int i3 = jSONObject4.getInt("port");
                String string8 = jSONObject4.getString("ping_ip");
                jSONObject4.getString("user_name");
                jSONObject4.getString("password");
                C1243m c1243m = new C1243m();
                c1243m.f4842a = string5;
                c1243m.f4843b = string6;
                c1243m.f4844c = string7;
                c1243m.f4845d = i3;
                c1243m.f4846e = string8;
                arrayList.add(c1243m);
                jSONObject4.getString("user_name");
                jSONObject4.getString("password");
                App.f4363b.f4364a = arrayList;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: e */
    public static void m2906e(Context context, String str) {
        Log.d("test", "save ping ip = " + str);
        context.getSharedPreferences("UserSession", 0).edit().putString("ping_ip", str).apply();
    }

    /* renamed from: f */
    public static void m2907f(Context context, int i2) {
        Log.d("test", "save ping port = " + i2);
        context.getSharedPreferences("UserSession", 0).edit().putInt("ping_port", i2).apply();
    }

    /* renamed from: g */
    public static void m2908g(Context context, String str) {
        context.getSharedPreferences("UserSession", 0).edit().putString("urlInfo", str).apply();
    }
}
