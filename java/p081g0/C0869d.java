package p081g0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import p008D.AbstractC0087a;
import p045Q.AbstractC0436c;
import p088j.C1029s;
import p093l.C1127c;
import p093l.C1130f;

/* renamed from: g0.d */
/* loaded from: classes.dex */
public final class C0869d {

    /* renamed from: a */
    public boolean f3497a;

    /* renamed from: b */
    public boolean f3498b;

    /* renamed from: c */
    public boolean f3499c;

    /* renamed from: d */
    public final Object f3500d;

    /* renamed from: e */
    public Parcelable f3501e;

    /* renamed from: f */
    public Object f3502f;

    public /* synthetic */ C0869d(TextView textView) {
        this.f3501e = null;
        this.f3502f = null;
        this.f3497a = false;
        this.f3498b = false;
        this.f3500d = textView;
    }

    /* renamed from: a */
    public void m2287a() {
        CompoundButton compoundButton = (CompoundButton) this.f3500d;
        Drawable m1129a = AbstractC0436c.m1129a(compoundButton);
        if (m1129a != null) {
            if (this.f3497a || this.f3498b) {
                Drawable mutate = m1129a.mutate();
                if (this.f3497a) {
                    AbstractC0087a.m305h(mutate, (ColorStateList) this.f3501e);
                }
                if (this.f3498b) {
                    AbstractC0087a.m306i(mutate, (PorterDuff.Mode) this.f3502f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public void m2288b() {
        C1029s c1029s = (C1029s) this.f3500d;
        Drawable checkMarkDrawable = c1029s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3497a || this.f3498b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f3497a) {
                    AbstractC0087a.m305h(mutate, (ColorStateList) this.f3501e);
                }
                if (this.f3498b) {
                    AbstractC0087a.m306i(mutate, (PorterDuff.Mode) this.f3502f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c1029s.getDrawableState());
                }
                c1029s.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* renamed from: c */
    public Bundle m2289c(String str) {
        if (!this.f3498b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f3501e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f3501e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f3501e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f3501e = null;
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2290d(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f3500d
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.content.Context r0 = r1.getContext()
            int[] r3 = p073d.AbstractC0734a.f2923m
            G0.h r7 = p017G0.C0176h.m519B(r0, r9, r3, r10)
            java.lang.Object r0 = r7.f516c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.f516c
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            p027K.AbstractC0272P.m822l(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r10 == 0) goto L3e
            int r9 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L3e
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            android.graphics.drawable.Drawable r9 = p010D1.AbstractC0104l.m415w(r10, r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            goto L55
        L3b:
            r0 = move-exception
            r9 = r0
            goto L7b
        L3e:
            boolean r9 = r0.hasValue(r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            int r9 = r0.getResourceId(r2, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b
            android.graphics.drawable.Drawable r9 = p010D1.AbstractC0104l.m415w(r10, r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b
        L55:
            r9 = 2
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L63
            android.content.res.ColorStateList r9 = r7.m541p(r9)     // Catch: java.lang.Throwable -> L3b
            p045Q.AbstractC0435b.m1127c(r1, r9)     // Catch: java.lang.Throwable -> L3b
        L63:
            r9 = 3
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L77
            r10 = -1
            int r9 = r0.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = p088j.AbstractC1027r0.m2516b(r9, r10)     // Catch: java.lang.Throwable -> L3b
            p045Q.AbstractC0435b.m1128d(r1, r9)     // Catch: java.lang.Throwable -> L3b
        L77:
            r7.m523E()
            return
        L7b:
            r7.m523E()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p081g0.C0869d.m2290d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public void m2291e(String str, InterfaceC0868c interfaceC0868c) {
        Object obj;
        C1130f c1130f = (C1130f) this.f3500d;
        C1127c mo2619a = c1130f.mo2619a(str);
        if (mo2619a != null) {
            obj = mo2619a.f4314b;
        } else {
            C1127c c1127c = new C1127c(str, interfaceC0868c);
            c1130f.f4323d++;
            C1127c c1127c2 = c1130f.f4321b;
            if (c1127c2 == null) {
                c1130f.f4320a = c1127c;
                c1130f.f4321b = c1127c;
            } else {
                c1127c2.f4315c = c1127c;
                c1127c.f4316d = c1127c2;
                c1130f.f4321b = c1127c;
            }
            obj = null;
        }
        if (((InterfaceC0868c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public C0869d() {
        this.f3500d = new C1130f();
        this.f3499c = true;
    }
}
