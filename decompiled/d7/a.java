package d7;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f3786a = {"com.huawei.systemmanager"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f3787b = {"com.miui.securitycenter"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f3788c = {"com.coloros.safecenter", "com.oplus.safecenter", "com.color.safecenter", "com.oppo.safe"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f3789d = {"com.bairenkeji.icaller", "com.iqoo.secure"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f3790e = {"com.smartisanos.securitycenter", "com.smartisanos.security"};

    public static boolean a(Context context, Intent intent) {
        PackageManager packageManager;
        if (intent == null || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        return !(Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)).isEmpty() : packageManager.queryIntentActivities(intent, 65536).isEmpty());
    }

    public static ArrayList b(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        if (objArr.length != 0) {
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean c(String str, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (v(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(ArrayList arrayList, String str) {
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (v(((z6.a) it.next()).n(), str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(ArrayList arrayList, z6.a aVar) {
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (v(aVar.n(), ((z6.a) it.next()).n())) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.hashCode() == str2.hashCode()) {
            return true;
        }
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            if (str.charAt(i7) != str2.charAt(i7)) {
                return false;
            }
        }
        return true;
    }

    public static Activity g(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper) || (context = ((ContextWrapper) context).getBaseContext()) == null) {
                return null;
            }
        }
        return (Activity) context;
    }

    public static Intent h() {
        return new Intent("android.settings.SETTINGS");
    }

    public static Intent i(Context context, z6.a... aVarArr) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(o(context));
        if (aVarArr != null && aVarArr.length > 0 && n6.a.f8864i == -1680767897) {
            Bundle bundle = new Bundle();
            ArrayList<String> arrayList = new ArrayList<>();
            for (z6.a aVar : aVarArr) {
                arrayList.add(aVar.n());
            }
            bundle.putStringArrayList("permissionList", arrayList);
            intent.putExtras(bundle);
            intent.putExtra("isGetPermission", true);
        }
        return intent;
    }

    public static Intent j() {
        return new Intent("android.settings.APPLICATION_SETTINGS");
    }

    public static List k(Context context, List list, boolean z10) {
        if (list.isEmpty()) {
            return l(context);
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z6.a aVar = (z6.a) it.next();
            if (aVar.h() > Build.VERSION.SDK_INT) {
                arrayList.remove(aVar);
            } else {
                List listK = aVar.k();
                if (listK != null) {
                    ArrayList arrayList2 = (ArrayList) listK;
                    if (!arrayList2.isEmpty()) {
                        if (aVar.l(context) != 2) {
                            if (!arrayList2.isEmpty()) {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    if (((z6.a) it2.next()).l(context) == 2) {
                                    }
                                }
                            }
                        }
                        arrayList.removeAll(listK);
                        break;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return l(context);
        }
        if (arrayList.size() == 1) {
            return ((z6.a) arrayList.get(0)).o(context, z10);
        }
        List listO = ((z6.a) arrayList.get(0)).o(context, z10);
        int i7 = 1;
        loop2: while (i7 < arrayList.size()) {
            List listO2 = ((z6.a) arrayList.get(i7)).o(context, z10);
            if (listO2.size() != listO.size()) {
                break;
            }
            for (int i10 = 0; i10 < listO2.size(); i10++) {
                if (!((Intent) listO2.get(i10)).filterEquals((Intent) listO.get(i10))) {
                    break loop2;
                }
            }
            if (i7 == arrayList.size() - 1) {
                return listO2;
            }
            i7++;
            listO = listO2;
        }
        return l(context);
    }

    public static ArrayList l(Context context) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(i(context, null));
        arrayList.add(m());
        arrayList.add(j());
        arrayList.add(h());
        return arrayList;
    }

    public static Intent m() {
        return new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
    }

    public static Intent n(Context context) {
        return new Intent("com.meizu.safe.security.SHOW_APPSEC").putExtra("packageName", context.getPackageName());
    }

    public static Uri o(Context context) {
        return Uri.parse("package:" + context.getPackageName());
    }

    public static Intent p(Context context) {
        return new Intent("miui.intent.action.APP_PERM_EDITOR").putExtra("extra_pkgname", context.getPackageName());
    }

    public static boolean q(Activity activity) {
        return activity == null || activity.isDestroyed() || activity.isFinishing();
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean u(Context context, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((z6.a) it.next()).v(context, true)) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.hashCode() == str2.hashCode()) {
            return true;
        }
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i7 = length - 1; i7 >= 0; i7--) {
            if (str.charAt(i7) != str2.charAt(i7)) {
                return false;
            }
        }
        return true;
    }
}
