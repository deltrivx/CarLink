package l8;

import androidx.compose.foundation.layout.FillElement;
import c1.u2;
import f1.q1;
import w0.y0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n8.q f8218b;

    public /* synthetic */ m(n8.q qVar, int i7) {
        this.f8217a = i7;
        this.f8218b = qVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f8217a;
        r1.m mVar = r1.m.f11116a;
        t8.z zVar = t8.z.f12851a;
        int i10 = 1;
        n8.q qVar = this.f8218b;
        int i11 = 2;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    r1.p pVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.c(mVar, 2.0f), 0.0f, g5.a.n(16, sVar), 1);
                    hc.c cVar = n8.c.f8897a;
                    qVar.getClass();
                    n3.n.C(new y1.f(n8.c.b(n8.q.j())), "二维码", pVarJ, sVar, 48, 248);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    d0.d dVar = d0.h.f3569d;
                    r1.f fVar = r1.c.f11104n;
                    r1.p pVarJ2 = androidx.compose.foundation.layout.a.j(mVar, 0.0f, g5.a.n(16, sVar2), 1);
                    d0.s sVarA = d0.q.a(dVar, fVar, sVar2, 54);
                    long j5 = sVar2.T;
                    int i12 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar2.l();
                    r1.p pVarC = r1.a.c(sVar2, pVarJ2);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, q2.i.f10708e, sVarA);
                    f1.b.w(sVar2, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i12))) {
                        ob.a.w(i12, sVar2, i12, hVar);
                    }
                    f1.b.w(sVar2, q2.i.f10706c, pVarC);
                    qVar.getClass();
                    String strQ = ob.a.q("打开浏览器上传: ", n8.q.j());
                    long jK = n3.r.K(g5.a.n(22, sVar2), 4294967296L);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
                    u2.b(strQ, fillElement, 0L, jK, null, 0L, new m3.k(3), 0L, 0, false, 0, 0, null, sVar2, 48, 0, 130548);
                    a2.f.L(16, sVar2, mVar, sVar2);
                    String absolutePath = qVar.k.getAbsolutePath();
                    i9.l.d(absolutePath, "getAbsolutePath(...)");
                    u2.b("建议车机连接手机热点, 如果无法打开请手动上传到: ".concat(zb.j.H0(absolutePath, "/storage/emulated/0/")), fillElement, 0L, n3.r.K(g5.a.n(20, sVar2), 4294967296L), null, 0L, new m3.k(3), 0L, 0, false, 0, 0, null, sVar2, 48, 0, 130548);
                    sVar2.p(true);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    y0.b(null, n1.h.e(1899398779, new m(qVar, i10), sVar3), sVar3, 48);
                }
                break;
            default:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    g5.a.b(null, n1.h.e(-579199083, new m(qVar, 0), sVar4), sVar4, 48, 1);
                    d0.c.a(sVar4, androidx.compose.foundation.layout.c.b(mVar, g5.a.n(16, sVar4)));
                    g5.a.b(null, n1.h.e(-1161470594, new m(qVar, i11), sVar4), sVar4, 48, 1);
                }
                break;
        }
        return zVar;
    }
}
