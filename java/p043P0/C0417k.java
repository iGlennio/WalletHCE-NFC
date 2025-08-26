package p043P0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p014F0.RunnableC0130G;
import p017G0.C0177i;
import p019H0.C0195a;
import p027K.AbstractC0272P;
import p030L.C0342i;
import p042P.C0400b;
import p047Q1.AbstractC0458e;
import p111r0.AbstractC1188a;

/* renamed from: P0.k */
/* loaded from: classes.dex */
public final class C0417k extends AbstractC0423q {

    /* renamed from: e */
    public final int f1092e;

    /* renamed from: f */
    public final int f1093f;

    /* renamed from: g */
    public final TimeInterpolator f1094g;

    /* renamed from: h */
    public AutoCompleteTextView f1095h;

    /* renamed from: i */
    public final ViewOnClickListenerC0407a f1096i;

    /* renamed from: j */
    public final ViewOnFocusChangeListenerC0408b f1097j;

    /* renamed from: k */
    public final C0400b f1098k;

    /* renamed from: l */
    public boolean f1099l;

    /* renamed from: m */
    public boolean f1100m;

    /* renamed from: n */
    public boolean f1101n;

    /* renamed from: o */
    public long f1102o;

    /* renamed from: p */
    public AccessibilityManager f1103p;

    /* renamed from: q */
    public ValueAnimator f1104q;

    /* renamed from: r */
    public ValueAnimator f1105r;

    public C0417k(C0422p c0422p) {
        super(c0422p);
        int i2 = 1;
        this.f1096i = new ViewOnClickListenerC0407a(i2, this);
        this.f1097j = new ViewOnFocusChangeListenerC0408b(this, i2);
        this.f1098k = new C0400b(this);
        this.f1102o = Long.MAX_VALUE;
        this.f1093f = AbstractC0458e.m1179S(c0422p.getContext(), R.attr.motionDurationShort3, 67);
        this.f1092e = AbstractC0458e.m1179S(c0422p.getContext(), R.attr.motionDurationShort3, 50);
        this.f1094g = AbstractC0458e.m1180T(c0422p.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1188a.f4552a);
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: a */
    public final void mo1064a() {
        if (this.f1103p.isTouchExplorationEnabled() && AbstractC0458e.m1172F(this.f1095h) && !this.f1139d.hasFocus()) {
            this.f1095h.dismissDropDown();
        }
        this.f1095h.post(new RunnableC0130G(4, this));
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: c */
    public final int mo1065c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: d */
    public final int mo1066d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1067e() {
        return this.f1097j;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: f */
    public final View.OnClickListener mo1068f() {
        return this.f1096i;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: h */
    public final C0400b mo1077h() {
        return this.f1098k;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: i */
    public final boolean mo1078i(int i2) {
        return i2 != 0;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: j */
    public final boolean mo1079j() {
        return this.f1099l;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: l */
    public final boolean mo1080l() {
        return this.f1101n;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: m */
    public final void mo1070m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1095h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: P0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0417k c0417k = C0417k.this;
                c0417k.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - c0417k.f1102o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        c0417k.f1100m = false;
                    }
                    c0417k.m1084u();
                    c0417k.f1100m = true;
                    c0417k.f1102o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f1095h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: P0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0417k c0417k = C0417k.this;
                c0417k.f1100m = true;
                c0417k.f1102o = System.currentTimeMillis();
                c0417k.m1083t(false);
            }
        });
        this.f1095h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1136a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC0458e.m1172F(editText) && this.f1103p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            this.f1139d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: n */
    public final void mo1081n(C0342i c0342i) {
        if (!AbstractC0458e.m1172F(this.f1095h)) {
            c0342i.m996i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? c0342i.f893a.isShowingHintText() : c0342i.m992e(4)) {
            c0342i.m998k(null);
        }
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: o */
    public final void mo1082o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1103p.isEnabled() || AbstractC0458e.m1172F(this.f1095h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1101n && !this.f1095h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            m1084u();
            this.f1100m = true;
            this.f1102o = System.currentTimeMillis();
        }
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: r */
    public final void mo1072r() {
        int i2 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1094g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1093f);
        ofFloat.addUpdateListener(new C0195a(i2, this));
        this.f1105r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f1092e);
        ofFloat2.addUpdateListener(new C0195a(i2, this));
        this.f1104q = ofFloat2;
        ofFloat2.addListener(new C0177i(3, this));
        this.f1103p = (AccessibilityManager) this.f1138c.getSystemService("accessibility");
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: s */
    public final void mo1073s() {
        AutoCompleteTextView autoCompleteTextView = this.f1095h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1095h.setOnDismissListener(null);
        }
    }

    /* renamed from: t */
    public final void m1083t(boolean z2) {
        if (this.f1101n != z2) {
            this.f1101n = z2;
            this.f1105r.cancel();
            this.f1104q.start();
        }
    }

    /* renamed from: u */
    public final void m1084u() {
        if (this.f1095h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1102o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f1100m = false;
        }
        if (this.f1100m) {
            this.f1100m = false;
            return;
        }
        m1083t(!this.f1101n);
        if (!this.f1101n) {
            this.f1095h.dismissDropDown();
        } else {
            this.f1095h.requestFocus();
            this.f1095h.showDropDown();
        }
    }
}
