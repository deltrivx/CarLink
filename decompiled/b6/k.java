package b6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import n5.l;
import n5.m;
import n5.n;
import n5.o;
import n5.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1551d = {1, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f1552e = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[][] f1553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f1554g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f1555a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1556b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f1557c = new j(1);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f1553f = iArr;
        int[][] iArr2 = new int[20][];
        f1554g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i7 = 10; i7 < 20; i7++) {
            int[] iArr3 = f1553f[i7 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i10 = 0; i10 < iArr3.length; i10++) {
                iArr4[i10] = iArr3[(iArr3.length - i10) - 1];
            }
            f1554g[i7] = iArr4;
        }
    }

    public static int h(t5.a aVar, int[] iArr, int i7, int[][] iArr2) {
        h.e(i7, aVar, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float fD = h.d(iArr, iArr2[i11], 0.7f);
            if (fD < f10) {
                i10 = i11;
                f10 = fD;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        throw n5.i.f8833c;
    }

    public static int[] l(t5.a aVar, int i7, boolean z10, int[] iArr, int[] iArr2) {
        int i10 = aVar.f12760b;
        int iF = z10 ? aVar.f(i7) : aVar.e(i7);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = iF;
        while (iF < i10) {
            if (aVar.d(iF) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (h.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, iF};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            iF++;
        }
        throw n5.i.f8833c;
    }

    public static int[] m(t5.a aVar) {
        int[] iArr = new int[3];
        int[] iArrL = null;
        boolean zH = false;
        int i7 = 0;
        while (!zH) {
            Arrays.fill(iArr, 0, 3, 0);
            iArrL = l(aVar, i7, false, f1551d, iArr);
            int i10 = iArrL[0];
            int i11 = iArrL[1];
            int i12 = i10 - (i11 - i10);
            if (i12 >= 0) {
                zH = aVar.h(i12, i10);
            }
            i7 = i11;
        }
        return iArrL;
    }

    @Override // b6.h
    public m b(int i7, t5.a aVar, Map map) {
        return k(i7, aVar, m(aVar), map);
    }

    public boolean g(String str) throws n5.f {
        int length = str.length();
        if (length != 0) {
            int i7 = length - 1;
            int iDigit = Character.digit(str.charAt(i7), 10);
            CharSequence charSequenceSubSequence = str.subSequence(0, i7);
            int length2 = charSequenceSubSequence.length();
            int i10 = 0;
            for (int i11 = length2 - 1; i11 >= 0; i11 -= 2) {
                int iCharAt = charSequenceSubSequence.charAt(i11) - '0';
                if (iCharAt < 0 || iCharAt > 9) {
                    throw n5.f.a();
                }
                i10 += iCharAt;
            }
            int i12 = i10 * 3;
            for (int i13 = length2 - 2; i13 >= 0; i13 -= 2) {
                int iCharAt2 = charSequenceSubSequence.charAt(i13) - '0';
                if (iCharAt2 < 0 || iCharAt2 > 9) {
                    throw n5.f.a();
                }
                i12 += iCharAt2;
            }
            if ((1000 - i12) % 10 == iDigit) {
                return true;
            }
        }
        return false;
    }

    public int[] i(t5.a aVar, int i7) {
        return l(aVar, i7, false, f1551d, new int[3]);
    }

    public abstract int j(t5.a aVar, int[] iArr, StringBuilder sb2);

    public m k(int i7, t5.a aVar, int[] iArr, Map map) throws n5.i, n5.f, n5.c {
        int length;
        String str = null;
        p pVar = map == null ? null : (p) map.get(n5.d.NEED_RESULT_POINT_CALLBACK);
        if (pVar != null) {
            pVar.a(new o((iArr[0] + iArr[1]) / 2.0f, i7));
        }
        StringBuilder sb2 = this.f1555a;
        sb2.setLength(0);
        int iJ = j(aVar, iArr, sb2);
        if (pVar != null) {
            pVar.a(new o(iJ, i7));
        }
        int[] iArrI = i(aVar, iJ);
        if (pVar != null) {
            pVar.a(new o((iArrI[0] + iArrI[1]) / 2.0f, i7));
        }
        int i10 = iArrI[1];
        int i11 = (i10 - iArrI[0]) + i10;
        if (i11 >= aVar.f12760b || !aVar.h(i10, i11)) {
            throw n5.i.f8833c;
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw n5.f.a();
        }
        if (!g(string)) {
            throw n5.c.a();
        }
        float f10 = (iArr[1] + iArr[0]) / 2.0f;
        float f11 = (iArrI[1] + iArrI[0]) / 2.0f;
        n5.a aVarN = n();
        float f12 = i7;
        m mVar = new m(string, null, new o[]{new o(f10, f12), new o(f11, f12)}, aVarN);
        try {
            m mVarB = this.f1556b.b(i7, iArrI[1], aVar);
            mVar.b(n.f8850g, mVarB.f8839a);
            mVar.a(mVarB.f8843e);
            o[] oVarArr = mVarB.f8841c;
            o[] oVarArr2 = mVar.f8841c;
            if (oVarArr2 == null) {
                mVar.f8841c = oVarArr;
            } else if (oVarArr != null && oVarArr.length > 0) {
                o[] oVarArr3 = new o[oVarArr2.length + oVarArr.length];
                System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
                System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
                mVar.f8841c = oVarArr3;
            }
            length = mVarB.f8839a.length();
        } catch (l unused) {
            length = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(n5.d.ALLOWED_EAN_EXTENSIONS);
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    throw n5.i.f8833c;
                }
                if (length == iArr2[i12]) {
                    break;
                }
                i12++;
            }
        }
        if (aVarN == n5.a.f8797h || aVarN == n5.a.f8803o) {
            j jVar = this.f1557c;
            synchronized (jVar) {
                if (((ArrayList) jVar.f1549a).isEmpty()) {
                    jVar.a(new int[]{0, 19}, "US/CA");
                    jVar.a(new int[]{30, 39}, "US");
                    jVar.a(new int[]{60, 139}, "US/CA");
                    jVar.a(new int[]{300, 379}, "FR");
                    jVar.a(new int[]{380}, "BG");
                    jVar.a(new int[]{383}, "SI");
                    jVar.a(new int[]{385}, "HR");
                    jVar.a(new int[]{387}, "BA");
                    jVar.a(new int[]{400, 440}, "DE");
                    jVar.a(new int[]{450, 459}, "JP");
                    jVar.a(new int[]{460, 469}, "RU");
                    jVar.a(new int[]{471}, "TW");
                    jVar.a(new int[]{474}, "EE");
                    jVar.a(new int[]{475}, "LV");
                    jVar.a(new int[]{476}, "AZ");
                    jVar.a(new int[]{477}, "LT");
                    jVar.a(new int[]{478}, "UZ");
                    jVar.a(new int[]{479}, "LK");
                    jVar.a(new int[]{480}, "PH");
                    jVar.a(new int[]{481}, "BY");
                    jVar.a(new int[]{482}, "UA");
                    jVar.a(new int[]{484}, "MD");
                    jVar.a(new int[]{485}, "AM");
                    jVar.a(new int[]{486}, "GE");
                    jVar.a(new int[]{487}, "KZ");
                    jVar.a(new int[]{489}, "HK");
                    jVar.a(new int[]{490, 499}, "JP");
                    jVar.a(new int[]{500, 509}, "GB");
                    jVar.a(new int[]{520}, "GR");
                    jVar.a(new int[]{528}, "LB");
                    jVar.a(new int[]{529}, "CY");
                    jVar.a(new int[]{531}, "MK");
                    jVar.a(new int[]{535}, "MT");
                    jVar.a(new int[]{539}, "IE");
                    jVar.a(new int[]{540, 549}, "BE/LU");
                    jVar.a(new int[]{560}, "PT");
                    jVar.a(new int[]{569}, "IS");
                    jVar.a(new int[]{570, 579}, "DK");
                    jVar.a(new int[]{590}, "PL");
                    jVar.a(new int[]{594}, "RO");
                    jVar.a(new int[]{599}, "HU");
                    jVar.a(new int[]{600, 601}, "ZA");
                    jVar.a(new int[]{603}, "GH");
                    jVar.a(new int[]{608}, "BH");
                    jVar.a(new int[]{609}, "MU");
                    jVar.a(new int[]{611}, "MA");
                    jVar.a(new int[]{613}, "DZ");
                    jVar.a(new int[]{616}, "KE");
                    jVar.a(new int[]{618}, "CI");
                    jVar.a(new int[]{619}, "TN");
                    jVar.a(new int[]{621}, "SY");
                    jVar.a(new int[]{622}, "EG");
                    jVar.a(new int[]{624}, "LY");
                    jVar.a(new int[]{625}, "JO");
                    jVar.a(new int[]{626}, "IR");
                    jVar.a(new int[]{627}, "KW");
                    jVar.a(new int[]{628}, "SA");
                    jVar.a(new int[]{629}, "AE");
                    jVar.a(new int[]{640, 649}, "FI");
                    jVar.a(new int[]{690, 695}, "CN");
                    jVar.a(new int[]{700, 709}, "NO");
                    jVar.a(new int[]{729}, "IL");
                    jVar.a(new int[]{730, 739}, "SE");
                    jVar.a(new int[]{740}, "GT");
                    jVar.a(new int[]{741}, "SV");
                    jVar.a(new int[]{742}, "HN");
                    jVar.a(new int[]{743}, "NI");
                    jVar.a(new int[]{744}, "CR");
                    jVar.a(new int[]{745}, "PA");
                    jVar.a(new int[]{746}, "DO");
                    jVar.a(new int[]{750}, "MX");
                    jVar.a(new int[]{754, 755}, "CA");
                    jVar.a(new int[]{759}, "VE");
                    jVar.a(new int[]{760, 769}, "CH");
                    jVar.a(new int[]{770}, "CO");
                    jVar.a(new int[]{773}, "UY");
                    jVar.a(new int[]{775}, "PE");
                    jVar.a(new int[]{777}, "BO");
                    jVar.a(new int[]{779}, "AR");
                    jVar.a(new int[]{780}, "CL");
                    jVar.a(new int[]{784}, "PY");
                    jVar.a(new int[]{785}, "PE");
                    jVar.a(new int[]{786}, "EC");
                    jVar.a(new int[]{789, 790}, "BR");
                    jVar.a(new int[]{800, 839}, "IT");
                    jVar.a(new int[]{840, 849}, "ES");
                    jVar.a(new int[]{850}, "CU");
                    jVar.a(new int[]{858}, "SK");
                    jVar.a(new int[]{859}, "CZ");
                    jVar.a(new int[]{860}, "YU");
                    jVar.a(new int[]{865}, "MN");
                    jVar.a(new int[]{867}, "KP");
                    jVar.a(new int[]{868, 869}, "TR");
                    jVar.a(new int[]{870, 879}, "NL");
                    jVar.a(new int[]{880}, "KR");
                    jVar.a(new int[]{885}, "TH");
                    jVar.a(new int[]{888}, "SG");
                    jVar.a(new int[]{890}, "IN");
                    jVar.a(new int[]{893}, "VN");
                    jVar.a(new int[]{896}, "PK");
                    jVar.a(new int[]{899}, "ID");
                    jVar.a(new int[]{900, 919}, "AT");
                    jVar.a(new int[]{930, 939}, "AU");
                    jVar.a(new int[]{940, 949}, "AZ");
                    jVar.a(new int[]{955}, "MY");
                    jVar.a(new int[]{958}, "MO");
                }
            }
            int i13 = Integer.parseInt(string.substring(0, 3));
            int size = ((ArrayList) jVar.f1549a).size();
            for (int i14 = 0; i14 < size; i14++) {
                int[] iArr3 = (int[]) ((ArrayList) jVar.f1549a).get(i14);
                int i15 = iArr3[0];
                if (i13 < i15) {
                    break;
                }
                if (iArr3.length != 1) {
                    i15 = iArr3[1];
                }
                if (i13 <= i15) {
                    str = (String) ((ArrayList) jVar.f1550b).get(i14);
                    break;
                }
            }
            if (str != null) {
                mVar.b(n.f8849f, str);
            }
        }
        return mVar;
    }

    public abstract n5.a n();
}
