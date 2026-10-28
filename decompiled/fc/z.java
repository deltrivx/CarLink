package fc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends gc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cc.l f5620b;

    @Override // gc.d
    public final boolean a(gc.b bVar) {
        x xVar = (x) bVar;
        if (this.f5619a >= 0) {
            return false;
        }
        long j5 = xVar.f5613i;
        if (j5 < xVar.f5614j) {
            xVar.f5614j = j5;
        }
        this.f5619a = j5;
        return true;
    }

    @Override // gc.d
    public final y8.c[] b(gc.b bVar) {
        long j5 = this.f5619a;
        this.f5619a = -1L;
        this.f5620b = null;
        return ((x) bVar).v(j5);
    }
}
