package p052T;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import p005C.C0046i;
import p027K.AbstractC0272P;
import p030L.C0342i;
import p134z0.C1330b;

/* renamed from: T.a */
/* loaded from: classes.dex */
public final class C0479a extends C0046i {

    /* renamed from: d */
    public final /* synthetic */ AbstractC0480b f1288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479a(AbstractC0480b abstractC0480b) {
        super(4);
        this.f1288d = abstractC0480b;
    }

    @Override // p005C.C0046i
    /* renamed from: u */
    public final C0342i mo185u(int i2) {
        return new C0342i(AccessibilityNodeInfo.obtain(this.f1288d.m1236n(i2).f893a));
    }

    @Override // p005C.C0046i
    /* renamed from: v */
    public final C0342i mo186v(int i2) {
        AbstractC0480b abstractC0480b = this.f1288d;
        int i3 = i2 == 2 ? abstractC0480b.f1299k : abstractC0480b.f1300l;
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return mo185u(i3);
    }

    @Override // p005C.C0046i
    /* renamed from: x */
    public final boolean mo188x(int i2, int i3, Bundle bundle) {
        int i4;
        AbstractC0480b abstractC0480b = this.f1288d;
        Chip chip = abstractC0480b.f1297i;
        if (i2 == -1) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            return chip.performAccessibilityAction(i3, bundle);
        }
        if (i3 == 1) {
            return abstractC0480b.m1238p(i2);
        }
        if (i3 == 2) {
            return abstractC0480b.m1232j(i2);
        }
        boolean z2 = false;
        if (i3 == 64) {
            AccessibilityManager accessibilityManager = abstractC0480b.f1296h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = abstractC0480b.f1299k) == i2) {
                return false;
            }
            if (i4 != Integer.MIN_VALUE) {
                abstractC0480b.f1299k = Integer.MIN_VALUE;
                abstractC0480b.f1297i.invalidate();
                abstractC0480b.m1239q(i4, 65536);
            }
            abstractC0480b.f1299k = i2;
            chip.invalidate();
            abstractC0480b.m1239q(i2, 32768);
            return true;
        }
        if (i3 == 128) {
            if (abstractC0480b.f1299k != i2) {
                return false;
            }
            abstractC0480b.f1299k = Integer.MIN_VALUE;
            chip.invalidate();
            abstractC0480b.m1239q(i2, 65536);
            return true;
        }
        C1330b c1330b = (C1330b) abstractC0480b;
        if (i3 == 16) {
            Chip chip2 = c1330b.f5438q;
            if (i2 == 0) {
                return chip2.performClick();
            }
            if (i2 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f2605h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z2 = true;
                }
                if (chip2.f2616s) {
                    chip2.f2615r.m1239q(1, 1);
                }
            }
        }
        return z2;
    }
}
