package a7;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z6.a {
    public static final Parcelable.Creator<e> CREATOR = new a(3);

    @Override // z6.a
    public final void d(Activity activity, ArrayList arrayList, v6.a aVar, List list, w6.c cVar) {
        String str;
        super.d(activity, arrayList, aVar, list, cVar);
        if (31 > z6.a.i(activity, aVar)) {
            z6.a.b(list, "android.permission.BLUETOOTH_ADMIN", 30);
            z6.a.b(list, "android.permission.ACCESS_FINE_LOCATION", 30);
        }
        if (d7.a.d(arrayList, "android.permission.ACCESS_FINE_LOCATION") || cVar == null || (cVar.f14146c & w6.c.f14143d) != 0) {
            return;
        }
        if (cVar.f14145b != Integer.MAX_VALUE) {
            str = "android:maxSdkVersion=\"" + cVar.f14145b + "\" ";
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder("If your app doesn't use ");
        sb2.append(cVar.f14144a);
        sb2.append(" to get physical location, please change the <uses-permission android:name=\"");
        sb2.append(cVar.f14144a);
        sb2.append("\" ");
        sb2.append(str);
        sb2.append("/> node in the manifest file to <uses-permission android:name=\"");
        sb2.append(cVar.f14144a);
        sb2.append("\" android:usesPermissionFlags=\"neverForLocation\" ");
        sb2.append(str);
        sb2.append("/> node, if your app need use \"");
        throw new IllegalArgumentException(ob.a.s(sb2, cVar.f14144a, "\" to get physical location, also need to add \"android.permission.ACCESS_FINE_LOCATION\" permissions"));
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
    public final List k() {
        return d7.a.b(x6.a.c());
    }

    @Override // z6.a
    public final String m() {
        return d7.a.s() ? "nearby_devices_group" : "location_group";
    }

    @Override // z6.a
    public final String n() {
        return "android.permission.BLUETOOTH_SCAN";
    }

    @Override // z6.a
    public final boolean t(Activity activity) {
        return x6.a.c().s(activity);
    }

    @Override // z6.a
    public final boolean w(Context context, boolean z10) {
        return x6.a.c().v(context, z10);
    }
}
