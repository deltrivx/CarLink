package fc;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends gc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5558a = new AtomicReference(null);

    @Override // gc.d
    public final boolean a(gc.b bVar) {
        AtomicReference atomicReference = this.f5558a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(y.f5617b);
        return true;
    }

    @Override // gc.d
    public final y8.c[] b(gc.b bVar) {
        this.f5558a.set(null);
        return gc.c.f6216a;
    }
}
