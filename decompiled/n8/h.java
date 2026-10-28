package n8;

import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import b3.i0;
import com.baidu.carlife.sdk.util.Logger;
import e2.g0;
import java.io.ByteArrayInputStream;
import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import l0.t0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t8.o f8903a = t8.a.d(new i0(26));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t8.o f8904b = t8.a.d(new i0(27));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t8.o f8905c = t8.a.d(new i0(28));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f8906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t8.o f8907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t8.o f8908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t8.o f8909g;

    static {
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            str = "未知";
        }
        f8906d = str;
        String str2 = Build.MODEL;
        String str3 = Build.BRAND;
        String str4 = Build.MANUFACTURER;
        t8.a.d(new i0(29));
        f8907e = t8.a.d(new f(0));
        f8908f = t8.a.d(new i0(24));
        String str5 = Build.FINGERPRINT;
        String[] strArr = Build.SUPPORTED_ABIS;
        i9.l.d(strArr, "SUPPORTED_ABIS");
        u8.l.L0(strArr);
        f8909g = t8.a.d(new i0(25));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public static String a() {
        String hostAddress;
        Object objB;
        Object objInvoke;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        LinkProperties linkProperties;
        Object next;
        Context applicationContext = a.b().getApplicationContext();
        if (Build.VERSION.SDK_INT >= 23) {
            Object systemService = applicationContext.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1) || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
                hostAddress = null;
            } else {
                List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
                i9.l.d(linkAddresses, "getLinkAddresses(...)");
                yb.g gVar = new yb.g(new yb.h(yb.l.S(u8.p.f0(linkAddresses), new t0(17)), true, g.f8901c));
                do {
                    if (!gVar.hasNext()) {
                        next = null;
                        break;
                    }
                    next = gVar.next();
                } while (((Inet4Address) next).isLoopbackAddress());
                Inet4Address inet4Address = (Inet4Address) next;
                if (inet4Address != null) {
                    hostAddress = inet4Address.getHostAddress();
                } else {
                    hostAddress = null;
                }
            }
        } else {
            Object systemService2 = applicationContext.getSystemService("wifi");
            WifiManager wifiManager = systemService2 instanceof WifiManager ? (WifiManager) systemService2 : null;
            if (wifiManager != null) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                int ipAddress = connectionInfo != null ? connectionInfo.getIpAddress() : 0;
                if (ipAddress == 0) {
                    hostAddress = null;
                } else {
                    hostAddress = (ipAddress & 255) + "." + ((ipAddress >> 8) & 255) + "." + ((ipAddress >> 16) & 255) + "." + ((ipAddress >> 24) & 255);
                }
            } else {
                hostAddress = null;
            }
        }
        if (hostAddress != null && hostAddress.length() != 0) {
            Logger.INSTANCE.d("CarLife_Vehicle", "检测到 WiFi IP: ".concat(hostAddress));
            return hostAddress;
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            i9.l.d(networkInterfaces, "getNetworkInterfaces(...)");
            yb.q qVarS = yb.l.S(new yb.h(new yb.h(new yb.i(yb.l.M(new g0(networkInterfaces)), new t0(18), yb.o.f15282i), true, g.f8900b), true, new t0(19)), new t0(20));
            Iterator it = qVarS.f15285a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = qVarS.f15286b.invoke(it.next());
                String str = (String) objInvoke;
                if (str != null && str.length() != 0) {
                    break;
                }
            }
            objB = (String) objInvoke;
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        String str2 = (String) (objB instanceof t8.l ? null : objB);
        if (str2 == null || str2.length() == 0) {
            return "127.0.0.1";
        }
        Logger.INSTANCE.d("CarLife_Vehicle", "检测到 热点 IP: ".concat(str2));
        return str2;
    }

    public static DisplayMetrics b() {
        Object value = f8903a.getValue();
        i9.l.d(value, "getValue(...)");
        return (DisplayMetrics) value;
    }

    public static int c() {
        int identifier = a.b().getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return a.b().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int d() {
        int identifier = a.b().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return a.b().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static t8.j e() {
        t8.j jVar;
        Object systemService = a.b().getSystemService("window");
        i9.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            jVar = new t8.j(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            jVar = new t8.j(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        }
        return new t8.j(Integer.valueOf(((Number) jVar.f12830a).intValue()), Integer.valueOf(((Number) jVar.f12831b).intValue()));
    }

    public static String f(byte[] bArr) {
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
            i9.l.c(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(((X509Certificate) certificateGenerateCertificate).getEncoded());
            i9.l.b(bArrDigest);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "");
            int i7 = 0;
            for (byte b10 : bArrDigest) {
                i7++;
                if (i7 > 1) {
                    sb2.append((CharSequence) ":");
                }
                sb2.append((CharSequence) String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
            }
            sb2.append((CharSequence) "");
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
