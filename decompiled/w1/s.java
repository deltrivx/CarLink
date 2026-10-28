package w1;

import android.os.Trace;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.x;
import q2.d1;
import q2.h0;
import q2.l1;
import r2.j1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends r1.o implements q2.k, l1, p2.d, q2.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h9.n f14074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14077r;

    public s(int i7, h9.n nVar, int i10) {
        i7 = (i10 & 1) != 0 ? 1 : i7;
        this.f14074o = (i10 & 2) != 0 ? null : nVar;
        this.f14077r = i7;
    }

    @Override // p2.e
    public final /* synthetic */ Object A(p2.f fVar) {
        return ob.a.a(this, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void A0(r rVar, r rVar2) {
        d1 d1Var;
        h9.n nVar;
        j jVar = (j) ((r2.u) q2.f.w(this)).getFocusOwner();
        s sVar = jVar.f14049h;
        if (!rVar.equals(rVar2) && (nVar = this.f14074o) != null) {
            nVar.invoke(rVar, rVar2);
        }
        r1.o oVar = this.f11117a;
        if (!oVar.f11129n) {
            n2.a.b("visitAncestors called on an unattached node");
        }
        r1.o oVar2 = this.f11117a;
        h0 h0VarV = q2.f.v(this);
        while (h0VarV != null) {
            if ((h0VarV.E.f10617f.f11120d & 5120) != 0) {
                while (oVar2 != null) {
                    int i7 = oVar2.f11119c;
                    if ((i7 & 5120) != 0) {
                        if (oVar2 != oVar && (i7 & 1024) != 0) {
                            return;
                        }
                        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                            ?? F = oVar2;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof e) {
                                    e eVar2 = (e) F;
                                    if (sVar == jVar.f14049h) {
                                        eVar2.r(rVar2);
                                    }
                                } else if ((F.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0 && (F instanceof q2.m)) {
                                    r1.o oVar3 = ((q2.m) F).f10746p;
                                    int i10 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (oVar3 != null) {
                                        if ((oVar3.f11119c & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                eVar = eVar;
                                                F = oVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(oVar3);
                                            }
                                        }
                                        oVar3 = oVar3.f11122f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                F = q2.f.f(eVar);
                            }
                        }
                    }
                    oVar2 = oVar2.f11121e;
                }
            }
            h0VarV = h0VarV.v();
            oVar2 = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final m B0() {
        boolean z10;
        d1 d1Var;
        m mVar = new m();
        mVar.f14054a = true;
        o oVar = o.f14064b;
        mVar.f14055b = oVar;
        mVar.f14056c = oVar;
        mVar.f14057d = oVar;
        mVar.f14058e = oVar;
        mVar.f14059f = oVar;
        mVar.f14060g = oVar;
        mVar.f14061h = oVar;
        mVar.f14062i = oVar;
        mVar.f14063j = l.f14050b;
        mVar.k = l.f14051c;
        int i7 = this.f14077r;
        if (i7 == 1) {
            z10 = true;
        } else if (i7 == 0) {
            z10 = !(((h2.a) ((h2.c) ((h2.b) q2.f.i(this, j1.f11280m))).f6436a.getValue()).f6435a == 1);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z10 = false;
        }
        mVar.f14054a = z10;
        r1.o oVar2 = this.f11117a;
        if (!oVar2.f11129n) {
            n2.a.b("visitAncestors called on an unattached node");
        }
        r1.o oVar3 = this.f11117a;
        h0 h0VarV = q2.f.v(this);
        loop0: while (h0VarV != null) {
            if ((h0VarV.E.f10617f.f11120d & 3072) != 0) {
                while (oVar3 != null) {
                    int i10 = oVar3.f11119c;
                    if ((i10 & 3072) != 0) {
                        if (oVar3 != oVar2 && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & 2048) != 0) {
                            ?? F = oVar3;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof n) {
                                    ((n) F).t(mVar);
                                } else if ((F.f11119c & 2048) != 0 && (F instanceof q2.m)) {
                                    r1.o oVar4 = ((q2.m) F).f10746p;
                                    int i11 = 0;
                                    while (oVar4 != null) {
                                        if ((oVar4.f11119c & 2048) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                F = F;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F = oVar4;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(oVar4);
                                            }
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                        }
                                        oVar4 = oVar4.f11122f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                                F = q2.f.f(eVar);
                            }
                        }
                    }
                    oVar3 = oVar3.f11121e;
                }
            }
            h0VarV = h0VarV.v();
            oVar3 = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
        }
        return mVar;
    }

    public final r C0() {
        j jVar;
        s sVar;
        d1 d1Var;
        boolean z10 = this.f11129n;
        r rVar = r.f14072d;
        if (!z10 || (sVar = (jVar = (j) ((r2.u) q2.f.w(this)).getFocusOwner()).f14049h) == null) {
            return rVar;
        }
        if (this == sVar) {
            jVar.getClass();
            return r.f14069a;
        }
        if (sVar.f11129n) {
            if (!sVar.f11117a.f11129n) {
                n2.a.b("visitAncestors called on an unattached node");
            }
            r1.o oVar = sVar.f11117a.f11121e;
            h0 h0VarV = q2.f.v(sVar);
            while (h0VarV != null) {
                if ((h0VarV.E.f10617f.f11120d & 1024) != 0) {
                    while (oVar != null) {
                        if ((oVar.f11119c & 1024) != 0) {
                            r1.o oVarF = oVar;
                            h1.e eVar = null;
                            while (oVarF != null) {
                                if (oVarF instanceof s) {
                                    if (this == ((s) oVarF)) {
                                        return r.f14070b;
                                    }
                                } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                    int i7 = 0;
                                    for (r1.o oVar2 = ((q2.m) oVarF).f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
                                        if ((oVar2.f11119c & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                oVarF = oVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF != null) {
                                                    eVar.b(oVarF);
                                                    oVarF = null;
                                                }
                                                eVar.b(oVar2);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                oVarF = q2.f.f(eVar);
                            }
                        }
                        oVar = oVar.f11121e;
                    }
                }
                h0VarV = h0VarV.v();
                oVar = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
            }
        }
        return rVar;
    }

    public final void D0() {
        int iOrdinal = C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new cc.s();
                }
                return;
            }
        }
        x xVar = new x();
        q2.f.r(this, new k2.d(8, xVar, this));
        Object obj = xVar.f6688a;
        if (obj == null) {
            i9.l.j("focusProperties");
            throw null;
        }
        if (((k) obj).a()) {
            return;
        }
        ((j) ((r2.u) q2.f.w(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean E0(int i7) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zV = false;
            if (!B0().f14054a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = f.u(this, i7).ordinal();
            if (iOrdinal == 0) {
                zV = f.v(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zV = true;
                } else if (iOrdinal != 3) {
                    throw new cc.s();
                }
            }
            Trace.endSection();
            return zV;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // p2.d
    public final /* synthetic */ n3.l N() {
        return p2.b.f10116b;
    }

    @Override // q2.l1
    public final void X() {
        D0();
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    @Override // r1.o
    public final void s0() {
        int iOrdinal = C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new cc.s();
                }
                return;
            }
        }
        j jVar = (j) ((r2.u) q2.f.w(this)).getFocusOwner();
        jVar.b(8, true, false);
        jVar.f14045d.a();
    }

    @Override // r1.o
    public final void u0() {
        if (C0().b()) {
            ((j) ((r2.u) q2.f.w(this)).getFocusOwner()).b(8, true, true);
        }
    }
}
