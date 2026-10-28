package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f2805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2812j = Integer.MAX_VALUE;

    public o(ByteBuffer byteBuffer, boolean z10) {
        this.f2805c = byteBuffer;
        long j5 = j2.f2774c.j(j2.f2778g, byteBuffer);
        this.f2806d = j5;
        this.f2807e = ((long) byteBuffer.limit()) + j5;
        long jPosition = j5 + ((long) byteBuffer.position());
        this.f2808f = jPosition;
        this.f2809g = jPosition;
    }

    @Override // com.google.protobuf.p
    public final int A() {
        return E();
    }

    @Override // com.google.protobuf.p
    public final long B() {
        return F();
    }

    public final int C() throws w0 {
        long j5 = this.f2808f;
        if (this.f2807e - j5 < 4) {
            throw w0.g();
        }
        this.f2808f = 4 + j5;
        i2 i2Var = j2.f2774c;
        return ((i2Var.e(j5 + 3) & 255) << 24) | (i2Var.e(j5) & 255) | ((i2Var.e(1 + j5) & 255) << 8) | ((i2Var.e(2 + j5) & 255) << 16);
    }

    public final long D() throws w0 {
        long j5 = this.f2808f;
        if (this.f2807e - j5 < 8) {
            throw w0.g();
        }
        this.f2808f = 8 + j5;
        i2 i2Var = j2.f2774c;
        return ((((long) i2Var.e(j5 + 7)) & 255) << 56) | (((long) i2Var.e(j5)) & 255) | ((((long) i2Var.e(1 + j5)) & 255) << 8) | ((((long) i2Var.e(2 + j5)) & 255) << 16) | ((((long) i2Var.e(3 + j5)) & 255) << 24) | ((((long) i2Var.e(4 + j5)) & 255) << 32) | ((((long) i2Var.e(5 + j5)) & 255) << 40) | ((((long) i2Var.e(6 + j5)) & 255) << 48);
    }

    public final int E() {
        int i7;
        long j5 = this.f2808f;
        if (this.f2807e != j5) {
            long j10 = 1 + j5;
            i2 i2Var = j2.f2774c;
            byte bE = i2Var.e(j5);
            if (bE >= 0) {
                this.f2808f = j10;
                return bE;
            }
            if (this.f2807e - j10 >= 9) {
                long j11 = 2 + j5;
                int iE = (i2Var.e(j10) << 7) ^ bE;
                if (iE < 0) {
                    i7 = iE ^ (-128);
                } else {
                    long j12 = 3 + j5;
                    int iE2 = iE ^ (i2Var.e(j11) << 14);
                    if (iE2 >= 0) {
                        i7 = iE2 ^ 16256;
                    } else {
                        long j13 = 4 + j5;
                        int iE3 = iE2 ^ (i2Var.e(j12) << 21);
                        if (iE3 < 0) {
                            i7 = (-2080896) ^ iE3;
                        } else {
                            j12 = 5 + j5;
                            byte bE2 = i2Var.e(j13);
                            int i10 = (iE3 ^ (bE2 << 28)) ^ 266354560;
                            if (bE2 < 0) {
                                j13 = 6 + j5;
                                if (i2Var.e(j12) < 0) {
                                    j12 = 7 + j5;
                                    if (i2Var.e(j13) < 0) {
                                        j13 = 8 + j5;
                                        if (i2Var.e(j12) < 0) {
                                            long j14 = 9 + j5;
                                            if (i2Var.e(j13) < 0) {
                                                long j15 = j5 + 10;
                                                if (i2Var.e(j14) >= 0) {
                                                    j11 = j15;
                                                    i7 = i10;
                                                }
                                            } else {
                                                i7 = i10;
                                                j11 = j14;
                                            }
                                        }
                                    }
                                }
                                i7 = i10;
                            }
                            i7 = i10;
                        }
                        j11 = j13;
                    }
                    j11 = j12;
                }
                this.f2808f = j11;
                return i7;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j5;
        long j10;
        long j11;
        long j12 = this.f2808f;
        if (this.f2807e != j12) {
            long j13 = 1 + j12;
            i2 i2Var = j2.f2774c;
            byte bE = i2Var.e(j12);
            if (bE >= 0) {
                this.f2808f = j13;
                return bE;
            }
            if (this.f2807e - j13 >= 9) {
                long j14 = 2 + j12;
                int iE = (i2Var.e(j13) << 7) ^ bE;
                if (iE < 0) {
                    j5 = iE ^ (-128);
                } else {
                    long j15 = 3 + j12;
                    int iE2 = iE ^ (i2Var.e(j14) << 14);
                    if (iE2 >= 0) {
                        j5 = iE2 ^ 16256;
                    } else {
                        long j16 = 4 + j12;
                        int iE3 = iE2 ^ (i2Var.e(j15) << 21);
                        if (iE3 < 0) {
                            j5 = (-2080896) ^ iE3;
                            j14 = j16;
                        } else {
                            j15 = 5 + j12;
                            long jE = ((long) iE3) ^ (((long) i2Var.e(j16)) << 28);
                            if (jE >= 0) {
                                j11 = 266354560;
                            } else {
                                long j17 = 6 + j12;
                                long jE2 = jE ^ (((long) i2Var.e(j15)) << 35);
                                if (jE2 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = 7 + j12;
                                    jE = jE2 ^ (((long) i2Var.e(j17)) << 42);
                                    if (jE >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j17 = 8 + j12;
                                        jE2 = jE ^ (((long) i2Var.e(j15)) << 49);
                                        if (jE2 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            long j18 = 9 + j12;
                                            long jE3 = (jE2 ^ (((long) i2Var.e(j17)) << 56)) ^ 71499008037633920L;
                                            if (jE3 < 0) {
                                                long j19 = j12 + 10;
                                                if (i2Var.e(j18) >= 0) {
                                                    j14 = j19;
                                                    j5 = jE3;
                                                }
                                            } else {
                                                j5 = jE3;
                                                j14 = j18;
                                            }
                                        }
                                    }
                                }
                                j5 = j10 ^ jE2;
                                j14 = j17;
                            }
                            j5 = j11 ^ jE;
                        }
                    }
                    j14 = j15;
                }
                this.f2808f = j14;
                return j5;
            }
        }
        return G();
    }

    public final long G() throws w0 {
        long j5 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            long j10 = this.f2808f;
            if (j10 == this.f2807e) {
                throw w0.g();
            }
            this.f2808f = 1 + j10;
            byte bE = j2.f2774c.e(j10);
            j5 |= ((long) (bE & 127)) << i7;
            if ((bE & 128) == 0) {
                return j5;
            }
        }
        throw w0.d();
    }

    public final void H() {
        long j5 = this.f2807e + ((long) this.f2810h);
        this.f2807e = j5;
        int i7 = (int) (j5 - this.f2809g);
        int i10 = this.f2812j;
        if (i7 <= i10) {
            this.f2810h = 0;
            return;
        }
        int i11 = i7 - i10;
        this.f2810h = i11;
        this.f2807e = j5 - ((long) i11);
    }

    @Override // com.google.protobuf.p
    public final void a(int i7) throws w0 {
        if (this.f2811i != i7) {
            throw new w0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.p
    public final int d() {
        return (int) (this.f2808f - this.f2809g);
    }

    @Override // com.google.protobuf.p
    public final boolean e() {
        return this.f2808f == this.f2807e;
    }

    @Override // com.google.protobuf.p
    public final void h(int i7) {
        this.f2812j = i7;
        H();
    }

    @Override // com.google.protobuf.p
    public final int i(int i7) throws w0 {
        if (i7 < 0) {
            throw w0.e();
        }
        int iD = d() + i7;
        int i10 = this.f2812j;
        if (iD > i10) {
            throw w0.g();
        }
        this.f2812j = iD;
        H();
        return i10;
    }

    @Override // com.google.protobuf.p
    public final boolean j() {
        return F() != 0;
    }

    @Override // com.google.protobuf.p
    public final k k() throws w0 {
        int iE = E();
        if (iE > 0) {
            long j5 = this.f2807e;
            long j10 = this.f2808f;
            if (iE <= ((int) (j5 - j10))) {
                byte[] bArr = new byte[iE];
                long j11 = iE;
                j2.f2774c.c(j10, bArr, j11);
                this.f2808f += j11;
                k kVar = l.f2785b;
                return new k(bArr);
            }
        }
        if (iE == 0) {
            return l.f2785b;
        }
        if (iE < 0) {
            throw w0.e();
        }
        throw w0.g();
    }

    @Override // com.google.protobuf.p
    public final double l() {
        return Double.longBitsToDouble(D());
    }

    @Override // com.google.protobuf.p
    public final int m() {
        return E();
    }

    @Override // com.google.protobuf.p
    public final int n() {
        return C();
    }

    @Override // com.google.protobuf.p
    public final long o() {
        return D();
    }

    @Override // com.google.protobuf.p
    public final float p() {
        return Float.intBitsToFloat(C());
    }

    @Override // com.google.protobuf.p
    public final int q() {
        return E();
    }

    @Override // com.google.protobuf.p
    public final long r() {
        return F();
    }

    @Override // com.google.protobuf.p
    public final int t() {
        return C();
    }

    @Override // com.google.protobuf.p
    public final long u() {
        return D();
    }

    @Override // com.google.protobuf.p
    public final int v() {
        return p.b(E());
    }

    @Override // com.google.protobuf.p
    public final long w() {
        return p.c(F());
    }

    @Override // com.google.protobuf.p
    public final String x() throws w0 {
        int iE = E();
        if (iE > 0) {
            long j5 = this.f2807e;
            long j10 = this.f2808f;
            if (iE <= ((int) (j5 - j10))) {
                byte[] bArr = new byte[iE];
                long j11 = iE;
                j2.f2774c.c(j10, bArr, j11);
                String str = new String(bArr, u0.f2861a);
                this.f2808f += j11;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw w0.e();
        }
        throw w0.g();
    }

    @Override // com.google.protobuf.p
    public final String y() throws w0 {
        String strZ;
        int iE = E();
        if (iE > 0) {
            long j5 = this.f2807e;
            long j10 = this.f2808f;
            if (iE <= ((int) (j5 - j10))) {
                int i7 = (int) (j10 - this.f2806d);
                a.a aVar = m2.f2795a;
                aVar.getClass();
                ByteBuffer byteBuffer = this.f2805c;
                if (byteBuffer.hasArray()) {
                    strZ = aVar.x(byteBuffer.array(), byteBuffer.arrayOffset() + i7, iE);
                } else {
                    strZ = byteBuffer.isDirect() ? aVar.z(byteBuffer, i7, iE) : a.a.y(byteBuffer, i7, iE);
                }
                this.f2808f += (long) iE;
                return strZ;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE <= 0) {
            throw w0.e();
        }
        throw w0.g();
    }

    @Override // com.google.protobuf.p
    public final int z() throws w0 {
        if (e()) {
            this.f2811i = 0;
            return 0;
        }
        int iE = E();
        this.f2811i = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw w0.a();
    }
}
