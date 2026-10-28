package a8;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f200c;

    public /* synthetic */ q(f1.b1 b1Var, f1.b1 b1Var2, int i7) {
        this.f198a = i7;
        this.f199b = b1Var;
        this.f200c = b1Var2;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f198a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(-1633490746);
                    Object objK = sVar.K();
                    if (objK == f1.n.f5051a) {
                        objK = new p(this.f199b, this.f200c);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    i2.c.o("测试", (h9.a) objK, sVar, 54);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    b9.b<b8.d2> bVar = b8.d2.f1577d;
                    ArrayList arrayList = new ArrayList(u8.q.a0(bVar, 10));
                    for (b8.d2 d2Var : bVar) {
                        String str = d2Var.f1578a;
                        String str2 = d2Var.f1579b;
                        arrayList.add(new l8.j0(str + ": " + str2, new l8.m0(str2), null, null, null, 28));
                    }
                    sVar2.W(-1633490746);
                    Object objK2 = sVar2.K();
                    if (objK2 == f1.n.f5051a) {
                        objK2 = new y1(this.f199b, this.f200c, 2);
                        sVar2.h0(objK2);
                    }
                    sVar2.p(false);
                    g5.a.c(arrayList, null, 1, null, 0.0f, 0.0f, (h9.k) objK2, sVar2, 1573248, 58);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
