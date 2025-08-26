package p083h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.nfupay.s145.R;

/* renamed from: h.d */
/* loaded from: classes.dex */
public final class C0876d extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f3506f;

    /* renamed from: a */
    public int f3507a;

    /* renamed from: b */
    public Resources.Theme f3508b;

    /* renamed from: c */
    public LayoutInflater f3509c;

    /* renamed from: d */
    public Configuration f3510d;

    /* renamed from: e */
    public Resources f3511e;

    public C0876d(Context context, int i2) {
        super(context);
        this.f3507a = i2;
    }

    /* renamed from: a */
    public final void m2293a(Configuration configuration) {
        if (this.f3511e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f3510d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f3510d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m2294b() {
        if (this.f3508b == null) {
            this.f3508b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3508b.setTo(theme);
            }
        }
        this.f3508b.applyStyle(this.f3507a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(p083h.C0876d.f3506f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f3511e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f3510d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = p083h.C0876d.f3506f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p083h.C0876d.f3506f = r1
        L1c:
            android.content.res.Configuration r1 = p083h.C0876d.f3506f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f3510d
            android.content.Context r0 = p083h.AbstractC0875c.m2292a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f3511e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f3511e = r0
        L38:
            android.content.res.Resources r0 = r3.f3511e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p083h.C0876d.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3509c == null) {
            this.f3509c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3509c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3508b;
        if (theme != null) {
            return theme;
        }
        if (this.f3507a == 0) {
            this.f3507a = R.style.Theme_AppCompat_Light;
        }
        m2294b();
        return this.f3508b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f3507a != i2) {
            this.f3507a = i2;
            m2294b();
        }
    }
}
