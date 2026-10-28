package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cc.y f4888a;

    public b0(cc.y yVar) {
        this.f4888a = yVar;
    }

    @Override // f1.d2
    public final void c() {
        cc.y yVar = this.f4888a;
        if (yVar instanceof g2) {
            ((g2) yVar).a();
        } else {
            cc.b0.e(yVar, new k0(1));
        }
    }

    @Override // f1.d2
    public final void e() {
        cc.y yVar = this.f4888a;
        if (yVar instanceof g2) {
            ((g2) yVar).a();
        } else {
            cc.b0.e(yVar, new k0(1));
        }
    }

    @Override // f1.d2
    public final void f() {
    }
}
