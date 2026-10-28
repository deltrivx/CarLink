package c8;

import w0.y0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.p f2515b;

    public /* synthetic */ j(p1.p pVar, int i7) {
        this.f2514a = i7;
        this.f2515b = pVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2514a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    if (objK == f1.n.f5051a) {
                        objK = new i(this.f2515b, 0);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    i2.c.o("清空", (h9.a) objK, sVar, 54);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    r1.p pVarC = androidx.compose.foundation.layout.c.c(n3.r.U(androidx.compose.foundation.layout.a.j(r1.m.f11116a, 0.0f, g5.a.n(6, sVar2), 1), n3.r.N(sVar2), false), g5.a.n(300, sVar2), g5.a.n(15000, sVar2));
                    sVar2.W(5004770);
                    Object objK2 = sVar2.K();
                    if (objK2 == f1.n.f5051a) {
                        objK2 = new k(0, this.f2515b);
                        sVar2.h0(objK2);
                    }
                    sVar2.p(false);
                    o9.e0.b(805306368, 510, null, null, null, sVar2, (h9.k) objK2, null, pVarC, null, null, false);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    y0.b(null, n1.h.e(-946721412, new j(this.f2515b, 1), sVar3), sVar3, 48);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    g5.a.b(null, n1.h.e(-377409281, new j(this.f2515b, 2), sVar4), sVar4, 48, 1);
                }
                break;
            default:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    sVar5.W(5004770);
                    Object objK3 = sVar5.K();
                    if (objK3 == f1.n.f5051a) {
                        objK3 = new i(this.f2515b, 2);
                        sVar5.h0(objK3);
                    }
                    sVar5.p(false);
                    i2.c.o("重置", (h9.a) objK3, sVar5, 54);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
