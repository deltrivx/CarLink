package j1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f6884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f6885d;

    public g(Object[] objArr, Object[] objArr2, int i7, int i10, int i11) {
        super(i7, i10);
        this.f6884c = objArr2;
        int i12 = (i10 - 1) & (-32);
        this.f6885d = new j(objArr, i7 > i12 ? i12 : i7, i12, i11);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f6885d;
        if (jVar.hasNext()) {
            this.f6866a++;
            return jVar.next();
        }
        int i7 = this.f6866a;
        this.f6866a = i7 + 1;
        return this.f6884c[i7 - jVar.f6867b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f6866a;
        j jVar = this.f6885d;
        int i10 = jVar.f6867b;
        if (i7 <= i10) {
            this.f6866a = i7 - 1;
            return jVar.previous();
        }
        int i11 = i7 - 1;
        this.f6866a = i11;
        return this.f6884c[i11 - i10];
    }
}
