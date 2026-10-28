package z6;

import a2.f;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.carlife.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.p;
import u6.b;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15740a;

    public /* synthetic */ a(int i7) {
        this.f15740a = i7;
    }

    public static boolean a(Context context, String str, int i7) {
        int iIntValue;
        AppOpsManager appOpsManager = d7.a.t() ? (AppOpsManager) context.getSystemService(AppOpsManager.class) : (AppOpsManager) context.getSystemService("appops");
        if (appOpsManager == null) {
            iIntValue = -1;
        } else {
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                try {
                    i7 = ((Integer) cls.getDeclaredField(str).get(Integer.class)).intValue();
                } catch (NoSuchFieldException unused) {
                }
                Class<?> cls2 = Integer.TYPE;
                iIntValue = ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(i7), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue();
            } catch (Exception e7) {
                e7.printStackTrace();
                iIntValue = -1;
            }
        }
        return iIntValue == -1 || iIntValue == 0;
    }

    public static void b(List list, String str, int i7) {
        c(list != null ? f(str, list) : null, str, i7);
    }

    public static void c(c cVar, String str, int i7) {
        if (cVar == null) {
            throw new IllegalStateException(f.G("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"", str, "\" />"));
        }
        int i10 = cVar.f14145b;
        if (i10 < i7) {
            StringBuilder sb2 = new StringBuilder("The AndroidManifest.xml file <uses-permission android:name=\"");
            sb2.append(str);
            sb2.append("\" android:maxSdkVersion=\"");
            sb2.append(i10);
            sb2.append("\" /> does not meet the requirements, ");
            sb2.append(i7 != Integer.MAX_VALUE ? f.E(i7, "the minimum requirement for maxSdkVersion is ") : f.F("please delete the android:maxSdkVersion=\"", "\" attribute", i10));
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static c f(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (d7.a.v(cVar.f14144a, str)) {
                return cVar;
            }
        }
        return null;
    }

    public static int i(Activity activity, v6.a aVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return activity.getApplicationInfo().minSdkVersion;
        }
        p pVar = aVar.f13626b;
        if (pVar == null) {
            return 17;
        }
        return pVar.f12922a;
    }

    public void d(Activity activity, ArrayList arrayList, v6.a aVar, List list, c cVar) {
        if (y()) {
            c(cVar, n(), Integer.MAX_VALUE);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public void e(Activity activity, ArrayList arrayList) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return d7.a.v(n(), ((a) obj).n());
        }
        if (!(obj instanceof String)) {
            return false;
        }
        return d7.a.v(n(), (String) obj);
    }

    public List g() {
        return null;
    }

    public abstract int h();

    public int j(Activity activity) {
        return h();
    }

    public List k() {
        return null;
    }

    public int l(Context context) {
        switch (this.f15740a) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    public String m() {
        return null;
    }

    public abstract String n();

    public List o(Context context, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (n6.a.i() && n6.a.j()) {
            arrayList.add(d7.a.p(context));
        } else if (n6.a.g() && n6.a.j()) {
            String str = n6.a.k;
            if (str == null) {
                str = "";
            }
            if (!str.matches("^2\\.0\\.[0-5]\\.\\d+$")) {
                arrayList.add(d7.a.p(context));
            }
        } else if (n6.a.f8864i == 67983659) {
            arrayList.add(d7.a.n(context));
        }
        arrayList.add(d7.a.i(context, this));
        arrayList.add(d7.a.m());
        arrayList.add(d7.a.j());
        arrayList.add(d7.a.h());
        return arrayList;
    }

    public int p(Context context) {
        return 0;
    }

    public int q(Context context) {
        switch (this.f15740a) {
            case 1:
                if (!z(context)) {
                    return 0;
                }
                int i7 = d7.a.r() ? Constants.MSG_RESPONSE_SUCCESS : 300;
                int i10 = n6.a.f8864i;
                if (i10 == 2132284 || i10 == 1583864138 || i10 == -182666708) {
                    return Build.VERSION.SDK_INT >= 26 ? 300 : 500;
                }
                return i7;
            default:
                return 0;
        }
    }

    public boolean r(Context context) {
        List listG = g();
        if (listG == null) {
            return false;
        }
        return !((ArrayList) listG).isEmpty();
    }

    public boolean s(Activity activity) {
        switch (this.f15740a) {
            case 0:
                return h() > Build.VERSION.SDK_INT ? t(activity) : u(activity);
            default:
                return false;
        }
    }

    public boolean t(Activity activity) {
        return false;
    }

    public final String toString() {
        return n();
    }

    public boolean u(Activity activity) {
        boolean zBooleanValue;
        if (!d7.a.t() || !d7.a.c(n(), b.f13071a) || activity.checkSelfPermission(n()) == 0) {
            return false;
        }
        String strN = n();
        if (Build.VERSION.SDK_INT == 31) {
            try {
                zBooleanValue = ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), strN)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
                e7.printStackTrace();
                zBooleanValue = activity.shouldShowRequestPermissionRationale(strN);
            }
        } else {
            zBooleanValue = activity.shouldShowRequestPermissionRationale(strN);
        }
        return !zBooleanValue;
    }

    public boolean v(Context context, boolean z10) {
        return h() > Build.VERSION.SDK_INT ? w(context, z10) : x(context, z10);
    }

    public boolean w(Context context, boolean z10) {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
    }

    public boolean x(Context context, boolean z10) {
        return !d7.a.t() || context.checkSelfPermission(n()) == 0;
    }

    public boolean y() {
        switch (this.f15740a) {
            case 0:
                return true;
            default:
                return this instanceof b7.b;
        }
    }

    public boolean z(Context context) {
        return h() <= Build.VERSION.SDK_INT;
    }
}
