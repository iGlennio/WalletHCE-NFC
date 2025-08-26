package p086i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p005C.C0046i;
import p019H0.ViewTreeObserverOnGlobalLayoutListenerC0199e;
import p027K.AbstractC0272P;
import p043P0.ViewOnAttachStateChangeListenerC0420n;
import p088j.AbstractC0947L0;
import p088j.C0955P0;
import p088j.C1045x0;

/* renamed from: i.f */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0901f extends AbstractC0915t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b */
    public final Context f3623b;

    /* renamed from: c */
    public final int f3624c;

    /* renamed from: d */
    public final int f3625d;

    /* renamed from: e */
    public final boolean f3626e;

    /* renamed from: f */
    public final Handler f3627f;

    /* renamed from: n */
    public View f3635n;

    /* renamed from: o */
    public View f3636o;

    /* renamed from: p */
    public int f3637p;

    /* renamed from: q */
    public boolean f3638q;

    /* renamed from: r */
    public boolean f3639r;

    /* renamed from: s */
    public int f3640s;

    /* renamed from: t */
    public int f3641t;

    /* renamed from: v */
    public boolean f3643v;

    /* renamed from: w */
    public InterfaceC0919x f3644w;

    /* renamed from: x */
    public ViewTreeObserver f3645x;

    /* renamed from: y */
    public C0916u f3646y;

    /* renamed from: z */
    public boolean f3647z;

    /* renamed from: g */
    public final ArrayList f3628g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f3629h = new ArrayList();

    /* renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0199e f3630i = new ViewTreeObserverOnGlobalLayoutListenerC0199e(1, this);

    /* renamed from: j */
    public final ViewOnAttachStateChangeListenerC0420n f3631j = new ViewOnAttachStateChangeListenerC0420n(2, this);

    /* renamed from: k */
    public final C0046i f3632k = new C0046i(26, this);

    /* renamed from: l */
    public int f3633l = 0;

    /* renamed from: m */
    public int f3634m = 0;

    /* renamed from: u */
    public boolean f3642u = false;

    public ViewOnKeyListenerC0901f(Context context, View view, int i2, boolean z2) {
        this.f3623b = context;
        this.f3635n = view;
        this.f3625d = i2;
        this.f3626e = z2;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        this.f3637p = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f3624c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3627f = new Handler();
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: a */
    public final void mo482a(MenuC0907l menuC0907l, boolean z2) {
        ArrayList arrayList = this.f3629h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0907l == ((C0900e) arrayList.get(i2)).f3621b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0900e) arrayList.get(i3)).f3621b.m2339c(false);
        }
        C0900e c0900e = (C0900e) arrayList.remove(i2);
        c0900e.f3621b.m2345r(this);
        boolean z3 = this.f3647z;
        C0955P0 c0955p0 = c0900e.f3620a;
        if (z3) {
            AbstractC0947L0.m2410b(c0955p0.f3823z, null);
            c0955p0.f3823z.setAnimationStyle(0);
        }
        c0955p0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3637p = ((C0900e) arrayList.get(size2 - 1)).f3622c;
        } else {
            View view = this.f3635n;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            this.f3637p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0900e) arrayList.get(0)).f3621b.m2339c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0919x interfaceC0919x = this.f3644w;
        if (interfaceC0919x != null) {
            interfaceC0919x.mo165a(menuC0907l, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3645x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3645x.removeGlobalOnLayoutListener(this.f3630i);
            }
            this.f3645x = null;
        }
        this.f3636o.removeOnAttachStateChangeListener(this.f3631j);
        this.f3646y.onDismiss();
    }

    @Override // p086i.InterfaceC0893C
    /* renamed from: b */
    public final boolean mo2308b() {
        ArrayList arrayList = this.f3629h;
        return arrayList.size() > 0 && ((C0900e) arrayList.get(0)).f3620a.f3823z.isShowing();
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: c */
    public final void mo483c() {
        Iterator it = this.f3629h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0900e) it.next()).f3620a.f3800c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0904i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p086i.InterfaceC0893C
    public final void dismiss() {
        ArrayList arrayList = this.f3629h;
        int size = arrayList.size();
        if (size > 0) {
            C0900e[] c0900eArr = (C0900e[]) arrayList.toArray(new C0900e[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0900e c0900e = c0900eArr[i2];
                if (c0900e.f3620a.f3823z.isShowing()) {
                    c0900e.f3620a.dismiss();
                }
            }
        }
    }

    @Override // p086i.InterfaceC0893C
    /* renamed from: f */
    public final C1045x0 mo2309f() {
        ArrayList arrayList = this.f3629h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0900e) arrayList.get(arrayList.size() - 1)).f3620a.f3800c;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: g */
    public final boolean mo486g() {
        return false;
    }

    @Override // p086i.InterfaceC0893C
    /* renamed from: i */
    public final void mo2310i() {
        if (mo2308b()) {
            return;
        }
        ArrayList arrayList = this.f3628g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2332y((MenuC0907l) it.next());
        }
        arrayList.clear();
        View view = this.f3635n;
        this.f3636o = view;
        if (view != null) {
            boolean z2 = this.f3645x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3645x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3630i);
            }
            this.f3636o.addOnAttachStateChangeListener(this.f3631j);
        }
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: j */
    public final Parcelable mo488j() {
        return null;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: k */
    public final void mo2311k(InterfaceC0919x interfaceC0919x) {
        this.f3644w = interfaceC0919x;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: n */
    public final boolean mo491n(SubMenuC0895E subMenuC0895E) {
        Iterator it = this.f3629h.iterator();
        while (it.hasNext()) {
            C0900e c0900e = (C0900e) it.next();
            if (subMenuC0895E == c0900e.f3621b) {
                c0900e.f3620a.f3800c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0895E.hasVisibleItems()) {
            return false;
        }
        mo2312o(subMenuC0895E);
        InterfaceC0919x interfaceC0919x = this.f3644w;
        if (interfaceC0919x != null) {
            interfaceC0919x.mo173i(subMenuC0895E);
        }
        return true;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: o */
    public final void mo2312o(MenuC0907l menuC0907l) {
        menuC0907l.m2338b(this, this.f3623b);
        if (mo2308b()) {
            m2332y(menuC0907l);
        } else {
            this.f3628g.add(menuC0907l);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0900e c0900e;
        ArrayList arrayList = this.f3629h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0900e = null;
                break;
            }
            c0900e = (C0900e) arrayList.get(i2);
            if (!c0900e.f3620a.f3823z.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0900e != null) {
            c0900e.f3621b.m2339c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: q */
    public final void mo2313q(View view) {
        if (this.f3635n != view) {
            this.f3635n = view;
            int i2 = this.f3633l;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            this.f3634m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: r */
    public final void mo2314r(boolean z2) {
        this.f3642u = z2;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: s */
    public final void mo2315s(int i2) {
        if (this.f3633l != i2) {
            this.f3633l = i2;
            View view = this.f3635n;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            this.f3634m = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: t */
    public final void mo2316t(int i2) {
        this.f3638q = true;
        this.f3640s = i2;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: u */
    public final void mo2317u(PopupWindow.OnDismissListener onDismissListener) {
        this.f3646y = (C0916u) onDismissListener;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: v */
    public final void mo2318v(boolean z2) {
        this.f3643v = z2;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: w */
    public final void mo2319w(int i2) {
        this.f3639r = true;
        this.f3641t = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0146, code lost:
    
        if (((r8.getWidth() + r11[0]) + r5) > r9.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0148, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014b, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0150, code lost:
    
        if ((r11[0] - r5) < 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2332y(p086i.MenuC0907l r18) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p086i.ViewOnKeyListenerC0901f.m2332y(i.l):void");
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: m */
    public final void mo490m(Parcelable parcelable) {
    }
}
