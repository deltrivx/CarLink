package j;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends e6.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6859c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f6860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, a2.b bVar) {
        super(b0Var);
        this.f6860d = b0Var;
        this.f6861e = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, Context context) {
        super(b0Var);
        this.f6860d = b0Var;
        this.f6861e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // e6.f
    public final IntentFilter e() {
        switch (this.f6859c) {
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

    @Override // e6.f
    public final int h() {
        Location location;
        boolean z10;
        long j5;
        Location lastKnownLocation;
        switch (this.f6859c) {
            case 0:
                return u.a((PowerManager) this.f6861e) ? 2 : 1;
            default:
                a2.b bVar = (a2.b) this.f6861e;
                h0.a aVar = (h0.a) bVar.f14d;
                LocationManager locationManager = (LocationManager) bVar.f13c;
                if (aVar.f6278b <= System.currentTimeMillis()) {
                    Context context = (Context) bVar.f12b;
                    Location lastKnownLocation2 = null;
                    if (n3.r.h(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (n3.r.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z10 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (h0.f6800d == null) {
                            h0.f6800d = new h0();
                        }
                        h0 h0Var = h0.f6800d;
                        h0Var.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        h0Var.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z10 = h0Var.f6803c == 1;
                        long j10 = h0Var.f6802b;
                        long j11 = h0Var.f6801a;
                        h0Var.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j12 = h0Var.f6802b;
                        if (j10 == -1 || j11 == -1) {
                            j5 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j11) {
                                j10 = j12;
                            } else if (jCurrentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j5 = j10 + 60000;
                        }
                        aVar.f6277a = z10;
                        aVar.f6278b = j5;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i7 = Calendar.getInstance().get(11);
                        if (i7 < 6 || i7 >= 22) {
                            z10 = true;
                        }
                    }
                    break;
                } else {
                    z10 = aVar.f6277a;
                }
                return z10 ? 2 : 1;
        }
    }

    @Override // e6.f
    public final void l() throws IllegalAccessException {
        switch (this.f6859c) {
            case 0:
                this.f6860d.k(true, true);
                break;
            default:
                this.f6860d.k(true, true);
                break;
        }
    }
}
