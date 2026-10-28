package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2771f;

    public j(byte[] bArr, int i7, int i10) {
        super(bArr);
        l.d(i7, i7 + i10, bArr.length);
        this.f2770e = i7;
        this.f2771f = i10;
    }

    @Override // com.google.protobuf.k, com.google.protobuf.l
    public final byte c(int i7) {
        int i10 = this.f2771f;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.f2780d[this.f2770e + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(a2.f.E(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a2.f.D(i7, i10, "Index > length: ", ", "));
    }

    @Override // com.google.protobuf.k, com.google.protobuf.l
    public final void n(byte[] bArr, int i7) {
        System.arraycopy(this.f2780d, this.f2770e, bArr, 0, i7);
    }

    @Override // com.google.protobuf.k, com.google.protobuf.l
    public final byte o(int i7) {
        return this.f2780d[this.f2770e + i7];
    }

    @Override // com.google.protobuf.k, com.google.protobuf.l
    public final int size() {
        return this.f2771f;
    }

    @Override // com.google.protobuf.k
    public final int w() {
        return this.f2770e;
    }
}
