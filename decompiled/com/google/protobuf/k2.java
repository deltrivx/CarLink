package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends a.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2784f;

    public /* synthetic */ k2(int i7) {
        this.f2784f = i7;
    }

    public static int W(int i7, int i10, long j5, byte[] bArr) {
        if (i10 == 0) {
            a.a aVar = m2.f2795a;
            if (i7 > -12) {
                return -1;
            }
            return i7;
        }
        if (i10 == 1) {
            return m2.c(i7, j2.g(bArr, j5));
        }
        if (i10 == 2) {
            return m2.d(i7, j2.g(bArr, j5), j2.g(bArr, j5 + 1));
        }
        throw new AssertionError();
    }

    @Override // a.a
    public final int B(String str, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        char cCharAt;
        long j5;
        long j10;
        long j11;
        int i13;
        char cCharAt2;
        switch (this.f2784f) {
            case 0:
                int length = str.length();
                int i14 = i10 + i7;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i7) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) cCharAt;
                    i15++;
                }
                if (i15 == length) {
                    return i7 + length;
                }
                int i16 = i7 + i15;
                while (i15 < length) {
                    char cCharAt3 = str.charAt(i15);
                    if (cCharAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) cCharAt3;
                        i16++;
                    } else if (cCharAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((cCharAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i11)))) {
                                    throw new l2(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char cCharAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new l2(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i16 += 3;
                        bArr[i20] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i15++;
                }
                return i16;
            default:
                long j12 = i7;
                long j13 = ((long) i10) + j12;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i7) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i7 + i10));
                }
                int i21 = 0;
                while (true) {
                    j5 = 1;
                    if (i21 < length2 && (cCharAt2 = str.charAt(i21)) < 128) {
                        j2.k(bArr, j12, (byte) cCharAt2);
                        i21++;
                        j12 = 1 + j12;
                    }
                }
                if (i21 != length2) {
                    while (i21 < length2) {
                        char cCharAt5 = str.charAt(i21);
                        if (cCharAt5 < 128 && j12 < j13) {
                            j2.k(bArr, j12, (byte) cCharAt5);
                            j11 = j13;
                            j10 = j5;
                            j12 += j5;
                        } else if (cCharAt5 >= 2048 || j12 > j13 - 2) {
                            j10 = j5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j12 > j13 - 3) {
                                j11 = j13;
                                if (j12 > j11 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i13)))) {
                                        throw new l2(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j12);
                                }
                                int i22 = i21 + 1;
                                if (i22 != length2) {
                                    char cCharAt6 = str.charAt(i22);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        j2.k(bArr, j12, (byte) ((codePoint2 >>> 18) | 240));
                                        j2.k(bArr, j12 + j10, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j14 = j12 + 3;
                                        j2.k(bArr, j12 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j12 += 4;
                                        j2.k(bArr, j14, (byte) ((codePoint2 & 63) | 128));
                                        i21 = i22;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                throw new l2(i21 - 1, length2);
                            }
                            j2.k(bArr, j12, (byte) ((cCharAt5 >>> '\f') | 480));
                            j11 = j13;
                            long j15 = j12 + 2;
                            j2.k(bArr, j12 + j10, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j12 += 3;
                            j2.k(bArr, j15, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j10 = j5;
                            long j16 = j12 + j10;
                            j2.k(bArr, j12, (byte) ((cCharAt5 >>> 6) | 960));
                            j12 += 2;
                            j2.k(bArr, j16, (byte) ((cCharAt5 & '?') | 128));
                            j11 = j13;
                        }
                        i21++;
                        j5 = j10;
                        j13 = j11;
                    }
                }
                return (int) j12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0114 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[LOOP:1: B:31:0x0083->B:34:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00df  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    @Override // a.a
    public final int O(byte[] bArr, int i7, int i10) {
        long j5;
        int i11;
        int i12;
        long j10;
        byte bG;
        int i13;
        byte bG2;
        long j11;
        byte bG3;
        long j12;
        long j13;
        int i14 = i7;
        byte b10 = -96;
        byte b11 = -62;
        switch (this.f2784f) {
            case 0:
                while (i14 < i10 && bArr[i14] >= 0) {
                    i14++;
                }
                if (i14 < i10) {
                    while (i14 < i10) {
                        int i15 = i14 + 1;
                        byte b12 = bArr[i14];
                        if (b12 >= 0) {
                            i14 = i15;
                        } else if (b12 < -32) {
                            if (i15 >= i10) {
                                return b12;
                            }
                            if (b12 < -62) {
                                return -1;
                            }
                            i14 += 2;
                            if (bArr[i15] > -65) {
                                return -1;
                            }
                        } else if (b12 < -16) {
                            if (i15 >= i10 - 1) {
                                return m2.a(bArr, i15, i10);
                            }
                            int i16 = i14 + 2;
                            byte b13 = bArr[i15];
                            if (b13 > -65) {
                                return -1;
                            }
                            if (b12 == -32 && b13 < -96) {
                                return -1;
                            }
                            if (b12 == -19 && b13 >= -96) {
                                return -1;
                            }
                            i14 += 3;
                            if (bArr[i16] > -65) {
                                return -1;
                            }
                        } else {
                            if (i15 >= i10 - 2) {
                                return m2.a(bArr, i15, i10);
                            }
                            int i17 = i14 + 2;
                            byte b14 = bArr[i15];
                            if (b14 > -65 || (((b14 + 112) + (b12 << 28)) >> 30) != 0) {
                                return -1;
                            }
                            int i18 = i14 + 3;
                            if (bArr[i17] > -65) {
                                return -1;
                            }
                            i14 += 4;
                            if (bArr[i18] > -65) {
                                return -1;
                            }
                        }
                    }
                }
                return 0;
            default:
                if ((i14 | i10 | (bArr.length - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i14), Integer.valueOf(i10)));
                }
                long j14 = i14;
                int i19 = (int) (((long) i10) - j14);
                if (i19 < 16) {
                    j5 = j14;
                    i11 = 0;
                } else {
                    int i20 = 8 - (((int) j14) & 7);
                    j5 = j14;
                    i11 = 0;
                    long j15 = j5;
                    while (true) {
                        if (i11 < i20) {
                            long j16 = j15 + 1;
                            if (j2.g(bArr, j15) >= 0) {
                                i11++;
                                j15 = j16;
                            }
                        } else {
                            while (true) {
                                int i21 = i11 + 8;
                                if (i21 <= i19 && (j2.f2774c.j(j2.f2777f + j15, bArr) & (-9187201950435737472L)) == 0) {
                                    j15 += 8;
                                    i11 = i21;
                                }
                            }
                            while (true) {
                                if (i11 < i19) {
                                    long j17 = j15 + 1;
                                    if (j2.g(bArr, j15) >= 0) {
                                        i11++;
                                        j15 = j17;
                                    }
                                } else {
                                    i11 = i19;
                                }
                            }
                        }
                    }
                    i12 = i19 - i11;
                    j10 = j5 + ((long) i11);
                    while (true) {
                        bG = 0;
                        while (i12 > 0) {
                            j13 = j10 + 1;
                            bG = j2.g(bArr, j10);
                            if (bG >= 0) {
                                i12--;
                                j10 = j13;
                            } else {
                                j10 = j13;
                                if (i12 == 0) {
                                    return 0;
                                }
                                i13 = i12 - 1;
                                if (bG < -32) {
                                    if (i13 == 0) {
                                        return bG;
                                    }
                                    i12 -= 2;
                                    if (bG >= b11) {
                                        return -1;
                                    }
                                    j12 = j10 + 1;
                                    if (j2.g(bArr, j10) > -65) {
                                        return -1;
                                    }
                                    j10 = j12;
                                } else if (bG >= -16) {
                                    if (i13 < 2) {
                                        return W(bG, i13, j10, bArr);
                                    }
                                    i12 -= 3;
                                    j11 = j10 + 1;
                                    bG3 = j2.g(bArr, j10);
                                    if (bG3 <= -65) {
                                        return -1;
                                    }
                                    if (bG != -32 && bG3 < b10) {
                                        return -1;
                                    }
                                    if (bG != -19 && bG3 >= b10) {
                                        return -1;
                                    }
                                    j10 += 2;
                                    if (j2.g(bArr, j11) > -65) {
                                        return -1;
                                    }
                                } else {
                                    if (i13 < 3) {
                                        return W(bG, i13, j10, bArr);
                                    }
                                    i12 -= 4;
                                    long j18 = j10 + 1;
                                    bG2 = j2.g(bArr, j10);
                                    if (bG2 > -65 && (((bG2 + 112) + (bG << 28)) >> 30) == 0) {
                                        long j19 = j10 + 2;
                                        if (j2.g(bArr, j18) > -65) {
                                            return -1;
                                        }
                                        j10 += 3;
                                        if (j2.g(bArr, j19) > -65) {
                                            return -1;
                                        }
                                    }
                                }
                                b10 = -96;
                                b11 = -62;
                            }
                        }
                        if (i12 == 0) {
                            return 0;
                        }
                        i13 = i12 - 1;
                        if (bG < -32) {
                            if (i13 == 0) {
                                return bG;
                            }
                            i12 -= 2;
                            if (bG >= b11) {
                                return -1;
                            }
                            j12 = j10 + 1;
                            if (j2.g(bArr, j10) > -65) {
                                return -1;
                            }
                            j10 = j12;
                        } else {
                            if (bG >= -16) {
                                if (i13 < 3) {
                                    return W(bG, i13, j10, bArr);
                                }
                                i12 -= 4;
                                long j110 = j10 + 1;
                                bG2 = j2.g(bArr, j10);
                                return bG2 > -65 ? -1 : -1;
                            }
                            if (i13 < 2) {
                                return W(bG, i13, j10, bArr);
                            }
                            i12 -= 3;
                            j11 = j10 + 1;
                            bG3 = j2.g(bArr, j10);
                            if (bG3 <= -65) {
                                return -1;
                            }
                            if (bG != -32) {
                            }
                            if (bG != -19) {
                            }
                            j10 += 2;
                            if (j2.g(bArr, j11) > -65) {
                                return -1;
                            }
                        }
                        b10 = -96;
                        b11 = -62;
                    }
                }
                i12 = i19 - i11;
                j10 = j5 + ((long) i11);
                while (true) {
                    bG = 0;
                    while (i12 > 0) {
                        j13 = j10 + 1;
                        bG = j2.g(bArr, j10);
                        if (bG >= 0) {
                            i12--;
                            j10 = j13;
                        } else {
                            j10 = j13;
                            if (i12 == 0) {
                                return 0;
                            }
                            i13 = i12 - 1;
                            if (bG < -32) {
                                if (i13 == 0) {
                                    return bG;
                                }
                                i12 -= 2;
                                if (bG >= b11) {
                                    return -1;
                                }
                                j12 = j10 + 1;
                                if (j2.g(bArr, j10) > -65) {
                                    return -1;
                                }
                                j10 = j12;
                            } else {
                                if (bG >= -16) {
                                    if (i13 < 3) {
                                        return W(bG, i13, j10, bArr);
                                    }
                                    i12 -= 4;
                                    long j111 = j10 + 1;
                                    bG2 = j2.g(bArr, j10);
                                    if (bG2 > -65) {
                                    }
                                }
                                if (i13 < 2) {
                                    return W(bG, i13, j10, bArr);
                                }
                                i12 -= 3;
                                j11 = j10 + 1;
                                bG3 = j2.g(bArr, j10);
                                if (bG3 <= -65) {
                                    return -1;
                                }
                                if (bG != -32) {
                                }
                                if (bG != -19) {
                                }
                                j10 += 2;
                                if (j2.g(bArr, j11) > -65) {
                                    return -1;
                                }
                            }
                            b10 = -96;
                            b11 = -62;
                        }
                    }
                    if (i12 == 0) {
                        return 0;
                    }
                    i13 = i12 - 1;
                    if (bG < -32) {
                        if (i13 == 0) {
                            return bG;
                        }
                        i12 -= 2;
                        if (bG >= b11) {
                            return -1;
                        }
                        j12 = j10 + 1;
                        if (j2.g(bArr, j10) > -65) {
                            return -1;
                        }
                        j10 = j12;
                    } else {
                        if (bG >= -16) {
                            if (i13 < 3) {
                                return W(bG, i13, j10, bArr);
                            }
                            i12 -= 4;
                            long j112 = j10 + 1;
                            bG2 = j2.g(bArr, j10);
                            if (bG2 > -65) {
                            }
                        }
                        if (i13 < 2) {
                            return W(bG, i13, j10, bArr);
                        }
                        i12 -= 3;
                        j11 = j10 + 1;
                        bG3 = j2.g(bArr, j10);
                        if (bG3 <= -65) {
                            return -1;
                        }
                        if (bG != -32) {
                        }
                        if (bG != -19) {
                        }
                        j10 += 2;
                        if (j2.g(bArr, j11) > -65) {
                            return -1;
                        }
                    }
                    b10 = -96;
                    b11 = -62;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[LOOP:2: B:24:0x0055->B:27:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0064 A[SYNTHETIC] */
    @Override // a.a
    public final String x(byte[] bArr, int i7, int i10) throws w0 {
        int i11;
        int i12;
        byte b10;
        int i13;
        byte b11;
        switch (this.f2784f) {
            case 0:
                if ((i7 | i10 | ((bArr.length - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                int i14 = i7 + i10;
                char[] cArr = new char[i10];
                int i15 = 0;
                while (i7 < i14) {
                    byte b12 = bArr[i7];
                    if (b12 < 0) {
                        i11 = i15;
                        while (i7 < i14) {
                            i12 = i7 + 1;
                            b10 = bArr[i7];
                            if (b10 >= 0) {
                                i13 = i11 + 1;
                                cArr[i11] = (char) b10;
                                while (i12 < i14) {
                                    b11 = bArr[i12];
                                    if (b11 >= 0) {
                                        i12++;
                                        cArr[i13] = (char) b11;
                                        i13++;
                                    } else {
                                        i11 = i13;
                                        i7 = i12;
                                    }
                                }
                                i11 = i13;
                                i7 = i12;
                            } else if (b10 < -32) {
                                if (i12 < i14) {
                                    throw w0.b();
                                }
                                i7 += 2;
                                o9.e0.h(b10, bArr[i12], cArr, i11);
                                i11++;
                            } else if (b10 < -16) {
                                if (i12 < i14 - 1) {
                                    throw w0.b();
                                }
                                int i16 = i7 + 2;
                                i7 += 3;
                                o9.e0.i(b10, bArr[i12], bArr[i16], cArr, i11);
                                i11++;
                            } else {
                                if (i12 < i14 - 2) {
                                    throw w0.b();
                                }
                                byte b13 = bArr[i12];
                                int i17 = i7 + 3;
                                byte b14 = bArr[i7 + 2];
                                i7 += 4;
                                o9.e0.g(b10, b13, b14, bArr[i17], cArr, i11);
                                i11 += 2;
                            }
                        }
                        return new String(cArr, 0, i11);
                    }
                    i7++;
                    cArr[i15] = (char) b12;
                    i15++;
                }
                i11 = i15;
                while (i7 < i14) {
                    i12 = i7 + 1;
                    b10 = bArr[i7];
                    if (b10 >= 0) {
                        i13 = i11 + 1;
                        cArr[i11] = (char) b10;
                        while (i12 < i14) {
                            b11 = bArr[i12];
                            if (b11 >= 0) {
                                i12++;
                                cArr[i13] = (char) b11;
                                i13++;
                            } else {
                                i11 = i13;
                                i7 = i12;
                            }
                        }
                        i11 = i13;
                        i7 = i12;
                    } else if (b10 < -32) {
                        if (i12 < i14) {
                            throw w0.b();
                        }
                        i7 += 2;
                        o9.e0.h(b10, bArr[i12], cArr, i11);
                        i11++;
                    } else if (b10 < -16) {
                        if (i12 < i14 - 1) {
                            throw w0.b();
                        }
                        int i18 = i7 + 2;
                        i7 += 3;
                        o9.e0.i(b10, bArr[i12], bArr[i18], cArr, i11);
                        i11++;
                    } else {
                        if (i12 < i14 - 2) {
                            throw w0.b();
                        }
                        byte b15 = bArr[i12];
                        int i19 = i7 + 3;
                        byte b16 = bArr[i7 + 2];
                        i7 += 4;
                        o9.e0.g(b10, b15, b16, bArr[i19], cArr, i11);
                        i11 += 2;
                    }
                }
                return new String(cArr, 0, i11);
            default:
                Charset charset = u0.f2861a;
                String str = new String(bArr, i7, i10, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i10 + i7))) {
                    throw w0.b();
                }
                return str;
        }
    }

    @Override // a.a
    public final String z(ByteBuffer byteBuffer, int i7, int i10) throws w0 {
        long j5;
        byte bE;
        byte bE2;
        switch (this.f2784f) {
            case 0:
                return a.a.y(byteBuffer, i7, i10);
            default:
                if ((i7 | i10 | ((byteBuffer.limit() - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                long j10 = j2.f2774c.j(j2.f2778g, byteBuffer) + ((long) i7);
                long j11 = ((long) i10) + j10;
                char[] cArr = new char[i10];
                int i11 = 0;
                while (true) {
                    j5 = 1;
                    if (j10 < j11 && (bE2 = j2.f2774c.e(j10)) >= 0) {
                        j10++;
                        cArr[i11] = (char) bE2;
                        i11++;
                    }
                }
                int i12 = i11;
                while (j10 < j11) {
                    long j12 = j10 + j5;
                    i2 i2Var = j2.f2774c;
                    byte bE3 = i2Var.e(j10);
                    if (bE3 >= 0) {
                        int i13 = i12 + 1;
                        cArr[i12] = (char) bE3;
                        while (j12 < j11 && (bE = j2.f2774c.e(j12)) >= 0) {
                            j12 += j5;
                            cArr[i13] = (char) bE;
                            i13++;
                        }
                        i12 = i13;
                        j10 = j12;
                    } else if (bE3 < -32) {
                        if (j12 >= j11) {
                            throw w0.b();
                        }
                        j10 += 2;
                        o9.e0.h(bE3, i2Var.e(j12), cArr, i12);
                        i12++;
                    } else if (bE3 < -16) {
                        if (j12 >= j11 - j5) {
                            throw w0.b();
                        }
                        long j13 = j10 + 2;
                        j10 += 3;
                        o9.e0.i(bE3, i2Var.e(j12), i2Var.e(j13), cArr, i12);
                        i12++;
                    } else {
                        if (j12 >= j11 - 2) {
                            throw w0.b();
                        }
                        long j14 = j10;
                        o9.e0.g(bE3, i2Var.e(j12), i2Var.e(j10 + 2), i2Var.e(j14 + 3), cArr, i12);
                        i12 += 2;
                        j10 = j14 + 4;
                    }
                    j5 = 1;
                }
                return new String(cArr, 0, i12);
        }
    }
}
