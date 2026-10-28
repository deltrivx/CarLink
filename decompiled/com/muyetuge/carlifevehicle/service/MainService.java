package com.muyetuge.carlifevehicle.service;

import a2.f;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b3.i0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.util.Logger;
import hc.c;
import i9.l;
import java.io.IOException;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import t8.m;
import u8.p;
import u8.w;
import v7.a;
import v7.b;
import v7.e;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/muyetuge/carlifevehicle/service/MainService;", "Landroid/app/Service;", "<init>", "()V", "k8/d", "app_baiduRelease"}, k = 1, mv = {2, 1, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class MainService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2921a = 0;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.e(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() throws IOException {
        Object objB;
        super.onCreate();
        c cVar = n8.c.f8897a;
        n8.c.c(new i0(22));
        int i7 = 1;
        try {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(e.class);
            l.d(serviceLoaderLoad, "load(...)");
            objB = yb.l.U(new yb.c(2, new yb.c(0, new h(p.f0(serviceLoaderLoad), true, new a(3)), a.f13634c), new b(i7)));
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        Throwable thA = m.a(objB);
        if (thA != null) {
            Logger.INSTANCE.e("OptionLoader", ob.a.q("模块加载失败: ", thA.getMessage()));
            objB = w.f13122a;
        }
        for (e eVar : (List) objB) {
            try {
                eVar.a();
            } catch (Exception e7) {
                Logger.INSTANCE.e("OptionLoader", "【模块加载】模块初始化失败: ".concat(eVar.getClass().getSimpleName()), e7);
            }
        }
        CarLife.receiver().connect();
        Logger.INSTANCE.d("CarLife_Vehicle", "【连接服务】服务创建");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Logger.INSTANCE.d("CarLife_Vehicle", "【连接服务】服务销毁");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        Logger.INSTANCE.d("CarLife_Vehicle", f.D(i7, i10, "【连接服务】服务启动: flags=", ", startId="));
        return 1;
    }
}
