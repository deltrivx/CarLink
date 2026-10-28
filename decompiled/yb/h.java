package yb;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.k f15274c;

    public h(j jVar, boolean z10, h9.k kVar) {
        this.f15272a = jVar;
        this.f15273b = z10;
        this.f15274c = kVar;
    }

    @Override // yb.j
    public final Iterator iterator() {
        return new g(this);
    }
}
