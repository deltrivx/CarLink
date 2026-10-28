package o1;

import a8.u0;
import f1.n;
import f1.s;
import f1.u1;
import f1.w0;
import f1.w1;
import f1.x2;
import h0.u;
import java.util.Map;
import l0.t0;
import s.h0;
import s.o0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u0.k f9273e = new u0.k(18, new g0.g(11), new t0(21));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f9275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f9276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c8.k f9277d;

    public d(Map map) {
        this.f9274a = map;
        long[] jArr = o0.f12476a;
        this.f9275b = new h0();
        this.f9277d = new c8.k(22, this);
    }

    @Override // o1.b
    public final void d(Object obj, n1.c cVar, s sVar, int i7) {
        int i10;
        sVar.Y(533563200);
        if ((i7 & 6) == 0) {
            i10 = (sVar.h(obj) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(this) ? 256 : 128;
        }
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            sVar.Z(obj);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                c8.k kVar = this.f9277d;
                if (!((Boolean) kVar.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f9274a.get(obj);
                x2 x2Var = h.f9281a;
                i iVar = new i(new g(map, kVar));
                sVar.h0(iVar);
                objK = iVar;
            }
            i iVar2 = (i) objK;
            f1.b.b(new u1[]{h.f9281a.a(iVar2), b5.a.f1515a.a(iVar2)}, cVar, sVar, (i10 & 112) | 8);
            boolean zH = sVar.h(this) | sVar.h(obj) | sVar.h(iVar2);
            Object objK2 = sVar.K();
            if (zH || objK2 == w0Var) {
                objK2 = new u0(this, obj, iVar2, 7);
                sVar.h0(objK2);
            }
            f1.b.c(z.f12851a, (h9.k) objK2, sVar);
            if (sVar.f5129y && sVar.G.f4978i == sVar.f5130z) {
                sVar.f5130z = -1;
                sVar.f5129y = false;
            }
            sVar.p(false);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new u(this, obj, cVar, i7, 4);
        }
    }
}
