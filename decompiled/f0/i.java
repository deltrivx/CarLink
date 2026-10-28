package f0;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0.v f4777c;

    public /* synthetic */ i(h0.v vVar, int i7, int i10) {
        this.f4775a = i10;
        this.f4777c = vVar;
        this.f4776b = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4775a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j jVar = (j) this.f4777c;
                    g7.l lVar = jVar.f4779b.f4770b;
                    int i7 = this.f4776b;
                    h0.i iVarC = lVar.c(i7);
                    ((f) iVarC.f6322c).f4769b.a(jVar.f4780c, Integer.valueOf(i7 - iVarC.f6320a), sVar, 0);
                } else {
                    sVar.Q();
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g7.l lVar2 = ((g0.i) this.f4777c).f5647b.f5645c;
                    int i10 = this.f4776b;
                    h0.i iVarC2 = lVar2.c(i10);
                    ((g0.f) iVarC2.f6322c).f5641c.a(g0.j.f5649a, Integer.valueOf(i10 - iVarC2.f6320a), sVar2, 6);
                } else {
                    sVar2.Q();
                }
                break;
        }
        return z.f12851a;
    }
}
