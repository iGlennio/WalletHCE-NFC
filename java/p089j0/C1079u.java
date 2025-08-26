package p089j0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p005C.AbstractC0044g;

/* renamed from: j0.u */
/* loaded from: classes.dex */
public final class C1079u {

    /* renamed from: b */
    public final View f4220b;

    /* renamed from: a */
    public final HashMap f4219a = new HashMap();

    /* renamed from: c */
    public final ArrayList f4221c = new ArrayList();

    public C1079u(View view) {
        this.f4220b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1079u)) {
            return false;
        }
        C1079u c1079u = (C1079u) obj;
        return this.f4220b == c1079u.f4220b && this.f4219a.equals(c1079u.f4219a);
    }

    public final int hashCode() {
        return this.f4219a.hashCode() + (this.f4220b.hashCode() * 31);
    }

    public final String toString() {
        String m154f = AbstractC0044g.m154f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4220b + "\n", "    values:");
        HashMap hashMap = this.f4219a;
        for (String str : hashMap.keySet()) {
            m154f = m154f + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return m154f;
    }
}
