package n9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8971d;

    public c(int i7, int i10, int i11) {
        this.f8968a = i11;
        this.f8969b = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i7 >= i10 : i7 <= i10) {
            z10 = true;
        }
        this.f8970c = z10;
        this.f8971d = z10 ? i7 : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8970c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i7 = this.f8971d;
        if (i7 != this.f8969b) {
            this.f8971d = this.f8968a + i7;
            return i7;
        }
        if (!this.f8970c) {
            throw new NoSuchElementException();
        }
        this.f8970c = false;
        return i7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
