package p027K;

import android.text.TextUtils;
import android.view.View;

/* renamed from: K.z */
/* loaded from: classes.dex */
public final class C0330z extends AbstractC0258B {

    /* renamed from: e */
    public final /* synthetic */ int f868e;

    public C0330z(int i2, Class cls, int i3, int i4, int i5) {
        this.f868e = i5;
        this.f756a = i2;
        this.f759d = cls;
        this.f758c = i3;
        this.f757b = i4;
    }

    @Override // p027K.AbstractC0258B
    /* renamed from: b */
    public final Object mo733b(View view) {
        switch (this.f868e) {
            case 0:
                return Boolean.valueOf(AbstractC0265I.m789d(view));
            case 1:
                return AbstractC0265I.m787b(view);
            default:
                return Boolean.valueOf(AbstractC0265I.m788c(view));
        }
    }

    @Override // p027K.AbstractC0258B
    /* renamed from: c */
    public final void mo734c(View view, Object obj) {
        switch (this.f868e) {
            case 0:
                AbstractC0265I.m795j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC0265I.m793h(view, (CharSequence) obj);
                break;
            default:
                AbstractC0265I.m792g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p027K.AbstractC0258B
    /* renamed from: e */
    public final boolean mo736e(Object obj, Object obj2) {
        switch (this.f868e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
