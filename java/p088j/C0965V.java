package p088j;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p002B.AbstractC0012b;
import p027K.AbstractC0272P;

/* renamed from: j.V */
/* loaded from: classes.dex */
public final class C0965V extends AbstractC0012b {

    /* renamed from: h */
    public final /* synthetic */ int f3869h;

    /* renamed from: i */
    public final /* synthetic */ int f3870i;

    /* renamed from: j */
    public final /* synthetic */ WeakReference f3871j;

    /* renamed from: k */
    public final /* synthetic */ C0979b0 f3872k;

    public C0965V(C0979b0 c0979b0, int i2, int i3, WeakReference weakReference) {
        this.f3872k = c0979b0;
        this.f3869h = i2;
        this.f3870i = i3;
        this.f3871j = weakReference;
    }

    @Override // p002B.AbstractC0012b
    /* renamed from: h */
    public final void mo44h(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f3869h) != -1) {
            typeface = AbstractC0976a0.m2444a(typeface, i2, (this.f3870i & 2) != 0);
        }
        C0979b0 c0979b0 = this.f3872k;
        if (c0979b0.f3900m) {
            c0979b0.f3899l = typeface;
            TextView textView = (TextView) this.f3871j.get();
            if (textView != null) {
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0967W(textView, typeface, c0979b0.f3897j));
                } else {
                    textView.setTypeface(typeface, c0979b0.f3897j);
                }
            }
        }
    }

    @Override // p002B.AbstractC0012b
    /* renamed from: g */
    public final void mo43g(int i2) {
    }
}
