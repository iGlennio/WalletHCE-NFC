package p086i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0000a;
import p027K.AbstractC0274S;
import p027K.AbstractC0276U;

/* renamed from: i.l */
/* loaded from: classes.dex */
public class MenuC0907l implements Menu {

    /* renamed from: y */
    public static final int[] f3662y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f3663a;

    /* renamed from: b */
    public final Resources f3664b;

    /* renamed from: c */
    public boolean f3665c;

    /* renamed from: d */
    public final boolean f3666d;

    /* renamed from: e */
    public InterfaceC0905j f3667e;

    /* renamed from: f */
    public final ArrayList f3668f;

    /* renamed from: g */
    public final ArrayList f3669g;

    /* renamed from: h */
    public boolean f3670h;

    /* renamed from: i */
    public final ArrayList f3671i;

    /* renamed from: j */
    public final ArrayList f3672j;

    /* renamed from: k */
    public boolean f3673k;

    /* renamed from: m */
    public CharSequence f3675m;

    /* renamed from: n */
    public Drawable f3676n;

    /* renamed from: o */
    public View f3677o;

    /* renamed from: v */
    public C0909n f3684v;

    /* renamed from: x */
    public boolean f3686x;

    /* renamed from: l */
    public int f3674l = 0;

    /* renamed from: p */
    public boolean f3678p = false;

    /* renamed from: q */
    public boolean f3679q = false;

    /* renamed from: r */
    public boolean f3680r = false;

    /* renamed from: s */
    public boolean f3681s = false;

    /* renamed from: t */
    public final ArrayList f3682t = new ArrayList();

    /* renamed from: u */
    public final CopyOnWriteArrayList f3683u = new CopyOnWriteArrayList();

    /* renamed from: w */
    public boolean f3685w = false;

    public MenuC0907l(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f3663a = context;
        Resources resources = context.getResources();
        this.f3664b = resources;
        this.f3668f = new ArrayList();
        this.f3669g = new ArrayList();
        this.f3670h = true;
        this.f3671i = new ArrayList();
        this.f3672j = new ArrayList();
        this.f3673k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0276U.f774a;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = AbstractC0274S.m828b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f3666d = z3;
    }

    /* renamed from: a */
    public final C0909n m2337a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f3662y[i6] << 16) | (65535 & i4);
        C0909n c0909n = new C0909n(this, i2, i3, i4, i7, charSequence, this.f3674l);
        ArrayList arrayList = this.f3668f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((C0909n) arrayList.get(size)).f3696d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, c0909n);
        mo492p(true);
        return c0909n;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m2337a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f3663a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0909n m2337a = m2337a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            m2337a.setIcon(resolveInfo.loadIcon(packageManager));
            m2337a.f3699g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = m2337a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m2338b(InterfaceC0920y interfaceC0920y, Context context) {
        this.f3683u.add(new WeakReference(interfaceC0920y));
        interfaceC0920y.mo487h(context, this);
        this.f3673k = true;
    }

    /* renamed from: c */
    public final void m2339c(boolean z2) {
        if (this.f3681s) {
            return;
        }
        this.f3681s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3683u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0920y interfaceC0920y = (InterfaceC0920y) weakReference.get();
            if (interfaceC0920y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0920y.mo482a(this, z2);
            }
        }
        this.f3681s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0909n c0909n = this.f3684v;
        if (c0909n != null) {
            mo2320d(c0909n);
        }
        this.f3668f.clear();
        mo492p(true);
    }

    public final void clearHeader() {
        this.f3676n = null;
        this.f3675m = null;
        this.f3677o = null;
        mo492p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m2339c(true);
    }

    /* renamed from: d */
    public boolean mo2320d(C0909n c0909n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3683u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3684v == c0909n) {
            m2350w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0920y interfaceC0920y = (InterfaceC0920y) weakReference.get();
                if (interfaceC0920y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0920y.mo485e(c0909n);
                    if (z2) {
                        break;
                    }
                }
            }
            m2349v();
            if (z2) {
                this.f3684v = null;
            }
        }
        return z2;
    }

    /* renamed from: e */
    public boolean mo2321e(MenuC0907l menuC0907l, MenuItem menuItem) {
        InterfaceC0905j interfaceC0905j = this.f3667e;
        return interfaceC0905j != null && interfaceC0905j.mo176l(menuC0907l, menuItem);
    }

    /* renamed from: f */
    public boolean mo2322f(C0909n c0909n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3683u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m2350w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0920y interfaceC0920y = (InterfaceC0920y) weakReference.get();
            if (interfaceC0920y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0920y.mo489l(c0909n);
                if (z2) {
                    break;
                }
            }
        }
        m2349v();
        if (z2) {
            this.f3684v = c0909n;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f3668f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0909n c0909n = (C0909n) arrayList.get(i3);
            if (c0909n.f3693a == i2) {
                return c0909n;
            }
            if (c0909n.hasSubMenu() && (findItem = c0909n.f3707o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C0909n m2340g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3682t;
        arrayList.clear();
        m2341h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0909n) arrayList.get(0);
        }
        boolean mo2326n = mo2326n();
        for (int i3 = 0; i3 < size; i3++) {
            C0909n c0909n = (C0909n) arrayList.get(i3);
            char c2 = mo2326n ? c0909n.f3702j : c0909n.f3700h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (mo2326n && c2 == '\b' && i2 == 67))) {
                return c0909n;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f3668f.get(i2);
    }

    /* renamed from: h */
    public final void m2341h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        boolean mo2326n = mo2326n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f3668f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0909n c0909n = (C0909n) arrayList2.get(i3);
                if (c0909n.hasSubMenu()) {
                    c0909n.f3707o.m2341h(arrayList, i2, keyEvent);
                }
                char c2 = mo2326n ? c0909n.f3702j : c0909n.f3700h;
                if ((modifiers & 69647) == ((mo2326n ? c0909n.f3703k : c0909n.f3701i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (mo2326n && c2 == '\b' && i2 == 67)) && c0909n.isEnabled()) {
                        arrayList.add(c0909n);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3686x) {
            return true;
        }
        ArrayList arrayList = this.f3668f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0909n) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m2342i() {
        ArrayList m2343l = m2343l();
        if (this.f3673k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3683u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0920y interfaceC0920y = (InterfaceC0920y) weakReference.get();
                if (interfaceC0920y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0920y.mo486g();
                }
            }
            ArrayList arrayList = this.f3671i;
            ArrayList arrayList2 = this.f3672j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = m2343l.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0909n c0909n = (C0909n) m2343l.get(i2);
                    if ((c0909n.f3716x & 32) == 32) {
                        arrayList.add(c0909n);
                    } else {
                        arrayList2.add(c0909n);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m2343l());
            }
            this.f3673k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return m2340g(i2, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo2323j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: l */
    public final ArrayList m2343l() {
        boolean z2 = this.f3670h;
        ArrayList arrayList = this.f3669g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3668f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0909n c0909n = (C0909n) arrayList2.get(i2);
            if (c0909n.isVisible()) {
                arrayList.add(c0909n);
            }
        }
        this.f3670h = false;
        this.f3673k = true;
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo2325m() {
        return this.f3685w;
    }

    /* renamed from: n */
    public boolean mo2326n() {
        return this.f3665c;
    }

    /* renamed from: o */
    public boolean mo2327o() {
        return this.f3666d;
    }

    /* renamed from: p */
    public void mo492p(boolean z2) {
        if (this.f3678p) {
            this.f3679q = true;
            if (z2) {
                this.f3680r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f3670h = true;
            this.f3673k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3683u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m2350w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0920y interfaceC0920y = (InterfaceC0920y) weakReference.get();
            if (interfaceC0920y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0920y.mo483c();
            }
        }
        m2349v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return m2344q(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        C0909n m2340g = m2340g(i2, keyEvent);
        boolean m2344q = m2340g != null ? m2344q(m2340g, null, i3) : false;
        if ((i3 & 2) != 0) {
            m2339c(true);
        }
        return m2344q;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2344q(android.view.MenuItem r7, p086i.InterfaceC0920y r8, int r9) {
        /*
            r6 = this;
            i.n r7 = (p086i.C0909n) r7
            r0 = 0
            if (r7 == 0) goto Ld4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld4
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f3708p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            i.l r1 = r7.f3706n
            boolean r3 = r1.mo2321e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f3699g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f3663a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            i.o r1 = r7.f3690A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f3719a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            i.o r3 = r7.f3690A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f3719a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.m2353e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld3
            r6.m2339c(r2)
            goto Ld3
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld3
            r6.m2339c(r2)
            goto Ld3
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.m2339c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            i.E r9 = new i.E
            android.content.Context r5 = r6.f3663a
            r9.<init>(r5, r6, r7)
            r7.f3707o = r9
            java.lang.CharSequence r5 = r7.f3697e
            r9.setHeaderTitle(r5)
        L90:
            i.E r7 = r7.f3707o
            if (r4 == 0) goto L9b
            i.s r9 = r3.f3720b
            android.view.ActionProvider r9 = r3.f3719a
            r9.onPrepareSubMenu(r7)
        L9b:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f3683u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La4
            goto Lcd
        La4:
            if (r8 == 0) goto Laa
            boolean r0 = r8.mo491n(r7)
        Laa:
            java.util.Iterator r8 = r9.iterator()
        Lae:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lcd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            i.y r4 = (p086i.InterfaceC0920y) r4
            if (r4 != 0) goto Lc6
            r9.remove(r3)
            goto Lae
        Lc6:
            if (r0 != 0) goto Lae
            boolean r0 = r4.mo491n(r7)
            goto Lae
        Lcd:
            r1 = r1 | r0
            if (r1 != 0) goto Ld3
            r6.m2339c(r2)
        Ld3:
            return r1
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086i.MenuC0907l.m2344q(android.view.MenuItem, i.y, int):boolean");
    }

    /* renamed from: r */
    public final void m2345r(InterfaceC0920y interfaceC0920y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3683u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0920y interfaceC0920y2 = (InterfaceC0920y) weakReference.get();
            if (interfaceC0920y2 == null || interfaceC0920y2 == interfaceC0920y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f3668f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C0909n) arrayList.get(i4)).f3694b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((C0909n) arrayList.get(i4)).f3694b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f3668f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            mo492p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f3668f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0909n) arrayList.get(i3)).f3693a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f3668f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            mo492p(true);
        }
    }

    /* renamed from: s */
    public final void m2346s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2323j());
        int size = this.f3668f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0895E) item.getSubMenu()).m2346s(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (findItem = findItem(i3)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f3668f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0909n c0909n = (C0909n) arrayList.get(i3);
            if (c0909n.f3694b == i2) {
                c0909n.m2354f(z3);
                c0909n.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3685w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f3668f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0909n c0909n = (C0909n) arrayList.get(i3);
            if (c0909n.f3694b == i2) {
                c0909n.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f3668f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0909n c0909n = (C0909n) arrayList.get(i3);
            if (c0909n.f3694b == i2) {
                int i4 = c0909n.f3716x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                c0909n.f3716x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            mo492p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f3665c = z2;
        mo492p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3668f.size();
    }

    /* renamed from: t */
    public final void m2347t(Bundle bundle) {
        int size = this.f3668f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0895E) item.getSubMenu()).m2347t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2323j(), sparseArray);
        }
    }

    /* renamed from: u */
    public final void m2348u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f3677o = view;
            this.f3675m = null;
            this.f3676n = null;
        } else {
            if (i2 > 0) {
                this.f3675m = this.f3664b.getText(i2);
            } else if (charSequence != null) {
                this.f3675m = charSequence;
            }
            if (i3 > 0) {
                this.f3676n = AbstractC0000a.m1b(this.f3663a, i3);
            } else if (drawable != null) {
                this.f3676n = drawable;
            }
            this.f3677o = null;
        }
        mo492p(false);
    }

    /* renamed from: v */
    public final void m2349v() {
        this.f3678p = false;
        if (this.f3679q) {
            this.f3679q = false;
            mo492p(this.f3680r);
        }
    }

    /* renamed from: w */
    public final void m2350w() {
        if (this.f3678p) {
            return;
        }
        this.f3678p = true;
        this.f3679q = false;
        this.f3680r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m2337a(0, 0, 0, this.f3664b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f3664b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m2337a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C0909n m2337a = m2337a(i2, i3, i4, charSequence);
        SubMenuC0895E subMenuC0895E = new SubMenuC0895E(this.f3663a, this, m2337a);
        m2337a.f3707o = subMenuC0895E;
        subMenuC0895E.setHeaderTitle(m2337a.f3697e);
        return subMenuC0895E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m2337a(i2, i3, i4, this.f3664b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f3664b.getString(i5));
    }

    /* renamed from: k */
    public MenuC0907l mo2324k() {
        return this;
    }
}
