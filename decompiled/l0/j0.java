package l0;

import f1.w2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3.r0 f7691c;

    public j0(int i7, int i10, b3.r0 r0Var) {
        this.f7689a = i7;
        this.f7690b = i10;
        this.f7691c = r0Var;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f1.s sVar = (f1.s) obj2;
        ((Number) obj3).intValue();
        sVar.W(408240218);
        int i7 = this.f7689a;
        int i10 = this.f7690b;
        q0.x(i7, i10);
        r1.m mVar = r1.m.f11116a;
        if (i7 == 1 && i10 == Integer.MAX_VALUE) {
            sVar.p(false);
            return mVar;
        }
        n3.c cVar = (n3.c) sVar.j(r2.j1.f11276h);
        f3.d dVar = (f3.d) sVar.j(r2.j1.k);
        n3.o oVar = (n3.o) sVar.j(r2.j1.f11281n);
        b3.r0 r0Var = this.f7691c;
        boolean zF = sVar.f(r0Var) | sVar.d(oVar.ordinal());
        Object objK = sVar.K();
        f1.w0 w0Var = f1.n.f5051a;
        if (zF || objK == w0Var) {
            objK = b3.g0.h(r0Var, oVar);
            sVar.h0(objK);
        }
        b3.r0 r0Var2 = (b3.r0) objK;
        boolean zF2 = sVar.f(dVar) | sVar.f(r0Var2);
        Object objK2 = sVar.K();
        if (zF2 || objK2 == w0Var) {
            b3.h0 h0Var = r0Var2.f1438a;
            f3.n nVar = h0Var.f1361f;
            f3.k kVar = h0Var.f1358c;
            if (kVar == null) {
                kVar = f3.k.f5258c;
            }
            f3.i iVar = h0Var.f1359d;
            int i11 = iVar != null ? iVar.f5255a : 0;
            f3.j jVar = h0Var.f1360e;
            objK2 = ((f3.e) dVar).b(nVar, kVar, i11, jVar != null ? jVar.f5256a : 65535);
            sVar.h0(objK2);
        }
        w2 w2Var = (w2) objK2;
        boolean zF3 = sVar.f(w2Var.getValue()) | sVar.f(cVar) | sVar.f(dVar) | sVar.f(r0Var) | sVar.d(oVar.ordinal());
        Object objK3 = sVar.K();
        if (zF3 || objK3 == w0Var) {
            objK3 = Integer.valueOf((int) (e1.a(r0Var2, cVar, dVar, e1.f7631a, 1) & 4294967295L));
            sVar.h0(objK3);
        }
        int iIntValue = ((Number) objK3).intValue();
        boolean zF4 = sVar.f(w2Var.getValue()) | sVar.f(cVar) | sVar.f(dVar) | sVar.f(r0Var) | sVar.d(oVar.ordinal());
        Object objK4 = sVar.K();
        if (zF4 || objK4 == w0Var) {
            StringBuilder sb2 = new StringBuilder();
            String str = e1.f7631a;
            sb2.append(str);
            sb2.append('\n');
            sb2.append(str);
            objK4 = Integer.valueOf((int) (e1.a(r0Var2, cVar, dVar, sb2.toString(), 2) & 4294967295L));
            sVar.h0(objK4);
        }
        int iIntValue2 = ((Number) objK4).intValue() - iIntValue;
        Integer numValueOf = i7 == 1 ? null : Integer.valueOf(((i7 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i10 != Integer.MAX_VALUE ? Integer.valueOf(((i10 - 1) * iIntValue2) + iIntValue) : null;
        r1.p pVarC = androidx.compose.foundation.layout.c.c(mVar, numValueOf != null ? cVar.J(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? cVar.J(numValueOf2.intValue()) : Float.NaN);
        sVar.p(false);
        return pVarC;
    }
}
