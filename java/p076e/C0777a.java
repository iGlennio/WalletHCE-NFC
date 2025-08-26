package p076e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: e.a */
/* loaded from: classes.dex */
public final class C0777a implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0780d f3042a;

    /* renamed from: b */
    public final /* synthetic */ C0778b f3043b;

    public C0777a(C0778b c0778b, C0780d c0780d) {
        this.f3043b = c0778b;
        this.f3042a = c0780d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        C0778b c0778b = this.f3043b;
        DialogInterface.OnClickListener onClickListener = c0778b.f3051h;
        C0780d c0780d = this.f3042a;
        onClickListener.onClick(c0780d.f3055b, i2);
        if (c0778b.f3052i) {
            return;
        }
        c0780d.f3055b.dismiss();
    }
}
