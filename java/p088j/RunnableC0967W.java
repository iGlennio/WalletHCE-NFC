package p088j;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: j.W */
/* loaded from: classes.dex */
public final class RunnableC0967W implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3874a = 0;

    /* renamed from: b */
    public final /* synthetic */ int f3875b;

    /* renamed from: c */
    public final /* synthetic */ View f3876c;

    /* renamed from: d */
    public final /* synthetic */ Object f3877d;

    public RunnableC0967W(TextView textView, Typeface typeface, int i2) {
        this.f3876c = textView;
        this.f3877d = typeface;
        this.f3875b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3874a) {
            case 0:
                ((TextView) this.f3876c).setTypeface((Typeface) this.f3877d, this.f3875b);
                break;
            default:
                ((BottomSheetBehavior) this.f3877d).m1911I(this.f3876c, this.f3875b, false);
                break;
        }
    }

    public RunnableC0967W(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        this.f3877d = bottomSheetBehavior;
        this.f3876c = view;
        this.f3875b = i2;
    }
}
