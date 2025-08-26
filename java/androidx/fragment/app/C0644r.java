package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0664L;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.InterfaceC0665M;
import androidx.lifecycle.InterfaceC0683r;
import nfc.share.nfcshare.MainActivity;
import p047Q1.AbstractC0458e;
import p076e.AbstractActivityC0782f;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public final class C0644r extends AbstractC0458e implements InterfaceC0665M, InterfaceC0683r, InterfaceC0618H {

    /* renamed from: h */
    public final AbstractActivityC0782f f2249h;

    /* renamed from: i */
    public final AbstractActivityC0782f f2250i;

    /* renamed from: j */
    public final Handler f2251j;

    /* renamed from: k */
    public final C0615E f2252k;

    /* renamed from: l */
    public final /* synthetic */ MainActivity f2253l;

    public C0644r(MainActivity mainActivity) {
        this.f2253l = mainActivity;
        Handler handler = new Handler();
        this.f2252k = new C0615E();
        this.f2249h = mainActivity;
        this.f2250i = mainActivity;
        this.f2251j = handler;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: K */
    public final View mo1211K(int i2) {
        return this.f2253l.findViewById(i2);
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: N */
    public final boolean mo1212N() {
        Window window = this.f2253l.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.InterfaceC0665M
    /* renamed from: c */
    public final C0664L mo1361c() {
        return this.f2253l.mo1361c();
    }

    @Override // androidx.lifecycle.InterfaceC0683r
    /* renamed from: d */
    public final C0685t mo1362d() {
        return this.f2253l.f3084q;
    }

    @Override // androidx.fragment.app.InterfaceC0618H
    /* renamed from: a */
    public final void mo1609a() {
    }
}
