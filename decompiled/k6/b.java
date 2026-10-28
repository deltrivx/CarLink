package k6;

import f7.t;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f7312a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static void a(t tVar, StringBuilder sb2, int i7, boolean z10) throws n5.f {
        while (i7 > 1) {
            if (tVar.a() < 11) {
                throw n5.f.a();
            }
            int iB = tVar.b(11);
            sb2.append(f(iB / 45));
            sb2.append(f(iB % 45));
            i7 -= 2;
        }
        if (i7 == 1) {
            if (tVar.a() < 6) {
                throw n5.f.a();
            }
            sb2.append(f(tVar.b(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i10 = length + 1;
                        if (sb2.charAt(i10) == '%') {
                            sb2.deleteCharAt(i10);
                        } else {
                            sb2.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb2.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:115:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x0143  */
    /* JADX WARN: Code duplicated, block: B:118:0x0147  */
    /* JADX WARN: Code duplicated, block: B:123:0x0150  */
    /* JADX WARN: Code duplicated, block: B:124:0x0152  */
    /* JADX WARN: Code duplicated, block: B:126:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0162  */
    /* JADX WARN: Code duplicated, block: B:134:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:140:0x016d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081 A[PHI: r10
      0x0081: PHI (r10v2 int) = (r10v1 int), (r10v7 int) binds: [B:31:0x0077, B:35:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc A[PHI: r17
      0x00cc: PHI (r17v2 int) = (r17v1 int), (r17v1 int), (r17v4 int), (r17v1 int) binds: [B:54:0x00b2, B:59:0x00bc, B:66:0x00ca, B:65:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2 A[PHI: r27
      0x00e2: PHI (r27v6 boolean) = (r27v5 boolean), (r27v5 boolean), (r27v5 boolean), (r27v7 boolean), (r27v7 boolean), (r27v7 boolean) binds: [B:79:0x00e8, B:81:0x00ec, B:83:0x00f0, B:71:0x00d6, B:72:0x00d8, B:74:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    public static void b(t tVar, StringBuilder sb2, int i7, t5.c cVar, ArrayList arrayList, Map map) throws n5.f {
        String strName;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z14;
        boolean z15;
        byte b10;
        boolean z16;
        int i17;
        boolean z17;
        boolean z18;
        boolean z19;
        int i18;
        if ((i7 << 3) > tVar.a()) {
            throw n5.f.a();
        }
        byte[] bArr = new byte[i7];
        int i19 = 0;
        for (int i20 = 0; i20 < i7; i20++) {
            bArr[i20] = (byte) tVar.b(8);
        }
        if (cVar == null) {
            String str = t5.g.f12791a;
            if (map != null) {
                n5.d dVar = n5.d.CHARACTER_SET;
                if (map.containsKey(dVar)) {
                    strName = map.get(dVar).toString();
                } else {
                    z10 = true;
                    if (i7 <= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i21 = 0;
                    z12 = true;
                    z13 = true;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                    int i22 = 0;
                    i16 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    while (i10 < i7 && (z10 || z12 || z13)) {
                        b10 = bArr[i10];
                        z16 = z10;
                        i17 = b10 & 255;
                        if (z13) {
                            if (i11 > 0) {
                                z17 = z11;
                                if ((b10 & 128) != 0) {
                                    if ((b10 & 64) != 0) {
                                        i18 = i11 + 1;
                                        if ((b10 & 32) == 0) {
                                            i13++;
                                        } else {
                                            i18 = i11 + 2;
                                            if ((b10 & 16) == 0) {
                                                i14++;
                                            } else {
                                                i11 += 3;
                                                if ((b10 & 8) == 0) {
                                                    i15++;
                                                }
                                            }
                                        }
                                        i11 = i18;
                                    }
                                }
                            } else if ((b10 & 128) != 0) {
                                i11--;
                                z17 = z11;
                            } else {
                                z17 = z11;
                            }
                            z13 = false;
                        } else {
                            z17 = z11;
                        }
                        if (!z16) {
                            z18 = z16;
                        } else if (i17 > 127 || i17 >= 160) {
                            if (i17 > 159 && (i17 < 192 || i17 == 215 || i17 == 247)) {
                                i16++;
                            }
                            z18 = z16;
                        } else {
                            z18 = false;
                        }
                        if (z12) {
                            z19 = z18;
                        } else if (i12 > 0) {
                            z19 = z18;
                            if (i17 >= 64 || i17 == 127 || i17 > 252) {
                                z12 = false;
                            } else {
                                i12--;
                            }
                        } else {
                            z19 = z18;
                            if (i17 != 128 || i17 == 160 || i17 > 239) {
                                z12 = false;
                            } else if (i17 <= 160 || i17 >= 224) {
                                if (i17 > 127) {
                                    i12++;
                                    int i25 = i23 + 1;
                                    if (i25 > i19) {
                                        i19 = i25;
                                        i23 = i19;
                                    } else {
                                        i23 = i25;
                                    }
                                } else {
                                    i23 = 0;
                                }
                                i24 = 0;
                            } else {
                                i21++;
                                int i26 = i24 + 1;
                                if (i26 > i22) {
                                    i22 = i26;
                                    i24 = i22;
                                } else {
                                    i24 = i26;
                                }
                                i23 = 0;
                            }
                        }
                        i10++;
                        z10 = z19;
                        z11 = z17;
                    }
                    z14 = z10;
                    boolean z20 = z11;
                    if (z13 && i11 > 0) {
                        z13 = false;
                    }
                    if (z12 || i12 <= 0) {
                        z15 = z12;
                    } else {
                        z15 = false;
                    }
                    if (!z13 && (z20 || i13 + i14 + i15 > 0)) {
                        strName = "UTF8";
                    } else if (!z15 && (t5.g.f12792b || i22 >= 3 || i19 >= 3)) {
                        strName = "SJIS";
                    } else if (z14 || !z15) {
                        if (z14) {
                            strName = "ISO8859_1";
                        } else if (z15) {
                            strName = "SJIS";
                        } else if (z13) {
                            strName = "UTF8";
                        } else {
                            strName = t5.g.f12791a;
                        }
                    } else if (!(i22 == 2 && i21 == 2) && i16 * 10 < i7) {
                        strName = "ISO8859_1";
                    } else {
                        strName = "SJIS";
                    }
                }
            } else {
                z10 = true;
                if (i7 <= 3) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                int i27 = 0;
                z12 = true;
                z13 = true;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                int i28 = 0;
                i16 = 0;
                int i29 = 0;
                int i210 = 0;
                while (i10 < i7) {
                    b10 = bArr[i10];
                    z16 = z10;
                    i17 = b10 & 255;
                    if (z13) {
                        z17 = z11;
                    } else {
                        if (i11 > 0) {
                            z17 = z11;
                            if ((b10 & 128) != 0) {
                                if ((b10 & 64) != 0) {
                                    i18 = i11 + 1;
                                    if ((b10 & 32) == 0) {
                                        i13++;
                                    } else {
                                        i18 = i11 + 2;
                                        if ((b10 & 16) == 0) {
                                            i14++;
                                        } else {
                                            i11 += 3;
                                            if ((b10 & 8) == 0) {
                                                i15++;
                                            }
                                        }
                                    }
                                    i11 = i18;
                                }
                            }
                        } else if ((b10 & 128) != 0) {
                            i11--;
                            z17 = z11;
                        } else {
                            z17 = z11;
                        }
                        z13 = false;
                    }
                    if (!z16) {
                        z18 = z16;
                    } else {
                        if (i17 > 127) {
                        }
                        if (i17 > 159) {
                            i16++;
                        }
                        z18 = z16;
                    }
                    if (z12) {
                        z19 = z18;
                    } else if (i12 > 0) {
                        z19 = z18;
                        if (i17 >= 64) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z19 = z18;
                        if (i17 != 128) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                    }
                    i10++;
                    z10 = z19;
                    z11 = z17;
                }
                z14 = z10;
                boolean z21 = z11;
                if (z13) {
                    z13 = false;
                }
                if (z12) {
                    z15 = z12;
                } else {
                    z15 = z12;
                }
                if (!z13) {
                    if (!z15) {
                        if (z14) {
                            if (z14) {
                                strName = "ISO8859_1";
                            } else if (z15) {
                                strName = "SJIS";
                            } else if (z13) {
                                strName = "UTF8";
                            } else {
                                strName = t5.g.f12791a;
                            }
                        } else if (z14) {
                            strName = "ISO8859_1";
                        } else if (z15) {
                            strName = "SJIS";
                        } else if (z13) {
                            strName = "UTF8";
                        } else {
                            strName = t5.g.f12791a;
                        }
                    } else if (z14) {
                        if (z14) {
                            strName = "ISO8859_1";
                        } else if (z15) {
                            strName = "SJIS";
                        } else if (z13) {
                            strName = "UTF8";
                        } else {
                            strName = t5.g.f12791a;
                        }
                    } else if (z14) {
                        strName = "ISO8859_1";
                    } else if (z15) {
                        strName = "SJIS";
                    } else if (z13) {
                        strName = "UTF8";
                    } else {
                        strName = t5.g.f12791a;
                    }
                } else if (!z15) {
                    if (z14) {
                        if (z14) {
                            strName = "ISO8859_1";
                        } else if (z15) {
                            strName = "SJIS";
                        } else if (z13) {
                            strName = "UTF8";
                        } else {
                            strName = t5.g.f12791a;
                        }
                    } else if (z14) {
                        strName = "ISO8859_1";
                    } else if (z15) {
                        strName = "SJIS";
                    } else if (z13) {
                        strName = "UTF8";
                    } else {
                        strName = t5.g.f12791a;
                    }
                } else if (z14) {
                    if (z14) {
                        strName = "ISO8859_1";
                    } else if (z15) {
                        strName = "SJIS";
                    } else if (z13) {
                        strName = "UTF8";
                    } else {
                        strName = t5.g.f12791a;
                    }
                } else if (z14) {
                    strName = "ISO8859_1";
                } else if (z15) {
                    strName = "SJIS";
                } else if (z13) {
                    strName = "UTF8";
                } else {
                    strName = t5.g.f12791a;
                }
            }
        } else {
            strName = cVar.name();
        }
        try {
            sb2.append(new String(bArr, strName));
            arrayList.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw n5.f.a();
        }
    }

    public static void c(t tVar, StringBuilder sb2, int i7) throws n5.f {
        if (i7 * 13 > tVar.a()) {
            throw n5.f.a();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int iB = tVar.b(13);
            int i11 = (iB % 96) | ((iB / 96) << 8);
            int i12 = i11 + (i11 < 2560 ? 41377 : 42657);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i7--;
        }
        try {
            sb2.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw n5.f.a();
        }
    }

    public static void d(t tVar, StringBuilder sb2, int i7) throws n5.f {
        if (i7 * 13 > tVar.a()) {
            throw n5.f.a();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int iB = tVar.b(13);
            int i11 = (iB % 192) | ((iB / 192) << 8);
            int i12 = i11 + (i11 < 7936 ? 33088 : 49472);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i7--;
        }
        try {
            sb2.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw n5.f.a();
        }
    }

    public static void e(t tVar, StringBuilder sb2, int i7) throws n5.f {
        while (i7 >= 3) {
            if (tVar.a() < 10) {
                throw n5.f.a();
            }
            int iB = tVar.b(10);
            if (iB >= 1000) {
                throw n5.f.a();
            }
            sb2.append(f(iB / 100));
            sb2.append(f((iB / 10) % 10));
            sb2.append(f(iB % 10));
            i7 -= 3;
        }
        if (i7 == 2) {
            if (tVar.a() < 7) {
                throw n5.f.a();
            }
            int iB2 = tVar.b(7);
            if (iB2 >= 100) {
                throw n5.f.a();
            }
            sb2.append(f(iB2 / 10));
            sb2.append(f(iB2 % 10));
            return;
        }
        if (i7 == 1) {
            if (tVar.a() < 4) {
                throw n5.f.a();
            }
            int iB3 = tVar.b(4);
            if (iB3 >= 10) {
                throw n5.f.a();
            }
            sb2.append(f(iB3));
        }
    }

    public static char f(int i7) throws n5.f {
        char[] cArr = f7312a;
        if (i7 < cArr.length) {
            return cArr[i7];
        }
        throw n5.f.a();
    }
}
