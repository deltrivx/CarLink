package n5;

import g1.j0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f8829d;

    public g(j0 j0Var) {
        super(j0Var.f5792b, j0Var.f5793c, 1, (byte) 0);
        this.f8829d = j0Var;
    }

    @Override // g1.j0
    public final byte[] e() {
        byte[] bArrE = this.f8829d.e();
        int i7 = this.f5792b * this.f5793c;
        byte[] bArr = new byte[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i10] = (byte) (255 - (bArrE[i10] & 255));
        }
        return bArr;
    }

    @Override // g1.j0
    public final byte[] f(byte[] bArr, int i7) {
        byte[] bArrF = this.f8829d.f(bArr, i7);
        for (int i10 = 0; i10 < this.f5792b; i10++) {
            bArrF[i10] = (byte) (255 - (bArrF[i10] & 255));
        }
        return bArrF;
    }

    @Override // g1.j0
    public final boolean g() {
        return this.f8829d.g();
    }

    @Override // g1.j0
    public final j0 h() {
        return new g(this.f8829d.h());
    }
}
