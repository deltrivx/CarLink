package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f2855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OutputStream f2858p;

    public t(OutputStream outputStream, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i7, 20);
        this.f2855m = new byte[iMax];
        this.f2856n = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f2858p = outputStream;
    }

    public final void A0(int i7) {
        boolean z10 = u.f2859l;
        byte[] bArr = this.f2855m;
        if (z10) {
            while ((i7 & (-128)) != 0) {
                int i10 = this.f2857o;
                this.f2857o = i10 + 1;
                j2.k(bArr, i10, (byte) ((i7 & 127) | 128));
                i7 >>>= 7;
            }
            int i11 = this.f2857o;
            this.f2857o = i11 + 1;
            j2.k(bArr, i11, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i12 = this.f2857o;
            this.f2857o = i12 + 1;
            bArr[i12] = (byte) ((i7 & 127) | 128);
            i7 >>>= 7;
        }
        int i13 = this.f2857o;
        this.f2857o = i13 + 1;
        bArr[i13] = (byte) i7;
    }

    public final void B0(long j5) {
        boolean z10 = u.f2859l;
        byte[] bArr = this.f2855m;
        if (z10) {
            while ((j5 & (-128)) != 0) {
                int i7 = this.f2857o;
                this.f2857o = i7 + 1;
                j2.k(bArr, i7, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            int i10 = this.f2857o;
            this.f2857o = i10 + 1;
            j2.k(bArr, i10, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            int i11 = this.f2857o;
            this.f2857o = i11 + 1;
            bArr[i11] = (byte) ((((int) j5) & 127) | 128);
            j5 >>>= 7;
        }
        int i12 = this.f2857o;
        this.f2857o = i12 + 1;
        bArr[i12] = (byte) j5;
    }

    public final void C0() {
        this.f2858p.write(this.f2855m, 0, this.f2857o);
        this.f2857o = 0;
    }

    public final void D0(int i7) {
        if (this.f2856n - this.f2857o < i7) {
            C0();
        }
    }

    public final void E0(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = this.f2857o;
        int i12 = this.f2856n;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f2855m;
        if (i13 >= i10) {
            System.arraycopy(bArr, i7, bArr2, i11, i10);
            this.f2857o += i10;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i11, i13);
        int i14 = i7 + i13;
        int i15 = i10 - i13;
        this.f2857o = i12;
        C0();
        if (i15 > i12) {
            this.f2858p.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f2857o = i15;
        }
    }

    @Override // i2.c
    public final void U(byte[] bArr, int i7, int i10) throws IOException {
        E0(bArr, i7, i10);
    }

    @Override // com.google.protobuf.u
    public final void h0(byte b10) {
        if (this.f2857o == this.f2856n) {
            C0();
        }
        int i7 = this.f2857o;
        this.f2857o = i7 + 1;
        this.f2855m[i7] = b10;
    }

    @Override // com.google.protobuf.u
    public final void i0(int i7, boolean z10) {
        D0(11);
        z0(i7, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i10 = this.f2857o;
        this.f2857o = i10 + 1;
        this.f2855m[i10] = b10;
    }

    @Override // com.google.protobuf.u
    public final void j0(int i7, l lVar) {
        s0(i7, 2);
        u0(lVar.size());
        lVar.v(this);
    }

    @Override // com.google.protobuf.u
    public final void k0(int i7, int i10) {
        D0(14);
        z0(i7, 5);
        x0(i10);
    }

    @Override // com.google.protobuf.u
    public final void l0(int i7) {
        D0(4);
        x0(i7);
    }

    @Override // com.google.protobuf.u
    public final void m0(int i7, long j5) {
        D0(18);
        z0(i7, 1);
        y0(j5);
    }

    @Override // com.google.protobuf.u
    public final void n0(long j5) {
        D0(8);
        y0(j5);
    }

    @Override // com.google.protobuf.u
    public final void o0(int i7, int i10) {
        D0(20);
        z0(i7, 0);
        if (i10 >= 0) {
            A0(i10);
        } else {
            B0(i10);
        }
    }

    @Override // com.google.protobuf.u
    public final void p0(int i7) {
        if (i7 >= 0) {
            u0(i7);
        } else {
            w0(i7);
        }
    }

    @Override // com.google.protobuf.u
    public final void q0(int i7, l1 l1Var, x1 x1Var) {
        s0(i7, 2);
        u0(((c) l1Var).getSerializedSize(x1Var));
        x1Var.a(l1Var, this.f2860j);
    }

    @Override // com.google.protobuf.u
    public final void r0(int i7, String str) throws IOException {
        s0(i7, 2);
        try {
            int length = str.length() * 3;
            int iE0 = u.e0(length);
            int i10 = iE0 + length;
            int i11 = this.f2856n;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iB = m2.f2795a.B(str, bArr, 0, length);
                u0(iB);
                E0(bArr, 0, iB);
                return;
            }
            if (i10 > i11 - this.f2857o) {
                C0();
            }
            int iE1 = u.e0(str.length());
            int i12 = this.f2857o;
            byte[] bArr2 = this.f2855m;
            try {
                if (iE1 != iE0) {
                    int iB2 = m2.b(str);
                    A0(iB2);
                    this.f2857o = m2.f2795a.B(str, bArr2, this.f2857o, iB2);
                    return;
                }
                int i13 = i12 + iE1;
                this.f2857o = i13;
                int iB3 = m2.f2795a.B(str, bArr2, i13, i11 - i13);
                this.f2857o = i12;
                A0((iB3 - i12) - iE1);
                this.f2857o = iB3;
            } catch (l2 e7) {
                this.f2857o = i12;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new s(e10);
            }
        } catch (l2 e11) {
            g0(str, e11);
        }
    }

    @Override // com.google.protobuf.u
    public final void s0(int i7, int i10) {
        u0((i7 << 3) | i10);
    }

    @Override // com.google.protobuf.u
    public final void t0(int i7, int i10) {
        D0(20);
        z0(i7, 0);
        A0(i10);
    }

    @Override // com.google.protobuf.u
    public final void u0(int i7) {
        D0(5);
        A0(i7);
    }

    @Override // com.google.protobuf.u
    public final void v0(int i7, long j5) {
        D0(20);
        z0(i7, 0);
        B0(j5);
    }

    @Override // com.google.protobuf.u
    public final void w0(long j5) {
        D0(10);
        B0(j5);
    }

    public final void x0(int i7) {
        int i10 = this.f2857o;
        int i11 = i10 + 1;
        this.f2857o = i11;
        byte[] bArr = this.f2855m;
        bArr[i10] = (byte) (i7 & 255);
        int i12 = i10 + 2;
        this.f2857o = i12;
        bArr[i11] = (byte) ((i7 >> 8) & 255);
        int i13 = i10 + 3;
        this.f2857o = i13;
        bArr[i12] = (byte) ((i7 >> 16) & 255);
        this.f2857o = i10 + 4;
        bArr[i13] = (byte) ((i7 >> 24) & 255);
    }

    public final void y0(long j5) {
        int i7 = this.f2857o;
        int i10 = i7 + 1;
        this.f2857o = i10;
        byte[] bArr = this.f2855m;
        bArr[i7] = (byte) (j5 & 255);
        int i11 = i7 + 2;
        this.f2857o = i11;
        bArr[i10] = (byte) ((j5 >> 8) & 255);
        int i12 = i7 + 3;
        this.f2857o = i12;
        bArr[i11] = (byte) ((j5 >> 16) & 255);
        int i13 = i7 + 4;
        this.f2857o = i13;
        bArr[i12] = (byte) (255 & (j5 >> 24));
        int i14 = i7 + 5;
        this.f2857o = i14;
        bArr[i13] = (byte) (((int) (j5 >> 32)) & 255);
        int i15 = i7 + 6;
        this.f2857o = i15;
        bArr[i14] = (byte) (((int) (j5 >> 40)) & 255);
        int i16 = i7 + 7;
        this.f2857o = i16;
        bArr[i15] = (byte) (((int) (j5 >> 48)) & 255);
        this.f2857o = i7 + 8;
        bArr[i16] = (byte) (((int) (j5 >> 56)) & 255);
    }

    public final void z0(int i7, int i10) {
        A0((i7 << 3) | i10);
    }
}
