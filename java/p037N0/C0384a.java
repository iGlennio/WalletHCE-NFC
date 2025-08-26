package p037N0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p010D1.AbstractC0096d;

/* renamed from: N0.a */
/* loaded from: classes.dex */
public final class C0384a extends AbstractC0096d {

    /* renamed from: n */
    public final /* synthetic */ int f1026n;

    /* renamed from: o */
    public final SideSheetBehavior f1027o;

    public /* synthetic */ C0384a(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f1026n = i2;
        this.f1027o = sideSheetBehavior;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: A */
    public final int mo356A() {
        switch (this.f1026n) {
            case 0:
                return -this.f1027o.f2773l;
            default:
                return mo380x();
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: B */
    public final int mo357B(View view) {
        switch (this.f1026n) {
            case 0:
                return view.getRight() + this.f1027o.f2776o;
            default:
                return view.getLeft() - this.f1027o.f2776o;
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: F */
    public final int mo358F(CoordinatorLayout coordinatorLayout) {
        switch (this.f1026n) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: H */
    public final int mo360H() {
        switch (this.f1026n) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: M */
    public final boolean mo362M(float f) {
        switch (this.f1026n) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: O */
    public final boolean mo364O(View view) {
        switch (this.f1026n) {
            case 0:
                if (view.getRight() < (mo380x() - mo381y()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo380x() + this.f1027o.f2774m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: P */
    public final boolean mo365P(float f, float f2) {
        switch (this.f1026n) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs = Math.abs(f);
                    this.f1027o.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs2 = Math.abs(f);
                    this.f1027o.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: h */
    public final int mo371h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1026n) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: h0 */
    public final boolean mo372h0(View view, float f) {
        switch (this.f1026n) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1027o;
                float abs = Math.abs((f * sideSheetBehavior.f2772k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1027o;
                float abs2 = Math.abs((f * sideSheetBehavior2.f2772k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: i */
    public final float mo373i(int i2) {
        switch (this.f1026n) {
            case 0:
                float mo381y = mo381y();
                return (i2 - mo381y) / (mo380x() - mo381y);
            default:
                float f = this.f1027o.f2774m;
                return (f - i2) / (f - mo380x());
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: m0 */
    public final void mo375m0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        switch (this.f1026n) {
            case 0:
                marginLayoutParams.leftMargin = i2;
                break;
            default:
                marginLayoutParams.rightMargin = i2;
                break;
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: n0 */
    public final void mo376n0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        switch (this.f1026n) {
            case 0:
                if (i2 <= this.f1027o.f2774m) {
                    marginLayoutParams.leftMargin = i3;
                    break;
                }
                break;
            default:
                int i4 = this.f1027o.f2774m;
                if (i2 <= i4) {
                    marginLayoutParams.rightMargin = i4 - i2;
                    break;
                }
                break;
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: w */
    public final int mo379w(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1026n) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: x */
    public final int mo380x() {
        switch (this.f1026n) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1027o;
                return Math.max(0, sideSheetBehavior.f2775n + sideSheetBehavior.f2776o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1027o;
                return Math.max(0, (sideSheetBehavior2.f2774m - sideSheetBehavior2.f2773l) - sideSheetBehavior2.f2776o);
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: y */
    public final int mo381y() {
        switch (this.f1026n) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1027o;
                return (-sideSheetBehavior.f2773l) - sideSheetBehavior.f2776o;
            default:
                return this.f1027o.f2774m;
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: z */
    public final int mo382z() {
        switch (this.f1026n) {
            case 0:
                return this.f1027o.f2776o;
            default:
                return this.f1027o.f2774m;
        }
    }
}
