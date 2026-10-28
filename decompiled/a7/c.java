package a7;

import android.app.Activity;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z6.a {
    public static final Parcelable.Creator<c> CREATOR = new a(1);

    @Override // z6.a
    public final void d(Activity activity, ArrayList arrayList, v6.a aVar, List list, w6.c cVar) {
        super.d(activity, arrayList, aVar, list, cVar);
        if (31 > z6.a.i(activity, aVar)) {
            z6.a.b(list, "android.permission.BLUETOOTH_ADMIN", 30);
        }
    }

    @Override // z6.a
    public final int h() {
        return 31;
    }

    @Override // z6.a
    public final int j(Activity activity) {
        return 23;
    }

    @Override // z6.a
    public final String m() {
        return d7.a.s() ? "nearby_devices_group" : "location_group";
    }

    @Override // z6.a
    public final String n() {
        return "android.permission.BLUETOOTH_ADVERTISE";
    }
}
