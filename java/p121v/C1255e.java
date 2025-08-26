package p121v;

import android.view.ViewGroup;
import p113s.C1203d;
import p113s.C1207h;

/* renamed from: v.e */
/* loaded from: classes.dex */
public final class C1255e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public int f4890A;

    /* renamed from: B */
    public int f4891B;

    /* renamed from: C */
    public int f4892C;

    /* renamed from: D */
    public int f4893D;

    /* renamed from: E */
    public float f4894E;

    /* renamed from: F */
    public float f4895F;

    /* renamed from: G */
    public String f4896G;

    /* renamed from: H */
    public float f4897H;

    /* renamed from: I */
    public float f4898I;

    /* renamed from: J */
    public int f4899J;

    /* renamed from: K */
    public int f4900K;

    /* renamed from: L */
    public int f4901L;

    /* renamed from: M */
    public int f4902M;

    /* renamed from: N */
    public int f4903N;

    /* renamed from: O */
    public int f4904O;

    /* renamed from: P */
    public int f4905P;

    /* renamed from: Q */
    public int f4906Q;

    /* renamed from: R */
    public float f4907R;

    /* renamed from: S */
    public float f4908S;

    /* renamed from: T */
    public int f4909T;

    /* renamed from: U */
    public int f4910U;

    /* renamed from: V */
    public int f4911V;

    /* renamed from: W */
    public boolean f4912W;

    /* renamed from: X */
    public boolean f4913X;

    /* renamed from: Y */
    public String f4914Y;

    /* renamed from: Z */
    public int f4915Z;

    /* renamed from: a */
    public int f4916a;

    /* renamed from: a0 */
    public boolean f4917a0;

    /* renamed from: b */
    public int f4918b;

    /* renamed from: b0 */
    public boolean f4919b0;

    /* renamed from: c */
    public float f4920c;

    /* renamed from: c0 */
    public boolean f4921c0;

    /* renamed from: d */
    public boolean f4922d;

    /* renamed from: d0 */
    public boolean f4923d0;

    /* renamed from: e */
    public int f4924e;

    /* renamed from: e0 */
    public boolean f4925e0;

    /* renamed from: f */
    public int f4926f;

    /* renamed from: f0 */
    public int f4927f0;

    /* renamed from: g */
    public int f4928g;

    /* renamed from: g0 */
    public int f4929g0;

    /* renamed from: h */
    public int f4930h;

    /* renamed from: h0 */
    public int f4931h0;

    /* renamed from: i */
    public int f4932i;

    /* renamed from: i0 */
    public int f4933i0;

    /* renamed from: j */
    public int f4934j;

    /* renamed from: j0 */
    public int f4935j0;

    /* renamed from: k */
    public int f4936k;

    /* renamed from: k0 */
    public int f4937k0;

    /* renamed from: l */
    public int f4938l;

    /* renamed from: l0 */
    public float f4939l0;

    /* renamed from: m */
    public int f4940m;

    /* renamed from: m0 */
    public int f4941m0;

    /* renamed from: n */
    public int f4942n;

    /* renamed from: n0 */
    public int f4943n0;

    /* renamed from: o */
    public int f4944o;

    /* renamed from: o0 */
    public float f4945o0;

    /* renamed from: p */
    public int f4946p;

    /* renamed from: p0 */
    public C1203d f4947p0;

    /* renamed from: q */
    public int f4948q;

    /* renamed from: r */
    public float f4949r;

    /* renamed from: s */
    public int f4950s;

    /* renamed from: t */
    public int f4951t;

    /* renamed from: u */
    public int f4952u;

    /* renamed from: v */
    public int f4953v;

    /* renamed from: w */
    public int f4954w;

    /* renamed from: x */
    public int f4955x;

    /* renamed from: y */
    public int f4956y;

    /* renamed from: z */
    public int f4957z;

    /* renamed from: a */
    public final void m2932a() {
        this.f4923d0 = false;
        this.f4917a0 = true;
        this.f4919b0 = true;
        int i2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i2 == -2 && this.f4912W) {
            this.f4917a0 = false;
            if (this.f4901L == 0) {
                this.f4901L = 1;
            }
        }
        int i3 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i3 == -2 && this.f4913X) {
            this.f4919b0 = false;
            if (this.f4902M == 0) {
                this.f4902M = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4917a0 = false;
            if (i2 == 0 && this.f4901L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4912W = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f4919b0 = false;
            if (i3 == 0 && this.f4902M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4913X = true;
            }
        }
        if (this.f4920c == -1.0f && this.f4916a == -1 && this.f4918b == -1) {
            return;
        }
        this.f4923d0 = true;
        this.f4917a0 = true;
        this.f4919b0 = true;
        if (!(this.f4947p0 instanceof C1207h)) {
            this.f4947p0 = new C1207h();
        }
        ((C1207h) this.f4947p0).m2849S(this.f4911V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p121v.C1255e.resolveLayoutDirection(int):void");
    }
}
