package a7;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z6.a {
    public static final Parcelable.Creator<b> CREATOR = new a(0);

    @Override // z6.a
    public final void d(Activity activity, ArrayList arrayList, v6.a aVar, List list, w6.c cVar) {
        super.d(activity, arrayList, aVar, list, cVar);
        if (activity.getApplicationInfo().targetSdkVersion < 31) {
            z6.a.b(list, "android.permission.ACCESS_FINE_LOCATION", Integer.MAX_VALUE);
        } else {
            z6.a.b(list, "android.permission.ACCESS_COARSE_LOCATION", Integer.MAX_VALUE);
            z6.a.b(list, "android.permission.ACCESS_FINE_LOCATION", Integer.MAX_VALUE);
        }
    }

    @Override // z6.a
    public final void e(Activity activity, ArrayList arrayList) {
        if (activity.getApplicationInfo().targetSdkVersion >= 31 && d7.a.d(arrayList, "android.permission.ACCESS_COARSE_LOCATION") && !d7.a.d(arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
            throw new IllegalArgumentException("Applying for background positioning permissions must include \"android.permission.ACCESS_FINE_LOCATION\"");
        }
        int i7 = -1;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            z6.a aVar = (z6.a) arrayList.get(i12);
            if (d7.a.v(aVar.n(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                i10 = i12;
            } else if (d7.a.v(aVar.n(), "android.permission.ACCESS_FINE_LOCATION")) {
                i7 = i12;
            } else if (d7.a.v(aVar.n(), "android.permission.ACCESS_COARSE_LOCATION")) {
                i11 = i12;
            }
        }
        if (i7 != -1 && i7 > i10) {
            throw new IllegalArgumentException("Please place the android.permission.ACCESS_BACKGROUND_LOCATION\" permission after the \"android.permission.ACCESS_FINE_LOCATION\" permission");
        }
        if (i11 != -1 && i11 > i10) {
            throw new IllegalArgumentException("Please place the \"android.permission.ACCESS_BACKGROUND_LOCATION\" permission after the \"android.permission.ACCESS_COARSE_LOCATION\" permission");
        }
    }

    @Override // z6.a
    public final List g() {
        return d7.a.s() ? d7.a.b(x6.a.c(), x6.a.b()) : d7.a.b(x6.a.c());
    }

    @Override // z6.a
    public final int h() {
        return 29;
    }

    @Override // z6.a
    public final String m() {
        return "location_group";
    }

    @Override // z6.a
    public final String n() {
        return "android.permission.ACCESS_BACKGROUND_LOCATION";
    }

    @Override // z6.a
    public final int p(Context context) {
        return z(context) ? 150 : 0;
    }

    @Override // z6.a
    public final boolean r(Context context) {
        return true;
    }

    @Override // z6.a
    public final boolean t(Activity activity) {
        return x6.a.c().s(activity);
    }

    @Override // z6.a
    public final boolean u(Activity activity) {
        if (d7.a.s()) {
            if (!x6.a.c().v(activity, true) && !x6.a.b().v(activity, true)) {
                return x6.a.c().s(activity) && x6.a.b().s(activity);
            }
        } else if (!x6.a.c().v(activity, true)) {
            return x6.a.c().s(activity);
        }
        return super.u(activity);
    }

    @Override // z6.a
    public final boolean w(Context context, boolean z10) {
        return x6.a.c().v(context, z10);
    }

    @Override // z6.a
    public final boolean x(Context context, boolean z10) {
        if (d7.a.s()) {
            if (!x6.a.c().v(context, z10) && !x6.a.b().v(context, z10)) {
                return false;
            }
        } else if (!x6.a.c().v(context, z10)) {
            return false;
        }
        return super.x(context, z10);
    }
}
