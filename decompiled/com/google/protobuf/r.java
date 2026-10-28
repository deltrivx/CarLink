package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f2838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2840o;

    public r(byte[] bArr, int i7, int i10) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i11 = i7 + i10;
        if ((i7 | i10 | (bArr.length - i11)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
        }
        this.f2838m = bArr;
        this.f2840o = i7;
        this.f2839n = i11;
    }

    @Override // i2.c
    public final void U(byte[] bArr, int i7, int i10) throws s {
        try {
            System.arraycopy(bArr, i7, this.f2838m, this.f2840o, i10);
            this.f2840o += i10;
        } catch (IndexOutOfBoundsException e7) {
            throw new s(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2840o), Integer.valueOf(this.f2839n), Integer.valueOf(i10)), e7);
        }
    }

    @Override // com.google.protobuf.u
    public final void h0(byte b10) throws s {
        try {
            byte[] bArr = this.f2838m;
            int i7 = this.f2840o;
            this.f2840o = i7 + 1;
            bArr[i7] = b10;
        } catch (IndexOutOfBoundsException e7) {
            throw new s(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2840o), Integer.valueOf(this.f2839n), 1), e7);
        }
    }

    @Override // com.google.protobuf.u
    public final void i0(int i7, boolean z10) throws s {
        s0(i7, 0);
        h0(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.u
    public final void j0(int i7, l lVar) throws s {
        s0(i7, 2);
        u0(lVar.size());
        lVar.v(this);
    }

    @Override // com.google.protobuf.u
    public final void k0(int i7, int i10) throws s {
        s0(i7, 5);
        l0(i10);
    }

    @Override // com.google.protobuf.u
    public final void l0(int i7) throws s {
        try {
            byte[] bArr = this.f2838m;
            int i10 = this.f2840o;
            int i11 = i10 + 1;
            this.f2840o = i11;
            bArr[i10] = (byte) (i7 & 255);
            int i12 = i10 + 2;
            this.f2840o = i12;
            bArr[i11] = (byte) ((i7 >> 8) & 255);
            int i13 = i10 + 3;
            this.f2840o = i13;
            bArr[i12] = (byte) ((i7 >> 16) & 255);
            this.f2840o = i10 + 4;
            bArr[i13] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new s(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2840o), Integer.valueOf(this.f2839n), 1), e7);
        }
    }

    @Override // com.google.protobuf.u
    public final void m0(int i7, long j5) throws s {
        s0(i7, 1);
        n0(j5);
    }

    @Override // com.google.protobuf.u
    public final void n0(long j5) throws s {
        try {
            byte[] bArr = this.f2838m;
            int i7 = this.f2840o;
            int i10 = i7 + 1;
            this.f2840o = i10;
            bArr[i7] = (byte) (((int) j5) & 255);
            int i11 = i7 + 2;
            this.f2840o = i11;
            bArr[i10] = (byte) (((int) (j5 >> 8)) & 255);
            int i12 = i7 + 3;
            this.f2840o = i12;
            bArr[i11] = (byte) (((int) (j5 >> 16)) & 255);
            int i13 = i7 + 4;
            this.f2840o = i13;
            bArr[i12] = (byte) (((int) (j5 >> 24)) & 255);
            int i14 = i7 + 5;
            this.f2840o = i14;
            bArr[i13] = (byte) (((int) (j5 >> 32)) & 255);
            int i15 = i7 + 6;
            this.f2840o = i15;
            bArr[i14] = (byte) (((int) (j5 >> 40)) & 255);
            int i16 = i7 + 7;
            this.f2840o = i16;
            bArr[i15] = (byte) (((int) (j5 >> 48)) & 255);
            this.f2840o = i7 + 8;
            bArr[i16] = (byte) (((int) (j5 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new s(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2840o), Integer.valueOf(this.f2839n), 1), e7);
        }
    }

    @Override // com.google.protobuf.u
    public final void o0(int i7, int i10) throws s {
        s0(i7, 0);
        p0(i10);
    }

    @Override // com.google.protobuf.u
    public final void p0(int i7) throws s {
        if (i7 >= 0) {
            u0(i7);
        } else {
            w0(i7);
        }
    }

    @Override // com.google.protobuf.u
    public final void q0(int i7, l1 l1Var, x1 x1Var) throws s {
        s0(i7, 2);
        u0(((c) l1Var).getSerializedSize(x1Var));
        x1Var.a(l1Var, this.f2860j);
    }

    @Override // com.google.protobuf.u
    public final void r0(int i7, String str) throws s {
        s0(i7, 2);
        int i10 = this.f2840o;
        try {
            int iE0 = u.e0(str.length() * 3);
            int iE1 = u.e0(str.length());
            byte[] bArr = this.f2838m;
            if (iE1 != iE0) {
                u0(m2.b(str));
                this.f2840o = m2.f2795a.B(str, bArr, this.f2840o, x0());
                return;
            }
            int i11 = i10 + iE1;
            this.f2840o = i11;
            int iB = m2.f2795a.B(str, bArr, i11, x0());
            this.f2840o = i10;
            u0((iB - i10) - iE1);
            this.f2840o = iB;
        } catch (l2 e7) {
            this.f2840o = i10;
            g0(str, e7);
        } catch (IndexOutOfBoundsException e10) {
            throw new s(e10);
        }
    }

    @Override // com.google.protobuf.u
    public final void s0(int i7, int i10) throws s {
        u0((i7 << 3) | i10);
    }

    @Override // com.google.protobuf.u
    public final void t0(int i7, int i10) throws s {
        s0(i7, 0);
        u0(i10);
    }

    @Override // com.google.protobuf.u
    public final void u0(int i7) throws s {
        while (true) {
            int i10 = i7 & (-128);
            byte[] bArr = this.f2838m;
            if (i10 == 0) {
                int i11 = this.f2840o;
                this.f2840o = i11 + 1;
                bArr[i11] = (byte) i7;
                return;
            } else {
                try {
                    int i12 = this.f2840o;
                    this.f2840o = i12 + 1;
                    bArr[i12] = (byte) ((i7 & 127) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new s(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2840o), Integer.valueOf(this.f2839n), 1), e7);
                }
            }
            throw new s(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2840o), Integer.valueOf(this.f2839n), 1), e7);
        }
    }

    @Override // com.google.protobuf.u
    public final void v0(int i7, long j5) throws s {
        s0(i7, 0);
        w0(j5);
    }

    @Override // com.google.protobuf.u
    public final void w0(long j5) throws s {
        boolean z10 = u.f2859l;
        byte[] bArr = this.f2838m;
        if (z10 && x0() >= 10) {
            while ((j5 & (-128)) != 0) {
                int i7 = this.f2840o;
                this.f2840o = i7 + 1;
                j2.k(bArr, i7, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            int i10 = this.f2840o;
            this.f2840o = i10 + 1;
            j2.k(bArr, i10, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            try {
                int i11 = this.f2840o;
                this.f2840o = i11 + 1;
                bArr[i11] = (byte) ((((int) j5) & 127) | 128);
                j5 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new s(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2840o), Integer.valueOf(this.f2839n), 1), e7);
            }
        }
        int i12 = this.f2840o;
        this.f2840o = i12 + 1;
        bArr[i12] = (byte) j5;
    }

    public final int x0() {
        return this.f2839n - this.f2840o;
    }
}
