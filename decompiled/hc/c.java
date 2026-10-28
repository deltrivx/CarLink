package hc;

import cc.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.h f6504a;

    public c(y8.h hVar) {
        this.f6504a = hVar;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f6504a + ')';
    }

    @Override // cc.y
    public final y8.h u() {
        return this.f6504a;
    }
}
