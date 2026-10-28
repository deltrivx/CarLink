package com.muyetuge.carlifevehicle.service;

import a2.f;
import a7.i;
import a8.w1;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import com.baidu.carlifevehicle.R;
import com.muyetuge.carlifevehicle.activity.MainActivity;
import i9.l;
import k8.b;
import kotlin.Metadata;
import s.s;
import z6.a;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/muyetuge/carlifevehicle/service/BaseService;", "Landroid/app/Service;", "<init>", "()V", "k8/c", "app_baiduRelease"}, k = 1, mv = {2, 1, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BaseService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2920a;

    static {
        s sVar = x6.a.f14604a;
        a iVar = (a) sVar.a("android.permission.POST_NOTIFICATIONS");
        if (iVar == null) {
            iVar = new i(0);
            sVar.b("android.permission.POST_NOTIFICATIONS", iVar);
        }
        f2920a = iVar;
    }

    public final void a() {
        try {
            Object systemService = getSystemService("notification");
            l.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                b.o();
                notificationManager.createNotificationChannel(w1.d());
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent(this, (Class<?>) MainActivity.class);
            }
            Notification notificationBuild = (i7 >= 26 ? b.a(this) : new Notification.Builder(this)).setSmallIcon(R.mipmap.ic_carlife).setContentTitle("百度CarLife+").setContentText("投屏服务正在运行").setContentIntent(PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592)).setAutoCancel(false).setOngoing(true).setShowWhen(true).setWhen(System.currentTimeMillis()).build();
            l.d(notificationBuild, "build(...)");
            if (i7 < 34) {
                startForeground(2, notificationBuild);
                return;
            }
            try {
                startForeground(2, notificationBuild, 2);
            } catch (Exception e7) {
                Logger.INSTANCE.e("CarLife_Vehicle", "Android 14 startForeground 失败: " + e7.getMessage());
                startForeground(2, notificationBuild);
            }
        } catch (Exception e10) {
            Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("启动前台服务失败: ", e10.getMessage()));
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.e(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
        Logger.INSTANCE.d("CarLife_Vehicle", "【前台服务】服务创建");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Logger.INSTANCE.d("CarLife_Vehicle", "【前台服务】服务销毁");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        a();
        Logger.INSTANCE.d("CarLife_Vehicle", f.D(i7, i10, "【前台服务】服务启动: flags=", ", startId="));
        return 1;
    }
}
