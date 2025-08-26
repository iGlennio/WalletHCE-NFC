package p076e;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.fragment.app.AbstractC0632f;
import java.util.Calendar;
import p010D1.AbstractC0104l;
import p017G0.C0176h;

/* renamed from: e.q */
/* loaded from: classes.dex */
public final class C0793q extends AbstractC0632f {

    /* renamed from: c */
    public final /* synthetic */ int f3109c = 1;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0797u f3110d;

    /* renamed from: e */
    public final Object f3111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0793q(LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u, C0176h c0176h) {
        super(layoutInflaterFactory2C0797u);
        this.f3110d = layoutInflaterFactory2C0797u;
        this.f3111e = c0176h;
    }

    @Override // androidx.fragment.app.AbstractC0632f
    /* renamed from: e */
    public final IntentFilter mo1640e() {
        switch (this.f3109c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // androidx.fragment.app.AbstractC0632f
    /* renamed from: f */
    public final int mo1641f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f3109c) {
            case 0:
                return ((PowerManager) this.f3111e).isPowerSaveMode() ? 2 : 1;
            default:
                C0176h c0176h = (C0176h) this.f3111e;
                C0773E c0773e = (C0773E) c0176h.f517d;
                if (c0773e.f3008b > System.currentTimeMillis()) {
                    z2 = c0773e.f3007a;
                } else {
                    Context context = (Context) c0176h.f515b;
                    int m402g = AbstractC0104l.m402g(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0176h.f516c;
                    if (m402g == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (AbstractC0104l.m402g(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0772D.f3003d == null) {
                            C0772D.f3003d = new C0772D();
                        }
                        C0772D c0772d = C0772D.f3003d;
                        c0772d.m2063a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0772d.m2063a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0772d.f3006c == 1;
                        long j3 = c0772d.f3005b;
                        long j4 = c0772d.f3004a;
                        c0772d.m2063a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j5 = c0772d.f3005b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0773e.f3007a = z2;
                        c0773e.f3008b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // androidx.fragment.app.AbstractC0632f
    /* renamed from: h */
    public final void mo1643h() {
        switch (this.f3109c) {
            case 0:
                this.f3110d.m2139n(true, true);
                break;
            default:
                this.f3110d.m2139n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0793q(LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u, Context context) {
        super(layoutInflaterFactory2C0797u);
        this.f3110d = layoutInflaterFactory2C0797u;
        this.f3111e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
