package p027K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p005C.C0041d;

/* renamed from: K.h0 */
/* loaded from: classes.dex */
public final class C0297h0 extends AbstractC0303k0 {

    /* renamed from: e */
    public static Field f820e = null;

    /* renamed from: f */
    public static boolean f821f = false;

    /* renamed from: g */
    public static Constructor f822g = null;

    /* renamed from: h */
    public static boolean f823h = false;

    /* renamed from: c */
    public WindowInsets f824c;

    /* renamed from: d */
    public C0041d f825d;

    public C0297h0() {
        this.f824c = m866i();
    }

    /* renamed from: i */
    private static WindowInsets m866i() {
        if (!f821f) {
            try {
                f820e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f821f = true;
        }
        Field field = f820e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f823h) {
            try {
                f822g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f823h = true;
        }
        Constructor constructor = f822g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // p027K.AbstractC0303k0
    /* renamed from: b */
    public C0319s0 mo867b() {
        m881a();
        C0319s0 m936g = C0319s0.m936g(null, this.f824c);
        C0041d[] c0041dArr = this.f829b;
        C0315q0 c0315q0 = m936g.f855a;
        c0315q0.mo904o(c0041dArr);
        c0315q0.mo920q(this.f825d);
        return m936g;
    }

    @Override // p027K.AbstractC0303k0
    /* renamed from: e */
    public void mo868e(C0041d c0041d) {
        this.f825d = c0041d;
    }

    @Override // p027K.AbstractC0303k0
    /* renamed from: g */
    public void mo869g(C0041d c0041d) {
        WindowInsets windowInsets = this.f824c;
        if (windowInsets != null) {
            this.f824c = windowInsets.replaceSystemWindowInsets(c0041d.f107a, c0041d.f108b, c0041d.f109c, c0041d.f110d);
        }
    }

    public C0297h0(C0319s0 c0319s0) {
        super(c0319s0);
        this.f824c = c0319s0.m941f();
    }
}
