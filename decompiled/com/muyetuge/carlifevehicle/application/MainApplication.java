package com.muyetuge.carlifevehicle.application;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import b8.h2;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.util.Logger;
import com.muyetuge.carlifevehicle.service.AccessService;
import com.muyetuge.carlifevehicle.service.BaseService;
import d8.k;
import d8.u;
import d8.v;
import fc.h0;
import hc.c;
import i9.l;
import i9.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import kotlin.Metadata;
import n8.a;
import n8.d;
import t8.j;
import t8.m;
import t8.o;
import u8.b0;
import u8.p;
import u8.w;
import yb.b;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/muyetuge/carlifevehicle/application/MainApplication;", "Landroid/app/Application;", "<init>", "()V", "i2/c", "app_baiduRelease"}, k = 1, mv = {2, 1, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class MainApplication extends Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MainApplication f2914a;

    @Override // android.app.Application
    public final void onCreate() throws IllegalAccessException, IOException {
        String str;
        Object objB;
        List list = w.f13122a;
        super.onCreate();
        f2914a = this;
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid && runningAppProcessInfo.processName.endsWith(":phoenix")) {
                    return;
                }
            }
        }
        Context contextB = a.b();
        o oVar = d.f8898a;
        int i7 = 4;
        CarLife.init(contextB, "20352101", "12345678", b0.W0(new j(Configs.FEATURE_CONFIG_USB_MTU, Integer.valueOf(d.b(16384, Configs.FEATURE_CONFIG_USB_MTU))), new j(Configs.FEATURE_CONFIG_I_FRAME_INTERVAL, Integer.valueOf(d.b(300, Configs.FEATURE_CONFIG_I_FRAME_INTERVAL))), new j(Configs.FEATURE_CONFIG_CONNECT_TYPE, Integer.valueOf(d.b(5, Configs.FEATURE_CONFIG_CONNECT_TYPE))), new j(Configs.FEATURE_CONFIG_VOICE_WAKEUP, Integer.valueOf(d.b(1, Configs.FEATURE_CONFIG_VOICE_WAKEUP))), new j(Configs.FEATURE_CONFIG_VOICE_MIC, Integer.valueOf(d.b(1, Configs.FEATURE_CONFIG_VOICE_MIC))), new j(Configs.FEATURE_CONFIG_AUDIO_TRANSMISSION_MODE, Integer.valueOf(d.b(0, Configs.FEATURE_CONFIG_AUDIO_TRANSMISSION_MODE))), new j(Configs.FEATURE_CONFIG_BLUETOOTH_AUTO_PAIR, Integer.valueOf(d.b(1, Configs.FEATURE_CONFIG_BLUETOOTH_AUTO_PAIR))), new j(Configs.FEATURE_CONFIG_AAC_SUPPORT, Integer.valueOf(d.b(0, Configs.FEATURE_CONFIG_AAC_SUPPORT))), new j(Configs.FEATURE_CONFIG_MUSIC_HUD, Integer.valueOf(d.b(0, Configs.FEATURE_CONFIG_MUSIC_HUD)))), b0.W0(new j(Configs.CONFIG_LOG_LEVEL, Integer.valueOf(d.a("TEST_LOGS_SAVE", true) ? 3 : 6)), new j(Configs.CONFIG_CONNECT_TIMEOUT, Integer.valueOf(d.b(10, Configs.CONFIG_CONNECT_TIMEOUT))), new j(Configs.CONFIG_TARGET_IP_GET, Integer.valueOf(d.b(0, Configs.CONFIG_TARGET_IP_GET))), new j(Configs.CONFIG_TARGET_IP_ADDRESS, d.d(Configs.CONFIG_TARGET_IP_ADDRESS, "")), new j(Configs.CONFIG_WIFI_DIRECT_BLE, Integer.valueOf(d.b(1, Configs.CONFIG_WIFI_DIRECT_BLE))), new j(Configs.CONFIG_WIFI_DIRECT_NAME, d.d(Configs.CONFIG_WIFI_DIRECT_NAME, "")), new j(Configs.CONFIG_WIFI_DIRECT_GROUP, Integer.valueOf(d.b(0, Configs.CONFIG_WIFI_DIRECT_GROUP)))));
        Logger.Companion companion = Logger.INSTANCE;
        PackageInfo packageInfo = (PackageInfo) a.f8893b.getValue();
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            str = "未知版本";
        }
        companion.d("CarLife_Vehicle", "【初始配置】初始化: v".concat(str));
        c cVar = v.f3842a;
        try {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(h2.class);
            l.d(serviceLoaderLoad, "load(...)");
            b bVar = new b(new h(p.f0(serviceLoaderLoad), true, new k(i7)).iterator(), k.f3818d);
            if (bVar.hasNext()) {
                Object next = bVar.next();
                if (bVar.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (bVar.hasNext()) {
                        arrayList.add(bVar.next());
                    }
                    objB = arrayList;
                } else {
                    objB = n3.l.I(next);
                }
            } else {
                objB = list;
            }
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        Throwable thA = m.a(objB);
        if (thA != null) {
            Logger.INSTANCE.e("OptionLoader", ob.a.q("模块加载失败: ", thA.getMessage()));
            objB = list;
        }
        List list2 = (List) objB;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list2) {
            String name = ((h2) obj).getName();
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            String str2 = (String) entry2.getKey();
            List list3 = (List) entry2.getValue();
            Logger.INSTANCE.e("CarLife_Vehicle", y.f6689a.b(h2.class).l() + " 中 name 重复：'" + str2 + "'，模块：" + p.q0(list3, null, null, null, k.f3819e, 31));
        } else {
            list = list2;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((h2) it2.next()).a();
        }
        cc.b0.s(v.f3842a, null, new u(2, null), 3);
        h0 h0Var = AccessService.f2915d;
        k8.a.a();
        z6.a aVar = BaseService.f2920a;
        k8.c.a();
    }
}
