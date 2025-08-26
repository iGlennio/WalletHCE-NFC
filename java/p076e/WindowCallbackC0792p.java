package p076e;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p083h.AbstractC0884l;
import p083h.AbstractC0885m;
import p083h.AbstractC0886n;
import p086i.MenuC0907l;

/* renamed from: e.p */
/* loaded from: classes.dex */
public final class WindowCallbackC0792p implements Window.Callback {

    /* renamed from: a */
    public final Window.Callback f3104a;

    /* renamed from: b */
    public boolean f3105b;

    /* renamed from: c */
    public boolean f3106c;

    /* renamed from: d */
    public boolean f3107d;

    /* renamed from: e */
    public final /* synthetic */ LayoutInflaterFactory2C0797u f3108e;

    public WindowCallbackC0792p(LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u, Window.Callback callback) {
        this.f3108e = layoutInflaterFactory2C0797u;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f3104a = callback;
    }

    /* renamed from: a */
    public final void m2124a(Window.Callback callback) {
        try {
            this.f3105b = true;
            callback.onContentChanged();
        } finally {
            this.f3105b = false;
        }
    }

    /* renamed from: b */
    public final boolean m2125b(int i2, Menu menu) {
        return this.f3104a.onMenuOpened(i2, menu);
    }

    /* renamed from: c */
    public final void m2126c(int i2, Menu menu) {
        this.f3104a.onPanelClosed(i2, menu);
    }

    /* renamed from: d */
    public final void m2127d(List list, Menu menu, int i2) {
        AbstractC0885m.m2303a(this.f3104a, list, menu, i2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f3104a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f3106c;
        Window.Callback callback = this.f3104a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f3108e.m2144u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f3104a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            e.u r2 = r6.f3108e
            r2.m2130A()
            e.H r3 = r2.f3173o
            r4 = 0
            if (r3 == 0) goto L3d
            e.G r3 = r3.f3037v
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            i.l r3 = r3.f3012d
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            e.t r0 = r2.f3147M
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.m2135F(r0, r3, r7)
            if (r0 == 0) goto L52
            e.t r7 = r2.f3147M
            if (r7 == 0) goto L3b
            r7.f3126l = r1
            goto L3b
        L52:
            e.t r0 = r2.f3147M
            if (r0 != 0) goto L6a
            e.t r0 = r2.m2149z(r4)
            r2.m2136G(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.m2135F(r0, r3, r7)
            r0.f3125k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.WindowCallbackC0792p.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f3104a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f3104a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f3104a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f3104a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f3104a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f3104a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f3105b) {
            this.f3104a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof MenuC0907l)) {
            return this.f3104a.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i2) {
        return this.f3104a.onCreatePanelView(i2);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f3104a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f3104a.onMenuItemSelected(i2, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i2, Menu menu) {
        m2125b(i2, menu);
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = this.f3108e;
        if (i2 != 108) {
            layoutInflaterFactory2C0797u.getClass();
            return true;
        }
        layoutInflaterFactory2C0797u.m2130A();
        C0776H c0776h = layoutInflaterFactory2C0797u.f3173o;
        if (c0776h != null && true != c0776h.f3040y) {
            c0776h.f3040y = true;
            ArrayList arrayList = c0776h.f3041z;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        if (this.f3107d) {
            this.f3104a.onPanelClosed(i2, menu);
            return;
        }
        m2126c(i2, menu);
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = this.f3108e;
        if (i2 != 108) {
            if (i2 != 0) {
                layoutInflaterFactory2C0797u.getClass();
                return;
            }
            C0796t m2149z = layoutInflaterFactory2C0797u.m2149z(i2);
            if (m2149z.f3127m) {
                layoutInflaterFactory2C0797u.m2143s(m2149z, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0797u.m2130A();
        C0776H c0776h = layoutInflaterFactory2C0797u.f3173o;
        if (c0776h == null || !c0776h.f3040y) {
            return;
        }
        c0776h.f3040y = false;
        ArrayList arrayList = c0776h.f3041z;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        AbstractC0886n.m2304a(this.f3104a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        MenuC0907l menuC0907l = menu instanceof MenuC0907l ? (MenuC0907l) menu : null;
        if (i2 == 0 && menuC0907l == null) {
            return false;
        }
        if (menuC0907l != null) {
            menuC0907l.f3686x = true;
        }
        boolean onPreparePanel = this.f3104a.onPreparePanel(i2, view, menu);
        if (menuC0907l != null) {
            menuC0907l.f3686x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        MenuC0907l menuC0907l = this.f3108e.m2149z(0).f3122h;
        if (menuC0907l != null) {
            m2127d(list, menuC0907l, i2);
        } else {
            m2127d(list, menu, i2);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC0884l.m2301a(this.f3104a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f3104a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f3104a.onWindowFocusChanged(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r9, int r10) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.WindowCallbackC0792p.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f3104a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
