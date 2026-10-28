package j1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6870c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6871d;

    public d(int i7, Object obj) {
        super(i7, 1);
        this.f6871d = obj;
    }

    public d(Object[] objArr, int i7, int i10) {
        super(i7, i10);
        this.f6871d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f6870c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f6871d;
                int i7 = this.f6866a;
                this.f6866a = i7 + 1;
                return objArr[i7];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f6866a++;
                return this.f6871d;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f6870c) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f6871d;
                int i7 = this.f6866a - 1;
                this.f6866a = i7;
                return objArr[i7];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f6866a--;
                return this.f6871d;
        }
    }
}
