package p052T;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p005C.C0046i;
import p027K.AbstractC0272P;
import p027K.C0284b;
import p030L.C0342i;
import p034M0.C0360e;
import p134z0.C1330b;
import p134z0.C1332d;

/* renamed from: T.b */
/* loaded from: classes.dex */
public abstract class AbstractC0480b extends C0284b {

    /* renamed from: n */
    public static final Rect f1289n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C0360e f1290o = new C0360e(9);

    /* renamed from: p */
    public static final C0360e f1291p = new C0360e(10);

    /* renamed from: h */
    public final AccessibilityManager f1296h;

    /* renamed from: i */
    public final Chip f1297i;

    /* renamed from: j */
    public C0479a f1298j;

    /* renamed from: d */
    public final Rect f1292d = new Rect();

    /* renamed from: e */
    public final Rect f1293e = new Rect();

    /* renamed from: f */
    public final Rect f1294f = new Rect();

    /* renamed from: g */
    public final int[] f1295g = new int[2];

    /* renamed from: k */
    public int f1299k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f1300l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f1301m = Integer.MIN_VALUE;

    public AbstractC0480b(Chip chip) {
        this.f1297i = chip;
        this.f1296h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p027K.C0284b
    /* renamed from: b */
    public final C0046i mo847b(View view) {
        if (this.f1298j == null) {
            this.f1298j = new C0479a(this);
        }
        return this.f1298j;
    }

    @Override // p027K.C0284b
    /* renamed from: d */
    public final void mo459d(View view, C0342i c0342i) {
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0342i.f893a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C1330b) this).f5438q;
        C1332d c1332d = chip.f2602e;
        accessibilityNodeInfo.setCheckable(c1332d != null && c1332d.f5462Q);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c0342i.m996i(chip.getAccessibilityClassName());
        c0342i.m999l(chip.getText());
    }

    /* renamed from: j */
    public final boolean m1232j(int i2) {
        if (this.f1300l != i2) {
            return false;
        }
        this.f1300l = Integer.MIN_VALUE;
        C1330b c1330b = (C1330b) this;
        if (i2 == 1) {
            Chip chip = c1330b.f5438q;
            chip.f2610m = false;
            chip.refreshDrawableState();
        }
        m1239q(i2, 8);
        return true;
    }

    /* renamed from: k */
    public final C0342i m1233k(int i2) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C0342i c0342i = new C0342i(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        c0342i.m996i("android.view.View");
        Rect rect = f1289n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f1297i;
        obtain.setParent(chip);
        mo1237o(i2, c0342i);
        if (c0342i.m994g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1293e;
        c0342i.m993f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        c0342i.f894b = i2;
        obtain.setSource(chip, i2);
        if (this.f1299k == i2) {
            obtain.setAccessibilityFocused(true);
            c0342i.m989a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            c0342i.m989a(64);
        }
        boolean z2 = this.f1300l == i2;
        if (z2) {
            c0342i.m989a(2);
        } else if (obtain.isFocusable()) {
            c0342i.m989a(1);
        }
        obtain.setFocused(z2);
        int[] iArr = this.f1295g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f1292d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0342i.m993f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f1294f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            c0342i.f893a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c0342i;
    }

    /* renamed from: l */
    public abstract void mo1234l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1235m(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p052T.AbstractC0480b.m1235m(int, android.graphics.Rect):boolean");
    }

    /* renamed from: n */
    public final C0342i m1236n(int i2) {
        if (i2 != -1) {
            return m1233k(i2);
        }
        Chip chip = this.f1297i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        C0342i c0342i = new C0342i(obtain);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo1234l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c0342i.f893a.addChild(chip, ((Integer) arrayList.get(i3)).intValue());
        }
        return c0342i;
    }

    /* renamed from: o */
    public abstract void mo1237o(int i2, C0342i c0342i);

    /* renamed from: p */
    public final boolean m1238p(int i2) {
        int i3;
        Chip chip = this.f1297i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i3 = this.f1300l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            m1232j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f1300l = i2;
        C1330b c1330b = (C1330b) this;
        if (i2 == 1) {
            Chip chip2 = c1330b.f5438q;
            chip2.f2610m = true;
            chip2.refreshDrawableState();
        }
        m1239q(i2, 8);
        return true;
    }

    /* renamed from: q */
    public final void m1239q(int i2, int i3) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i2 == Integer.MIN_VALUE || !this.f1296h.isEnabled() || (parent = (view = this.f1297i).getParent()) == null) {
            return;
        }
        if (i2 != -1) {
            obtain = AccessibilityEvent.obtain(i3);
            C0342i m1236n = m1236n(i2);
            obtain.getText().add(m1236n.m994g());
            AccessibilityNodeInfo accessibilityNodeInfo = m1236n.f893a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i2);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i3);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
