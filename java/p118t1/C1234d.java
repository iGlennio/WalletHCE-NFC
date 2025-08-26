package p118t1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import nfc.share.nfcshare.MainActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p002B.RunnableC0024n;
import p014F0.RunnableC0130G;
import p017G0.C0176h;
import p018H.RunnableC0181a;
import p051S0.C0469d;
import p123v1.C1285o;

/* renamed from: t1.d */
/* loaded from: classes.dex */
public final class C1234d implements InterfaceC1231a {

    /* renamed from: a */
    public final /* synthetic */ int f4827a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f4828b;

    public /* synthetic */ C1234d(MainActivity mainActivity, int i2) {
        this.f4827a = i2;
        this.f4828b = mainActivity;
    }

    @Override // p118t1.InterfaceC1231a
    /* renamed from: b */
    public void mo1683b(String str) {
        int i2 = 1;
        MainActivity mainActivity = this.f4828b;
        switch (this.f4827a) {
            case 0:
                Log.d("test", "error=" + str);
                return;
            case 1:
                mainActivity.runOnUiThread(new RunnableC1236f(this, i2));
                C1285o c1285o = AbstractC1232b.f4825a;
                String string = mainActivity.getSharedPreferences("CacheServer", 0).getString("cache_server", null);
                if (string != null) {
                    try {
                        ArrayList m2905d = AbstractC1232b.m2905d(new JSONObject(string));
                        if (m2905d.isEmpty()) {
                            return;
                        }
                        if (mainActivity.f4367C == null) {
                            String m2910a = ((C1243m) m2905d.get(0)).m2910a();
                            mainActivity.f4367C = m2910a;
                            AbstractC1232b.m2908g(mainActivity, m2910a);
                            C0469d c0469d = AbstractC1244n.f4847a;
                            AbstractC1232b.m2908g(mainActivity, mainActivity.f4367C);
                            AbstractC1232b.m2906e(mainActivity, ((C1243m) m2905d.get(0)).f4846e);
                            AbstractC1232b.m2907f(mainActivity, ((C1243m) m2905d.get(0)).f4845d);
                            MainActivity.m2649u(((C1243m) m2905d.get(0)).f4846e, ((C1243m) m2905d.get(0)).f4845d);
                            return;
                        }
                        for (int i3 = 0; i3 < m2905d.size(); i3++) {
                            if (((C1243m) m2905d.get(i3)).m2910a().equals(mainActivity.f4367C)) {
                                C0469d c0469d2 = AbstractC1244n.f4847a;
                                return;
                            }
                        }
                        C1243m c1243m = (C1243m) m2905d.get(0);
                        String m2910a2 = c1243m.m2910a();
                        int i4 = c1243m.f4845d;
                        String str2 = c1243m.f4846e;
                        AbstractC1232b.m2908g(mainActivity, m2910a2);
                        C0469d c0469d3 = AbstractC1244n.f4847a;
                        AbstractC1232b.m2908g(mainActivity, m2910a2);
                        AbstractC1232b.m2906e(mainActivity, str2);
                        AbstractC1232b.m2907f(mainActivity, i4);
                        MainActivity.m2649u(str2, i4);
                        mainActivity.f4367C = m2910a2;
                        return;
                    } catch (JSONException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                return;
            default:
                mainActivity.runOnUiThread(new RunnableC0024n(this, 3, str));
                return;
        }
    }

    @Override // p118t1.InterfaceC1231a
    /* renamed from: c */
    public void mo1684c(JSONObject jSONObject) {
        int i2 = 0;
        MainActivity mainActivity = this.f4828b;
        switch (this.f4827a) {
            case 0:
                try {
                    int i3 = jSONObject.getInt("code");
                    String string = jSONObject.getString("msg");
                    Log.d("test", "code = " + i3);
                    if (i3 == 0) {
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0181a(this, string, 4), 1000L);
                        return;
                    }
                    return;
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            case 1:
                Log.d("test", "response=" + jSONObject);
                if (mainActivity.f4366B.isShowing()) {
                    mainActivity.f4366B.dismiss();
                }
                try {
                    String string2 = jSONObject.getJSONObject("data").getString("uid");
                    Log.d("test", "uid == " + string2);
                    AbstractC1244n.f4853g = string2;
                    int parseInt = Integer.parseInt(string2);
                    C1285o c1285o = AbstractC1232b.f4825a;
                    mainActivity.getSharedPreferences("UserSession", 0).edit().putInt("uid", parseInt).apply();
                    mainActivity.getSharedPreferences("CacheServer", 0).edit().putString("cache_server", jSONObject.toString()).apply();
                    ArrayList m2905d = AbstractC1232b.m2905d(jSONObject);
                    mainActivity.getSharedPreferences("UserSession", 0).getString("expire_date", "");
                    if (m2905d.isEmpty()) {
                        if (mainActivity.f4367C == null) {
                            mainActivity.runOnUiThread(new RunnableC1236f(this, i2));
                            return;
                        }
                        return;
                    }
                    if (mainActivity.f4367C == null) {
                        mainActivity.f4367C = ((C1243m) m2905d.get(0)).m2910a();
                        String str = ((C1243m) m2905d.get(0)).f4846e;
                        int i4 = ((C1243m) m2905d.get(0)).f4845d;
                        AbstractC1232b.m2908g(mainActivity, mainActivity.f4367C);
                        AbstractC1232b.m2908g(mainActivity, mainActivity.f4367C);
                        AbstractC1232b.m2906e(mainActivity, str);
                        AbstractC1232b.m2907f(mainActivity, i4);
                        MainActivity.m2649u(str, AbstractC1232b.m2903b(mainActivity));
                        C0176h c0176h = AbstractC1244n.f4848b;
                        if (c0176h == null || C0176h.f513f) {
                            return;
                        }
                        try {
                            c0176h.m533g(mainActivity.f4367C);
                            return;
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            return;
                        }
                    }
                    for (int i5 = 0; i5 < m2905d.size(); i5++) {
                        if (((C1243m) m2905d.get(i5)).m2910a().equals(mainActivity.f4367C)) {
                            C0469d c0469d = AbstractC1244n.f4847a;
                            return;
                        }
                    }
                    C1243m c1243m = (C1243m) m2905d.get(0);
                    String m2910a = c1243m.m2910a();
                    AbstractC1232b.m2908g(mainActivity, m2910a);
                    C0469d c0469d2 = AbstractC1244n.f4847a;
                    AbstractC1232b.m2908g(mainActivity, m2910a);
                    String str2 = c1243m.f4846e;
                    AbstractC1232b.m2906e(mainActivity, str2);
                    AbstractC1232b.m2907f(mainActivity, c1243m.f4845d);
                    MainActivity.m2649u(str2, AbstractC1232b.m2903b(mainActivity));
                    mainActivity.f4367C = m2910a;
                    return;
                } catch (JSONException e4) {
                    throw new RuntimeException(e4);
                }
            default:
                mainActivity.runOnUiThread(new RunnableC0130G(12, this));
                return;
        }
    }
}
