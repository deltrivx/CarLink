package c8;

import c1.k0;
import e2.i0;
import f1.w0;
import java.util.List;
import y1.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2562a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2565d;

    public x(int i7, h0.v vVar, Object obj) {
        this.f2564c = vVar;
        this.f2563b = i7;
        this.f2565d = obj;
    }

    public x(int i7, h9.k kVar, List list) {
        this.f2563b = i7;
        this.f2564c = list;
        this.f2565d = kVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        w0 w0Var;
        boolean z11;
        r1.p pVarC;
        int i7 = this.f2562a;
        t8.z zVar = t8.z.f12851a;
        Object obj3 = this.f2565d;
        int i10 = this.f2563b;
        Object obj4 = this.f2564c;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                h9.k kVar = (h9.k) obj3;
                List list = (List) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    e2.f fVarB = n3.u.f8765c;
                    if (fVarB == null) {
                        e2.e eVar = new e2.e("Filled.ArrowUpward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = i0.f4202a;
                        n0 n0Var = new n0(y1.q.f14948b);
                        e2.g gVar = new e2.g();
                        gVar.i(4.0f, 12.0f);
                        gVar.h(1.41f, 1.41f);
                        gVar.g(11.0f, 7.83f);
                        gVar.k(20.0f);
                        gVar.f(2.0f);
                        gVar.k(7.83f);
                        gVar.h(5.58f, 5.59f);
                        gVar.g(20.0f, 12.0f);
                        gVar.h(-8.0f, -8.0f);
                        gVar.h(-8.0f, 8.0f);
                        gVar.c();
                        e2.e.a(eVar, gVar.f4168a, n0Var);
                        fVarB = eVar.b();
                        n3.u.f8765c = fVarB;
                    }
                    sVar.W(1742057699);
                    w0 w0Var2 = f1.n.f5051a;
                    r1.p pVarC2 = r1.m.f11116a;
                    if (i10 > 0) {
                        sVar.W(1849434622);
                        Object objK = sVar.K();
                        if (objK == w0Var2) {
                            objK = ob.a.m(sVar);
                        }
                        b0.k kVar2 = (b0.k) objK;
                        sVar.p(false);
                        sVar.W(-1746271574);
                        boolean zH = sVar.h(list) | sVar.d(i10) | sVar.f(kVar);
                        Object objK2 = sVar.K();
                        if (zH || objK2 == w0Var2) {
                            z10 = false;
                            objK2 = new w(list, i10, kVar, 0);
                            sVar.h0(objK2);
                        } else {
                            z10 = false;
                        }
                        sVar.p(z10);
                        pVarC2 = androidx.compose.foundation.a.c(pVarC2, kVar2, null, false, (h9.a) objK2, 28);
                    } else {
                        z10 = false;
                    }
                    sVar.p(z10);
                    sVar.W(1742079585);
                    long j5 = i10 > 0 ? ((y1.q) sVar.j(c1.a0.f1805a)).f14960a : y1.q.f14949c;
                    sVar.p(z10);
                    k0.b(fVarB, "上移", pVarC2, j5, sVar, 48, 0);
                    d0.c.a(sVar, androidx.compose.foundation.layout.c.k(pVarC2, g5.a.n(12, sVar)));
                    e2.f fVarB2 = n3.n.f8747a;
                    if (fVarB2 == null) {
                        e2.e eVar2 = new e2.e("Filled.ArrowDownward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = i0.f4202a;
                        n0 n0Var2 = new n0(y1.q.f14948b);
                        e2.g gVar2 = new e2.g();
                        gVar2.i(20.0f, 12.0f);
                        gVar2.h(-1.41f, -1.41f);
                        gVar2.g(13.0f, 16.17f);
                        gVar2.k(4.0f);
                        gVar2.f(-2.0f);
                        gVar2.l(12.17f);
                        gVar2.h(-5.58f, -5.59f);
                        gVar2.g(4.0f, 12.0f);
                        gVar2.h(8.0f, 8.0f);
                        gVar2.h(8.0f, -8.0f);
                        gVar2.c();
                        e2.e.a(eVar2, gVar2.f4168a, n0Var2);
                        fVarB2 = eVar2.b();
                        n3.n.f8747a = fVarB2;
                    }
                    sVar.W(1742091225);
                    if (i10 < n3.l.A(list)) {
                        sVar.W(1849434622);
                        Object objK3 = sVar.K();
                        w0Var = w0Var2;
                        if (objK3 == w0Var) {
                            objK3 = ob.a.m(sVar);
                        }
                        b0.k kVar3 = (b0.k) objK3;
                        sVar.p(false);
                        sVar.W(-1746271574);
                        boolean zH2 = sVar.h(list) | sVar.d(i10) | sVar.f(kVar);
                        Object objK4 = sVar.K();
                        if (zH2 || objK4 == w0Var) {
                            objK4 = new w(list, i10, kVar, 1);
                            sVar.h0(objK4);
                        }
                        z11 = false;
                        sVar.p(false);
                        pVarC = androidx.compose.foundation.a.c(pVarC2, kVar3, null, false, (h9.a) objK4, 28);
                    } else {
                        w0Var = w0Var2;
                        z11 = false;
                        pVarC = pVarC2;
                    }
                    sVar.p(z11);
                    sVar.W(1742113815);
                    long j10 = i10 < n3.l.A(list) ? ((y1.q) sVar.j(c1.a0.f1805a)).f14960a : y1.q.f14949c;
                    sVar.p(false);
                    k0.b(fVarB2, "下移", pVarC, j10, sVar, 48, 0);
                    d0.c.a(sVar, androidx.compose.foundation.layout.c.k(pVarC2, g5.a.n(20, sVar)));
                    sVar.W(-1746271574);
                    boolean zH3 = sVar.h(list) | sVar.d(i10) | sVar.f(kVar);
                    Object objK5 = sVar.K();
                    if (zH3 || objK5 == w0Var) {
                        objK5 = new w(i10, kVar, list);
                        sVar.h0(objK5);
                    }
                    sVar.p(false);
                    i2.c.m("删除", (h9.a) objK5, sVar, 6, 0);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    sVar2.Q();
                } else {
                    ((h0.v) obj4).e(i10, obj3, sVar2, 0);
                }
                break;
        }
        return zVar;
    }
}
