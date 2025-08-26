package p027K;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p005C.C0041d;

/* renamed from: K.q0 */
/* loaded from: classes.dex */
public class C0315q0 {

    /* renamed from: b */
    public static final C0319s0 f852b;

    /* renamed from: a */
    public final C0319s0 f853a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f852b = (i2 >= 30 ? new C0301j0() : i2 >= 29 ? new C0299i0() : new C0297h0()).mo867b().f855a.mo926a().f855a.mo916b().f855a.mo917c();
    }

    public C0315q0(C0319s0 c0319s0) {
        this.f853a = c0319s0;
    }

    /* renamed from: a */
    public C0319s0 mo926a() {
        return this.f853a;
    }

    /* renamed from: b */
    public C0319s0 mo916b() {
        return this.f853a;
    }

    /* renamed from: c */
    public C0319s0 mo917c() {
        return this.f853a;
    }

    /* renamed from: e */
    public C0300j mo927e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0315q0)) {
            return false;
        }
        C0315q0 c0315q0 = (C0315q0) obj;
        return mo903n() == c0315q0.mo903n() && mo919m() == c0315q0.mo919m() && Objects.equals(mo901j(), c0315q0.mo901j()) && Objects.equals(mo918h(), c0315q0.mo918h()) && Objects.equals(mo927e(), c0315q0.mo927e());
    }

    /* renamed from: f */
    public C0041d mo900f(int i2) {
        return C0041d.f106e;
    }

    /* renamed from: g */
    public C0041d mo929g() {
        return mo901j();
    }

    /* renamed from: h */
    public C0041d mo918h() {
        return C0041d.f106e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo903n()), Boolean.valueOf(mo919m()), mo901j(), mo918h(), mo927e());
    }

    /* renamed from: i */
    public C0041d mo930i() {
        return mo901j();
    }

    /* renamed from: j */
    public C0041d mo901j() {
        return C0041d.f106e;
    }

    /* renamed from: k */
    public C0041d mo931k() {
        return mo901j();
    }

    /* renamed from: l */
    public C0319s0 mo902l(int i2, int i3, int i4, int i5) {
        return f852b;
    }

    /* renamed from: m */
    public boolean mo919m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo903n() {
        return false;
    }

    /* renamed from: d */
    public void mo899d(View view) {
    }

    /* renamed from: o */
    public void mo904o(C0041d[] c0041dArr) {
    }

    /* renamed from: p */
    public void mo905p(C0319s0 c0319s0) {
    }

    /* renamed from: q */
    public void mo920q(C0041d c0041d) {
    }
}
