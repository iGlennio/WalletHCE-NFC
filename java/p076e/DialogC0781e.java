package p076e;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0581s;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0677l;
import androidx.lifecycle.InterfaceC0683r;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p014F0.ViewOnClickListenerC0141i;
import p027K.AbstractC0262F;
import p027K.AbstractC0272P;
import p047Q1.AbstractC0458e;
import p047Q1.C0456c;
import p081g0.C0869d;
import p081g0.InterfaceC0870e;
import p083h.C0883k;
import p095l1.AbstractC1136c;

/* renamed from: e.e */
/* loaded from: classes.dex */
public final class DialogC0781e extends Dialog implements DialogInterface, InterfaceC0783g, InterfaceC0683r, InterfaceC0870e {

    /* renamed from: a */
    public C0685t f3077a;

    /* renamed from: b */
    public final C0456c f3078b;

    /* renamed from: c */
    public final C0581s f3079c;

    /* renamed from: d */
    public LayoutInflaterFactory2C0797u f3080d;

    /* renamed from: e */
    public final C0798v f3081e;

    /* renamed from: f */
    public final C0780d f3082f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v4, types: [e.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC0781e(android.view.ContextThemeWrapper r6, int r7) {
        /*
            r5 = this;
            int r7 = m2086h(r6, r7)
            r0 = 1
            r1 = 2130903418(0x7f03017a, float:1.7413653E38)
            if (r7 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r7
        L1a:
            r5.<init>(r6, r2)
            Q1.c r2 = new Q1.c
            r2.<init>(r5)
            r5.f3078b = r2
            androidx.activity.s r2 = new androidx.activity.s
            F0.G r3 = new F0.G
            r4 = 8
            r3.<init>(r4, r5)
            r2.<init>(r3)
            r5.f3079c = r2
            e.v r2 = new e.v
            r2.<init>()
            r5.f3081e = r2
            e.j r2 = r5.m2087c()
            if (r7 != 0) goto L4d
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            r6.resolveAttribute(r1, r7, r0)
            int r7 = r7.resourceId
        L4d:
            r6 = r2
            e.u r6 = (p076e.LayoutInflaterFactory2C0797u) r6
            r6.f3154T = r7
            r2.mo2110d()
            e.d r6 = new e.d
            android.content.Context r7 = r5.getContext()
            android.view.Window r0 = r5.getWindow()
            r6.<init>(r7, r5, r0)
            r5.f3082f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.DialogC0781e.<init>(android.view.ContextThemeWrapper, int):void");
    }

    /* renamed from: a */
    public static void m2085a(DialogC0781e dialogC0781e) {
        AbstractC1136c.m2637e(dialogC0781e, "this$0");
        super.onBackPressed();
    }

    /* renamed from: h */
    public static int m2086h(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2087c();
        layoutInflaterFactory2C0797u.m2146w();
        ((ViewGroup) layoutInflaterFactory2C0797u.f3135A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0797u.f3171m.m2124a(layoutInflaterFactory2C0797u.f3170l.getCallback());
    }

    @Override // p081g0.InterfaceC0870e
    /* renamed from: b */
    public final C0869d mo1360b() {
        return (C0869d) this.f3078b.f1251c;
    }

    /* renamed from: c */
    public final AbstractC0786j m2087c() {
        if (this.f3080d == null) {
            ExecutorC0769A executorC0769A = AbstractC0786j.f3089a;
            this.f3080d = new LayoutInflaterFactory2C0797u(getContext(), getWindow(), this, this);
        }
        return this.f3080d;
    }

    @Override // androidx.lifecycle.InterfaceC0683r
    /* renamed from: d */
    public final C0685t mo1362d() {
        C0685t c0685t = this.f3077a;
        if (c0685t != null) {
            return c0685t;
        }
        C0685t c0685t2 = new C0685t(this);
        this.f3077a = c0685t2;
        return c0685t2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m2087c().mo2111f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0458e.m1202t(this.f3081e, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public final void m2088e(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC1136c.m2636d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0581s c0581s = this.f3079c;
            c0581s.getClass();
            c0581s.f1620e = onBackInvokedDispatcher;
            c0581s.m1373c(c0581s.f1622g);
        }
        this.f3078b.m1166c(bundle);
        C0685t c0685t = this.f3077a;
        if (c0685t == null) {
            c0685t = new C0685t(this);
            this.f3077a = c0685t;
        }
        c0685t.m1702d(EnumC0677l.ON_CREATE);
    }

    /* renamed from: f */
    public final void m2089f(Bundle bundle) {
        m2087c().mo2108a();
        m2088e(bundle);
        m2087c().mo2110d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i2) {
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2087c();
        layoutInflaterFactory2C0797u.m2146w();
        return layoutInflaterFactory2C0797u.f3170l.findViewById(i2);
    }

    /* renamed from: g */
    public final void m2090g() {
        C0685t c0685t = this.f3077a;
        if (c0685t == null) {
            c0685t = new C0685t(this);
            this.f3077a = c0685t;
        }
        c0685t.m1702d(EnumC0677l.ON_DESTROY);
        this.f3077a = null;
        super.onStop();
    }

    /* renamed from: i */
    public final void m2091i(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2087c().mo2116m(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m2087c().mo2109b();
    }

    /* renamed from: j */
    public final boolean m2092j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3079c.m1372b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i2;
        ListAdapter listAdapter;
        View findViewById;
        m2089f(bundle);
        C0780d c0780d = this.f3082f;
        c0780d.f3055b.setContentView(c0780d.f3070q);
        Window window = c0780d.f3056c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup m2084a = C0780d.m2084a(findViewById6, findViewById3);
        ViewGroup m2084a2 = C0780d.m2084a(findViewById7, findViewById4);
        ViewGroup m2084a3 = C0780d.m2084a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0780d.f3062i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0780d.f3062i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) m2084a2.findViewById(android.R.id.message);
        c0780d.f3066m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0780d.f3062i.removeView(c0780d.f3066m);
            if (c0780d.f3058e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0780d.f3062i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0780d.f3062i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0780d.f3058e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                m2084a2.setVisibility(8);
            }
        }
        Button button = (Button) m2084a3.findViewById(android.R.id.button1);
        c0780d.f3059f = button;
        ViewOnClickListenerC0141i viewOnClickListenerC0141i = c0780d.f3076w;
        button.setOnClickListener(viewOnClickListenerC0141i);
        if (TextUtils.isEmpty(null)) {
            c0780d.f3059f.setVisibility(8);
            i2 = 0;
        } else {
            c0780d.f3059f.setText((CharSequence) null);
            c0780d.f3059f.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) m2084a3.findViewById(android.R.id.button2);
        c0780d.f3060g = button2;
        button2.setOnClickListener(viewOnClickListenerC0141i);
        if (TextUtils.isEmpty(null)) {
            c0780d.f3060g.setVisibility(8);
        } else {
            c0780d.f3060g.setText((CharSequence) null);
            c0780d.f3060g.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) m2084a3.findViewById(android.R.id.button3);
        c0780d.f3061h = button3;
        button3.setOnClickListener(viewOnClickListenerC0141i);
        if (TextUtils.isEmpty(null)) {
            c0780d.f3061h.setVisibility(8);
        } else {
            c0780d.f3061h.setText((CharSequence) null);
            c0780d.f3061h.setVisibility(0);
            i2 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0780d.f3054a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                Button button4 = c0780d.f3059f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                Button button5 = c0780d.f3060g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i2 == 4) {
                Button button6 = c0780d.f3061h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i2 == 0) {
            m2084a3.setVisibility(8);
        }
        if (c0780d.f3067n != null) {
            m2084a.addView(c0780d.f3067n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0780d.f3064k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0780d.f3057d) || !c0780d.f3074u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0780d.f3064k.setVisibility(8);
                m2084a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0780d.f3065l = textView2;
                textView2.setText(c0780d.f3057d);
                Drawable drawable = c0780d.f3063j;
                if (drawable != null) {
                    c0780d.f3064k.setImageDrawable(drawable);
                } else {
                    c0780d.f3065l.setPadding(c0780d.f3064k.getPaddingLeft(), c0780d.f3064k.getPaddingTop(), c0780d.f3064k.getPaddingRight(), c0780d.f3064k.getPaddingBottom());
                    c0780d.f3064k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (m2084a == null || m2084a.getVisibility() == 8) ? 0 : 1;
        boolean z3 = m2084a3.getVisibility() != 8;
        if (!z3 && (findViewById = m2084a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c0780d.f3062i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0780d.f3058e != null ? m2084a.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = m2084a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0780d.f3058e;
        if (alertController$RecycleListView != null && (!z3 || i3 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1623a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1624b);
        }
        if (!z2) {
            View view = c0780d.f3058e;
            if (view == null) {
                view = c0780d.f3062i;
            }
            if (view != null) {
                int i4 = (z3 ? 2 : 0) | i3;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                AbstractC0262F.m769d(view, i4, 3);
                if (findViewById11 != null) {
                    m2084a2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    m2084a2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0780d.f3058e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0780d.f3068o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = c0780d.f3069p;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3082f.f3062i;
        if (nestedScrollView == null || !nestedScrollView.m1474i(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3082f.f3062i;
        if (nestedScrollView == null || !nestedScrollView.m1474i(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        AbstractC1136c.m2636d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f3078b.m1167d(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0685t c0685t = this.f3077a;
        if (c0685t == null) {
            c0685t = new C0685t(this);
            this.f3077a = c0685t;
        }
        c0685t.m1702d(EnumC0677l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        m2090g();
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2087c();
        layoutInflaterFactory2C0797u.m2130A();
        C0776H c0776h = layoutInflaterFactory2C0797u.f3173o;
        if (c0776h != null) {
            c0776h.f3024G = false;
            C0883k c0883k = c0776h.f3023F;
            if (c0883k != null) {
                c0883k.m2299a();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int i2) {
        m2087c().mo2113i(i2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        super.setTitle(i2);
        m2087c().mo2116m(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        m2087c().mo2114j(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2087c().mo2115k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m2091i(charSequence);
        C0780d c0780d = this.f3082f;
        c0780d.f3057d = charSequence;
        TextView textView = c0780d.f3065l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
