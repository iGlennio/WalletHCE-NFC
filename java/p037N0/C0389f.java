package p037N0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p014F0.RunnableC0130G;
import p027K.AbstractC0272P;
import p043P0.RunnableC0402A;
import p127x.AbstractC1303a;

/* renamed from: N0.f */
/* loaded from: classes.dex */
public final class C0389f {

    /* renamed from: a */
    public final /* synthetic */ int f1037a;

    /* renamed from: b */
    public int f1038b;

    /* renamed from: c */
    public boolean f1039c;

    /* renamed from: d */
    public final Runnable f1040d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC1303a f1041e;

    public C0389f(SideSheetBehavior sideSheetBehavior) {
        this.f1037a = 0;
        this.f1041e = sideSheetBehavior;
        this.f1040d = new RunnableC0130G(2, this);
    }

    /* renamed from: a */
    public final void m1052a(int i2) {
        Runnable runnable = this.f1040d;
        AbstractC1303a abstractC1303a = this.f1041e;
        switch (this.f1037a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC1303a;
                WeakReference weakReference = sideSheetBehavior.f2777p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1038b = i2;
                    if (!this.f1039c) {
                        WeakHashMap weakHashMap = AbstractC0272P.f768a;
                        ((View) sideSheetBehavior.f2777p.get()).postOnAnimation((RunnableC0130G) runnable);
                        this.f1039c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC1303a;
                WeakReference weakReference2 = bottomSheetBehavior.f2532U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1038b = i2;
                    if (!this.f1039c) {
                        WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                        ((View) bottomSheetBehavior.f2532U.get()).postOnAnimation((RunnableC0402A) runnable);
                        this.f1039c = true;
                        break;
                    }
                }
                break;
        }
    }

    public C0389f(BottomSheetBehavior bottomSheetBehavior) {
        this.f1037a = 1;
        this.f1041e = bottomSheetBehavior;
        this.f1040d = new RunnableC0402A(16, this);
    }
}
