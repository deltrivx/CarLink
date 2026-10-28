package a8;

import c1.u2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f284b;

    public /* synthetic */ y(int i7, List list) {
        this.f283a = i7;
        this.f284b = list;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f283a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    r1.h hVar = r1.c.f11096e;
                    r1.p pVarD = androidx.compose.foundation.layout.c.d(r1.m.f11116a, g5.a.n(64, sVar), 0.0f, 2);
                    o2.m0 m0VarD = d0.m.d(hVar, false);
                    long j5 = sVar.T;
                    int i7 = (int) (j5 ^ (j5 >>> 32));
                    f1.q1 q1VarL = sVar.l();
                    r1.p pVarC = r1.a.c(sVar, pVarD);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var);
                    } else {
                        sVar.k0();
                    }
                    f1.b.w(sVar, q2.i.f10708e, m0VarD);
                    f1.b.w(sVar, q2.i.f10707d, q1VarL);
                    q2.h hVar2 = q2.i.f10709f;
                    if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i7))) {
                        ob.a.w(i7, sVar, i7, hVar2);
                    }
                    f1.b.w(sVar, q2.i.f10706c, pVarC);
                    u2.b(this.f284b == null ? "加载中" : "未获取到活动", androidx.compose.foundation.layout.c.f820a, 0L, n3.r.K(g5.a.n(18, sVar), 4294967296L), null, 0L, new m3.k(3), 0L, 0, false, 0, 0, null, sVar, 48, 0, 130548);
                    sVar.p(true);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    w7.f.f14170a.f(n3.l.J("后台定位", "可能需要开启此权限"), this.f284b, false, sVar2, 3462, 0);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    g5.a.b(null, n1.h.e(-669435090, new y(1, this.f284b), sVar3), sVar3, 48, 1);
                    a2.f.L(16, sVar3, r1.m.f11116a, sVar3);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    List list = this.f284b;
                    i2.c.m((String) u8.p.k0(list), null, sVar4, 0, 2);
                    i2.c.p((String) u8.p.s0(list), sVar4, 0);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    List list2 = this.f284b;
                    i2.c.m((String) u8.p.k0(list2), null, sVar5, 0, 2);
                    i2.c.p((String) u8.p.s0(list2), sVar5, 0);
                }
                break;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    List list3 = this.f284b;
                    i2.c.m((String) u8.p.k0(list3), null, sVar6, 0, 2);
                    i2.c.p((String) u8.p.s0(list3), sVar6, 0);
                }
                break;
            case 6:
                f1.s sVar7 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    w7.f.f14170a.f(n3.l.J("蓝牙相关", "蓝牙(扫描|连接|广播)权限"), this.f284b, false, sVar7, 3462, 0);
                }
                break;
            case 7:
                f1.s sVar8 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    g5.a.b(null, n1.h.e(1895680286, new y(6, this.f284b), sVar8), sVar8, 48, 1);
                    a2.f.L(16, sVar8, r1.m.f11116a, sVar8);
                }
                break;
            case 8:
                f1.s sVar9 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    List list4 = this.f284b;
                    i2.c.m((String) u8.p.k0(list4), null, sVar9, 0, 2);
                    i2.c.p((String) u8.p.s0(list4), sVar9, 0);
                }
                break;
            case 9:
                f1.s sVar10 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    List list5 = this.f284b;
                    i2.c.m((String) u8.p.k0(list5), null, sVar10, 0, 2);
                    String str = (String) u8.p.n0(1, list5);
                    if (str != null) {
                        i2.c.p(str, sVar10, 0);
                    }
                }
                break;
            case 10:
                f1.s sVar11 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar11.z()) {
                    sVar11.Q();
                } else {
                    List list6 = this.f284b;
                    i2.c.m((String) u8.p.k0(list6), null, sVar11, 0, 2);
                    i2.c.p((String) u8.p.s0(list6), sVar11, 0);
                }
                break;
            case 11:
                f1.s sVar12 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar12.z()) {
                    sVar12.Q();
                } else {
                    List list7 = this.f284b;
                    i2.c.m((String) u8.p.k0(list7), null, sVar12, 0, 2);
                    i2.c.p((String) u8.p.s0(list7), sVar12, 0);
                }
                break;
            case 12:
                f1.s sVar13 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar13.z()) {
                    sVar13.Q();
                } else {
                    List list8 = this.f284b;
                    i2.c.m((String) u8.p.k0(list8), null, sVar13, 0, 2);
                    i2.c.p((String) u8.p.s0(list8), sVar13, 0);
                }
                break;
            case 13:
                f1.s sVar14 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar14.z()) {
                    sVar14.Q();
                } else {
                    List list9 = this.f284b;
                    i2.c.m((String) u8.p.k0(list9), null, sVar14, 0, 2);
                    String str2 = (String) u8.p.n0(1, list9);
                    if (str2 != null) {
                        i2.c.p(str2, sVar14, 0);
                    }
                }
                break;
            case 14:
                f1.s sVar15 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar15.z()) {
                    sVar15.Q();
                } else {
                    List list10 = this.f284b;
                    i2.c.m((String) u8.p.k0(list10), null, sVar15, 0, 2);
                    i2.c.p((String) u8.p.s0(list10), sVar15, 0);
                }
                break;
            case 15:
                f1.s sVar16 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar16.z()) {
                    sVar16.Q();
                } else {
                    List list11 = this.f284b;
                    i2.c.m((String) u8.p.k0(list11), null, sVar16, 0, 2);
                    String str3 = (String) u8.p.n0(1, list11);
                    if (str3 != null) {
                        i2.c.p(str3, sVar16, 0);
                    }
                }
                break;
            case 16:
                f1.s sVar17 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar17.z()) {
                    sVar17.Q();
                } else {
                    List list12 = this.f284b;
                    i2.c.m((String) u8.p.k0(list12), null, sVar17, 0, 2);
                    String str4 = (String) u8.p.n0(1, list12);
                    if (str4 != null) {
                        i2.c.p(str4, sVar17, 0);
                    }
                }
                break;
            case 17:
                f1.s sVar18 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar18.z()) {
                    sVar18.Q();
                } else {
                    List list13 = this.f284b;
                    i2.c.m((String) u8.p.k0(list13), null, sVar18, 0, 2);
                    i2.c.p((String) u8.p.s0(list13), sVar18, 0);
                }
                break;
            case 18:
                f1.s sVar19 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar19.z()) {
                    sVar19.Q();
                } else {
                    List list14 = this.f284b;
                    i2.c.m((String) u8.p.k0(list14), null, sVar19, 0, 2);
                    i2.c.p((String) u8.p.s0(list14), sVar19, 0);
                }
                break;
            case 19:
                f1.s sVar20 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar20.z()) {
                    sVar20.Q();
                } else {
                    List list15 = this.f284b;
                    i2.c.m((String) u8.p.k0(list15), null, sVar20, 0, 2);
                    i2.c.p((String) u8.p.s0(list15), sVar20, 0);
                }
                break;
            case 20:
                f1.s sVar21 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar21.z()) {
                    sVar21.Q();
                } else {
                    List list16 = this.f284b;
                    i2.c.m((String) u8.p.k0(list16), null, sVar21, 0, 2);
                    i2.c.p((String) u8.p.s0(list16), sVar21, 0);
                }
                break;
            case 21:
                f1.s sVar22 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar22.z()) {
                    sVar22.Q();
                } else {
                    List list17 = this.f284b;
                    i2.c.m((String) u8.p.k0(list17), null, sVar22, 0, 2);
                    i2.c.p((String) u8.p.s0(list17), sVar22, 0);
                }
                break;
            case 22:
                f1.s sVar23 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar23.z()) {
                    sVar23.Q();
                } else {
                    List list18 = this.f284b;
                    i2.c.m((String) u8.p.k0(list18), null, sVar23, 0, 2);
                    i2.c.p((String) u8.p.s0(list18), sVar23, 0);
                }
                break;
            case 23:
                f1.s sVar24 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar24.z()) {
                    sVar24.Q();
                } else {
                    List list19 = this.f284b;
                    i2.c.m((String) u8.p.k0(list19), null, sVar24, 0, 2);
                    i2.c.p((String) u8.p.s0(list19), sVar24, 0);
                }
                break;
            case 24:
                f1.s sVar25 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar25.z()) {
                    sVar25.Q();
                } else {
                    List list20 = this.f284b;
                    i2.c.m((String) u8.p.k0(list20), null, sVar25, 0, 2);
                    i2.c.p((String) u8.p.s0(list20), sVar25, 0);
                }
                break;
            case 25:
                f1.s sVar26 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar26.z()) {
                    sVar26.Q();
                } else {
                    List list21 = this.f284b;
                    i2.c.m((String) u8.p.k0(list21), null, sVar26, 0, 2);
                    i2.c.p((String) u8.p.s0(list21), sVar26, 0);
                }
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                f1.s sVar27 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar27.z()) {
                    sVar27.Q();
                } else {
                    List list22 = this.f284b;
                    i2.c.m((String) u8.p.k0(list22), null, sVar27, 0, 2);
                    i2.c.p((String) u8.p.s0(list22), sVar27, 0);
                }
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                f1.s sVar28 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar28.z()) {
                    sVar28.Q();
                } else {
                    List list23 = this.f284b;
                    i2.c.m((String) u8.p.k0(list23), null, sVar28, 0, 2);
                    i2.c.p((String) u8.p.s0(list23), sVar28, 0);
                }
                break;
            default:
                f1.s sVar29 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar29.z()) {
                    sVar29.Q();
                } else {
                    List list24 = this.f284b;
                    i2.c.m((String) u8.p.k0(list24), null, sVar29, 0, 2);
                    i2.c.p((String) u8.p.s0(list24), sVar29, 0);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
