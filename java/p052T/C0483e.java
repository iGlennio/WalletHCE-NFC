package p052T;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import p010D1.AbstractC0104l;
import p027K.AbstractC0272P;
import p043P0.RunnableC0402A;

/* renamed from: T.e */
/* loaded from: classes.dex */
public final class C0483e {

    /* renamed from: x */
    public static final InterpolatorC0482d f1307x = new InterpolatorC0482d(0);

    /* renamed from: a */
    public int f1308a;

    /* renamed from: b */
    public int f1309b;

    /* renamed from: d */
    public float[] f1311d;

    /* renamed from: e */
    public float[] f1312e;

    /* renamed from: f */
    public float[] f1313f;

    /* renamed from: g */
    public float[] f1314g;

    /* renamed from: h */
    public int[] f1315h;

    /* renamed from: i */
    public int[] f1316i;

    /* renamed from: j */
    public int[] f1317j;

    /* renamed from: k */
    public int f1318k;

    /* renamed from: l */
    public VelocityTracker f1319l;

    /* renamed from: m */
    public final float f1320m;

    /* renamed from: n */
    public float f1321n;

    /* renamed from: o */
    public int f1322o;

    /* renamed from: p */
    public final int f1323p;

    /* renamed from: q */
    public int f1324q;

    /* renamed from: r */
    public final OverScroller f1325r;

    /* renamed from: s */
    public final AbstractC0104l f1326s;

    /* renamed from: t */
    public View f1327t;

    /* renamed from: u */
    public boolean f1328u;

    /* renamed from: v */
    public final ViewGroup f1329v;

    /* renamed from: c */
    public int f1310c = -1;

    /* renamed from: w */
    public final RunnableC0402A f1330w = new RunnableC0402A(2, this);

    public C0483e(Context context, ViewGroup viewGroup, AbstractC0104l abstractC0104l) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0104l == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1329v = viewGroup;
        this.f1326s = abstractC0104l;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1323p = i2;
        this.f1322o = i2;
        this.f1309b = viewConfiguration.getScaledTouchSlop();
        this.f1320m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1321n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1325r = new OverScroller(context, f1307x);
    }

    /* renamed from: a */
    public final void m1240a() {
        this.f1310c = -1;
        float[] fArr = this.f1311d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1312e, 0.0f);
            Arrays.fill(this.f1313f, 0.0f);
            Arrays.fill(this.f1314g, 0.0f);
            Arrays.fill(this.f1315h, 0);
            Arrays.fill(this.f1316i, 0);
            Arrays.fill(this.f1317j, 0);
            this.f1318k = 0;
        }
        VelocityTracker velocityTracker = this.f1319l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1319l = null;
        }
    }

    /* renamed from: b */
    public final void m1241b(View view, int i2) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f1329v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f1327t = view;
        this.f1310c = i2;
        this.f1326s.mo423K(view, i2);
        m1255p(1);
    }

    /* renamed from: c */
    public final boolean m1242c(float f, float f2, int i2, int i3) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f1315h[i2] & i3) != i3 || (this.f1324q & i3) == 0 || (this.f1317j[i2] & i3) == i3 || (this.f1316i[i2] & i3) == i3) {
            return false;
        }
        float f3 = this.f1309b;
        if (abs <= f3 && abs2 <= f3) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f1326s.getClass();
        }
        return (this.f1316i[i2] & i3) == 0 && abs > ((float) this.f1309b);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1243d(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            D1.l r1 = r3.f1326s
            int r4 = r1.mo419A(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.mo420B()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f1309b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f1309b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f1309b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p052T.C0483e.m1243d(android.view.View, float, float):boolean");
    }

    /* renamed from: e */
    public final void m1244e(int i2) {
        float[] fArr = this.f1311d;
        if (fArr != null) {
            int i3 = this.f1318k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.f1312e[i2] = 0.0f;
                this.f1313f[i2] = 0.0f;
                this.f1314g[i2] = 0.0f;
                this.f1315h[i2] = 0;
                this.f1316i[i2] = 0;
                this.f1317j[i2] = 0;
                this.f1318k = (~i4) & i3;
            }
        }
    }

    /* renamed from: f */
    public final int m1245f(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f1329v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: g */
    public final boolean m1246g() {
        if (this.f1308a == 2) {
            OverScroller overScroller = this.f1325r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1327t.getLeft();
            int top = currY - this.f1327t.getTop();
            if (left != 0) {
                View view = this.f1327t;
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1327t;
                WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1326s.mo425M(this.f1327t, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f1329v.post(this.f1330w);
            }
        }
        return this.f1308a == 2;
    }

    /* renamed from: h */
    public final View m1247h(int i2, int i3) {
        ViewGroup viewGroup = this.f1329v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1326s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m1248i(int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f1327t.getLeft();
        int top = this.f1327t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        OverScroller overScroller = this.f1325r;
        if (i6 == 0 && i7 == 0) {
            overScroller.abortAnimation();
            m1255p(0);
            return false;
        }
        View view = this.f1327t;
        int i8 = (int) this.f1321n;
        int i9 = (int) this.f1320m;
        int abs = Math.abs(i4);
        if (abs < i8) {
            i4 = 0;
        } else if (abs > i9) {
            i4 = i4 > 0 ? i9 : -i9;
        }
        int i10 = (int) this.f1321n;
        int abs2 = Math.abs(i5);
        if (abs2 < i10) {
            i5 = 0;
        } else if (abs2 > i9) {
            i5 = i5 > 0 ? i9 : -i9;
        }
        int abs3 = Math.abs(i6);
        int abs4 = Math.abs(i7);
        int abs5 = Math.abs(i4);
        int abs6 = Math.abs(i5);
        int i11 = abs5 + abs6;
        int i12 = abs3 + abs4;
        if (i4 != 0) {
            f = abs5;
            f2 = i11;
        } else {
            f = abs3;
            f2 = i12;
        }
        float f5 = f / f2;
        if (i5 != 0) {
            f3 = abs6;
            f4 = i11;
        } else {
            f3 = abs4;
            f4 = i12;
        }
        float f6 = f3 / f4;
        AbstractC0104l abstractC0104l = this.f1326s;
        overScroller.startScroll(left, top, i6, i7, (int) ((m1245f(i7, i5, abstractC0104l.mo420B()) * f6) + (m1245f(i6, i4, abstractC0104l.mo419A(view)) * f5)));
        m1255p(2);
        return true;
    }

    /* renamed from: j */
    public final boolean m1249j(int i2) {
        if ((this.f1318k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: k */
    public final void m1250k(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1240a();
        }
        if (this.f1319l == null) {
            this.f1319l = VelocityTracker.obtain();
        }
        this.f1319l.addMovement(motionEvent);
        int i3 = 0;
        AbstractC0104l abstractC0104l = this.f1326s;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m1247h = m1247h((int) x2, (int) y2);
            m1253n(x2, y2, pointerId);
            m1259t(m1247h, pointerId);
            if ((this.f1315h[pointerId] & this.f1324q) != 0) {
                abstractC0104l.mo422I();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f1308a == 1) {
                m1251l();
            }
            m1240a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f1308a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i3 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i3);
                    if (m1249j(pointerId2)) {
                        float x3 = motionEvent.getX(i3);
                        float y3 = motionEvent.getY(i3);
                        float f = x3 - this.f1311d[pointerId2];
                        float f2 = y3 - this.f1312e[pointerId2];
                        m1252m(f, f2, pointerId2);
                        if (this.f1308a != 1) {
                            View m1247h2 = m1247h((int) x3, (int) y3);
                            if (m1243d(m1247h2, f, f2) && m1259t(m1247h2, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i3++;
                }
                m1254o(motionEvent);
                return;
            }
            if (m1249j(this.f1310c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1310c);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f1313f;
                int i4 = this.f1310c;
                int i5 = (int) (x4 - fArr[i4]);
                int i6 = (int) (y4 - this.f1314g[i4]);
                int left = this.f1327t.getLeft() + i5;
                int top = this.f1327t.getTop() + i6;
                int left2 = this.f1327t.getLeft();
                int top2 = this.f1327t.getTop();
                if (i5 != 0) {
                    left = abstractC0104l.mo433i(this.f1327t, left);
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    this.f1327t.offsetLeftAndRight(left - left2);
                }
                if (i6 != 0) {
                    top = abstractC0104l.mo434j(this.f1327t, top);
                    WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                    this.f1327t.offsetTopAndBottom(top - top2);
                }
                if (i5 != 0 || i6 != 0) {
                    abstractC0104l.mo425M(this.f1327t, left, top);
                }
                m1254o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f1308a == 1) {
                this.f1328u = true;
                abstractC0104l.mo426N(this.f1327t, 0.0f, 0.0f);
                this.f1328u = false;
                if (this.f1308a == 1) {
                    m1255p(0);
                }
            }
            m1240a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x5 = motionEvent.getX(actionIndex);
            float y5 = motionEvent.getY(actionIndex);
            m1253n(x5, y5, pointerId3);
            if (this.f1308a == 0) {
                m1259t(m1247h((int) x5, (int) y5), pointerId3);
                if ((this.f1315h[pointerId3] & this.f1324q) != 0) {
                    abstractC0104l.mo422I();
                    return;
                }
                return;
            }
            int i7 = (int) x5;
            int i8 = (int) y5;
            View view = this.f1327t;
            if (view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom()) {
                m1259t(this.f1327t, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f1308a == 1 && pointerId4 == this.f1310c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i3 >= pointerCount2) {
                    i2 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i3);
                if (pointerId5 != this.f1310c) {
                    View m1247h3 = m1247h((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                    View view2 = this.f1327t;
                    if (m1247h3 == view2 && m1259t(view2, pointerId5)) {
                        i2 = this.f1310c;
                        break;
                    }
                }
                i3++;
            }
            if (i2 == -1) {
                m1251l();
            }
        }
        m1244e(pointerId4);
    }

    /* renamed from: l */
    public final void m1251l() {
        VelocityTracker velocityTracker = this.f1319l;
        float f = this.f1320m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f1319l.getXVelocity(this.f1310c);
        float f2 = this.f1321n;
        float abs = Math.abs(xVelocity);
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f1319l.getYVelocity(this.f1310c);
        float f3 = this.f1321n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f1328u = true;
        this.f1326s.mo426N(this.f1327t, xVelocity, f);
        this.f1328u = false;
        if (this.f1308a == 1) {
            m1255p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [D1.l] */
    /* renamed from: m */
    public final void m1252m(float f, float f2, int i2) {
        boolean m1242c = m1242c(f, f2, i2, 1);
        boolean z2 = m1242c;
        if (m1242c(f2, f, i2, 4)) {
            z2 = (m1242c ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (m1242c(f, f2, i2, 2)) {
            z3 = (z2 ? 1 : 0) | 2;
        }
        ?? r02 = z3;
        if (m1242c(f2, f, i2, 8)) {
            r02 = (z3 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f1316i;
            iArr[i2] = iArr[i2] | r02;
            this.f1326s.mo421H(r02, i2);
        }
    }

    /* renamed from: n */
    public final void m1253n(float f, float f2, int i2) {
        float[] fArr = this.f1311d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1312e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1313f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1314g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1315h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1316i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1317j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1311d = fArr2;
            this.f1312e = fArr3;
            this.f1313f = fArr4;
            this.f1314g = fArr5;
            this.f1315h = iArr;
            this.f1316i = iArr2;
            this.f1317j = iArr3;
        }
        float[] fArr9 = this.f1311d;
        this.f1313f[i2] = f;
        fArr9[i2] = f;
        float[] fArr10 = this.f1312e;
        this.f1314g[i2] = f2;
        fArr10[i2] = f2;
        int[] iArr7 = this.f1315h;
        int i4 = (int) f;
        int i5 = (int) f2;
        ViewGroup viewGroup = this.f1329v;
        int i6 = i4 < viewGroup.getLeft() + this.f1322o ? 1 : 0;
        if (i5 < viewGroup.getTop() + this.f1322o) {
            i6 |= 4;
        }
        if (i4 > viewGroup.getRight() - this.f1322o) {
            i6 |= 2;
        }
        if (i5 > viewGroup.getBottom() - this.f1322o) {
            i6 |= 8;
        }
        iArr7[i2] = i6;
        this.f1318k |= 1 << i2;
    }

    /* renamed from: o */
    public final void m1254o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (m1249j(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f1313f[pointerId] = x2;
                this.f1314g[pointerId] = y2;
            }
        }
    }

    /* renamed from: p */
    public final void m1255p(int i2) {
        this.f1329v.removeCallbacks(this.f1330w);
        if (this.f1308a != i2) {
            this.f1308a = i2;
            this.f1326s.mo424L(i2);
            if (this.f1308a == 0) {
                this.f1327t = null;
            }
        }
    }

    /* renamed from: q */
    public final boolean m1256q(int i2, int i3) {
        if (this.f1328u) {
            return m1248i(i2, i3, (int) this.f1319l.getXVelocity(this.f1310c), (int) this.f1319l.getYVelocity(this.f1310c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r13 != r12) goto L54;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1257r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p052T.C0483e.m1257r(android.view.MotionEvent):boolean");
    }

    /* renamed from: s */
    public final boolean m1258s(View view, int i2, int i3) {
        this.f1327t = view;
        this.f1310c = -1;
        boolean m1248i = m1248i(i2, i3, 0, 0);
        if (!m1248i && this.f1308a == 0 && this.f1327t != null) {
            this.f1327t = null;
        }
        return m1248i;
    }

    /* renamed from: t */
    public final boolean m1259t(View view, int i2) {
        if (view == this.f1327t && this.f1310c == i2) {
            return true;
        }
        if (view == null || !this.f1326s.mo429V(view, i2)) {
            return false;
        }
        this.f1310c = i2;
        m1241b(view, i2);
        return true;
    }
}
