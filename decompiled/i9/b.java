package i9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6669c;

    public /* synthetic */ b(int i7, Object obj) {
        this.f6667a = i7;
        this.f6669c = obj;
    }

    public b(nc.e eVar) {
        this.f6667a = 1;
        this.f6669c = eVar;
        this.f6668b = eVar.k();
    }

    public b(Object[] objArr) {
        this.f6667a = 0;
        l.e(objArr, "array");
        this.f6669c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6667a) {
            case 0:
                return this.f6668b < ((Object[]) this.f6669c).length;
            case 1:
                return this.f6668b > 0;
            case 2:
                return this.f6668b < ((byte[]) this.f6669c).length;
            case 3:
                return this.f6668b < ((int[]) this.f6669c).length;
            case 4:
                return this.f6668b < ((long[]) this.f6669c).length;
            case 5:
                return this.f6668b < ((short[]) this.f6669c).length;
            default:
                return this.f6668b < ((u8.e) this.f6669c).c();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6667a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f6669c;
                    int i7 = this.f6668b;
                    this.f6668b = i7 + 1;
                    return objArr[i7];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f6668b--;
                    throw new NoSuchElementException(e7.getMessage());
                }
            case 1:
                nc.e eVar = (nc.e) this.f6669c;
                int iK = eVar.k();
                int i10 = this.f6668b;
                this.f6668b = i10 - 1;
                return eVar.n(iK - i10);
            case 2:
                int i11 = this.f6668b;
                byte[] bArr = (byte[]) this.f6669c;
                if (i11 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f6668b));
                }
                this.f6668b = i11 + 1;
                return new t8.q(bArr[i11]);
            case 3:
                int i12 = this.f6668b;
                int[] iArr = (int[]) this.f6669c;
                if (i12 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f6668b));
                }
                this.f6668b = i12 + 1;
                return new t8.s(iArr[i12]);
            case 4:
                int i13 = this.f6668b;
                long[] jArr = (long[]) this.f6669c;
                if (i13 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f6668b));
                }
                this.f6668b = i13 + 1;
                return new t8.u(jArr[i13]);
            case 5:
                int i14 = this.f6668b;
                short[] sArr = (short[]) this.f6669c;
                if (i14 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f6668b));
                }
                this.f6668b = i14 + 1;
                return new t8.x(sArr[i14]);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                u8.e eVar2 = (u8.e) this.f6669c;
                int i15 = this.f6668b;
                this.f6668b = i15 + 1;
                return eVar2.get(i15);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6667a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
