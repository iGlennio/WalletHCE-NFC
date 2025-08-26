package p019H0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p014F0.AbstractC0128E;
import p014F0.C0152t;
import p027K.AbstractC0272P;
import p086i.C0900e;
import p086i.ViewOnKeyListenerC0894D;
import p086i.ViewOnKeyListenerC0901f;
import p088j.AbstractC0942J;
import p088j.AbstractC0944K;
import p088j.C0954P;
import p088j.C0955P0;
import p088j.C0961T;

/* renamed from: H0.e */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0199e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ int f573a;

    /* renamed from: b */
    public final /* synthetic */ Object f574b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0199e(int i2, Object obj) {
        this.f573a = i2;
        this.f574b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        Rect rect;
        WindowMetrics currentWindowMetrics;
        Object obj = this.f574b;
        switch (this.f573a) {
            case 0:
                NavigationView navigationView = (NavigationView) obj;
                int[] iArr = navigationView.f2750k;
                navigationView.getLocationOnScreen(iArr);
                boolean z2 = iArr[1] == 0;
                C0152t c0152t = navigationView.f2748i;
                if (c0152t.f469x != z2) {
                    c0152t.f469x = z2;
                    int i2 = (c0152t.f447b.getChildCount() <= 0 && c0152t.f469x) ? c0152t.f471z : 0;
                    NavigationMenuView navigationMenuView = c0152t.f446a;
                    navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z2 && navigationView.f2753n);
                int i3 = iArr[0];
                navigationView.setDrawLeftInsetForeground(i3 == 0 || navigationView.getWidth() + i3 == 0);
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    int i4 = Build.VERSION.SDK_INT;
                    int i5 = AbstractC0128E.f352d;
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    if (i4 >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    navigationView.setDrawBottomInsetForeground((rect.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f2754o);
                    navigationView.setDrawRightInsetForeground(rect.width() == iArr[0] || rect.width() - navigationView.getWidth() == iArr[0]);
                    break;
                }
                break;
            case 1:
                ViewOnKeyListenerC0901f viewOnKeyListenerC0901f = (ViewOnKeyListenerC0901f) obj;
                if (viewOnKeyListenerC0901f.mo2308b()) {
                    ArrayList arrayList = viewOnKeyListenerC0901f.f3629h;
                    if (arrayList.size() > 0 && !((C0900e) arrayList.get(0)).f3620a.f3822y) {
                        View view = viewOnKeyListenerC0901f.f3636o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0900e) it.next()).f3620a.mo2310i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0901f.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                ViewOnKeyListenerC0894D viewOnKeyListenerC0894D = (ViewOnKeyListenerC0894D) obj;
                if (viewOnKeyListenerC0894D.mo2308b()) {
                    C0955P0 c0955p0 = viewOnKeyListenerC0894D.f3583h;
                    if (!c0955p0.f3822y) {
                        View view2 = viewOnKeyListenerC0894D.f3588m;
                        if (view2 != null && view2.isShown()) {
                            c0955p0.mo2310i();
                            break;
                        } else {
                            viewOnKeyListenerC0894D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 3:
                C0961T c0961t = (C0961T) obj;
                if (!c0961t.getInternalPopup().mo2412b()) {
                    c0961t.f3858f.mo2415e(AbstractC0944K.m2405b(c0961t), AbstractC0944K.m2404a(c0961t));
                }
                ViewTreeObserver viewTreeObserver = c0961t.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC0942J.m2394a(viewTreeObserver, this);
                    break;
                }
                break;
            default:
                C0954P c0954p = (C0954P) obj;
                C0961T c0961t2 = c0954p.f3840G;
                c0954p.getClass();
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                if (!c0961t2.isAttachedToWindow() || !c0961t2.getGlobalVisibleRect(c0954p.f3838E)) {
                    c0954p.dismiss();
                    break;
                } else {
                    c0954p.m2424s();
                    c0954p.mo2310i();
                    break;
                }
                break;
        }
    }
}
