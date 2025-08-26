package p057V0;

import java.util.Calendar;
import java.util.GregorianCalendar;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p051S0.InterfaceC0478m;
import p065Z0.C0551a;

/* renamed from: V0.f */
/* loaded from: classes.dex */
public final class C0518f implements InterfaceC0478m {

    /* renamed from: a */
    public final /* synthetic */ int f1414a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0477l f1415b;

    public /* synthetic */ C0518f(AbstractC0477l abstractC0477l, int i2) {
        this.f1414a = i2;
        this.f1415b = abstractC0477l;
    }

    @Override // p051S0.InterfaceC0478m
    /* renamed from: a */
    public final AbstractC0477l mo1231a(C0469d c0469d, C0551a c0551a) {
        switch (this.f1414a) {
            case 0:
                if (c0551a.f1518a == Number.class) {
                    break;
                }
                break;
            default:
                Class cls = c0551a.f1518a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    break;
                }
                break;
        }
        return (C0519g) this.f1415b;
    }

    public String toString() {
        switch (this.f1414a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C0519g) this.f1415b) + "]";
            default:
                return super.toString();
        }
    }
}
