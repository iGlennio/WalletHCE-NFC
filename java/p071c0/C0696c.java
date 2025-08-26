package p071c0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import p002B.C0019i;

/* renamed from: c0.c */
/* loaded from: classes.dex */
public final class C0696c {

    /* renamed from: f */
    public static final Object f2470f = new Object();

    /* renamed from: g */
    public static C0696c f2471g;

    /* renamed from: a */
    public final Context f2472a;

    /* renamed from: b */
    public final HashMap f2473b = new HashMap();

    /* renamed from: c */
    public final HashMap f2474c = new HashMap();

    /* renamed from: d */
    public final ArrayList f2475d = new ArrayList();

    /* renamed from: e */
    public final HandlerC0694a f2476e;

    public C0696c(Context context) {
        this.f2472a = context;
        this.f2476e = new HandlerC0694a(this, context.getMainLooper());
    }

    /* renamed from: a */
    public static C0696c m1882a(Context context) {
        C0696c c0696c;
        synchronized (f2470f) {
            try {
                if (f2471g == null) {
                    f2471g = new C0696c(context.getApplicationContext());
                }
                c0696c = f2471g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0696c;
    }

    /* renamed from: b */
    public final void m1883b(Intent intent) {
        ArrayList arrayList;
        synchronized (this.f2473b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2472a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f2474c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i2 = 0;
                    while (i2 < arrayList2.size()) {
                        C0695b c0695b = (C0695b) arrayList2.get(i2);
                        if (z2) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + c0695b.f2467a);
                        }
                        if (c0695b.f2469c) {
                            if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = c0695b.f2467a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z2) {
                                    StringBuilder sb = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c0695b);
                                c0695b.f2469c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z2) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i2++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                            ((C0695b) arrayList3.get(i3)).f2469c = false;
                        }
                        this.f2475d.add(new C0019i(intent, 12, arrayList3));
                        if (!this.f2476e.hasMessages(1)) {
                            this.f2476e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
