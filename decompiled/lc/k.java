package lc;

import hc.q;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f8388e;

    public k(long j5, k kVar, int i7) {
        super(j5, kVar, i7);
        this.f8388e = new AtomicReferenceArray(j.f8387f);
    }

    @Override // hc.q
    public final int g() {
        return j.f8387f;
    }

    @Override // hc.q
    public final void h(int i7, y8.h hVar) {
        this.f8388e.set(i7, j.f8386e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f6535c + ", hashCode=" + hashCode() + ']';
    }
}
