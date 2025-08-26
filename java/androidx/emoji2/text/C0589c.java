package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p034M0.C0360e;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public final class C0589c extends C0360e {
    @Override // p034M0.C0360e
    /* renamed from: i */
    public final Signature[] mo1016i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
