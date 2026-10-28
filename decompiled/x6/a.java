package x6;

import a7.b;
import a7.c;
import a7.d;
import a7.e;
import a7.h;
import a7.j;
import s.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f14604a = new s(151);

    public static z6.a a() {
        s sVar = f14604a;
        z6.a aVar = (z6.a) sVar.a("android.permission.ACCESS_BACKGROUND_LOCATION");
        if (aVar != null) {
            return aVar;
        }
        b bVar = new b(0);
        sVar.b("android.permission.ACCESS_BACKGROUND_LOCATION", bVar);
        return bVar;
    }

    public static z6.a b() {
        s sVar = f14604a;
        z6.a aVar = (z6.a) sVar.a("android.permission.ACCESS_COARSE_LOCATION");
        if (aVar != null) {
            return aVar;
        }
        j jVar = new j("android.permission.ACCESS_COARSE_LOCATION", "location_group", 23);
        sVar.b(jVar.n(), jVar);
        return jVar;
    }

    public static z6.a c() {
        s sVar = f14604a;
        z6.a aVar = (z6.a) sVar.a("android.permission.ACCESS_FINE_LOCATION");
        if (aVar != null) {
            return aVar;
        }
        j jVar = new j("android.permission.ACCESS_FINE_LOCATION", "location_group", 23);
        sVar.b(jVar.n(), jVar);
        return jVar;
    }

    public static z6.a d() {
        s sVar = f14604a;
        z6.a aVar = (z6.a) sVar.a("android.permission.BLUETOOTH_ADVERTISE");
        if (aVar != null) {
            return aVar;
        }
        c cVar = new c(0);
        sVar.b("android.permission.BLUETOOTH_ADVERTISE", cVar);
        return cVar;
    }

    public static z6.a e() {
        s sVar = f14604a;
        z6.a aVar = (z6.a) sVar.a("android.permission.BLUETOOTH_CONNECT");
        if (aVar != null) {
            return aVar;
        }
        d dVar = new d(0);
        sVar.b("android.permission.BLUETOOTH_CONNECT", dVar);
        return dVar;
    }

    public static z6.a f() {
        s sVar = f14604a;
        z6.a aVar = (z6.a) sVar.a("android.permission.BLUETOOTH_SCAN");
        if (aVar != null) {
            return aVar;
        }
        e eVar = new e(0);
        sVar.b("android.permission.BLUETOOTH_SCAN", eVar);
        return eVar;
    }

    public static z6.a g() {
        s sVar = f14604a;
        z6.a aVar = (z6.a) sVar.a("android.permission.NEARBY_WIFI_DEVICES");
        if (aVar != null) {
            return aVar;
        }
        h hVar = new h(0);
        sVar.b("android.permission.NEARBY_WIFI_DEVICES", hVar);
        return hVar;
    }

    public static z6.a h() {
        s sVar = f14604a;
        z6.a aVar = (z6.a) sVar.a("android.permission.NOTIFICATION_SERVICE");
        if (aVar != null) {
            return aVar;
        }
        b7.a aVar2 = new b7.a(null);
        sVar.b("android.permission.NOTIFICATION_SERVICE", aVar2);
        return aVar2;
    }

    public static z6.a i() {
        s sVar = f14604a;
        z6.a aVar = (z6.a) sVar.a("android.permission.SYSTEM_ALERT_WINDOW");
        if (aVar != null) {
            return aVar;
        }
        b7.c cVar = new b7.c(1);
        sVar.b("android.permission.SYSTEM_ALERT_WINDOW", cVar);
        return cVar;
    }
}
