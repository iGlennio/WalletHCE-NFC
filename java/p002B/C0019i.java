package p002B;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.emoji2.text.C0590d;
import androidx.emoji2.text.C0600n;
import androidx.emoji2.text.C0605s;
import androidx.emoji2.text.C0608v;
import androidx.fragment.app.AbstractComponentCallbacksC0641o;
import androidx.fragment.app.C0615E;
import androidx.lifecycle.AbstractC0662J;
import androidx.lifecycle.C0663K;
import androidx.lifecycle.C0664L;
import androidx.lifecycle.InterfaceC0683r;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p005C.AbstractC0042e;
import p005C.AbstractC0043f;
import p005C.C0041d;
import p005C.C0046i;
import p018H.C0188h;
import p018H.RunnableC0181a;
import p018H.RunnableC0182b;
import p023I1.C0222f;
import p023I1.C0223g;
import p027K.AbstractC0259C;
import p027K.AbstractC0272P;
import p027K.C0278W;
import p027K.C0312p;
import p027K.InterfaceC0314q;
import p034M0.C0360e;
import p058W.C0530a;
import p060X.C0533a;
import p060X.C0541i;
import p067a0.C0554a;
import p069b0.C0692a;
import p075d1.C0749a;
import p076e.AbstractActivityC0782f;
import p076e.C0789m;
import p076e.LayoutInflaterFactory2C0797u;
import p079f0.AbstractC0827X;
import p079f0.C0810F;
import p079f0.C0835c0;
import p079f0.C0841f0;
import p079f0.C0843g0;
import p083h.AbstractC0873a;
import p083h.C0878f;
import p086i.MenuC0892B;
import p086i.MenuC0907l;
import p088j.C0985d0;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p101o.C1155e;
import p101o.C1161k;
import p101o.C1162l;
import p107q.C1182f;
import p109q1.InterfaceC1185b;
import p112r1.AbstractC1199i;
import p112r1.C1192b;
import p118t1.AbstractC1232b;
import p118t1.AbstractC1244n;
import p118t1.InterfaceC1231a;
import p120u1.C1250e;
import p120u1.RunnableC1249d;
import p123v1.C1281k;
import p123v1.C1283m;
import p123v1.C1290t;
import p123v1.InterfaceC1274d;
import p126w1.AbstractC1302b;
import p135z1.C1340h;
import p135z1.C1343k;

/* renamed from: B.i */
/* loaded from: classes.dex */
public final class C0019i implements InterfaceC0314q, InterfaceC1274d, InterfaceC1185b {

    /* renamed from: a */
    public final /* synthetic */ int f46a;

    /* renamed from: b */
    public Object f47b;

    /* renamed from: c */
    public Object f48c;

    public /* synthetic */ C0019i(int i2, Object obj) {
        this.f46a = i2;
        this.f48c = obj;
    }

    /* renamed from: e */
    public static boolean m48e(Editable editable, KeyEvent keyEvent, boolean z2) {
        C0608v[] c0608vArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0608vArr = (C0608v[]) editable.getSpans(selectionStart, selectionEnd, C0608v.class)) != null && c0608vArr.length > 0) {
                for (C0608v c0608v : c0608vArr) {
                    int spanStart = editable.getSpanStart(c0608v);
                    int spanEnd = editable.getSpanEnd(c0608v);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: w */
    public static int m49w(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    /* renamed from: A */
    public void m50A(int i2, int i3) {
        int[] iArr = (int[]) this.f47b;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        m79u(i4);
        int[] iArr2 = (int[]) this.f47b;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.f47b, i2, i4, -1);
        ArrayList arrayList = (ArrayList) this.f48c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0835c0 c0835c0 = (C0835c0) ((ArrayList) this.f48c).get(size);
            int i5 = c0835c0.f3321a;
            if (i5 >= i2) {
                c0835c0.f3321a = i5 + i3;
            }
        }
    }

    /* renamed from: B */
    public void m51B(int i2, int i3) {
        int[] iArr = (int[]) this.f47b;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        m79u(i4);
        int[] iArr2 = (int[]) this.f47b;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.f47b;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f48c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0835c0 c0835c0 = (C0835c0) ((ArrayList) this.f48c).get(size);
            int i5 = c0835c0.f3321a;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((ArrayList) this.f48c).remove(size);
                } else {
                    c0835c0.f3321a = i5 - i3;
                }
            }
        }
    }

    /* renamed from: C */
    public void m52C(AbstractC0873a abstractC0873a) {
        C0605s c0605s = (C0605s) this.f47b;
        ((ActionMode.Callback) c0605s.f2011a).onDestroyActionMode(c0605s.m1542d(abstractC0873a));
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) this.f48c;
        if (layoutInflaterFactory2C0797u.f3181w != null) {
            layoutInflaterFactory2C0797u.f3170l.getDecorView().removeCallbacks(layoutInflaterFactory2C0797u.f3182x);
        }
        if (layoutInflaterFactory2C0797u.f3180v != null) {
            C0278W c0278w = layoutInflaterFactory2C0797u.f3183y;
            if (c0278w != null) {
                c0278w.m840b();
            }
            C0278W m811a = AbstractC0272P.m811a(layoutInflaterFactory2C0797u.f3180v);
            m811a.m839a(0.0f);
            layoutInflaterFactory2C0797u.f3183y = m811a;
            m811a.m842d(new C0789m(2, this));
        }
        layoutInflaterFactory2C0797u.f3179u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0797u.f3135A;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        AbstractC0259C.m739c(viewGroup);
        layoutInflaterFactory2C0797u.m2138I();
    }

    /* renamed from: D */
    public boolean m53D(AbstractC0873a abstractC0873a, MenuC0907l menuC0907l) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0797u) this.f48c).f3135A;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        AbstractC0259C.m739c(viewGroup);
        C0605s c0605s = (C0605s) this.f47b;
        C0878f m1542d = c0605s.m1542d(abstractC0873a);
        C1161k c1161k = (C1161k) c0605s.f2014d;
        Menu menu = (Menu) c1161k.getOrDefault(menuC0907l, null);
        if (menu == null) {
            menu = new MenuC0892B((Context) c0605s.f2012b, menuC0907l);
            c1161k.put(menuC0907l, menu);
        }
        return ((ActionMode.Callback) c0605s.f2011a).onPrepareActionMode(m1542d, menu);
    }

    /* renamed from: E */
    public void m54E(C0188h c0188h) {
        int i2 = c0188h.f549b;
        Handler handler = (Handler) this.f48c;
        C0046i c0046i = (C0046i) this.f47b;
        if (i2 != 0) {
            handler.post(new RunnableC0182b(c0046i, i2, 0));
        } else {
            handler.post(new RunnableC0181a(c0046i, 0, c0188h.f548a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m55F(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p002B.C0019i.m55F(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: G */
    public C0312p m56G(AbstractC0827X abstractC0827X, int i2) {
        C0843g0 c0843g0;
        C0312p c0312p;
        C1161k c1161k = (C1161k) this.f47b;
        int m2680e = c1161k.m2680e(abstractC0827X);
        if (m2680e >= 0 && (c0843g0 = (C0843g0) c1161k.m2685j(m2680e)) != null) {
            int i3 = c0843g0.f3369a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                c0843g0.f3369a = i4;
                if (i2 == 4) {
                    c0312p = c0843g0.f3370b;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0312p = c0843g0.f3371c;
                }
                if ((i4 & 12) == 0) {
                    c1161k.m2684i(m2680e);
                    c0843g0.f3369a = 0;
                    c0843g0.f3370b = null;
                    c0843g0.f3371c = null;
                    C0843g0.f3368d.mo632c(c0843g0);
                }
                return c0312p;
            }
        }
        return null;
    }

    /* renamed from: H */
    public void m57H(AbstractC0827X abstractC0827X) {
        C0843g0 c0843g0 = (C0843g0) ((C1161k) this.f47b).getOrDefault(abstractC0827X, null);
        if (c0843g0 == null) {
            return;
        }
        c0843g0.f3369a &= -2;
    }

    /* renamed from: I */
    public void m58I(AbstractC0827X abstractC0827X) {
        C1155e c1155e = (C1155e) this.f48c;
        int m2672e = c1155e.m2672e() - 1;
        while (true) {
            if (m2672e < 0) {
                break;
            }
            if (abstractC0827X == c1155e.m2673f(m2672e)) {
                Object[] objArr = c1155e.f4397c;
                Object obj = objArr[m2672e];
                Object obj2 = C1155e.f4394e;
                if (obj != obj2) {
                    objArr[m2672e] = obj2;
                    c1155e.f4395a = true;
                }
            } else {
                m2672e--;
            }
        }
        C0843g0 c0843g0 = (C0843g0) ((C1161k) this.f47b).remove(abstractC0827X);
        if (c0843g0 != null) {
            c0843g0.f3369a = 0;
            c0843g0.f3370b = null;
            c0843g0.f3371c = null;
            C0843g0.f3368d.mo632c(c0843g0);
        }
    }

    /* renamed from: J */
    public void m59J(int i2, int i3, int i4, int i5) {
        CardView cardView = (CardView) this.f48c;
        cardView.f1835d.set(i2, i3, i4, i5);
        Rect rect = cardView.f1834c;
        super/*android.view.View*/.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    /* renamed from: a */
    public void m60a(AbstractC0827X abstractC0827X, C0312p c0312p) {
        C1161k c1161k = (C1161k) this.f47b;
        C0843g0 c0843g0 = (C0843g0) c1161k.getOrDefault(abstractC0827X, null);
        if (c0843g0 == null) {
            c0843g0 = C0843g0.m2240a();
            c1161k.put(abstractC0827X, c0843g0);
        }
        c0843g0.f3371c = c0312p;
        c0843g0.f3369a |= 8;
    }

    @Override // p123v1.InterfaceC1274d
    /* renamed from: b */
    public void mo61b(C1340h c1340h, C1290t c1290t) {
        int intValue;
        C1281k c1281k;
        int i2;
        String str;
        switch (this.f46a) {
            case 3:
                AbstractC1136c.m2637e(c1340h, "call");
                C0605s c0605s = c1290t.f5293m;
                try {
                    ((C0222f) this.f47b).m619a(c1290t, c0605s);
                    C1343k m1543e = c0605s.m1543e();
                    C1281k c1281k2 = c1290t.f5286f;
                    int size = c1281k2.size();
                    int i3 = 0;
                    int i4 = 0;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    Integer num = null;
                    Integer num2 = null;
                    while (i4 < size) {
                        if (AbstractC1199i.m2766r0(c1281k2.m2965b(i4), "Sec-WebSocket-Extensions")) {
                            String m2967d = c1281k2.m2967d(i4);
                            int i5 = i3;
                            while (i5 < m2967d.length()) {
                                int i6 = 1;
                                int m2998g = AbstractC1302b.m2998g(m2967d, ',', i5, i3, 4);
                                int m2996e = AbstractC1302b.m2996e(m2967d, ';', i5, m2998g);
                                String m3017z = AbstractC1302b.m3017z(m2967d, i5, m2996e);
                                int i7 = m2996e + 1;
                                if (m3017z.equalsIgnoreCase("permessage-deflate")) {
                                    if (z2) {
                                        z5 = true;
                                    }
                                    while (i7 < m2998g) {
                                        int m2996e2 = AbstractC1302b.m2996e(m2967d, ';', i7, m2998g);
                                        int m2996e3 = AbstractC1302b.m2996e(m2967d, '=', i7, m2996e2);
                                        String m3017z2 = AbstractC1302b.m3017z(m2967d, i7, m2996e3);
                                        if (m2996e3 < m2996e2) {
                                            str = AbstractC1302b.m3017z(m2967d, m2996e3 + 1, m2996e2);
                                            c1281k = c1281k2;
                                            i2 = size;
                                            if (str.length() >= 2 && AbstractC1199i.m2760F0(str, "\"", false) && str.endsWith("\"")) {
                                                str = str.substring(i6, str.length() - 1);
                                                AbstractC1136c.m2636d(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                            }
                                        } else {
                                            c1281k = c1281k2;
                                            i2 = size;
                                            str = null;
                                        }
                                        int i8 = m2996e2 + 1;
                                        if (m3017z2.equalsIgnoreCase("client_max_window_bits")) {
                                            if (num != null) {
                                                z5 = true;
                                            }
                                            Integer m2762H0 = str != null ? AbstractC1199i.m2762H0(str) : null;
                                            num = m2762H0;
                                            if (m2762H0 != null) {
                                                i7 = i8;
                                                c1281k2 = c1281k;
                                                size = i2;
                                                i6 = 1;
                                            }
                                            z5 = true;
                                            i7 = i8;
                                            c1281k2 = c1281k;
                                            size = i2;
                                            i6 = 1;
                                        } else {
                                            if (m3017z2.equalsIgnoreCase("client_no_context_takeover")) {
                                                if (z3) {
                                                    z5 = true;
                                                }
                                                if (str != null) {
                                                    z5 = true;
                                                }
                                                z3 = true;
                                            } else if (m3017z2.equalsIgnoreCase("server_max_window_bits")) {
                                                if (num2 != null) {
                                                    z5 = true;
                                                }
                                                Integer m2762H02 = str != null ? AbstractC1199i.m2762H0(str) : null;
                                                num2 = m2762H02;
                                                if (m2762H02 != null) {
                                                }
                                                z5 = true;
                                            } else {
                                                if (m3017z2.equalsIgnoreCase("server_no_context_takeover")) {
                                                    if (z4) {
                                                        z5 = true;
                                                    }
                                                    if (str != null) {
                                                        z5 = true;
                                                    }
                                                    z4 = true;
                                                }
                                                z5 = true;
                                            }
                                            i7 = i8;
                                            c1281k2 = c1281k;
                                            size = i2;
                                            i6 = 1;
                                        }
                                    }
                                    z2 = true;
                                } else {
                                    z5 = true;
                                }
                                i5 = i7;
                                i3 = 0;
                                c1281k2 = c1281k2;
                                size = size;
                            }
                        }
                        i4++;
                        i3 = i3;
                        c1281k2 = c1281k2;
                        size = size;
                    }
                    ((C0222f) this.f47b).f635u = new C0223g(z2, num, z3, num2, z4, z5);
                    if (z5 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || 15 < intValue))) {
                        synchronized (((C0222f) this.f47b)) {
                            ((C0222f) this.f47b).f624j.clear();
                            ((C0222f) this.f47b).m620b("unexpected Sec-WebSocket-Extensions in response header", 1010);
                        }
                    }
                    try {
                        ((C0222f) this.f47b).m622d(AbstractC1302b.f5343g + " WebSocket " + ((C1283m) ((C1032t) this.f48c).f4045c).m2976f(), m1543e);
                        C0985d0 c0985d0 = ((C0222f) this.f47b).f632r;
                        c0985d0.getClass();
                        C1250e c1250e = (C1250e) c0985d0.f3904b;
                        c1250e.f4869e = true;
                        if (c1250e.f4871g != null) {
                            C1250e.m2920a(c1250e, new RunnableC1249d(c0985d0, 0));
                        }
                        ((C0222f) this.f47b).m623e();
                        return;
                    } catch (Exception e2) {
                        ((C0222f) this.f47b).m621c(e2);
                        return;
                    }
                } catch (IOException e3) {
                    if (c0605s != null) {
                        c0605s.m1539a(true, true, null);
                    }
                    ((C0222f) this.f47b).m621c(e3);
                    AbstractC1302b.m2994c(c1290t);
                    return;
                }
            default:
                InterfaceC1231a interfaceC1231a = (InterfaceC1231a) this.f47b;
                try {
                    JSONObject jSONObject = new JSONObject(c1290t.f5287g.m2984j());
                    if (jSONObject.getInt("code") == 701) {
                        interfaceC1231a.mo1683b("701");
                    } else if (jSONObject.getInt("code") == 0) {
                        if (AbstractC1244n.f4850d != null) {
                            new Handler(Looper.getMainLooper()).post(new RunnableC0181a(this, jSONObject.getString("msg"), 3));
                            AbstractC1244n.f4850d.m2651t();
                        }
                    } else if (jSONObject.getInt("code") == 1) {
                        AbstractC1232b.m2905d(jSONObject.getJSONObject("data"));
                        interfaceC1231a.mo1684c(jSONObject);
                    } else {
                        interfaceC1231a.mo1683b(jSONObject.getString("msg"));
                    }
                    return;
                } catch (JSONException e4) {
                    interfaceC1231a.mo1683b(e4.getMessage());
                    return;
                }
        }
    }

    @Override // p123v1.InterfaceC1274d
    /* renamed from: c */
    public void mo62c(C1340h c1340h, IOException iOException) {
        switch (this.f46a) {
            case 3:
                AbstractC1136c.m2637e(c1340h, "call");
                ((C0222f) this.f47b).m621c(iOException);
                break;
            default:
                ((InterfaceC1231a) this.f47b).mo1683b(iOException.getMessage());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // p027K.InterfaceC0314q
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p027K.C0319s0 mo63d(android.view.View r17, p027K.C0319s0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f48c
            F0.I r3 = (p014F0.C0132I) r3
            int r4 = r3.f356a
            java.lang.Object r5 = r0.f47b
            I.i r5 = (p021I.C0214i) r5
            K.q0 r6 = r2.f855a
            r7 = 7
            C.d r7 = r6.mo900f(r7)
            r8 = 32
            C.d r6 = r6.mo900f(r8)
            int r8 = r7.f108b
            java.lang.Object r9 = r5.f595b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            r9.f2565w = r8
            boolean r8 = p014F0.AbstractC0128E.m455e(r1)
            int r10 = r1.getPaddingBottom()
            int r11 = r1.getPaddingLeft()
            int r12 = r1.getPaddingRight()
            boolean r13 = r9.f2557o
            if (r13 == 0) goto L42
            int r10 = r2.m937a()
            r9.f2564v = r10
            int r14 = r3.f358c
            int r10 = r10 + r14
        L42:
            int r3 = r3.f357b
            boolean r14 = r9.f2558p
            int r15 = r7.f107a
            if (r14 == 0) goto L50
            if (r8 == 0) goto L4e
            r11 = r3
            goto L4f
        L4e:
            r11 = r4
        L4f:
            int r11 = r11 + r15
        L50:
            boolean r14 = r9.f2559q
            int r0 = r7.f109c
            if (r14 == 0) goto L5c
            if (r8 == 0) goto L59
            goto L5a
        L59:
            r4 = r3
        L5a:
            int r12 = r4 + r0
        L5c:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r4 = r9.f2561s
            r8 = 1
            if (r4 == 0) goto L6f
            int r4 = r3.leftMargin
            if (r4 == r15) goto L6f
            r3.leftMargin = r15
            r4 = r8
            goto L70
        L6f:
            r4 = 0
        L70:
            boolean r14 = r9.f2562t
            if (r14 == 0) goto L7b
            int r14 = r3.rightMargin
            if (r14 == r0) goto L7b
            r3.rightMargin = r0
            r4 = r8
        L7b:
            boolean r0 = r9.f2563u
            if (r0 == 0) goto L88
            int r0 = r3.topMargin
            int r7 = r7.f108b
            if (r0 == r7) goto L88
            r3.topMargin = r7
            goto L89
        L88:
            r8 = r4
        L89:
            if (r8 == 0) goto L8e
            r1.setLayoutParams(r3)
        L8e:
            int r0 = r1.getPaddingTop()
            r1.setPadding(r11, r0, r12, r10)
            boolean r0 = r5.f594a
            if (r0 == 0) goto L9d
            int r1 = r6.f110d
            r9.f2555m = r1
        L9d:
            if (r13 != 0) goto La3
            if (r0 == 0) goto La2
            goto La3
        La2:
            return r2
        La3:
            r9.m1915M()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p002B.C0019i.mo63d(android.view.View, K.s0):K.s0");
    }

    /* renamed from: f */
    public void m64f(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m64f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: g */
    public void m65g(boolean z2) {
        C0615E c0615e = (C0615E) this.f48c;
        AbstractActivityC0782f abstractActivityC0782f = c0615e.f2049n.f2250i;
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0615e.f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m65g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: h */
    public void m66h(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m66h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: i */
    public void m67i(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m67i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p109q1.InterfaceC1185b
    public Iterator iterator() {
        return new C1192b(this);
    }

    /* renamed from: j */
    public void m68j(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m68j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: k */
    public void m69k(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m69k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: l */
    public void m70l(boolean z2) {
        C0615E c0615e = (C0615E) this.f48c;
        AbstractActivityC0782f abstractActivityC0782f = c0615e.f2049n.f2250i;
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0615e.f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m70l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: m */
    public void m71m(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m71m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: n */
    public void m72n(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m72n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: o */
    public void m73o(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m73o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: p */
    public void m74p(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m74p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: q */
    public void m75q(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m75q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: r */
    public void m76r(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m76r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: s */
    public void m77s(boolean z2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = ((C0615E) this.f48c).f2051p;
        if (abstractComponentCallbacksC0641o != null) {
            abstractComponentCallbacksC0641o.m1668j().f2046k.m77s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: t */
    public void m78t(String str, PrintWriter printWriter) {
        C1162l c1162l = ((C0692a) this.f48c).f2464c;
        if (c1162l.f4426c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c1162l.f4426c <= 0) {
                return;
            }
            if (c1162l.f4425b[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c1162l.f4424a[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public String toString() {
        int lastIndexOf;
        switch (this.f46a) {
            case 5:
                return "Bounds{lower=" + ((C0041d) this.f47b) + " upper=" + ((C0041d) this.f48c) + "}";
            case 11:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Object obj = this.f47b;
                if (obj == null) {
                    sb.append("null");
                } else {
                    String simpleName = obj.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(lastIndexOf + 1);
                    }
                    sb.append(simpleName);
                    sb.append('{');
                    sb.append(Integer.toHexString(System.identityHashCode(obj)));
                }
                sb.append("}}");
                return sb.toString();
            case 19:
                String str = "[ ";
                if (((C1182f) this.f47b) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((C1182f) this.f47b).f4512h[i2] + " ";
                    }
                }
                return str + "] " + ((C1182f) this.f47b);
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m79u(int i2) {
        int[] iArr = (int[]) this.f47b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.f47b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f47b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f47b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* renamed from: v */
    public View m80v(int i2, int i3, int i4, int i5) {
        View m2192u;
        C0810F c0810f = (C0810F) this.f47b;
        int m2164d = c0810f.m2164d();
        int m2163c = c0810f.m2163c();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (c0810f.f3210a) {
                case 0:
                    m2192u = c0810f.f3211b.m2192u(i2);
                    break;
                default:
                    m2192u = c0810f.f3211b.m2192u(i2);
                    break;
            }
            int m2162b = c0810f.m2162b(m2192u);
            int m2161a = c0810f.m2161a(m2192u);
            C0841f0 c0841f0 = (C0841f0) this.f48c;
            c0841f0.f3359b = m2164d;
            c0841f0.f3360c = m2163c;
            c0841f0.f3361d = m2162b;
            c0841f0.f3362e = m2161a;
            if (i4 != 0) {
                c0841f0.f3358a = i4;
                if (c0841f0.m2239a()) {
                    return m2192u;
                }
            }
            if (i5 != 0) {
                c0841f0.f3358a = i5;
                if (c0841f0.m2239a()) {
                    view = m2192u;
                }
            }
            i2 += i6;
        }
        return view;
    }

    /* renamed from: x */
    public boolean m81x(CharSequence charSequence, int i2, int i3, C0600n c0600n) {
        if (c0600n.f1993c == 0) {
            C0590d c0590d = (C0590d) this.f48c;
            C0530a m1532b = c0600n.m1532b();
            int m732a = m1532b.m732a(8);
            if (m732a != 0) {
                ((ByteBuffer) m1532b.f759d).getShort(m732a + m1532b.f756a);
            }
            c0590d.getClass();
            ThreadLocal threadLocal = C0590d.f1964b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = c0590d.f1965a;
            String sb2 = sb.toString();
            int i4 = AbstractC0043f.f111a;
            c0600n.f1993c = AbstractC0042e.m148a(textPaint, sb2) ? 2 : 1;
        }
        return c0600n.f1993c == 2;
    }

    /* renamed from: y */
    public void m82y() {
        ((SparseIntArray) this.f47b).clear();
    }

    /* renamed from: z */
    public boolean m83z(View view) {
        C0810F c0810f = (C0810F) this.f47b;
        int m2164d = c0810f.m2164d();
        int m2163c = c0810f.m2163c();
        int m2162b = c0810f.m2162b(view);
        int m2161a = c0810f.m2161a(view);
        C0841f0 c0841f0 = (C0841f0) this.f48c;
        c0841f0.f3359b = m2164d;
        c0841f0.f3360c = m2163c;
        c0841f0.f3361d = m2162b;
        c0841f0.f3362e = m2161a;
        c0841f0.f3358a = 24579;
        return c0841f0.m2239a();
    }

    public /* synthetic */ C0019i(int i2, boolean z2) {
        this.f46a = i2;
    }

    public /* synthetic */ C0019i(Object obj, int i2, Object obj2) {
        this.f46a = i2;
        this.f47b = obj;
        this.f48c = obj2;
    }

    public /* synthetic */ C0019i(Object obj, Object obj2, int i2, boolean z2) {
        this.f46a = i2;
        this.f48c = obj;
        this.f47b = obj2;
    }

    public C0019i(InterfaceC0683r interfaceC0683r, C0664L c0664l) {
        C0692a c0692a;
        this.f46a = 11;
        this.f47b = interfaceC0683r;
        AbstractC1136c.m2637e(c0664l, "store");
        C0554a c0554a = C0554a.f1523b;
        AbstractC1136c.m2637e(c0554a, "defaultCreationExtras");
        String canonicalName = C0692a.class.getCanonicalName();
        if (canonicalName != null) {
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC1136c.m2637e(concat, "key");
            LinkedHashMap linkedHashMap = c0664l.f2300a;
            AbstractC0662J abstractC0662J = (AbstractC0662J) linkedHashMap.get(concat);
            if (C0692a.class.isInstance(abstractC0662J)) {
                AbstractC1136c.m2635c(abstractC0662J, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0554a.f1524a);
                linkedHashMap2.put(C0663K.f2299b, concat);
                try {
                    c0692a = new C0692a();
                } catch (AbstractMethodError unused) {
                    c0692a = new C0692a();
                }
                abstractC0662J = c0692a;
                AbstractC0662J abstractC0662J2 = (AbstractC0662J) linkedHashMap.put(concat, abstractC0662J);
                if (abstractC0662J2 != null) {
                    abstractC0662J2.mo1607a();
                }
            }
            this.f48c = (C0692a) abstractC0662J;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C0019i(C0615E c0615e) {
        this.f46a = 10;
        this.f47b = new CopyOnWriteArrayList();
        this.f48c = c0615e;
    }

    public C0019i(Runnable runnable) {
        this.f46a = 4;
        this.f48c = new CopyOnWriteArrayList();
        new HashMap();
        this.f47b = runnable;
    }

    public C0019i(C0605s c0605s, C0360e c0360e, C0590d c0590d) {
        this.f46a = 8;
        this.f47b = c0605s;
        this.f48c = c0590d;
    }

    public C0019i(C0810F c0810f) {
        this.f46a = 16;
        this.f47b = c0810f;
        C0841f0 c0841f0 = new C0841f0();
        c0841f0.f3358a = 0;
        this.f48c = c0841f0;
    }

    public C0019i(ArrayList arrayList, ArrayList arrayList2) {
        this.f46a = 0;
        int size = arrayList.size();
        this.f47b = new int[size];
        this.f48c = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f47b)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f48c)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public C0019i(int i2, int i3) {
        this.f46a = 0;
        this.f47b = new int[]{i2, i3};
        this.f48c = new float[]{0.0f, 1.0f};
    }

    public C0019i(int i2, int i3, int i4) {
        this.f46a = 0;
        this.f47b = new int[]{i2, i3, i4};
        this.f48c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0019i(EditText editText) {
        this.f46a = 6;
        this.f47b = editText;
        C0541i c0541i = new C0541i(editText);
        this.f48c = c0541i;
        editText.addTextChangedListener(c0541i);
        if (C0533a.f1478b == null) {
            synchronized (C0533a.f1477a) {
                try {
                    if (C0533a.f1478b == null) {
                        C0533a c0533a = new C0533a();
                        try {
                            C0533a.f1479c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0533a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0533a.f1478b = c0533a;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0533a.f1478b);
    }

    public C0019i(Animation animation) {
        this.f46a = 9;
        this.f47b = animation;
        this.f48c = null;
    }

    public C0019i(Animator animator) {
        this.f46a = 9;
        this.f47b = null;
        this.f48c = animator;
    }

    public C0019i(int i2) {
        this.f46a = i2;
        switch (i2) {
            case 17:
                this.f47b = new C1161k();
                this.f48c = new C1155e();
                break;
            default:
                this.f47b = new SparseIntArray();
                this.f48c = new SparseIntArray();
                break;
        }
    }

    public C0019i(CharSequence charSequence, C0749a c0749a) {
        this.f46a = 20;
        AbstractC1136c.m2637e(charSequence, "input");
        this.f47b = charSequence;
        this.f48c = c0749a;
    }
}
