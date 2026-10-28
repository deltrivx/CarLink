package l0;

import android.content.Context;
import android.net.LinkAddress;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7836a;

    public /* synthetic */ t0(int i7) {
        this.f7836a = i7;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x04ba  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // h9.k
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        long j5;
        float f10;
        long j10;
        Object value;
        m7.j jVar;
        Object value2;
        o7.u uVar;
        int i7 = this.f7836a;
        int i10 = 2;
        long j11 = 4294967295L;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                return zVar;
            case 1:
                w0.j1 j1Var = (w0.j1) obj;
                String str = j1Var.f13821g.f1353b;
                long j12 = j1Var.f13820f;
                int i11 = b3.q0.f1429c;
                int i12 = (int) (j12 & 4294967295L);
                if (i12 > 0) {
                    l4.j jVarS = q0.s();
                    if (jVarS != null) {
                        int iB = jVarS.b(str, i12 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i12 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i12, -1);
                        }
                    } else if (i12 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i12, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new g3.e(((int) (j1Var.f13820f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 2:
                w0.j1 j1Var2 = (w0.j1) obj;
                String str2 = j1Var2.f13821g.f1353b;
                long j13 = j1Var2.f13820f;
                int i13 = b3.q0.f1429c;
                int iO = q0.o((int) (j13 & 4294967295L), str2);
                if (iO != -1) {
                    return new g3.e(0, iO - ((int) (j1Var2.f13820f & 4294967295L)));
                }
                return null;
            case 3:
                w0.j1 j1Var3 = (w0.j1) obj;
                Integer numE = j1Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j14 = j1Var3.f13820f;
                int i14 = b3.q0.f1429c;
                return new g3.e(((int) (j14 & 4294967295L)) - iIntValue, 0);
            case 4:
                w0.j1 j1Var4 = (w0.j1) obj;
                Integer numD = j1Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j15 = j1Var4.f13820f;
                int i15 = b3.q0.f1429c;
                return new g3.e(0, iIntValue2 - ((int) (j15 & 4294967295L)));
            case 5:
                w0.j1 j1Var5 = (w0.j1) obj;
                Integer numC = j1Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j16 = j1Var5.f13820f;
                int i16 = b3.q0.f1429c;
                return new g3.e(((int) (j16 & 4294967295L)) - iIntValue3, 0);
            case 6:
                w0.j1 j1Var6 = (w0.j1) obj;
                Integer numB = j1Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j17 = j1Var6.f13820f;
                int i17 = b3.q0.f1429c;
                return new g3.e(0, iIntValue4 - ((int) (j17 & 4294967295L)));
            case 7:
                List list = (List) obj;
                Object obj2 = list.get(1);
                i9.l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                z.x0 x0Var = ((Boolean) obj2).booleanValue() ? z.x0.f15591a : z.x0.f15592b;
                Object obj3 = list.get(0);
                i9.l.c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new q1(x0Var, ((Float) obj3).floatValue());
            case 8:
                a2.g gVar = (a2.g) obj;
                i9.l.e(gVar, "$this$Canvas");
                int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (gVar.g() & 4294967295L)) / 10.0f);
                int iIntBitsToFloat2 = (int) (Float.intBitsToFloat((int) (gVar.g() >> 32)) / 10.0f);
                if (iIntBitsToFloat >= 0) {
                    int i18 = 0;
                    while (true) {
                        if (iIntBitsToFloat2 >= 0) {
                            int i19 = 0;
                            while (true) {
                                if ((i18 + i19) % i10 == 0) {
                                    f10 = 10.0f;
                                    j10 = y1.q.f14950d;
                                } else {
                                    f10 = 10.0f;
                                    j10 = y1.q.f14951e;
                                }
                                j5 = j11;
                                a2.f.w(gVar, y1.q.b(0.8f, j10), (((long) Float.floatToRawIntBits(i19 * f10)) << 32) | (((long) Float.floatToRawIntBits(i18 * f10)) & j5), (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & j5), 120);
                                if (i19 != iIntBitsToFloat2) {
                                    i19++;
                                    j11 = j5;
                                    i10 = 2;
                                }
                            }
                        } else {
                            j5 = j11;
                        }
                        if (i18 != iIntBitsToFloat) {
                            i18++;
                            j11 = j5;
                            i10 = 2;
                        }
                    }
                }
                return zVar;
            case 9:
                ((Boolean) obj).getClass();
                return Boolean.TRUE;
            case 10:
                return m0.b.a((Context) obj);
            case 11:
                m5.l lVar = (m5.l) obj;
                i9.l.e(lVar, "$this$Slider");
                return Float.valueOf(((Number) lVar.f8489h.getValue()).floatValue());
            case 12:
                m5.l lVar2 = (m5.l) obj;
                i9.l.e(lVar2, "$this$Slider");
                long j18 = ((y1.q) lVar2.f8488g.getValue()).f14960a;
                return n3.l.J(new y1.q(y1.q.b(0.0f, j18)), new y1.q(y1.q.b(1.0f, j18)));
            case 13:
                m5.l lVar3 = (m5.l) obj;
                i9.l.e(lVar3, "$this$Slider");
                return Float.valueOf(((Number) lVar3.f8490i.getValue()).floatValue());
            case 14:
                m5.l lVar4 = (m5.l) obj;
                i9.l.e(lVar4, "$this$Slider");
                return n3.l.J(new y1.q(y1.q.f14948b), lVar4.f8488g.getValue());
            case 15:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z10 = m7.j.f8589m;
                fc.h0 h0Var = m7.j.f8590n;
                while (true) {
                    Object value3 = h0Var.getValue();
                    m7.j jVar2 = (m7.j) value3;
                    i9.l.e(jVar2, "$this$update");
                    boolean z11 = zBooleanValue;
                    if (h0Var.f(value3, m7.j.a(jVar2, zBooleanValue, 0, false, false, false, false, false, false, 0, 0, 0, 4094))) {
                        return Boolean.TRUE;
                    }
                    zBooleanValue = z11;
                }
                break;
            case 16:
                int iIntValue5 = ((Integer) obj).intValue();
                boolean z12 = m7.j.f8589m;
                fc.h0 h0Var2 = m7.j.f8590n;
                do {
                    value = h0Var2.getValue();
                    jVar = (m7.j) value;
                    i9.l.e(jVar, "$this$update");
                } while (!h0Var2.f(value, m7.j.a(jVar, false, iIntValue5, false, false, false, false, false, false, 0, 0, 0, 4093)));
                return zVar;
            case 17:
                return ((LinkAddress) obj).getAddress();
            case 18:
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                    String name = networkInterface.getName();
                    i9.l.b(name);
                    if (!zb.j.r0(name, "rmnet", false) && !zb.j.r0(name, "tun", false) && !zb.j.r0(name, "dummy", false) && (zb.j.r0(name, "ap", false) || zb.j.r0(name, "wlan", false) || zb.j.r0(name, "rndis", false))) {
                        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                        i9.l.d(inetAddresses, "getInetAddresses(...)");
                        return yb.l.M(new e2.g0(inetAddresses));
                    }
                }
                return yb.f.f15266a;
            case 19:
                Inet4Address inet4Address = (Inet4Address) obj;
                i9.l.e(inet4Address, "it");
                return Boolean.valueOf(!inet4Address.isLoopbackAddress());
            case 20:
                Inet4Address inet4Address2 = (Inet4Address) obj;
                i9.l.e(inet4Address2, "it");
                return inet4Address2.getHostAddress();
            case 21:
                return new o1.d((Map) obj);
            case 22:
                return obj;
            case 23:
                String str3 = (String) obj;
                i9.l.e(str3, "it");
                fc.h0 h0Var3 = o7.u.f9519o;
                fc.h0 h0Var4 = o7.u.f9519o;
                while (true) {
                    Object value4 = h0Var4.getValue();
                    o7.u uVar2 = (o7.u) value4;
                    i9.l.e(uVar2, "$this$update");
                    String str4 = str3;
                    if (h0Var4.f(value4, o7.u.a(uVar2, null, null, 0, null, 0, null, 0, str4, null, null, 63487))) {
                        return zVar;
                    }
                    str3 = str4;
                }
                break;
            case 24:
                String str5 = (String) obj;
                i9.l.e(str5, "it");
                fc.h0 h0Var5 = o7.u.f9519o;
                fc.h0 h0Var6 = o7.u.f9519o;
                while (true) {
                    Object value5 = h0Var6.getValue();
                    o7.u uVar3 = (o7.u) value5;
                    i9.l.e(uVar3, "$this$update");
                    String str6 = str5;
                    if (h0Var6.f(value5, o7.u.a(uVar3, null, null, 0, null, 0, null, 0, null, str6, null, 61439))) {
                        return zVar;
                    }
                    str5 = str6;
                }
                break;
            case 25:
                String str7 = (String) obj;
                i9.l.e(str7, "it");
                fc.h0 h0Var7 = o7.u.f9519o;
                fc.h0 h0Var8 = o7.u.f9519o;
                while (true) {
                    Object value6 = h0Var8.getValue();
                    o7.u uVar4 = (o7.u) value6;
                    i9.l.e(uVar4, "$this$update");
                    String str8 = str7;
                    if (h0Var8.f(value6, o7.u.a(uVar4, null, null, 0, null, 0, null, 0, null, null, str8, 57343))) {
                        return zVar;
                    }
                    str7 = str8;
                }
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                Integer num = (Integer) obj;
                int iIntValue6 = num.intValue();
                fc.h0 h0Var9 = o7.u.f9519o;
                fc.h0 h0Var10 = o7.u.f9519o;
                while (true) {
                    Object value7 = h0Var10.getValue();
                    o7.u uVar5 = (o7.u) value7;
                    i9.l.e(uVar5, "$this$update");
                    int i20 = iIntValue6;
                    if (h0Var10.f(value7, o7.u.a(uVar5, null, null, 0, null, 0, null, iIntValue6, null, null, null, 65023))) {
                        t8.o oVar = n8.d.f8898a;
                        n8.d.f(i20, Configs.CONFIG_CONNECT_TIMEOUT);
                        CarLife.receiver().setConfig(Configs.CONFIG_CONNECT_TIMEOUT, num);
                        return zVar;
                    }
                    iIntValue6 = i20;
                }
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                l8.j0 j0Var = (l8.j0) obj;
                i9.l.e(j0Var, "it");
                l8.n0 n0Var = j0Var.f8197b;
                fc.h0 h0Var11 = o7.u.f9519o;
                fc.h0 h0Var12 = o7.u.f9519o;
                do {
                    value2 = h0Var12.getValue();
                    uVar = (o7.u) value2;
                    i9.l.e(uVar, "$this$update");
                } while (!h0Var12.f(value2, o7.u.a(uVar, null, null, 0, null, n0Var.a(), null, 0, null, null, null, 65407)));
                t8.o oVar2 = n8.d.f8898a;
                n8.d.f(n0Var.a(), Configs.CONFIG_TARGET_IP_GET);
                CarLife.receiver().setConfig(Configs.CONFIG_TARGET_IP_GET, Integer.valueOf(n0Var.a()));
                return zVar;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                String str9 = (String) obj;
                i9.l.e(str9, "it");
                fc.h0 h0Var13 = o7.u.f9519o;
                fc.h0 h0Var14 = o7.u.f9519o;
                while (true) {
                    Object value8 = h0Var14.getValue();
                    o7.u uVar6 = (o7.u) value8;
                    i9.l.e(uVar6, "$this$update");
                    String str10 = str9;
                    if (h0Var14.f(value8, o7.u.a(uVar6, null, null, 0, null, 0, str10, 0, null, null, null, 65279))) {
                        t8.o oVar3 = n8.d.f8898a;
                        n8.d.g(Configs.CONFIG_TARGET_IP_ADDRESS, str10);
                        CarLife.receiver().setConfig(Configs.CONFIG_TARGET_IP_ADDRESS, str10);
                        return zVar;
                    }
                    str9 = str10;
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                t8.o oVar4 = n8.d.f8898a;
                n8.d.f(zBooleanValue2 ? 1 : 0, Configs.CONFIG_WIFI_DIRECT_BLE);
                CarLife.receiver().setConfig(Configs.CONFIG_WIFI_DIRECT_BLE, Integer.valueOf(zBooleanValue2 ? 1 : 0));
                return Boolean.TRUE;
        }
    }
}
