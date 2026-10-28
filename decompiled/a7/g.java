package a7;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Build;
import android.os.Parcelable;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z6.a {
    public static final Parcelable.Creator<g> CREATOR = new a(4);

    public static boolean A() {
        if (!n6.a.h()) {
            return false;
        }
        try {
            Class.forName(AppOpsManager.class.getName()).getDeclaredField("OP_GET_INSTALLED_APPS");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean B(Context context) {
        if (n6.a.f8864i == 76334938) {
            try {
                PermissionInfo permissionInfo = context.getPackageManager().getPermissionInfo("com.samsung.android.permission.GET_APP_LIST", 0);
                if (permissionInfo != null) {
                    if ((Build.VERSION.SDK_INT >= 28 ? permissionInfo.getProtection() : permissionInfo.protectionLevel & 15) == 1) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException e7) {
                e7.printStackTrace();
            }
        }
        return false;
    }

    public static boolean C(Context context) {
        try {
            PermissionInfo permissionInfo = context.getPackageManager().getPermissionInfo("com.android.permission.GET_INSTALLED_APPS", 0);
            if (permissionInfo != null) {
                return (Build.VERSION.SDK_INT >= 28 ? permissionInfo.getProtection() : permissionInfo.protectionLevel & 15) == 1;
            }
        } catch (PackageManager.NameNotFoundException e7) {
            e7.printStackTrace();
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "oem_installed_apps_runtime_permission_enable") == 1;
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // z6.a
    public final void d(Activity activity, ArrayList arrayList, v6.a aVar, List list, w6.c cVar) {
        super.d(activity, arrayList, aVar, list, cVar);
        if (activity.getApplicationInfo().targetSdkVersion >= 30 && z6.a.f("android.permission.QUERY_ALL_PACKAGES", list) == null && aVar.f13628d.isEmpty()) {
            throw new IllegalStateException("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"android.permission.QUERY_ALL_PACKAGES\" />, or add the app package name to the <queries> tag in the AndroidManifest.xml file");
        }
    }

    @Override // z6.a
    public final int h() {
        return 17;
    }

    @Override // z6.a
    public final int l(Context context) {
        if (d7.a.t()) {
            if (C(context)) {
                return 1;
            }
            if (!B(context) && n6.a.f8864i == 67983659) {
                String str = n6.a.k;
                if (str == null) {
                    str = "";
                }
                if (!str.isEmpty()) {
                    String[] strArrSplit = str.split("\\.");
                    if (strArrSplit.length != 0) {
                        try {
                            Integer.parseInt(strArrSplit[0]);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return 2;
    }

    @Override // z6.a
    public final String n() {
        return "com.android.permission.GET_INSTALLED_APPS";
    }

    @Override // z6.a
    public final List o(Context context, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if ((n6.a.g() && n6.a.j()) || (n6.a.i() && n6.a.j())) {
            arrayList.add(d7.a.p(context));
        } else if (n6.a.f8864i == 67983659) {
            arrayList.add(d7.a.n(context));
        }
        arrayList.add(d7.a.i(context, this));
        arrayList.add(d7.a.m());
        arrayList.add(d7.a.j());
        arrayList.add(d7.a.h());
        return arrayList;
    }

    @Override // z6.a
    public final boolean s(Activity activity) {
        if (d7.a.t()) {
            if (C(activity)) {
                return u(activity);
            }
            if (B(activity)) {
                return false;
            }
        }
        if (n6.a.h() && A() && n6.a.j()) {
            return !v(activity, true);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x0057  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    @Override // z6.a
    public final boolean v(Context context, boolean z10) {
        boolean z11;
        int i7;
        if (d7.a.t()) {
            if (C(context)) {
                return context.checkSelfPermission("com.android.permission.GET_INSTALLED_APPS") == 0;
            }
            if (B(context)) {
                return context.checkSelfPermission("com.samsung.android.permission.GET_APP_LIST") == 0;
            }
            if (n6.a.f8864i != 67983659) {
                z11 = false;
            } else {
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
                if (i7 >= 9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                int i10 = Settings.Secure.getInt(context.getContentResolver(), context.getPackageName() + "_op_56", -1);
                if (i10 != 4 && i10 != 6) {
                    return false;
                }
            } else if (A()) {
                return z6.a.a(context, "OP_GET_INSTALLED_APPS", 10022);
            }
        } else if (A() && n6.a.j()) {
            return z6.a.a(context, "OP_GET_INSTALLED_APPS", 10022);
        }
        return true;
    }

    @Override // z6.a
    public final boolean z(Context context) {
        boolean z10 = super.z(context);
        if (z10) {
            if (d7.a.t() && (C(context) || B(context))) {
                return true;
            }
            if (n6.a.h() && A()) {
                return n6.a.j();
            }
        }
        return z10;
    }
}
