package p037N0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p005C.AbstractC0044g;
import p010D1.AbstractC0104l;
import p127x.AbstractC1303a;

/* renamed from: N0.d */
/* loaded from: classes.dex */
public final class C0387d extends AbstractC0104l {

    /* renamed from: a */
    public final /* synthetic */ int f1034a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1303a f1035b;

    public /* synthetic */ C0387d(AbstractC1303a abstractC1303a, int i2) {
        this.f1034a = i2;
        this.f1035b = abstractC1303a;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: A */
    public int mo419A(View view) {
        switch (this.f1034a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1035b;
                return sideSheetBehavior.f2773l + sideSheetBehavior.f2776o;
            default:
                return super.mo419A(view);
        }
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: B */
    public int mo420B() {
        switch (this.f1034a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1035b;
                return bottomSheetBehavior.f2520I ? bottomSheetBehavior.f2531T : bottomSheetBehavior.f2518G;
            default:
                return super.mo420B();
        }
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: L */
    public final void mo424L(int i2) {
        switch (this.f1034a) {
            case 0:
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1035b;
                    if (sideSheetBehavior.f2768g) {
                        sideSheetBehavior.m1973w(1);
                        break;
                    }
                }
                break;
            default:
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1035b;
                    if (bottomSheetBehavior.f2522K) {
                        bottomSheetBehavior.m1909G(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: M */
    public final void mo425M(View view, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1034a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1035b;
                WeakReference weakReference = sideSheetBehavior.f2778q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2762a.mo376n0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2783v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2762a.mo373i(i2);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC0044g.m152d(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f1035b).m1922y(i3);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f2516E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.m1904B()) < java.lang.Math.abs(r6.getTop() - r4.f2516E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f2515D) < java.lang.Math.abs(r7 - r4.f2518G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r0.f2762a.mo364O(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f2762a.mo380x()) < java.lang.Math.abs(r7 - r0.f2762a.mo381y())) goto L73;
     */
    @Override // p010D1.AbstractC0104l
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo426N(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p037N0.C0387d.mo426N(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L27;
     */
    @Override // p010D1.AbstractC0104l
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo429V(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f1034a
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            x.a r0 = r4.f1035b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.f2523L
            r2 = 1
            if (r1 != r2) goto Lf
            goto L3f
        Lf:
            boolean r3 = r0.f2541b0
            if (r3 == 0) goto L14
            goto L3f
        L14:
            r3 = 3
            if (r1 != r3) goto L31
            int r1 = r0.f2537Z
            if (r1 != r6) goto L31
            java.lang.ref.WeakReference r6 = r0.f2533V
            if (r6 == 0) goto L26
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L31
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L31
            goto L3f
        L31:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.f2532U
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            return r2
        L41:
            x.a r6 = r4.f1035b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f2769h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L4c
            goto L57
        L4c:
            java.lang.ref.WeakReference r6 = r6.f2777p
            if (r6 == 0) goto L57
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L57
            r1 = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p037N0.C0387d.mo429V(android.view.View, int):boolean");
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: i */
    public final int mo433i(View view, int i2) {
        switch (this.f1034a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1035b;
                return AbstractC0104l.m403h(i2, sideSheetBehavior.f2762a.mo356A(), sideSheetBehavior.f2762a.mo382z());
            default:
                return view.getLeft();
        }
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: j */
    public final int mo434j(View view, int i2) {
        switch (this.f1034a) {
            case 0:
                return view.getTop();
            default:
                return AbstractC0104l.m403h(i2, ((BottomSheetBehavior) this.f1035b).m1904B(), mo420B());
        }
    }
}
