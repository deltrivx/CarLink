package k8;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import com.baidu.carlife.sdk.util.Logger;
import com.muyetuge.carlifevehicle.service.AccessService;
import i9.l;
import java.util.Iterator;
import java.util.List;
import t8.m;
import t8.o;
import u3.f;
import w7.g;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a() {
        Object next;
        Object objB;
        if (f.a((Context) g.f14171a.getValue(), "android.permission.WRITE_SECURE_SETTINGS") != 0) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【无障碍服务】修改安全设置未授权");
            return;
        }
        Object systemService = ((Context) AccessService.f2916e.getValue()).getSystemService("accessibility");
        l.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        List<AccessibilityServiceInfo> installedAccessibilityServiceList = ((AccessibilityManager) systemService).getInstalledAccessibilityServiceList();
        l.d(installedAccessibilityServiceList, "getInstalledAccessibilityServiceList(...)");
        Iterator<T> it = installedAccessibilityServiceList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!l.a(((AccessibilityServiceInfo) next).getResolveInfo().serviceInfo.packageName, ((Context) AccessService.f2916e.getValue()).getPackageName()));
        AccessibilityServiceInfo accessibilityServiceInfo = (AccessibilityServiceInfo) next;
        String id = accessibilityServiceInfo != null ? accessibilityServiceInfo.getId() : null;
        if (id == null) {
            id = "";
        }
        if (id.length() == 0) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【无障碍服务】未找到当前应用的无障碍服务");
            return;
        }
        o oVar = AccessService.f2916e;
        String string = Settings.Secure.getString(((Context) oVar.getValue()).getContentResolver(), "enabled_accessibility_services");
        String str = string != null ? string : "";
        if (j.r0(str, id, false)) {
            return;
        }
        Logger.INSTANCE.d("CarLife_Vehicle", "【无障碍服务】尝试保活无障碍服务");
        try {
            String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                String str3 = str2 + ":" + id;
                if (str3 != null) {
                    id = str3;
                }
            }
            objB = Boolean.valueOf(Settings.Secure.putString(((Context) oVar.getValue()).getContentResolver(), "enabled_accessibility_services", id));
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        Throwable thA = m.a(objB);
        if (thA != null) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【无障碍服务】修改无障碍服务失败，请检查权限", thA);
        }
    }
}
