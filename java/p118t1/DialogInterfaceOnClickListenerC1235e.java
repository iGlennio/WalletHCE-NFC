package p118t1;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.NfcAdapter;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.service.EmulationService;

/* renamed from: t1.e */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1235e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f4829a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f4830b;

    public /* synthetic */ DialogInterfaceOnClickListenerC1235e(MainActivity mainActivity, int i2) {
        this.f4829a = i2;
        this.f4830b = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f4829a) {
            case 0:
                this.f4830b.startActivity(new Intent("android.settings.NFC_SETTINGS"));
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                MainActivity mainActivity = this.f4830b;
                mainActivity.getClass();
                if (NfcAdapter.getDefaultAdapter(mainActivity) != null) {
                    Intent intent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
                    intent.putExtra("component", new ComponentName(mainActivity, (Class<?>) EmulationService.class));
                    intent.putExtra("category", "payment");
                    try {
                        mainActivity.startActivityForResult(intent, 1);
                        break;
                    } catch (ActivityNotFoundException unused) {
                        return;
                    }
                }
                break;
        }
    }
}
