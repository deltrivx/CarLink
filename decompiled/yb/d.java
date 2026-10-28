package yb;

import java.util.Iterator;
import u8.a0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements j, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15265b;

    public d(j jVar, int i7) {
        i9.l.e(jVar, "sequence");
        this.f15264a = jVar;
        this.f15265b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // yb.e
    public final j a() {
        int i7 = this.f15265b + 1;
        return i7 < 0 ? new d(this, 1) : new d(this.f15264a, i7);
    }

    @Override // yb.j
    public final Iterator iterator() {
        return new a0(this);
    }
}
