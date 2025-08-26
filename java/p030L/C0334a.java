package p030L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: L.a */
/* loaded from: classes.dex */
public final class C0334a extends ClickableSpan {

    /* renamed from: a */
    public final int f873a;

    /* renamed from: b */
    public final C0342i f874b;

    /* renamed from: c */
    public final int f875c;

    public C0334a(int i2, C0342i c0342i, int i3) {
        this.f873a = i2;
        this.f874b = c0342i;
        this.f875c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f873a);
        this.f874b.f893a.performAction(this.f875c, bundle);
    }
}
