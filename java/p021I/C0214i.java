package p021I;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: I.i */
/* loaded from: classes.dex */
public final class C0214i {

    /* renamed from: a */
    public final boolean f594a;

    /* renamed from: b */
    public final Object f595b;

    public C0214i(C0213h c0213h, boolean z2) {
        this.f595b = c0213h;
        this.f594a = z2;
    }

    /* renamed from: a */
    public boolean m617a() {
        return this.f594a;
    }

    /* renamed from: b */
    public boolean m618b(CharSequence charSequence, int i2) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (((C0213h) this.f595b) == null) {
            return m617a();
        }
        char c2 = 2;
        for (int i3 = 0; i3 < i2 && c2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            C0214i c0214i = AbstractC0215j.f596a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return m617a();
        }
        return false;
    }

    public C0214i(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f595b = bottomSheetBehavior;
        this.f594a = z2;
    }
}
