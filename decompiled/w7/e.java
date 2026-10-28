package w7;

import androidx.compose.foundation.layout.FillElement;
import c1.u2;
import c8.u;
import d0.h;
import d0.q;
import f1.q1;
import f1.s;
import h9.n;
import i9.l;
import m3.k;
import n3.r;
import q2.a0;
import q2.i;
import q2.j;
import r1.m;
import r1.p;
import t8.z;
import w0.y0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14169c;

    public /* synthetic */ e(String str, String str2, int i7) {
        this.f14167a = i7;
        this.f14168b = str;
        this.f14169c = str2;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14167a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    d0.d dVar = h.f3569d;
                    r1.f fVar = r1.c.f11104n;
                    float fN = g5.a.n(16, sVar);
                    m mVar = m.f11116a;
                    p pVarJ = androidx.compose.foundation.layout.a.j(mVar, 0.0f, fN, 1);
                    d0.s sVarA = q.a(dVar, fVar, sVar, 54);
                    long j5 = sVar.T;
                    int i7 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar.l();
                    p pVarC = r1.a.c(sVar, pVarJ);
                    j.f10719d0.getClass();
                    a0 a0Var = i.f10705b;
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var);
                    } else {
                        sVar.k0();
                    }
                    f1.b.w(sVar, i.f10708e, sVarA);
                    f1.b.w(sVar, i.f10707d, q1VarL);
                    q2.h hVar = i.f10709f;
                    if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i7))) {
                        ob.a.w(i7, sVar, i7, hVar);
                    }
                    f1.b.w(sVar, i.f10706c, pVarC);
                    String strConcat = this.f14168b.concat(" (扫码复制)");
                    long jK = r.K(g5.a.n(20, sVar), 4294967296L);
                    long jK2 = r.K(g5.a.n(24, sVar), 4294967296L);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
                    u2.b(strConcat, fillElement, 0L, jK, null, 0L, new k(3), jK2, 0, false, 0, 0, null, sVar, 48, 0, 129524);
                    a2.f.L(8, sVar, mVar, sVar);
                    u2.b(this.f14169c, fillElement, 0L, r.K(g5.a.n(20, sVar), 4294967296L), null, 0L, new k(3), 0L, 0, false, 0, 0, null, sVar, 48, 0, 130548);
                    sVar.p(true);
                }
                break;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    y0.b(null, n1.h.e(1385959649, new e(this.f14168b, this.f14169c, 0), sVar2), sVar2, 48);
                }
                break;
            default:
                s sVar3 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    String str = this.f14168b;
                    g5.a.b(null, n1.h.e(2114805499, new u(2, str), sVar3), sVar3, 48, 1);
                    d0.c.a(sVar3, androidx.compose.foundation.layout.c.b(m.f11116a, g5.a.n(16, sVar3)));
                    g5.a.b(null, n1.h.e(1879184740, new e(this.f14169c, str, 1), sVar3), sVar3, 48, 1);
                }
                break;
        }
        return z.f12851a;
    }
}
