package p088j;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p005C.C0046i;
import p086i.C0909n;
import p086i.MenuC0907l;

/* renamed from: j.P0 */
/* loaded from: classes.dex */
public final class C0955P0 extends C0943J0 implements InterfaceC0945K0 {

    /* renamed from: D */
    public static final Method f3841D;

    /* renamed from: C */
    public C0046i f3842C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3841D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p088j.InterfaceC0945K0
    /* renamed from: g */
    public final void mo171g(MenuC0907l menuC0907l, C0909n c0909n) {
        C0046i c0046i = this.f3842C;
        if (c0046i != null) {
            c0046i.mo171g(menuC0907l, c0909n);
        }
    }

    @Override // p088j.InterfaceC0945K0
    /* renamed from: m */
    public final void mo177m(MenuC0907l menuC0907l, C0909n c0909n) {
        C0046i c0046i = this.f3842C;
        if (c0046i != null) {
            c0046i.mo177m(menuC0907l, c0909n);
        }
    }

    @Override // p088j.C0943J0
    /* renamed from: q */
    public final C1045x0 mo2402q(Context context, boolean z2) {
        C0953O0 c0953o0 = new C0953O0(context, z2);
        c0953o0.setHoverListener(this);
        return c0953o0;
    }
}
