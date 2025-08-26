package p079f0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;

/* renamed from: f0.X */
/* loaded from: classes.dex */
public abstract class AbstractC0827X {

    /* renamed from: s */
    public static final List f3279s = Collections.EMPTY_LIST;

    /* renamed from: a */
    public final View f3280a;

    /* renamed from: b */
    public WeakReference f3281b;

    /* renamed from: j */
    public int f3289j;

    /* renamed from: r */
    public RecyclerView f3297r;

    /* renamed from: c */
    public int f3282c = -1;

    /* renamed from: d */
    public int f3283d = -1;

    /* renamed from: e */
    public long f3284e = -1;

    /* renamed from: f */
    public int f3285f = -1;

    /* renamed from: g */
    public int f3286g = -1;

    /* renamed from: h */
    public AbstractC0827X f3287h = null;

    /* renamed from: i */
    public AbstractC0827X f3288i = null;

    /* renamed from: k */
    public final ArrayList f3290k = null;

    /* renamed from: l */
    public final List f3291l = null;

    /* renamed from: m */
    public int f3292m = 0;

    /* renamed from: n */
    public C0818N f3293n = null;

    /* renamed from: o */
    public boolean f3294o = false;

    /* renamed from: p */
    public int f3295p = 0;

    /* renamed from: q */
    public int f3296q = -1;

    public AbstractC0827X(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3280a = view;
    }

    /* renamed from: a */
    public final void m2214a(int i2) {
        this.f3289j = i2 | this.f3289j;
    }

    /* renamed from: b */
    public final int m2215b() {
        int i2 = this.f3286g;
        return i2 == -1 ? this.f3282c : i2;
    }

    /* renamed from: c */
    public final List m2216c() {
        ArrayList arrayList;
        return ((this.f3289j & 1024) != 0 || (arrayList = this.f3290k) == null || arrayList.size() == 0) ? f3279s : this.f3291l;
    }

    /* renamed from: d */
    public final boolean m2217d() {
        View view = this.f3280a;
        return (view.getParent() == null || view.getParent() == this.f3297r) ? false : true;
    }

    /* renamed from: e */
    public final boolean m2218e() {
        return (this.f3289j & 1) != 0;
    }

    /* renamed from: f */
    public final boolean m2219f() {
        return (this.f3289j & 4) != 0;
    }

    /* renamed from: g */
    public final boolean m2220g() {
        if ((this.f3289j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        return !this.f3280a.hasTransientState();
    }

    /* renamed from: h */
    public final boolean m2221h() {
        return (this.f3289j & 8) != 0;
    }

    /* renamed from: i */
    public final boolean m2222i() {
        return this.f3293n != null;
    }

    /* renamed from: j */
    public final boolean m2223j() {
        return (this.f3289j & 256) != 0;
    }

    /* renamed from: k */
    public final boolean m2224k() {
        return (this.f3289j & 2) != 0;
    }

    /* renamed from: l */
    public final void m2225l(int i2, boolean z2) {
        if (this.f3283d == -1) {
            this.f3283d = this.f3282c;
        }
        if (this.f3286g == -1) {
            this.f3286g = this.f3282c;
        }
        if (z2) {
            this.f3286g += i2;
        }
        this.f3282c += i2;
        View view = this.f3280a;
        if (view.getLayoutParams() != null) {
            ((C0813I) view.getLayoutParams()).f3233c = true;
        }
    }

    /* renamed from: m */
    public final void m2226m() {
        this.f3289j = 0;
        this.f3282c = -1;
        this.f3283d = -1;
        this.f3284e = -1L;
        this.f3286g = -1;
        this.f3292m = 0;
        this.f3287h = null;
        this.f3288i = null;
        ArrayList arrayList = this.f3290k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f3289j &= -1025;
        this.f3295p = 0;
        this.f3296q = -1;
        RecyclerView.m1801j(this);
    }

    /* renamed from: n */
    public final void m2227n(boolean z2) {
        int i2 = this.f3292m;
        int i3 = z2 ? i2 - 1 : i2 + 1;
        this.f3292m = i3;
        if (i3 < 0) {
            this.f3292m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i3 == 1) {
            this.f3289j |= 16;
        } else if (z2 && i3 == 0) {
            this.f3289j &= -17;
        }
    }

    /* renamed from: o */
    public final boolean m2228o() {
        return (this.f3289j & 128) != 0;
    }

    /* renamed from: p */
    public final boolean m2229p() {
        return (this.f3289j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3282c + " id=" + this.f3284e + ", oldPos=" + this.f3283d + ", pLpos:" + this.f3286g);
        if (m2222i()) {
            sb.append(" scrap ");
            sb.append(this.f3294o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m2219f()) {
            sb.append(" invalid");
        }
        if (!m2218e()) {
            sb.append(" unbound");
        }
        if ((this.f3289j & 2) != 0) {
            sb.append(" update");
        }
        if (m2221h()) {
            sb.append(" removed");
        }
        if (m2228o()) {
            sb.append(" ignored");
        }
        if (m2223j()) {
            sb.append(" tmpDetached");
        }
        if (!m2220g()) {
            sb.append(" not recyclable(" + this.f3292m + ")");
        }
        if ((this.f3289j & 512) != 0 || m2219f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3280a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
