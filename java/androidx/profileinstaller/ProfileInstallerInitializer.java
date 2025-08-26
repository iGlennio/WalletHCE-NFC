package androidx.profileinstaller;

import android.content.Context;
import androidx.fragment.app.C0651y;
import java.util.Collections;
import java.util.List;
import p002B.RunnableC0024n;
import p074d0.AbstractC0743i;
import p084h0.InterfaceC0888b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0888b {
    @Override // p084h0.InterfaceC0888b
    /* renamed from: a */
    public final List mo1506a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p084h0.InterfaceC0888b
    /* renamed from: b */
    public final Object mo1507b(Context context) {
        AbstractC0743i.m2036a(new RunnableC0024n(this, 1, context.getApplicationContext()));
        return new C0651y(6);
    }
}
