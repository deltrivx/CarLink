package g6;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f5945a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f5946b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger[] f5947c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f5947c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i7 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f5947c;
            if (i7 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i7] = bigIntegerArr2[i7 - 1].multiply(bigIntegerValueOf);
            i7++;
        }
    }

    public static String a(int[] iArr, int i7) throws n5.f {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i10 = 0; i10 < i7; i10++) {
            bigIntegerAdd = bigIntegerAdd.add(f5947c[(i7 - i10) - 1].multiply(BigInteger.valueOf(iArr[i10])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw n5.f.a();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:0x0038 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0007 A[SYNTHETIC] */
    public static int b(int[] iArr, int i7, StringBuilder sb2) {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = iArr[0];
                if (i7 < i11 && !z10) {
                    int i12 = i7 + 1;
                    int i13 = iArr[i7];
                    if (i12 == i11) {
                        z10 = true;
                    }
                    if (i13 < 900) {
                        iArr2[i10] = i13;
                        i10++;
                    } else {
                        if (i13 != 900 && i13 != 901 && i13 != 928) {
                            switch (i13) {
                            }
                            if (i10 % 15 != 0 || i13 == 902 || z10) {
                                if (i10 > 0) {
                                    break;
                                }
                            }
                        }
                        z10 = true;
                        if (i10 % 15 != 0) {
                        }
                        if (i10 > 0) {
                            break;
                        }
                    }
                    i7 = i12;
                    if (i10 % 15 != 0) {
                    }
                    if (i10 > 0) {
                        break;
                    }
                }
            }
            sb2.append(a(iArr2, i10));
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab A[PHI: r8
      0x00ab: PHI (r8v12 int) = (r8v2 int), (r8v2 int), (r8v18 int) binds: [B:85:0x00ff, B:70:0x00d5, B:53:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0038. Please report as an issue. */
    public static int c(int[] iArr, int i7, StringBuilder sb2) {
        int i10;
        char c10;
        char c11;
        int i11 = 1;
        int i12 = (iArr[0] - i7) << 1;
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        int i13 = i7;
        boolean z10 = false;
        int i14 = 0;
        while (i13 < iArr[0] && !z10) {
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            if (i16 < 900) {
                iArr2[i14] = i16 / 30;
                iArr2[i14 + 1] = i16 % 30;
                i14 += 2;
            } else if (i16 != 913) {
                if (i16 != 928) {
                    switch (i16) {
                        case 900:
                            iArr2[i14] = 900;
                            i14++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i16) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z10 = true;
            } else {
                iArr2[i14] = 913;
                i13 += 2;
                iArr3[i14] = iArr[i15];
                i14++;
            }
            i13 = i15;
        }
        int i17 = 0;
        int i18 = 1;
        i18 = 1;
        while (i17 < i14) {
            int i19 = iArr2[i17];
            int iB = e1.d.b(i18);
            if (iB != 0) {
                if (iB != i11) {
                    if (iB != 2) {
                        char[] cArr = f5945a;
                        if (iB != 3) {
                            if (iB != 4) {
                                if (iB == 5) {
                                    if (i19 < 29) {
                                        c11 = cArr[i19];
                                        i18 = i18;
                                        c10 = c11;
                                    } else if (i19 == 29 || i19 == 900) {
                                        c10 = 0;
                                        i18 = 1;
                                    } else if (i19 == 913) {
                                        sb2.append((char) iArr3[i17]);
                                    }
                                }
                                c10 = 0;
                            } else if (i19 < 26) {
                                c10 = (char) (i19 + 65);
                                i18 = i18;
                            } else if (i19 != 26) {
                                if (i19 == 900) {
                                    i18 = 1;
                                }
                                c10 = 0;
                            } else {
                                i18 = i18;
                                c10 = ' ';
                            }
                            i18 = i18;
                            c10 = 0;
                        } else if (i19 < 29) {
                            c11 = cArr[i19];
                            c10 = c11;
                        } else if (i19 == 29 || i19 == 900) {
                            c10 = 0;
                            i18 = 1;
                        } else {
                            if (i19 == 913) {
                                sb2.append((char) iArr3[i17]);
                            }
                            c10 = 0;
                        }
                    } else if (i19 < 25) {
                        c11 = f5946b[i19];
                        c10 = c11;
                    } else if (i19 == 900) {
                        c10 = 0;
                        i18 = 1;
                    } else {
                        if (i19 != 913) {
                            switch (i19) {
                                case 25:
                                    c10 = 0;
                                    i18 = 4;
                                    break;
                                case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                                    c10 = ' ';
                                    break;
                                case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                                    c10 = 0;
                                    i18 = 2;
                                    break;
                                case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                                    c10 = 0;
                                    i18 = 1;
                                    break;
                                case ServiceTypes.KEYCODE_TEL /* 29 */:
                                    c10 = 0;
                                    i18 = 6;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i17]);
                        }
                        c10 = 0;
                    }
                } else if (i19 < 26) {
                    i10 = i19 + 97;
                    c10 = (char) i10;
                } else {
                    if (i19 == 900) {
                        i18 = 1;
                    } else if (i19 != 913) {
                        switch (i19) {
                            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                                c10 = ' ';
                                break;
                            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                                i18 = i18;
                                c10 = 0;
                                i18 = 5;
                                break;
                            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                                c10 = 0;
                                i18 = 3;
                                break;
                            case ServiceTypes.KEYCODE_TEL /* 29 */:
                                c10 = 0;
                                i18 = 6;
                                break;
                        }
                    } else {
                        sb2.append((char) iArr3[i17]);
                    }
                    c10 = 0;
                }
            } else if (i19 < 26) {
                i10 = i19 + 65;
                c10 = (char) i10;
            } else {
                if (i19 == 900) {
                    i18 = 1;
                } else if (i19 != 913) {
                    switch (i19) {
                        case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                            c10 = ' ';
                            break;
                        case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                            c10 = 0;
                            i18 = 2;
                            break;
                        case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                            c10 = 0;
                            i18 = 3;
                            break;
                        case ServiceTypes.KEYCODE_TEL /* 29 */:
                            c10 = 0;
                            i18 = 6;
                            break;
                    }
                } else {
                    sb2.append((char) iArr3[i17]);
                }
                c10 = 0;
            }
            if (c10 != 0) {
                sb2.append(c10);
            }
            i17++;
            i11 = 1;
        }
        return i13;
    }
}
