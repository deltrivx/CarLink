package yb;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.k f15276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.k f15277c;

    public i(j jVar, h9.k kVar, h9.k kVar2) {
        i9.l.e(kVar, "transformer");
        this.f15275a = jVar;
        this.f15276b = kVar;
        this.f15277c = kVar2;
    }

    @Override // yb.j
    public final Iterator iterator() {
        return new g(this);
    }
}
