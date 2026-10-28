package com.google.protobuf;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f2796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2803j = Integer.MAX_VALUE;

    public n(InputStream inputStream) {
        u0.a(inputStream, "input");
        this.f2796c = inputStream;
        this.f2797d = new byte[ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT];
        this.f2798e = 0;
        this.f2800g = 0;
        this.f2802i = 0;
    }

    @Override // com.google.protobuf.p
    public final int A() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final long B() {
        return I();
    }

    public final byte[] C(int i7) throws IOException {
        byte[] bArrD = D(i7);
        if (bArrD != null) {
            return bArrD;
        }
        int i10 = this.f2800g;
        int i11 = this.f2798e;
        int length = i11 - i10;
        this.f2802i += i11;
        this.f2800g = 0;
        this.f2798e = 0;
        ArrayList<byte[]> arrayListE = E(i7 - length);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f2797d, i10, bArr, 0, length);
        for (byte[] bArr2 : arrayListE) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] D(int i7) throws IOException {
        if (i7 == 0) {
            return u0.f2862b;
        }
        if (i7 < 0) {
            throw w0.e();
        }
        int i10 = this.f2802i;
        int i11 = this.f2800g;
        int i12 = i10 + i11 + i7;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new w0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.f2803j;
        if (i12 > i13) {
            M((i13 - i10) - i11);
            throw w0.g();
        }
        int i14 = this.f2798e - i11;
        int i15 = i7 - i14;
        InputStream inputStream = this.f2796c;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (w0 e7) {
                e7.f2872a = true;
                throw e7;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f2797d, this.f2800g, bArr, 0, i14);
        this.f2802i += this.f2798e;
        this.f2800g = 0;
        this.f2798e = 0;
        while (i14 < i7) {
            try {
                int i16 = inputStream.read(bArr, i14, i7 - i14);
                if (i16 == -1) {
                    throw w0.g();
                }
                this.f2802i += i16;
                i14 += i16;
            } catch (w0 e10) {
                e10.f2872a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList E(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f2796c.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw w0.g();
                }
                this.f2802i += i11;
                i10 += i11;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int F() throws w0 {
        int i7 = this.f2800g;
        if (this.f2798e - i7 < 4) {
            L(4);
            i7 = this.f2800g;
        }
        this.f2800g = i7 + 4;
        byte[] bArr = this.f2797d;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long G() throws w0 {
        int i7 = this.f2800g;
        if (this.f2798e - i7 < 8) {
            L(8);
            i7 = this.f2800g;
        }
        this.f2800g = i7 + 8;
        byte[] bArr = this.f2797d;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int H() {
        int i7;
        int i10 = this.f2800g;
        int i11 = this.f2798e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f2797d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f2800g = i12;
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
                this.f2800g = i13;
                return i7;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j5;
        long j10;
        long j11;
        long j12;
        int i7 = this.f2800g;
        int i10 = this.f2798e;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f2797d;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                this.f2800g = i11;
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
                this.f2800g = i12;
                return j5;
            }
        }
        return J();
    }

    public final long J() throws w0 {
        long j5 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f2800g == this.f2798e) {
                L(1);
            }
            int i10 = this.f2800g;
            this.f2800g = i10 + 1;
            byte b10 = this.f2797d[i10];
            j5 |= ((long) (b10 & 127)) << i7;
            if ((b10 & 128) == 0) {
                return j5;
            }
        }
        throw w0.d();
    }

    public final void K() {
        int i7 = this.f2798e + this.f2799f;
        this.f2798e = i7;
        int i10 = this.f2802i + i7;
        int i11 = this.f2803j;
        if (i10 <= i11) {
            this.f2799f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f2799f = i12;
        this.f2798e = i7 - i12;
    }

    public final void L(int i7) throws w0 {
        if (N(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.f2802i) - this.f2800g) {
            throw w0.g();
        }
        throw new w0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void M(int i7) throws w0 {
        int i10 = this.f2798e;
        int i11 = this.f2800g;
        if (i7 <= i10 - i11 && i7 >= 0) {
            this.f2800g = i11 + i7;
            return;
        }
        InputStream inputStream = this.f2796c;
        if (i7 < 0) {
            throw w0.e();
        }
        int i12 = this.f2802i;
        int i13 = i12 + i11;
        int i14 = i13 + i7;
        int i15 = this.f2803j;
        if (i14 > i15) {
            M((i15 - i12) - i11);
            throw w0.g();
        }
        this.f2802i = i13;
        int i16 = i10 - i11;
        this.f2798e = 0;
        this.f2800g = 0;
        while (i16 < i7) {
            long j5 = i7 - i16;
            try {
                try {
                    long jSkip = inputStream.skip(j5);
                    if (jSkip < 0 || jSkip > j5) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i16 += (int) jSkip;
                    }
                } catch (w0 e7) {
                    e7.f2872a = true;
                    throw e7;
                }
            } catch (Throwable th) {
                this.f2802i += i16;
                K();
                throw th;
            }
        }
        this.f2802i += i16;
        K();
        if (i16 >= i7) {
            return;
        }
        int i17 = this.f2798e;
        int i18 = i17 - this.f2800g;
        this.f2800g = i17;
        L(1);
        while (true) {
            int i19 = i7 - i18;
            int i20 = this.f2798e;
            if (i19 <= i20) {
                this.f2800g = i19;
                return;
            } else {
                i18 += i20;
                this.f2800g = i20;
                L(1);
            }
        }
    }

    public final boolean N(int i7) throws IOException {
        InputStream inputStream = this.f2796c;
        int i10 = this.f2800g;
        int i11 = i10 + i7;
        int i12 = this.f2798e;
        if (i11 <= i12) {
            throw new IllegalStateException(a2.f.F("refillBuffer() called when ", " bytes were already available in buffer", i7));
        }
        int i13 = this.f2802i;
        if (i7 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i7 <= this.f2803j) {
            byte[] bArr = this.f2797d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f2802i += i10;
                this.f2798e -= i10;
                this.f2800g = 0;
            }
            int i14 = this.f2798e;
            try {
                int i15 = inputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.f2802i) - i14));
                if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
                }
                if (i15 > 0) {
                    this.f2798e += i15;
                    K();
                    if (this.f2798e >= i7) {
                        return true;
                    }
                    return N(i7);
                }
            } catch (w0 e7) {
                e7.f2872a = true;
                throw e7;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.p
    public final void a(int i7) throws w0 {
        if (this.f2801h != i7) {
            throw new w0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.p
    public final int d() {
        return this.f2802i + this.f2800g;
    }

    @Override // com.google.protobuf.p
    public final boolean e() {
        return this.f2800g == this.f2798e && !N(1);
    }

    @Override // com.google.protobuf.p
    public final void h(int i7) {
        this.f2803j = i7;
        K();
    }

    @Override // com.google.protobuf.p
    public final int i(int i7) throws w0 {
        if (i7 < 0) {
            throw w0.e();
        }
        int i10 = this.f2802i + this.f2800g + i7;
        int i11 = this.f2803j;
        if (i10 > i11) {
            throw w0.g();
        }
        this.f2803j = i10;
        K();
        return i11;
    }

    @Override // com.google.protobuf.p
    public final boolean j() {
        return I() != 0;
    }

    @Override // com.google.protobuf.p
    public final k k() throws IOException {
        int iH = H();
        int i7 = this.f2798e;
        int i10 = this.f2800g;
        int i11 = i7 - i10;
        byte[] bArr = this.f2797d;
        if (iH <= i11 && iH > 0) {
            k kVarK = l.k(bArr, i10, iH);
            this.f2800g += iH;
            return kVarK;
        }
        if (iH == 0) {
            return l.f2785b;
        }
        byte[] bArrD = D(iH);
        if (bArrD != null) {
            return l.k(bArrD, 0, bArrD.length);
        }
        int i12 = this.f2800g;
        int i13 = this.f2798e;
        int length = i13 - i12;
        this.f2802i += i13;
        this.f2800g = 0;
        this.f2798e = 0;
        ArrayList<byte[]> arrayListE = E(iH - length);
        byte[] bArr2 = new byte[iH];
        System.arraycopy(bArr, i12, bArr2, 0, length);
        for (byte[] bArr3 : arrayListE) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        k kVar = l.f2785b;
        return new k(bArr2);
    }

    @Override // com.google.protobuf.p
    public final double l() {
        return Double.longBitsToDouble(G());
    }

    @Override // com.google.protobuf.p
    public final int m() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final int n() {
        return F();
    }

    @Override // com.google.protobuf.p
    public final long o() {
        return G();
    }

    @Override // com.google.protobuf.p
    public final float p() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.google.protobuf.p
    public final int q() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final long r() {
        return I();
    }

    @Override // com.google.protobuf.p
    public final int t() {
        return F();
    }

    @Override // com.google.protobuf.p
    public final long u() {
        return G();
    }

    @Override // com.google.protobuf.p
    public final int v() {
        return p.b(H());
    }

    @Override // com.google.protobuf.p
    public final long w() {
        return p.c(I());
    }

    @Override // com.google.protobuf.p
    public final String x() throws w0 {
        int iH = H();
        byte[] bArr = this.f2797d;
        if (iH > 0) {
            int i7 = this.f2798e;
            int i10 = this.f2800g;
            if (iH <= i7 - i10) {
                String str = new String(bArr, i10, iH, u0.f2861a);
                this.f2800g += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH > this.f2798e) {
            return new String(C(iH), u0.f2861a);
        }
        L(iH);
        String str2 = new String(bArr, this.f2800g, iH, u0.f2861a);
        this.f2800g += iH;
        return str2;
    }

    @Override // com.google.protobuf.p
    public final String y() throws IOException {
        int iH = H();
        int i7 = this.f2800g;
        int i10 = this.f2798e;
        int i11 = i10 - i7;
        byte[] bArrC = this.f2797d;
        if (iH <= i11 && iH > 0) {
            this.f2800g = i7 + iH;
        } else {
            if (iH == 0) {
                return "";
            }
            i7 = 0;
            if (iH <= i10) {
                L(iH);
                this.f2800g = iH;
            } else {
                bArrC = C(iH);
            }
        }
        return m2.f2795a.x(bArrC, i7, iH);
    }

    @Override // com.google.protobuf.p
    public final int z() throws w0 {
        if (e()) {
            this.f2801h = 0;
            return 0;
        }
        int iH = H();
        this.f2801h = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw w0.a();
    }
}
