package q7;

import a8.l;
import a8.u0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cc.b0;
import cc.d1;
import h9.k;
import i9.t;
import i9.w;
import k2.m0;
import k2.z;
import r2.a3;
import x.x;
import z.a0;
import z.e2;
import z.f0;
import z.g0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10975b;

    public /* synthetic */ g(int i7, Object obj) {
        this.f10974a = i7;
        this.f10975b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [z.z] */
    /* JADX WARN: Type inference failed for: r9v1, types: [z.z] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(z zVar, y8.c cVar) {
        int i7 = this.f10974a;
        final int i10 = 0;
        y8.c cVar2 = null;
        final int i11 = 1;
        t8.z zVar2 = t8.z.f12851a;
        z8.a aVar = z8.a.f15774a;
        Object obj = this.f10975b;
        switch (i7) {
            case 0:
                Object objA0 = ((m0) zVar).A0(new f(new t(), new w(), (h9.a) obj, null, 0), cVar);
                return objA0 == aVar ? objA0 : zVar2;
            case 1:
                Object objL = n4.h.l(zVar, new p0.b(new d1(1, (r0.e) obj, r0.e.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 5), cVar2, i10), cVar);
                if (objL != aVar) {
                    objL = zVar2;
                }
                return objL == aVar ? objL : zVar2;
            case 2:
                Object objL2 = n4.h.l(zVar, new f((t0.a) obj, null), cVar);
                return objL2 == aVar ? objL2 : zVar2;
            case 3:
                Object objA1 = ((m0) zVar).A0(new p0.b((k) obj, cVar2, i11), cVar);
                return objA1 == aVar ? objA1 : zVar2;
            case 4:
                Object objL3 = n4.h.l(zVar, new p0.b((x.h) obj, cVar2, 2), cVar);
                return objL3 == aVar ? objL3 : zVar2;
            case 5:
                final x xVar = (x) obj;
                Object obj2 = null;
                k kVar = (!xVar.f14354v || xVar.K == null) ? null : new k() { // from class: x.v
                    @Override // h9.k
                    public final Object invoke(Object obj3) {
                        switch (i10) {
                            case 0:
                                x xVar2 = xVar;
                                h9.a aVar2 = xVar2.K;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                                if (xVar2.L) {
                                    ((g2.a) q2.f.i(xVar2, r2.j1.f11279l)).a(0);
                                }
                                break;
                            default:
                                x xVar3 = xVar;
                                if (xVar3.f14354v) {
                                    xVar3.f14355w.invoke();
                                }
                                break;
                        }
                        return t8.z.f12851a;
                    }
                };
                x.w wVar = new x.w(xVar, null);
                k kVar2 = new k() { // from class: x.v
                    @Override // h9.k
                    public final Object invoke(Object obj3) {
                        switch (i11) {
                            case 0:
                                x xVar2 = xVar;
                                h9.a aVar2 = xVar2.K;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                                if (xVar2.L) {
                                    ((g2.a) q2.f.i(xVar2, r2.j1.f11279l)).a(0);
                                }
                                break;
                            default:
                                x xVar3 = xVar;
                                if (xVar3.f14354v) {
                                    xVar3.f14355w.invoke();
                                }
                                break;
                        }
                        return t8.z.f12851a;
                    }
                };
                g0 g0Var = e2.f15357a;
                Object objG = b0.g(new a3(zVar, wVar, kVar, obj2, kVar2, null, 4), cVar);
                if (objG != aVar) {
                    objG = zVar2;
                }
                return objG == aVar ? objG : zVar2;
            default:
                l2.d dVar = new l2.d();
                w wVar2 = new w();
                final f0 f0Var = (f0) obj;
                wVar2.f6687a = q2.f.u(f0Var).t(0L);
                Object objG2 = b0.g(new a0(zVar, f0Var, new k3.a(i11, f0Var, dVar), new u0(dVar, zVar, f0Var, 14), new h9.a() { // from class: z.z
                    @Override // h9.a
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                ec.h hVar = f0Var.f15371u;
                                if (hVar != null) {
                                    hVar.x(k.f15419a);
                                }
                                return t8.z.f12851a;
                            default:
                                return Boolean.valueOf(!f0Var.K0());
                        }
                    }
                }, new h9.a() { // from class: z.z
                    @Override // h9.a
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                ec.h hVar = f0Var.f15371u;
                                if (hVar != null) {
                                    hVar.x(k.f15419a);
                                }
                                return t8.z.f12851a;
                            default:
                                return Boolean.valueOf(!f0Var.K0());
                        }
                    }
                }, new l(f0Var, wVar2, dVar, 6), null), cVar);
                return objG2 == aVar ? objG2 : zVar2;
        }
    }
}
