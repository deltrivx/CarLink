package k1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f7177a = m.f7172e.f7176d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7179c;

    public final void a(Object[] objArr, int i7, int i10) {
        this.f7177a = objArr;
        this.f7178b = i7;
        this.f7179c = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7179c < this.f7178b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
