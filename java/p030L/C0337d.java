package p030L;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.d */
/* loaded from: classes.dex */
public final class C0337d {

    /* renamed from: e */
    public static final C0337d f877e = new C0337d(1);

    /* renamed from: f */
    public static final C0337d f878f = new C0337d(2);

    /* renamed from: g */
    public static final C0337d f879g;

    /* renamed from: h */
    public static final C0337d f880h;

    /* renamed from: i */
    public static final C0337d f881i;

    /* renamed from: j */
    public static final C0337d f882j;

    /* renamed from: k */
    public static final C0337d f883k;

    /* renamed from: l */
    public static final C0337d f884l;

    /* renamed from: m */
    public static final C0337d f885m;

    /* renamed from: n */
    public static final C0337d f886n;

    /* renamed from: a */
    public final Object f887a;

    /* renamed from: b */
    public final int f888b;

    /* renamed from: c */
    public final Class f889c;

    /* renamed from: d */
    public final InterfaceC0352s f890d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        new C0337d(4);
        new C0337d(8);
        f879g = new C0337d(16);
        new C0337d(32);
        new C0337d(64);
        new C0337d(128);
        new C0337d(256, AbstractC0345l.class);
        new C0337d(512, AbstractC0345l.class);
        new C0337d(1024, AbstractC0346m.class);
        new C0337d(2048, AbstractC0346m.class);
        f880h = new C0337d(4096);
        f881i = new C0337d(8192);
        new C0337d(16384);
        new C0337d(32768);
        new C0337d(65536);
        new C0337d(131072, AbstractC0350q.class);
        f882j = new C0337d(262144);
        f883k = new C0337d(524288);
        f884l = new C0337d(1048576);
        new C0337d(2097152, AbstractC0351r.class);
        int i2 = Build.VERSION.SDK_INT;
        new C0337d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0337d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0348o.class);
        f885m = new C0337d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0337d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f886n = new C0337d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0337d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (i2 >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new C0337d(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i2 >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new C0337d(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        new C0337d(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i2 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new C0337d(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
        new C0337d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0337d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC0349p.class);
        new C0337d(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC0347n.class);
        if (i2 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new C0337d(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i2 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new C0337d(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new C0337d(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new C0337d(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new C0337d(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i2 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new C0337d(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (i2 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new C0337d(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i2 >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new C0337d(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C0337d(i2 >= 34 ? AbstractC0340g.m975a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C0337d(int i2) {
        this(null, i2, null, null, null);
    }

    /* renamed from: a */
    public final int m961a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f887a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0337d)) {
            return false;
        }
        Object obj2 = ((C0337d) obj).f887a;
        Object obj3 = this.f887a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f887a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String m988d = C0342i.m988d(this.f888b);
        if (m988d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f887a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                m988d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(m988d);
        return sb.toString();
    }

    public C0337d(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public C0337d(Object obj, int i2, String str, InterfaceC0352s interfaceC0352s, Class cls) {
        this.f888b = i2;
        this.f890d = interfaceC0352s;
        if (obj == null) {
            this.f887a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f887a = obj;
        }
        this.f889c = cls;
    }
}
