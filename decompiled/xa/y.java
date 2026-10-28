package xa;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f14833h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f14835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f14836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14839g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        int i10 = 1;
        while (i7 > 0) {
            arrayList.add(Integer.valueOf(i7));
            int i11 = i10 + i7;
            i10 = i7;
            i7 = i11;
        }
        arrayList.add(Integer.MAX_VALUE);
        f14833h = new int[arrayList.size()];
        int i12 = 0;
        while (true) {
            int[] iArr = f14833h;
            if (i12 >= iArr.length) {
                return;
            }
            iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
            i12++;
        }
    }

    public y(d dVar, d dVar2) {
        this.f14835c = dVar;
        this.f14836d = dVar2;
        int size = dVar.size();
        this.f14837e = size;
        this.f14834b = dVar2.size() + size;
        this.f14838f = Math.max(dVar.n(), dVar2.n()) + 1;
    }

    public final boolean equals(Object obj) {
        int iT;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            int size = dVar.size();
            int i7 = this.f14834b;
            if (i7 == size) {
                if (i7 == 0) {
                    return true;
                }
                if (this.f14839g == 0 || (iT = dVar.t()) == 0 || this.f14839g == iT) {
                    w wVar = new w(this);
                    t tVarA = wVar.next();
                    w wVar2 = new w(dVar);
                    t tVarA2 = wVar2.next();
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        int length = tVarA.f14826b.length - i10;
                        int length2 = tVarA2.f14826b.length - i11;
                        int iMin = Math.min(length, length2);
                        if (!(i10 == 0 ? tVarA.x(tVarA2, i11, iMin) : tVarA2.x(tVarA, i10, iMin))) {
                            break;
                        }
                        i12 += iMin;
                        if (i12 >= i7) {
                            if (i12 == i7) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            tVarA = wVar.next();
                            i10 = 0;
                        } else {
                            i10 += iMin;
                        }
                        if (iMin == length2) {
                            tVarA2 = wVar2.next();
                            i11 = 0;
                        } else {
                            i11 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iR = this.f14839g;
        if (iR == 0) {
            int i7 = this.f14834b;
            iR = r(i7, 0, i7);
            if (iR == 0) {
                iR = 1;
            }
            this.f14839g = iR;
        }
        return iR;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new x(this);
    }

    @Override // xa.d
    public final void m(int i7, byte[] bArr, int i10, int i11) {
        int i12 = i7 + i11;
        d dVar = this.f14835c;
        int i13 = this.f14837e;
        if (i12 <= i13) {
            dVar.m(i7, bArr, i10, i11);
            return;
        }
        d dVar2 = this.f14836d;
        if (i7 >= i13) {
            dVar2.m(i7 - i13, bArr, i10, i11);
            return;
        }
        int i14 = i13 - i7;
        dVar.m(i7, bArr, i10, i14);
        dVar2.m(0, bArr, i10 + i14, i11 - i14);
    }

    @Override // xa.d
    public final int n() {
        return this.f14838f;
    }

    @Override // xa.d
    public final boolean o() {
        return this.f14834b >= f14833h[this.f14838f];
    }

    @Override // xa.d
    public final boolean p() {
        int iS = this.f14835c.s(0, 0, this.f14837e);
        d dVar = this.f14836d;
        return dVar.s(iS, 0, dVar.size()) == 0;
    }

    @Override // xa.d
    public final int r(int i7, int i10, int i11) {
        int i12 = i10 + i11;
        d dVar = this.f14835c;
        int i13 = this.f14837e;
        if (i12 <= i13) {
            return dVar.r(i7, i10, i11);
        }
        d dVar2 = this.f14836d;
        if (i10 >= i13) {
            return dVar2.r(i7, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return dVar2.r(dVar.r(i7, i10, i14), 0, i11 - i14);
    }

    @Override // xa.d
    public final int s(int i7, int i10, int i11) {
        int i12 = i10 + i11;
        d dVar = this.f14835c;
        int i13 = this.f14837e;
        if (i12 <= i13) {
            return dVar.s(i7, i10, i11);
        }
        d dVar2 = this.f14836d;
        if (i10 >= i13) {
            return dVar2.s(i7, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return dVar2.s(dVar.s(i7, i10, i14), 0, i11 - i14);
    }

    @Override // xa.d
    public final int size() {
        return this.f14834b;
    }

    @Override // xa.d
    public final int t() {
        return this.f14839g;
    }

    @Override // xa.d
    public final String u() {
        byte[] bArr;
        int i7 = this.f14834b;
        if (i7 == 0) {
            bArr = p.f14822a;
        } else {
            byte[] bArr2 = new byte[i7];
            m(0, bArr2, 0, i7);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // xa.d
    public final void w(OutputStream outputStream, int i7, int i10) {
        int i11 = i7 + i10;
        d dVar = this.f14835c;
        int i12 = this.f14837e;
        if (i11 <= i12) {
            dVar.w(outputStream, i7, i10);
            return;
        }
        d dVar2 = this.f14836d;
        if (i7 >= i12) {
            dVar2.w(outputStream, i7 - i12, i10);
            return;
        }
        int i13 = i12 - i7;
        dVar.w(outputStream, i7, i13);
        dVar2.w(outputStream, 0, i10 - i13);
    }
}
