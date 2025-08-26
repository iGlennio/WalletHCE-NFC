package p045Q;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import p043P0.RunnableC0402A;
import p088j.C1045x0;

/* renamed from: Q.g */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0440g implements View.OnTouchListener {

    /* renamed from: r */
    public static final int f1214r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    public final C0434a f1215a;

    /* renamed from: b */
    public final AccelerateInterpolator f1216b;

    /* renamed from: c */
    public final ListView f1217c;

    /* renamed from: d */
    public RunnableC0402A f1218d;

    /* renamed from: e */
    public final float[] f1219e;

    /* renamed from: f */
    public final float[] f1220f;

    /* renamed from: g */
    public final int f1221g;

    /* renamed from: h */
    public final int f1222h;

    /* renamed from: i */
    public final float[] f1223i;

    /* renamed from: j */
    public final float[] f1224j;

    /* renamed from: k */
    public final float[] f1225k;

    /* renamed from: l */
    public boolean f1226l;

    /* renamed from: m */
    public boolean f1227m;

    /* renamed from: n */
    public boolean f1228n;

    /* renamed from: o */
    public boolean f1229o;

    /* renamed from: p */
    public boolean f1230p;

    /* renamed from: q */
    public final C1045x0 f1231q;

    public ViewOnTouchListenerC0440g(C1045x0 c1045x0) {
        C0434a c0434a = new C0434a();
        c0434a.f1209e = Long.MIN_VALUE;
        c0434a.f1211g = -1L;
        c0434a.f1210f = 0L;
        this.f1215a = c0434a;
        this.f1216b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1219e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1220f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1223i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1224j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1225k = fArr5;
        this.f1217c = c1045x0;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f1221g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1222h = f1214r;
        c0434a.f1205a = 500;
        c0434a.f1206b = 500;
        this.f1231q = c1045x0;
    }

    /* renamed from: b */
    public static float m1138b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m1139a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1219e
            r0 = r0[r4]
            float[] r1 = r3.f1220f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m1138b(r0, r2, r1)
            float r1 = r3.m1140c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m1140c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f1216b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m1138b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f1223i
            r0 = r0[r4]
            float[] r1 = r3.f1224j
            r1 = r1[r4]
            float[] r2 = r3.f1225k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = m1138b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m1138b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p045Q.ViewOnTouchListenerC0440g.m1139a(int, float, float, float):float");
    }

    /* renamed from: c */
    public final float m1140c(float f, float f2) {
        if (f2 != 0.0f) {
            int i2 = this.f1221g;
            if (i2 == 0 || i2 == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f1229o && i2 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i2 == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m1141d() {
        int i2 = 0;
        if (this.f1227m) {
            this.f1229o = false;
            return;
        }
        C0434a c0434a = this.f1215a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - c0434a.f1209e);
        int i4 = c0434a.f1206b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        c0434a.f1213i = i2;
        c0434a.f1212h = c0434a.m1124a(currentAnimationTimeMillis);
        c0434a.f1211g = currentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m1142e() {
        C1045x0 c1045x0;
        int count;
        C0434a c0434a = this.f1215a;
        float f = c0434a.f1208d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(c0434a.f1207c);
        if (abs != 0 && (count = (c1045x0 = this.f1231q).getCount()) != 0) {
            int childCount = c1045x0.getChildCount();
            int firstVisiblePosition = c1045x0.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c1045x0.getChildAt(0).getTop() >= 0)) : !(i2 >= count && c1045x0.getChildAt(childCount - 1).getBottom() <= c1045x0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r1 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r7.f1230p
            r2 = 0
            if (r1 != 0) goto L8
            goto L7c
        L8:
            int r1 = r9.getActionMasked()
            if (r1 == 0) goto L1b
            if (r1 == r0) goto L17
            r3 = 2
            if (r1 == r3) goto L1f
            r8 = 3
            if (r1 == r8) goto L17
            goto L7c
        L17:
            r7.m1141d()
            return r2
        L1b:
            r7.f1228n = r0
            r7.f1226l = r2
        L1f:
            float r1 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f1217c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r1 = r7.m1139a(r2, r1, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m1139a(r0, r9, r8, r3)
            Q.a r9 = r7.f1215a
            r9.f1207c = r1
            r9.f1208d = r8
            boolean r8 = r7.f1229o
            if (r8 != 0) goto L7c
            boolean r8 = r7.m1142e()
            if (r8 == 0) goto L7c
            P0.A r8 = r7.f1218d
            if (r8 != 0) goto L60
            P0.A r8 = new P0.A
            r8.<init>(r0, r7)
            r7.f1218d = r8
        L60:
            r7.f1229o = r0
            r7.f1227m = r0
            boolean r8 = r7.f1226l
            if (r8 != 0) goto L75
            int r8 = r7.f1222h
            if (r8 <= 0) goto L75
            P0.A r9 = r7.f1218d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p027K.AbstractC0272P.f768a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            P0.A r8 = r7.f1218d
            r8.run()
        L7a:
            r7.f1226l = r0
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p045Q.ViewOnTouchListenerC0440g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
