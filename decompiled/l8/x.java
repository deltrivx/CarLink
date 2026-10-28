package l8;

import c1.u2;
import f1.q1;
import f1.w2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x implements h9.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f8267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f8268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.k f8269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w2 f8270d;

    public x(List list, float f10, h9.k kVar, w2 w2Var) {
        this.f8267a = list;
        this.f8268b = f10;
        this.f8269c = kVar;
        this.f8270d = w2Var;
    }

    @Override // h9.p
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        f0.c cVar = (f0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        f1.s sVar = (f1.s) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i7 = (sVar.f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i7 |= sVar.d(iIntValue) ? 32 : 16;
        }
        if (sVar.N(i7 & 1, (i7 & 147) != 146)) {
            int iIntValue3 = ((Number) this.f8267a.get(iIntValue)).intValue();
            sVar.W(-55801148);
            boolean z10 = iIntValue3 == ((Number) this.f8270d.getValue()).intValue();
            r1.h hVar = r1.c.f11096e;
            r1.p pVarB = androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.f820a, this.f8268b);
            sVar.W(-1633490746);
            h9.k kVar = this.f8269c;
            boolean zF = sVar.f(kVar) | sVar.d(iIntValue3);
            Object objK = sVar.K();
            if (zF || objK == f1.n.f5051a) {
                objK = new w(iIntValue3, 0, kVar);
                sVar.h0(objK);
            }
            sVar.p(false);
            r1.p pVarD = androidx.compose.foundation.a.d(pVarB, null, (h9.a) objK, 15);
            o2.m0 m0VarD = d0.m.d(hVar, false);
            long j5 = sVar.T;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
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
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
                ob.a.w(i10, sVar, i10, hVar2);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            String strF0 = zb.j.F0(2, String.valueOf(iIntValue3));
            long jD = n3.r.D(30);
            f3.k kVar2 = z10 ? f3.k.f5260e : f3.k.f5258c;
            sVar.W(-1341057790);
            long j10 = z10 ? ((c1.w) sVar.j(c1.y.f2319a)).f2225a : y1.q.f14949c;
            sVar.p(false);
            u2.b(strF0, null, j10, jD, kVar2, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3072, 0, 131026);
            sVar.p(true);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }
}
