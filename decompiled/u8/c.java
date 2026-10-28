package u8;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i9.b implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f13103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i7) {
        super(6, eVar);
        this.f13103d = eVar;
        int iC = eVar.c();
        if (i7 < 0 || i7 > iC) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, iC, "index: ", ", size: "));
        }
        this.f6668b = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6668b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6668b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f6668b - 1;
        this.f6668b = i7;
        return this.f13103d.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6668b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
