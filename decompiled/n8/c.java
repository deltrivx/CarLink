package n8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import cc.b0;
import cc.k0;
import cc.q1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlifevehicle.R;
import com.jakewharton.processphoenix.PhoenixActivity;
import com.muyetuge.carlifevehicle.service.MainService;
import f1.d1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import u8.c0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hc.c f8897a;

    static {
        jc.e eVar = k0.f2635a;
        jc.d dVar = jc.d.f7117c;
        q1 q1VarB = b0.b();
        dVar.getClass();
        f8897a = b0.a(n3.u.G(dVar, q1VarB));
    }

    public static void a() {
        int i7 = MainService.f2921a;
        a.b().stopService(new Intent(a.b(), (Class<?>) MainService.class));
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:356:0x0707  */
    /* JADX WARN: Code duplicated, block: B:418:0x07df  */
    /* JADX WARN: Code duplicated, block: B:448:0x0857  */
    /* JADX WARN: Code duplicated, block: B:449:0x085a  */
    /* JADX WARN: Code duplicated, block: B:512:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4 A[EDGE_INSN: B:70:0x00f4->B:73:0x00fb BREAK  A[LOOP:0: B:54:0x00d0->B:67:0x00ed]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9 A[EDGE_INSN: B:72:0x00f9->B:73:0x00fb BREAK  A[LOOP:0: B:54:0x00d0->B:67:0x00ed]] */
    public static Bitmap b(String str) throws n5.q {
        int i7;
        k6.e eVar;
        int i10;
        k6.g gVarC;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        int i15;
        t5.c cVar;
        int i16;
        boolean z14;
        boolean z15;
        char cCharAt;
        int i17;
        int[] iArr = m6.b.f8556a;
        i9.l.e(str, "content");
        n5.e eVar2 = n5.e.f8823c;
        Map mapT0 = c0.T0(new t8.j(eVar2, 1));
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        n5.e eVar3 = n5.e.f8821a;
        if (mapT0.containsKey(eVar3)) {
            String string = mapT0.get(eVar3).toString();
            if (string == null) {
                throw new NullPointerException("Name is null");
            }
            if (string.equals("L")) {
                i7 = 1;
            } else if (string.equals("M")) {
                i7 = 2;
            } else if (string.equals("Q")) {
                i7 = 3;
            } else {
                if (!string.equals("H")) {
                    throw new IllegalArgumentException("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(string));
                }
                i7 = 4;
            }
        } else {
            i7 = 1;
        }
        int i18 = mapT0.containsKey(eVar2) ? Integer.parseInt(mapT0.get(eVar2).toString()) : 4;
        n5.e eVar4 = n5.e.f8822b;
        boolean zContainsKey = mapT0.containsKey(eVar4);
        String string2 = zContainsKey ? mapT0.get(eVar4).toString() : "ISO-8859-1";
        boolean zEquals = "Shift_JIS".equals(string2);
        k6.e eVar5 = k6.e.BYTE;
        if (!zEquals) {
            i16 = 0;
            z14 = false;
            z15 = false;
            while (true) {
                if (i16 < str.length()) {
                    cCharAt = str.charAt(i16);
                    if (cCharAt >= '0') {
                        if (cCharAt < '`') {
                            i17 = iArr[cCharAt];
                        } else {
                            i17 = -1;
                        }
                        if (i17 != -1) {
                            z14 = true;
                        }
                    } else {
                        if (cCharAt < '`') {
                            i17 = iArr[cCharAt];
                        } else {
                            i17 = -1;
                        }
                        if (i17 != -1) {
                            z14 = true;
                        }
                    }
                    i16++;
                } else {
                    if (z14) {
                        eVar = k6.e.ALPHANUMERIC;
                        break;
                    }
                    if (z15) {
                        eVar = k6.e.NUMERIC;
                        break;
                    }
                }
                eVar = eVar5;
                break;
            }
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                i16 = 0;
                z14 = false;
                z15 = false;
                while (true) {
                    if (i16 < str.length()) {
                        cCharAt = str.charAt(i16);
                        if (cCharAt >= '0' || cCharAt > '9') {
                            if (cCharAt < '`') {
                                i17 = iArr[cCharAt];
                            } else {
                                i17 = -1;
                            }
                            if (i17 != -1) {
                                z14 = true;
                            }
                        } else {
                            z15 = true;
                        }
                        i16++;
                    } else {
                        if (z14) {
                            eVar = k6.e.ALPHANUMERIC;
                            break;
                        }
                        if (z15) {
                            eVar = k6.e.NUMERIC;
                            break;
                        }
                    }
                    eVar = eVar5;
                    break;
                }
            }
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    eVar = k6.e.KANJI;
                } else {
                    int i20 = bytes[i19] & 255;
                    if ((i20 < 129 || i20 > 159) && (i20 < 224 || i20 > 235)) {
                        i16 = 0;
                        z14 = false;
                        z15 = false;
                        while (true) {
                            if (i16 < str.length()) {
                                cCharAt = str.charAt(i16);
                                if (cCharAt >= '0') {
                                    if (cCharAt < '`') {
                                        i17 = iArr[cCharAt];
                                    } else {
                                        i17 = -1;
                                    }
                                    if (i17 != -1) {
                                        z14 = true;
                                    }
                                } else {
                                    if (cCharAt < '`') {
                                        i17 = iArr[cCharAt];
                                    } else {
                                        i17 = -1;
                                    }
                                    if (i17 != -1) {
                                        z14 = true;
                                    }
                                }
                                i16++;
                            } else {
                                if (z14) {
                                    eVar = k6.e.ALPHANUMERIC;
                                    break;
                                }
                                if (z15) {
                                    eVar = k6.e.NUMERIC;
                                    break;
                                }
                            }
                            eVar = eVar5;
                            break;
                        }
                    }
                    i19 += 2;
                }
            }
        } catch (UnsupportedEncodingException unused) {
        }
        t5.a aVar = new t5.a();
        if (eVar == eVar5 && zContainsKey && (cVar = (t5.c) t5.c.f12766d.get(string2)) != null) {
            aVar.b(7, 4);
            aVar.b(cVar.f12768a[0], 8);
        }
        n5.e eVar6 = n5.e.f8826f;
        if (mapT0.containsKey(eVar6) && Boolean.parseBoolean(mapT0.get(eVar6).toString())) {
            i10 = 4;
            aVar.b(5, 4);
        } else {
            i10 = 4;
        }
        aVar.b(eVar.f7328b, i10);
        t5.a aVar2 = new t5.a();
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 1) {
            int length2 = str.length();
            int i21 = 0;
            while (i21 < length2) {
                int iCharAt = str.charAt(i21) - '0';
                int i22 = i21 + 2;
                if (i22 < length2) {
                    aVar2.b(((str.charAt(i21 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i22) - '0'), 10);
                    i21 += 3;
                } else {
                    i21++;
                    if (i21 < length2) {
                        aVar2.b((iCharAt * 10) + (str.charAt(i21) - '0'), 7);
                        i21 = i22;
                    } else {
                        aVar2.b(iCharAt, 4);
                    }
                }
            }
        } else if (iOrdinal == 2) {
            int length3 = str.length();
            int i23 = 0;
            while (i23 < length3) {
                char cCharAt2 = str.charAt(i23);
                int i24 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                if (i24 == -1) {
                    throw new n5.q();
                }
                int i25 = i23 + 1;
                if (i25 < length3) {
                    char cCharAt3 = str.charAt(i25);
                    int i26 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                    if (i26 == -1) {
                        throw new n5.q();
                    }
                    aVar2.b((i24 * 45) + i26, 11);
                    i23 += 2;
                } else {
                    aVar2.b(i24, 6);
                    i23 = i25;
                }
            }
        } else if (iOrdinal == i10) {
            try {
                for (byte b10 : str.getBytes(string2)) {
                    aVar2.b(b10, 8);
                }
            } catch (UnsupportedEncodingException e7) {
                throw new n5.q(e7);
            }
        } else {
            if (iOrdinal != 6) {
                throw new n5.q("Invalid mode: ".concat(String.valueOf(eVar)));
            }
            try {
                byte[] bytes2 = str.getBytes("Shift_JIS");
                if (bytes2.length % 2 != 0) {
                    throw new n5.q("Kanji byte size not even");
                }
                int length4 = bytes2.length - 1;
                for (int i27 = 0; i27 < length4; i27 += 2) {
                    int i28 = ((bytes2[i27] & 255) << 8) | (bytes2[i27 + 1] & 255);
                    int i29 = 33088;
                    if (i28 >= 33088 && i28 <= 40956) {
                        i15 = i28 - i29;
                    } else if (i28 < 57408 || i28 > 60351) {
                        i15 = -1;
                    } else {
                        i29 = 49472;
                        i15 = i28 - i29;
                    }
                    if (i15 == -1) {
                        throw new n5.q("Invalid byte sequence");
                    }
                    aVar2.b(((i15 >> 8) * 192) + (i15 & 255), 13);
                }
            } catch (UnsupportedEncodingException e10) {
                throw new n5.q(e10);
            }
        }
        n5.e eVar7 = n5.e.f8824d;
        if (mapT0.containsKey(eVar7)) {
            gVarC = k6.g.c(Integer.parseInt(mapT0.get(eVar7).toString()));
            int iA = eVar.a(gVarC) + aVar.f12760b + aVar2.f12760b;
            int i30 = gVarC.f7334d;
            j.g gVar = gVarC.f7333c[e1.d.b(i7)];
            int i31 = gVar.f6794b;
            int i32 = 0;
            for (e4.n nVar : (e4.n[]) gVar.f6795c) {
                i32 += nVar.f4380b;
            }
            if (!(i30 - (i32 * i31) >= (iA + 7) / 8)) {
                throw new n5.q("Data too big for requested version");
            }
        } else {
            int iA2 = eVar.a(k6.g.c(1)) + aVar.f12760b + aVar2.f12760b;
            int i33 = 1;
            while (true) {
                if (i33 > 40) {
                    throw new n5.q("Data too big");
                }
                k6.g gVarC2 = k6.g.c(i33);
                int i34 = gVarC2.f7334d;
                j.g gVar2 = gVarC2.f7333c[e1.d.b(i7)];
                int i35 = gVar2.f6794b;
                e4.n[] nVarArr = (e4.n[]) gVar2.f6795c;
                int length5 = nVarArr.length;
                int i36 = 0;
                int i37 = 0;
                while (i36 < length5) {
                    i37 += nVarArr[i36].f4380b;
                    i36++;
                    iA2 = iA2;
                }
                int i38 = iA2;
                if (i34 - (i37 * i35) >= (i38 + 7) / 8) {
                    int iA3 = eVar.a(gVarC2) + aVar.f12760b + aVar2.f12760b;
                    int i39 = 1;
                    while (true) {
                        if (i39 > 40) {
                            throw new n5.q("Data too big");
                        }
                        k6.g gVarC3 = k6.g.c(i39);
                        int i40 = gVarC3.f7334d;
                        j.g gVar3 = gVarC3.f7333c[e1.d.b(i7)];
                        int i41 = gVar3.f6794b;
                        e4.n[] nVarArr2 = (e4.n[]) gVar3.f6795c;
                        int length6 = nVarArr2.length;
                        int i42 = 0;
                        int i43 = 0;
                        while (i42 < length6) {
                            int i44 = i42;
                            i43 += nVarArr2[i44].f4380b;
                            i42 = i44 + 1;
                        }
                        if (i40 - (i43 * i41) >= (iA3 + 7) / 8) {
                            gVarC = gVarC3;
                            break;
                        }
                        i39++;
                        i18 = i18;
                    }
                } else {
                    i33++;
                    i18 = i18;
                    iA2 = i38;
                }
            }
        }
        int i45 = gVarC.f7334d;
        t5.a aVar3 = new t5.a();
        int i46 = aVar.f12760b;
        aVar3.c(i46);
        for (int i47 = 0; i47 < i46; i47++) {
            aVar3.a(aVar.d(i47));
        }
        int iG = eVar == eVar5 ? aVar2.g() : str.length();
        int iA4 = eVar.a(gVarC);
        int i48 = 1 << iA4;
        if (iG >= i48) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iG);
            sb2.append(" is bigger than ");
            sb2.append(i48 - 1);
            throw new n5.q(sb2.toString());
        }
        aVar3.b(iG, iA4);
        int i49 = aVar2.f12760b;
        aVar3.c(aVar3.f12760b + i49);
        for (int i50 = 0; i50 < i49; i50++) {
            aVar3.a(aVar2.d(i50));
        }
        j.g gVar4 = gVarC.f7333c[e1.d.b(i7)];
        int i51 = gVar4.f6794b;
        e4.n[] nVarArr3 = (e4.n[]) gVar4.f6795c;
        int i52 = 0;
        for (e4.n nVar2 : nVarArr3) {
            i52 += nVar2.f4380b;
        }
        int i53 = i45 - (i52 * i51);
        int i54 = i53 << 3;
        if (aVar3.f12760b > i54) {
            throw new n5.q("data bits cannot fit in the QR Code" + aVar3.f12760b + " > " + i54);
        }
        for (int i55 = 0; i55 < 4 && aVar3.f12760b < i54; i55++) {
            aVar3.a(false);
        }
        boolean z16 = false;
        int i56 = aVar3.f12760b & 7;
        if (i56 > 0) {
            while (i56 < 8) {
                aVar3.a(z16);
                i56++;
                z16 = false;
            }
        }
        int iG2 = i53 - aVar3.g();
        for (int i57 = 0; i57 < iG2; i57++) {
            aVar3.b((i57 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar3.f12760b != i54) {
            throw new n5.q("Bits size does not equal capacity");
        }
        int i58 = 0;
        for (e4.n nVar3 : nVarArr3) {
            i58 += nVar3.f4380b;
        }
        if (aVar3.g() != i53) {
            throw new n5.q("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i58);
        int i59 = 0;
        int i60 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i59 < i58) {
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (i59 >= i58) {
                throw new n5.q("Block ID too large");
            }
            int i61 = i45 % i58;
            int i62 = i18;
            int i63 = i58 - i61;
            int i64 = i45 / i58;
            int i65 = i53 / i58;
            int i66 = i65 + 1;
            int i67 = i64 - i65;
            int i68 = (i64 + 1) - i66;
            if (i67 != i68) {
                throw new n5.q("EC bytes mismatch");
            }
            if (i58 != i63 + i61) {
                throw new n5.q("RS blocks mismatch");
            }
            if (i45 != ((i66 + i68) * i61) + ((i65 + i67) * i63)) {
                throw new n5.q("Total bytes mismatch");
            }
            if (i59 < i63) {
                c10 = 0;
                iArr2[0] = i65;
                iArr3[0] = i67;
            } else {
                c10 = 0;
                iArr2[0] = i66;
                iArr3[0] = i68;
            }
            int i69 = iArr2[c10];
            byte[] bArr = new byte[i69];
            int i70 = i60 << 3;
            int i71 = i59;
            int i72 = 0;
            while (i72 < i69) {
                int i73 = i72;
                int i74 = i58;
                int[] iArr4 = iArr2;
                int i75 = 0;
                for (int i76 = 0; i76 < 8; i76++) {
                    if (aVar3.d(i70)) {
                        i75 |= 1 << (7 - i76);
                    }
                    i70++;
                }
                bArr[i73] = (byte) i75;
                i72 = i73 + 1;
                i58 = i74;
                iArr2 = iArr4;
            }
            int i77 = i58;
            int[] iArr5 = iArr2;
            int i78 = iArr3[0];
            int i79 = i69 + i78;
            int[] iArr6 = new int[i79];
            int i80 = 0;
            while (i80 < i69) {
                iArr6[i80] = bArr[i80] & 255;
                i80++;
                i79 = i79;
            }
            int i81 = i79;
            v5.a aVar4 = v5.a.f13612l;
            ArrayList arrayList2 = new ArrayList();
            t5.a aVar5 = aVar3;
            int i82 = i7;
            arrayList2.add(new v5.b(aVar4, new int[]{1}));
            if (i78 == 0) {
                throw new IllegalArgumentException("No error correction bytes");
            }
            int i83 = i81 - i78;
            if (i83 <= 0) {
                throw new IllegalArgumentException("No data bytes provided");
            }
            if (i78 >= arrayList2.size()) {
                v5.b bVarG = (v5.b) arrayList2.get(arrayList2.size() - 1);
                int size = arrayList2.size();
                while (size <= i78) {
                    int i84 = size;
                    bVarG = bVarG.g(new v5.b(aVar4, new int[]{1, aVar4.f13616a[(i84 - 1) + aVar4.f13622g]}));
                    arrayList2.add(bVarG);
                    size = i84 + 1;
                    i45 = i45;
                    gVarC = gVarC;
                }
            }
            int i85 = i45;
            k6.g gVar5 = gVarC;
            v5.b bVar = (v5.b) arrayList2.get(i78);
            int[] iArr7 = new int[i83];
            System.arraycopy(iArr6, 0, iArr7, 0, i83);
            if (i83 == 0) {
                throw new IllegalArgumentException();
            }
            if (i83 > 1 && iArr7[0] == 0) {
                int i86 = 1;
                while (i86 < i83 && iArr7[i86] == 0) {
                    i86++;
                }
                if (i86 == i83) {
                    iArr7 = new int[]{0};
                } else {
                    int i87 = i83 - i86;
                    int[] iArr8 = new int[i87];
                    System.arraycopy(iArr7, i86, iArr8, 0, i87);
                    iArr7 = iArr8;
                }
            }
            if (i78 < 0) {
                throw new IllegalArgumentException();
            }
            int length7 = iArr7.length;
            int[] iArr9 = new int[length7 + i78];
            int i88 = 0;
            while (i88 < length7) {
                iArr9[i88] = aVar4.c(iArr7[i88], 1);
                i88++;
                iArr7 = iArr7;
            }
            v5.b bVar2 = new v5.b(aVar4, iArr9);
            if (!aVar4.equals(bVar.f13623a)) {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            if (bVar.e()) {
                throw new IllegalArgumentException("Divide by 0");
            }
            v5.b bVarA = aVar4.f13618c;
            int iB = aVar4.b(bVar.c(bVar.d()));
            while (bVar2.d() >= bVar.d() && !bVar2.e()) {
                int iD = bVar2.d() - bVar.d();
                int iC = aVar4.c(bVar2.c(bVar2.d()), iB);
                int i89 = iB;
                v5.b bVarH = bVar.h(iD, iC);
                bVarA = bVarA.a(aVar4.a(iD, iC));
                bVar2 = bVar2.a(bVarH);
                iB = i89;
            }
            int[] iArr10 = new v5.b[]{bVarA, bVar2}[1].f13624b;
            int length8 = i78 - iArr10.length;
            for (int i90 = 0; i90 < length8; i90++) {
                iArr6[i83 + i90] = 0;
            }
            System.arraycopy(iArr10, 0, iArr6, i83 + length8, iArr10.length);
            byte[] bArr2 = new byte[i78];
            for (int i91 = 0; i91 < i78; i91++) {
                bArr2[i91] = (byte) iArr6[i69 + i91];
            }
            arrayList.add(new m6.a(bArr, bArr2));
            iMax = Math.max(iMax, i69);
            iMax2 = Math.max(iMax2, i78);
            i60 += iArr5[0];
            i59 = i71 + 1;
            i18 = i62;
            i58 = i77;
            aVar3 = aVar5;
            i7 = i82;
            mapT0 = mapT0;
            i45 = i85;
            gVarC = gVar5;
        }
        int i92 = i45;
        k6.g gVar6 = gVarC;
        Map map = mapT0;
        int i93 = i7;
        int i94 = i18;
        if (i53 != i60) {
            throw new n5.q("Data bytes does not match offset");
        }
        t5.a aVar6 = new t5.a();
        for (int i95 = 0; i95 < iMax; i95++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = ((m6.a) it.next()).f8554a;
                if (i95 < bArr3.length) {
                    aVar6.b(bArr3[i95], 8);
                }
            }
        }
        for (int i96 = 0; i96 < iMax2; i96++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr4 = ((m6.a) it2.next()).f8555b;
                if (i96 < bArr4.length) {
                    aVar6.b(bArr4[i96], 8);
                }
            }
        }
        if (i92 != aVar6.g()) {
            StringBuilder sbT = ob.a.t("Interleaving error: ", " and ", i92);
            sbT.append(aVar6.g());
            sbT.append(" differ.");
            throw new n5.q(sbT.toString());
        }
        int i97 = (gVar6.f7331a * 4) + 17;
        d1 d1Var = new d1(i97, i97);
        int i98 = d1Var.f4931c;
        n5.e eVar8 = n5.e.f8825e;
        if (map.containsKey(eVar8)) {
            i11 = Integer.parseInt(map.get(eVar8).toString());
            if (!(i11 >= 0 && i11 < 8)) {
                i11 = -1;
            }
        } else {
            i11 = -1;
        }
        int i99 = d1Var.f4930b;
        if (i11 == -1) {
            int i100 = Integer.MAX_VALUE;
            int i101 = 0;
            i11 = -1;
            while (i101 < 8) {
                int i102 = i93;
                m6.b.b(aVar6, i102, gVar6, i101, d1Var);
                int iA5 = m6.b.a(d1Var, false) + m6.b.a(d1Var, true);
                byte[][] bArr5 = (byte[][]) d1Var.f4932d;
                int i103 = 0;
                int i104 = 0;
                while (i103 < i98 - 1) {
                    byte[] bArr6 = bArr5[i103];
                    int i105 = 0;
                    while (i105 < i99 - 1) {
                        byte b11 = bArr6[i105];
                        int i106 = i105 + 1;
                        int i107 = i103;
                        if (b11 == bArr6[i106]) {
                            byte[] bArr7 = bArr5[i107 + 1];
                            if (b11 == bArr7[i105] && b11 == bArr7[i106]) {
                                i104++;
                            }
                        }
                        i105 = i106;
                        i103 = i107;
                    }
                    i103++;
                }
                int i108 = (i104 * 3) + iA5;
                int i109 = 0;
                int i110 = 0;
                while (i109 < i98) {
                    int i111 = 0;
                    while (i111 < i99) {
                        byte[] bArr8 = bArr5[i109];
                        int i112 = i111 + 6;
                        int i113 = i110;
                        if (i112 < i99) {
                            i12 = i108;
                            byte b12 = 1;
                            if (bArr8[i111] == 1 && bArr8[i111 + 1] == 0 && bArr8[i111 + 2] == 1 && bArr8[i111 + 3] == 1 && bArr8[i111 + 4] == 1 && bArr8[i111 + 5] == 0 && bArr8[i112] == 1) {
                                int iMax3 = Math.max(i111 - 4, 0);
                                int iMin = Math.min(i111, bArr8.length);
                                while (true) {
                                    if (iMax3 >= iMin) {
                                        z12 = true;
                                        break;
                                    }
                                    int i114 = iMax3;
                                    if (bArr8[i114] == b12) {
                                        z12 = false;
                                        break;
                                    }
                                    iMax3 = i114 + 1;
                                    b12 = 1;
                                }
                                if (!z12) {
                                    int iMax4 = Math.max(i111 + 7, 0);
                                    int iMin2 = Math.min(i111 + 11, bArr8.length);
                                    while (true) {
                                        if (iMax4 >= iMin2) {
                                            z13 = true;
                                            break;
                                        }
                                        int i115 = iMax4;
                                        if (bArr8[iMax4] == 1) {
                                            z13 = false;
                                            break;
                                        }
                                        iMax4 = i115 + 1;
                                    }
                                    if (z13) {
                                    }
                                }
                                i110 = i113 + 1;
                            }
                            i13 = i109 + 6;
                            if (i13 < i98) {
                                byte b13 = 1;
                                if (bArr5[i109][i111] != 1 && bArr5[i109 + 1][i111] == 0 && bArr5[i109 + 2][i111] == 1 && bArr5[i109 + 3][i111] == 1 && bArr5[i109 + 4][i111] == 1 && bArr5[i109 + 5][i111] == 0 && bArr5[i13][i111] == 1) {
                                    int iMax5 = Math.max(i109 - 4, 0);
                                    int iMin3 = Math.min(i109, bArr5.length);
                                    while (true) {
                                        if (iMax5 >= iMin3) {
                                            i14 = i109;
                                            z10 = true;
                                            break;
                                        }
                                        i14 = i109;
                                        if (bArr5[iMax5][i111] == b13) {
                                            z10 = false;
                                            break;
                                        }
                                        iMax5++;
                                        i109 = i14;
                                        b13 = 1;
                                    }
                                    if (z10) {
                                        i110++;
                                    } else {
                                        int iMax6 = Math.max(i14 + 7, 0);
                                        int iMin4 = Math.min(i14 + 11, bArr5.length);
                                        while (true) {
                                            if (iMax6 >= iMin4) {
                                                z11 = true;
                                                break;
                                            }
                                            if (bArr5[iMax6][i111] == 1) {
                                                z11 = false;
                                                break;
                                            }
                                            iMax6++;
                                        }
                                        if (z11) {
                                            i110++;
                                        }
                                    }
                                } else {
                                    i14 = i109;
                                }
                            } else {
                                i14 = i109;
                            }
                            i111++;
                            i108 = i12;
                            i109 = i14;
                        } else {
                            i12 = i108;
                        }
                        i110 = i113;
                        i13 = i109 + 6;
                        if (i13 < i98) {
                            byte b14 = 1;
                            if (bArr5[i109][i111] != 1) {
                                i14 = i109;
                            } else {
                                i14 = i109;
                            }
                        } else {
                            i14 = i109;
                        }
                        i111++;
                        i108 = i12;
                        i109 = i14;
                    }
                    i109++;
                }
                int i116 = (i110 * 40) + i108;
                int i117 = 0;
                for (int i118 = 0; i118 < i98; i118++) {
                    byte[] bArr9 = bArr5[i118];
                    int i119 = 0;
                    while (i119 < i99) {
                        byte[][] bArr10 = bArr5;
                        if (bArr9[i119] == 1) {
                            i117++;
                        }
                        i119++;
                        bArr5 = bArr10;
                    }
                }
                int i120 = i98 * i99;
                int iAbs = (((Math.abs((i117 << 1) - i120) * 10) / i120) * 10) + i116;
                if (iAbs < i100) {
                    i100 = iAbs;
                    i11 = i101;
                }
                i101++;
                i93 = i102;
            }
        }
        m6.b.b(aVar6, i93, gVar6, i11, d1Var);
        int i121 = i94 << 1;
        int i122 = i99 + i121;
        int i123 = i121 + i98;
        int iMax7 = Math.max(300, i122);
        int iMax8 = Math.max(300, i123);
        int iMin5 = Math.min(iMax7 / i122, iMax8 / i123);
        int i124 = (iMax7 - (i99 * iMin5)) / 2;
        int i125 = (iMax8 - (i98 * iMin5)) / 2;
        t5.b bVar3 = new t5.b(iMax7, iMax8);
        int i126 = 0;
        while (i126 < i98) {
            int i127 = i124;
            int i128 = 0;
            while (i128 < i99) {
                if (d1Var.h(i128, i126) == 1) {
                    bVar3.g(i127, i125, iMin5, iMin5);
                }
                i128++;
                i127 += iMin5;
            }
            i126++;
            i125 += iMin5;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(300, 300, Bitmap.Config.RGB_565);
        int[] iArr11 = new int[90000];
        for (int i129 = 0; i129 < 300; i129++) {
            for (int i130 = 0; i130 < 300; i130++) {
                iArr11[(i129 * 300) + i130] = bVar3.b(i130, i129) ? -16777216 : -1;
            }
        }
        bitmapCreateBitmap.setPixels(iArr11, 0, 300, 0, 0, 300, 300);
        return bitmapCreateBitmap;
    }

    public static void c(h9.a aVar) throws IOException {
        InputStream inputStreamOpenRawResource = a.b().getResources().openRawResource(R.drawable.ic_tip);
        try {
            i9.l.b(inputStreamOpenRawResource);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT, inputStreamOpenRawResource.available()));
            a.a.u(inputStreamOpenRawResource, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            i9.l.d(byteArray, "toByteArray(...)");
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(byteArray);
            i9.l.b(bArrDigest);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "");
            int i7 = 0;
            for (byte b10 : bArrDigest) {
                i7++;
                if (i7 > 1) {
                    sb2.append((CharSequence) "");
                }
                sb2.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
            }
            sb2.append((CharSequence) "");
            String string = sb2.toString();
            inputStreamOpenRawResource.close();
            if (i9.l.a(string, "dd296a1df47898fc7f462c3db92b8a6c")) {
                return;
            }
            aVar.invoke();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                g5.a.m(inputStreamOpenRawResource, th);
                throw th2;
            }
        }
    }

    public static void d(h9.n nVar) {
        b0.s(f8897a, null, new b0.g(nVar, null), 3);
    }

    public static void e(String str, String str2) {
        i9.l.e(str, "packageName");
        i9.l.e(str2, "className");
        try {
            Intent intent = new Intent();
            intent.setClassName(str, str2);
            intent.addFlags(268435456);
            a.b().startActivity(intent);
        } catch (Exception e7) {
            j(0, "无法启动活动: " + e7.getMessage());
        }
    }

    public static void f() {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.addFlags(268435456);
            a.b().startActivity(intent);
        } catch (Exception e7) {
            j(0, "打开桌面失败: " + e7.getMessage());
        }
    }

    public static void g() {
        try {
            Intent intent = new Intent("android.settings.SETTINGS");
            intent.setFlags(268435456);
            a.b().startActivity(intent);
        } catch (Exception e7) {
            j(0, "打开系统设置失败: " + e7.getMessage());
        }
    }

    public static float h(int i7) {
        if (i7 < 0) {
            i7 = 0;
        }
        float f10 = i7 / a.b().getResources().getDisplayMetrics().density;
        if (f10 < 0.0f) {
            return 0.0f;
        }
        return f10;
    }

    public static void i() {
        j(0, "重启中");
        Context contextB = a.b();
        String packageName = contextB.getPackageName();
        PackageManager packageManager = contextB.getPackageManager();
        Intent leanbackLaunchIntentForPackage = packageManager.hasSystemFeature("android.software.leanback") ? packageManager.getLeanbackLaunchIntentForPackage(packageName) : null;
        if (leanbackLaunchIntentForPackage == null) {
            leanbackLaunchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
        }
        if (leanbackLaunchIntentForPackage == null) {
            throw new IllegalStateException(a2.f.G("Unable to determine default activity for ", packageName, ". Does an activity specify the DEFAULT category in its intent filter?"));
        }
        Intent[] intentArr = {leanbackLaunchIntentForPackage};
        intentArr[0].addFlags(268468224);
        Intent intent = new Intent(contextB, (Class<?>) PhoenixActivity.class);
        intent.addFlags(268435456);
        intent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intentArr)));
        intent.putExtra("phoenix_main_process_pid", Process.myPid());
        contextB.startActivity(intent);
    }

    public static void j(int i7, String str) {
        i9.l.e(str, "text");
        new Handler(Looper.getMainLooper()).post(new b(i7, 0, str));
    }
}
