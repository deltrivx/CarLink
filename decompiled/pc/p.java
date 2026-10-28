package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f10492c = new p(q.f10493a);

    @Override // pc.a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        i9.l.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        o oVar = (o) obj;
        i9.l.e(oVar, "builder");
        double d10 = aVar.d(this.f10498b, i7);
        oVar.b(oVar.d() + 1);
        double[] dArr = oVar.f10480a;
        int i10 = oVar.f10481b;
        oVar.f10481b = i10 + 1;
        dArr[i10] = d10;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        i9.l.e(dArr, "<this>");
        o oVar = new o();
        oVar.f10480a = dArr;
        oVar.f10481b = dArr.length;
        oVar.b(10);
        return oVar;
    }

    @Override // pc.r0
    public final Object n() {
        return new double[0];
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        double[] dArr = (double[]) obj;
        i9.l.e(sVar, "encoder");
        i9.l.e(dArr, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            sVar.g(this.f10498b, i10, dArr[i10]);
        }
    }
}
