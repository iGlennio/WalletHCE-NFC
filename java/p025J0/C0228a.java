package p025J0;

import android.graphics.Typeface;
import p005C.C0046i;
import p014F0.C0136d;
import p047Q1.AbstractC0458e;

/* renamed from: J0.a */
/* loaded from: classes.dex */
public final class C0228a extends AbstractC0458e {

    /* renamed from: h */
    public final Typeface f671h;

    /* renamed from: i */
    public final C0046i f672i;

    /* renamed from: j */
    public boolean f673j;

    public C0228a(C0046i c0046i, Typeface typeface) {
        this.f671h = typeface;
        this.f672i = c0046i;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: L */
    public final void mo448L(int i2) {
        if (this.f673j) {
            return;
        }
        C0136d c0136d = (C0136d) this.f672i.f116b;
        if (c0136d.m469j(this.f671h)) {
            c0136d.m467h(false);
        }
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: M */
    public final void mo449M(Typeface typeface, boolean z2) {
        if (this.f673j) {
            return;
        }
        C0136d c0136d = (C0136d) this.f672i.f116b;
        if (c0136d.m469j(typeface)) {
            c0136d.m467h(false);
        }
    }
}
