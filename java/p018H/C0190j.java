package p018H;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import p030L.InterfaceC0352s;
import p076e.C0777a;
import p076e.C0778b;
import p076e.C0779c;
import p076e.C0780d;
import p076e.DialogC0781e;
import p086i.DialogInterfaceOnKeyListenerC0908m;

/* renamed from: H.j */
/* loaded from: classes.dex */
public final class C0190j implements InterfaceC0352s {

    /* renamed from: a */
    public int f554a;

    /* renamed from: b */
    public final Object f555b;

    public C0190j(ArrayList arrayList) {
        this.f555b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* renamed from: a */
    public DialogC0781e m575a() {
        C0778b c0778b = (C0778b) this.f555b;
        DialogC0781e dialogC0781e = new DialogC0781e(c0778b.f3044a, this.f554a);
        View view = c0778b.f3048e;
        C0780d c0780d = dialogC0781e.f3082f;
        if (view != null) {
            c0780d.f3067n = view;
        } else {
            CharSequence charSequence = c0778b.f3047d;
            if (charSequence != null) {
                c0780d.f3057d = charSequence;
                TextView textView = c0780d.f3065l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0778b.f3046c;
            if (drawable != null) {
                c0780d.f3063j = drawable;
                ImageView imageView = c0780d.f3064k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0780d.f3064k.setImageDrawable(drawable);
                }
            }
        }
        if (c0778b.f3050g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0778b.f3045b.inflate(c0780d.f3071r, (ViewGroup) null);
            int i2 = c0778b.f3052i ? c0780d.f3072s : c0780d.f3073t;
            Object obj = c0778b.f3050g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0779c(c0778b.f3044a, i2, R.id.text1, null);
            }
            c0780d.f3068o = r7;
            c0780d.f3069p = c0778b.f3053j;
            if (c0778b.f3051h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0777a(c0778b, c0780d));
            }
            if (c0778b.f3052i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0780d.f3058e = alertController$RecycleListView;
        }
        dialogC0781e.setCancelable(true);
        dialogC0781e.setCanceledOnTouchOutside(true);
        dialogC0781e.setOnCancelListener(null);
        dialogC0781e.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0908m dialogInterfaceOnKeyListenerC0908m = c0778b.f3049f;
        if (dialogInterfaceOnKeyListenerC0908m != null) {
            dialogC0781e.setOnKeyListener(dialogInterfaceOnKeyListenerC0908m);
        }
        return dialogC0781e;
    }

    /* renamed from: b */
    public boolean m576b() {
        return this.f554a < ((ArrayList) this.f555b).size();
    }

    @Override // p030L.InterfaceC0352s
    /* renamed from: h */
    public boolean mo172h(View view) {
        ((BottomSheetBehavior) this.f555b).m1908F(this.f554a);
        return true;
    }

    public C0190j(Context context) {
        int m2086h = DialogC0781e.m2086h(context, 0);
        this.f555b = new C0778b(new ContextThemeWrapper(context, DialogC0781e.m2086h(context, m2086h)));
        this.f554a = m2086h;
    }

    public C0190j(int i2, C0191k[] c0191kArr) {
        this.f554a = i2;
        this.f555b = c0191kArr;
    }

    public C0190j(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.f555b = bottomSheetBehavior;
        this.f554a = i2;
    }
}
