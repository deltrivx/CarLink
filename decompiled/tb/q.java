package tb;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb.g f12923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12924b;

    public q(int i7, nb.g gVar) {
        this.f12923a = gVar;
        this.f12924b = i7;
    }

    @Override // tb.a
    public final int c() {
        return 1;
    }

    @Override // tb.a
    public final void d(int i7, nb.g gVar) {
        throw new IllegalStateException();
    }

    @Override // tb.a
    public final Object get(int i7) {
        if (i7 == this.f12924b) {
            return this.f12923a;
        }
        return null;
    }

    @Override // tb.a, java.lang.Iterable
    public final Iterator iterator() {
        return new wb.h(2, this);
    }
}
