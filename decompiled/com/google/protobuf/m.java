package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f2788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2794i = Integer.MAX_VALUE;

    public m(byte[] bArr, int i7, int i10, boolean z10) {
        this.f2788c = bArr;
        this.f2789d = i10 + i7;
        this.f2791f = i7;
        this.f2792g = i7;
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
        int i7 = this.f2791f;
        if (this.f2789d - i7 < 4) {
            throw w0.g();
        }
        this.f2791f = i7 + 4;
        byte[] bArr = this.f2788c;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long D() throws w0 {
        int i7 = this.f2791f;
        if (this.f2789d - i7 < 8) {
            throw w0.g();
        }
        this.f2791f = i7 + 8;
        byte[] bArr = this.f2788c;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int E() {
        int i7;
        int i10 = this.f2791f;
        int i11 = this.f2789d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f2788c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f2791f = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i7 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i7 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i7 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i7 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i19;
                            }
                            i7 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f2791f = i13;
                return i7;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j5;
        long j10;
        long j11;
        long j12;
        int i7 = this.f2791f;
        int i10 = this.f2789d;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f2788c;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                this.f2791f = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i7 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j5 = i13 ^ (-128);
                } else {
                    int i14 = i7 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j5 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i7 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j12 = (-2080896) ^ i17;
                        } else {
                            long j13 = i17;
                            i12 = i7 + 5;
                            long j14 = j13 ^ (((long) bArr[i16]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i16 = i7 + 6;
                                long j15 = j14 ^ (((long) bArr[i12]) << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i7 + 7;
                                    j14 = j15 ^ (((long) bArr[i16]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i16 = i7 + 8;
                                        j15 = j14 ^ (((long) bArr[i12]) << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i7 + 9;
                                            long j16 = (j15 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i18 = i7 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j5 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j5 = j11 ^ j14;
                        }
                        i12 = i16;
                        j5 = j12;
                    }
                }
                this.f2791f = i12;
                return j5;
            }
        }
        return G();
    }

    public final long G() throws w0 {
        long j5 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i10 = this.f2791f;
            if (i10 == this.f2789d) {
                throw w0.g();
            }
            this.f2791f = i10 + 1;
            byte b10 = this.f2788c[i10];
            j5 |= ((long) (b10 & 127)) << i7;
            if ((b10 & 128) == 0) {
                return j5;
            }
        }
        throw w0.d();
    }

    public final void H() {
        int i7 = this.f2789d + this.f2790e;
        this.f2789d = i7;
        int i10 = i7 - this.f2792g;
        int i11 = this.f2794i;
        if (i10 <= i11) {
            this.f2790e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f2790e = i12;
        this.f2789d = i7 - i12;
    }

    @Override // com.google.protobuf.p
    public final void a(int i7) throws w0 {
        if (this.f2793h != i7) {
            throw new w0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.p
    public final int d() {
        return this.f2791f - this.f2792g;
    }

    @Override // com.google.protobuf.p
    public final boolean e() {
        return this.f2791f == this.f2789d;
    }

    @Override // com.google.protobuf.p
    public final void h(int i7) {
        this.f2794i = i7;
        H();
    }

    @Override // com.google.protobuf.p
    public final int i(int i7) throws w0 {
        if (i7 < 0) {
            throw w0.e();
        }
        int iD = d() + i7;
        if (iD < 0) {
            throw w0.f();
        }
        int i10 = this.f2794i;
        if (iD > i10) {
            throw w0.g();
        }
        this.f2794i = iD;
        H();
        return i10;
    }

    @Override // com.google.protobuf.p
    public final boolean j() {
        return F() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // com.google.protobuf.p
    public final k k() throws w0 {
        byte[] bArrCopyOfRange;
        int iE = E();
        byte[] bArr = this.f2788c;
        if (iE > 0) {
            int i7 = this.f2789d;
            int i10 = this.f2791f;
            if (iE <= i7 - i10) {
                k kVarK = l.k(bArr, i10, iE);
                this.f2791f += iE;
                return kVarK;
            }
        }
        if (iE == 0) {
            return l.f2785b;
        }
        if (iE > 0) {
            int i11 = this.f2789d;
            int i12 = this.f2791f;
            if (iE <= i11 - i12) {
                int i13 = iE + i12;
                this.f2791f = i13;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, i13);
            } else {
                if (iE <= 0) {
                    throw w0.g();
                }
                if (iE == 0) {
                    throw w0.e();
                }
                bArrCopyOfRange = u0.f2862b;
            }
        } else {
            if (iE <= 0) {
                throw w0.g();
            }
            if (iE == 0) {
                throw w0.e();
            }
            bArrCopyOfRange = u0.f2862b;
        }
        k kVar = l.f2785b;
        return new k(bArrCopyOfRange);
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
            int i7 = this.f2789d;
            int i10 = this.f2791f;
            if (iE <= i7 - i10) {
                String str = new String(this.f2788c, i10, iE, u0.f2861a);
                this.f2791f += iE;
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
        int iE = E();
        if (iE > 0) {
            int i7 = this.f2789d;
            int i10 = this.f2791f;
            if (iE <= i7 - i10) {
                String strX = m2.f2795a.x(this.f2788c, i10, iE);
                this.f2791f += iE;
                return strX;
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
            this.f2793h = 0;
            return 0;
        }
        int iE = E();
        this.f2793h = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw w0.a();
    }
}
