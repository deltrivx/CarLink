package b7;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z6.a {
    public static final Parcelable.Creator<b> CREATOR = new a7.a(14);

    @Override // z6.a
    public final int h() {
        return 23;
    }

    @Override // z6.a
    public final String n() {
        return "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    @Override // z6.a
    public final List o(Context context, boolean z10) {
        Intent intent;
        Intent intent2;
        ArrayList arrayList = new ArrayList(7);
        if (d7.a.t()) {
            intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(d7.a.o(context));
            if (v(context, z10) && !n6.a.f()) {
                intent = null;
            }
        } else {
            intent = null;
        }
        if (d7.a.s()) {
            intent2 = new Intent("android.settings.VIEW_ADVANCED_POWER_USAGE_DETAIL");
            intent2.setData(d7.a.o(context));
        } else {
            intent2 = null;
        }
        Intent intent3 = d7.a.t() ? new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS") : null;
        if (!z10 || (d7.a.r() && (n6.a.f() || n6.a.h()))) {
            if (intent != null) {
                arrayList.add(intent);
            }
            if (intent2 != null) {
                arrayList.add(intent2);
            }
            if (intent3 != null) {
                arrayList.add(intent3);
            }
        } else {
            if (intent2 != null) {
                arrayList.add(intent2);
            }
            if (intent3 != null) {
                arrayList.add(intent3);
            }
            if (intent != null) {
                arrayList.add(intent);
            }
        }
        if (n6.a.f() || n6.a.h()) {
            arrayList.add(d7.a.i(context, this));
            arrayList.add(d7.a.m());
            arrayList.add(d7.a.j());
        }
        arrayList.add(d7.a.h());
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    @Override // z6.a
    public final int q(Context context) {
        int i7;
        if (!z(context)) {
            return 0;
        }
        if (!n6.a.f()) {
            if (n6.a.h() && d7.a.r()) {
                return 1000;
            }
            return super.q(context);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            return super.q(context);
        }
        if (i10 < 34) {
            return 1000;
        }
        String str = n6.a.k;
        if (str == null) {
            str = "";
        }
        if (str.isEmpty()) {
            i7 = -1;
        } else {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 0) {
                i7 = -1;
            } else {
                try {
                    i7 = Integer.parseInt(strArrSplit[0]);
                } catch (Exception unused) {
                    i7 = -1;
                }
            }
        }
        if (i7 < 2) {
            return 1000;
        }
        return super.q(context);
    }

    @Override // z6.a
    public final boolean v(Context context, boolean z10) {
        if (!d7.a.t()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        if (powerManager == null) {
            return false;
        }
        return powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
    }
}
