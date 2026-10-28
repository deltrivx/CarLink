package a8;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.os.Build;
import b8.g2;
import b8.h2;
import com.baidu.carlife.sdk.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f115a = g2.f1594b;

    public static void d(String str, String str2, h9.k kVar) {
        i9.l.e(str, "ssid");
        i9.l.e(str2, "password");
        Object systemService = n8.a.b().getApplicationContext().getSystemService("wifi");
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null) {
            kVar.invoke("WifiManager不可用");
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (!wifiManager.isWifiEnabled()) {
                try {
                    Intent intent = new Intent("android.settings.panel.action.WIFI");
                    intent.setFlags(268435456);
                    n8.a.b().startActivity(intent);
                    kVar.invoke("请在系统界面手动开启WiFi");
                    return;
                } catch (Exception unused) {
                    kVar.invoke("WiFi未开启");
                    return;
                }
            }
            WifiNetworkSpecifier wifiNetworkSpecifierBuild = v1.c().setSsid(str).setWpa2Passphrase(str2).build();
            i9.l.d(wifiNetworkSpecifierBuild, "build(...)");
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).setNetworkSpecifier(w1.k(wifiNetworkSpecifierBuild)).build();
            Object systemService2 = n8.a.b().getSystemService("connectivity");
            i9.l.c(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
            connectivityManager.requestNetwork(networkRequestBuild, new b2(connectivityManager, kVar, str));
            return;
        }
        if (!wifiManager.setWifiEnabled(true)) {
            kVar.invoke("WiFi未开启");
            return;
        }
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = a2.f.G("\"", str, "\"");
        wifiConfiguration.preSharedKey = a2.f.G("\"", str2, "\"");
        int iAddNetwork = wifiManager.addNetwork(wifiConfiguration);
        if (iAddNetwork == -1) {
            kVar.invoke("添加网络失败: ".concat(str));
            return;
        }
        wifiManager.disconnect();
        wifiManager.enableNetwork(iAddNetwork, true);
        wifiManager.reconnect();
        c2 c2Var = new c2(0, kVar, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        u3.f.g(n8.a.b(), c2Var, intentFilter);
    }

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new c1(this, null, 1));
    }

    @Override // b8.h2
    public final String b() {
        return "WiFi连接";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [u8.w] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v2 */
    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        char c10;
        char c11;
        char c12;
        ?? r24;
        List<WifiConfiguration> configuredNetworks;
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(310905631);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.f(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            Object systemService = n8.a.b().getApplicationContext().getSystemService("wifi");
            WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
            int i11 = 1;
            ?? arrayList = u8.w.f13122a;
            if (wifiManager == null) {
                Logger.INSTANCE.d("CarLife_Vehicle", "WifiManager不可用");
                r24 = arrayList;
                c10 = 4;
                c11 = 2;
                c12 = 1;
            } else {
                if (Build.VERSION.SDK_INT < 29 && (configuredNetworks = wifiManager.getConfiguredNetworks()) != null) {
                    arrayList = new ArrayList(u8.q.a0(configuredNetworks, 10));
                    Iterator it = configuredNetworks.iterator();
                    while (it.hasNext()) {
                        String str = ((WifiConfiguration) it.next()).SSID;
                        i9.l.d(str, "SSID");
                        char[] cArr = new char[i11];
                        cArr[0] = '\"';
                        int length = str.length() - i11;
                        int i12 = 0;
                        boolean z11 = false;
                        while (i12 <= length) {
                            char cCharAt = str.charAt(!z11 ? i12 : length);
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i11) {
                                    i13 = -1;
                                    break;
                                } else {
                                    if (cCharAt == cArr[i13]) {
                                        break;
                                    }
                                    i13++;
                                    i11 = 1;
                                }
                            }
                            boolean z12 = i13 >= 0;
                            if (z11) {
                                if (!z12) {
                                    break;
                                } else {
                                    length--;
                                }
                            } else if (z12) {
                                i12++;
                            } else {
                                i11 = 1;
                                z11 = true;
                            }
                            i11 = 1;
                        }
                        arrayList.add(str.subSequence(i12, length + 1).toString());
                        i11 = 1;
                    }
                }
                c10 = 4;
                c11 = 2;
                c12 = 1;
                r24 = arrayList;
            }
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s("");
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s("");
                sVar.h0(objC);
            }
            f1.b1 b1Var2 = (f1.b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC2);
            }
            f1.b1 b1Var3 = (f1.b1) objC2;
            sVar.p(false);
            Activity activity = (Activity) sVar.j(d.c.f3530a);
            z6.a aVarF = x6.a.f();
            z6.a aVarE = x6.a.e();
            z6.a aVarD = x6.a.d();
            z6.a aVarB = x6.a.b();
            z6.a aVarC = x6.a.c();
            z6.a aVarA = x6.a.a();
            z6.a aVarG = x6.a.g();
            z6.a[] aVarArr = new z6.a[7];
            aVarArr[0] = aVarF;
            aVarArr[c12] = aVarE;
            aVarArr[c11] = aVarD;
            aVarArr[3] = aVarB;
            aVarArr[c10] = aVarC;
            aVarArr[5] = aVarA;
            aVarArr[6] = aVarG;
            List listJ = n3.l.J(aVarArr);
            l8.n.a(z10, null, 0L, false, 0, n1.h.e(-1898288315, new y(2, listJ), sVar), n1.h.e(1692816006, new o(aVar, 6), sVar), n1.h.e(988953031, new a1((Object) this, b1Var, (Object) b1Var2, 3), sVar), n1.h.e(285090056, new x1(kVar, this, b1Var, b1Var2, 0), sVar), n1.h.e(1275565782, new z1(b1Var, activity, listJ, r24, b1Var3, b1Var2, 1), sVar), sVar, (i10 & 14) | 920125440, 62);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, z10, aVar, kVar, i7, 10);
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "WifiConnect";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f115a;
    }
}
