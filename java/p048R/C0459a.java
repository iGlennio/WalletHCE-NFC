package p048R;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import p088j.ViewOnClickListenerC0995g1;

/* renamed from: R.a */
/* loaded from: classes.dex */
public final class C0459a extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ ViewOnClickListenerC0995g1 f1259a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0459a(ViewOnClickListenerC0995g1 viewOnClickListenerC0995g1) {
        super(new Handler());
        this.f1259a = viewOnClickListenerC0995g1;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        ViewOnClickListenerC0995g1 viewOnClickListenerC0995g1 = this.f1259a;
        if (!viewOnClickListenerC0995g1.f1263b || (cursor = viewOnClickListenerC0995g1.f1264c) == null || cursor.isClosed()) {
            return;
        }
        viewOnClickListenerC0995g1.f1262a = viewOnClickListenerC0995g1.f1264c.requery();
    }
}
