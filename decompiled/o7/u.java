package o7;

import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import fc.h0;
import fc.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h0 f9519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h0 f9520p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f9521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f9530j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f9532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f9533n;

    static {
        t8.o oVar = n8.d.f8898a;
        h0 h0VarB = y.b(new u(v.f9534a, "请连接手机和车载系统", n8.d.b(5, Configs.FEATURE_CONFIG_CONNECT_TYPE), n8.d.b(0, Configs.CONFIG_WIFI_DIRECT_BLE), n8.d.d(Configs.CONFIG_WIFI_DIRECT_NAME, ""), n8.d.d(Configs.CONFIG_TARGET_BLUETOOTH_NAME, ""), n8.d.b(0, Configs.CONFIG_TARGET_IP_GET), n8.d.d(Configs.CONFIG_TARGET_IP_ADDRESS, ""), n8.d.b(10, Configs.CONFIG_CONNECT_TIMEOUT), n8.d.a("CONNECT_OPEN_BLE", false), n8.d.d("CONNECT_COVER_WAIT", ""), n8.d.d("CONNECT_COVER_SUCCESS", ""), n8.d.d("CONNECT_COVER_FAIL", ""), n3.l.J(x6.a.f(), x6.a.e(), x6.a.d(), x6.a.b(), x6.a.c(), x6.a.a(), x6.a.g())));
        f9519o = h0VarB;
        f9520p = h0VarB;
    }

    public u(v vVar, String str, int i7, int i10, String str2, String str3, int i11, String str4, int i12, boolean z10, String str5, String str6, String str7, List list) {
        i9.l.e(vVar, "connection");
        this.f9521a = vVar;
        this.f9522b = str;
        this.f9523c = i7;
        this.f9524d = i10;
        this.f9525e = str2;
        this.f9526f = str3;
        this.f9527g = i11;
        this.f9528h = str4;
        this.f9529i = i12;
        this.f9530j = z10;
        this.k = str5;
        this.f9531l = str6;
        this.f9532m = str7;
        this.f9533n = list;
    }

    public static u a(u uVar, v vVar, String str, int i7, String str2, int i10, String str3, int i11, String str4, String str5, String str6, int i12) {
        uVar.getClass();
        v vVar2 = (i12 & 2) != 0 ? uVar.f9521a : vVar;
        String str7 = (i12 & 4) != 0 ? uVar.f9522b : str;
        int i13 = (i12 & 8) != 0 ? uVar.f9523c : i7;
        int i14 = uVar.f9524d;
        String str8 = (i12 & 32) != 0 ? uVar.f9525e : str2;
        String str9 = uVar.f9526f;
        int i15 = (i12 & 128) != 0 ? uVar.f9527g : i10;
        String str10 = (i12 & 256) != 0 ? uVar.f9528h : str3;
        int i16 = (i12 & 512) != 0 ? uVar.f9529i : i11;
        boolean z10 = uVar.f9530j;
        String str11 = (i12 & 2048) != 0 ? uVar.k : str4;
        String str12 = (i12 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0 ? uVar.f9531l : str5;
        String str13 = (i12 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0 ? uVar.f9532m : str6;
        uVar.getClass();
        List list = uVar.f9533n;
        uVar.getClass();
        i9.l.e(vVar2, "connection");
        i9.l.e(str8, "wifiDirectName");
        i9.l.e(str10, "targetIPAddress");
        i9.l.e(str11, "coverWait");
        i9.l.e(str12, "coverSuccess");
        i9.l.e(str13, "coverFail");
        return new u(vVar2, str7, i13, i14, str8, str9, i15, str10, i16, z10, str11, str12, str13, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f9521a == uVar.f9521a && this.f9522b.equals(uVar.f9522b) && this.f9523c == uVar.f9523c && this.f9524d == uVar.f9524d && this.f9525e.equals(uVar.f9525e) && this.f9526f.equals(uVar.f9526f) && this.f9527g == uVar.f9527g && this.f9528h.equals(uVar.f9528h) && this.f9529i == uVar.f9529i && this.f9530j == uVar.f9530j && this.k.equals(uVar.k) && this.f9531l.equals(uVar.f9531l) && this.f9532m.equals(uVar.f9532m) && this.f9533n.equals(uVar.f9533n);
    }

    public final int hashCode() {
        return this.f9533n.hashCode() + ((((this.f9532m.hashCode() + ob.a.l(this.f9531l, ob.a.l(this.k, (((ob.a.l(this.f9528h, (ob.a.l(this.f9526f, ob.a.l(this.f9525e, (((ob.a.l(this.f9522b, this.f9521a.hashCode() * 31, 31) + this.f9523c) * 31) + this.f9524d) * 31, 31), 31) + this.f9527g) * 31, 31) + this.f9529i) * 31) + (this.f9530j ? 1231 : 1237)) * 31, 31), 31)) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "ConnectState(progress=0, connection=" + this.f9521a + ", connectionPrompt=" + this.f9522b + ", connectionType=" + this.f9523c + ", wifiDirectBle=" + this.f9524d + ", wifiDirectName=" + this.f9525e + ", targetBluetooth=" + this.f9526f + ", targetIPGet=" + this.f9527g + ", targetIPAddress=" + this.f9528h + ", heartbeatTimeout=" + this.f9529i + ", openBle=" + this.f9530j + ", coverWait=" + this.k + ", coverSuccess=" + this.f9531l + ", coverFail=" + this.f9532m + ", isBleActive=false, permissions=" + this.f9533n + ")";
    }
}
