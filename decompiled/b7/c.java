package b7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z6.a {
    public static final Parcelable.Creator<c> CREATOR = new a7.a(15);

    @Override // z6.a
    public final int h() {
        return 17;
    }

    @Override // z6.a
    public final String n() {
        return "android.permission.SYSTEM_ALERT_WINDOW";
    }

    @Override // z6.a
    public final List o(Context context, boolean z10) {
        Intent launchIntentForPackage;
        Intent launchIntentForPackage2;
        ArrayList arrayList = new ArrayList(7);
        if (d7.a.t()) {
            if (d7.a.r() && !n6.a.f() && n6.a.h() && n6.a.j()) {
                arrayList.add(d7.a.p(context));
            } else if (n6.a.f8864i == 67983659) {
                arrayList.add(d7.a.n(context));
            }
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(d7.a.o(context));
            arrayList.add(intent);
            arrayList.add(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION"));
        } else {
            int i7 = n6.a.f8864i;
            if (i7 == 2132284) {
                Intent intent2 = new Intent();
                intent2.setClassName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity");
                Intent intent3 = new Intent();
                intent3.setClassName("com.huawei.systemmanager", "com.huawei.notificationmanager.ui.NotificationManagmentActivity");
                String str = n6.a.k;
                if (str == null) {
                    str = "";
                }
                if (str.startsWith("3.0")) {
                    arrayList.add(intent3);
                    arrayList.add(intent2);
                } else {
                    arrayList.add(intent2);
                    arrayList.add(intent3);
                }
                ArrayList arrayList2 = new ArrayList(1);
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (launchIntentForPackage2 = packageManager.getLaunchIntentForPackage(d7.a.f3786a[0])) != null) {
                    arrayList2.add(launchIntentForPackage2);
                }
                arrayList.addAll(arrayList2);
            } else if (n6.a.h()) {
                if (n6.a.j()) {
                    arrayList.add(d7.a.p(context));
                }
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.add(new Intent("miui.intent.action.APP_MANAGER"));
                arrayList3.add(new Intent("miui.intent.action.SECURITY_CENTER"));
                PackageManager packageManager2 = context.getPackageManager();
                if (packageManager2 != null && (launchIntentForPackage = packageManager2.getLaunchIntentForPackage(d7.a.f3787b[0])) != null) {
                    arrayList3.add(launchIntentForPackage);
                }
                arrayList.addAll(arrayList3);
            } else if (i7 == 67983659) {
                arrayList.add(d7.a.n(context));
            } else if (i7 == -1680767897) {
                Intent intent4 = new Intent();
                intent4.setClassName("com.oppo.safe", "com.oppo.safe.permission.PermissionTopActivity");
                arrayList.add(intent4);
                ArrayList arrayList4 = new ArrayList(4);
                PackageManager packageManager3 = context.getPackageManager();
                if (packageManager3 != null) {
                    for (int i10 = 0; i10 < 4; i10++) {
                        Intent launchIntentForPackage3 = packageManager3.getLaunchIntentForPackage(d7.a.f3788c[i10]);
                        if (launchIntentForPackage3 != null) {
                            arrayList4.add(launchIntentForPackage3);
                        }
                    }
                }
                arrayList.addAll(arrayList4);
            } else if (i7 == -294058204) {
                ArrayList arrayList5 = new ArrayList(2);
                PackageManager packageManager4 = context.getPackageManager();
                if (packageManager4 != null) {
                    for (int i11 = 0; i11 < 2; i11++) {
                        Intent launchIntentForPackage4 = packageManager4.getLaunchIntentForPackage(d7.a.f3789d[i11]);
                        if (launchIntentForPackage4 != null) {
                            arrayList5.add(launchIntentForPackage4);
                        }
                    }
                }
                arrayList.addAll(arrayList5);
            } else if (i7 == 76334938) {
                Intent intent5 = new Intent();
                intent5.setClassName("com.android.settings", "com.android.settings.Settings$AppOpsDetailsActivity");
                Bundle bundle = new Bundle();
                bundle.putString("package", context.getPackageName());
                intent5.putExtra(":settings:show_fragment_args", bundle);
                intent5.setData(d7.a.o(context));
                arrayList.add(intent5);
            } else if (i7 == 1805724132 && Build.VERSION.SDK_INT < 22) {
                ArrayList arrayList6 = new ArrayList(2);
                arrayList6.add(new Intent("com.smartisanos.security.action.PACKAGE_OVERVIEW"));
                Intent intent6 = new Intent();
                intent6.setClassName("com.smartisanos.security", "com.smartisanos.security.PackagesOverview");
                arrayList6.add(intent6);
                arrayList.addAll(arrayList6);
                ArrayList arrayList7 = new ArrayList(2);
                PackageManager packageManager5 = context.getPackageManager();
                if (packageManager5 != null) {
                    for (int i12 = 0; i12 < 2; i12++) {
                        Intent launchIntentForPackage5 = packageManager5.getLaunchIntentForPackage(d7.a.f3790e[i12]);
                        if (launchIntentForPackage5 != null) {
                            arrayList7.add(launchIntentForPackage5);
                        }
                    }
                }
                arrayList.addAll(arrayList7);
            }
        }
        arrayList.add(d7.a.i(context, this));
        arrayList.add(d7.a.m());
        arrayList.add(d7.a.j());
        arrayList.add(d7.a.h());
        return arrayList;
    }

    @Override // z6.a
    public final boolean v(Context context, boolean z10) {
        return d7.a.t() ? Settings.canDrawOverlays(context) : z6.a.a(context, "OP_SYSTEM_ALERT_WINDOW", 24);
    }

    @Override // z6.a
    public final boolean y() {
        return true;
    }
}
