package b3;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.view.Display;
import b8.a1;
import b8.b1;
import b8.b2;
import b8.c2;
import b8.d1;
import b8.e1;
import b8.g1;
import b8.h1;
import b8.j1;
import b8.k1;
import b8.k2;
import b8.m1;
import b8.n1;
import b8.p1;
import b8.q1;
import b8.s1;
import b8.t1;
import b8.u0;
import b8.v0;
import b8.v1;
import b8.w1;
import b8.x0;
import b8.y0;
import b8.y1;
import b8.z1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.receiver.CarLifeReceiver;
import com.muyetuge.carlifevehicle.activity.EmptyActivity;
import com.muyetuge.carlifevehicle.application.MainApplication;
import com.muyetuge.carlifevehicle.service.AccessService;
import f1.x2;
import java.lang.annotation.Annotation;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1372a;

    public /* synthetic */ i0(int i7) {
        this.f1372a = i7;
    }

    @Override // h9.a
    public final Object invoke() {
        Object objB;
        float refreshRate;
        Object string = null;
        switch (this.f1372a) {
            case 0:
                return j0.f1384d;
            case 1:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 2:
                i9.z zVar = i9.y.f6689a;
                return new mc.d(zVar.b(c2.class), new o9.c[]{zVar.b(b8.d.class), zVar.b(b8.g.class), zVar.b(b8.j.class), zVar.b(b8.m.class), zVar.b(b8.p.class), zVar.b(b8.s.class), zVar.b(b8.v.class), zVar.b(b8.y.class), zVar.b(b8.b0.class), zVar.b(b8.f0.class), zVar.b(b8.i0.class), zVar.b(b8.l0.class), zVar.b(b8.o0.class), zVar.b(b8.r0.class), zVar.b(u0.class), zVar.b(x0.class), zVar.b(a1.class), zVar.b(d1.class), zVar.b(g1.class), zVar.b(j1.class), zVar.b(m1.class), zVar.b(p1.class), zVar.b(s1.class), zVar.b(v1.class), zVar.b(y1.class), zVar.b(b2.class)}, new mc.a[]{b8.b.f1566a, b8.e.f1580a, b8.h.f1596a, b8.k.f1604a, b8.n.f1618a, b8.q.f1635a, b8.t.f1654a, b8.w.f1664a, b8.z.f1673a, b8.d0.f1574a, b8.g0.f1591a, b8.j0.f1601a, b8.m0.f1609a, b8.p0.f1633a, b8.s0.f1647a, v0.f1660a, y0.f1670a, b1.f1569a, e1.f1581a, h1.f1597a, k1.f1605a, n1.f1619a, q1.f1636a, t1.f1655a, w1.f1665a, z1.f1674a}, new Annotation[0]);
            case 3:
                return new pc.c(k2.f1606a);
            case 4:
                return new pc.c(k2.f1606a);
            case 5:
                return c2.Companion.serializer();
            case 6:
                MainApplication mainApplication = MainApplication.f2914a;
                return i2.c.A();
            case 7:
                return new d0.x();
            case 8:
                Object systemService = n8.a.b().getSystemService("sensor");
                i9.l.c(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                return (SensorManager) systemService;
            case 9:
                return new f0.u(0, 0);
            case 10:
                f1.t.d("Unexpected call to default provider");
                throw new cc.s();
            case 11:
                CarLifeReceiver carLifeReceiverReceiver = CarLife.receiver();
                if (carLifeReceiverReceiver.isConnected()) {
                    carLifeReceiverReceiver.disconnect();
                }
                return Boolean.FALSE;
            case 12:
                return new g0.v(0, 0);
            case 13:
                t8.o oVar = EmptyActivity.f2911y;
                MainApplication mainApplication2 = MainApplication.f2914a;
                return i2.c.A();
            case 14:
                return t8.z.f12851a;
            case 15:
                Object systemService2 = n8.a.b().getSystemService("audio");
                i9.l.c(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
                return (AudioManager) systemService2;
            case 16:
                MainApplication mainApplication3 = MainApplication.f2914a;
                return i2.c.A();
            case 17:
                fc.h0 h0Var = AccessService.f2915d;
                MainApplication mainApplication4 = MainApplication.f2914a;
                return i2.c.A();
            case 18:
                x2 x2Var = l0.n.f7764a;
                return null;
            case 19:
                return Boolean.TRUE;
            case 20:
                MainApplication mainApplication5 = MainApplication.f2914a;
                return i2.c.A();
            case 21:
                try {
                    PackageManager packageManager = n8.a.b().getPackageManager();
                    String packageName = n8.a.b().getPackageName();
                    i9.l.d(packageName, "getPackageName(...)");
                    objB = packageManager.getPackageInfo(packageName, 0);
                    break;
                } catch (Throwable th) {
                    objB = t8.a.b(th);
                }
                return (PackageInfo) (objB instanceof t8.l ? null : objB);
            case 22:
                throw new RuntimeException("Resource Error");
            case 23:
                return n8.a.b().getSharedPreferences("CarLifePrefs", 0);
            case 24:
                t8.o oVar2 = n8.h.f8903a;
                return Float.valueOf(n8.h.b().density);
            case 25:
                try {
                    Object systemService3 = n8.a.b().getSystemService("display");
                    i9.l.c(systemService3, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
                    Display display = ((DisplayManager) systemService3).getDisplay(0);
                    refreshRate = display != null ? display.getRefreshRate() : 30.0f;
                    break;
                } catch (Exception unused) {
                }
                return Float.valueOf(refreshRate);
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return n8.a.b().getResources().getDisplayMetrics();
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                t8.o oVar3 = n8.d.f8898a;
                String strD = n8.d.d("UUID", "");
                string = strD.length() > 0 ? strD : null;
                if (string != null) {
                    return string;
                }
                String string2 = UUID.randomUUID().toString();
                i9.l.d(string2, "toString(...)");
                String strR0 = zb.j.R0(8, string2);
                n8.d.g("UUID", strR0);
                return strR0;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                String str = Build.BRAND + " " + Build.MODEL;
                try {
                    if (Build.VERSION.SDK_INT >= 25) {
                        string = Settings.Global.getString(n8.a.b().getContentResolver(), "device_name");
                        break;
                    }
                    return string == null ? str : string;
                } catch (SecurityException | Exception unused2) {
                    return str;
                }
            default:
                t8.o oVar4 = n8.h.f8903a;
                return n8.h.b().widthPixels + "x" + n8.h.b().heightPixels;
        }
    }
}
