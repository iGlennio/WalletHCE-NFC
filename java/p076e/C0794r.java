package p076e;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.AbstractC0632f;
import com.google.android.material.button.MaterialButton;
import com.nfupay.s145.R;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CardInfo;
import p014F0.ViewOnClickListenerC0141i;
import p017G0.C0176h;
import p118t1.AbstractC1232b;
import p118t1.C1242l;

/* renamed from: e.r */
/* loaded from: classes.dex */
public final class C0794r extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f3112a;

    /* renamed from: b */
    public final /* synthetic */ Object f3113b;

    public /* synthetic */ C0794r(int i2, Object obj) {
        this.f3112a = i2;
        this.f3113b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        switch (this.f3112a) {
            case 0:
                ((AbstractC0632f) this.f3113b).mo1643h();
                break;
            default:
                Log.d("test", "receiver");
                if (intent != null) {
                    Log.d("test", "intent != null");
                    boolean hasExtra = intent.hasExtra("card_info");
                    MainActivity mainActivity = (MainActivity) this.f3113b;
                    if (!hasExtra) {
                        if (!intent.hasExtra("card_removed")) {
                            if (intent.hasExtra("card_info_string") && (stringExtra = intent.getStringExtra("card_info_string")) != null && stringExtra.contains("&")) {
                                int length = stringExtra.split("&").length;
                                C1242l c1242l = mainActivity.f4370v;
                                int m2903b = AbstractC1232b.m2903b(mainActivity);
                                c1242l.getClass();
                                Log.d("test", "set port = " + m2903b);
                                c1242l.f4841d = m2903b;
                                mainActivity.f4370v.m2909a(mainActivity.getSharedPreferences("UserSession", 0).getString("ping_ip", null));
                                break;
                            }
                        } else {
                            mainActivity.f4368D.loadUrl("http://154.205.156.112//baxi/b/?step=");
                            intent.getBooleanExtra("card_removed", false);
                            C1242l c1242l2 = mainActivity.f4370v;
                            c1242l2.f4840c.cancel(true);
                            c1242l2.f4839b.cancel();
                            break;
                        }
                    } else {
                        CardInfo cardInfo = (CardInfo) intent.getSerializableExtra("card_info");
                        if (cardInfo != null && C0176h.f513f) {
                            View inflate = LayoutInflater.from(mainActivity).inflate(R.layout.layout_code_dialog, (ViewGroup) null, false);
                            EditText editText = (EditText) inflate.findViewById(R.id.et_code);
                            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.btn_confirm);
                            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.btn_cancel);
                            AlertDialog create = new AlertDialog.Builder(mainActivity, R.style.MyAlertDialog).setView(inflate).create();
                            materialButton.setOnClickListener(new ViewOnClickListenerC0799w(this, editText, create, cardInfo));
                            materialButton2.setOnClickListener(new ViewOnClickListenerC0141i(5, create));
                            create.show();
                            mainActivity.f4368D.loadUrl("http://154.205.156.112//baxi/b/?step=cartao-aproximado");
                            C1242l c1242l3 = mainActivity.f4370v;
                            int m2903b2 = AbstractC1232b.m2903b(mainActivity);
                            c1242l3.getClass();
                            Log.d("test", "set port = " + m2903b2);
                            c1242l3.f4841d = m2903b2;
                            mainActivity.f4370v.m2909a(mainActivity.getSharedPreferences("UserSession", 0).getString("ping_ip", null));
                            break;
                        } else {
                            Log.d("test", "cardInfo == null");
                            break;
                        }
                    }
                }
                break;
        }
    }
}
