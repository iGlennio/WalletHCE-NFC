package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public final class EnumC0677l {
    private static final /* synthetic */ EnumC0677l[] $VALUES;
    public static final C0675j Companion;
    public static final EnumC0677l ON_ANY;
    public static final EnumC0677l ON_CREATE;
    public static final EnumC0677l ON_DESTROY;
    public static final EnumC0677l ON_PAUSE;
    public static final EnumC0677l ON_RESUME;
    public static final EnumC0677l ON_START;
    public static final EnumC0677l ON_STOP;

    static {
        EnumC0677l enumC0677l = new EnumC0677l("ON_CREATE", 0);
        ON_CREATE = enumC0677l;
        EnumC0677l enumC0677l2 = new EnumC0677l("ON_START", 1);
        ON_START = enumC0677l2;
        EnumC0677l enumC0677l3 = new EnumC0677l("ON_RESUME", 2);
        ON_RESUME = enumC0677l3;
        EnumC0677l enumC0677l4 = new EnumC0677l("ON_PAUSE", 3);
        ON_PAUSE = enumC0677l4;
        EnumC0677l enumC0677l5 = new EnumC0677l("ON_STOP", 4);
        ON_STOP = enumC0677l5;
        EnumC0677l enumC0677l6 = new EnumC0677l("ON_DESTROY", 5);
        ON_DESTROY = enumC0677l6;
        EnumC0677l enumC0677l7 = new EnumC0677l("ON_ANY", 6);
        ON_ANY = enumC0677l7;
        $VALUES = new EnumC0677l[]{enumC0677l, enumC0677l2, enumC0677l3, enumC0677l4, enumC0677l5, enumC0677l6, enumC0677l7};
        Companion = new C0675j();
    }

    public static EnumC0677l valueOf(String str) {
        return (EnumC0677l) Enum.valueOf(EnumC0677l.class, str);
    }

    public static EnumC0677l[] values() {
        return (EnumC0677l[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final EnumC0678m m1697a() {
        switch (AbstractC0676k.f2313a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0678m.f2316c;
            case 3:
            case 4:
                return EnumC0678m.f2317d;
            case 5:
                return EnumC0678m.f2318e;
            case 6:
                return EnumC0678m.f2314a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
