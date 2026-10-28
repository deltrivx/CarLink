package gc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements y8.c, a9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.c f6275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y8.h f6276b;

    public y(y8.c cVar, y8.h hVar) {
        this.f6275a = cVar;
        this.f6276b = hVar;
    }

    @Override // a9.d
    public final a9.d getCallerFrame() {
        y8.c cVar = this.f6275a;
        if (cVar instanceof a9.d) {
            return (a9.d) cVar;
        }
        return null;
    }

    @Override // y8.c
    public final y8.h getContext() {
        return this.f6276b;
    }

    @Override // y8.c
    public final void resumeWith(Object obj) {
        this.f6275a.resumeWith(obj);
    }
}
