package m0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8392a = new a();

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    public static ArrayList a(Context context) {
        String str;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
        ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
        int size = listQueryIntentActivities.size();
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i7);
            ResolveInfo resolveInfo2 = resolveInfo;
            if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                arrayList.add(resolveInfo);
            } else {
                ActivityInfo activityInfo = resolveInfo2.activityInfo;
                if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        return arrayList;
    }
}
