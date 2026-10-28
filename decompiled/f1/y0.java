package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.k f5227b;

    public /* synthetic */ y0(h9.k kVar, int i7) {
        this.f5226a = i7;
        this.f5227b = kVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        long j5;
        switch (this.f5226a) {
            case 0:
                return this.f5227b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                h9.k kVar = this.f5227b;
                nb.w wVar = (nb.w) obj;
                i9.l.b(wVar);
                return kVar.invoke(wVar).toString();
            default:
                p1.j jVar = (p1.j) obj;
                synchronized (p1.l.f10057c) {
                    j5 = p1.l.f10059e;
                    p1.l.f10059e = ((long) 1) + j5;
                }
                return new p1.e(j5, jVar, this.f5227b);
        }
    }
}
