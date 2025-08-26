package p043P0;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AnimationAnimationListenerC0630d;
import androidx.fragment.app.C0615E;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import nfc.share.nfcshare.MainActivity;
import p001A1.C0002a;
import p027K.AbstractC0272P;
import p037N0.C0389f;
import p045Q.C0434a;
import p045Q.ViewOnTouchListenerC0440g;
import p047Q1.AbstractC0458e;
import p052T.C0483e;
import p056V.C0510d;
import p056V.C0512f;
import p079f0.AbstractC0808D;
import p079f0.AbstractC0827X;
import p079f0.C0834c;
import p079f0.C0840f;
import p079f0.C0842g;
import p079f0.C0844h;
import p079f0.C0847k;
import p079f0.RunnableC0832b;
import p088j.C0985d0;
import p088j.C1005k;
import p088j.C1045x0;
import p095l1.AbstractC1136c;
import p132y1.AbstractC1321a;
import p132y1.C1322b;
import p132y1.C1323c;

/* renamed from: P0.A */
/* loaded from: classes.dex */
public final class RunnableC0402A implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1062a;

    /* renamed from: b */
    public final /* synthetic */ Object f1063b;

    public /* synthetic */ RunnableC0402A(int i2, Object obj) {
        this.f1062a = i2;
        this.f1063b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View m1495d;
        int width;
        int i2;
        boolean z2;
        C1005k c1005k;
        AbstractC1321a m3031c;
        long j2;
        switch (this.f1062a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1063b).f2821c.f1120g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                ViewOnTouchListenerC0440g viewOnTouchListenerC0440g = (ViewOnTouchListenerC0440g) this.f1063b;
                if (viewOnTouchListenerC0440g.f1229o) {
                    boolean z3 = viewOnTouchListenerC0440g.f1227m;
                    C0434a c0434a = viewOnTouchListenerC0440g.f1215a;
                    if (z3) {
                        viewOnTouchListenerC0440g.f1227m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0434a.f1209e = currentAnimationTimeMillis;
                        c0434a.f1211g = -1L;
                        c0434a.f1210f = currentAnimationTimeMillis;
                        c0434a.f1212h = 0.5f;
                    }
                    if ((c0434a.f1211g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0434a.f1211g + c0434a.f1213i) || !viewOnTouchListenerC0440g.m1142e()) {
                        viewOnTouchListenerC0440g.f1229o = false;
                        return;
                    }
                    boolean z4 = viewOnTouchListenerC0440g.f1228n;
                    ListView listView = viewOnTouchListenerC0440g.f1217c;
                    if (z4) {
                        viewOnTouchListenerC0440g.f1228n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c0434a.f1210f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float m1124a = c0434a.m1124a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - c0434a.f1210f;
                    c0434a.f1210f = currentAnimationTimeMillis2;
                    viewOnTouchListenerC0440g.f1231q.scrollListBy((int) (j3 * ((m1124a * 4.0f) + ((-4.0f) * m1124a * m1124a)) * c0434a.f1208d));
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((C0483e) this.f1063b).m1255p(0);
                return;
            case 3:
                C0512f c0512f = (C0512f) this.f1063b;
                int i3 = c0512f.f1398b.f1322o;
                int i4 = c0512f.f1397a;
                boolean z5 = i4 == 3;
                DrawerLayout drawerLayout = c0512f.f1400d;
                if (z5) {
                    m1495d = drawerLayout.m1495d(3);
                    width = (m1495d != null ? -m1495d.getWidth() : 0) + i3;
                } else {
                    m1495d = drawerLayout.m1495d(5);
                    width = drawerLayout.getWidth() - i3;
                }
                if (m1495d != null) {
                    if (((!z5 || m1495d.getLeft() >= width) && (z5 || m1495d.getLeft() <= width)) || drawerLayout.m1498g(m1495d) != 0) {
                        return;
                    }
                    C0510d c0510d = (C0510d) m1495d.getLayoutParams();
                    c0512f.f1398b.m1258s(m1495d, width, m1495d.getTop());
                    c0510d.f1390c = true;
                    drawerLayout.invalidate();
                    View m1495d2 = drawerLayout.m1495d(i4 == 3 ? 5 : 3);
                    if (m1495d2 != null) {
                        drawerLayout.m1493b(m1495d2, true);
                    }
                    if (drawerLayout.f1953r) {
                        return;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        drawerLayout.getChildAt(i5).dispatchTouchEvent(obtain2);
                    }
                    obtain2.recycle();
                    drawerLayout.f1953r = true;
                    return;
                }
                return;
            case 4:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!TextUtils.equals(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
            case 5:
                AnimationAnimationListenerC0630d animationAnimationListenerC0630d = (AnimationAnimationListenerC0630d) this.f1063b;
                animationAnimationListenerC0630d.f2160a.endViewTransition(animationAnimationListenerC0630d.f2161b);
                animationAnimationListenerC0630d.f2162c.m1639d();
                return;
            case 6:
                DialogInterfaceOnCancelListenerC0638l dialogInterfaceOnCancelListenerC0638l = (DialogInterfaceOnCancelListenerC0638l) this.f1063b;
                dialogInterfaceOnCancelListenerC0638l.f2178S.onDismiss(dialogInterfaceOnCancelListenerC0638l.f2186a0);
                return;
            case 7:
                ((C0615E) this.f1063b).m1603x(true);
                return;
            case 8:
                C0847k c0847k = (C0847k) this.f1063b;
                int i6 = c0847k.f3390A;
                ValueAnimator valueAnimator = c0847k.f3417z;
                if (i6 != 1) {
                    i2 = 2;
                    if (i6 != 2) {
                        return;
                    }
                } else {
                    i2 = 2;
                    valueAnimator.cancel();
                }
                c0847k.f3390A = 3;
                float[] fArr = new float[i2];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 9:
                RecyclerView recyclerView = (RecyclerView) this.f1063b;
                AbstractC0808D abstractC0808D = recyclerView.f2380H;
                if (abstractC0808D != null) {
                    C0844h c0844h = (C0844h) abstractC0808D;
                    ArrayList arrayList = c0844h.f3374h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0844h.f3376j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0844h.f3377k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0844h.f3375i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0844h.f3207d;
                            if (hasNext) {
                                AbstractC0827X abstractC0827X = (AbstractC0827X) it.next();
                                View view = abstractC0827X.f3280a;
                                ViewPropertyAnimator animate = view.animate();
                                c0844h.f3383q.add(abstractC0827X);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0834c(c0844h, abstractC0827X, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0844h.f3379m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0832b runnableC0832b = new RunnableC0832b(c0844h, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0832b.run();
                                    } else {
                                        View view2 = ((C0842g) arrayList5.get(0)).f3363a.f3280a;
                                        WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                                        view2.postOnAnimationDelayed(runnableC0832b, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0844h.f3380n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0832b runnableC0832b2 = new RunnableC0832b(c0844h, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0832b2.run();
                                    } else {
                                        View view3 = ((C0840f) arrayList6.get(0)).f3352a.f3280a;
                                        WeakHashMap weakHashMap3 = AbstractC0272P.f768a;
                                        view3.postOnAnimationDelayed(runnableC0832b2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0844h.f3378l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0832b runnableC0832b3 = new RunnableC0832b(c0844h, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0832b3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0844h.f3208e : 0L, !isEmpty3 ? c0844h.f3209f : 0L) + j4;
                                        View view4 = ((AbstractC0827X) arrayList7.get(0)).f3280a;
                                        WeakHashMap weakHashMap4 = AbstractC0272P.f768a;
                                        view4.postOnAnimationDelayed(runnableC0832b3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f2413i0 = z2;
                return;
            case 10:
                ((StaggeredGridLayoutManager) this.f1063b).m1851A0();
                return;
            case 11:
                C1045x0 c1045x0 = (C1045x0) this.f1063b;
                c1045x0.f4109l = null;
                c1045x0.drawableStateChanged();
                return;
            case 12:
                ActionMenuView actionMenuView = ((Toolbar) this.f1063b).f1797a;
                if (actionMenuView == null || (c1005k = actionMenuView.f1716t) == null) {
                    return;
                }
                c1005k.m2489o();
                return;
            case 13:
                ((MainActivity) this.f1063b).f4366B.show();
                return;
            case 14:
                Log.d("test", "msg == " + ((String) this.f1063b));
                return;
            case 15:
                AlertDialog create = new AlertDialog.Builder((MainActivity) ((C0002a) this.f1063b).f1b, R.style.MyAlertDialog).setIcon(R.drawable.baseline_warning_24).setTitle("提示").setMessage("请检查网络连接").setPositiveButton("确定", (DialogInterface.OnClickListener) null).create();
                create.setCanceledOnTouchOutside(false);
                create.setCancelable(false);
                create.show();
                return;
            case 16:
                C0389f c0389f = (C0389f) this.f1063b;
                c0389f.f1039c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0389f.f1041e;
                C0483e c0483e = bottomSheetBehavior.f2524M;
                if (c0483e != null && c0483e.m1246g()) {
                    c0389f.m1052a(c0389f.f1038b);
                    return;
                } else {
                    if (bottomSheetBehavior.f2523L == 2) {
                        bottomSheetBehavior.m1909G(c0389f.f1038b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            synchronized (((C1323c) this.f1063b)) {
                m3031c = ((C1323c) this.f1063b).m3031c();
            }
            if (m3031c == null) {
                return;
            }
            C1322b c1322b = m3031c.f5404a;
            AbstractC1136c.m2634b(c1322b);
            boolean isLoggable = C1323c.f5415i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0985d0 c0985d0 = c1322b.f5412e.f5422g;
                j2 = System.nanoTime();
                AbstractC0458e.m1187e(m3031c, c1322b, "starting");
            } else {
                j2 = -1;
            }
            try {
                C1323c.m3029a((C1323c) this.f1063b, m3031c);
                if (isLoggable) {
                    C0985d0 c0985d02 = c1322b.f5412e.f5422g;
                    AbstractC0458e.m1187e(m3031c, c1322b, "finished run in ".concat(AbstractC0458e.m1204v(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) ((C1323c) this.f1063b).f5422g.f3904b).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C0985d0 c0985d03 = c1322b.f5412e.f5422g;
                        AbstractC0458e.m1187e(m3031c, c1322b, "failed a run in ".concat(AbstractC0458e.m1204v(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
