package p025J0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p047Q1.AbstractC0458e;

/* renamed from: J0.c */
/* loaded from: classes.dex */
public final class C0230c extends AbstractC0458e {

    /* renamed from: h */
    public final /* synthetic */ Context f676h;

    /* renamed from: i */
    public final /* synthetic */ TextPaint f677i;

    /* renamed from: j */
    public final /* synthetic */ AbstractC0458e f678j;

    /* renamed from: k */
    public final /* synthetic */ C0231d f679k;

    public C0230c(C0231d c0231d, Context context, TextPaint textPaint, AbstractC0458e abstractC0458e) {
        this.f679k = c0231d;
        this.f676h = context;
        this.f677i = textPaint;
        this.f678j = abstractC0458e;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: L */
    public final void mo448L(int i2) {
        this.f678j.mo448L(i2);
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: M */
    public final void mo449M(Typeface typeface, boolean z2) {
        this.f679k.m639g(this.f676h, this.f677i, typeface);
        this.f678j.mo449M(typeface, z2);
    }
}
