package yb;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.k f15286b;

    public q(j jVar, h9.k kVar) {
        i9.l.e(kVar, "transformer");
        this.f15285a = jVar;
        this.f15286b = kVar;
    }

    @Override // yb.j
    public final Iterator iterator() {
        return new p(this);
    }
}
