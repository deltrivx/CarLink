package l8;

import a8.y1;
import f1.b1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f8249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f8251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f8252d;

    public s(List list, int i7, b1 b1Var, b1 b1Var2) {
        this.f8249a = list;
        this.f8250b = i7;
        this.f8251c = b1Var;
        this.f8252d = b1Var2;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            b1 b1Var = this.f8251c;
            j0 j0Var = (j0) b1Var.getValue();
            sVar.W(-1633490746);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new y1(this.f8252d, b1Var, 3);
                sVar.h0(objK);
            }
            sVar.p(false);
            g5.a.c(this.f8249a, j0Var, this.f8250b, null, 0.0f, 0.0f, (h9.k) objK, sVar, 1572864, 56);
        }
        return t8.z.f12851a;
    }
}
