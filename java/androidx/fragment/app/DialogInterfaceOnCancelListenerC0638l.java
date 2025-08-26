package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0688w;
import androidx.lifecycle.C0689x;
import com.nfupay.s145.R;
import java.io.PrintWriter;
import p005C.AbstractC0044g;
import p005C.C0046i;
import p043P0.RunnableC0402A;
import p047Q1.AbstractC0458e;
import p076e.AbstractActivityC0782f;
import p095l1.AbstractC1136c;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0638l extends AbstractComponentCallbacksC0641o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: R */
    public final DialogInterfaceOnCancelListenerC0635i f2177R;

    /* renamed from: S */
    public final DialogInterfaceOnDismissListenerC0636j f2178S;

    /* renamed from: T */
    public int f2179T;

    /* renamed from: U */
    public int f2180U;

    /* renamed from: V */
    public boolean f2181V;

    /* renamed from: W */
    public boolean f2182W;

    /* renamed from: X */
    public int f2183X;

    /* renamed from: Y */
    public boolean f2184Y;

    /* renamed from: Z */
    public final C0046i f2185Z;

    /* renamed from: a0 */
    public Dialog f2186a0;

    /* renamed from: b0 */
    public boolean f2187b0;

    /* renamed from: c0 */
    public boolean f2188c0;

    /* renamed from: d0 */
    public boolean f2189d0;

    public DialogInterfaceOnCancelListenerC0638l() {
        new RunnableC0402A(6, this);
        this.f2177R = new DialogInterfaceOnCancelListenerC0635i(this);
        this.f2178S = new DialogInterfaceOnDismissListenerC0636j(this);
        this.f2179T = 0;
        this.f2180U = 0;
        this.f2181V = true;
        this.f2182W = true;
        this.f2183X = -1;
        this.f2185Z = new C0046i(17, this);
        this.f2189d0 = false;
    }

    /* renamed from: A */
    public Dialog mo1652A() {
        if (C0615E.m1556E(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m1671w(), this.f2180U);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: e */
    public final AbstractC0458e mo1653e() {
        return new C0637k(this, new C0639m(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: l */
    public final void mo1654l(AbstractActivityC0782f abstractActivityC0782f) {
        super.mo1654l(abstractActivityC0782f);
        this.f2216N.m1713d(this.f2185Z);
        this.f2188c0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: m */
    public void mo1655m(Bundle bundle) {
        super.mo1655m(bundle);
        new Handler();
        this.f2182W = this.f2241w == 0;
        if (bundle != null) {
            this.f2179T = bundle.getInt("android:style", 0);
            this.f2180U = bundle.getInt("android:theme", 0);
            this.f2181V = bundle.getBoolean("android:cancelable", true);
            this.f2182W = bundle.getBoolean("android:showsDialog", this.f2182W);
            this.f2183X = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: o */
    public final void mo1656o() {
        this.f2205C = true;
        Dialog dialog = this.f2186a0;
        if (dialog != null) {
            this.f2187b0 = true;
            dialog.setOnDismissListener(null);
            this.f2186a0.dismiss();
            if (!this.f2188c0) {
                onDismiss(this.f2186a0);
            }
            this.f2186a0 = null;
            this.f2189d0 = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2187b0) {
            return;
        }
        if (C0615E.m1556E(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f2188c0) {
            return;
        }
        this.f2188c0 = true;
        Dialog dialog = this.f2186a0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2186a0.dismiss();
        }
        this.f2187b0 = true;
        if (this.f2183X >= 0) {
            C0615E m1668j = m1668j();
            int i2 = this.f2183X;
            if (i2 < 0) {
                throw new IllegalArgumentException(AbstractC0044g.m153e("Bad id: ", i2));
            }
            m1668j.m1601v(new C0614D(m1668j, i2), false);
            this.f2183X = -1;
            return;
        }
        C0627a c0627a = new C0627a(m1668j());
        C0615E c0615e = this.f2236r;
        if (c0615e != null && c0615e != c0627a.f2138p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0627a.m1634b(new C0621K(3, this));
        if (c0627a.f2139q) {
            throw new IllegalStateException("commit already called");
        }
        if (C0615E.m1556E(2)) {
            Log.v("FragmentManager", "Commit: " + c0627a);
            PrintWriter printWriter = new PrintWriter(new C0623M());
            c0627a.m1636d("  ", printWriter, true);
            printWriter.close();
        }
        c0627a.f2139q = true;
        boolean z2 = c0627a.f2129g;
        C0615E c0615e2 = c0627a.f2138p;
        if (z2) {
            c0627a.f2140r = c0615e2.f2044i.getAndIncrement();
        } else {
            c0627a.f2140r = -1;
        }
        c0615e2.m1601v(c0627a, true);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: p */
    public final void mo1657p() {
        this.f2205C = true;
        if (!this.f2188c0) {
            this.f2188c0 = true;
        }
        C0046i c0046i = this.f2185Z;
        C0689x c0689x = this.f2216N;
        c0689x.getClass();
        C0689x.m1710a("removeObserver");
        AbstractC0688w abstractC0688w = (AbstractC0688w) c0689x.f2339b.mo2620b(c0046i);
        if (abstractC0688w == null) {
            return;
        }
        abstractC0688w.mo1692d();
        abstractC0688w.m1709c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0044, B:21:0x004e, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0066), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater mo1658q(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.mo1658q(r8)
            boolean r0 = r7.f2182W
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.f2184Y
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.f2189d0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f2184Y = r3     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.mo1652A()     // Catch: java.lang.Throwable -> L4c
            r7.f2186a0 = r4     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f2182W     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L66
            int r5 = r7.f2179T     // Catch: java.lang.Throwable -> L4c
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4c
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4c
        L3e:
            android.content.Context r4 = r7.m1666h()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r5 = r7.f2186a0     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r4 = r7.f2186a0     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f2181V     // Catch: java.lang.Throwable -> L4c
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f2186a0     // Catch: java.lang.Throwable -> L4c
            androidx.fragment.app.i r5 = r7.f2177R     // Catch: java.lang.Throwable -> L4c
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f2186a0     // Catch: java.lang.Throwable -> L4c
            androidx.fragment.app.j r5 = r7.f2178S     // Catch: java.lang.Throwable -> L4c
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4c
            r7.f2189d0 = r3     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r3 = 0
            r7.f2186a0 = r3     // Catch: java.lang.Throwable -> L4c
        L69:
            r7.f2184Y = r0
            goto L6f
        L6c:
            r7.f2184Y = r0
            throw r8
        L6f:
            boolean r0 = androidx.fragment.app.C0615E.m1556E(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r0 = r7.f2186a0
            if (r0 == 0) goto Ld3
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L98:
            boolean r0 = androidx.fragment.app.C0615E.m1556E(r2)
            if (r0 == 0) goto Ld3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f2182W
            if (r2 != 0) goto Lc2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r8
        Lc2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l.mo1658q(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: r */
    public void mo1659r(Bundle bundle) {
        Dialog dialog = this.f2186a0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.f2179T;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.f2180U;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z2 = this.f2181V;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f2182W;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i4 = this.f2183X;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: s */
    public void mo1660s() {
        this.f2205C = true;
        Dialog dialog = this.f2186a0;
        if (dialog != null) {
            this.f2187b0 = false;
            dialog.show();
            View decorView = this.f2186a0.getWindow().getDecorView();
            AbstractC1136c.m2637e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: t */
    public void mo1661t() {
        this.f2205C = true;
        Dialog dialog = this.f2186a0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: u */
    public final void mo1662u(Bundle bundle) {
        Bundle bundle2;
        this.f2205C = true;
        if (this.f2186a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2186a0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: v */
    public final void mo1663v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1663v(layoutInflater, viewGroup, bundle);
        if (this.f2207E != null || this.f2186a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2186a0.onRestoreInstanceState(bundle2);
    }
}
