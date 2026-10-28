package yb;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f15257a;

    public a(j jVar) {
        this.f15257a = new AtomicReference(jVar);
    }

    @Override // yb.j
    public final Iterator iterator() {
        j jVar = (j) this.f15257a.getAndSet(null);
        if (jVar != null) {
            return jVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
