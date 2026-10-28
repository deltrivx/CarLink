package n8;

import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.baidu.carlife.sdk.util.Logger;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t8.o f8930a = t8.a.d(new f(2));

    public static void a() {
        if (Build.VERSION.SDK_INT < 26) {
            try {
                WifiManager wifiManagerC = c();
                Method method = wifiManagerC != null ? wifiManagerC.getClass().getMethod("setWifiApEnabled", WifiConfiguration.class, Boolean.TYPE) : null;
                if (method != null) {
                    method.invoke(c(), null, Boolean.FALSE);
                    return;
                }
                return;
            } catch (Exception e7) {
                hc.c cVar = c.f8897a;
                c.j(0, "关闭热点失败");
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【热点开关】关闭热点失败: ", e7.getMessage()));
                return;
            }
        }
        try {
            Object systemService = a.b().getSystemService("connectivity");
            i9.l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Method declaredMethod = connectivityManager.getClass().getDeclaredMethod("stopTethering", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(connectivityManager, 0);
        } catch (Exception e10) {
            hc.c cVar2 = c.f8897a;
            c.j(0, "stopTethering 失败");
            Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【热点开关】stopTethering 失败: ", e10.getMessage()));
        }
    }

    public static WifiConfiguration b(String str, String str2) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = str;
        wifiConfiguration.preSharedKey = a2.f.G("\"", str2, "\"");
        wifiConfiguration.allowedKeyManagement.set(4);
        try {
            wifiConfiguration.getClass().getField("apBand").setInt(wifiConfiguration, 1);
        } catch (Exception unused) {
        }
        return wifiConfiguration;
    }

    public static WifiManager c() {
        return (WifiManager) f8930a.getValue();
    }

    public static void d(String str, String str2) {
        WifiConfiguration wifiConfigurationB;
        Method declaredMethod;
        i9.l.e(str, "ssid");
        i9.l.e(str2, "password");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            try {
                Class<?> cls = Class.forName("android.net.wifi.SoftApConfiguration$Builder");
                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                cls.getMethod("setSsid", String.class).invoke(objNewInstance, str);
                Class<?> cls2 = Integer.TYPE;
                cls.getMethod("setPassphrase", String.class, cls2).invoke(objNewInstance, str2, 1);
                try {
                    cls.getMethod("setBand", cls2).invoke(objNewInstance, 1);
                } catch (Exception unused) {
                }
                Object objInvoke = cls.getMethod("build", null).invoke(objNewInstance, null);
                WifiManager wifiManagerC = c();
                declaredMethod = wifiManagerC != null ? wifiManagerC.getClass().getDeclaredMethod("startSoftAp", Class.forName("android.net.wifi.SoftApConfiguration")) : null;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
                if (declaredMethod != null) {
                    declaredMethod.invoke(c(), objInvoke);
                    return;
                }
                return;
            } catch (Exception e7) {
                hc.c cVar = c.f8897a;
                c.j(0, "SoftApConfiguration 反射失败");
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【热点开关】SoftApConfiguration 反射失败: ", e7.getMessage()));
                return;
            }
        }
        if (i7 < 26) {
            try {
                WifiConfiguration wifiConfigurationB2 = b(str, str2);
                WifiManager wifiManagerC2 = c();
                declaredMethod = wifiManagerC2 != null ? wifiManagerC2.getClass().getMethod("setWifiApEnabled", WifiConfiguration.class, Boolean.TYPE) : null;
                if (declaredMethod != null) {
                    declaredMethod.invoke(c(), wifiConfigurationB2, Boolean.TRUE);
                    return;
                }
                return;
            } catch (Exception e10) {
                hc.c cVar2 = c.f8897a;
                c.j(0, "setWifiApEnabled 失败");
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【热点开关】setWifiApEnabled 失败: ", e10.getMessage()));
                return;
            }
        }
        try {
            WifiManager wifiManagerC3 = c();
            Method method = wifiManagerC3 != null ? wifiManagerC3.getClass().getMethod("getWifiApConfiguration", null) : null;
            Object objInvoke2 = method != null ? method.invoke(c(), null) : null;
            wifiConfigurationB = objInvoke2 instanceof WifiConfiguration ? (WifiConfiguration) objInvoke2 : null;
        } catch (Exception unused2) {
        }
        if (wifiConfigurationB == null) {
            try {
                wifiConfigurationB = b(str, str2);
            } catch (Exception e11) {
                hc.c cVar3 = c.f8897a;
                c.j(0, "startSoftAp(WifiConfiguration) 失败");
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【热点开关】startSoftAp(WifiConfiguration) 失败: ", e11.getMessage()));
                return;
            }
        }
        try {
            wifiConfigurationB.getClass().getField("apBand").setInt(wifiConfigurationB, 1);
        } catch (Exception unused3) {
        }
        WifiManager wifiManagerC4 = c();
        declaredMethod = wifiManagerC4 != null ? wifiManagerC4.getClass().getDeclaredMethod("startSoftAp", WifiConfiguration.class) : null;
        if (declaredMethod != null) {
            declaredMethod.setAccessible(true);
        }
        if (declaredMethod != null) {
            declaredMethod.invoke(c(), wifiConfigurationB);
        }
    }
}
