package y2;

import c1.j0;
import java.util.ArrayList;
import java.util.List;
import o2.d1;
import q2.h0;
import q2.h1;
import q2.y1;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.o f15017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f15019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f15020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f15022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15023g;

    public m(r1.o oVar, boolean z10, h0 h0Var, j jVar) {
        this.f15017a = oVar;
        this.f15018b = z10;
        this.f15019c = h0Var;
        this.f15020d = jVar;
        this.f15023g = h0Var.f10668b;
    }

    public static /* synthetic */ List j(int i7, m mVar) {
        return mVar.i((i7 & 1) != 0 ? !mVar.f15018b : false, (i7 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final x1.c a(h1 h1Var) {
        ?? F;
        m mVarL = l();
        if (mVarL == null) {
            return x1.c.f14522e;
        }
        r1.o oVar = mVarL.f15019c.E.f10617f;
        if ((oVar.f11120d & 8) == 0) {
            F = 0;
            break;
        }
        loop0: while (true) {
            if (oVar != null) {
                if ((oVar.f11119c & 8) != 0) {
                    F = oVar;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof y1) {
                            if (((y1) F).h()) {
                                break loop0;
                            }
                        } else if ((F.f11119c & 8) != 0 && (F instanceof q2.m)) {
                            r1.o oVar2 = ((q2.m) F).f10746p;
                            int i7 = 0;
                            while (oVar2 != null) {
                                if ((oVar2.f11119c & 8) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        F = F;
                                        eVar = eVar;
                                        eVar = eVar;
                                        F = oVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new h1.e(new r1.o[16]);
                                        }
                                        if (F != 0) {
                                            eVar.b(F);
                                            F = 0;
                                        }
                                        eVar.b(oVar2);
                                    }
                                } else {
                                    F = F;
                                    eVar = eVar;
                                }
                                oVar2 = oVar2.f11122f;
                                F = F;
                                eVar = eVar;
                            }
                            if (i7 == 1) {
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
                if ((oVar.f11120d & 8) != 0) {
                    oVar = oVar.f11122f;
                }
            }
            F = 0;
            break;
        }
        y1 y1Var = (y1) F;
        h1 h1VarT = y1Var != null ? q2.f.t(y1Var, 8) : null;
        return h1VarT == null ? mVarL.a(h1Var) : h1VarT.h(h1Var, true);
    }

    public final m b(g gVar, h9.k kVar) {
        j jVar = new j();
        jVar.f15013c = false;
        jVar.f15014d = false;
        kVar.invoke(jVar);
        m mVar = new m(new l(kVar), false, new h0(this.f15023g + (gVar != null ? 1000000000 : 2000000000), true), jVar);
        mVar.f15021e = true;
        mVar.f15022f = this;
        return mVar;
    }

    public final void c(h0 h0Var, ArrayList arrayList) {
        h1.e eVarY = h0Var.y();
        Object[] objArr = eVarY.f6421a;
        int i7 = eVarY.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            if (h0Var2.I() && !h0Var2.P) {
                if (h0Var2.E.d(8)) {
                    arrayList.add(p.a(h0Var2, this.f15018b));
                } else {
                    c(h0Var2, arrayList);
                }
            }
        }
    }

    public final h1 d() {
        if (!this.f15021e) {
            y1 y1VarF = f();
            return y1VarF != null ? q2.f.t(y1VarF, 8) : this.f15019c.E.f10614c;
        }
        m mVarL = l();
        if (mVarL != null) {
            return mVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            m mVar = (m) arrayList.get(size2);
            if (mVar.n()) {
                arrayList2.add(mVar);
            } else if (!mVar.f15020d.f15014d) {
                mVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final y1 f() {
        ?? F;
        boolean z10 = this.f15020d.f15013c;
        h0 h0Var = this.f15019c;
        ?? r8 = 0;
        r8 = 0;
        r8 = 0;
        r8 = 0;
        if (!z10) {
            r1.o oVar = h0Var.E.f10617f;
            if ((oVar.f11120d & 8) != 0) {
                loop3: while (oVar != null) {
                    if ((oVar.f11119c & 8) != 0) {
                        F = oVar;
                        ?? eVar = 0;
                        while (true) {
                            if (F != 0) {
                                if (F instanceof y1) {
                                    if (((y1) F).h()) {
                                        r8 = F;
                                    }
                                } else if ((F.f11119c & 8) != 0 && (F instanceof q2.m)) {
                                    r1.o oVar2 = ((q2.m) F).f10746p;
                                    int i7 = 0;
                                    while (oVar2 != null) {
                                        if ((oVar2.f11119c & 8) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                F = F;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F = oVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(oVar2);
                                            }
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                        }
                                        oVar2 = oVar2.f11122f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
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
                    if ((oVar.f11120d & 8) == 0) {
                        break;
                    }
                    oVar = oVar.f11122f;
                }
            }
        } else {
            r1.o oVar3 = h0Var.E.f10617f;
            if ((oVar3.f11120d & 8) != 0) {
                F = 0;
                while (oVar3 != null) {
                    if ((oVar3.f11119c & 8) != 0) {
                        ?? F2 = oVar3;
                        ?? eVar2 = 0;
                        while (F2 != 0) {
                            if (F2 instanceof y1) {
                                y1 y1Var = (y1) F2;
                                if (y1Var.h()) {
                                    if (y1Var.j0()) {
                                        return y1Var;
                                    }
                                    if (F == 0) {
                                        F = y1Var;
                                    }
                                }
                            } else if ((F2.f11119c & 8) != 0 && (F2 instanceof q2.m)) {
                                r1.o oVar4 = ((q2.m) F2).f10746p;
                                int i10 = 0;
                                while (oVar4 != null) {
                                    if ((oVar4.f11119c & 8) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            F2 = F2;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            F2 = oVar4;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new h1.e(new r1.o[16]);
                                            }
                                            if (F2 != 0) {
                                                eVar2.b(F2);
                                                F2 = 0;
                                            }
                                            eVar2.b(oVar4);
                                        }
                                    } else {
                                        F2 = F2;
                                        eVar2 = eVar2;
                                    }
                                    oVar4 = oVar4.f11122f;
                                    F2 = F2;
                                    eVar2 = eVar2;
                                }
                                if (i10 == 1) {
                                    F2 = F2;
                                    eVar2 = eVar2;
                                } else {
                                    F2 = F2;
                                    eVar2 = eVar2;
                                }
                            }
                            F2 = q2.f.f(eVar2);
                        }
                    }
                    if ((oVar3.f11120d & 8) == 0) {
                        break;
                    }
                    oVar3 = oVar3.f11122f;
                    F = F;
                }
                r8 = F;
            }
        }
        return (y1) r8;
    }

    public final x1.c g() {
        h1 h1VarD = d();
        if (h1VarD != null) {
            if (!h1VarD.G0().f11129n) {
                h1VarD = null;
            }
            if (h1VarD != null) {
                return d1.g(h1VarD).h(h1VarD, true);
            }
        }
        return x1.c.f14522e;
    }

    public final x1.c h() {
        h1 h1VarD = d();
        if (h1VarD != null) {
            if (!h1VarD.G0().f11129n) {
                h1VarD = null;
            }
            if (h1VarD != null) {
                return d1.e(h1VarD);
            }
        }
        return x1.c.f14522e;
    }

    public final List i(boolean z10, boolean z11) {
        if (!z10 && this.f15020d.f15014d) {
            return w.f13122a;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z11);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final j k() {
        boolean zN = n();
        j jVar = this.f15020d;
        if (!zN) {
            return jVar;
        }
        j jVarD = jVar.d();
        p(new ArrayList(), jVarD);
        return jVarD;
    }

    public final m l() {
        h0 h0VarV;
        m mVar = this.f15022f;
        if (mVar != null) {
            return mVar;
        }
        h0 h0Var = this.f15019c;
        boolean z10 = this.f15018b;
        if (!z10) {
            h0VarV = null;
            break;
        }
        h0VarV = h0Var.v();
        while (true) {
            if (h0VarV == null) {
                h0VarV = null;
                break;
            }
            j jVarX = h0VarV.x();
            if (jVarX != null && jVarX.f15013c) {
                break;
            }
            h0VarV = h0VarV.v();
        }
        if (h0VarV == null) {
            for (h0 h0VarV2 = h0Var.v(); h0VarV2 != null; h0VarV2 = h0VarV2.v()) {
                if (h0VarV2.E.d(8)) {
                    h0VarV = h0VarV2;
                }
            }
            h0VarV = null;
        }
        if (h0VarV == null) {
            return null;
        }
        return p.a(h0VarV, z10);
    }

    public final j m() {
        return this.f15020d;
    }

    public final boolean n() {
        return this.f15018b && this.f15020d.f15013c;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean o() {
        if (this.f15021e || !j(4, this).isEmpty()) {
            return false;
        }
        h0 h0VarV = this.f15019c.v();
        while (h0VarV != null) {
            j jVarX = h0VarV.x();
            if (jVarX != null && jVarX.f15013c) {
                if (h0VarV == null) {
                    return true;
                }
                return false;
            }
            h0VarV = h0VarV.v();
        }
        h0VarV = null;
        if (h0VarV == null) {
            return true;
        }
        return false;
    }

    public final void p(ArrayList arrayList, j jVar) {
        if (this.f15020d.f15014d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            m mVar = (m) arrayList.get(size2);
            if (!mVar.n()) {
                jVar.m(mVar.f15020d);
                mVar.p(arrayList, jVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z10) {
        if (this.f15021e) {
            return w.f13122a;
        }
        c(this.f15019c, arrayList);
        if (z10) {
            j jVar = this.f15020d;
            s.h0 h0Var = jVar.f15011a;
            Object objG = h0Var.g(r.f15072x);
            if (objG == null) {
                objG = null;
            }
            g gVar = (g) objG;
            if (gVar != null && jVar.f15013c && !arrayList.isEmpty()) {
                arrayList.add(b(gVar, new b2.a(23, gVar)));
            }
            u uVar = r.f15050a;
            if (h0Var.c(uVar) && !arrayList.isEmpty() && jVar.f15013c) {
                Object objG2 = h0Var.g(uVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) u8.p.m0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new j0(2, str)));
                }
            }
        }
        return arrayList;
    }
}
