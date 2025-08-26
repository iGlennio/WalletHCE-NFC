package p088j;

import android.util.Log;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0651y;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p027K.AbstractC0272P;
import p027K.C0315q0;
import p027K.C0319s0;
import p027K.InterfaceC0314q;
import p030L.InterfaceC0352s;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1199i;
import p118t1.C1234d;
import p118t1.C1241k;
import p118t1.C1242l;
import p118t1.InterfaceC1239i;
import p123v1.C1281k;
import p123v1.C1290t;
import p123v1.InterfaceC1274d;
import p125w0.InterfaceC1296a;
import p126w1.ThreadFactoryC1301a;
import p127x.C1306d;
import p132y1.C1323c;
import p135z1.C1340h;
import p135z1.C1345m;

/* renamed from: j.d0 */
/* loaded from: classes.dex */
public class C0985d0 implements InterfaceC0982c0, InterfaceC0352s, InterfaceC1274d, InterfaceC1239i, InterfaceC1296a, InterfaceC0314q {

    /* renamed from: a */
    public final /* synthetic */ int f3903a;

    /* renamed from: b */
    public final Object f3904b;

    public /* synthetic */ C0985d0(int i2, Object obj) {
        this.f3903a = i2;
        this.f3904b = obj;
    }

    @Override // p123v1.InterfaceC1274d
    /* renamed from: b */
    public void mo61b(C1340h c1340h, C1290t c1290t) {
        C1234d c1234d = (C1234d) this.f3904b;
        try {
            c1234d.mo1684c(new JSONObject(c1290t.f5287g.m2984j()));
        } catch (JSONException e2) {
            c1234d.mo1683b("响应解析失败: " + e2.getMessage());
        }
    }

    @Override // p123v1.InterfaceC1274d
    /* renamed from: c */
    public void mo62c(C1340h c1340h, IOException iOException) {
        ((C1234d) this.f3904b).mo1683b(iOException.getMessage());
    }

    @Override // p027K.InterfaceC0314q
    /* renamed from: d */
    public C0319s0 mo63d(View view, C0319s0 c0319s0) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3904b;
        if (!Objects.equals(coordinatorLayout.f1875n, c0319s0)) {
            coordinatorLayout.f1875n = c0319s0;
            boolean z2 = c0319s0.m940d() > 0;
            coordinatorLayout.f1876o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            C0315q0 c0315q0 = c0319s0.f855a;
            if (!c0315q0.mo919m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    if (childAt.getFitsSystemWindows() && ((C1306d) childAt.getLayoutParams()).f5345a != null && c0315q0.mo919m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0319s0;
    }

    @Override // p118t1.InterfaceC1239i
    /* renamed from: f */
    public void mo1685f(String str) {
        switch (this.f3903a) {
            case 3:
                Log.i("test", "ping = " + str);
                C0651y c0651y = ((C1242l) this.f3904b).f4838a;
                if (c0651y != null) {
                    c0651y.getClass();
                    break;
                }
                break;
            default:
                C0651y c0651y2 = ((C1241k) this.f3904b).f4837b.f4838a;
                if (c0651y2 != null) {
                    c0651y2.getClass();
                    break;
                }
                break;
        }
    }

    /* renamed from: g */
    public void m2461g(String str, String str2) {
        AbstractC1136c.m2637e(str, "name");
        AbstractC1136c.m2637e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f3904b;
        arrayList.add(str);
        arrayList.add(AbstractC1199i.m2763I0(str2).toString());
    }

    @Override // p030L.InterfaceC0352s
    /* renamed from: h */
    public boolean mo172h(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3904b;
        if (!swipeDismissBehavior.mo1901v(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = swipeDismissBehavior.f2508d;
        view.offsetLeftAndRight((!(i2 == 0 && z2) && (i2 != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    /* renamed from: i */
    public C1281k m2462i() {
        Object[] array = ((ArrayList) this.f3904b).toArray(new String[0]);
        if (array != null) {
            return new C1281k((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: j */
    public void m2463j(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3904b;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                arrayList.remove(i2);
                arrayList.remove(i2);
                i2 -= 2;
            }
            i2 += 2;
        }
    }

    public C0985d0(int i2) {
        this.f3903a = i2;
        switch (i2) {
            case 8:
                this.f3904b = new ArrayList(20);
                break;
            case 12:
                this.f3904b = new LinkedHashSet();
                break;
            default:
                AbstractC1136c.m2637e(TimeUnit.MINUTES, "timeUnit");
                this.f3904b = new C1345m(C1323c.f5414h);
                break;
        }
    }

    public C0985d0(ThreadFactoryC1301a threadFactoryC1301a) {
        this.f3903a = 11;
        this.f3904b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC1301a);
    }

    @Override // p088j.InterfaceC0982c0
    /* renamed from: a */
    public void mo2459a(int i2) {
    }

    @Override // p088j.InterfaceC0982c0
    /* renamed from: e */
    public void mo2460e(int i2) {
    }
}
