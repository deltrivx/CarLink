package e8;

import f1.q1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4579a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f4582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4583e;

    public m(f1.b1 b1Var, f1.b1 b1Var2, List list, f1.b1 b1Var3) {
        this.f4580b = b1Var;
        this.f4581c = b1Var2;
        this.f4582d = list;
        this.f4583e = b1Var3;
    }

    public m(List list, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3) {
        this.f4582d = list;
        this.f4580b = b1Var;
        this.f4581c = b1Var2;
        this.f4583e = b1Var3;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        int i7 = this.f4579a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f4583e;
        f1.w0 w0Var = f1.n.f5051a;
        f1.b1 b1Var2 = this.f4580b;
        f1.b1 b1Var3 = this.f4581c;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    int i10 = w.f4641e;
                    l8.j0 j0Var = (l8.j0) b1Var2.getValue();
                    sVar.W(-1746271574);
                    Object objK = sVar.K();
                    if (objK == w0Var) {
                        z10 = false;
                        objK = new l(0, b1Var2, b1Var3, b1Var);
                        sVar.h0(objK);
                    } else {
                        z10 = false;
                    }
                    sVar.p(z10);
                    g5.a.c(this.f4582d, j0Var, 0, null, 0.0f, 0.0f, (h9.k) objK, sVar, 1572864, 60);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    sVar2.W(1849434622);
                    Object objK2 = sVar2.K();
                    if (objK2 == w0Var) {
                        objK2 = ob.a.m(sVar2);
                    }
                    b0.k kVar = (b0.k) objK2;
                    Object objC = a2.f.C(sVar2, false, 5004770);
                    if (objC == w0Var) {
                        objC = new a8.k(b1Var2, 25);
                        sVar2.h0(objC);
                    }
                    h9.a aVar = (h9.a) objC;
                    sVar2.p(false);
                    r1.m mVar = r1.m.f11116a;
                    r1.p pVarC = androidx.compose.foundation.a.c(mVar, kVar, null, false, aVar, 28);
                    d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar2, 0);
                    long j5 = sVar2.T;
                    int i11 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar2.l();
                    r1.p pVarC2 = r1.a.c(sVar2, pVarC);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    q2.h hVar = q2.i.f10708e;
                    f1.b.w(sVar2, hVar, sVarA);
                    q2.h hVar2 = q2.i.f10707d;
                    f1.b.w(sVar2, hVar2, q1VarL);
                    q2.h hVar3 = q2.i.f10709f;
                    if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i11))) {
                        ob.a.w(i11, sVar2, i11, hVar3);
                    }
                    q2.h hVar4 = q2.i.f10706c;
                    f1.b.w(sVar2, hVar4, pVarC2);
                    i2.c.m("高德广播", null, sVar2, 6, 2);
                    d0.c.a(sVar2, androidx.compose.foundation.layout.c.b(mVar, g5.a.n(5, sVar2)));
                    d0.n0 n0VarA = d0.l0.a(d0.h.f3566a, r1.c.f11101j, sVar2, 0);
                    long j10 = sVar2.T;
                    int i12 = (int) (j10 ^ (j10 >>> 32));
                    q1 q1VarL2 = sVar2.l();
                    r1.p pVarC3 = r1.a.c(sVar2, mVar);
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, hVar, n0VarA);
                    f1.b.w(sVar2, hVar2, q1VarL2);
                    if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i12))) {
                        ob.a.w(i12, sVar2, i12, hVar3);
                    }
                    f1.b.w(sVar2, hVar4, pVarC3);
                    int i13 = w.f4641e;
                    i2.c.p(((l8.j0) b1Var3.getValue()).f8196a, sVar2, 0);
                    i2.c.i(0, sVar2);
                    sVar2.p(true);
                    sVar2.p(true);
                    boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
                    sVar2.W(5004770);
                    Object objK3 = sVar2.K();
                    if (objK3 == w0Var) {
                        objK3 = new a8.k(b1Var2, 26);
                        sVar2.h0(objK3);
                    }
                    sVar2.p(false);
                    l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, n1.h.e(2135749617, new m(this.f4582d, b1Var3, b1Var2, b1Var), sVar2), sVar2, 48, 1020);
                }
                break;
        }
        return zVar;
    }
}
