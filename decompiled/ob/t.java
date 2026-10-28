package ob;

import a8.c1;
import a8.f1;
import cc.b0;
import i9.x;
import nb.w;
import q2.h1;
import t8.z;
import x.c0;
import x.d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t extends i9.j implements h9.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9665i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i7, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i7, obj, cls, str, str2, i10, i11);
        this.f9665i = i12;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        boolean zB;
        d0 d0VarE0;
        switch (this.f9665i) {
            case 0:
                w wVar = (w) obj;
                w wVar2 = (w) obj2;
                i9.l.e(wVar, "p0");
                i9.l.e(wVar2, "p1");
                ((u) this.f6672b).getClass();
                l.f9655b.getClass();
                m mVar = k.f9654b;
                return Boolean.valueOf(mVar.b(wVar, wVar2) && !mVar.b(wVar2, wVar));
            case 1:
                w wVar3 = (w) obj;
                w wVar4 = (w) obj2;
                i9.l.e(wVar3, "p0");
                i9.l.e(wVar4, "p1");
                return Boolean.valueOf(((m) this.f6672b).a(wVar3, wVar4));
            case 2:
                nc.e eVar = (nc.e) obj;
                int iIntValue = ((Number) obj2).intValue();
                i9.l.e(eVar, "p0");
                rc.i iVar = (rc.i) this.f6672b;
                iVar.getClass();
                if (!eVar.o(iIntValue)) {
                    eVar.n(iIntValue).i();
                }
                iVar.f12325b = false;
                return false;
            default:
                w1.r rVar = (w1.r) obj;
                w1.r rVar2 = (w1.r) obj2;
                c0 c0Var = (c0) this.f6672b;
                if (c0Var.f11129n && (zB = rVar2.b()) != rVar.b()) {
                    h9.k kVar = c0Var.f14332r;
                    if (kVar != null) {
                        kVar.invoke(Boolean.valueOf(zB));
                    }
                    y8.c cVar = null;
                    if (zB) {
                        b0.s(c0Var.m0(), null, new c1(c0Var, cVar, 26), 3);
                        x xVar = new x();
                        q2.f.r(c0Var, new f1(24, xVar, c0Var));
                        h0.d0 d0Var = (h0.d0) xVar.f6688a;
                        if (d0Var != null) {
                            d0Var.a();
                        } else {
                            d0Var = null;
                        }
                        c0Var.f14334t = d0Var;
                        h1 h1Var = c0Var.f14335u;
                        if (h1Var != null && h1Var.G0().f11129n && (d0VarE0 = c0Var.E0()) != null) {
                            d0VarE0.A0(c0Var.f14335u);
                        }
                    } else {
                        h0.d0 d0Var2 = c0Var.f14334t;
                        if (d0Var2 != null) {
                            d0Var2.b();
                        }
                        c0Var.f14334t = null;
                        d0 d0VarE1 = c0Var.E0();
                        if (d0VarE1 != null) {
                            d0VarE1.A0(null);
                        }
                    }
                    q2.f.n(c0Var);
                    b0.k kVar2 = c0Var.f14331q;
                    if (kVar2 != null) {
                        if (zB) {
                            b0.d dVar = c0Var.f14333s;
                            if (dVar != null) {
                                c0Var.D0(kVar2, new b0.e(dVar));
                                c0Var.f14333s = null;
                            }
                            b0.d dVar2 = new b0.d();
                            c0Var.D0(kVar2, dVar2);
                            c0Var.f14333s = dVar2;
                        } else {
                            b0.d dVar3 = c0Var.f14333s;
                            if (dVar3 != null) {
                                c0Var.D0(kVar2, new b0.e(dVar3));
                                c0Var.f14333s = null;
                            }
                        }
                    }
                }
                return z.f12851a;
        }
    }
}
