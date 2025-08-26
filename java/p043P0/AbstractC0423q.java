package p043P0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p030L.C0342i;
import p042P.C0400b;

/* renamed from: P0.q */
/* loaded from: classes.dex */
public abstract class AbstractC0423q {

    /* renamed from: a */
    public final TextInputLayout f1136a;

    /* renamed from: b */
    public final C0422p f1137b;

    /* renamed from: c */
    public final Context f1138c;

    /* renamed from: d */
    public final CheckableImageButton f1139d;

    public AbstractC0423q(C0422p c0422p) {
        this.f1136a = c0422p.f1114a;
        this.f1137b = c0422p;
        this.f1138c = c0422p.getContext();
        this.f1139d = c0422p.f1120g;
    }

    /* renamed from: c */
    public int mo1065c() {
        return 0;
    }

    /* renamed from: d */
    public int mo1066d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo1067e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo1068f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo1069g() {
        return null;
    }

    /* renamed from: h */
    public C0400b mo1077h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo1078i(int i2) {
        return true;
    }

    /* renamed from: j */
    public boolean mo1079j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo1104k() {
        return this instanceof C0417k;
    }

    /* renamed from: l */
    public boolean mo1080l() {
        return false;
    }

    /* renamed from: q */
    public final void m1105q() {
        this.f1137b.m1094f(false);
    }

    /* renamed from: m */
    public void mo1070m(EditText editText) {
    }

    /* renamed from: n */
    public void mo1081n(C0342i c0342i) {
    }

    /* renamed from: o */
    public void mo1082o(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: p */
    public void mo1071p(boolean z2) {
    }

    /* renamed from: a */
    public void mo1064a() {
    }

    /* renamed from: b */
    public void mo1103b() {
    }

    /* renamed from: r */
    public void mo1072r() {
    }

    /* renamed from: s */
    public void mo1073s() {
    }
}
