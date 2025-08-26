package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public final class EnumC0678m {

    /* renamed from: a */
    public static final EnumC0678m f2314a;

    /* renamed from: b */
    public static final EnumC0678m f2315b;

    /* renamed from: c */
    public static final EnumC0678m f2316c;

    /* renamed from: d */
    public static final EnumC0678m f2317d;

    /* renamed from: e */
    public static final EnumC0678m f2318e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC0678m[] f2319f;

    static {
        EnumC0678m enumC0678m = new EnumC0678m("DESTROYED", 0);
        f2314a = enumC0678m;
        EnumC0678m enumC0678m2 = new EnumC0678m("INITIALIZED", 1);
        f2315b = enumC0678m2;
        EnumC0678m enumC0678m3 = new EnumC0678m("CREATED", 2);
        f2316c = enumC0678m3;
        EnumC0678m enumC0678m4 = new EnumC0678m("STARTED", 3);
        f2317d = enumC0678m4;
        EnumC0678m enumC0678m5 = new EnumC0678m("RESUMED", 4);
        f2318e = enumC0678m5;
        f2319f = new EnumC0678m[]{enumC0678m, enumC0678m2, enumC0678m3, enumC0678m4, enumC0678m5};
    }

    public static EnumC0678m valueOf(String str) {
        return (EnumC0678m) Enum.valueOf(EnumC0678m.class, str);
    }

    public static EnumC0678m[] values() {
        return (EnumC0678m[]) f2319f.clone();
    }
}
