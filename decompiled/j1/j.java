package j1;

import i9.l;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f6893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6894e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i7, int i10, int i11) {
        super(i7, i10);
        this.f6892c = i11;
        Object[] objArr2 = new Object[i11];
        this.f6893d = objArr2;
        ?? r8 = i7 == i10 ? 1 : 0;
        this.f6894e = r8;
        objArr2[0] = objArr;
        b(i7 - r8, 1);
    }

    public final Object a() {
        int i7 = this.f6866a & 31;
        Object obj = this.f6893d[this.f6892c - 1];
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i7];
    }

    public final void b(int i7, int i10) {
        int i11 = (this.f6892c - i10) * 5;
        while (i10 < this.f6892c) {
            Object[] objArr = this.f6893d;
            Object obj = objArr[i10 - 1];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i10] = ((Object[]) obj)[k9.a.D(i7, i11)];
            i11 -= 5;
            i10++;
        }
    }

    public final void c(int i7) {
        int i10 = 0;
        while (k9.a.D(this.f6866a, i10) == i7) {
            i10 += 5;
        }
        if (i10 > 0) {
            b(this.f6866a, ((this.f6892c - 1) - (i10 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i7 = this.f6866a + 1;
        this.f6866a = i7;
        if (i7 == this.f6867b) {
            this.f6894e = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f6866a--;
        if (this.f6894e) {
            this.f6894e = false;
            return a();
        }
        c(31);
        return a();
    }
}
