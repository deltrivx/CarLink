package n5;

import g1.j0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8836f;

    public j(int i7, int i10, int i11, byte[] bArr, int i12) {
        super(i11, i12, 1, (byte) 0);
        if (i11 > i7 || i12 > i10) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f8834d = bArr;
        this.f8835e = i7;
        this.f8836f = i10;
    }

    @Override // g1.j0
    public final byte[] e() {
        byte[] bArr = this.f8834d;
        int i7 = this.f5792b;
        int i10 = this.f5793c;
        int i11 = this.f8835e;
        if (i7 == i11 && i10 == this.f8836f) {
            return bArr;
        }
        int i12 = i7 * i10;
        byte[] bArr2 = new byte[i12];
        if (i7 == i11) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * i7, i7);
            i13 += i11;
        }
        return bArr2;
    }

    @Override // g1.j0
    public final byte[] f(byte[] bArr, int i7) {
        if (i7 < 0 || i7 >= this.f5793c) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i7)));
        }
        int i10 = this.f5792b;
        if (bArr == null || bArr.length < i10) {
            bArr = new byte[i10];
        }
        System.arraycopy(this.f8834d, i7 * this.f8835e, bArr, 0, i10);
        return bArr;
    }
}
