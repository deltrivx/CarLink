package q2;

import f1.x2;
import r2.r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i9.n implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f10662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f10663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f10664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f10665e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10666a;

    static {
        int i7 = 2;
        f10662b = new h(i7, 0);
        f10663c = new h(i7, 1);
        f10664d = new h(i7, 2);
        f10665e = new h(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i10) {
        super(i7);
        this.f10666a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10666a) {
            case 0:
                ((Number) obj2).intValue();
                ((j) obj).getClass();
                break;
            case 1:
                ((h0) ((j) obj)).c0((o2.m0) obj2);
                break;
            case 2:
                ((h0) ((j) obj)).d0((r1.p) obj2);
                break;
            default:
                f1.a0 a0Var = (f1.a0) obj2;
                h0 h0Var = (h0) ((j) obj);
                h0Var.A = a0Var;
                d1 d1Var = h0Var.E;
                x2 x2Var = r2.j1.f11276h;
                n1.g gVar = (n1.g) a0Var;
                gVar.getClass();
                h0Var.Z((n3.c) f1.b.t(gVar, x2Var));
                n3.o oVar = (n3.o) f1.b.t(gVar, r2.j1.f11281n);
                if (h0Var.f10690y != oVar) {
                    h0Var.f10690y = oVar;
                    h0Var.E();
                    h0 h0VarV = h0Var.v();
                    if (h0VarV != null) {
                        h0VarV.C();
                    }
                    h0Var.D();
                    for (r1.o oVar2 = d1Var.f10617f; oVar2 != null; oVar2 = oVar2.f11122f) {
                        oVar2.t0();
                    }
                }
                h0Var.e0((r2) f1.b.t(gVar, r2.j1.f11286s));
                r1.o oVar3 = d1Var.f10617f;
                if ((oVar3.f11120d & 32768) != 0) {
                    while (oVar3 != null) {
                        if ((oVar3.f11119c & 32768) != 0) {
                            ?? F = oVar3;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof k) {
                                    r1.o oVar4 = ((r1.o) ((k) F)).f11117a;
                                    if (oVar4.f11129n) {
                                        i1.c(oVar4);
                                    } else {
                                        oVar4.f11126j = true;
                                    }
                                } else if ((F.f11119c & 32768) != 0 && (F instanceof m)) {
                                    r1.o oVar5 = ((m) F).f10746p;
                                    int i7 = 0;
                                    while (oVar5 != null) {
                                        if ((oVar5.f11119c & 32768) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                F = F;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F = oVar5;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(oVar5);
                                            }
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                        }
                                        oVar5 = oVar5.f11122f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                                F = f.f(eVar);
                            }
                        }
                        if ((oVar3.f11120d & 32768) != 0) {
                            oVar3 = oVar3.f11122f;
                        }
                    }
                }
                break;
        }
        return t8.z.f12851a;
    }
}
