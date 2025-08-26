package p076e;

/* renamed from: e.k */
/* loaded from: classes.dex */
public final class RunnableC0787k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3098a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0797u f3099b;

    public /* synthetic */ RunnableC0787k(LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u, int i2) {
        this.f3098a = i2;
        this.f3099b = layoutInflaterFactory2C0797u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r3.isLaidOut() != false) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            e.u r1 = r6.f3099b
            r2 = 0
            int r3 = r6.f3098a
            switch(r3) {
                case 0: goto L54;
                default: goto L9;
            }
        L9:
            android.widget.PopupWindow r3 = r1.f3181w
            androidx.appcompat.widget.ActionBarContextView r4 = r1.f3180v
            r5 = 55
            r3.showAtLocation(r4, r5, r2, r2)
            K.W r3 = r1.f3183y
            if (r3 == 0) goto L19
            r3.m840b()
        L19:
            boolean r3 = r1.f3184z
            if (r3 == 0) goto L2a
            android.view.ViewGroup r3 = r1.f3135A
            if (r3 == 0) goto L2a
            java.util.WeakHashMap r4 = p027K.AbstractC0272P.f768a
            boolean r3 = r3.isLaidOut()
            if (r3 == 0) goto L2a
            goto L2b
        L2a:
            r0 = r2
        L2b:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L49
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f3180v
            r4 = 0
            r0.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f3180v
            K.W r0 = p027K.AbstractC0272P.m811a(r0)
            r0.m839a(r3)
            r1.f3183y = r0
            e.m r1 = new e.m
            r1.<init>(r2, r6)
            r0.m842d(r1)
            goto L53
        L49:
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f3180v
            r0.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f3180v
            r0.setVisibility(r2)
        L53:
            return
        L54:
            int r3 = r1.f3160Z
            r0 = r0 & r3
            if (r0 == 0) goto L5c
            r1.m2145v(r2)
        L5c:
            int r0 = r1.f3160Z
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L67
            r0 = 108(0x6c, float:1.51E-43)
            r1.m2145v(r0)
        L67:
            r1.f3159Y = r2
            r1.f3160Z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.RunnableC0787k.run():void");
    }
}
