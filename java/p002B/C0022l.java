package p002B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: B.l */
/* loaded from: classes.dex */
public final class C0022l {

    /* renamed from: a */
    public final ColorStateList f49a;

    /* renamed from: b */
    public final Configuration f50b;

    /* renamed from: c */
    public final int f51c;

    public C0022l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f49a = colorStateList;
        this.f50b = configuration;
        this.f51c = theme == null ? 0 : theme.hashCode();
    }
}
