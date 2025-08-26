package p088j;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p086i.C0896a;

/* renamed from: j.s1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1031s1 implements View.OnClickListener {

    /* renamed from: a */
    public final C0896a f4041a;

    /* renamed from: b */
    public final /* synthetic */ C1034t1 f4042b;

    public ViewOnClickListenerC1031s1(C1034t1 c1034t1) {
        this.f4042b = c1034t1;
        Context context = c1034t1.f4054a.getContext();
        CharSequence charSequence = c1034t1.f4061h;
        C0896a c0896a = new C0896a();
        c0896a.f3602e = 4096;
        c0896a.f3604g = 4096;
        c0896a.f3609l = null;
        c0896a.f3610m = null;
        c0896a.f3611n = false;
        c0896a.f3612o = false;
        c0896a.f3613p = 16;
        c0896a.f3606i = context;
        c0896a.f3598a = charSequence;
        this.f4041a = c0896a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1034t1 c1034t1 = this.f4042b;
        Window.Callback callback = c1034t1.f4064k;
        if (callback == null || !c1034t1.f4065l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f4041a);
    }
}
