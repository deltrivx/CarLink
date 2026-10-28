package d1;

import b3.h0;
import b3.j0;
import b3.r0;
import b3.v;
import b3.w;
import b3.x;
import b3.y;
import f1.w2;
import t8.z;
import v.p0;
import y1.k0;
import y1.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f3707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f3708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f3709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w2 f3710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h9.n f3711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w2 f3713g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r0 r0Var, r0 r0Var2, float f10, p0 p0Var, h9.n nVar, boolean z10, p0 p0Var2) {
        super(2);
        this.f3707a = r0Var;
        this.f3708b = r0Var2;
        this.f3709c = f10;
        this.f3710d = p0Var;
        this.f3711e = nVar;
        this.f3712f = z10;
        this.f3713g = p0Var2;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar;
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            r0 r0Var = this.f3707a;
            h0 h0Var = r0Var.f1438a;
            r0 r0Var2 = this.f3708b;
            h0 h0Var2 = r0Var2.f1438a;
            m3.o oVar = j0.f1384d;
            m3.o oVar2 = h0Var.f1356a;
            m3.o oVar3 = h0Var2.f1356a;
            boolean z10 = oVar2 instanceof m3.b;
            float f10 = this.f3709c;
            m3.o bVar = m3.n.f8425a;
            if (!z10 && !(oVar3 instanceof m3.b)) {
                long jQ = y1.h0.q(f10, oVar2.b(), oVar3.b());
                if (jQ != 16) {
                    bVar = new m3.c(jQ);
                }
            } else if (z10 && (oVar3 instanceof m3.b)) {
                m3.b bVar2 = (m3.b) oVar2;
                m3.b bVar3 = (m3.b) oVar3;
                y1.m mVar = (y1.m) j0.b(f10, bVar2.f8402a, bVar3.f8402a);
                float fE = n3.r.E(bVar2.f8403b, bVar3.f8403b, f10);
                if (mVar != null) {
                    if (mVar instanceof n0) {
                        long jT = g5.a.T(fE, ((n0) mVar).f14942a);
                        if (jT != 16) {
                            bVar = new m3.c(jT);
                        }
                    } else {
                        if (!(mVar instanceof y1.j0)) {
                            throw new cc.s();
                        }
                        bVar = new m3.b((y1.j0) mVar, fE);
                    }
                }
            } else {
                bVar = (m3.o) j0.b(f10, oVar2, oVar3);
            }
            m3.o oVar4 = bVar;
            f3.n nVar = (f3.n) j0.b(f10, h0Var.f1361f, h0Var2.f1361f);
            long jC = j0.c(f10, h0Var.f1357b, h0Var2.f1357b);
            f3.k kVar = h0Var.f1358c;
            if (kVar == null) {
                kVar = f3.k.f5258c;
            }
            f3.k kVar2 = h0Var2.f1358c;
            if (kVar2 == null) {
                kVar2 = f3.k.f5258c;
            }
            f3.k kVar3 = new f3.k(n3.r.m(n3.r.F(f10, kVar.f5261a, kVar2.f5261a), 1, 1000));
            f3.i iVar = (f3.i) j0.b(f10, h0Var.f1359d, h0Var2.f1359d);
            f3.j jVar = (f3.j) j0.b(f10, h0Var.f1360e, h0Var2.f1360e);
            String str = (String) j0.b(f10, h0Var.f1362g, h0Var2.f1362g);
            long jC2 = j0.c(f10, h0Var.f1363h, h0Var2.f1363h);
            m3.a aVar = h0Var.f1364i;
            float f11 = aVar != null ? aVar.f8401a : 0.0f;
            m3.a aVar2 = h0Var2.f1364i;
            float fE2 = n3.r.E(f11, aVar2 != null ? aVar2.f8401a : 0.0f, f10);
            m3.p pVar = h0Var.f1365j;
            m3.p pVar2 = m3.p.f8426c;
            if (pVar == null) {
                pVar = pVar2;
            }
            m3.p pVar3 = h0Var2.f1365j;
            if (pVar3 != null) {
                pVar2 = pVar3;
            }
            m3.p pVar4 = new m3.p(n3.r.E(pVar.f8427a, pVar2.f8427a, f10), n3.r.E(pVar.f8428b, pVar2.f8428b, f10));
            i3.b bVar4 = (i3.b) j0.b(f10, h0Var.k, h0Var2.k);
            long jQ2 = y1.h0.q(f10, h0Var.f1366l, h0Var2.f1366l);
            m3.l lVar = (m3.l) j0.b(f10, h0Var.f1367m, h0Var2.f1367m);
            k0 k0Var = h0Var.f1368n;
            if (k0Var == null) {
                k0Var = new k0();
            }
            k0 k0Var2 = h0Var2.f1368n;
            if (k0Var2 == null) {
                k0Var2 = new k0();
            }
            k0 k0Var3 = new k0(n3.r.E(k0Var.f14927c, k0Var2.f14927c, f10), y1.h0.q(f10, k0Var.f14925a, k0Var2.f14925a), n3.r.G(f10, k0Var.f14926b, k0Var2.f14926b));
            y yVar2 = h0Var.f1369o;
            y yVar3 = h0Var2.f1369o;
            x xVar = null;
            if (yVar2 == null && yVar3 == null) {
                yVar = null;
            } else {
                if (yVar2 == null) {
                    yVar2 = y.f1466a;
                }
                yVar = yVar2;
            }
            h0 h0Var3 = new h0(oVar4, jC, kVar3, iVar, jVar, nVar, str, jC2, new m3.a(fE2), pVar4, bVar4, jQ2, lVar, k0Var3, yVar, (a2.h) j0.b(f10, h0Var.f1370p, h0Var2.f1370p));
            v vVar = r0Var.f1439b;
            v vVar2 = r0Var2.f1439b;
            int i7 = w.f1463b;
            int i10 = ((m3.k) j0.b(f10, new m3.k(vVar.f1453a), new m3.k(vVar2.f1453a))).f8419a;
            int i11 = ((m3.m) j0.b(f10, new m3.m(vVar.f1454b), new m3.m(vVar2.f1454b))).f8424a;
            long jC3 = j0.c(f10, vVar.f1455c, vVar2.f1455c);
            m3.q qVar = vVar.f1456d;
            if (qVar == null) {
                qVar = m3.q.f8429c;
            }
            m3.q qVar2 = vVar2.f1456d;
            if (qVar2 == null) {
                qVar2 = m3.q.f8429c;
            }
            m3.q qVar3 = new m3.q(j0.c(f10, qVar.f8430a, qVar2.f8430a), j0.c(f10, qVar.f8431b, qVar2.f8431b));
            x xVar2 = vVar.f1457e;
            x xVar3 = vVar2.f1457e;
            if (xVar2 != null || xVar3 != null) {
                x xVar4 = x.f1464b;
                xVar = xVar2 == null ? xVar4 : xVar2;
                boolean z11 = xVar.f1465a;
                if (xVar3 == null) {
                    xVar3 = xVar4;
                }
                boolean z12 = xVar3.f1465a;
                if (z11 != z12) {
                    ((b3.k) j0.b(f10, new b3.k(), new b3.k())).getClass();
                    xVar = new x(((Boolean) j0.b(f10, Boolean.valueOf(z11), Boolean.valueOf(z12))).booleanValue());
                }
            }
            r0 r0Var3 = new r0(h0Var3, new v(i10, i11, jC3, qVar3, xVar, (m3.i) j0.b(f10, vVar.f1458f, vVar2.f1458f), ((m3.e) j0.b(f10, new m3.e(vVar.f1459g), new m3.e(vVar2.f1459g))).f8407a, ((m3.d) j0.b(f10, new m3.d(vVar.f1460h), new m3.d(vVar2.f1460h))).f8405a, (m3.s) j0.b(f10, vVar.f1461i, vVar2.f1461i)));
            if (this.f3712f) {
                r0Var3 = r0.a(r0Var3, ((y1.q) this.f3713g.getValue()).f14960a, 0L, null, null, 0L, 0L, null, 16777214);
            }
            r.b(((y1.q) this.f3710d.getValue()).f14960a, r0Var3, this.f3711e, sVar, 0);
        }
        return z.f12851a;
    }
}
