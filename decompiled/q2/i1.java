package q2;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.c0 f10718a;

    static {
        s.c0 c0Var = s.l0.f12469a;
        f10718a = new s.c0();
    }

    public static final void a(r1.o oVar, int i7, int i10) {
        if (!(oVar instanceof m)) {
            b(oVar, i7 & oVar.f11119c, i10);
            return;
        }
        m mVar = (m) oVar;
        int i11 = mVar.f10745o;
        b(oVar, i11 & i7, i10);
        int i12 = (~i11) & i7;
        for (r1.o oVar2 = mVar.f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
            a(oVar2, i12, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(r1.o oVar, int i7, int i10) {
        if (i10 != 0 || oVar.n0()) {
            if ((i7 & 2) != 0 && (oVar instanceof x)) {
                f.m((x) oVar);
                if (i10 == 2) {
                    h1 h1VarT = f.t(oVar, 2);
                    h1VarT.f10695r = true;
                    h1VarT.G.invoke();
                    h1VarT.X0();
                }
            }
            if ((i7 & 128) != 0 && (oVar instanceof w) && i10 != 2) {
                f.v(oVar).E();
            }
            if ((i7 & 256) != 0 && (oVar instanceof p)) {
                if (i10 == 1) {
                    h0 h0VarV = f.v(oVar);
                    h0VarV.a0(h0VarV.O + 1);
                } else if (i10 == 2) {
                    h0 h0VarV2 = f.v(oVar);
                    h0VarV2.a0(h0VarV2.O - 1);
                }
                if (i10 != 2) {
                    h0 h0VarV3 = f.v(oVar);
                    if (h0VarV3.O != 0 && !h0VarV3.q() && !h0VarV3.r() && !h0VarV3.N) {
                        r2.u uVar = (r2.u) k0.a(h0VarV3);
                        u0.k kVar = uVar.P.f10841e;
                        kVar.getClass();
                        if (h0VarV3.O > 0) {
                            ((h1.e) kVar.f12990b).b(h0VarV3);
                            h0VarV3.N = true;
                        }
                        uVar.K(null);
                    }
                }
            }
            if ((i7 & 4) != 0 && (oVar instanceof o)) {
                f.l((o) oVar);
            }
            if ((i7 & 8) != 0 && (oVar instanceof y1)) {
                f.v(oVar).f10682q = true;
            }
            if ((i7 & 64) != 0 && (oVar instanceof t1)) {
                l0 l0Var = f.v((t1) oVar).F;
                l0Var.f10743p.f10858p = true;
                u0 u0Var = l0Var.f10744q;
                if (u0Var != null) {
                    u0Var.f10824u = true;
                }
            }
            if ((i7 & 2048) != 0 && (oVar instanceof w1.n)) {
                w1.n nVar = (w1.n) oVar;
                g.f10652b = null;
                nVar.t(g.f10651a);
                if (g.f10652b != null) {
                    r1.o oVar2 = (r1.o) nVar;
                    if (!oVar2.f11117a.f11129n) {
                        n2.a.b("visitChildren called on an unattached node");
                    }
                    h1.e eVar = new h1.e(new r1.o[16]);
                    r1.o oVar3 = oVar2.f11117a;
                    r1.o oVar4 = oVar3.f11122f;
                    if (oVar4 == null) {
                        f.b(eVar, oVar3);
                    } else {
                        eVar.b(oVar4);
                    }
                    while (true) {
                        int i11 = eVar.f6423c;
                        if (i11 == 0) {
                            break;
                        }
                        r1.o oVarF = (r1.o) eVar.l(i11 - 1);
                        if ((oVarF.f11120d & 1024) == 0) {
                            f.b(eVar, oVarF);
                        } else {
                            while (oVarF != null) {
                                if ((oVarF.f11119c & 1024) != 0) {
                                    h1.e eVar2 = null;
                                    while (oVarF != null) {
                                        if (oVarF instanceof w1.s) {
                                            w1.s sVar = (w1.s) oVarF;
                                            w1.g gVar = ((w1.j) ((r2.u) f.w(sVar)).getFocusOwner()).f14045d;
                                            if (gVar.f14038c.a(sVar)) {
                                                gVar.a();
                                            }
                                        } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof m)) {
                                            int i12 = 0;
                                            for (r1.o oVar5 = ((m) oVarF).f10746p; oVar5 != null; oVar5 = oVar5.f11122f) {
                                                if ((oVar5.f11119c & 1024) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        oVarF = oVar5;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new h1.e(new r1.o[16]);
                                                        }
                                                        if (oVarF != null) {
                                                            eVar2.b(oVarF);
                                                            oVarF = null;
                                                        }
                                                        eVar2.b(oVar5);
                                                    }
                                                }
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        oVarF = f.f(eVar2);
                                    }
                                    break;
                                }
                                oVarF = oVarF.f11122f;
                            }
                        }
                    }
                }
            }
            if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) == 0 || !(oVar instanceof w1.e)) {
                return;
            }
            w1.e eVar3 = (w1.e) oVar;
            w1.g gVar2 = ((w1.j) ((r2.u) f.w(eVar3)).getFocusOwner()).f14045d;
            if (gVar2.f14039d.a(eVar3)) {
                gVar2.a();
            }
        }
    }

    public static final void c(r1.o oVar) {
        if (!oVar.f11129n) {
            n2.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(oVar, -1, 0);
    }

    public static final int d(r1.n nVar) {
        int i7 = nVar instanceof o2.y ? 3 : 1;
        if (nVar instanceof x.p0) {
            i7 |= 4;
        }
        if (nVar instanceof AppendedSemanticsElement) {
            i7 |= 8;
        }
        if (nVar instanceof k2.c0) {
            i7 |= 16;
        }
        if ((nVar instanceof d0.a0) || (nVar instanceof d0.a0)) {
            i7 |= 32;
        }
        if (nVar instanceof h0.e) {
            i7 |= 256;
        }
        return nVar instanceof v2.a ? 524288 | i7 : i7;
    }

    public static final int e(r1.o oVar) {
        int i7 = oVar.f11119c;
        if (i7 != 0) {
            return i7;
        }
        Class<?> cls = oVar.getClass();
        s.c0 c0Var = f10718a;
        int iD = c0Var.d(cls);
        if (iD >= 0) {
            return c0Var.f12399c[iD];
        }
        int i10 = oVar instanceof x ? 3 : 1;
        if (oVar instanceof o) {
            i10 |= 4;
        }
        if (oVar instanceof y1) {
            i10 |= 8;
        }
        if (oVar instanceof v1) {
            i10 |= 16;
        }
        if (oVar instanceof p2.d) {
            i10 |= 32;
        }
        if (oVar instanceof t1) {
            i10 |= 64;
        }
        if (oVar instanceof w) {
            i10 |= 128;
        }
        if (oVar instanceof p) {
            i10 |= 256;
        }
        if (oVar instanceof w1.s) {
            i10 |= 1024;
        }
        if (oVar instanceof w1.n) {
            i10 |= 2048;
        }
        if (oVar instanceof w1.e) {
            i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        }
        if (oVar instanceof i2.d) {
            i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if (oVar instanceof m2.a) {
            i10 |= 16384;
        }
        if (oVar instanceof k) {
            i10 |= 32768;
        }
        if (oVar instanceof d2) {
            i10 |= 262144;
        }
        if (oVar instanceof v2.a) {
            i10 |= 524288;
        }
        c0Var.h(i10, cls);
        return i10;
    }

    public static final int f(r1.o oVar) {
        if (!(oVar instanceof m)) {
            return e(oVar);
        }
        m mVar = (m) oVar;
        int iF = mVar.f10745o;
        for (r1.o oVar2 = mVar.f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
            iF |= f(oVar2);
        }
        return iF;
    }

    public static final boolean g(int i7) {
        return (i7 & 128) != 0;
    }
}
