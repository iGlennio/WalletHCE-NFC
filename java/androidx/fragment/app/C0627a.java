package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0627a implements InterfaceC0613C {

    /* renamed from: a */
    public final ArrayList f2123a;

    /* renamed from: b */
    public int f2124b;

    /* renamed from: c */
    public int f2125c;

    /* renamed from: d */
    public int f2126d;

    /* renamed from: e */
    public int f2127e;

    /* renamed from: f */
    public int f2128f;

    /* renamed from: g */
    public boolean f2129g;

    /* renamed from: h */
    public String f2130h;

    /* renamed from: i */
    public int f2131i;

    /* renamed from: j */
    public CharSequence f2132j;

    /* renamed from: k */
    public int f2133k;

    /* renamed from: l */
    public CharSequence f2134l;

    /* renamed from: m */
    public ArrayList f2135m;

    /* renamed from: n */
    public ArrayList f2136n;

    /* renamed from: o */
    public boolean f2137o;

    /* renamed from: p */
    public final C0615E f2138p;

    /* renamed from: q */
    public boolean f2139q;

    /* renamed from: r */
    public int f2140r;

    public C0627a(C0615E c0615e) {
        c0615e.m1562B();
        C0644r c0644r = c0615e.f2049n;
        if (c0644r != null) {
            c0644r.f2250i.getClassLoader();
        }
        this.f2123a = new ArrayList();
        this.f2137o = false;
        this.f2140r = -1;
        this.f2138p = c0615e;
    }

    @Override // androidx.fragment.app.InterfaceC0613C
    /* renamed from: a */
    public final boolean mo1555a(ArrayList arrayList, ArrayList arrayList2) {
        if (C0615E.m1556E(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2129g) {
            return true;
        }
        C0615E c0615e = this.f2138p;
        if (c0615e.f2039d == null) {
            c0615e.f2039d = new ArrayList();
        }
        c0615e.f2039d.add(this);
        return true;
    }

    /* renamed from: b */
    public final void m1634b(C0621K c0621k) {
        this.f2123a.add(c0621k);
        c0621k.f2101c = this.f2124b;
        c0621k.f2102d = this.f2125c;
        c0621k.f2103e = this.f2126d;
        c0621k.f2104f = this.f2127e;
    }

    /* renamed from: c */
    public final void m1635c(int i2) {
        if (this.f2129g) {
            if (C0615E.m1556E(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f2123a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0621K c0621k = (C0621K) arrayList.get(i3);
                AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0621k.f2100b;
                if (abstractComponentCallbacksC0641o != null) {
                    abstractComponentCallbacksC0641o.f2235q += i2;
                    if (C0615E.m1556E(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0621k.f2100b + " to " + c0621k.f2100b.f2235q);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void m1636d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2130h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2140r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2139q);
            if (this.f2128f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2128f));
            }
            if (this.f2124b != 0 || this.f2125c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2124b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2125c));
            }
            if (this.f2126d != 0 || this.f2127e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2126d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2127e));
            }
            if (this.f2131i != 0 || this.f2132j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2131i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2132j);
            }
            if (this.f2133k != 0 || this.f2134l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2133k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2134l);
            }
        }
        ArrayList arrayList = this.f2123a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0621K c0621k = (C0621K) arrayList.get(i2);
            switch (c0621k.f2099a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0621k.f2099a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0621k.f2100b);
            if (z2) {
                if (c0621k.f2101c != 0 || c0621k.f2102d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0621k.f2101c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0621k.f2102d));
                }
                if (c0621k.f2103e != 0 || c0621k.f2104f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0621k.f2103e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0621k.f2104f));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2140r >= 0) {
            sb.append(" #");
            sb.append(this.f2140r);
        }
        if (this.f2130h != null) {
            sb.append(" ");
            sb.append(this.f2130h);
        }
        sb.append("}");
        return sb.toString();
    }
}
