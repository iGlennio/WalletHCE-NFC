package p079f0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import p027K.C0284b;
import p030L.C0342i;
import p056V.C0508b;

/* renamed from: f0.Y */
/* loaded from: classes.dex */
public class C0828Y extends C0284b {

    /* renamed from: d */
    public final RecyclerView f3298d;

    /* renamed from: e */
    public final C0508b f3299e;

    public C0828Y(RecyclerView recyclerView) {
        this.f3298d = recyclerView;
        C0508b c0508b = this.f3299e;
        if (c0508b != null) {
            this.f3299e = c0508b;
        } else {
            this.f3299e = new C0508b(this);
        }
    }

    @Override // p027K.C0284b
    /* renamed from: c */
    public final void mo458c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo458c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f3298d.m1810K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1772T(accessibilityEvent);
        }
    }

    @Override // p027K.C0284b
    /* renamed from: d */
    public void mo459d(View view, C0342i c0342i) {
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0342i.f893a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f3298d;
        if (recyclerView.m1810K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0812H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3217b;
        C0818N c0818n = recyclerView2.f2398b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f3217b.canScrollHorizontally(-1)) {
            c0342i.m989a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f3217b.canScrollVertically(1) || layoutManager.f3217b.canScrollHorizontally(1)) {
            c0342i.m989a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C0824U c0824u = recyclerView2.f2401c0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo1717J(c0818n, c0824u), layoutManager.mo1751x(c0818n, c0824u), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // p027K.C0284b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo850g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.mo850g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f3298d
            boolean r0 = r4.m1810K()
            r1 = 0
            if (r0 != 0) goto L8c
            f0.H r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            f0.H r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3217b
            f0.N r2 = r0.f2398b
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f3230o
            int r2 = r4.m2178G()
            int r0 = r0 - r2
            int r2 = r4.m2175D()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f3217b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f3229n
            int r2 = r4.m2176E()
            int r5 = r5 - r2
            int r2 = r4.m2177F()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f3230o
            int r0 = r4.m2178G()
            int r5 = r5 - r0
            int r0 = r4.m2175D()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f3217b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f3229n
            int r2 = r4.m2176E()
            int r5 = r5 - r2
            int r2 = r4.m2177F()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f3217b
            r4.m1826a0(r5, r0, r6)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f0.C0828Y.mo850g(android.view.View, int, android.os.Bundle):boolean");
    }
}
